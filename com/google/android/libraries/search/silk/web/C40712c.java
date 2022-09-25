package com.google.android.libraries.search.silk.web;

import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.search.silk.web.c */
/* compiled from: PG */
final class C40712c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f106777a;

    /* renamed from: b */
    final /* synthetic */ String f106778b;

    /* renamed from: c */
    final /* synthetic */ String f106779c;

    /* renamed from: d */
    final /* synthetic */ C40769f f106780d;

    /* renamed from: e */
    final /* synthetic */ C43968o f106781e;

    public C40712c(C40769f fVar, String str, C43968o oVar, String str2, String str3) {
        this.f106780d = fVar;
        this.f106777a = str;
        this.f106781e = oVar;
        this.f106778b = str2;
        this.f106779c = str3;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f106780d.mo42724h(C41743a.m73202c(this.f106777a, th), this.f106781e, th, this.f106778b, this.f106779c);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f106780d.mo42723g(C41743a.m73206g(this.f106777a, (MessageLite) obj), this.f106781e, this.f106778b, this.f106779c);
    }
}
