package com.google.android.libraries.onegoogle.accountmenu.features.education;

import android.support.p031v4.app.FragmentManager;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.C30173aa;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30586m;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30896y;
import com.google.android.libraries.onegoogle.tooltip.C31067c;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.h */
/* compiled from: PG */
public final /* synthetic */ class C30590h implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82632a;

    /* renamed from: b */
    public final /* synthetic */ C30600r f82633b;

    /* renamed from: c */
    public final /* synthetic */ C2391v f82634c;

    /* renamed from: d */
    public final /* synthetic */ C31067c f82635d;

    /* renamed from: e */
    public final /* synthetic */ FragmentManager f82636e;

    public /* synthetic */ C30590h(C30601s sVar, C30600r rVar, C2391v vVar, C31067c cVar, FragmentManager fragmentManager) {
        this.f82632a = sVar;
        this.f82633b = rVar;
        this.f82634c = vVar;
        this.f82635d = cVar;
        this.f82636e = fragmentManager;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30601s sVar = this.f82632a;
        C30600r rVar = this.f82633b;
        C2391v vVar = this.f82634c;
        C31067c cVar = this.f82635d;
        FragmentManager fragmentManager = this.f82636e;
        List list = (List) obj;
        rVar.mo5707k(vVar);
        if (list != null && !list.isEmpty()) {
            SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) cVar;
            if (!C58485gu.m89847o(C30173aa.RED_ALERT, C30173aa.YELLOW_ALERT).contains(selectedAccountDisc.f81902c.mo35585c())) {
                C30576c cVar2 = ((C30586m) list.get(0)).f82618a;
                C30546a aVar = (C30546a) sVar.f82666b.get(cVar2.f82598a);
                if (aVar == null) {
                    sVar.f82670f.execute(new C30592j(sVar, cVar2));
                } else if (!cVar2.mo36259b() && aVar.mo36209d(fragmentManager, cVar, new C30593k(sVar, aVar, cVar2))) {
                    sVar.f82670f.execute(new C30594l(sVar, cVar2, list));
                    selectedAccountDisc.f81902c.setTag(R.id.interaction_info_tag, C30896y.m57669a(aVar.mo36211f()));
                }
            }
        }
    }
}
