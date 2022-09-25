package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.proactive.C84168d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7829lm;
import com.google.p375ai.p378b.C7831lo;
import com.google.p375ai.p378b.C7832lp;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.b */
/* compiled from: PG */
public final class C91262b {

    /* renamed from: a */
    public final C69464a f254707a;

    /* renamed from: b */
    public final C68214a f254708b;

    /* renamed from: c */
    private final C21370a f254709c;

    /* renamed from: d */
    private final C69464a f254710d;

    /* renamed from: e */
    private final C86124t f254711e;

    public C91262b(C69464a aVar, C68214a aVar2, C21370a aVar3, C69464a aVar4, C86124t tVar) {
        this.f254707a = aVar;
        this.f254709c = aVar3;
        this.f254708b = aVar2;
        this.f254710d = aVar4;
        this.f254711e = tVar;
    }

    /* renamed from: g */
    private final void m149180g(SharedPreferences.Editor editor, String str, String str2, String str3) {
        editor.putString(str, str3).putLong(str2, this.f254709c.mo26870b() + ((long) ((int) this.f254711e.mo79743a(C90010bp.f247002n))));
    }

    /* renamed from: a */
    public final String mo85530a(Account account) {
        C7832lp e;
        if (account.equals(((C86054o) this.f254708b.mo27525b()).mo79668a()) && (e = mo85534e(2, "com.google.android.apps.sidekick.FP_VERSION_INFO", "com.google.android.apps.sidekick.FP_VERSION_INFO_EXPIRATION")) != null) {
            return e.f27466c;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo85531b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7832lp lpVar = (C7832lp) it.next();
            if ((lpVar.f27464a & 1) != 0) {
                C84168d dVar = (C84168d) this.f254710d.mo17428b();
                int a = C7831lo.m22863a(lpVar.f27465b);
                if (a == 0) {
                    a = 1;
                }
                String str = lpVar.f27466c;
                if (dVar.f229115a.mo79668a() != null && dVar.f229116b.mo79141N() && a == 1) {
                    dVar.f229117c.mo77604e(C7642eo.BACKEND_DATA_VERSION_CHANGED);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo85532c(List list) {
        C90748e.m148224b();
        if (!list.isEmpty()) {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f254707a.mo17428b()).edit();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7832lp lpVar = (C7832lp) it.next();
                if ((lpVar.f27464a & 1) != 0) {
                    String str = lpVar.f27466c;
                    int i = lpVar.f27465b;
                    int a = C7831lo.m22863a(i);
                    if (a == 0 || a == 1) {
                        m149180g(edit, "com.google.android.apps.sidekick.KANSAS_VERSION_INFO", "com.google.android.apps.sidekick.KANSAS_VERSION_INFO_EXPIRATION", str);
                    } else {
                        int a2 = C7831lo.m22863a(i);
                        if (a2 != 0 && a2 == 2) {
                            m149180g(edit, "com.google.android.apps.sidekick.FP_VERSION_INFO", "com.google.android.apps.sidekick.FP_VERSION_INFO_EXPIRATION", str);
                        }
                    }
                }
            }
            edit.apply();
        }
    }

    /* renamed from: d */
    public final void mo85533d(String str) {
        C7829lm lmVar = (C7829lm) C7832lp.f27462d.createBuilder();
        lmVar.copyOnWrite();
        C7832lp lpVar = (C7832lp) lmVar.instance;
        lpVar.f27465b = 1;
        lpVar.f27464a = 1 | lpVar.f27464a;
        lmVar.copyOnWrite();
        C7832lp lpVar2 = (C7832lp) lmVar.instance;
        str.getClass();
        lpVar2.f27464a |= 2;
        lpVar2.f27466c = str;
        mo85532c(C58485gu.m89846n((C7832lp) lmVar.build()));
    }

    /* renamed from: e */
    public final C7832lp mo85534e(int i, String str, String str2) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f254707a.mo17428b();
        String string = sharedPreferences.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        if (sharedPreferences.getLong(str2, 0) > this.f254709c.mo26870b()) {
            C7829lm lmVar = (C7829lm) C7832lp.f27462d.createBuilder();
            lmVar.copyOnWrite();
            C7832lp lpVar = (C7832lp) lmVar.instance;
            lpVar.f27465b = i;
            lpVar.f27464a |= 1;
            lmVar.copyOnWrite();
            C7832lp lpVar2 = (C7832lp) lmVar.instance;
            lpVar2.f27464a |= 2;
            lpVar2.f27466c = string;
            return (C7832lp) lmVar.build();
        }
        sharedPreferences.edit().remove(str).remove(str2).apply();
        return null;
    }

    /* renamed from: f */
    public final void mo85535f(int i, String str) {
        C7829lm lmVar = (C7829lm) C7832lp.f27462d.createBuilder();
        lmVar.copyOnWrite();
        C7832lp lpVar = (C7832lp) lmVar.instance;
        lpVar.f27465b = i;
        lpVar.f27464a |= 1;
        lmVar.copyOnWrite();
        C7832lp lpVar2 = (C7832lp) lmVar.instance;
        str.getClass();
        lpVar2.f27464a |= 2;
        lpVar2.f27466c = str;
        mo85531b(C58485gu.m89846n((C7832lp) lmVar.build()));
    }
}
