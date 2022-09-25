package com.google.android.libraries.componentview.components.p1682a;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19780y;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19781z;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.components.a.bb */
/* compiled from: PG */
public class C19810bb extends C20078ci {

    /* renamed from: c */
    public static final /* synthetic */ int f55358c = 0;

    /* renamed from: a */
    public final ExecutorService f55359a;

    /* renamed from: b */
    public SettableFuture f55360b;

    /* renamed from: g */
    private C19781z f55361g;

    /* renamed from: h */
    private LinearLayout f55362h;

    /* renamed from: i */
    private final C20601ca f55363i;

    public C19810bb(Context context, C56425d dVar, C20537f fVar, Executor executor, ExecutorService executorService, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f55359a = executorService;
        this.f55363i = caVar;
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return this.f55360b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f55362h = linearLayout;
        linearLayout.setOrientation(1);
        this.f55362h.setClipChildren(false);
        return this.f55362h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19781z.f55276c);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C19781z zVar = (C19781z) obj;
        this.f55361g = zVar;
        mo25256A(zVar.f55278a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        C19780y yVar = (C19780y) this.f55361g.toBuilder();
        if (list != null) {
            yVar.copyOnWrite();
            ((C19781z) yVar.instance).f55278a = C19781z.emptyProtobufList();
            yVar.copyOnWrite();
            C19781z zVar = (C19781z) yVar.instance;
            C62971cq cqVar = zVar.f55278a;
            if (!cqVar.mo58948c()) {
                zVar.f55278a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) zVar.f55278a);
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C19781z.f55276c, (C19781z) yVar.build());
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
        Log.v("ValyrianCollectionComponent", "#finalizeBuildImpl");
        this.f55360b = new SettableFuture();
        this.f55359a.execute(new C19809ba(this, this.f55363i, C19742a.IMAGE_LOADING_ERROR));
    }
}
