package com.google.p5238v.p5239a.p5259m;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: com.google.v.a.m.aq */
/* compiled from: PG */
public final class C67844aq implements C67846as {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59994a(String str, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
