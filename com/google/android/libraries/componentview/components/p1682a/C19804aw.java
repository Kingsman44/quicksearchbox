package com.google.android.libraries.componentview.components.p1682a;

import android.view.View;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19778w;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19779x;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1697d.C20479j;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58495hd;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;

/* renamed from: com.google.android.libraries.componentview.components.a.aw */
/* compiled from: PG */
public class C19804aw extends C20483n implements C20479j {

    /* renamed from: a */
    public C19779x f55347a;

    /* renamed from: b */
    public final C20537f f55348b;

    /* renamed from: c */
    public boolean f55349c;

    /* renamed from: d */
    private final C20610cj f55350d;

    public C19804aw(C56425d dVar, C20537f fVar, C20610cj cjVar) {
        super(dVar);
        this.f55348b = fVar;
        this.f55350d = cjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C19778w wVar = (C19778w) this.f55347a.toBuilder();
            wVar.copyOnWrite();
            C19779x xVar = (C19779x) wVar.instance;
            xVar.f55270b = dVar;
            xVar.f55269a |= 1;
            boolean z = this.f55349c;
            wVar.copyOnWrite();
            C19779x xVar2 = (C19779x) wVar.instance;
            xVar2.f55269a |= 2;
            xVar2.f55271c = z;
            this.f55347a = (C19779x) wVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19779x.f55267g, this.f55347a);
        return (C56425d) cVar.build();
    }

    /* renamed from: j */
    public final boolean mo25121j() {
        return this.f55349c;
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        if (i != 4) {
            return false;
        }
        this.f55349c = !this.f55349c;
        if (!this.f55347a.f55272d) {
            View kH = mo25098kH();
            if (kH != null) {
                kH.setClickable(false);
            }
            mo25421J(5, (C20477h) null);
            String c = mo25097c();
            if (c != null) {
                this.f55350d.mo25491a("CardStateChanged", C58495hd.m89900n("CardId", c));
            }
        }
        return true;
    }

    /* renamed from: kI */
    public final boolean mo25122kI() {
        return this.f55347a.f55273e;
    }

    /* renamed from: kx */
    public final void mo25108kx() {
    }
}
