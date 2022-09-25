package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6278fu;
import com.facebook.litho.p329g.C6336o;
import com.facebook.litho.p329g.C6337p;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21308o;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.DataSourceListener;
import com.google.protos.youtube.elements.C66260r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.ba */
/* compiled from: PG */
final class C20817ba extends DataSourceListener {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f58294a;

    /* renamed from: b */
    final /* synthetic */ AtomicBoolean f58295b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f58296c;

    /* renamed from: d */
    final /* synthetic */ C21308o f58297d;

    /* renamed from: e */
    final /* synthetic */ C21259bb f58298e;

    /* renamed from: f */
    final /* synthetic */ C21319z f58299f;

    public C20817ba(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicReference atomicReference, C21308o oVar, C21259bb bbVar, C21319z zVar) {
        this.f58294a = atomicBoolean;
        this.f58295b = atomicBoolean2;
        this.f58296c = atomicReference;
        this.f58297d = oVar;
        this.f58298e = bbVar;
        this.f58299f = zVar;
    }

    public final Status onDataChanged() {
        this.f58294a.set(false);
        if (this.f58295b.compareAndSet(true, false)) {
            C6337p.m17002m((C6336o) this.f58296c.get(), 3);
        }
        C6336o oVar = (C6336o) this.f58296c.get();
        C21308o oVar2 = this.f58297d;
        int i = C20812ay.f58277u;
        if (oVar.mo13351n() != null) {
            oVar.mo13349g(new C6278fu(0, oVar2), "updateState:DataDrivenCollectionSection.onDataChangedStateUpdate");
        }
        return Status.f186902OK;
    }

    public final Status onError(Status status) {
        this.f58294a.set(false);
        if (this.f58295b.compareAndSet(true, false)) {
            status.asException();
            C6337p.m17002m((C6336o) this.f58296c.get(), 4);
        }
        this.f58298e.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "Error loading data from CollectionDataSource", this.f58299f, status.asException());
        return Status.f186902OK;
    }
}
