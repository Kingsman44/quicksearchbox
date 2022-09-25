package com.google.android.apps.gsa.sidekick.main.p7217l;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91758d;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91759e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.l.c */
/* compiled from: PG */
public final class C91458c {

    /* renamed from: a */
    public static final C59071e f255107a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.l.c");

    /* renamed from: b */
    private static final Map f255108b = new HashMap();

    /* renamed from: c */
    private static final Map f255109c = new HashMap();

    /* renamed from: a */
    static C91758d m149585a(Context context, C90929bz bzVar, String str, C68214a aVar, C90476a aVar2) {
        if (str == null) {
            return null;
        }
        return (C91758d) m149587c(f255108b, str, new C91456a(context, bzVar, str, aVar));
    }

    /* renamed from: b */
    static Boolean m149586b(C86054o oVar) {
        Account a = oVar.mo79668a();
        if (a == null) {
            return false;
        }
        return Boolean.valueOf(Boolean.TRUE.equals(m149587c(f255109c, a.name, new C91457b(oVar, a))));
    }

    /* renamed from: c */
    static Object m149587c(Map map, String str, Callable callable) {
        Object obj = map.get(str);
        if (obj != null) {
            return obj;
        }
        try {
            obj = callable.call();
            map.put(str, obj);
            return obj;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f255107a.mo56225c()).mo56382g(e)).mo56372aa(11735)).mo56386p("Error producing new account cache value");
            return obj;
        }
    }

    /* renamed from: d */
    public static String m149588d(C86054o oVar) {
        return oVar.mo79659F();
    }

    /* renamed from: e */
    static C91755a m149589e(C58833ax axVar, C69464a aVar, C69464a aVar2) {
        return ((C91759e) ((C58847bk) axVar).f156646a).mo86254a(aVar, aVar2);
    }
}
