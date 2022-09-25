package com.google.android.apps.search.googleapp.homescreen;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.googleapp.homescreen.searchbox.C136204g;
import com.google.android.apps.search.googleapp.homescreen.searchbox.SearchboxView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.f */
/* compiled from: PG */
final /* synthetic */ class C136184f implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C136193o f370876a;

    public C136184f(C136193o oVar) {
        this.f370876a = oVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        Optional optional = (Optional) obj;
        C69664n.m101061g(optional, "p0");
        C136193o oVar = this.f370876a;
        Integer num = (Integer) optional.orElse(null);
        if (num != null) {
            View r = C2043bi.m5589r(oVar.f370907b.requireView(), R.id.googleapp_facade_search_box_view);
            C69664n.m101060f(r, "requireViewById<Searchbo…search_box_view\n        )");
            C136204g a = ((SearchboxView) r).mo17754z();
            String string = oVar.f370908c.getResources().getString(num.intValue());
            C69664n.m101060f(string, "context.resources.getString(hintTextResId)");
            a.mo112834c(string);
        }
    }
}
