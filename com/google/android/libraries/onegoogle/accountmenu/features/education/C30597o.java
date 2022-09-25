package com.google.android.libraries.onegoogle.accountmenu.features.education;

import android.view.View;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30577d;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30586m;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30896y;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.o */
/* compiled from: PG */
public final /* synthetic */ class C30597o implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82654a;

    /* renamed from: b */
    public final /* synthetic */ C30600r f82655b;

    /* renamed from: c */
    public final /* synthetic */ C2391v f82656c;

    /* renamed from: d */
    public final /* synthetic */ String f82657d;

    /* renamed from: e */
    public final /* synthetic */ View f82658e;

    public /* synthetic */ C30597o(C30601s sVar, C30600r rVar, C2391v vVar, String str, View view) {
        this.f82654a = sVar;
        this.f82655b = rVar;
        this.f82656c = vVar;
        this.f82657d = str;
        this.f82658e = view;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30601s sVar = this.f82654a;
        C30600r rVar = this.f82655b;
        C2391v vVar = this.f82656c;
        String str = this.f82657d;
        View view = this.f82658e;
        List<C30586m> list = (List) obj;
        rVar.mo5707k(vVar);
        if (list != null && !list.isEmpty()) {
            C30576c cVar = ((C30586m) list.get(0)).f82618a;
            C30546a aVar = (C30546a) sVar.f82666b.get(cVar.f82598a);
            if (aVar == null) {
                sVar.f82670f.execute(new C30573d(sVar, cVar));
            } else if (cVar.f82602e != 0 && ((C30586m) list.get(0)).f82619b != null) {
                for (C30586m mVar : list) {
                    C30577d dVar = mVar.f82619b;
                    if (dVar.f82607b.equals(str) && !dVar.f82610e && aVar.mo36210e(view, new C30589g(sVar, cVar, dVar, aVar))) {
                        view.setTag(R.id.interaction_info_tag, C30896y.m57669a(aVar.mo36211f()));
                    }
                }
            }
        }
    }
}
