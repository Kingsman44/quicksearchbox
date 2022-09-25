package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29101o;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.jo */
/* compiled from: PG */
public final class C29235jo implements C29118ff {

    /* renamed from: a */
    public final C29658ia f79234a;

    /* renamed from: b */
    public final C42876ab f79235b;

    /* renamed from: c */
    public final Executor f79236c;

    /* renamed from: d */
    private final C29662ie f79237d;

    public C29235jo(C29662ie ieVar, C29658ia iaVar, C42876ab abVar, Executor executor) {
        this.f79237d = ieVar;
        this.f79234a = iaVar;
        this.f79235b = abVar;
        this.f79236c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo34596a(C29334dr drVar) {
        C29045l.m53931c("%s: Adding file group %s", "ProtoDataStoreFileGroupsMetadata", drVar.f79501c);
        C29334dr d = C29099m.m54008d(drVar, (this.f79237d.mo34498a() / 1000) + drVar.f79508j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        return mo34608m(arrayList);
    }

    /* renamed from: b */
    public final C60870cx mo34597b() {
        return C29670b.m54719g(mo34606k()).mo34822i(new C29233jm(this), this.f79236c);
    }

    /* renamed from: c */
    public final C60870cx mo34598c() {
        ArrayList arrayList = new ArrayList();
        return C29670b.m54719g(this.f79235b.mo46039a(new C29234jn(arrayList), this.f79236c)).mo34821h(new C29213it(arrayList), this.f79236c);
    }

    /* renamed from: d */
    public final C60870cx mo34599d() {
        ArrayList arrayList = new ArrayList();
        return C29670b.m54719g(this.f79235b.mo46039a(new C29230jj(this, arrayList), this.f79236c)).mo34821h(new C29231jk(arrayList), this.f79236c);
    }

    /* renamed from: e */
    public final C60870cx mo34600e() {
        C60870cx d = this.f79235b.mo46042d();
        C29229ji jiVar = C29229ji.f79227a;
        return C60922j.m93044g(d, C47810es.m84963c(jiVar), this.f79236c);
    }

    /* renamed from: f */
    public final C60870cx mo34601f() {
        return C60866ct.f164955a;
    }

    /* renamed from: g */
    public final C60870cx mo34602g(C29392ep epVar) {
        String c = C29101o.m54019c(epVar);
        C60870cx d = this.f79235b.mo46042d();
        C29226jf jfVar = new C29226jf(c);
        return C60922j.m93044g(d, C47810es.m84963c(jfVar), this.f79236c);
    }

    /* renamed from: h */
    public final C60870cx mo34603h(C29392ep epVar) {
        String c = C29101o.m54019c(epVar);
        C60870cx d = this.f79235b.mo46042d();
        C29212is isVar = new C29212is(c);
        return C60922j.m93044g(d, C47810es.m84963c(isVar), this.f79236c);
    }

    /* renamed from: i */
    public final C60870cx mo34604i(C29392ep epVar) {
        return C29670b.m54719g(this.f79235b.mo46039a(new C29222jb(C29101o.m54019c(epVar)), this.f79236c)).mo34821h(C29223jc.f79221a, this.f79236c).mo34819e(IOException.class, C29225je.f79223a, this.f79236c);
    }

    /* renamed from: j */
    public final C60870cx mo34605j(List list) {
        return C29670b.m54719g(this.f79235b.mo46039a(new C29214iu(list), this.f79236c)).mo34821h(C29215iv.f79212a, this.f79236c).mo34819e(IOException.class, C29216iw.f79213a, this.f79236c);
    }

    /* renamed from: k */
    public final C60870cx mo34606k() {
        return this.f79235b.mo46039a(C29232jl.f79231a, this.f79236c);
    }

    /* renamed from: l */
    public final C60870cx mo34607l(C29392ep epVar, C29334dr drVar) {
        return C29670b.m54719g(this.f79235b.mo46039a(new C29218iy(C29101o.m54019c(epVar), drVar), this.f79236c)).mo34821h(C29219iz.f79217a, this.f79236c).mo34819e(IOException.class, C29221ja.f79219a, this.f79236c);
    }

    /* renamed from: m */
    public final C60870cx mo34608m(List list) {
        return C29670b.m54719g(this.f79235b.mo46039a(new C29224jd(list), this.f79236c)).mo34821h(C29227jg.f79225a, this.f79236c).mo34819e(IOException.class, C29228jh.f79226a, this.f79236c);
    }
}
