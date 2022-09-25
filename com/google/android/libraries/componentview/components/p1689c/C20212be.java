package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import com.google.android.libraries.componentview.components.elements.C20453p;
import com.google.android.libraries.componentview.components.elements.p1696a.C20379d;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20122as;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20123at;
import com.google.android.libraries.componentview.components.p1693e.C20354b;
import com.google.android.libraries.componentview.components.p1693e.p1694a.C20349b;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.c.be */
/* compiled from: PG */
public class C20212be extends C20453p {

    /* renamed from: a */
    private final C20601ca f56749a;

    /* renamed from: b */
    private C20123at f56750b;

    /* renamed from: c */
    private List f56751c;

    /* renamed from: g */
    private boolean f56752g;

    /* renamed from: h */
    private long f56753h;

    /* renamed from: i */
    private boolean f56754i;

    /* renamed from: j */
    private final C20610cj f56755j;

    public C20212be(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20610cj cjVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f56749a = caVar;
        this.f56755j = cjVar;
    }

    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20123at.f56401h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20123at atVar = (C20123at) obj;
        this.f56750b = atVar;
        this.f56752g = atVar.f56407e;
        this.f56753h = (long) atVar.f56408f;
        if (atVar.f56406d.size() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f56750b.f56406d);
            C20123at atVar2 = this.f56750b;
            if ((atVar2.f56403a & 2) != 0) {
                C20349b bVar = atVar2.f56405c;
                if (bVar == null) {
                    bVar = C20349b.f57198g;
                }
                C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
                cVar.copyOnWrite();
                C56425d dVar2 = (C56425d) cVar.instance;
                dVar2.f150539a |= 1;
                dVar2.f150540b = "android-fab-footer";
                cVar.mo58885m(C20349b.f57199h, bVar);
                arrayList.add((C56425d) cVar.build());
                this.f56754i = true;
            }
            mo25256A(arrayList);
            List list = this.f56324d;
            C20470a aVar = (C20470a) list.get(list.size() - 1);
            if (!(aVar instanceof C20354b) && !(aVar instanceof C20262da)) {
                C20520h.m38497b(5, "ExpandableCardComponent", new IllegalStateException(), "Did not find footer at end of card.", new Object[0]);
            }
        }
        C20123at atVar3 = this.f56750b;
        if ((1 & atVar3.f56403a) != 0) {
            C20379d dVar3 = atVar3.f56404b;
            if (dVar3 == null) {
                dVar3 = C20379d.f57299c;
            }
            super.mo25401D(dVar3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        C20218bk bkVar = (C20218bk) this.f56307r;
        C20122as asVar = (C20122as) this.f56750b.toBuilder();
        if (bkVar != null) {
            boolean z = bkVar.f56778d;
            asVar.copyOnWrite();
            C20123at atVar = (C20123at) asVar.instance;
            atVar.f56403a |= 4;
            atVar.f56407e = z;
        }
        if (list != null) {
            if (this.f56754i) {
                list = list.subList(0, list.size() - 1);
            }
            asVar.copyOnWrite();
            ((C20123at) asVar.instance).f56406d = C20123at.emptyProtobufList();
            asVar.copyOnWrite();
            C20123at atVar2 = (C20123at) asVar.instance;
            C62971cq cqVar = atVar2.f56406d;
            if (!cqVar.mo58948c()) {
                atVar2.f56406d = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) atVar2.f56406d);
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20123at.f56401h, (C20123at) asVar.build());
        return (C56425d) cVar.build();
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        if (i != 1) {
            return false;
        }
        C20218bk bkVar = (C20218bk) this.f56307r;
        if (bkVar != null) {
            bkVar.mo25300f(this.f56305p, this.f56753h);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C20476g mo25238r() {
        C20601ca caVar = this.f56749a;
        C56429h hVar = this.f57588z.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        C56429h hVar2 = hVar;
        if (this.f56751c == null) {
            this.f56751c = new ArrayList();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(mo25422K(C20223bp.class));
            arrayList.addAll(mo25422K(C20354b.class));
            arrayList.addAll(mo25422K(C20262da.class));
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C20220bm bmVar = (C20220bm) ((C20470a) arrayList.get(i)).mo25200ky();
                if (bmVar != null) {
                    this.f56751c.add(bmVar);
                }
            }
        }
        return new C20215bh(caVar, hVar2, this.f56751c, this.f56752g, this.f56755j, mo25097c());
    }
}
