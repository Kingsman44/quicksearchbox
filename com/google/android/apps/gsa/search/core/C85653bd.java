package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.search.core.p6513aj.C84519ad;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90013bs;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134238a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7661fg;
import com.google.p4283bv.p4354e.C57530o;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.bd */
/* compiled from: PG */
public final class C85653bd {

    /* renamed from: d */
    private static final C59071e f231511d = C59071e.m91332i("com.google.android.apps.gsa.search.core.bd");

    /* renamed from: a */
    public final C68214a f231512a;

    /* renamed from: b */
    public final C68214a f231513b;

    /* renamed from: c */
    public final C84519ad f231514c;

    /* renamed from: e */
    private final C86338r f231515e;

    /* renamed from: f */
    private final C68214a f231516f;

    /* renamed from: g */
    private final C68214a f231517g;

    /* renamed from: h */
    private final Object f231518h = new Object();

    /* renamed from: i */
    private final Map f231519i = new HashMap();

    public C85653bd(C86338r rVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C84519ad adVar, C68214a aVar4) {
        this.f231515e = rVar;
        this.f231512a = aVar;
        this.f231513b = aVar2;
        this.f231516f = aVar3;
        this.f231514c = adVar;
        this.f231517g = aVar4;
    }

    /* renamed from: d */
    public static String m137485d(String str) {
        return "now_feed_datasaver_".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public final int mo79164a(String str) {
        if (str == null) {
            return 2;
        }
        return this.f231515e.getInt(C90507o.f253031u.concat(str), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo79165b(String str) {
        if (((C90021c) this.f231516f.mo27525b()).mo79746e(C90013bs.f247019c) && mo79172j(str) && mo79171i()) {
            return (int) ((C90021c) this.f231516f.mo27525b()).mo79743a(C90013bs.f247027k);
        }
        if (str != null) {
            return this.f231515e.getInt(C90507o.f253022l.concat(str), -1);
        }
        return -1;
    }

    /* renamed from: c */
    public final C7661fg mo79166c(String str) {
        C7661fg fgVar = null;
        if (str == null) {
            return null;
        }
        synchronized (this.f231518h) {
            if (this.f231519i.containsKey(str)) {
                C7661fg fgVar2 = (C7661fg) this.f231519i.get(str);
                return fgVar2;
            }
            String str2 = "configuration_bytes_key_" + str;
            byte[] e = ((C86338r) this.f231512a.mo27525b()).mo80079e(str2, (byte[]) null);
            if (e != null) {
                try {
                    fgVar = (C7661fg) C62942bv.parseFrom((C62942bv) C7661fg.f26585n, e, C62921ba.m95368a());
                } catch (C62974ct e2) {
                    ((C59052c) ((C59052c) ((C59052c) f231511d.mo56225c()).mo56382g(e2)).mo56372aa(7422)).mo56386p("Error loading configuration");
                    C86337q b = ((C86338r) this.f231512a.mo27525b()).mo80076b();
                    b.mo80075j(str2);
                    b.apply();
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof C62974ct) {
                        ((C59052c) ((C59052c) ((C59052c) f231511d.mo56225c()).mo56382g(e3)).mo56372aa(7423)).mo56386p("Error loading configuration");
                        C86337q b2 = ((C86338r) this.f231512a.mo27525b()).mo80076b();
                        b2.mo80075j(str2);
                        b2.apply();
                    } else {
                        throw e3;
                    }
                }
            }
            this.f231519i.put(str, fgVar);
            return fgVar;
        }
    }

    /* renamed from: e */
    public final void mo79167e(String str, C7661fg fgVar) {
        synchronized (this.f231518h) {
            C86337q b = ((C86338r) this.f231512a.mo27525b()).mo80076b();
            String str2 = "configuration_bytes_key_" + str;
            if (fgVar != null) {
                b.mo80068c(str2, fgVar.toByteArray());
                b.apply();
            } else {
                b.mo80075j(str2);
                b.apply();
            }
            this.f231519i.put(str, fgVar);
        }
    }

    /* renamed from: f */
    public final void mo79168f(String str, int i) {
        C86337q b = this.f231515e.mo80076b();
        b.mo80070e(C90507o.f253031u.concat(str), i);
        b.apply();
    }

    @Deprecated
    /* renamed from: g */
    public final void mo79169g(int i) {
        ((C118561t) this.f231513b.mo27525b()).mo103752c(C118522by.NOW_UPDATE_GCM_REGISTRATION);
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long millis = TimeUnit.MINUTES.toMillis((long) i);
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = millis;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328824d = 1;
        agVar2.f328821a |= 4;
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        agVar3.f328821a |= 16;
        agVar3.f328826f = false;
        afVar.copyOnWrite();
        C118472ag agVar4 = (C118472ag) afVar.instance;
        agVar4.f328821a |= 8;
        agVar4.f328825e = false;
        ((C118561t) this.f231513b.mo27525b()).mo103754e(C118522by.NOW_UPDATE_GCM_REGISTRATION, (C118472ag) afVar.build());
    }

    /* renamed from: h */
    public final boolean mo79170h(String str) {
        if (str != null || this.f231514c.mo78233a()) {
            return ((C86338r) this.f231512a.mo27525b()).getBoolean(m137485d(str), false);
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo79171i() {
        long j = this.f231515e.getLong(C90507o.f253034x, 0);
        ((C134238a) this.f231517g.mo27525b()).mo111659b(j);
        return j > 0;
    }

    /* renamed from: j */
    public final boolean mo79172j(String str) {
        return ((C90021c) this.f231516f.mo27525b()).mo79746e(C90013bs.f247019c) && mo79164a(str) == 1;
    }

    /* renamed from: k */
    public final boolean mo79173k(String str) {
        if (((C90021c) this.f231516f.mo27525b()).mo79746e(C90013bs.f247019c)) {
            boolean z = mo79172j(str) && mo79171i();
            if (z || !((C90021c) this.f231516f.mo27525b()).mo79746e(C90013bs.f247023g)) {
                return z;
            }
        }
        return mo79165b(str) > 0;
    }

    /* renamed from: l */
    public final int mo79174l(String str) {
        int a;
        if (str == null || (a = C57530o.m88371a(((C86338r) this.f231512a.mo27525b()).getInt("now_user_activity_level_".concat(str), 0))) == 0) {
            return 1;
        }
        return a;
    }
}
