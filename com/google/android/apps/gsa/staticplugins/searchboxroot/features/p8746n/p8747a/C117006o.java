package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8748b.C117010a;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41691q;
import com.google.android.libraries.searchbox.shared.suggestion.C41695u;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.o */
/* compiled from: PG */
public final class C117006o implements C41630d, C89204i {

    /* renamed from: a */
    private final C86124t f324813a;

    /* renamed from: b */
    private final C68214a f324814b;

    /* renamed from: c */
    private final C68214a f324815c;

    /* renamed from: d */
    private Long f324816d = -1L;

    public C117006o(C86124t tVar, C68214a aVar, C68214a aVar2) {
        this.f324813a = tVar;
        this.f324814b = aVar;
        this.f324815c = aVar2;
    }

    /* renamed from: c */
    private static boolean m194447c(C41633g gVar) {
        C41691q qVar = gVar.mo44218n().f109012f;
        if (qVar == null) {
            qVar = C41691q.f109047e;
        }
        return "com.google.android.youtube".equals(qVar.f109051c);
    }

    /* renamed from: a */
    public final int mo44213a() {
        return SimpleSnackbar.LENGTH_LONG;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        String lowerCase = ((C88616t) aVar).f239556a.mo84352bk().toLowerCase();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41633g gVar = (C41633g) it.next();
            if (gVar != null) {
                if (gVar.mo44217m() == 89 && gVar.mo44222r().contains(235)) {
                    if (!gVar.mo44220p().toString().toLowerCase().contains(lowerCase)) {
                        C41663ac acVar = gVar.mo44218n().f109008b;
                        if (acVar == null) {
                            acVar = C41663ac.f108934g;
                        }
                        if (!acVar.f108940e.toLowerCase(Locale.US).contains(lowerCase)) {
                            it.remove();
                        }
                    }
                    if (this.f324813a.mo79746e(C89995ba.f246770r) && m194447c(gVar)) {
                        if (this.f324816d.longValue() == -1) {
                            this.f324816d = ((C117008q) this.f324814b.mo27525b()).mo103089a();
                        }
                        if (this.f324816d.longValue() != -1) {
                            if (this.f324816d.longValue() != 0) {
                                long longValue = this.f324816d.longValue();
                                C41695u uVar = gVar.mo44218n().f109011e;
                                if (uVar == null) {
                                    uVar = C41695u.f109062e;
                                }
                                if (longValue <= uVar.f109066c) {
                                }
                            }
                        }
                        ((C117010a) this.f324815c.mo27525b()).mo103094a();
                        it.remove();
                    }
                } else if (gVar.mo44217m() == 89 && m194447c(gVar)) {
                    it.remove();
                }
            }
        }
        return false;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        this.f324816d = -1L;
    }
}
