package com.google.p5238v.p5239a.p5259m;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: com.google.v.a.m.ao */
/* compiled from: PG */
public final class C67842ao implements C67846as {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59994a(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
