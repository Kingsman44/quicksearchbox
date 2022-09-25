package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.elements.p1696a.C20398w;
import com.google.android.libraries.componentview.components.elements.p1696a.C20399x;
import com.google.android.libraries.componentview.components.elements.views.C20465f;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.elements.bk */
/* compiled from: PG */
public class C20437bk extends C20078ci {

    /* renamed from: a */
    private C20399x f57464a;

    public C20437bk(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new C20465f(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20399x.f57375e);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20399x xVar = (C20399x) obj;
        this.f57464a = xVar;
        if ((xVar.f57377a & 1) != 0) {
            C19916aq aqVar = xVar.f57379c;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
        if (this.f57464a.f57378b.size() > 0) {
            mo25256A(this.f57464a.f57378b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        if (list != null) {
            C20398w wVar = (C20398w) this.f57464a.toBuilder();
            wVar.copyOnWrite();
            ((C20399x) wVar.instance).f57378b = C20399x.emptyProtobufList();
            wVar.copyOnWrite();
            C20399x xVar = (C20399x) wVar.instance;
            C62971cq cqVar = xVar.f57378b;
            if (!cqVar.mo58948c()) {
                xVar.f57378b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) xVar.f57378b);
            this.f57464a = (C20399x) wVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20399x.f57375e, this.f57464a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }
}
