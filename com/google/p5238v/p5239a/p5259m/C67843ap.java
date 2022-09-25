package com.google.p5238v.p5239a.p5259m;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.v.a.m.ap */
/* compiled from: PG */
public final class C67843ap implements C67846as {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59994a(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
