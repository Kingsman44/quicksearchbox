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
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.C56036l;

/* renamed from: com.google.android.apps.gsa.search.core.google.cf */
/* compiled from: PG */
public final /* synthetic */ class C85912cf implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C85919cm f232258a;

    /* renamed from: b */
    public final /* synthetic */ C56036l f232259b;

    public /* synthetic */ C85912cf(C85919cm cmVar, C56036l lVar) {
        this.f232258a = cmVar;
        this.f232259b = lVar;
    }

    public final void run() {
        C58833ax axVar;
        C85919cm cmVar = this.f232258a;
        C56036l lVar = this.f232259b;
        C85897bt btVar = (C85897bt) cmVar.f232295i.mo27525b();
        if (lVar.f149231b.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            C85981c cVar = new C85981c();
            String c = btVar.f232235a.mo79764c(R.string.google_proactive_zp_gen_204_pattern);
            cVar.mo79640f(Uri.parse(String.format(C85980b.f232491a, c, new Object[]{btVar.f232236b.mo83212j(), btVar.f232236b.mo83211i()})));
            cVar.mo79638d("pzps", Base64.encodeToString(lVar.toByteArray(), 11));
            cVar.mo79638d("client", "searchbox");
            axVar = C58833ax.m90834k(cVar);
        }
        if (axVar.mo56113h()) {
            C90021c cVar2 = (C90021c) cmVar.f232292f.mo27525b();
            UriRequest b = new C85965dk((C85981c) axVar.mo56107c(), (C86338r) cmVar.f232293g.mo27525b()).mo79626b((C85966dl) null);
            C58976aa aaVar = C58975e.f156826a;
            if (!cmVar.mo79548g(b, 2)) {
                C89886e b2 = ((C89911f) cmVar.f232297k.mo27525b()).mo83756b(new C90452a(29, C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
                b2.f246282c = 118904011;
                b2.mo83721a();
            }
        }
    }
}
