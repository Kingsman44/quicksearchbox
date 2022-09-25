package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.cw */
/* compiled from: PG */
public final class C58886cw {
    /* renamed from: a */
    public static C58881cr m90973a(C58881cr crVar) {
        if ((crVar instanceof C58884cu) || (crVar instanceof C58883ct)) {
            return crVar;
        }
        if (crVar instanceof Serializable) {
            return new C58883ct(crVar);
        }
        return new C58884cu(crVar);
    }
}
