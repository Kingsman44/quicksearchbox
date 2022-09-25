package com.google.android.libraries.componentview.components.p1691d;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.p1691d.p1692a.C20330e;
import com.google.android.libraries.componentview.components.p1691d.p1692a.C20331f;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.d.l */
/* compiled from: PG */
public class C20344l extends C20078ci {

    /* renamed from: a */
    public List f57185a;

    /* renamed from: b */
    private C20331f f57186b;

    public C20344l(Context context, C56425d dVar, C20537f fVar, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20331f.f57136d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20331f fVar = (C20331f) obj;
        this.f57186b = fVar;
        C62971cq cqVar = fVar.f57138a;
        C62971cq cqVar2 = fVar.f57139b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(cqVar);
        arrayList.addAll(cqVar2);
        mo25256A(arrayList);
        this.f57185a = mo25422K(C20340h.class);
        mo25374m(0);
        for (C20340h hVar : this.f57185a) {
            hVar.f56305p.setOnClickListener(new C20343k(this, hVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        if (list != null) {
            int size = this.f57186b.f57138a.size();
            int size2 = this.f57186b.f57139b.size();
            C20330e eVar = (C20330e) this.f57186b.toBuilder();
            eVar.copyOnWrite();
            ((C20331f) eVar.instance).f57138a = C20331f.emptyProtobufList();
            List subList = list.subList(0, size);
            eVar.copyOnWrite();
            C20331f fVar = (C20331f) eVar.instance;
            C62971cq cqVar = fVar.f57138a;
            if (!cqVar.mo58948c()) {
                fVar.f57138a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) subList, (List) fVar.f57138a);
            eVar.copyOnWrite();
            ((C20331f) eVar.instance).f57139b = C20331f.emptyProtobufList();
            List subList2 = list.subList(size, size2 + size);
            eVar.copyOnWrite();
            C20331f fVar2 = (C20331f) eVar.instance;
            C62971cq cqVar2 = fVar2.f57139b;
            if (!cqVar2.mo58948c()) {
                fVar2.f57139b = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) subList2, (List) fVar2.f57139b);
            this.f57186b = (C20331f) eVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20331f.f57136d, this.f57186b);
        return (C56425d) cVar.build();
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    /* renamed from: m */
    public final void mo25374m(int i) {
        View view;
        for (int i2 = 0; i2 < this.f57185a.size(); i2++) {
            C20340h hVar = (C20340h) this.f57185a.get(i2);
            if (i2 == i) {
                View view2 = hVar.f57168a;
                if (!(view2 == null || hVar.f57169b == null)) {
                    view2.setVisibility(0);
                    hVar.f57169b.setVisibility(8);
                }
            } else if (!(hVar.f57168a == null || (view = hVar.f57169b) == null)) {
                view.setVisibility(0);
                hVar.f57168a.setVisibility(8);
            }
        }
    }
}
