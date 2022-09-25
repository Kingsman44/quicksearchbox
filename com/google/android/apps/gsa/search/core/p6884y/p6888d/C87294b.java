package com.google.android.apps.gsa.search.core.p6884y.p6888d;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88019md;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88020me;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88036mu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88037mv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.y.d.b */
/* compiled from: PG */
public final class C87294b {

    /* renamed from: a */
    public boolean f235756a;

    /* renamed from: b */
    private final List f235757b = new ArrayList();

    /* renamed from: c */
    private final List f235758c = new ArrayList();

    /* renamed from: d */
    private final C87295c f235759d;

    /* renamed from: e */
    private final C22871g f235760e;

    /* renamed from: f */
    private final int f235761f;

    /* renamed from: g */
    private boolean f235762g;

    public C87294b(C87295c cVar, C22871g gVar, int i) {
        this.f235759d = cVar;
        this.f235760e = gVar;
        this.f235761f = i;
    }

    /* renamed from: a */
    public final void mo80939a(C88036mu muVar, C58833ax axVar) {
        this.f235757b.add(muVar);
        this.f235758c.add(axVar);
        if (!this.f235756a && !this.f235762g) {
            this.f235760e.mo28212l("Flush Monet service updates", new C87293a(this));
            this.f235756a = true;
        }
    }

    /* renamed from: b */
    public final void mo80940b() {
        if (!this.f235757b.isEmpty()) {
            this.f235757b.size();
            C87295c cVar = this.f235759d;
            C58485gu j = C58485gu.m89842j(this.f235757b);
            C58485gu j2 = C58485gu.m89842j(this.f235758c);
            int i = this.f235761f;
            C88020me meVar = (C88020me) C88037mv.f238062e.createBuilder();
            String str = cVar.f235763a;
            meVar.copyOnWrite();
            C88037mv mvVar = (C88037mv) meVar.instance;
            str.getClass();
            mvVar.f238064a |= 1;
            mvVar.f238065b = str;
            meVar.copyOnWrite();
            C88037mv mvVar2 = (C88037mv) meVar.instance;
            mvVar2.f238064a |= 2;
            mvVar2.f238066c = i;
            meVar.copyOnWrite();
            C88037mv mvVar3 = (C88037mv) meVar.instance;
            C62971cq cqVar = mvVar3.f238067d;
            if (!cqVar.mo58948c()) {
                mvVar3.f238067d = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) j, (List) mvVar3.f238067d);
            C88037mv mvVar4 = (C88037mv) meVar.build();
            Bundle bundle = new Bundle();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                C58833ax axVar = (C58833ax) j2.get(i2);
                if (axVar.mo56113h()) {
                    bundle.putParcelable(String.valueOf(i2), (Parcelable) axVar.mo56107c());
                }
            }
            C87684al alVar = new C87684al(C88244um.MONET_SERVICE_EVENT);
            alVar.mo81965b(C88019md.f238024a, mvVar4);
            alVar.mo81966c(bundle);
            ((C86771n) cVar.f235764b).mo80379b(alVar.mo81964a());
            this.f235757b.clear();
            this.f235758c.clear();
        }
    }

    /* renamed from: c */
    public final void mo80941c(Runnable runnable) {
        boolean z = !this.f235762g;
        if (z) {
            this.f235762g = true;
        }
        try {
            runnable.run();
            if (z) {
                mo80940b();
                this.f235762g = false;
            }
        } catch (Throwable th) {
            if (z) {
                mo80940b();
                this.f235762g = false;
            }
            throw th;
        }
    }
}
