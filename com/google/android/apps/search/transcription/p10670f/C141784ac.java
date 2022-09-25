package com.google.android.apps.search.transcription.p10670f;

import android.content.Context;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5208h.C66652ds;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.transcription.f.ac */
/* compiled from: PG */
public final class C141784ac implements C141847bo {

    /* renamed from: a */
    public final Executor f384770a;

    /* renamed from: b */
    public final C141848bp f384771b;

    /* renamed from: c */
    public final C141845bm f384772c;

    /* renamed from: d */
    public final C141794am f384773d;

    /* renamed from: e */
    public final C141783ab f384774e;

    /* renamed from: f */
    public final HashSet f384775f = new HashSet();

    /* renamed from: g */
    public final List f384776g = new ArrayList();

    /* renamed from: h */
    public boolean f384777h = false;

    /* renamed from: i */
    public boolean f384778i = false;

    /* renamed from: j */
    public C60870cx f384779j = null;

    /* renamed from: k */
    private final C60888db f384780k;

    /* renamed from: l */
    private final C141851bs f384781l;

    /* renamed from: m */
    private final C141783ab f384782m;

    public C141784ac(C141795an anVar, C141846bn bnVar, C60888db dbVar, C141851bs bsVar, C141848bp bpVar, C141787af afVar) {
        C141783ab abVar = new C141783ab(this);
        this.f384782m = abVar;
        C141783ab abVar2 = new C141783ab(this);
        this.f384774e = abVar2;
        this.f384780k = dbVar;
        this.f384781l = bsVar;
        this.f384771b = bpVar;
        this.f384770a = new C60904dr(dbVar);
        this.f384772c = bnVar.mo116795a(bsVar, abVar, afVar);
        C60888db dbVar2 = (C60888db) anVar.f384811a.mo17428b();
        dbVar2.getClass();
        C60888db dbVar3 = (C60888db) anVar.f384812b.mo17428b();
        dbVar3.getClass();
        C66652ds dsVar = (C66652ds) anVar.f384813c.mo17428b();
        dsVar.getClass();
        Context context = (Context) anVar.f384814d.mo17428b();
        context.getClass();
        this.f384773d = new C141794am(dbVar2, dbVar3, dsVar, context, bsVar, abVar2);
    }

    /* renamed from: a */
    public final void mo116736a() {
        this.f384773d.mo116736a();
        this.f384772c.mo116736a();
    }

    /* renamed from: b */
    public final void mo116737b() {
        this.f384779j = this.f384780k.mo29164d(C47810es.m84977q(new C141922p(this)), 5000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public final void mo116738c(Supplier supplier, int i, int i2) {
        mo116737b();
        this.f384773d.mo116738c(supplier, i, i2);
        this.f384772c.mo116738c(supplier, i, i2);
    }

    /* renamed from: d */
    public final void mo116739d(C141760s sVar) {
        if (!this.f384777h && !this.f384778i) {
            if (!this.f384781l.mo116836r() || this.f384775f.isEmpty()) {
                this.f384777h = true;
                this.f384773d.mo116736a();
                this.f384771b.mo116729c(sVar);
                for (C141924r rVar : this.f384776g) {
                    if (!this.f384775f.contains(rVar.f385109a)) {
                        rVar.f385110b.run();
                    }
                }
            }
        }
    }
}
