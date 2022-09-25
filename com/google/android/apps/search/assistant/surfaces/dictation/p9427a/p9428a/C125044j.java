package com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.a.j */
/* compiled from: PG */
public enum C125044j implements C62957cd {
    UNKNOWN(0),
    CLOSE(1),
    CLEAR(2),
    SEND(3),
    SEARCH(4),
    UNDO(5),
    NEXT(6),
    PREVIOUS(14),
    FIRST_ONE(7),
    SET_SUBJECT(8),
    SET_BODY(9),
    ADD_ITEM(10),
    SAVE(11),
    CLEAR_ALL(12),
    NEW_LINE(15),
    NEW_PARAGRAPH(16),
    DISCARD(17),
    EMOJI_SUGGESTION(13),
    UNRECOGNIZED(-1);
    

    /* renamed from: t */
    private final int f345011t;

    private C125044j(int i) {
        this.f345011t = i;
    }

    /* renamed from: a */
    public static C125044j m204969a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CLOSE;
            case 2:
                return CLEAR;
            case 3:
                return SEND;
            case 4:
                return SEARCH;
            case 5:
                return UNDO;
            case 6:
                return NEXT;
            case 7:
                return FIRST_ONE;
            case 8:
                return SET_SUBJECT;
            case 9:
                return SET_BODY;
            case 10:
                return ADD_ITEM;
            case 11:
                return SAVE;
            case 12:
                return CLEAR_ALL;
            case 13:
                return EMOJI_SUGGESTION;
            case 14:
                return PREVIOUS;
            case 15:
                return NEW_LINE;
            case 16:
                return NEW_PARAGRAPH;
            case 17:
                return DISCARD;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f345011t;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
