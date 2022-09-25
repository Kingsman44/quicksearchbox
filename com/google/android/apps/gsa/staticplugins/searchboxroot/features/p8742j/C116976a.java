package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8742j;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.apd;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.j.a */
/* compiled from: PG */
public final class C116976a extends C41641b {

    /* renamed from: a */
    private static final C58485gu f324744a = C58485gu.m89848p(aod.CLICKED_SUGGESTION, aod.ENTER_KEY, aod.SEARCH_BUTTON);

    /* renamed from: b */
    private final C86124t f324745b;

    /* renamed from: c */
    private final C68214a f324746c;

    public C116976a(C86124t tVar, C68214a aVar) {
        this.f324745b = tVar;
        this.f324746c = aVar;
    }

    /* renamed from: f */
    public final void mo44231f(amt amt) {
        C86338r rVar = (C86338r) this.f324746c.mo27525b();
        if (this.f324745b.mo79746e(C90120fr.f250817ai)) {
            apd apd = (apd) amt.instance;
            if ((apd.f159583a & 64) != 0) {
                aod a = aod.m92443a(apd.f159614f);
                if (a == null) {
                    a = aod.UNSET;
                }
                if (f324744a.contains(a)) {
                    int i = rVar.getInt("onboarding_num_searches_performed", 0);
                    C86337q b = rVar.mo80076b();
                    b.mo80070e("onboarding_num_searches_performed", i + 1);
                    b.apply();
                }
            }
        }
    }
}
