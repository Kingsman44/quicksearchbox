package com.google.p5238v.p5239a.p5259m;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.v.a.m.an */
/* compiled from: PG */
public final class C67841an implements C67846as {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59994a(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
