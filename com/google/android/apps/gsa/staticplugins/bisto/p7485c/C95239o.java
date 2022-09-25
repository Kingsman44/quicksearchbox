package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.telephony.TelephonyManager;
import androidx.annotation.C0826b;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95646a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95668q;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94640d;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94642f;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95210y;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95278h;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95283m;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.o */
/* compiled from: PG */
public final class C95239o implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f266447a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.c.o");

    /* renamed from: b */
    public final Context f266448b;

    /* renamed from: c */
    public final C95283m f266449c;

    /* renamed from: d */
    public final C95237m f266450d;

    /* renamed from: e */
    public boolean f266451e;

    /* renamed from: f */
    public C94641e f266452f;

    /* renamed from: g */
    public C94641e f266453g;

    /* renamed from: h */
    public boolean f266454h;

    /* renamed from: i */
    public Optional f266455i = Optional.empty();

    /* renamed from: j */
    public C95646a f266456j;

    /* renamed from: k */
    private final C95355bf f266457k;

    /* renamed from: l */
    private final C95241q f266458l;

    /* renamed from: m */
    private final C22871g f266459m;

    /* renamed from: n */
    private final C95307m f266460n;

    /* renamed from: o */
    private final C21370a f266461o;

    /* renamed from: p */
    private C95285o f266462p;

    /* renamed from: q */
    private Integer f266463q;

    /* renamed from: r */
    private int f266464r;

    /* renamed from: s */
    private final C95235k f266465s = new C95235k(this);

    public C95239o(Context context, C95283m mVar, C95355bf bfVar, C95241q qVar, C22871g gVar, C95307m mVar2, C21370a aVar, C95850a aVar2) {
        this.f266448b = context;
        this.f266449c = mVar;
        this.f266457k = bfVar;
        this.f266458l = qVar;
        this.f266459m = gVar;
        this.f266460n = mVar2;
        this.f266461o = aVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar2.f268408a.add(this);
        this.f266450d = new C95237m(this);
    }

    /* renamed from: v */
    private final C95285o m157418v() {
        C95285o oVar = new C95285o(this.f266449c);
        this.f266462p = oVar;
        return oVar;
    }

    /* renamed from: w */
    private final void m157419w(C94641e eVar) {
        C95646a aVar = this.f266456j;
        if (aVar != null && this.f266453g == null) {
            C58976aa aaVar = C58975e.f156826a;
            C94641e eVar2 = (C94641e) aVar.f267696d.get();
            if (eVar2 != null && eVar == eVar2) {
                aVar.f267696d.set((Object) null);
                aVar.f267699g = null;
            }
            if (aVar.f267701i) {
                aVar.f267701i = false;
                return;
            }
            C95651ae aeVar = (C95651ae) aVar.f267695c.get();
            if (aVar.f267694b.mo89168p()) {
                return;
            }
            if (aeVar == null || !aeVar.mo89622f()) {
                C59104x b = C95646a.f267693a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AudControlInteractor");
                ((C59052c) ((C59052c) b).mo56372aa(16399)).mo56386p("Stopped, end interaction");
                aVar.mo89613a();
            }
        }
    }

    /* renamed from: x */
    private final void m157420x(Integer num) {
        C95213a aVar = new C95213a(this, mo89153b());
        C58976aa aaVar = C58975e.f156826a;
        this.f266454h = true;
        if (num == null) {
            aVar.mo88601a();
        } else if (this.f266449c.mo89192b(num.intValue(), aVar) == 0) {
            aVar.mo88601a();
        }
    }

    /* renamed from: a */
    public final C94640d mo89152a() {
        C94641e b = mo89153b();
        if (this.f266454h || b == null) {
            return null;
        }
        return b.mo88583b();
    }

    /* renamed from: b */
    public final C94641e mo89153b() {
        return this.f266450d.f266443a ? this.f266453g : this.f266452f;
    }

    /* renamed from: c */
    public final void mo89154c() {
        Integer num;
        C94641e b = mo89153b();
        if (b == null) {
            num = null;
        } else {
            num = b.mo88585d();
        }
        if (num != null) {
            this.f266457k.mo89277r(2);
        }
        if (this.f266450d.f266443a) {
            C58976aa aaVar = C58975e.f156826a;
            this.f266453g = null;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f266452f = null;
        }
        Integer num2 = this.f266463q;
        this.f266463q = null;
        if (num2 != null) {
            AudioManager audioManager = (AudioManager) this.f266448b.getSystemService("audio");
            if (audioManager.getStreamVolume(num2.intValue()) == this.f266464r) {
                audioManager.setStreamVolume(num2.intValue(), 0, 0);
            }
        }
    }

    public final void close() {
        mo89162j(3);
        C95237m mVar = this.f266450d;
        TelephonyManager telephonyManager = (TelephonyManager) mVar.f266445c.f266448b.getSystemService("phone");
        if (telephonyManager == null) {
            C59104x c = f266447a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoAudioController");
            ((C59052c) ((C59052c) c).mo56372aa(14684)).mo56386p("telephonyManager is null");
            return;
        }
        try {
            if (C1882h.m5137c(mVar.f266445c.f266448b, "android.permission.READ_PHONE_STATE") != 0) {
                C59104x b = f266447a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoAudioController");
                ((C59052c) ((C59052c) b).mo56372aa(14682)).mo56386p("Calling telephoneManager.listen() when we do not have phone state read permissions");
                return;
            }
            telephonyManager.listen(mVar.f266444b, 0);
        } catch (SecurityException e) {
            C59104x d = f266447a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoAudioController");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(14683)).mo56387q("SecurityException establishing phone call listener for event=%d", 0);
        }
    }

    /* renamed from: d */
    public final void mo89156d() {
        C94641e b = mo89153b();
        C58976aa aaVar = C58975e.f156826a;
        if (b == null) {
            if (!this.f266450d.f266443a) {
                mo89161i((C95294af) null);
            }
        } else if (!b.mo88594m()) {
            mo89161i((C95294af) null);
            C94641e b2 = mo89153b();
            mo89154c();
            if (b2 != null) {
                b2.mo88588g(0);
                m157419w(b2);
            }
        } else {
            C94641e b3 = mo89153b();
            if (b3 != null) {
                C95233i iVar = new C95233i(this, b3, new C95232h(this, b3));
                mo89161i((C95294af) null);
                if (!b3.mo88598q(m157418v(), iVar)) {
                    mo89162j(6);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo89157e() {
        C95285o oVar = this.f266462p;
        if (oVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (oVar.f266604a) {
                oVar.f266605b = false;
            }
            this.f266462p = null;
            C94641e b = mo89153b();
            if (b != null) {
                b.mo88593l();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo89158f() {
        int i = true != this.f266458l.mo89141e() ? 3 : 0;
        if (mo89169q(i)) {
            AudioManager audioManager = (AudioManager) this.f266448b.getSystemService("audio");
            int ceil = (int) Math.ceil((double) (((float) audioManager.getStreamMaxVolume(i)) * 0.2f));
            C58976aa aaVar = C58975e.f156826a;
            audioManager.setStreamVolume(i, ceil, 0);
            this.f266463q = Integer.valueOf(i);
            this.f266464r = ceil;
        }
        C95283m mVar = this.f266449c;
        mVar.f266599i.set(this.f266465s);
        mVar.mo89198h();
        mo89156d();
    }

    /* renamed from: g */
    public final void mo89159g(C95294af afVar) {
        C94641e b = mo89153b();
        if (b == null) {
            C94640d a = mo89152a();
            if (a != null) {
                a.mo88573g(true);
                return;
            }
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        b.mo88589h();
        mo89161i(afVar);
        mo89162j(5);
    }

    /* renamed from: h */
    public final void mo89160h() {
        Integer num;
        C94641e b = mo89153b();
        if (b == null) {
            num = null;
        } else {
            num = b.mo88585d();
        }
        if (num != null) {
            this.f266457k.mo89277r(num.intValue());
        }
        C60870cx cxVar = C118826c.f331423b;
        C95229e eVar = new C95229e(this);
        C90875ai.m148465b(eVar, cxVar, this.f266459m, "startDelivery").mo85223a(new C95230f(eVar));
    }

    /* renamed from: i */
    public final void mo89161i(C95294af afVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f266454h = false;
        mo89157e();
        C95283m mVar = this.f266449c;
        synchronized (mVar.f266592b) {
            mVar.mo89196f();
            C95210y yVar = mVar.f266594d;
            synchronized (yVar.f266362l) {
                yVar.f266371u = afVar;
            }
            yVar.mo89118j();
            mVar.f266595e.mo89095f(afVar);
            C95282l lVar = mVar.f266600j;
            mVar.f266600j = null;
            if (lVar != null) {
                C22871g gVar = mVar.f266593c;
                Objects.requireNonNull(lVar);
                gVar.mo28212l("stop", new C95278h(lVar));
            }
        }
    }

    /* renamed from: j */
    public final void mo89162j(int i) {
        boolean z = true;
        if (!(i == 6 || i == 1 || i == 5)) {
            z = false;
        }
        mo89161i((C95294af) null);
        C94641e b = mo89153b();
        if (b == null) {
            C58976aa aaVar = C58975e.f156826a;
            C94640d a = mo89152a();
            if (z && a != null) {
                a.mo88573g(false);
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            if (z) {
                b.mo88592k(false);
            }
            mo89154c();
        }
        if (b != null) {
            b.mo88588g(i);
            m157419w(b);
        }
    }

    /* renamed from: k */
    public final void mo89163k() {
        C94641e b = mo89153b();
        C58976aa aaVar = C58975e.f156826a;
        if (b != null && b.mo88596o()) {
            mo89161i((C95294af) null);
            if (!b.mo88600s() || !this.f266455i.isEmpty()) {
                mo89156d();
                return;
            }
            this.f266455i = Optional.m71637of(new C95240p(b, this.f266450d.f266443a));
            this.f266450d.mo89148a(true);
        }
    }

    /* renamed from: l */
    public final boolean mo89164l() {
        C94641e b = mo89153b();
        if (b == null) {
            return false;
        }
        return b.mo88596o();
    }

    /* renamed from: m */
    public final boolean mo89165m() {
        C94641e b = mo89153b();
        if (b == null) {
            return false;
        }
        return b.mo88597p();
    }

    /* renamed from: n */
    public final boolean mo89166n() {
        C58976aa aaVar = C58975e.f156826a;
        C94641e b = mo89153b();
        if (b == null || !b.mo88597p()) {
            return false;
        }
        mo89161i((C95294af) null);
        m157420x(b.mo88584c());
        return true;
    }

    /* renamed from: o */
    public final boolean mo89167o(C94641e eVar, boolean z) {
        if (this.f266450d.f266443a) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return mo89173u(eVar, z);
    }

    /* renamed from: p */
    public final boolean mo89168p() {
        return mo89152a() != null;
    }

    /* renamed from: q */
    public final boolean mo89169q(int i) {
        return ((AudioManager) this.f266448b.getSystemService("audio")).getStreamVolume(i) <= 0;
    }

    /* renamed from: r */
    public final boolean mo89170r(C94641e eVar) {
        if (!this.f266450d.f266443a) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C94641e eVar2 = this.f266453g;
        if (eVar2 != null) {
            C58976aa aaVar2 = C58975e.f156826a;
            eVar2.mo88588g(3);
        }
        C58976aa aaVar3 = C58975e.f156826a;
        this.f266453g = eVar;
        mo89160h();
        return true;
    }

    /* renamed from: s */
    public final void mo89171s(Set set, boolean z) {
        C94640d a = mo89152a();
        if (a != null) {
            if (set.isEmpty() || set.contains(a.mo88570d())) {
                C94641e b = mo89153b();
                C58976aa aaVar = C58975e.f156826a;
                if (b == null) {
                    a.mo88573g(z);
                } else {
                    b.mo88592k(z);
                }
                mo89161i((C95294af) null);
                mo89156d();
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }

    /* renamed from: t */
    public final void mo89172t() {
        C58976aa aaVar = C58975e.f156826a;
        C94641e b = mo89153b();
        if (b != null) {
            if (b.mo88595n()) {
                mo89161i((C95294af) null);
                m157420x(b.mo88587f());
            } else if (b.mo88596o() && mo89152a() != null) {
                mo89161i((C95294af) null);
                C94640d a = mo89152a();
                if (a == null) {
                    mo89156d();
                    return;
                }
                Context context = this.f266448b;
                C95307m mVar = this.f266460n;
                C21370a aVar = this.f266461o;
                String e = a.mo88571e();
                e.getClass();
                C94650n nVar = new C94650n(context, mVar, aVar, e, (Uri) null);
                C95231g gVar = new C95231g(this, mo89153b());
                C95285o v = m157418v();
                nVar.mo88581n(v, new C94642f(v, gVar));
            }
        }
    }

    /* renamed from: u */
    public final boolean mo89173u(C94641e eVar, boolean z) {
        C22872h.m42742b(C0826b.class);
        int i = 3;
        if (mo89169q(3) && !z) {
            return false;
        }
        if (true == z) {
            i = 4;
        }
        C58976aa aaVar = C58975e.f156826a;
        mo89162j(i);
        this.f266452f = eVar;
        mo89160h();
        C95646a aVar = this.f266456j;
        if (aVar != null) {
            aVar.f267701i = false;
            C95668q qVar = aVar.f267699g;
            if (qVar != null) {
                if (!qVar.f267813c && eVar == qVar.f267812b) {
                    qVar.f267811a.mo89220a(C95457c.f267104d);
                    qVar.f267813c = true;
                }
                if (aVar.f267699g.f267813c) {
                    aVar.f267699g = null;
                }
            }
        }
        return true;
    }
}
