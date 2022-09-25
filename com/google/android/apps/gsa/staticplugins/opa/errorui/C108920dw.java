package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.gms.googlehelp.C144291g;
import com.google.android.libraries.gcoreclient.p1774k.p1775a.C21573h;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21592d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.dw */
/* compiled from: PG */
final class C108920dw {

    /* renamed from: a */
    private final Activity f302845a;

    /* renamed from: b */
    private final C86124t f302846b;

    /* renamed from: c */
    private final C83893b f302847c;

    /* renamed from: d */
    private final C69464a f302848d;

    public C108920dw(Activity activity, C86124t tVar, C83893b bVar, C69464a aVar) {
        this.f302845a = activity;
        this.f302846b = tVar;
        this.f302847c = bVar;
        this.f302848d = aVar;
    }

    /* renamed from: a */
    public final void mo97277a() {
        String x = this.f302846b.mo79758x(C90014bt.f247545jF);
        Uri parse = Uri.parse(this.f302846b.mo79758x(C90014bt.f247544jE));
        if (!x.isEmpty()) {
            C90476a aVar = C91018d.f254254a;
            try {
                C21592d dVar = new C21592d(x);
                if (parse != null) {
                    dVar.f59965a.f390767q = parse;
                }
                dVar.f59965a.f390753c = (Account) this.f302847c.mo77278a().mo56107c();
                dVar.mo27019a((C21573h) this.f302848d.mo17428b());
                Intent a = dVar.f59965a.mo119806a();
                a.addFlags(C89885b.S3REQUEST_VALUE);
                Activity activity = this.f302845a;
                activity.getClass();
                new C144291g(activity).mo119820c(a);
            } catch (IllegalStateException e) {
                C59104x c = C108925ea.f302853b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "PersonalResponseFrag");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24433)).mo56386p("Failed to launch Google help.");
            }
        }
    }
}
