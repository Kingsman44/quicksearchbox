package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19961ch;
import com.google.android.libraries.componentview.components.base.p1687a.C19962ci;
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

/* renamed from: com.google.android.libraries.componentview.components.base.bh */
/* compiled from: PG */
public class C20050bh extends C20078ci {

    /* renamed from: a */
    private C19962ci f56215a;

    public C20050bh(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new RelativeLayout(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19962ci.f55901f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19962ci ciVar = (C19962ci) obj;
        this.f56215a = ciVar;
        if ((ciVar.f55903a & 1) != 0) {
            C19916aq aqVar = ciVar.f55905c;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
        if (!this.f56215a.f55906d) {
            ((RelativeLayout) this.f56305p).setClipToPadding(false);
            ((RelativeLayout) this.f56305p).setClipChildren(false);
        }
        if (this.f56215a.f55904b.size() != 0) {
            mo25256A(this.f56215a.f55904b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        if (list != null) {
            C19961ch chVar = (C19961ch) this.f56215a.toBuilder();
            chVar.copyOnWrite();
            ((C19962ci) chVar.instance).f55904b = C19962ci.emptyProtobufList();
            chVar.copyOnWrite();
            C19962ci ciVar = (C19962ci) chVar.instance;
            C62971cq cqVar = ciVar.f55904b;
            if (!cqVar.mo58948c()) {
                ciVar.f55904b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) ciVar.f55904b);
            this.f56215a = (C19962ci) chVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19962ci.f55901f, this.f56215a);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }
}
