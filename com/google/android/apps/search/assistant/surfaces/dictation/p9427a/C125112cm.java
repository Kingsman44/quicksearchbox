package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.cm */
/* compiled from: PG */
public enum C125112cm implements C62957cd {
    UNKNOWN_DONT_SEND(0),
    TYPING(1),
    CURSOR_CHANGE(2),
    APPLICATION_CONSUMED_CONTENT(3),
    FIELD_CHANGE(4),
    NEW_ORATION_STARTED(5),
    KEYBOARD_ACTION(6),
    INPUT_LANGUAGE_CHANGE(7),
    CANDIDATE_SELECTED(8),
    KEYBOARD_CLOSED(9),
    ORATION_COMPLETED(10),
    ORATION_RPC_ERROR(11),
    DELETE_KEY_PRESSED(12),
    LANGUAGE_PICKER_SELECTED_ELIGIBLE_LANGUAGE(13),
    LANGUAGE_PICKER_SELECTED_INELIGIBLE_LANGUAGE(14),
    LANGUAGE_PICKER_SELECTED_AUTO_DETECT_LANGUAGE(15),
    UNRECOGNIZED(-1);
    

    /* renamed from: r */
    private final int f345169r;

    private C125112cm(int i) {
        this.f345169r = i;
    }

    /* renamed from: a */
    public static C125112cm m205002a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DONT_SEND;
            case 1:
                return TYPING;
            case 2:
                return CURSOR_CHANGE;
            case 3:
                return APPLICATION_CONSUMED_CONTENT;
            case 4:
                return FIELD_CHANGE;
            case 5:
                return NEW_ORATION_STARTED;
            case 6:
                return KEYBOARD_ACTION;
            case 7:
                return INPUT_LANGUAGE_CHANGE;
            case 8:
                return CANDIDATE_SELECTED;
            case 9:
                return KEYBOARD_CLOSED;
            case 10:
                return ORATION_COMPLETED;
            case 11:
                return ORATION_RPC_ERROR;
            case 12:
                return DELETE_KEY_PRESSED;
            case 13:
                return LANGUAGE_PICKER_SELECTED_ELIGIBLE_LANGUAGE;
            case 14:
                return LANGUAGE_PICKER_SELECTED_INELIGIBLE_LANGUAGE;
            case 15:
                return LANGUAGE_PICKER_SELECTED_AUTO_DETECT_LANGUAGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m205003b() {
        return C125111cl.f345150a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f345169r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
