package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.gcoreclient.p1757e.C21495d;
import com.google.android.libraries.gcoreclient.p1757e.C21496e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C60470rb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.e */
/* compiled from: PG */
public final class C86044e implements C86049j {

    /* renamed from: a */
    private final C86049j f232622a;

    /* renamed from: b */
    private final C86043d f232623b;

    public C86044e(C86124t tVar, C21370a aVar, C86049j jVar) {
        this.f232622a = jVar;
        this.f232623b = new C86043d(tVar, aVar);
    }

    /* renamed from: e */
    private final String m138347e(Account account, String str, boolean z, C91032p pVar) {
        String str2;
        String str3;
        C86031c cVar;
        C21489a aVar;
        if (!str.startsWith("weblogin:")) {
            try {
                pVar.mo85308a("CachingGoogleAuthAdapter: access token cache");
                C86043d dVar = this.f232623b;
                String str4 = account.name;
                synchronized (dVar.f232619c) {
                    Map map = (Map) dVar.f232620d.get(str);
                    if (!(map == null || (cVar = (C86031c) map.get(str4)) == null)) {
                        if ((cVar.f232595c + TimeUnit.SECONDS.toMillis(dVar.f232617a.mo79743a(C90120fr.f250838e))) - dVar.f232618b.mo26874f() > 0) {
                            str3 = cVar.f232596d;
                            if (str3 == null && (aVar = cVar.f232597e) != null) {
                                if (!z) {
                                    Intent intent = cVar.f232598f;
                                    if (intent != null) {
                                        throw new C21495d("Cached recoverable exception", intent);
                                    }
                                } else {
                                    throw new C21496e("Cached recoverable exception", aVar);
                                }
                            }
                        }
                    }
                    str3 = null;
                }
                pVar.mo85310c();
                if (str3 != null) {
                    return str3;
                }
            } catch (Throwable th) {
                pVar.mo85310c();
                throw th;
            }
        }
        try {
            C89949q.m146523g(167);
            pVar.mo85308a("CachingGoogleAuthAdapter: get token from wrapped adapter");
            if (z) {
                str2 = this.f232622a.mo79644c(account, str, pVar);
            } else {
                str2 = this.f232622a.mo79645d(account, str, pVar);
            }
            pVar.mo85310c();
            C86016b.m138319a(C60470rb.SUCCESS);
            if (!str.startsWith("weblogin:")) {
                try {
                    pVar.mo85308a("CachingGoogleAuthAdapter: put token in cache");
                    C86043d dVar2 = this.f232623b;
                    String str5 = account.name;
                    str2.getClass();
                    C86031c cVar2 = new C86031c(str5, str, dVar2.f232618b.mo26874f(), str2, (C21489a) null, (Intent) null);
                    synchronized (dVar2.f232619c) {
                        Map map2 = (Map) dVar2.f232620d.get(str);
                        if (map2 == null) {
                            map2 = new HashMap();
                            dVar2.f232620d.put(str, map2);
                        }
                        map2.put(str5, cVar2);
                        dVar2.f232621e.put(str2, cVar2);
                    }
                    pVar.mo85310c();
                } catch (Throwable th2) {
                    pVar.mo85310c();
                    throw th2;
                }
            }
            str2.getClass();
            return str2;
        } catch (C21496e e) {
            if (!str.startsWith("weblogin:")) {
                C86043d dVar3 = this.f232623b;
                String str6 = account.name;
                C86031c cVar3 = new C86031c(str6, str, dVar3.f232618b.mo26874f(), (String) null, e, (Intent) null);
                synchronized (dVar3.f232619c) {
                    Map map3 = (Map) dVar3.f232620d.get(str);
                    if (map3 == null) {
                        map3 = new HashMap();
                        dVar3.f232620d.put(str, map3);
                    }
                    map3.put(str6, cVar3);
                }
            }
            throw e;
        } catch (C21495d e2) {
            if (!str.startsWith("weblogin:")) {
                C86043d dVar4 = this.f232623b;
                String str7 = account.name;
                C86031c cVar4 = new C86031c(str7, str, dVar4.f232618b.mo26874f(), (String) null, e2, e2.mo26970a());
                synchronized (dVar4.f232619c) {
                    Map map4 = (Map) dVar4.f232620d.get(str);
                    if (map4 == null) {
                        map4 = new HashMap();
                        dVar4.f232620d.put(str, map4);
                    }
                    map4.put(str7, cVar4);
                }
            }
            throw e2;
        } catch (Throwable th3) {
            pVar.mo85310c();
            throw th3;
        }
    }

    /* renamed from: a */
    public final void mo79642a(String str) {
        Map map;
        C86043d dVar = this.f232623b;
        synchronized (dVar.f232619c) {
            C86031c cVar = (C86031c) dVar.f232621e.get(str);
            if (!(cVar == null || (map = (Map) dVar.f232620d.get(cVar.f232594b)) == null)) {
                map.remove(cVar.f232593a);
            }
        }
        this.f232622a.mo79642a(str);
    }

    /* renamed from: b */
    public final void mo79643b() {
        C86043d dVar = this.f232623b;
        synchronized (dVar.f232619c) {
            dVar.f232620d.clear();
            dVar.f232621e.clear();
        }
    }

    /* renamed from: c */
    public final String mo79644c(Account account, String str, C91032p pVar) {
        try {
            return m138347e(account, str, true, pVar);
        } catch (C21495d e) {
            throw new RuntimeException("Unexpected exception", e);
        }
    }

    /* renamed from: d */
    public final String mo79645d(Account account, String str, C91032p pVar) {
        try {
            return m138347e(account, str, false, pVar);
        } catch (C21496e e) {
            throw new RuntimeException("Unexpected exception", e);
        }
    }
}
