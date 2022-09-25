package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.support.p033v7.widget.C0644ff;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.c */
/* compiled from: PG */
final class C134854c implements C0644ff {

    /* renamed from: a */
    final /* synthetic */ C134898g f367119a;

    public C134854c(C134898g gVar) {
        this.f367119a = gVar;
    }

    /* renamed from: a */
    public final void mo2887a() {
        C134898g gVar = this.f367119a;
        if (gVar.f367243k) {
            gVar.f367243k = false;
            Duration duration = gVar.f367241i;
            C69664n.m101060f(duration, "changeItemAnimatorDuration");
            Duration duration2 = this.f367119a.f367242j;
            C69664n.m101060f(duration2, "moveItemAnimatorDuration");
            gVar.mo112053e(duration, duration2);
            this.f367119a.f367236d.f2538m = true;
        }
    }
}
