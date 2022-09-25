package com.google.android.libraries.componentview.components.p1689c;

import com.google.android.libraries.componentview.components.base.C20030b;
import com.google.android.libraries.componentview.components.base.p1687a.C19931be;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20124au;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20126aw;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20127ax;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20527a;
import com.google.android.libraries.componentview.services.p1701a.C20536e;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.components.c.bp */
/* compiled from: PG */
public class C20223bp extends C20030b {

    /* renamed from: d */
    public final Executor f56787d;

    /* renamed from: e */
    public C20127ax f56788e;

    /* renamed from: f */
    public C56425d f56789f;

    /* renamed from: g */
    public boolean f56790g = false;

    /* renamed from: h */
    public C20536e f56791h;

    /* renamed from: i */
    boolean f56792i = false;

    /* renamed from: j */
    private final ExecutorService f56793j;

    public C20223bp(C56425d dVar, C20537f fVar, C20601ca caVar, Executor executor, ExecutorService executorService) {
        super(dVar, fVar, caVar);
        this.f56787d = executor;
        this.f56793j = executorService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null && this.f56790g) {
            C20124au auVar = (C20124au) this.f56788e.toBuilder();
            auVar.copyOnWrite();
            C20127ax axVar = (C20127ax) auVar.instance;
            axVar.f56416c = dVar;
            axVar.f56414a |= 2;
            this.f56788e = (C20127ax) auVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20127ax.f56412f, this.f56788e);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C20476g mo25199i() {
        int a = C20126aw.m37977a(this.f56788e.f56415b);
        if (a == 0) {
            a = 1;
        }
        return new C20226bs(this, a);
    }

    /* renamed from: kD */
    public final void mo25181kD(float f, float f2, float f3, float f4) {
        if (this.f56790g) {
            super.mo25181kD(f, f2, f3, f4);
        } else {
            this.f56791h = new C20527a(f, f2, f3, f4);
        }
    }

    /* renamed from: kx */
    public final void mo25108kx() {
        C20470a aVar;
        if (this.f56790g && (aVar = this.f57601m) != null) {
            mo25301o(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C56425d mo25201l() {
        return this.f56789f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo25203n(C56425d dVar) {
        Object obj;
        int a;
        C62940bt r0 = C62942bv.checkIsLite(C20127ax.f56412f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20127ax axVar = (C20127ax) obj;
        this.f56788e = axVar;
        if (!axVar.f56417d || (axVar.f56414a & 2) == 0 || (a = C20126aw.m37977a(axVar.f56415b)) == 0 || a != 2) {
            this.f56790g = true;
            C56425d dVar2 = axVar.f56416c;
            if (dVar2 == null) {
                dVar2 = C56425d.f150537g;
            }
            this.f56789f = dVar2;
            return;
        }
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.copyOnWrite();
        C56425d dVar3 = (C56425d) cVar.instance;
        dVar3.f150539a = 1 | dVar3.f150539a;
        dVar3.f150540b = "android-frame-layout";
        cVar.mo58885m(C19931be.f55773g, C19931be.f55772f);
        this.f56789f = (C56425d) cVar.build();
    }

    /* renamed from: o */
    public final void mo25301o(C20470a aVar) {
        if (!this.f56792i) {
            this.f56792i = true;
            this.f56793j.execute(new C20221bn(this, this.f56152a, C19742a.IMAGE_LOADING_ERROR, aVar));
        }
    }
}
