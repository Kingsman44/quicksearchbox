package com.google.android.apps.gsa.staticplugins.p7765da.p7770e;

import com.google.android.apps.gsa.search.core.google.C86074p;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6759t.C85598a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.C90076ea;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p440an.p441a.C8841h;
import dagger.C68214a;
import java.util.Locale;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.e.c */
/* compiled from: PG */
public final class C99295c {

    /* renamed from: a */
    public final C86054o f277747a;

    /* renamed from: b */
    private final C89012aj f277748b;

    /* renamed from: c */
    private final C86124t f277749c;

    /* renamed from: d */
    private final C68214a f277750d;

    /* renamed from: e */
    private final String f277751e;

    /* renamed from: f */
    private final C85598a f277752f;

    public C99295c(C86054o oVar, C89012aj ajVar, C86124t tVar, C68214a aVar, String str, C85598a aVar2) {
        this.f277747a = oVar;
        this.f277748b = ajVar;
        this.f277749c = tVar;
        this.f277750d = aVar;
        this.f277751e = str;
        this.f277752f = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo91397a(String str) {
        if (str != null) {
            return mo91398b(str, C58836b.f156633a);
        }
        return C60922j.m93045h(this.f277752f.mo79089a(), new C99294b(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo91398b(String str, C58833ax axVar) {
        C86074p pVar = (C86074p) this.f277750d.mo27525b();
        byte[] byteArray = pVar.mo79713a(true, pVar.mo79714b()).toByteArray();
        String l = C59326i.f157517e.mo56837l(byteArray, byteArray.length);
        C70334de deVar = new C70334de();
        if (str == null) {
            deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), "AIzaSyDe0Iv2_zsVzc2gvgezBKuRSs_wrmp2XRI");
            deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), this.f277751e);
            if (axVar.mo56113h()) {
                deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), (String) axVar.mo56107c());
            }
        }
        deVar.mo62033h(new C70290cs("X-Client-Data", C70334de.f187481c), l);
        deVar.mo62033h(new C70290cs("Accept-Language", C70334de.f187481c), C8841h.m23466a(Locale.getDefault().toLanguageTag()).f30255g);
        return this.f277748b.mo27501m(this.f277749c.mo79758x(C90076ea.f249782c), (int) this.f277749c.mo79743a(C90076ea.f249781b), deVar, str, 36);
    }
}
