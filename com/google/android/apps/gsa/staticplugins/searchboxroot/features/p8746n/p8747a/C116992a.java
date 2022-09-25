package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8748b.C117010a;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import dagger.C68214a;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.a */
/* compiled from: PG */
public final class C116992a implements C41630d {

    /* renamed from: a */
    private final C86124t f324783a;

    /* renamed from: b */
    private final C68214a f324784b;

    public C116992a(C86124t tVar, C68214a aVar) {
        this.f324783a = tVar;
        this.f324784b = aVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 4000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        if (!TextUtils.isEmpty(((C88616t) aVar).f239556a.mo84352bk()) && this.f324783a.mo79746e(C89995ba.f246756d)) {
            ListIterator listIterator = list.listIterator();
            int i = 0;
            int i2 = 0;
            while (listIterator.hasNext()) {
                C41633g gVar = (C41633g) listIterator.next();
                if (gVar.mo44217m() == 84) {
                    C41689o oVar = gVar.mo44218n().f109010d;
                    if (oVar == null) {
                        oVar = C41689o.f109041e;
                    }
                    String str = oVar.f109045c;
                    if (str.equals("apps")) {
                        i++;
                        listIterator.remove();
                    } else if (str.equals("internal.3p:MobileApplication")) {
                        i2++;
                    }
                }
            }
            ((C117010a) this.f324784b.mo27525b()).mo103098i(i, i2);
        }
        return false;
    }
}
