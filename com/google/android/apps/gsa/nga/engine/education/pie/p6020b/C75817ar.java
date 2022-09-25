package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.ar */
/* compiled from: PG */
public final /* synthetic */ class C75817ar implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C75823ax f210414a;

    /* renamed from: b */
    public final /* synthetic */ Optional f210415b;

    /* renamed from: c */
    public final /* synthetic */ boolean f210416c;

    /* renamed from: d */
    public final /* synthetic */ Instant f210417d;

    public /* synthetic */ C75817ar(C75823ax axVar, Optional optional, boolean z, Instant instant) {
        this.f210414a = axVar;
        this.f210415b = optional;
        this.f210416c = z;
        this.f210417d = instant;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        return (C60870cx) this.f210415b.map(new C75816aq(this.f210414a, this.f210416c, this.f210417d)).orElse(C60856cj.m92899h(new C75822aw()));
    }
}
