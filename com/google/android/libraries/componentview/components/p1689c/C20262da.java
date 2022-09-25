package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import com.google.android.libraries.componentview.components.base.C20030b;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20133bc;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20134bd;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.componentview.components.c.da */
/* compiled from: PG */
public class C20262da extends C20030b {

    /* renamed from: d */
    private C20134bd f56861d;

    /* renamed from: e */
    private final C20601ca f56862e;

    /* renamed from: f */
    private boolean f56863f;

    /* renamed from: g */
    private final C20610cj f56864g;

    public C20262da(C56425d dVar, C20537f fVar, C20601ca caVar, C20610cj cjVar) {
        super(dVar, fVar, caVar);
        this.f56862e = caVar;
        this.f56864g = cjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20133bc bcVar = (C20133bc) this.f56861d.toBuilder();
            bcVar.copyOnWrite();
            C20134bd bdVar = (C20134bd) bcVar.instance;
            bdVar.f56449b = dVar;
            bdVar.f56448a |= 1;
            this.f56861d = (C20134bd) bcVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20134bd.f56446g, this.f56861d);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C20476g mo25199i() {
        ArrayList arrayList = new ArrayList();
        C58485gu K = mo25422K(C20273dl.class);
        int size = K.size();
        for (int i = 0; i < size; i++) {
            C20476g gVar = ((C20273dl) K.get(i)).f56307r;
            if (gVar instanceof C20220bm) {
                arrayList.add((C20220bm) gVar);
            }
        }
        C20601ca caVar = this.f56862e;
        C56429h hVar = this.f57588z.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        C56429h hVar2 = hVar;
        boolean z = this.f56863f;
        C20610cj cjVar = this.f56864g;
        String c = mo25097c();
        C20134bd bdVar = this.f56861d;
        return new C20265dd(arrayList, caVar, hVar2, z, cjVar, c, bdVar.f56451d, bdVar.f56452e, mo25098kH());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C56425d mo25201l() {
        C56425d dVar = this.f56861d.f56449b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* renamed from: m */
    public final void mo25202m() {
        String str;
        super.mo25202m();
        C20260cz czVar = new C20260cz(this);
        View kH = mo25098kH();
        if (kH != null) {
            kH.setOnClickListener(czVar);
        }
        View kH2 = mo25098kH();
        if (kH2 != null) {
            if (this.f56863f) {
                str = this.f56861d.f56452e;
            } else {
                str = this.f56861d.f56451d;
            }
            kH2.setContentDescription(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo25203n(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20134bd.f56446g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20134bd bdVar = (C20134bd) obj;
        this.f56861d = bdVar;
        this.f56863f = bdVar.f56450c;
    }
}
