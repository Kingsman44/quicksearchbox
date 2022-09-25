package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8741i;

import android.content.Context;
import com.google.android.apps.gsa.nowoverlayservice.p6424c.C83484a;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.i.c */
/* compiled from: PG */
public final class C116975c extends C88582c {

    /* renamed from: a */
    private final Context f324739a;

    /* renamed from: b */
    private final C85651bb f324740b;

    /* renamed from: c */
    private final C117025g f324741c;

    /* renamed from: d */
    private final C86124t f324742d;

    /* renamed from: e */
    private final C83484a f324743e;

    public C116975c(Context context, C85651bb bbVar, C117025g gVar, C86124t tVar, C83484a aVar) {
        this.f324739a = context;
        this.f324740b = bbVar;
        this.f324741c = gVar;
        this.f324742d = tVar;
        this.f324743e = aVar;
    }

    /* renamed from: a */
    private final boolean m194391a(C41642a aVar) {
        boolean z;
        C88616t tVar = (C88616t) aVar;
        Query query = tVar.f239556a;
        if (!this.f324742d.mo79746e(C90085ej.f250247y)) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (this.f324743e.mo76822a()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else if (query.mo84402ci()) {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        } else {
            if (!tVar.f239561f.getBoolean("bs:bootstrapping")) {
                C117025g gVar = this.f324741c;
                synchronized (gVar.f324904a) {
                    ClientConfig clientConfig = gVar.f324905b;
                    z = clientConfig != null && BitFlags.m148144f(clientConfig.f236950c.f253762b, 256);
                }
                if (!z) {
                    C58976aa aaVar4 = C58975e.f156826a;
                    return false;
                }
            }
            if (this.f324740b.mo79134G() || this.f324740b.mo79132E()) {
                C58976aa aaVar5 = C58975e.f156826a;
                return true;
            }
            C58976aa aaVar6 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: l */
    public final C41626a mo82235l(C41642a aVar) {
        if (!m194391a(aVar)) {
            return null;
        }
        RootSuggestion rootSuggestion = new RootSuggestion(this.f324739a.getResources().getString(true != Locale.getDefault().equals(Locale.US) ? R.string.access_now_promo : R.string.access_discover_promo), 5, 139, Suggestion.f108905h, "get google now promo", C41669ai.f108975x, 0, (C54228aq) null, C41679e.f109005p);
        rootSuggestion.mo44210j();
        return new C41626a(C58485gu.m89846n(rootSuggestion));
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        C88616t tVar = (C88616t) aVar;
        if (!tVar.f239556a.mo84352bk().isEmpty() || tVar.f239557b != 1 || !"web".equals(tVar.f239558c) || tVar.f239556a.mo84406cm() || !this.f324740b.mo79140M()) {
            return false;
        }
        return m194391a(aVar);
    }
}
