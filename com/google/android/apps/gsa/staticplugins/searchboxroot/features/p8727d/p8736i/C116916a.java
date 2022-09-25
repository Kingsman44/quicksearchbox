package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88561l;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.i.a */
/* compiled from: PG */
public final class C116916a implements C88561l {

    /* renamed from: a */
    private final C86124t f324610a;

    /* renamed from: b */
    private final C116920e f324611b;

    /* renamed from: c */
    private boolean f324612c = true;

    public C116916a(C86124t tVar, C116920e eVar) {
        this.f324610a = tVar;
        this.f324611b = eVar;
    }

    /* renamed from: a */
    public final int mo82228a() {
        return 3;
    }

    /* renamed from: b */
    public final C41626a mo82229b(C88616t tVar) {
        Response response;
        C88616t tVar2 = tVar;
        if (!this.f324610a.mo79746e(C90085ej.f250118V) || tVar2.f239561f.getBoolean("cs::on_focus_prefetch") || !tVar2.f239561f.getBoolean("cs::on_focus") || !"web".equals(tVar2.f239558c) || tVar2.f239557b != 1) {
            return null;
        }
        if (!this.f324612c) {
            tVar2.f239561f.putBoolean("cs::on_focus", false);
            return null;
        }
        this.f324612c = false;
        C116920e eVar = this.f324611b;
        Query query = tVar2.f239556a;
        synchronized (eVar) {
            Response response2 = eVar.f324620c;
            if (response2 != null) {
                response = TextUtils.equals(query.f252768g, response2.f108861a) ? eVar.f324620c : null;
            } else {
                response = null;
            }
        }
        if (response == null && this.f324610a.mo79746e(C90085ej.f250218bt)) {
            return new C41626a(new ArrayList());
        }
        if (response == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Suggestion suggestion : response.f108862b) {
            if (suggestion.f108909j == 1) {
                arrayList.add(new RootSuggestion(suggestion.f108908i, suggestion.f108909j, suggestion.f108910k, suggestion.f108925z, suggestion.f108913n, suggestion.f108915p, suggestion.f108917r, suggestion.f108906A, suggestion.f108907B));
            }
        }
        return new C41626a(arrayList, (Bundle) null, false, true, response.f108868h);
    }

    /* renamed from: c */
    public final void mo82230c() {
        this.f324612c = true;
    }

    /* renamed from: d */
    public final void mo82231d() {
    }
}
