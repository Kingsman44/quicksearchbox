package com.google.android.libraries.search.assistant.p2700k;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.credential.RpcAuthContextProvider", mo61344c = "RpcAuthCredentialManager.kt", mo61345d = "authContext", mo61346e = {155})
/* renamed from: com.google.android.libraries.search.assistant.k.i */
/* compiled from: PG */
final class C34771i extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f92260a;

    /* renamed from: b */
    final /* synthetic */ C34772j f92261b;

    /* renamed from: c */
    int f92262c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34771i(C34772j jVar, C69577g gVar) {
        super(gVar);
        this.f92261b = jVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f92260a = obj;
        this.f92262c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f92261b.mo39496a((AccountId) null, this);
    }
}
