package com.google.android.apps.gsa.staticplugins.p7554bs.p7557c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.apps.gsa.publicsearch.C84198a;
import com.google.android.apps.gsa.publicsearch.C84212l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.C90031cj;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.lens.view.p2162s.C27692j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.lens.p4711m.C62632i;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.C68214a;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.c.c */
/* compiled from: PG */
public final class C96712c implements C84198a {

    /* renamed from: a */
    private static final C59071e f270543a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bs.c.c");

    /* renamed from: b */
    private final PackageManager f270544b;

    /* renamed from: c */
    private final C68214a f270545c;

    /* renamed from: d */
    private final C68214a f270546d;

    /* renamed from: e */
    private final C27692j f270547e;

    /* renamed from: f */
    private final C68214a f270548f;

    public C96712c(Context context, C68214a aVar, C68214a aVar2, C27692j jVar, C68214a aVar3) {
        this.f270544b = context.getPackageManager();
        this.f270545c = aVar;
        this.f270546d = aVar2;
        this.f270547e = jVar;
        this.f270548f = aVar3;
    }

    /* renamed from: c */
    private static ClientConfig m160260c(int i) {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.LENS;
        gVar.f239204f = "lens";
        gVar.f239203e = i;
        return new ClientConfig(gVar);
    }

    /* renamed from: a */
    public final ClientConfig mo77666a(int i) {
        String[] packagesForUid = this.f270544b.getPackagesForUid(i);
        if (packagesForUid == null) {
            C59104x c = f270543a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LensClientConfig");
            ((C59052c) ((C59052c) c).mo56372aa(20856)).mo56386p("Packages from package manager are null.");
            return null;
        } else if (i == Process.myUid()) {
            return m160260c(i);
        } else {
            for (String str : packagesForUid) {
                if (C90772bp.m148274A(((C65603f) this.f270548f.mo27525b()).f178307a, str)) {
                    return null;
                }
                if (((C86124t) this.f270545c.mo27525b()).mo79745c(C90031cj.f248315d).contains(str)) {
                    if (C62632i.m94822g(C58833ax.m90834k(str)) && !((C143701ac) this.f270546d.mo27525b()).mo119084c(str)) {
                        C59104x c2 = f270543a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "LensClientConfig");
                        ((C59052c) ((C59052c) c2).mo56372aa(20857)).mo56386p("Photos package is not Google-signed. Should never happen.");
                    }
                    return m160260c(i);
                }
                if (this.f270547e.mo33178a(str)) {
                    return m160260c(i);
                }
            }
            C59104x c3 = f270543a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "LensClientConfig");
            ((C59052c) ((C59052c) c3).mo56372aa(20855)).mo56389s("Cannot find a package within %s that is allowlisted for Lens usage.", Arrays.toString(packagesForUid));
            return null;
        }
    }

    /* renamed from: b */
    public final void mo77667b(C84212l lVar) {
    }
}
