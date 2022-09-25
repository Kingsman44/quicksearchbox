package com.google.android.libraries.search.assistant.p2783s.p2785b;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.UserInfoProvider", mo61344c = "UserInfoProvider.kt", mo61345d = "getAuthToken", mo61346e = {79})
/* renamed from: com.google.android.libraries.search.assistant.s.b.p */
/* compiled from: PG */
final class C36397p extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f95044a;

    /* renamed from: b */
    final /* synthetic */ C36404w f95045b;

    /* renamed from: c */
    int f95046c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36397p(C36404w wVar, C69577g gVar) {
        super(gVar);
        this.f95045b = wVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f95044a = obj;
        this.f95046c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f95045b.mo40158a((AccountId) null, false, this);
    }
}
