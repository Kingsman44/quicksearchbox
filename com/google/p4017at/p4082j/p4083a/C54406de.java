package com.google.p4017at.p4082j.p4083a;

/* renamed from: com.google.at.j.a.de */
/* compiled from: PG */
public final class C54406de {
    /* renamed from: a */
    public static int m87380a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m87381b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }
}
