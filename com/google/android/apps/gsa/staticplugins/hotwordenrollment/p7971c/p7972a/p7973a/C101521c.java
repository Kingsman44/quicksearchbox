package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.p7045k.C89809e;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7287b.C92361a;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92370h;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.io.IOException;
import java.net.URL;
import org.json.JSONException;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C101521c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C101525g f283338a;

    /* renamed from: b */
    public final /* synthetic */ l f283339b;

    public /* synthetic */ C101521c(C101525g gVar, l lVar) {
        this.f283338a = gVar;
        this.f283339b = lVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        String str;
        C101525g gVar = this.f283338a;
        l lVar = this.f283339b;
        C92391o oVar = (C92391o) gVar.f283345c.f257558c.mo56111f();
        if (oVar != null) {
            str = oVar.f257645c;
        } else {
            str = gVar.f283349g.mo79674h(gVar.f283350h);
        }
        String str2 = str;
        if (str2 == null) {
            if (oVar != null) {
                ((C59052c) ((C59052c) C101525g.f283343a.mo56225c()).mo56372aa(20291)).mo56389s("Obfuscated GAIA is null - got null userID from impersonation config: [%s]", oVar);
            } else {
                ((C59052c) ((C59052c) C101525g.f283343a.mo56225c()).mo56372aa(20290)).mo56389s("Obfuscated GAIA is null - got null accountID from accountName: [%s]", gVar.f283350h);
            }
            C101526h d = C101527i.m167899d();
            ((C101505a) d).f283266a = C58833ax.m90834k("Null obfuscated GAIA");
            d.mo92365b(false);
            return C60856cj.m92900i(d.mo92364a());
        }
        C89824t tVar = lVar.a;
        tVar.getClass();
        String e = tVar.mo83663a().mo83649e();
        tVar.mo83663a().mo83652g().toString();
        C89809e a = tVar.mo83663a();
        String a2 = C92370h.m151688a(a);
        ((C59052c) ((C59052c) C101525g.f283343a.mo56224b()).mo56372aa(20288)).mo56359L("Send enrollment request to device [id=%s] over %s, using url: [%s]", a.mo83648d(), true != a.mo83656j() ? "HTTP" : "HTTPS", a2);
        try {
            return gVar.f283346d.mo28209i(gVar.f283348f.mo87018b(a.mo83656j(), new URL(a2), C92361a.ENROLL_CLOUD, str2, gVar.f283351i.e()), "check cloud enrollment", C101523e.f283342a);
        } catch (IOException | JSONException e2) {
            ((C59052c) ((C59052c) ((C59052c) C101525g.f283343a.mo56225c()).mo56382g(e2)).mo56372aa(20289)).mo56389s("Cloud enrollment failed for device: %s", e);
            lVar.f(false);
            return C60856cj.m92899h(e2);
        }
    }
}
