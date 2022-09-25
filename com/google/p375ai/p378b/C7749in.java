package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.in */
/* compiled from: PG */
public enum C7749in implements C62957cd {
    INVALID(0),
    FOREGROUND_START_NOW(1),
    FOREGROUND_START_SEARCH_SUGGEST(2),
    DEPRECATED_DEVICE_INTERACTION_START(3),
    DEPRECATED_NOTIFICATIONS_CHANGED(4),
    RENDERING_STOPPED(5),
    NEXT_PAGE(6);
    

    /* renamed from: h */
    public final int f27118h;

    private C7749in(int i) {
        this.f27118h = i;
    }

    /* renamed from: a */
    public static C7749in m22836a(int i) {
        switch (i) {
            case 0:
                return INVALID;
            case 1:
                return FOREGROUND_START_NOW;
            case 2:
                return FOREGROUND_START_SEARCH_SUGGEST;
            case 3:
                return DEPRECATED_DEVICE_INTERACTION_START;
            case 4:
                return DEPRECATED_NOTIFICATIONS_CHANGED;
            case 5:
                return RENDERING_STOPPED;
            case 6:
                return NEXT_PAGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22837b() {
        return C7748im.f27109a;
    }

    public final int getNumber() {
        return this.f27118h;
    }

    public final String toString() {
        return Integer.toString(this.f27118h);
    }
}
