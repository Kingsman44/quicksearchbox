package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import androidx.p180o.p181a.C3908b;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19957cd;
import com.google.android.libraries.componentview.components.base.p1687a.C19958ce;
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

/* renamed from: com.google.android.libraries.componentview.components.base.bb */
/* compiled from: PG */
public class C20044bb extends C20078ci {

    /* renamed from: a */
    private C19958ce f56199a;

    public C20044bb(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new C3908b(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19958ce.f55877f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19958ce ceVar = (C19958ce) obj;
        this.f56199a = ceVar;
        if (!ceVar.f55882d) {
            ((C3908b) this.f56305p).setClipChildren(false);
            ((C3908b) this.f56305p).setClipToPadding(false);
        }
        if (this.f56199a.f55880b.size() != 0) {
            mo25256A(this.f56199a.f55880b);
        }
        C19958ce ceVar2 = this.f56199a;
        if ((ceVar2.f55879a & 1) != 0) {
            C19916aq aqVar = ceVar2.f55881c;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        if (list != null) {
            C19957cd cdVar = (C19957cd) this.f56199a.toBuilder();
            cdVar.copyOnWrite();
            ((C19958ce) cdVar.instance).f55880b = C19958ce.emptyProtobufList();
            cdVar.copyOnWrite();
            C19958ce ceVar = (C19958ce) cdVar.instance;
            C62971cq cqVar = ceVar.f55880b;
            if (!cqVar.mo58948c()) {
                ceVar.f55880b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) ceVar.f55880b);
            this.f56199a = (C19958ce) cdVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19958ce.f55877f, this.f56199a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }
}
