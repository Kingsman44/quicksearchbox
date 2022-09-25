package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.ck */
/* compiled from: PG */
public enum C142359ck implements C62957cd {
    UNKNOWN(0),
    WILL_PAUSE(1),
    PREPARE_FETCH(2),
    PREPARE_VOICE_INPUT(3),
    PERFORM_VOICE_INPUT(4),
    COMPLETE_VOICE_INPUT(5),
    CANCEL_VOICE_INPUT(6),
    START_ENDPOINTING_VOICE_INPUT(27),
    END_ENDPOINTING_VOICE_INPUT(28),
    FETCH_ANNOUNCEMENTS(7),
    EXPAND_ANNOUNCEMENT(8),
    TAKE_ACTION_ON_ANNOUNCEMENT(9),
    SKIP_CURRENT_ANNOUNCEMENT(10),
    STOP_ANNOUNCEMENTS(11),
    VOLUME_UP_ONCE(12),
    VOLUME_UP_START(13),
    VOLUME_UP_STOP(14),
    VOLUME_DOWN_ONCE(15),
    VOLUME_DOWN_START(16),
    VOLUME_DOWN_STOP(17),
    MEDIA_PLAY(18),
    MEDIA_PAUSE(19),
    TOGGLE_PLAY_PAUSE(20),
    PREV_TRACK(21),
    NEXT_TRACK(22),
    CALL_ANSWER(23),
    CALL_REJECT(24),
    CALL_HANGUP(25),
    HFP_VOICE_ACTIVATION(26),
    MIC_MUTE(29),
    MIC_UNMUTE(30),
    ANNOUNCEMENTS_OR_VOICE_INPUT(31),
    ASSISTANT_NO_OP(32);
    

    /* renamed from: H */
    public final int f386301H;

    private C142359ck(int i) {
        this.f386301H = i;
    }

    /* renamed from: a */
    public static C142359ck m231065a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WILL_PAUSE;
            case 2:
                return PREPARE_FETCH;
            case 3:
                return PREPARE_VOICE_INPUT;
            case 4:
                return PERFORM_VOICE_INPUT;
            case 5:
                return COMPLETE_VOICE_INPUT;
            case 6:
                return CANCEL_VOICE_INPUT;
            case 7:
                return FETCH_ANNOUNCEMENTS;
            case 8:
                return EXPAND_ANNOUNCEMENT;
            case 9:
                return TAKE_ACTION_ON_ANNOUNCEMENT;
            case 10:
                return SKIP_CURRENT_ANNOUNCEMENT;
            case 11:
                return STOP_ANNOUNCEMENTS;
            case 12:
                return VOLUME_UP_ONCE;
            case 13:
                return VOLUME_UP_START;
            case 14:
                return VOLUME_UP_STOP;
            case 15:
                return VOLUME_DOWN_ONCE;
            case 16:
                return VOLUME_DOWN_START;
            case 17:
                return VOLUME_DOWN_STOP;
            case 18:
                return MEDIA_PLAY;
            case 19:
                return MEDIA_PAUSE;
            case 20:
                return TOGGLE_PLAY_PAUSE;
            case 21:
                return PREV_TRACK;
            case 22:
                return NEXT_TRACK;
            case 23:
                return CALL_ANSWER;
            case 24:
                return CALL_REJECT;
            case 25:
                return CALL_HANGUP;
            case 26:
                return HFP_VOICE_ACTIVATION;
            case 27:
                return START_ENDPOINTING_VOICE_INPUT;
            case 28:
                return END_ENDPOINTING_VOICE_INPUT;
            case 29:
                return MIC_MUTE;
            case 30:
                return MIC_UNMUTE;
            case 31:
                return ANNOUNCEMENTS_OR_VOICE_INPUT;
            case 32:
                return ASSISTANT_NO_OP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m231066b() {
        return C142358cj.f386266a;
    }

    public final int getNumber() {
        return this.f386301H;
    }

    public final String toString() {
        return Integer.toString(this.f386301H);
    }
}
