package com.google.p5238v.p5239a.p5259m;

import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.v.a.m.ar */
/* compiled from: PG */
public final class C67845ar implements C67846as {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59994a(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
