package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.b.b.ai */
/* compiled from: PG */
public enum C57125ai implements C62957cd {
    UNDEFINED(0),
    FOLLOWED(1),
    NOT_FOLLOWED(2),
    BLOCKED(3);
    

    /* renamed from: e */
    public final int f152490e;

    private C57125ai(int i) {
        this.f152490e = i;
    }

    /* renamed from: a */
    public static C57125ai m88261a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return FOLLOWED;
        }
        if (i == 2) {
            return NOT_FOLLOWED;
        }
        if (i != 3) {
            return null;
        }
        return BLOCKED;
    }

    /* renamed from: b */
    public static C62959cf m88262b() {
        return C57124ah.f152484a;
    }

    public final int getNumber() {
        return this.f152490e;
    }

    public final String toString() {
        return Integer.toString(this.f152490e);
    }
}
