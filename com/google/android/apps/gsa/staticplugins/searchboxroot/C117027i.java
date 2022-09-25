package com.google.android.apps.gsa.staticplugins.searchboxroot;

import android.widget.Toast;
import com.google.android.apps.gsa.search.core.google.C85911ce;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.i */
/* compiled from: PG */
public final /* synthetic */ class C117027i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C117042x f324910a;

    /* renamed from: b */
    public final /* synthetic */ Suggestion f324911b;

    public /* synthetic */ C117027i(C117042x xVar, Suggestion suggestion) {
        this.f324910a = xVar;
        this.f324911b = suggestion;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C117042x xVar = this.f324910a;
        Suggestion suggestion = this.f324911b;
        if (((Boolean) obj).booleanValue()) {
            C85919cm cmVar = (C85919cm) xVar.f324955f.mo27525b();
            if (((C86124t) cmVar.f232292f.mo27525b()).mo79746e(C90085ej.f250132aI)) {
                cmVar.f232299m.mo28212l("sendFp204ForSuggestionDeletion", new C85911ce(cmVar, suggestion));
                return;
            }
            return;
        }
        Toast.makeText(xVar.f324954c, R.string.remove_from_history_failed, 0).show();
    }
}
