package com.google.android.libraries.componentview.components.base;

import android.view.View;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.base.b */
/* compiled from: PG */
public abstract class C20030b extends C20483n {

    /* renamed from: a */
    public final C20601ca f56152a;

    /* renamed from: b */
    public final C20537f f56153b;

    /* renamed from: c */
    protected C20476g f56154c;

    public C20030b(C56425d dVar, C20537f fVar, C20601ca caVar) {
        super(dVar);
        this.f56152a = caVar;
        this.f56153b = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C20476g mo25199i();

    /* renamed from: kx */
    public void mo25108kx() {
    }

    /* renamed from: ky */
    public final C20476g mo25200ky() {
        return this.f56154c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C56425d mo25201l();

    /* renamed from: m */
    public void mo25202m() {
        C20470a aVar;
        View kH;
        mo25203n(this.f57588z);
        C56425d l = mo25201l();
        if (l != null) {
            this.f57601m = this.f56153b.mo25450a(this, l);
            C56425d dVar = this.f57588z;
            if ((dVar.f150539a & 4) != 0) {
                C56429h hVar = dVar.f150542d;
                if (hVar == null) {
                    hVar = C56429h.f150547k;
                }
                if (!((hVar.f150549a & 1) == 0 || (aVar = this.f57601m) == null || (kH = aVar.mo25098kH()) == null)) {
                    C56429h hVar2 = this.f57588z.f150542d;
                    if (hVar2 == null) {
                        hVar2 = C56429h.f150547k;
                    }
                    C60214n nVar = hVar2.f150550b;
                    if (nVar == null) {
                        nVar = C60214n.f162914g;
                    }
                    C20482m.m38441i(kH, nVar.f162918c);
                }
            }
        } else {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.INVALID_CHILD);
            eVar.f57825e = "Child component was null";
            C20520h.m38498c("AbstractControllerCompo", eVar.mo25531a(), this.f56152a, new Object[0]);
        }
        this.f56154c = mo25199i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo25203n(C56425d dVar);
}
