package com.google.android.apps.gsa.staticplugins.opa.samson.p8443o;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.cc;
import com.google.android.apps.gsa.assistant.shared.l.t;
import com.google.android.apps.gsa.assistant.shared.l.u;
import com.google.android.apps.gsa.assistant.shared.l.v;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110417d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110418e;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.o.s */
/* compiled from: PG */
public final class C110308s implements cc {

    /* renamed from: a */
    private static final C59071e f307442a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.o.s");

    /* renamed from: b */
    private final C68214a f307443b;

    /* renamed from: c */
    private final C110417d f307444c;

    /* renamed from: d */
    private final C110418e f307445d;

    public C110308s(C68214a aVar, C110417d dVar, C110418e eVar) {
        this.f307443b = aVar;
        this.f307444c = dVar;
        this.f307445d = eVar;
    }

    /* renamed from: i */
    private final String m183661i(String str) {
        String a = this.f307444c.mo98653a();
        if (a == null) {
            return null;
        }
        return a.concat(String.valueOf(str));
    }

    /* renamed from: j */
    private static final void m183662j(C86338r rVar, String str, u uVar) {
        C86337q b = rVar.mo80076b();
        b.mo80068c(str, uVar.build().toByteArray());
        b.apply();
    }

    /* renamed from: a */
    public final void mo98553a(Account account, t tVar) {
        String i = m183661i(account.name);
        if (i == null) {
            C59104x b = f307442a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TrustedDevicesStore");
            ((C59052c) ((C59052c) b).mo56372aa(25992)).mo56386p("no key, failed to save");
        } else if (mo98556d(Collections.unmodifiableList(mo98557e(i).instance.a), tVar.b) == null) {
            mo98559g(i, tVar);
            ((SharedPreferences) this.f307445d.f307771a.mo27525b()).edit().putBoolean(C110418e.m183882a(account.name, tVar.b), true).apply();
        }
    }

    /* renamed from: b */
    public final void mo98554b(Account account, t tVar) {
        String i = m183661i(account.name);
        if (i != null) {
            u e = mo98557e(i);
            int a = C58557jl.m90120a(Collections.unmodifiableList(e.instance.a), new C110306q(tVar));
            if (a >= 0) {
                String str = ((t) e.instance.a.get(a)).b;
                e.copyOnWrite();
                v vVar = e.instance;
                vVar.a();
                vVar.a.remove(a);
                m183662j((C86338r) this.f307443b.mo27525b(), i, e);
                ((SharedPreferences) this.f307445d.f307771a.mo27525b()).edit().remove(C110418e.m183882a(account.name, str)).apply();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo98555c(Account account, String str) {
        String i = m183661i(account.name);
        if (i == null || mo98556d(Collections.unmodifiableList(mo98557e(i).instance.a), str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final t mo98556d(List list, String str) {
        return (t) C58557jl.m90144y(list, new C110307r(str));
    }

    /* renamed from: e */
    public final u mo98557e(String str) {
        u createBuilder = v.b.createBuilder();
        byte[] e = ((C86338r) this.f307443b.mo27525b()).mo80079e(str, new byte[0]);
        if (e != null) {
            try {
                createBuilder.mergeFrom(e);
            } catch (C62974ct e2) {
                C59104x c = f307442a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TrustedDevicesStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(25993)).mo56386p("Corrupted metadata proto in SharedPreferences.");
            }
        }
        return createBuilder;
    }

    /* renamed from: f */
    public final String mo98558f(String str) {
        return "trusted_page_shown_prefix_".concat(String.valueOf(str));
    }

    /* renamed from: g */
    public final void mo98559g(String str, t tVar) {
        u e = mo98557e(str);
        e.copyOnWrite();
        v vVar = e.instance;
        v vVar2 = v.b;
        tVar.getClass();
        vVar.a();
        vVar.a.add(tVar);
        m183662j((C86338r) this.f307443b.mo27525b(), str, e);
    }

    /* renamed from: h */
    public final boolean mo98560h(Account account, String str) {
        return mo98556d(Collections.unmodifiableList(mo98557e(mo98558f(account.name)).instance.a), str) != null;
    }
}
