package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19969cp;
import com.google.android.libraries.componentview.components.base.p1687a.C19971cr;
import com.google.android.libraries.componentview.components.base.p1687a.C19972cs;
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

/* renamed from: com.google.android.libraries.componentview.components.base.bt */
/* compiled from: PG */
public class C20062bt extends C20021ar {

    /* renamed from: a */
    private C19972cs f56255a;

    public C20062bt(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new TableLayout(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19972cs.f55954h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19972cs csVar = (C19972cs) obj;
        this.f56255a = csVar;
        if (csVar.f55958c.size() != 0) {
            mo25256A(this.f56255a.f55958c);
        }
        C19972cs csVar2 = this.f56255a;
        if ((csVar2.f55956a & 1) != 0) {
            C19916aq aqVar = csVar2.f55957b;
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
            C19969cp cpVar = (C19969cp) this.f56255a.toBuilder();
            cpVar.copyOnWrite();
            ((C19972cs) cpVar.instance).f55958c = C19972cs.emptyProtobufList();
            cpVar.copyOnWrite();
            C19972cs csVar = (C19972cs) cpVar.instance;
            C62971cq cqVar = csVar.f55958c;
            if (!cqVar.mo58948c()) {
                csVar.f55958c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) csVar.f55958c);
            this.f56255a = (C19972cs) cpVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19972cs.f55954h, this.f56255a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
        if (this.f56255a.f55959d.size() != 0) {
            for (C19971cr crVar : this.f56255a.f55959d) {
                int i = crVar.f55948a;
                if (crVar.f55949b) {
                    ((TableLayout) this.f56305p).setColumnShrinkable(i, true);
                }
                if (crVar.f55950c) {
                    ((TableLayout) this.f56305p).setColumnStretchable(i, true);
                }
                if (crVar.f55951d) {
                    ((TableLayout) this.f56305p).setColumnCollapsed(i, true);
                }
            }
        }
        if (this.f56255a.f55961f) {
            ((TableLayout) this.f56305p).setShrinkAllColumns(true);
        }
        if (this.f56255a.f55960e) {
            ((TableLayout) this.f56305p).setStretchAllColumns(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* synthetic */ LinearLayout mo25196m(Context context) {
        return new TableLayout(context);
    }
}
