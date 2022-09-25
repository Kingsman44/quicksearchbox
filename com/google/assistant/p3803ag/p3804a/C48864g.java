package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.a.g */
/* compiled from: PG */
public enum C48864g implements C62957cd {
    TYPE_UNSPECIFIED(0),
    START_JOURNEY(1),
    TERMINATE_JOURNEY(2),
    REGENERATE_JOURNEY(3),
    REMOVE_CONTENT(4),
    SHOW_MOBILE_NOTIFICATION(5),
    SHOW_SMART_DISPLAY_NOTIFICATION(6),
    SHOW_ZERO_STATE_CARD(7),
    SHOW_SMART_DISPLAY_MODULE(8),
    SIGNAL_CONDITION(9);
    

    /* renamed from: k */
    public final int f126454k;

    private C48864g(int i) {
        this.f126454k = i;
    }

    /* renamed from: a */
    public static C48864g m85285a(int i) {
        switch (i) {
            case 0:
                return TYPE_UNSPECIFIED;
            case 1:
                return START_JOURNEY;
            case 2:
                return TERMINATE_JOURNEY;
            case 3:
                return REGENERATE_JOURNEY;
            case 4:
                return REMOVE_CONTENT;
            case 5:
                return SHOW_MOBILE_NOTIFICATION;
            case 6:
                return SHOW_SMART_DISPLAY_NOTIFICATION;
            case 7:
                return SHOW_ZERO_STATE_CARD;
            case 8:
                return SHOW_SMART_DISPLAY_MODULE;
            case 9:
                return SIGNAL_CONDITION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85286b() {
        return C48863f.f126442a;
    }

    public final int getNumber() {
        return this.f126454k;
    }

    public final String toString() {
        return Integer.toString(this.f126454k);
    }
}
