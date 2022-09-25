package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20169o;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20170p;
import com.google.android.libraries.componentview.p1697d.C20479j;
import com.google.android.libraries.componentview.p1699f.C20524l;
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

/* renamed from: com.google.android.libraries.componentview.components.c.p */
/* compiled from: PG */
public class C20314p extends C20318t implements C20479j {

    /* renamed from: a */
    public C20170p f57087a;

    /* renamed from: b */
    public CheckBox f57088b;

    public C20314p(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20524l lVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, lVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        CheckBox checkBox = new CheckBox(context);
        this.f57088b = checkBox;
        this.f57106g = checkBox;
        return super.mo25358m(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20170p.f56583j);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20170p pVar = (C20170p) obj;
        this.f57087a = pVar;
        if (pVar.f56586b.size() != 0) {
            mo25256A(this.f57087a.f56586b);
        }
        C20170p pVar2 = this.f57087a;
        boolean z = pVar2.f56588d;
        C19983f fVar = pVar2.f56589e;
        if (fVar == null) {
            fVar = C19983f.f56002g;
        }
        C20170p pVar3 = this.f57087a;
        C19983f fVar2 = pVar3.f56590f;
        if (fVar2 == null) {
            fVar2 = C19983f.f56002g;
        }
        mo25357D(z, fVar, fVar2, pVar3.f56592h);
        C20170p pVar4 = this.f57087a;
        if ((pVar4.f56585a & 1) != 0) {
            C19916aq aqVar = pVar4.f56587c;
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
            C20169o oVar = (C20169o) this.f57087a.toBuilder();
            oVar.copyOnWrite();
            ((C20170p) oVar.instance).f56586b = C20170p.emptyProtobufList();
            oVar.copyOnWrite();
            C20170p pVar = (C20170p) oVar.instance;
            C62971cq cqVar = pVar.f56586b;
            if (!cqVar.mo58948c()) {
                pVar.f56586b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) pVar.f56586b);
            boolean isChecked = this.f57088b.isChecked();
            oVar.copyOnWrite();
            C20170p pVar2 = (C20170p) oVar.instance;
            pVar2.f56585a |= 2;
            pVar2.f56588d = isChecked;
            this.f57087a = (C20170p) oVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20170p.f56583j, this.f57087a);
        return (C56425d) cVar.build();
    }

    /* renamed from: j */
    public final boolean mo25121j() {
        return this.f57088b.isChecked();
    }

    /* renamed from: kI */
    public final boolean mo25122kI() {
        return false;
    }
}
