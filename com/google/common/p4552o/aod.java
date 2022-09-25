package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.aod */
/* compiled from: PG */
public enum aod implements C62957cd {
    ABANDONMENT(22),
    DELETION(33),
    INSPIRE(25),
    INSPIRE_ABANDONMENT(32),
    PEEKABOO(26),
    CLICKED_SUGGESTION(1),
    CUE_CARDS_IMPRESSION(21),
    DELETE_KEY(2),
    ENHANCEMENT(31),
    ACTION(34),
    ENTER_KEY(3),
    SHIFT_ENTER_KEY(4),
    ESCAPE_KEY(5),
    FEELING_LUCKY_ARROW_KEY(6),
    FEELING_LUCKY_BUTTON(7),
    FEELING_LUCKY_BUTTON_INLINE(8),
    FEELING_LUCKY_LINK(9),
    MATCHBOX(29),
    MATCHBOX_ABANDONMENT(30),
    PREFETCH(10),
    PREFETCH_QUERY(27),
    PREFETCH_SUGGESTION(28),
    SCROLL(11),
    SEARCH_ANYWAY_LINK(16),
    SEARCH_BUTTON(12),
    SEARCH_BUTTON_INLINE(13),
    SEARCH_FOR_QUERY_SUGGESTION(23),
    SECONDARY_BUTTON_INLINE(14),
    SPEECH_RECOGNITION(15),
    SPEECH2_CLICK(17),
    SPEECH2_FINAL_RESULT(18),
    SPEECH2_IDLE_TIMEOUT(19),
    SPEECH2_RESTORE(20),
    SEARCH_OLDER_ITEMS(24),
    UNSET(0);
    

    /* renamed from: J */
    public final int f159471J;

    private aod(int i) {
        this.f159471J = i;
    }

    /* renamed from: a */
    public static aod m92443a(int i) {
        switch (i) {
            case 0:
                return UNSET;
            case 1:
                return CLICKED_SUGGESTION;
            case 2:
                return DELETE_KEY;
            case 3:
                return ENTER_KEY;
            case 4:
                return SHIFT_ENTER_KEY;
            case 5:
                return ESCAPE_KEY;
            case 6:
                return FEELING_LUCKY_ARROW_KEY;
            case 7:
                return FEELING_LUCKY_BUTTON;
            case 8:
                return FEELING_LUCKY_BUTTON_INLINE;
            case 9:
                return FEELING_LUCKY_LINK;
            case 10:
                return PREFETCH;
            case 11:
                return SCROLL;
            case 12:
                return SEARCH_BUTTON;
            case 13:
                return SEARCH_BUTTON_INLINE;
            case 14:
                return SECONDARY_BUTTON_INLINE;
            case 15:
                return SPEECH_RECOGNITION;
            case 16:
                return SEARCH_ANYWAY_LINK;
            case 17:
                return SPEECH2_CLICK;
            case 18:
                return SPEECH2_FINAL_RESULT;
            case 19:
                return SPEECH2_IDLE_TIMEOUT;
            case 20:
                return SPEECH2_RESTORE;
            case 21:
                return CUE_CARDS_IMPRESSION;
            case 22:
                return ABANDONMENT;
            case 23:
                return SEARCH_FOR_QUERY_SUGGESTION;
            case 24:
                return SEARCH_OLDER_ITEMS;
            case 25:
                return INSPIRE;
            case 26:
                return PEEKABOO;
            case 27:
                return PREFETCH_QUERY;
            case 28:
                return PREFETCH_SUGGESTION;
            case 29:
                return MATCHBOX;
            case 30:
                return MATCHBOX_ABANDONMENT;
            case 31:
                return ENHANCEMENT;
            case 32:
                return INSPIRE_ABANDONMENT;
            case 33:
                return DELETION;
            case 34:
                return ACTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92444b() {
        return aoc.f159434a;
    }

    public final int getNumber() {
        return this.f159471J;
    }

    public final String toString() {
        return Integer.toString(this.f159471J);
    }
}
