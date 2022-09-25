package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.gsa.search.core.google.p6796f.C85980b;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.aos;
import com.google.common.p4552o.aov;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.search.core.google.ce */
/* compiled from: PG */
public final /* synthetic */ class C85911ce implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C85919cm f232256a;

    /* renamed from: b */
    public final /* synthetic */ Suggestion f232257b;

    public /* synthetic */ C85911ce(C85919cm cmVar, Suggestion suggestion) {
        this.f232256a = cmVar;
        this.f232257b = suggestion;
    }

    public final void run() {
        C85919cm cmVar = this.f232256a;
        Suggestion suggestion = this.f232257b;
        C85956db dbVar = (C85956db) cmVar.f232296j.mo27525b();
        C85981c cVar = new C85981c();
        cVar.mo79640f(Uri.parse(String.format(C85980b.f232491a, dbVar.f232462a.mo79764c(R.string.google_suggest_deletion_gen_204_pattern), new Object[]{dbVar.f232463b.mo83212j(), dbVar.f232463b.mo83211i()})));
        amt amt = (amt) apd.f159555aA.createBuilder();
        String x = dbVar.f232464c.mo79758x(C90120fr.f250845l);
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        x.getClass();
        apd.f159583a |= 16;
        apd.f159613e = x;
        aos aos = (aos) aov.f159510u.createBuilder();
        int i = suggestion.f108910k;
        aos.copyOnWrite();
        aov aov = (aov) aos.instance;
        aov.f159512a |= 2;
        aov.f159514c = i;
        aos.mo57029a(suggestion.f108925z);
        amt.copyOnWrite();
        apd apd2 = (apd) amt.instance;
        aov aov2 = (aov) aos.build();
        aov2.getClass();
        apd2.f159619k = aov2;
        apd2.f159583a |= 4096;
        aod aod = aod.DELETION;
        amt.copyOnWrite();
        apd apd3 = (apd) amt.instance;
        apd3.f159614f = aod.f159471J;
        apd3.f159583a |= 64;
        cVar.mo79638d("gs_lp", Base64.encodeToString(((apd) amt.build()).toByteArray(), 11));
        cVar.mo79638d("client", "searchbox");
        C90021c cVar2 = (C90021c) cmVar.f232292f.mo27525b();
        UriRequest b = new C85965dk(cVar, (C86338r) cmVar.f232293g.mo27525b()).mo79626b((C85966dl) null);
        C58976aa aaVar = C58975e.f156826a;
        if (!cmVar.mo79548g(b, 2)) {
            C89886e b2 = ((C89911f) cmVar.f232297k.mo27525b()).mo83756b(new C90452a(29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
            b2.f246282c = 118904011;
            b2.mo83721a();
        }
    }
}
