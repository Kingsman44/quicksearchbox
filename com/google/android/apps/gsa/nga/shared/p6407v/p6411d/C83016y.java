package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.y */
/* compiled from: PG */
public enum C83016y implements C62957cd {
    UNKNOWN(0),
    NGA_CREATE(1),
    EXPLICIT_TRIGGER(2),
    DELIBERATE_INPUT_DETECTED(3),
    QUERY_BROADCAST_RECEIVED(4),
    FINAL_RECOGNITION_PROCESSING(5),
    INTENT_EXECUTED(6),
    PICKED_UP(7),
    WAKE_UP_GESTURE(8),
    SHUT_DOWN_GESTURE(9),
    TOGGLE_OFF(10),
    TOGGLE_ON(11),
    SPEECH_STARTED(12),
    SPEECH_ENDED(13),
    REPLY_CHIP_PROVIDED(15),
    REPLY_CHIP_CLICK(16),
    OPA_VISIBLE(17),
    OPA_HIDDEN(18),
    TTS_STARTED(19),
    TTS_FINISHED(20),
    PLAYBACK_STARTED(21),
    PLAYBACK_FINISHED(22),
    TRANSCRIPTION_EDIT_STARTED(23),
    TRANSCRIPTION_EDIT_FINISHED(24),
    SCREEN_UNLOCKED(25),
    SCREEN_LOCKED(26),
    SCREEN_ON(27),
    SCREEN_OFF(28),
    NO_FOREGROUNDED_APP(29),
    TIMEOUT(30),
    PROACTIVE_QUERY(31),
    TIMEOUT_RESTARTED(32),
    SESSION_CANCELLATION(33),
    OPENING_ZEROSTATE(34),
    DATA_STORE_CHANGE(35),
    INITIAL_RESULT(37),
    DISCOVERY_CHIP_CLICK(38),
    DISCOVERY_HELP_PANEL(39),
    FULL_LISTENING_TIMEOUT(40),
    DICTATING_TIMEOUT(56),
    HALF_LISTENING_TIMEOUT(41),
    TOUCH_OUTSIDE(42),
    IMPLICIT_DISMISS_GESTURE(43),
    EXPLICIT_DISMISS_GESTURE(44),
    AUDIO_EXCLUSIVE_CHANGE(45),
    AUDIO_PLAYING(46),
    MIC_TIMEOUT(47),
    DIALOG_TERMINATED(48),
    CLOSE_MIC_REQUEST(49),
    OPEN_MIC_REQUEST(50),
    UTTERANCE_DONE(51),
    HALF_LISTENING_ALLOWED_FAILED(52),
    EXTEND_STATE_END(53),
    LOW_POWER_TRIGGER(54),
    NON_VOICE_INTERACTION(55),
    ALARM_RINGING(57),
    NGA_STATE_CHANGED(58),
    UTTERANCE_DONE_FAILED(59),
    UTTERANCE_DONE_CANCELED(60),
    RETRY(61),
    KEYBOARD_VISIBLE(62),
    KEYBOARD_HIDDEN(63),
    TIMER_RINGING(64),
    MEDIA_UNMUTED_DURING_PLAYBACK(65),
    UTTERANCE_EXECUTION(66),
    DICTATION_ERROR(67),
    PUSH_TO_TALK_INVOCATION(68),
    BISTO_CANCEL_INVOCATION(69),
    DICTATION_ESCAPE_HATCH(70),
    OFFLINE_SPEECH_ENDED(71),
    SPEECH_NOT_DETECTED(72),
    OPENING_TYPING_MODE(73),
    EXECUTION_TIMEOUT(74),
    RETRY_WHILE_NOT_LISTENING(75),
    CLOSE_MIC_MUSIC_SEARCH_REQUEST(76),
    MANUAL_ENDPOINT(77),
    AUDIO_FOCUS_LOST(78),
    ENDPOINT_ON_TIMEOUT(79),
    DICTATION_END_OF_ORATION(80),
    TACTILE_SHELF_OPENED(81),
    AVS_LISTENING(82),
    AVS_STOPPED(90),
    WATCH_INVOCATION(83),
    MANUAL_ENDPOINT_TIMEOUT(84),
    WARM_ACTIONS_STARTED(85),
    MIC_OPEN_FAILURE(86),
    RECOGNIZER_NO_SPEECH(87),
    SEARCH_PROCESS_DEAD(88),
    SPEECH_FAILURE(89),
    NO_RECOGNITION_RECEIVED(91),
    OAUTH_USER_RECOVERABLE_ERROR(92),
    SPEED_BUMP_ENABLED(93);
    

    /* renamed from: aO */
    public final int f226624aO;

    private C83016y(int i) {
        this.f226624aO = i;
    }

    /* renamed from: a */
    public static C83016y m132448a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return NGA_CREATE;
            case 2:
                return EXPLICIT_TRIGGER;
            case 3:
                return DELIBERATE_INPUT_DETECTED;
            case 4:
                return QUERY_BROADCAST_RECEIVED;
            case 5:
                return FINAL_RECOGNITION_PROCESSING;
            case 6:
                return INTENT_EXECUTED;
            case 7:
                return PICKED_UP;
            case 8:
                return WAKE_UP_GESTURE;
            case 9:
                return SHUT_DOWN_GESTURE;
            case 10:
                return TOGGLE_OFF;
            case 11:
                return TOGGLE_ON;
            case 12:
                return SPEECH_STARTED;
            case 13:
                return SPEECH_ENDED;
            case 15:
                return REPLY_CHIP_PROVIDED;
            case 16:
                return REPLY_CHIP_CLICK;
            case 17:
                return OPA_VISIBLE;
            case 18:
                return OPA_HIDDEN;
            case 19:
                return TTS_STARTED;
            case 20:
                return TTS_FINISHED;
            case 21:
                return PLAYBACK_STARTED;
            case 22:
                return PLAYBACK_FINISHED;
            case 23:
                return TRANSCRIPTION_EDIT_STARTED;
            case 24:
                return TRANSCRIPTION_EDIT_FINISHED;
            case 25:
                return SCREEN_UNLOCKED;
            case 26:
                return SCREEN_LOCKED;
            case 27:
                return SCREEN_ON;
            case 28:
                return SCREEN_OFF;
            case 29:
                return NO_FOREGROUNDED_APP;
            case 30:
                return TIMEOUT;
            case 31:
                return PROACTIVE_QUERY;
            case 32:
                return TIMEOUT_RESTARTED;
            case 33:
                return SESSION_CANCELLATION;
            case 34:
                return OPENING_ZEROSTATE;
            case 35:
                return DATA_STORE_CHANGE;
            case 37:
                return INITIAL_RESULT;
            case 38:
                return DISCOVERY_CHIP_CLICK;
            case 39:
                return DISCOVERY_HELP_PANEL;
            case 40:
                return FULL_LISTENING_TIMEOUT;
            case 41:
                return HALF_LISTENING_TIMEOUT;
            case 42:
                return TOUCH_OUTSIDE;
            case 43:
                return IMPLICIT_DISMISS_GESTURE;
            case 44:
                return EXPLICIT_DISMISS_GESTURE;
            case 45:
                return AUDIO_EXCLUSIVE_CHANGE;
            case 46:
                return AUDIO_PLAYING;
            case 47:
                return MIC_TIMEOUT;
            case 48:
                return DIALOG_TERMINATED;
            case 49:
                return CLOSE_MIC_REQUEST;
            case 50:
                return OPEN_MIC_REQUEST;
            case 51:
                return UTTERANCE_DONE;
            case 52:
                return HALF_LISTENING_ALLOWED_FAILED;
            case 53:
                return EXTEND_STATE_END;
            case 54:
                return LOW_POWER_TRIGGER;
            case 55:
                return NON_VOICE_INTERACTION;
            case 56:
                return DICTATING_TIMEOUT;
            case 57:
                return ALARM_RINGING;
            case 58:
                return NGA_STATE_CHANGED;
            case 59:
                return UTTERANCE_DONE_FAILED;
            case 60:
                return UTTERANCE_DONE_CANCELED;
            case 61:
                return RETRY;
            case 62:
                return KEYBOARD_VISIBLE;
            case 63:
                return KEYBOARD_HIDDEN;
            case 64:
                return TIMER_RINGING;
            case 65:
                return MEDIA_UNMUTED_DURING_PLAYBACK;
            case 66:
                return UTTERANCE_EXECUTION;
            case 67:
                return DICTATION_ERROR;
            case 68:
                return PUSH_TO_TALK_INVOCATION;
            case 69:
                return BISTO_CANCEL_INVOCATION;
            case 70:
                return DICTATION_ESCAPE_HATCH;
            case 71:
                return OFFLINE_SPEECH_ENDED;
            case 72:
                return SPEECH_NOT_DETECTED;
            case 73:
                return OPENING_TYPING_MODE;
            case 74:
                return EXECUTION_TIMEOUT;
            case 75:
                return RETRY_WHILE_NOT_LISTENING;
            case 76:
                return CLOSE_MIC_MUSIC_SEARCH_REQUEST;
            case 77:
                return MANUAL_ENDPOINT;
            case 78:
                return AUDIO_FOCUS_LOST;
            case 79:
                return ENDPOINT_ON_TIMEOUT;
            case 80:
                return DICTATION_END_OF_ORATION;
            case 81:
                return TACTILE_SHELF_OPENED;
            case 82:
                return AVS_LISTENING;
            case 83:
                return WATCH_INVOCATION;
            case 84:
                return MANUAL_ENDPOINT_TIMEOUT;
            case 85:
                return WARM_ACTIONS_STARTED;
            case 86:
                return MIC_OPEN_FAILURE;
            case 87:
                return RECOGNIZER_NO_SPEECH;
            case 88:
                return SEARCH_PROCESS_DEAD;
            case 89:
                return SPEECH_FAILURE;
            case 90:
                return AVS_STOPPED;
            case 91:
                return NO_RECOGNITION_RECEIVED;
            case 92:
                return OAUTH_USER_RECOVERABLE_ERROR;
            case 93:
                return SPEED_BUMP_ENABLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m132449b() {
        return C83015x.f226530a;
    }

    public final int getNumber() {
        return this.f226624aO;
    }

    public final String toString() {
        return Integer.toString(this.f226624aO);
    }
}
