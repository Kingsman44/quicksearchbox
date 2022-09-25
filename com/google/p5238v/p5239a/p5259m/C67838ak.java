package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.p5243b.p5244a.C67544b;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.v.a.m.ak */
/* compiled from: PG */
public final class C67838ak {

    /* renamed from: a */
    public static final C67838ak f183948a = new C67838ak(new C67839al());

    /* renamed from: b */
    public static final C67838ak f183949b = new C67838ak(new C67843ap());

    /* renamed from: c */
    public static final C67838ak f183950c = new C67838ak(new C67845ar());

    /* renamed from: d */
    public static final C67838ak f183951d = new C67838ak(new C67844aq());

    /* renamed from: e */
    public static final C67838ak f183952e = new C67838ak(new C67840am());

    /* renamed from: f */
    public static final C67838ak f183953f = new C67838ak(new C67842ao());

    /* renamed from: g */
    public static final C67838ak f183954g = new C67838ak(new C67841an());

    /* renamed from: h */
    private static final Logger f183955h = Logger.getLogger(C67838ak.class.getName());

    /* renamed from: i */
    private static final List f183956i;

    /* renamed from: j */
    private static final boolean f183957j;

    /* renamed from: k */
    private final C67846as f183958k;

    static {
        if (C67544b.m97646a()) {
            f183956i = m98017b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f183957j = false;
        } else if (C67869bo.m98078c()) {
            f183956i = m98017b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f183957j = true;
        } else {
            f183956i = new ArrayList();
            f183957j = true;
        }
    }

    public C67838ak(C67846as asVar) {
        this.f183958k = asVar;
    }

    /* renamed from: b */
    public static List m98017b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f183955h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object mo59993a(String str) {
        Exception exc = null;
        for (Provider a : f183956i) {
            try {
                return this.f183958k.mo59994a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f183957j) {
            return this.f183958k.mo59994a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
