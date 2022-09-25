package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19920au;
import com.google.android.libraries.componentview.components.base.p1687a.C19948bv;
import com.google.android.libraries.componentview.components.base.p1687a.C19950bx;
import com.google.android.libraries.componentview.components.base.p1687a.C19951by;
import com.google.android.libraries.componentview.p1697d.C20482m;
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

/* renamed from: com.google.android.libraries.componentview.components.base.ar */
/* compiled from: PG */
public class C20021ar extends C20078ci {

    /* renamed from: a */
    private C19951by f56122a;

    public C20021ar(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19951by.f55842i);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19951by byVar = (C19951by) obj;
        this.f56122a = byVar;
        int i = 1;
        if (byVar.f55846c) {
            ((LinearLayout) this.f56305p).setOrientation(1);
        }
        if (!this.f56122a.f55849f) {
            ((LinearLayout) this.f56305p).setClipChildren(false);
            ((LinearLayout) this.f56305p).setClipToPadding(false);
        }
        C19920au auVar = this.f56122a.f55850g;
        if (auVar == null) {
            auVar = C19920au.f55724b;
        }
        if (C20482m.m38445m(auVar)) {
            C19920au auVar2 = this.f56122a.f55850g;
            if (auVar2 == null) {
                auVar2 = C19920au.f55724b;
            }
            i = C20482m.m38436d(auVar2);
        } else {
            int a = C19950bx.m37783a(this.f56122a.f55847d);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 0) {
                i = 8388611;
            } else if (i2 == 1) {
                i = 17;
            } else if (i2 != 2) {
                i = i2 != 3 ? 8388613 : 16;
            }
        }
        ((LinearLayout) this.f56305p).setGravity(i);
        if (this.f56122a.f55845b.size() != 0) {
            mo25256A(this.f56122a.f55845b);
        }
        C19951by byVar2 = this.f56122a;
        if ((byVar2.f55844a & 4) != 0) {
            C19916aq aqVar = byVar2.f55848e;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C56425d mo25113i(List list) {
        if (list != null) {
            C19948bv bvVar = (C19948bv) this.f56122a.toBuilder();
            bvVar.copyOnWrite();
            ((C19951by) bvVar.instance).f55845b = C19951by.emptyProtobufList();
            bvVar.copyOnWrite();
            C19951by byVar = (C19951by) bvVar.instance;
            C62971cq cqVar = byVar.f55845b;
            if (!cqVar.mo58948c()) {
                byVar.f55845b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) byVar.f55845b);
            this.f56122a = (C19951by) bvVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19951by.f55842i, this.f56122a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public void mo25116kJ() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public LinearLayout mo25110e(Context context) {
        return new LinearLayout(context);
    }
}
