package com.google.p5238v.p5239a;

import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.s */
/* compiled from: PG */
public final class C67903s {
    /* renamed from: a */
    public static C67902r m98166a(String str) {
        C67902r rVar = (C67902r) C67539aj.m97633h().get(str);
        if (rVar != null) {
            return rVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
