package com.google.android.libraries.web.contrib.googlesignin.internal;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44041d;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.googlesignin.internal.GoogleCookieRefreshSynclet", mo61344c = "GoogleCookieRefreshSynclet.kt", mo61345d = "refreshGaiaCookiesWithRetry", mo61346e = {102, 106})
/* renamed from: com.google.android.libraries.web.contrib.googlesignin.internal.f */
/* compiled from: PG */
final class C43593f extends C69565c {

    /* renamed from: a */
    Object f113793a;

    /* renamed from: b */
    int f113794b;

    /* renamed from: c */
    int f113795c;

    /* renamed from: d */
    /* synthetic */ Object f113796d;

    /* renamed from: e */
    final /* synthetic */ C43596i f113797e;

    /* renamed from: f */
    int f113798f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43593f(C43596i iVar, C69577g gVar) {
        super(gVar);
        this.f113797e = iVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f113796d = obj;
        this.f113798f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f113797e.mo46645d((C44041d) null, this);
    }
}
