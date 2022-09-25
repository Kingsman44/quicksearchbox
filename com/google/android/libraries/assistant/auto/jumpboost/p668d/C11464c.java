package com.google.android.libraries.assistant.auto.jumpboost.p668d;

import com.google.android.libraries.assistant.auto.tng.common.p900c.C13221a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.d.c */
/* compiled from: PG */
public final class C11464c implements C13221a {

    /* renamed from: a */
    private final C21370a f37253a;

    public C11464c(C21370a aVar) {
        this.f37253a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20001a() {
        C61817j jVar = (C61817j) C61818k.f166999r.createBuilder();
        long b = this.f37253a.mo26870b();
        jVar.copyOnWrite();
        C61818k kVar = (C61818k) jVar.instance;
        kVar.f167001a |= 256;
        kVar.f167009i = b * 1000;
        return C60856cj.m92900i((C61818k) jVar.build());
    }
}
