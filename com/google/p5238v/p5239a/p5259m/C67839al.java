package com.google.p5238v.p5239a.p5259m;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: com.google.v.a.m.al */
/* compiled from: PG */
public final class C67839al implements C67846as {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59994a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
