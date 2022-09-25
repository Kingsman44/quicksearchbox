package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.gms.googlehelp.C144291g;
import com.google.android.libraries.gcoreclient.p1774k.p1775a.C21573h;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21592d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.ag */
/* compiled from: PG */
final class C110196ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C110197ah f307060a;

    public C110196ag(C110197ah ahVar) {
        this.f307060a = ahVar;
    }

    public final void onClick(View view) {
        C110197ah ahVar = this.f307060a;
        String x = ((C86124t) ahVar.f307064e.mo27525b()).mo79758x(C90014bt.f247202ch);
        Uri parse = Uri.parse(((C86124t) ahVar.f307064e.mo27525b()).mo79758x(C90014bt.f247201cg));
        if (x.isEmpty()) {
            ((C59052c) ((C59052c) C110197ah.f307061b.mo56225c()).mo56372aa(25810)).mo56386p("Empty context string!");
            return;
        }
        C90476a aVar = C91018d.f254254a;
        try {
            C21592d dVar = new C21592d(x);
            if (parse != null) {
                dVar.f59965a.f390767q = parse;
            }
            dVar.f59965a.f390753c = (Account) ahVar.f307062c.mo77278a().mo56107c();
            dVar.mo27019a((C21573h) ahVar.f307066g.mo17428b());
            Intent a = dVar.f59965a.mo119806a();
            a.addFlags(C89885b.S3REQUEST_VALUE);
            Activity activity = ahVar.getActivity();
            activity.getClass();
            new C144291g(activity).mo119820c(a);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C110197ah.f307061b.mo56225c()).mo56382g(e)).mo56372aa(25809)).mo56386p("Failed to launch Google help.");
        }
    }
}
