package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.Switch;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20139bi;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20140bj;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20550ad;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20589bp;
import com.google.android.libraries.componentview.services.application.C20592bs;
import com.google.android.libraries.componentview.services.application.C20593bt;
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

/* renamed from: com.google.android.libraries.componentview.components.c.dq */
/* compiled from: PG */
public class C20278dq extends C20318t implements C20589bp {

    /* renamed from: a */
    private C20140bj f56917a;

    /* renamed from: b */
    private Switch f56918b;

    /* renamed from: h */
    private final C20550ad f56919h;

    public C20278dq(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20524l lVar, C20550ad adVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, lVar, atVar);
        this.f56919h = adVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        Switch switchR = new Switch(context);
        this.f56918b = switchR;
        this.f57106g = switchR;
        return super.mo25358m(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20140bj.f56474i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20140bj bjVar = (C20140bj) obj;
        this.f56917a = bjVar;
        if (bjVar.f56477b.size() != 0) {
            mo25256A(this.f56917a.f56477b);
        }
        C20140bj bjVar2 = this.f56917a;
        boolean z = bjVar2.f56479d;
        C19983f fVar = bjVar2.f56480e;
        if (fVar == null) {
            fVar = C19983f.f56002g;
        }
        C20140bj bjVar3 = this.f56917a;
        C19983f fVar2 = bjVar3.f56481f;
        if (fVar2 == null) {
            fVar2 = C19983f.f56002g;
        }
        mo25357D(z, fVar, fVar2, bjVar3.f56482g);
        C20140bj bjVar4 = this.f56917a;
        if ((bjVar4.f56476a & 1) != 0) {
            C19916aq aqVar = bjVar4.f56478c;
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
            C20139bi biVar = (C20139bi) this.f56917a.toBuilder();
            biVar.copyOnWrite();
            ((C20140bj) biVar.instance).f56477b = C20140bj.emptyProtobufList();
            biVar.copyOnWrite();
            C20140bj bjVar = (C20140bj) biVar.instance;
            C62971cq cqVar = bjVar.f56477b;
            if (!cqVar.mo58948c()) {
                bjVar.f56477b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) bjVar.f56477b);
            boolean isChecked = this.f56918b.isChecked();
            biVar.copyOnWrite();
            C20140bj bjVar2 = (C20140bj) biVar.instance;
            bjVar2.f56476a |= 2;
            bjVar2.f56479d = isChecked;
            this.f56917a = (C20140bj) biVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20140bj.f56474i, this.f56917a);
        return (C56425d) cVar.build();
    }

    /* renamed from: k */
    public final void mo25117k(C20593bt btVar) {
        C20592bs a = C20592bs.m38633a(btVar.f57799b);
        if (a == null) {
            a = C20592bs.UNKNOWN;
        }
        if (a.equals(C20592bs.ON)) {
            this.f56918b.setChecked(true);
        } else if (a.equals(C20592bs.OFF)) {
            this.f56918b.setChecked(false);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        if (mo25097c() != null) {
            C20550ad adVar = this.f56919h;
            String c = mo25097c();
            c.getClass();
            adVar.mo25483a(c, this);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (mo25097c() != null) {
            C20550ad adVar = this.f56919h;
            String c = mo25097c();
            c.getClass();
            adVar.mo25484b(c, this);
        }
    }
}
