package com.google.android.gms.car;

/* renamed from: com.google.android.gms.car.dq */
/* compiled from: PG */
public final class C143200dq {
    /* renamed from: a */
    public static String m232322a(int i) {
        if (i == 1) {
            return "backward";
        }
        if (i == 2) {
            return "forward";
        }
        if (i == 17) {
            return "left";
        }
        if (i == 33) {
            return "up";
        }
        if (i != 66) {
            return i != 130 ? String.valueOf(i) : "down";
        }
        return "right";
    }
}
