package com.google.android.apps.gsa.staticplugins.backredirect.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9192ca;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.backredirect.activity.e */
/* compiled from: PG */
public final class C94458e implements C94456c {

    /* renamed from: a */
    public static final C59071e f264055a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.backredirect.activity.e");

    /* renamed from: b */
    private final C88483e f264056b;

    /* renamed from: c */
    private final C22871g f264057c;

    /* renamed from: d */
    private final C86124t f264058d;

    public C94458e(C88483e eVar, C22871g gVar, C86124t tVar) {
        this.f264056b = eVar;
        this.f264057c = gVar;
        this.f264058d = tVar;
    }

    /* renamed from: a */
    public final void mo88477a(C9141ad adVar) {
        Bundle bundle;
        Intent intent;
        C9195cd cdVar = adVar.f31541g;
        if (cdVar == null) {
            cdVar = C9195cd.f31746j;
        }
        try {
            Uri parse = Uri.parse(cdVar.f31750c);
            if (!cdVar.f31754g.isEmpty()) {
                bundle = new Bundle();
                for (C9192ca caVar : cdVar.f31754g) {
                    if (!caVar.f31744c.isEmpty()) {
                        bundle.putStringArrayList(caVar.f31743b, new ArrayList(caVar.f31744c));
                    }
                }
            } else {
                bundle = null;
            }
            if (C89429a.m145459q(parse)) {
                intent = Intent.parseUri(parse.toString(), 1);
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
            } else {
                if (parse.getScheme() == null) {
                    C59104x d = f264055a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "LaunchCctHandler");
                    ((C59052c) ((C59052c) d).mo56372aa(14448)).mo56389s("Scheme not specified for uri: %s", parse);
                }
                intent = new Intent("android.intent.action.VIEW", parse);
            }
            intent.putExtra("android.intent.extra.REFERRER", C90721ae.f253801j);
            intent.setFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", 15);
            C88489j jVar = new C88489j(C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT);
            jVar.mo82015c(intent);
            ClientEventData a = jVar.mo82013a();
            C88486g gVar = new C88486g();
            gVar.f239199a = 4294967298L;
            gVar.f239200b = 0;
            gVar.f239201c = amo.DYNAMIC_ACTIVITY;
            gVar.f239204f = "customtabs";
            this.f264057c.mo28211k(this.f264056b.mo82004b(new ClientConfig(gVar), a, this.f264058d.mo79743a(C90081ef.f249855x)), "LaunchCctHandler#CctClientEvent", new C94457d());
        } catch (URISyntaxException e) {
            C59104x c = f264055a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LaunchCctHandler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14449)).mo56386p("Bad URI");
        }
    }
}
