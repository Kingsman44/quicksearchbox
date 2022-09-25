package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.gcoreclient.p1757e.C21495d;
import com.google.android.libraries.gcoreclient.p1757e.C21496e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60470rb;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.aq */
/* compiled from: PG */
final class C86006aq extends C90880an {

    /* renamed from: a */
    final /* synthetic */ String f232533a;

    /* renamed from: b */
    final /* synthetic */ Account f232534b;

    /* renamed from: c */
    final /* synthetic */ boolean f232535c;

    /* renamed from: d */
    final /* synthetic */ C91032p f232536d;

    /* renamed from: e */
    final /* synthetic */ C86013ax f232537e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86006aq(C86013ax axVar, String str, Account account, boolean z, C91032p pVar) {
        super("Get token with recovery intent", 1, 4);
        this.f232537e = axVar;
        this.f232533a = str;
        this.f232534b = account;
        this.f232535c = z;
        this.f232536d = pVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C86053n nVar;
        String str;
        C86013ax axVar = this.f232537e;
        String str2 = this.f232533a;
        Account account = this.f232534b;
        boolean z = this.f232535c;
        C91032p pVar = this.f232536d;
        if (account == null) {
            return new C86053n();
        }
        int i = 0;
        while (i <= 1) {
            try {
                pVar.mo85308a("LoginHelperImpl: get token");
                long uptimeMillis = SystemClock.uptimeMillis();
                if (z) {
                    str = axVar.f232555c.mo79644c(account, str2, pVar);
                } else {
                    str = axVar.f232555c.mo79645d(account, str2, pVar);
                }
                C59104x b = C86013ax.f232544a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                ((C59052c) ((C59052c) b).mo56372aa(8039)).mo56353F("Successfully received auth token for scope: %s in time %d ms", str2, SystemClock.uptimeMillis() - uptimeMillis);
                C86053n nVar2 = new C86053n(str);
                pVar.mo85310c();
                return nVar2;
            } catch (C21496e e) {
                C59104x d = C86013ax.f232544a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8040)).mo56389s("User recoverable exception for scope: %s", str2);
                C86016b.m138319a(C60470rb.USER_RECOVERABLE_ERROR);
                nVar = new C86053n(C60470rb.USER_RECOVERABLE_ERROR, (Intent) null);
            } catch (C21495d e2) {
                C59104x d2 = C86013ax.f232544a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(8041)).mo56389s("User recoverable exception for scope: %s", str2);
                C86016b.m138319a(C60470rb.USER_RECOVERABLE_ERROR);
                C86053n nVar3 = new C86053n(C60470rb.USER_RECOVERABLE_ERROR, e2.mo26970a());
                pVar.mo85310c();
                return nVar3;
            } catch (C21489a e3) {
                C59104x d3 = C86013ax.f232544a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(8042)).mo56389s("Google auth exception for scope: %s", str2);
                C86016b.m138319a(C60470rb.GOOGLE_AUTH_EXCEPTION);
                nVar = new C86053n(C60470rb.GOOGLE_AUTH_EXCEPTION, (Intent) null);
            } catch (IOException e4) {
                C59104x d4 = C86013ax.f232544a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
                ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e4)).mo56372aa(8043)).mo56389s("IO exception for scope: %s", str2);
                C86016b.m138319a(C60470rb.IO_EXCEPTION);
                pVar.mo85310c();
                i++;
            } catch (Throwable th) {
                pVar.mo85310c();
                throw th;
            }
        }
        return new C86053n(C60470rb.IO_EXCEPTION, (Intent) null);
        pVar.mo85310c();
        return nVar;
    }
}
