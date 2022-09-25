package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.shared.p7041h.C89782n;
import com.google.android.apps.gsa.shared.p7041h.C89783o;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58714pg;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.k */
/* compiled from: PG */
public final class C110645k implements C110595b {

    /* renamed from: a */
    public final C92111g f308318a;

    /* renamed from: b */
    public final C89782n f308319b;

    /* renamed from: c */
    private final C83783a f308320c;

    /* renamed from: d */
    private final C22871g f308321d;

    public C110645k(C83783a aVar, C92111g gVar, C22871g gVar2, C89783o oVar) {
        this.f308320c = aVar;
        this.f308318a = gVar;
        this.f308321d = gVar2;
        this.f308319b = oVar.mo83625a(C39226b.TAG_CLASSIC_ASSISTANT_AMBIENT_BUG_REPORT);
    }

    /* renamed from: a */
    public final C60870cx mo98796a() {
        return this.f308320c.mo77103b();
    }

    /* renamed from: b */
    public final C60870cx mo98797b(C58528ij ijVar) {
        return this.f308321d.mo28201a("Check calendar provider calendars for dump", new C110644j(this, ijVar));
    }

    /* renamed from: c */
    public final C60870cx mo98798c() {
        return C60922j.m93044g(this.f308320c.mo77103b(), new C110624c(this), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo98799d() {
        return this.f308320c.mo77106e();
    }

    /* renamed from: e */
    public final C60870cx mo98800e(C58714pg pgVar, C58528ij ijVar) {
        return this.f308321d.mo28201a("Check calendar provider events for dump", new C110642h(this, pgVar, ijVar));
    }

    /* renamed from: f */
    public final C60870cx mo98801f(String str) {
        return this.f308320c.mo77108g(str);
    }

    /* renamed from: g */
    public final C60870cx mo98802g(String str, C83809y yVar, long j) {
        return this.f308320c.mo77112k(str, yVar, j);
    }

    /* renamed from: h */
    public final C60870cx mo98803h(String str, C83741am amVar, C50794cr crVar) {
        return this.f308320c.mo77111j(str, amVar, crVar);
    }
}
