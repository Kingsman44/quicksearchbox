package com.google.android.apps.gsa.staticplugins.p8793w.p8795b.p8796a.p8798b;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.b.a.b.j */
/* compiled from: PG */
public final /* synthetic */ class C117746j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117747k f326822a;

    /* renamed from: b */
    public final /* synthetic */ Optional f326823b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f326824c;

    /* renamed from: d */
    public final /* synthetic */ boolean f326825d;

    public /* synthetic */ C117746j(C117747k kVar, Optional optional, C53306j jVar, boolean z) {
        this.f326822a = kVar;
        this.f326823b = optional;
        this.f326824c = jVar;
        this.f326825d = z;
    }

    public final C60870cx apply(Object obj) {
        C117747k kVar = this.f326822a;
        Optional optional = this.f326823b;
        C53306j jVar = this.f326824c;
        boolean z = this.f326825d;
        C58485gu guVar = (C58485gu) obj;
        return (C60870cx) optional.map(new C117737a(kVar, jVar, guVar, z)).orElseGet(new C117738b(kVar, jVar, guVar, z));
    }
}
