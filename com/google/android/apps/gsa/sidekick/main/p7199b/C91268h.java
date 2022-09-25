package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7144t.C90615f;
import com.google.android.gms.people.C145686o;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gcoreclient.p1800v.p1801a.C21705d;
import com.google.android.libraries.gcoreclient.p1800v.p1801a.C21706e;
import com.google.android.libraries.gcoreclient.p1800v.p1801a.C21707f;
import com.google.android.libraries.gcoreclient.p1800v.p1801a.p1802a.C21701b;
import com.google.android.libraries.gcoreclient.p1800v.p1801a.p1802a.C21702c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.h */
/* compiled from: PG */
public final class C91268h extends C90615f {

    /* renamed from: b */
    private static final C59071e f254724b = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.b.h");

    /* renamed from: a */
    public final C68214a f254725a;

    public C91268h(Context context, C22871g gVar, C69464a aVar, C68214a aVar2) {
        super("GmsPeopleClientHelper", context, gVar, 30000, aVar);
        this.f254725a = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo85543a() {
        return mo84765i(new C91267g(this), "getEmailToGaiaIds");
    }

    /* renamed from: b */
    public final Map mo85544b(C21705d dVar) {
        if (dVar.mo26997c().mo27003f()) {
            C58490gz gzVar = new C58490gz(4);
            C21701b bVar = new C21701b(dVar.f60024b.mo121682c());
            int c = bVar.f60019a.mo119324c();
            for (int i = 0; i < c; i++) {
                C21702c cVar = (C21702c) bVar.mo27071a(i);
                if (cVar.f60020a.mo119337kv("value").contains("@")) {
                    gzVar.mo55429h(cVar.f60020a.mo119337kv("value"), cVar.f60020a.mo119337kv("gaia_id"));
                }
            }
            bVar.f60019a.mo119102b();
            return gzVar.mo55427f(false);
        }
        C59104x d = f254724b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GmsPeopleClientHelper");
        ((C59052c) ((C59052c) d).mo56372aa(11513)).mo56389s("Failed to load contacts: %s", dVar.mo26997c());
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84763c(C21547d dVar) {
        C21706e eVar = new C21706e();
        C145686o oVar = new C145686o();
        oVar.f393927a = 125;
        dVar.mo26981b(eVar, new C21707f(oVar.mo121730a()));
    }
}
