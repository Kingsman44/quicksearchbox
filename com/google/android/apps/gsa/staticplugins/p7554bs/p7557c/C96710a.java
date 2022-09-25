package com.google.android.apps.gsa.staticplugins.p7554bs.p7557c;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.publicsearch.C84198a;
import com.google.android.apps.gsa.publicsearch.C84212l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.C90002bh;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import dagger.C68214a;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.c.a */
/* compiled from: PG */
public final class C96710a implements C84198a {

    /* renamed from: a */
    private static final C59071e f270540a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bs.c.a");

    /* renamed from: b */
    private final PackageManager f270541b;

    /* renamed from: c */
    private final C68214a f270542c;

    public C96710a(Context context, C68214a aVar) {
        this.f270541b = context.getPackageManager();
        this.f270542c = aVar;
    }

    /* renamed from: a */
    public final ClientConfig mo77666a(int i) {
        String[] packagesForUid = this.f270541b.getPackagesForUid(i);
        if (packagesForUid == null) {
            C59104x c = f270540a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LensBackgroundClientCfg");
            ((C59052c) ((C59052c) c).mo56372aa(20854)).mo56386p("Packages from package manager are null.");
            return null;
        }
        C58485gu c2 = ((C86124t) this.f270542c.mo27525b()).mo79745c(C90002bh.f246862q);
        if (c2 == null) {
            C59104x c3 = f270540a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "LensBackgroundClientCfg");
            ((C59052c) ((C59052c) c3).mo56372aa(20853)).mo56386p("Whitelisted packages from config flags are null");
            return null;
        }
        for (String contains : packagesForUid) {
            if (c2.contains(contains)) {
                C88486g gVar = new C88486g();
                gVar.f239201c = amo.LENS_BACKGROUND;
                gVar.f239204f = "lens_background";
                gVar.f239203e = i;
                return new ClientConfig(gVar);
            }
        }
        C59104x c4 = f270540a.mo56225c();
        c4.mo56378ag(C58975e.f156826a, "LensBackgroundClientCfg");
        ((C59052c) ((C59052c) c4).mo56372aa(20852)).mo56389s("Cannot find a package within %s that is whitelisted for Lens background usage.", Arrays.toString(packagesForUid));
        return null;
    }

    /* renamed from: b */
    public final void mo77667b(C84212l lVar) {
    }
}
