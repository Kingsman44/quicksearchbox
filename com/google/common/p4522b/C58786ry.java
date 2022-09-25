package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.common.b.ry */
/* compiled from: PG */
abstract class C58786ry implements C58784rw {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58784rw) {
            C58784rw rwVar = (C58784rw) obj;
            return C58832aw.m90831a(mo55972b(), rwVar.mo55972b()) && C58832aw.m90831a(mo55971a(), rwVar.mo55971a()) && C58832aw.m90831a(mo55973c(), rwVar.mo55973c());
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo55972b(), mo55971a(), mo55973c()});
    }

    public final String toString() {
        return "(" + mo55972b() + "," + mo55971a() + ")=" + mo55973c();
    }
}
