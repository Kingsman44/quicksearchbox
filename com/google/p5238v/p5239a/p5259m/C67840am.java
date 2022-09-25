package com.google.p5238v.p5239a.p5259m;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.v.a.m.am */
/* compiled from: PG */
public final class C67840am implements C67846as {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59994a(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
