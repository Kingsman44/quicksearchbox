package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19973ct;
import com.google.android.libraries.componentview.components.base.p1687a.C19975cv;
import com.google.android.libraries.componentview.components.base.p1687a.C19976cw;
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

/* renamed from: com.google.android.libraries.componentview.components.base.bw */
/* compiled from: PG */
public class C20065bw extends C20021ar {

    /* renamed from: a */
    private C19976cw f56266a;

    public C20065bw(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new TableRow(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19976cw.f55968f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19976cw cwVar = (C19976cw) obj;
        this.f56266a = cwVar;
        if (cwVar.f55972c.size() != 0) {
            mo25256A(this.f56266a.f55972c);
        }
        C19976cw cwVar2 = this.f56266a;
        if ((cwVar2.f55970a & 1) != 0) {
            C19916aq aqVar = cwVar2.f55971b;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            super.mo25249w(aqVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        if (list != null) {
            C19973ct ctVar = (C19973ct) this.f56266a.toBuilder();
            ctVar.copyOnWrite();
            ((C19976cw) ctVar.instance).f55972c = C19976cw.emptyProtobufList();
            ctVar.copyOnWrite();
            C19976cw cwVar = (C19976cw) ctVar.instance;
            C62971cq cqVar = cwVar.f55972c;
            if (!cqVar.mo58948c()) {
                cwVar.f55972c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) cwVar.f55972c);
            this.f56266a = (C19976cw) ctVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19976cw.f55968f, this.f56266a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
        int size = this.f56266a.f55972c.size();
        int size2 = this.f56266a.f55973d.size();
        int i = 0;
        while (i < size && i < size2) {
            View virtualChildAt = ((TableRow) this.f56305p).getVirtualChildAt(i);
            TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) virtualChildAt.getLayoutParams();
            layoutParams.span = ((C19975cv) this.f56266a.f55973d.get(i)).f55965a;
            virtualChildAt.setLayoutParams(layoutParams);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* synthetic */ LinearLayout mo25196m(Context context) {
        return new TableRow(context);
    }
}
