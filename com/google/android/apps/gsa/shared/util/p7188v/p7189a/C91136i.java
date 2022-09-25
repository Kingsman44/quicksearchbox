package com.google.android.apps.gsa.shared.util.p7188v.p7189a;

import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90091ep;
import com.google.android.libraries.search.p2476a.p2478b.C32162b;
import com.google.android.libraries.search.p2476a.p2478b.C32163c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60641xk;
import com.google.common.p4552o.C60643xm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.util.v.a.i */
/* compiled from: PG */
public final class C91136i implements C32163c {

    /* renamed from: a */
    private static final C59071e f254459a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.v.a.i");

    /* renamed from: b */
    private final C68214a f254460b;

    /* renamed from: c */
    private final C60887da f254461c;

    /* renamed from: d */
    private final C42876ab f254462d;

    /* renamed from: e */
    private final C32162b f254463e;

    public C91136i(C68214a aVar, C60887da daVar, C42876ab abVar, C32162b bVar) {
        this.f254460b = aVar;
        this.f254461c = daVar;
        this.f254462d = abVar;
        this.f254463e = bVar;
    }

    /* renamed from: d */
    public static void m148901d(boolean z, boolean z2, int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1468;
        C60641xk xkVar = (C60641xk) C60643xm.f164522e.createBuilder();
        xkVar.copyOnWrite();
        C60643xm xmVar = (C60643xm) xkVar.instance;
        xmVar.f164525b = i - 1;
        xmVar.f164524a |= 1;
        xkVar.copyOnWrite();
        C60643xm xmVar2 = (C60643xm) xkVar.instance;
        xmVar2.f164524a |= 4;
        xmVar2.f164527d = z2;
        xkVar.copyOnWrite();
        C60643xm xmVar3 = (C60643xm) xkVar.instance;
        xmVar3.f164524a |= 2;
        xmVar3.f164526c = z;
        C60643xm xmVar4 = (C60643xm) xkVar.build();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        xmVar4.getClass();
        ufVar2.f164205cF = xmVar4;
        ufVar2.f164255j |= 134217728;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: e */
    private final boolean m148902e() {
        return ((C84534as) this.f254460b.mo27525b()).mo85405j(C90091ep.f250538a);
    }

    /* renamed from: a */
    public final C60870cx mo37977a() {
        return this.f254463e.mo37977a();
    }

    /* renamed from: b */
    public final C60870cx mo37978b(String str) {
        C84533ar a = ((C84534as) this.f254460b.mo27525b()).mo78241a();
        if (str == null) {
            a.mo78240f("GSAPrefs.google_account");
        } else {
            a.mo78239e("GSAPrefs.google_account", str);
        }
        boolean b = a.mo78236b();
        if (!b) {
            ((C59052c) ((C59052c) f254459a.mo56225c()).mo56372aa(11455)).mo56386p("#setPrimaryAccountName in SP failed.");
        }
        if (!m148902e()) {
            return C60866ct.f164955a;
        }
        C60870cx a2 = this.f254462d.mo46039a(C47810es.m84963c(new C91133f(str)), this.f254461c);
        C60856cj.m92911t(a2, new C91135h(b, 2), this.f254461c);
        return a2;
    }

    /* renamed from: c */
    public final C60870cx mo37979c(Set set) {
        C84533ar a = ((C84534as) this.f254460b.mo27525b()).mo78241a();
        a.f230052a.putStringSet("GSAPrefs.whitelisted_google_account_names", set);
        boolean b = a.mo78236b();
        if (!m148902e()) {
            return C60866ct.f164955a;
        }
        C60870cx a2 = this.f254462d.mo46039a(C47810es.m84963c(new C91134g(set)), this.f254461c);
        C60856cj.m92911t(a2, new C91135h(b, 3), this.f254461c);
        return a2;
    }
}
