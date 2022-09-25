package com.google.android.apps.gsa.staticplugins.opa.p8186ai.p8187a;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.C83217a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90773bq;
import com.google.android.apps.gsa.staticplugins.opa.p8186ai.C106176a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ai.a.b */
/* compiled from: PG */
public final class C106178b {

    /* renamed from: a */
    public final C39141kp f296323a;

    /* renamed from: b */
    public final String f296324b;

    /* renamed from: c */
    public final String f296325c;

    /* renamed from: d */
    private final Optional f296326d;

    public C106178b(C39141kp kpVar, Context context, C90476a aVar, Optional optional) {
        this.f296323a = kpVar;
        this.f296324b = C90773bq.m148323e(context);
        this.f296325c = aVar.mo84224a();
        this.f296326d = optional;
    }

    /* renamed from: a */
    public final String mo95345a() {
        return ((C83217a) this.f296326d.map(C106177a.f296322a).orElse(C83217a.UNKNOWN)).f226840e;
    }

    /* renamed from: b */
    public final void mo95346b(C106176a aVar) {
        String a = mo95345a();
        C39141kp kpVar = this.f296323a;
        ((C19567d) kpVar.f102794E.mo6453a()).mo24822a(1, this.f296324b, this.f296325c, a, aVar.f296321d);
    }
}
