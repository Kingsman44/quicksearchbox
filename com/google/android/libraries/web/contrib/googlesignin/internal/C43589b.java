package com.google.android.libraries.web.contrib.googlesignin.internal;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.googlesignin.internal.GoogleCookieRefreshSynclet", mo61344c = "GoogleCookieRefreshSynclet.kt", mo61345d = "performGaiaSync", mo61346e = {75, 77})
/* renamed from: com.google.android.libraries.web.contrib.googlesignin.internal.b */
/* compiled from: PG */
final class C43589b extends C69565c {

    /* renamed from: a */
    Object f113786a;

    /* renamed from: b */
    /* synthetic */ Object f113787b;

    /* renamed from: c */
    final /* synthetic */ C43596i f113788c;

    /* renamed from: d */
    int f113789d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43589b(C43596i iVar, C69577g gVar) {
        super(gVar);
        this.f113788c = iVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f113787b = obj;
        this.f113789d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f113788c.mo46644c(this);
    }
}
