package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ah */
/* compiled from: PG */
public final /* synthetic */ class C110322ah implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C110332ar f307487a;

    public /* synthetic */ C110322ah(C110332ar arVar) {
        this.f307487a = arVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C110332ar arVar = this.f307487a;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            int a = arVar.f307522q.mo9122a();
            C109024k kVar = arVar.f307521p;
            List list2 = (List) kVar.f303166b.mo3842a();
            if (list2 != null && !list2.isEmpty()) {
                List list3 = (List) kVar.f303165a.mo3842a();
                C58480gp e = C58485gu.m89837e();
                if (list3 != null && a >= 0 && a < list3.size()) {
                    e.mo55396h(list3.subList(a, list3.size()));
                }
                e.mo55396h(list2);
                kVar.f303166b.mo5708l(C58485gu.m89845m());
                kVar.f303165a.mo5708l(e.mo55394f());
            }
        }
    }
}
