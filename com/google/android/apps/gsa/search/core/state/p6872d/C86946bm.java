package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bm */
/* compiled from: PG */
public final class C86946bm extends C86898ct {

    /* renamed from: a */
    private final C68214a f234838a;

    /* renamed from: b */
    private final C85225a f234839b;

    /* renamed from: c */
    private final C89257aa f234840c;

    /* renamed from: d */
    private final C68214a f234841d;

    /* renamed from: e */
    private final C68214a f234842e;

    public C86946bm(C68214a aVar, C68214a aVar2, C85225a aVar3, C89257aa aaVar, C68214a aVar4, C68214a aVar5) {
        super(aVar, 23);
        this.f234838a = aVar2;
        this.f234839b = aVar3;
        this.f234840c = aaVar;
        this.f234841d = aVar4;
        this.f234842e = aVar5;
    }

    /* renamed from: e */
    public final void mo80597e(C86921ao aoVar) {
        boolean z;
        if (C89257aa.m145197o((SharedPreferences) this.f234838a.mo27525b())) {
            int i = aoVar.f234738a;
            String g = aoVar.mo80569g();
            C89331a aVar = (C89331a) this.f234841d.mo27525b();
            synchronized (aVar.f242191a) {
                z = true;
                if (aVar.f242193c == i) {
                    if (TextUtils.equals(aVar.f242192b, g)) {
                        z = false;
                    }
                }
                aVar.f242193c = i;
                aVar.f242192b = g;
            }
            if (z) {
                this.f234839b.mo78807e(g);
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchWidgetState");
        fVar.mo85279c("widget-count").mo85276a(C90752i.m148230d(Integer.valueOf(this.f234840c.mo83227t().length)));
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        if (str.equals("search_widget_present")) {
            C58976aa aaVar = C58975e.f156826a;
            mo80597e((C86921ao) this.f234842e.mo27525b());
        }
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"search_widget_present"};
    }
}
