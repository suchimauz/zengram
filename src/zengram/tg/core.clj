(ns zengram.tg.core
  "A Clojure library for interacting with the Telegram Bot API.
   - [Getting started](https://github.com/wdhowe/zengram.tg#usage)"
  (:gen-class)
  (:require [zengram.tg.config :as conf]
            [zengram.tg.api.edit :as edit]
            [zengram.tg.api.games :as games]
            [zengram.tg.api.inline :as inline]
            [zengram.tg.api.methods :as methods]
            [zengram.tg.api.passport :as passport]
            [zengram.tg.api.payments :as payments]
            [zengram.tg.api.stickers :as stickers]
            [zengram.tg.api.updates :as updates]
            [potemkin :refer [import-vars]]))

(defn create
  "Create a new Telegram Bot API instance.
   - No argument attempts to load the `bot-token` from the environment.
   - 1 argument will use the passed in `bot-token`."
  ([]
   (create (conf/get-token)))
  ([bot-token]
   {:bot-token bot-token}))

;; Make all Telegram functions available directly in this namespace.
(import-vars
 [edit
  edit-message-text
  edit-message-text-inline
  edit-message-caption
  edit-message-caption-inline
  edit-message-media
  edit-message-media-inline
  edit-message-reply-markup
  edit-message-reply-markup-inline
  stop-poll
  delete-message]
 [games
  send-game
  set-game-score
  set-game-score-inline
  get-game-high-scores
  get-game-high-scores-inline]
 [inline
  answer-inline-query
  answer-web-app-query]
 [methods
  call
  get-me
  log-out
  close
  send-message
  forward-message
  copy-message
  send-photo
  send-audio
  send-document
  send-video
  send-animation
  send-voice
  send-video-note
  send-media-group
  send-location
  edit-message-live-location
  edit-message-live-location-inline
  stop-message-live-location
  stop-message-live-location-inline
  send-venue
  send-contact
  send-poll
  send-dice
  send-chat-action
  get-user-profile-photos
  get-file
  kick-chat-member
  ban-chat-member
  unban-chat-member
  restrict-chat-member
  promote-chat-member
  set-chat-administrator-custom-title
  ban-chat-sender-chat
  unban-chat-sender-chat
  set-chat-permissions
  export-chat-invite-link
  create-chat-invite-link
  edit-chat-invite-link
  revoke-chat-invite-link
  approve-chat-join-request
  decline-chat-join-request
  set-chat-photo
  delete-chat-photo
  set-chat-title
  set-chat-description
  pin-chat-message
  unpin-chat-message
  unpin-all-chat-messages
  leave-chat
  get-chat
  get-chat-administrators
  get-chat-members-count
  get-chat-member-count
  get-chat-member
  set-chat-sticker-set
  delete-chat-sticker-set
  get-forum-topic-icon-stickers
  create-forum-topic
  edit-forum-topic
  close-forum-topic
  reopen-forum-topic
  delete-forum-topic
  unpin-all-forum-topic-messages
  edit-general-forum-topic
  close-general-forum-topic
  reopen-general-forum-topic
  hide-general-forum-topic
  unhide-general-forum-topic
  answer-callback-query
  set-my-commands
  delete-my-commands
  get-my-commands
  set-chat-menu-button
  get-chat-menu-button
  set-my-default-administrator-rights
  get-my-default-administrator-rights]
 [passport
  set-passport-data-errors]
 [payments
  send-invoice
  create-invoice-link
  answer-shipping-query-ok
  answer-shipping-query-error
  answer-precheckout-query-ok
  answer-precheckout-query-error]
 [stickers
  send-sticker
  get-sticker-set
  get-custom-emoji-stickers
  upload-sticker-file
  create-new-sticker-set
  add-sticker-to-set
  set-sticker-position-in-set
  delete-sticker-from-set
  set-sticker-set-thumb]
 [updates
  get-updates
  set-webhook
  delete-webhook
  get-webhook-info])
