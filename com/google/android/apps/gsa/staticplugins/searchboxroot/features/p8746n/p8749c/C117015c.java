package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8749c;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4440ca.p4442b.p4443a.C57928d;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.c.c */
/* compiled from: PG */
final class C117015c extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C117016d f324845a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117015c(C117016d dVar) {
        super("create serving", 1, 8);
        this.f324845a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C117016d.f324846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "sb.v.u.LiteSuggestSourc");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(32569)).mo56386p("Create model failed while using APA.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C17046am amVar = (C17046am) obj;
        if (amVar == null || (amVar.f49657a & 1) == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        String x = this.f324845a.f324847b.mo79758x(C90085ej.f250225c);
        if (true == x.isEmpty()) {
            x = "head-model";
        }
        C29690f fVar = amVar.f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        for (C28595b bVar : fVar.f80416g) {
            if (bVar.f77798b.equals(x)) {
                try {
                    C117016d dVar = this.f324845a;
                    str = bVar.f77799c;
                    Uri parse = Uri.parse(str);
                    C42788l lVar = new C42788l();
                    lVar.f112052a = true;
                    String absolutePath = ((File) ((C42813k) dVar.f324851f.mo27525b()).mo45889c(parse, lVar)).getAbsolutePath();
                    if (!absolutePath.isEmpty()) {
                        this.f324845a.f324849d = new C57928d(absolutePath, 5);
                        this.f324845a.f324849d.f154940a = 10;
                        return;
                    }
                    return;
                } catch (IOException e) {
                    throw new IOException("Fail to get absolute path of " + str + " .", e);
                } catch (IOException e2) {
                    C59104x d = C117016d.f324846a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "sb.v.u.LiteSuggestSourc");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(32571)).mo56386p("On-device lite suggest model loading error while using APA.");
                    return;
                }
            }
        }
    }
}
