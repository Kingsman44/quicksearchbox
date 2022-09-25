package com.google.android.apps.gsa.staticplugins.p7707cu;

import android.accounts.AccountsException;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6644cf.C85084a;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88196ss;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88200sw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cu.f */
/* compiled from: PG */
public final class C98562f extends C86734a implements C85084a {

    /* renamed from: a */
    public static final C59071e f275281a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cu.f");

    /* renamed from: b */
    private final C68214a f275282b;

    /* renamed from: c */
    private final C98559c f275283c;

    /* renamed from: f */
    private final C68214a f275284f;

    /* renamed from: g */
    private final C22871g f275285g;

    /* renamed from: h */
    private final C87242k f275286h;

    /* renamed from: i */
    private final C84466a f275287i;

    public C98562f(C68214a aVar, C68214a aVar2, C22871g gVar, C98559c cVar, C87242k kVar, C84466a aVar3) {
        super(C118575h.WORKER_REAUTH, "reauth");
        this.f275284f = aVar2;
        this.f275282b = aVar;
        this.f275283c = cVar;
        this.f275285g = gVar;
        this.f275286h = kVar;
        this.f275287i = aVar3;
    }

    /* renamed from: f */
    private final void m163263f(C60870cx cxVar) {
        new C90873ag(cxVar, this.f275285g, "ReauthWorker", new C98560d(this)).mo85223a(new C98561e(this));
    }

    /* renamed from: a */
    public final C60870cx mo78694a(String str, String str2, String str3) {
        String F = ((C86054o) this.f275284f.mo27525b()).mo79659F();
        if (F == null) {
            ((C59052c) ((C59052c) f275281a.mo56225c()).mo56372aa(30877)).mo56386p("LoginHelper couldn't return the account in use, we will not reauth.");
        } else if (!F.equals(str)) {
            C90476a aVar = C90754k.f253829b;
            C90476a aVar2 = C90754k.f253829b;
            Object c = C90753j.m148241c(str);
            C90476a aVar3 = C90754k.f253829b;
            C90476a aVar4 = C90754k.f253829b;
            ((C59052c) ((C59052c) f275281a.mo56225c()).mo56372aa(30876)).mo56354G("Conflicting accounts. client: %s loginHelper: %s", c, C90753j.m148241c(F));
        } else {
            C89356b ic = mo80351ic(this.f275287i, "Reauth", C118575h.GRAPH_REAUTH);
            C98559c cVar = this.f275283c;
            C87242k kVar = this.f275286h;
            C98563g gVar = cVar.f275276b;
            gVar.f275289b = str3;
            gVar.f275290c = "https://www.googleapis.com/reauth/v1beta/users/%user_id%/reauthProofTokens".replace("%user_id%", "me");
            gVar.f275291d = str2;
            return cVar.mo91177a(cVar.f275276b, kVar, ic);
        }
        return C60856cj.m92899h(new AccountsException("Account is not ready for reauth."));
    }

    /* renamed from: b */
    public final void mo78695b(String str, String str2, String str3) {
        m163263f(mo78694a(str, str2, str3));
    }

    /* renamed from: c */
    public final void mo78696c(String str, String str2, String str3) {
        C89356b ic = mo80351ic(this.f275287i, "Reauth", C118575h.GRAPH_REAUTH);
        C98559c cVar = this.f275283c;
        C87242k kVar = this.f275286h;
        C98563g gVar = cVar.f275276b;
        gVar.f275289b = str3;
        gVar.f275290c = Uri.parse("https://www.googleapis.com/reauth/v1beta/users/%user_id%/reauthProofTokens".replace("%user_id%", str)).buildUpon().appendQueryParameter("delegationType", "unicorn").build().toString();
        gVar.f275291d = str2;
        m163263f(cVar.mo91177a(cVar.f275276b, kVar, ic));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo91178e(C88200sw swVar) {
        C86775r rVar = ((C86610af) this.f275282b.mo27525b()).f233977l;
        if (rVar != null) {
            C87684al alVar = new C87684al(C88244um.REAUTH_SERVICE_EVENT);
            alVar.mo81965b(C88196ss.f238416a, swVar);
            rVar.f234383e.mo80379b(alVar.mo81964a());
            return;
        }
        ((C59052c) ((C59052c) f275281a.mo56225c()).mo56372aa(30874)).mo56389s("No attached client found, Can't send back %s", swVar);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
