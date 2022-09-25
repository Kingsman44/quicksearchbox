package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19930bd;
import com.google.android.libraries.componentview.components.base.p1687a.C19931be;
import com.google.android.libraries.componentview.components.base.p1688b.C20037g;
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

/* renamed from: com.google.android.libraries.componentview.components.base.ab */
/* compiled from: PG */
public class C20005ab extends C20078ci {

    /* renamed from: a */
    private C19931be f56050a;

    /* renamed from: b */
    private final Context f56051b;

    public C20005ab(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f56051b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new FrameLayout(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19931be.f55773g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19931be beVar = (C19931be) obj;
        this.f56050a = beVar;
        if (beVar.f55779e) {
            this.f56305p = new C20037g(this.f56051b);
            ((FrameLayout) this.f56305p).setClickable(false);
        }
        if (!this.f56050a.f55778d) {
            ((FrameLayout) this.f56305p).setClipChildren(false);
            ((FrameLayout) this.f56305p).setClipToPadding(false);
        }
        if (this.f56050a.f55776b.size() != 0) {
            mo25256A(this.f56050a.f55776b);
        }
        C19931be beVar2 = this.f56050a;
        if ((beVar2.f55775a & 1) != 0) {
            C19916aq aqVar = beVar2.f55777c;
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
            C19930bd bdVar = (C19930bd) this.f56050a.toBuilder();
            bdVar.copyOnWrite();
            ((C19931be) bdVar.instance).f55776b = C19931be.emptyProtobufList();
            bdVar.copyOnWrite();
            C19931be beVar = (C19931be) bdVar.instance;
            C62971cq cqVar = beVar.f55776b;
            if (!cqVar.mo58948c()) {
                beVar.f55776b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) beVar.f55776b);
            this.f56050a = (C19931be) bdVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19931be.f55773g, this.f56050a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }
}
