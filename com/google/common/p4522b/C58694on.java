package com.google.common.p4522b;

import com.google.common.base.C58832aw;

/* renamed from: com.google.common.b.on */
/* compiled from: PG */
abstract class C58694on implements C58691ok {
    public final boolean equals(Object obj) {
        if (obj instanceof C58691ok) {
            C58691ok okVar = (C58691ok) obj;
            if (mo55767a() != okVar.mo55767a() || !C58832aw.m90831a(mo55768b(), okVar.mo55768b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object b = mo55768b();
        if (b == null) {
            i = 0;
        } else {
            i = b.hashCode();
        }
        return i ^ mo55767a();
    }

    public final String toString() {
        String valueOf = String.valueOf(mo55768b());
        int a = mo55767a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}
