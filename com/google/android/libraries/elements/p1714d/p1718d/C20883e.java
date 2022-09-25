package com.google.android.libraries.elements.p1714d.p1718d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.common.base.C58832aw;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68104z;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.Status;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69826b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69969bw;
import p5488io.p5490b.p5517i.C70101a;
import p5488io.p5490b.p5518j.C70111i;

/* renamed from: com.google.android.libraries.elements.d.d.e */
/* compiled from: PG */
public final class C20883e extends C20886h {

    /* renamed from: a */
    public final C21313t f58563a;

    /* renamed from: b */
    public C21357r f58564b;

    /* renamed from: c */
    public boolean f58565c;

    /* renamed from: f */
    private final ArrayList f58566f;

    /* renamed from: g */
    private C21357r f58567g;

    /* renamed from: h */
    private C21357r f58568h;

    /* renamed from: i */
    private IntersectionCriteria f58569i;

    /* renamed from: j */
    private IntersectionCriteria f58570j;

    /* renamed from: k */
    private long f58571k;

    /* renamed from: l */
    private boolean f58572l;

    /* renamed from: m */
    private C69803b f58573m;

    public C20883e(C68104z zVar, C21313t tVar, C21311r rVar, C21359t tVar2) {
        super(rVar);
        this.f58563a = tVar;
        ArrayList arrayList = new ArrayList();
        this.f58566f = arrayList;
        if (zVar.mo60267g() != null) {
            IntersectionCriteria f = C21359t.m40381f(zVar.mo60267g());
            this.f58569i = f;
            arrayList.add(f);
        }
        if (zVar.mo60268h() != null) {
            IntersectionCriteria f2 = C21359t.m40381f(zVar.mo60268h());
            this.f58570j = f2;
            arrayList.add(f2);
        }
        if (this.f58569i == null || this.f58570j == null) {
            arrayList.clear();
            return;
        }
        C21319z d = this.f58578d.mo26734d();
        C68044ag agVar = new C68044ag();
        int a = zVar.mo16913a(8);
        C68044ag agVar2 = null;
        if (a != 0) {
            int i = a + zVar.f24703a;
            agVar.mo16917e(i + zVar.f24704b.getInt(i), zVar.f24704b);
        } else {
            agVar = null;
        }
        this.f58567g = tVar2.mo26863g(agVar, d);
        C68044ag agVar3 = new C68044ag();
        int a2 = zVar.mo16913a(10);
        if (a2 != 0) {
            int i2 = a2 + zVar.f24703a;
            agVar3.mo16917e(i2 + zVar.f24704b.getInt(i2), zVar.f24704b);
        } else {
            agVar3 = null;
        }
        this.f58568h = tVar2.mo26863g(agVar3, d);
        C68044ag agVar4 = new C68044ag();
        int a3 = zVar.mo16913a(12);
        if (a3 != 0) {
            int i3 = a3 + zVar.f24703a;
            agVar4.mo16917e(i3 + zVar.f24704b.getInt(i3), zVar.f24704b);
            agVar2 = agVar4;
        }
        this.f58564b = tVar2.mo26863g(agVar2, d);
        int a4 = zVar.mo16913a(14);
        this.f58571k = Math.max(a4 != 0 ? ((long) zVar.f24704b.getInt(a4 + zVar.f24703a)) & 4294967295L : 0, 0);
    }

    public final Status criteriaMatched(ArrayList arrayList) {
        C21357r rVar;
        if (arrayList.isEmpty()) {
            return Status.f186906d;
        }
        C21311r a = mo26019a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i);
            if (C58832aw.m90831a(intersectionCriteria, this.f58569i)) {
                if (!this.f58572l) {
                    this.f58572l = true;
                    C21357r rVar2 = this.f58567g;
                    if (rVar2 != null) {
                        C69794a a2 = this.f58563a.mo26124a(rVar2.mo26862a(), a);
                        C70128t tVar = C70111i.f186862c;
                        C69822d dVar = C70101a.f186841i;
                        a2.mo61451i(tVar).mo61453k();
                    }
                    if (this.f58564b != null) {
                        long j = this.f58571k;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        C70128t tVar2 = C70111i.f186861b;
                        C69822d dVar2 = C70101a.f186839g;
                        C69841j.m101337b(timeUnit, "unit is null");
                        C69841j.m101337b(tVar2, "scheduler is null");
                        C69969bw bwVar = new C69969bw(Math.max(j, 0), timeUnit, tVar2);
                        C69822d dVar3 = C70101a.f186843k;
                        C69803b n = bwVar.mo61654n(new C20882d(this, a));
                        this.f58573m = n;
                        C69826b l = this.f58578d.mo26734d().mo26811l();
                        if (l != null) {
                            l.mo61462b(n);
                        }
                    }
                }
            } else if (C58832aw.m90831a(intersectionCriteria, this.f58570j)) {
                C69803b bVar = this.f58573m;
                if (bVar != null) {
                    C69828d.m101309f((AtomicReference) bVar);
                }
                if (this.f58572l && !this.f58565c && (rVar = this.f58568h) != null) {
                    this.f58563a.mo26124a(rVar.mo26862a(), a).mo61453k();
                }
                this.f58572l = false;
                this.f58565c = false;
            }
        }
        return Status.f186902OK;
    }

    public final ArrayList getCriteriaList() {
        return this.f58566f;
    }

    public final String getGroupId() {
        return BuildConfig.FLAVOR;
    }
}
