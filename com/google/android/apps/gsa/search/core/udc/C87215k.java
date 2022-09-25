package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147485b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60654xx;
import com.google.common.p4552o.C60656xz;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.udc.k */
/* compiled from: PG */
public final class C87215k implements C90991b {

    /* renamed from: b */
    private static final C59071e f235631b = C59071e.m91332i("com.google.android.apps.gsa.search.core.udc.k");

    /* renamed from: c */
    private static final C58485gu f235632c = C58485gu.m89850r(C55912b.WEB_AND_APP_ACTIVITY, C55912b.VOICE_AND_AUDIO_ACTIVITY, C55912b.SUPPLEMENTAL_WEB_AND_APP_ACTIVITY, C55912b.DEVICE_APPS, C55912b.DEVICE_CONTACTS);

    /* renamed from: a */
    public final C22871g f235633a;

    /* renamed from: d */
    private final C84413ad f235634d;

    /* renamed from: e */
    private final C68214a f235635e;

    /* renamed from: f */
    private final C147488c f235636f;

    /* renamed from: g */
    private final C68214a f235637g;

    /* renamed from: h */
    private final Map f235638h = new HashMap();

    /* renamed from: i */
    private boolean f235639i = false;

    public C87215k(C84413ad adVar, C68214a aVar, C147488c cVar, C22871g gVar, C68214a aVar2) {
        this.f235635e = aVar;
        this.f235636f = cVar;
        this.f235633a = gVar;
        this.f235637g = aVar2;
        this.f235634d = adVar;
    }

    /* renamed from: a */
    public final C147485b mo80841a(Account account) {
        return this.f235636f.mo124244a(account);
    }

    /* renamed from: b */
    public final void mo80842b(Account account) {
        if (!this.f235638h.containsKey(account)) {
            this.f235638h.put(account, this.f235633a.mo28202b("Ensure cached is loaded for account", new C87206b(this, account)));
        }
    }

    /* renamed from: c */
    public final void mo80843c(Account account) {
        this.f235633a.mo28202b("Force refresh cache for account.", new C87214j(this, account));
    }

    /* renamed from: e */
    public final void mo80844e() {
        if (mo80847h() && !this.f235639i) {
            for (Account account : ((C86054o) this.f235637g.mo27525b()).mo79684r()) {
                mo80842b(account);
                String str = account.name;
            }
            this.f235639i = true;
        }
    }

    /* renamed from: f */
    public final boolean mo80845f(Account account, C55912b bVar) {
        if (account == null) {
            return false;
        }
        if (((C86124t) this.f235635e.mo27525b()).mo79746e(C90109fg.f250574p)) {
            try {
                ((C59052c) ((C59052c) f235631b.mo56226d()).mo56372aa(9356)).mo56389s("Calling isUserEligibleToConsent() on permission %s", bVar.name());
                C60870cx f = mo80841a(account).mo124238f(bVar);
                C90476a aVar = C91018d.f254254a;
                return ((Boolean) f.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                mo80848i(13);
                return false;
            }
        } else {
            if (((C86124t) this.f235635e.mo27525b()).mo79746e(C90109fg.f250559a)) {
                try {
                    if (this.f235638h.containsKey(account)) {
                        C60870cx cxVar = (C60870cx) this.f235638h.get(account);
                        if (cxVar != null) {
                            C90476a aVar2 = C91018d.f254254a;
                            cxVar.get();
                        }
                        ((C59052c) ((C59052c) f235631b.mo56224b()).mo56372aa(9354)).mo56389s("isEligible(): ensureCachedSettingsLoaded() finished for permission %s", bVar.name());
                    }
                } catch (InterruptedException | ExecutionException unused2) {
                    mo80848i(14);
                    ((C59052c) ((C59052c) f235631b.mo56226d()).mo56372aa(9355)).mo56389s("isEligible(): ensureCachedSettingsLoaded() failed for permission %s", bVar.name());
                }
            }
            C58833ax b = mo80841a(account).mo124234b(bVar);
            if (!b.mo56113h()) {
                mo80848i(5);
                mo80842b(account);
                ((C59052c) ((C59052c) f235631b.mo56226d()).mo56372aa(9353)).mo56389s("isEligible(): Absent status for permission %s. Calling ensureCachedSettingsLoaded().", bVar.name());
            }
            return ((Boolean) b.mo56109e(Boolean.valueOf(((C86124t) this.f235635e.mo27525b()).mo79746e(C90109fg.f250561c)))).booleanValue();
        }
    }

    /* renamed from: g */
    public final boolean mo80846g(Account account, C55912b bVar) {
        if (account == null) {
            return false;
        }
        if (((C86124t) this.f235635e.mo27525b()).mo79746e(C90109fg.f250574p)) {
            try {
                ((C59052c) ((C59052c) f235631b.mo56226d()).mo56372aa(9360)).mo56389s("Calling isDataRecordingEnabled() on permission %s", bVar.name());
                C60870cx e = mo80841a(account).mo124237e(bVar);
                C90476a aVar = C91018d.f254254a;
                return ((Boolean) e.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                mo80848i(12);
                return false;
            }
        } else {
            if (((C86124t) this.f235635e.mo27525b()).mo79746e(C90109fg.f250559a)) {
                try {
                    if (this.f235638h.containsKey(account)) {
                        C60870cx cxVar = (C60870cx) this.f235638h.get(account);
                        if (cxVar != null) {
                            C90476a aVar2 = C91018d.f254254a;
                            cxVar.get();
                        }
                        ((C59052c) ((C59052c) f235631b.mo56224b()).mo56372aa(9358)).mo56389s("isEnabled(): ensureCachedSettingsLoaded() finished for permission %s", bVar.name());
                    }
                } catch (InterruptedException | ExecutionException unused2) {
                    ((C59052c) ((C59052c) f235631b.mo56226d()).mo56372aa(9359)).mo56389s("isEnabled(): ensureCachedSettingsLoaded() failed for permission %s", bVar.name());
                    mo80848i(14);
                }
            }
            C58833ax a = mo80841a(account).mo124233a(bVar);
            if (!a.mo56113h()) {
                mo80848i(4);
                ((C59052c) ((C59052c) f235631b.mo56226d()).mo56372aa(9357)).mo56389s("Absent status for permission %s. Calling ensureCachedSettingsLoaded().", bVar.name());
                mo80842b(account);
            }
            return ((Boolean) a.mo56109e(false)).booleanValue();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("FacsCacheProvider");
        Account a = ((C86054o) this.f235637g.mo27525b()).mo79668a();
        if (a != null) {
            fVar.mo85279c("account").mo85276a(C90752i.m148231e(C90752i.m148236j(a.name)));
            C58485gu guVar = f235632c;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C55912b bVar = (C55912b) guVar.get(i2);
                boolean g = mo80846g(a, bVar);
                StringBuilder sb = new StringBuilder();
                sb.append(g);
                String sb2 = sb.toString();
                boolean f = mo80845f(a, bVar);
                fVar.mo85279c(bVar.name()).mo85276a(C90752i.m148229c(sb2 + "[Eligibility = " + f + "]"));
            }
            return;
        }
        fVar.mo85279c("account").mo85276a(C90752i.m148229c("No Account"));
    }

    /* renamed from: h */
    public final boolean mo80847h() {
        return this.f235634d.mo77966c() >= 19525000;
    }

    /* renamed from: i */
    public final void mo80848i(int i) {
        if (((C86124t) this.f235635e.mo27525b()).mo79746e(C90109fg.f250562d)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1439;
            C60654xx xxVar = (C60654xx) C60656xz.f164553c.createBuilder();
            xxVar.copyOnWrite();
            C60656xz xzVar = (C60656xz) xxVar.instance;
            xzVar.f164556b = i - 1;
            xzVar.f164555a |= 1;
            C60656xz xzVar2 = (C60656xz) xxVar.build();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            xzVar2.getClass();
            ufVar2.f164248cz = xzVar2;
            ufVar2.f164255j |= 524288;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
