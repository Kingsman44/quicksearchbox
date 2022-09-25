package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.auto.a.a.bp */
/* compiled from: PG */
public enum C8898bp implements C62957cd {
    EVENT_TYPE_UNSPECIFIED(0),
    ASSISTANT_NUDGE_IN_DIALER_SHOWN(1),
    ASSISTANT_NUDGE_IN_DIALER_CLICKED(2),
    GEARHEAD_LAUNCHER_SHOWN(3),
    GEARHEAD_LONG_DRIVE_START(4),
    ASSISTANT_TOOLTIP_FOR_DIALER_OPEN(11),
    ASSISTANT_TOOLTIP_FOR_PHONE_CALL_ENDED(12),
    ASSISTANT_TOOLTIP_FOR_FIRST_RUN(13),
    ASSISTANT_TOOLTIP_FOR_FIRST_RUN_IN_THREE_RUNS(14),
    ASSISTANT_TOOLTIP_FOR_SECOND_RUN_IN_THREE_RUNS(15),
    ASSISTANT_TOOLTIP_FOR_THIRD_RUN_IN_THREE_RUNS(16),
    ASSISTANT_TOOLTIP_FOR_MEDIA_OPEN(17),
    ASSISTANT_TOOLTIP_FOR_LAUNCHER_OPEN(18),
    ASSISTANT_TOOLTIP_FOR_LONG_DRIVE_START(19),
    ASSISTANT_MEDIA_REC_TOOLTIP_FIRST_RUN(101),
    ASSISTANT_MEDIA_REC_TOOLTIP_MEDIA_IDLE(102),
    CUJ_SHORTCUTS_MEDIA_IMMERSIVE_CLICKED(121),
    CUJ_SHORTCUTS_MEDIA_CLICKED(122),
    CUJ_SHORTCUTS_CALL_CLICKED(123),
    CUJ_SHORTCUTS_MESSAGING_CLICKED(124);
    

    /* renamed from: u */
    public final int f30896u;

    private C8898bp(int i) {
        this.f30896u = i;
    }

    /* renamed from: a */
    public static C8898bp m23511a(int i) {
        if (i == 0) {
            return EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ASSISTANT_NUDGE_IN_DIALER_SHOWN;
        }
        if (i == 2) {
            return ASSISTANT_NUDGE_IN_DIALER_CLICKED;
        }
        if (i == 3) {
            return GEARHEAD_LAUNCHER_SHOWN;
        }
        if (i == 4) {
            return GEARHEAD_LONG_DRIVE_START;
        }
        if (i == 101) {
            return ASSISTANT_MEDIA_REC_TOOLTIP_FIRST_RUN;
        }
        if (i == 102) {
            return ASSISTANT_MEDIA_REC_TOOLTIP_MEDIA_IDLE;
        }
        switch (i) {
            case 11:
                return ASSISTANT_TOOLTIP_FOR_DIALER_OPEN;
            case 12:
                return ASSISTANT_TOOLTIP_FOR_PHONE_CALL_ENDED;
            case 13:
                return ASSISTANT_TOOLTIP_FOR_FIRST_RUN;
            case 14:
                return ASSISTANT_TOOLTIP_FOR_FIRST_RUN_IN_THREE_RUNS;
            case 15:
                return ASSISTANT_TOOLTIP_FOR_SECOND_RUN_IN_THREE_RUNS;
            case 16:
                return ASSISTANT_TOOLTIP_FOR_THIRD_RUN_IN_THREE_RUNS;
            case 17:
                return ASSISTANT_TOOLTIP_FOR_MEDIA_OPEN;
            case 18:
                return ASSISTANT_TOOLTIP_FOR_LAUNCHER_OPEN;
            case 19:
                return ASSISTANT_TOOLTIP_FOR_LONG_DRIVE_START;
            default:
                switch (i) {
                    case 121:
                        return CUJ_SHORTCUTS_MEDIA_IMMERSIVE_CLICKED;
                    case 122:
                        return CUJ_SHORTCUTS_MEDIA_CLICKED;
                    case 123:
                        return CUJ_SHORTCUTS_CALL_CLICKED;
                    case 124:
                        return CUJ_SHORTCUTS_MESSAGING_CLICKED;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m23512b() {
        return C8897bo.f30874a;
    }

    public final int getNumber() {
        return this.f30896u;
    }

    public final String toString() {
        return Integer.toString(this.f30896u);
    }
}
