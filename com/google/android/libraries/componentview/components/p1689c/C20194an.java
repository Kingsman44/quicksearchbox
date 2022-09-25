package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20106ac;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20107ad;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20576bc;
import com.google.android.libraries.componentview.services.application.C20584bk;
import com.google.android.libraries.componentview.services.application.C20585bl;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56426e;
import com.google.p4271bq.C56428g;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.c.an */
/* compiled from: PG */
public class C20194an extends C19898a {

    /* renamed from: a */
    public final C20576bc f56675a;

    /* renamed from: b */
    public C20107ad f56676b;

    /* renamed from: c */
    private final C20601ca f56677c;

    /* renamed from: d */
    private int f56678d;

    public C20194an(C56425d dVar, Context context, C20537f fVar, C20576bc bcVar, C20601ca caVar, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
        this.f56675a = bcVar;
        this.f56677c = caVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        C20107ad adVar = this.f56676b;
        if ((adVar.f56352a & 8) == 0) {
            return null;
        }
        C19926b bVar = adVar.f56355d;
        return bVar == null ? C19926b.f55754e : bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C56425d dVar = this.f56676b.f56353b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        C20107ad adVar = this.f56676b;
        if ((adVar.f56352a & 2) != 0) {
            C56425d dVar2 = adVar.f56354c;
            if (dVar2 == null) {
                dVar2 = C56425d.f150537g;
            }
            if ((dVar2.f150539a & 4) != 0) {
                C20106ac acVar = (C20106ac) this.f56676b.toBuilder();
                C56425d dVar3 = this.f56676b.f56354c;
                if (dVar3 == null) {
                    dVar3 = C56425d.f150537g;
                }
                C56424c cVar = (C56424c) dVar3.toBuilder();
                C56425d dVar4 = this.f56676b.f56354c;
                if (dVar4 == null) {
                    dVar4 = C56425d.f150537g;
                }
                C56429h hVar = dVar4.f150542d;
                if (hVar == null) {
                    hVar = C56429h.f150547k;
                }
                C56426e eVar = (C56426e) hVar.toBuilder();
                int i = this.f56678d;
                eVar.copyOnWrite();
                C56429h hVar2 = (C56429h) eVar.instance;
                int i2 = i - 1;
                if (i != 0) {
                    hVar2.f150552d = i2;
                    hVar2.f150549a |= 4;
                    cVar.copyOnWrite();
                    C56425d dVar5 = (C56425d) cVar.instance;
                    C56429h hVar3 = (C56429h) eVar.build();
                    hVar3.getClass();
                    dVar5.f150542d = hVar3;
                    dVar5.f150539a |= 4;
                    acVar.copyOnWrite();
                    C20107ad adVar2 = (C20107ad) acVar.instance;
                    C56425d dVar6 = (C56425d) cVar.build();
                    dVar6.getClass();
                    adVar2.f56354c = dVar6;
                    adVar2.f56352a |= 2;
                    if (dVar != null) {
                        acVar.copyOnWrite();
                        C20107ad adVar3 = (C20107ad) acVar.instance;
                        adVar3.f56353b = dVar;
                        adVar3.f56352a |= 1;
                    }
                    this.f56676b = (C20107ad) acVar.build();
                } else {
                    throw null;
                }
            }
        }
        C56424c cVar2 = (C56424c) this.f57588z.toBuilder();
        cVar2.mo58885m(C20107ad.f56350f, this.f56676b);
        return (C56425d) cVar2.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20107ad.f56350f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20107ad adVar = (C20107ad) obj;
        this.f56676b = adVar;
        if ((adVar.f56352a & 2) != 0) {
            C56425d dVar2 = adVar.f56354c;
            if (((dVar2 == null ? C56425d.f150537g : dVar2).f150539a & 4) != 0) {
                if (dVar2 == null) {
                    dVar2 = C56425d.f150537g;
                }
                C56429h hVar = dVar2.f150542d;
                if (hVar == null) {
                    hVar = C56429h.f150547k;
                }
                int a = C56428g.m87988a(hVar.f150552d);
                if (a == 0) {
                    a = 1;
                }
                this.f56678d = a;
            }
        }
    }

    /* renamed from: m */
    public final void mo25285m(String str, int i) {
        C56425d dVar = this.f56676b.f56354c;
        if (dVar == null) {
            dVar = C56425d.f150537g;
        }
        if ((dVar.f150539a & 4) != 0) {
            C56425d dVar2 = this.f56676b.f56354c;
            if (dVar2 == null) {
                dVar2 = C56425d.f150537g;
            }
            C56429h hVar = dVar2.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
            this.f56677c.mo25489d(str, C20585bl.m38625b(new C20585bl(hVar, i == 1 ? C20584bk.SHOW : C20584bk.HIDE)), hVar.f150557i, (Map) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        if ((this.f56676b.f56352a & 2) != 0) {
            view.setOnClickListener(new C20192al(this));
            return;
        }
        C20598by G = mo25418G();
        G.mo25535e(C19742a.NULL_CONTENT);
        G.mo25536f("Unable to launch dialog because dialogContent is null");
        C20520h.m38498c("DialogComponent", G.mo25531a(), this.f56677c, new Object[0]);
    }
}
