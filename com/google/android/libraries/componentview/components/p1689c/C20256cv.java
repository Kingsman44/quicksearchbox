package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20131ba;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20132bb;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20476g;
import com.google.android.libraries.componentview.p1697d.C20477h;
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

/* renamed from: com.google.android.libraries.componentview.components.c.cv */
/* compiled from: PG */
public class C20256cv extends C20078ci {

    /* renamed from: a */
    private final C20601ca f56832a;

    /* renamed from: b */
    private C20132bb f56833b;

    /* renamed from: c */
    private List f56834c;

    /* renamed from: g */
    private boolean f56835g;

    /* renamed from: h */
    private long f56836h;

    /* renamed from: i */
    private final C20610cj f56837i;

    public C20256cv(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20610cj cjVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f56832a = caVar;
        this.f56837i = cjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20132bb.f56437g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20132bb bbVar = (C20132bb) obj;
        this.f56833b = bbVar;
        this.f56835g = bbVar.f56441c;
        this.f56836h = (long) bbVar.f56442d;
        if (bbVar.f56440b.size() != 0) {
            mo25256A(this.f56833b.f56440b);
        }
        C20132bb bbVar2 = this.f56833b;
        if ((bbVar2.f56439a & 4) != 0) {
            C19916aq aqVar = bbVar2.f56443e;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        C20218bk bkVar = (C20218bk) this.f56307r;
        C20131ba baVar = (C20131ba) this.f56833b.toBuilder();
        if (bkVar != null) {
            boolean z = bkVar.f56778d;
            baVar.copyOnWrite();
            C20132bb bbVar = (C20132bb) baVar.instance;
            bbVar.f56439a |= 1;
            bbVar.f56441c = z;
        }
        if (list != null) {
            baVar.copyOnWrite();
            ((C20132bb) baVar.instance).f56440b = C20132bb.emptyProtobufList();
            baVar.copyOnWrite();
            C20132bb bbVar2 = (C20132bb) baVar.instance;
            C62971cq cqVar = bbVar2.f56440b;
            if (!cqVar.mo58948c()) {
                bbVar2.f56440b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) bbVar2.f56440b);
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20132bb.f56437g, (C20132bb) baVar.build());
        return (C56425d) cVar.build();
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        if (i != 1) {
            return false;
        }
        C20218bk bkVar = (C20218bk) this.f56307r;
        if (bkVar != null) {
            bkVar.mo25300f(this.f56305p, this.f56836h);
        }
        return true;
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C20476g mo25238r() {
        C20601ca caVar = this.f56832a;
        C56429h hVar = this.f57588z.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        C56429h hVar2 = hVar;
        if (this.f56834c == null) {
            this.f56834c = new ArrayList();
            for (C20470a ky : this.f56324d) {
                C20476g ky2 = ky.mo25200ky();
                if (ky2 != null && (ky2 instanceof C20220bm)) {
                    this.f56834c.add((C20220bm) ky2);
                }
            }
        }
        return new C20259cy(caVar, hVar2, this.f56834c, this.f56835g, this.f56837i, mo25097c());
    }
}
