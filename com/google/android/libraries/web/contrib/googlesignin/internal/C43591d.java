package com.google.android.libraries.web.contrib.googlesignin.internal;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p3160s.p3161a.C40547a;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44044g;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.googlesignin.internal.d */
/* compiled from: PG */
final class C43591d implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C44044g f113791a;

    public C43591d(C44044g gVar) {
        this.f113791a = gVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C40547a aVar = (C40547a) obj;
        C69664n.m101061g(aVar, "it");
        aVar.f106416a.mo19974a(C37182a.f97757P.mo40803a(this.f113791a.f114684m, "COOKIE_REFRESH_RESULT"));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
