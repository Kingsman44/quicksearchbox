package com.google.android.apps.gsa.staticplugins.bisto.p7487e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95131x;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95174a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95210y;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.e.m */
/* compiled from: PG */
public final class C95283m implements AutoCloseable, C87682aj {

    /* renamed from: a */
    public static final C59071e f266591a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.e.m");

    /* renamed from: b */
    public final Object f266592b = new Object();

    /* renamed from: c */
    public final C22871g f266593c;

    /* renamed from: d */
    public final C95210y f266594d;

    /* renamed from: e */
    public final C95186al f266595e;

    /* renamed from: f */
    public final C87673aa f266596f;

    /* renamed from: g */
    public C95131x f266597g;

    /* renamed from: h */
    public final AtomicReference f266598h = new AtomicReference(C60866ct.f164955a);

    /* renamed from: i */
    public final AtomicReference f266599i = new AtomicReference();

    /* renamed from: j */
    public C95282l f266600j;

    /* renamed from: k */
    private final C89656k f266601k;

    /* renamed from: l */
    private final C95286p f266602l;

    /* renamed from: m */
    private final AtomicReference f266603m = new AtomicReference(C60866ct.f164955a);

    public C95283m(C22871g gVar, C95210y yVar, C95186al alVar, C89656k kVar, C87673aa aaVar, C95286p pVar, C95850a aVar) {
        this.f266593c = gVar;
        this.f266594d = yVar;
        this.f266595e = alVar;
        this.f266601k = kVar;
        this.f266596f = aaVar;
        this.f266602l = pVar;
        C58976aa aaVar2 = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: k */
    private final Integer m157481k(C95209x xVar, C95174a aVar) {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        C90752i.m148233g(xVar.f266358a);
        if (!this.f266594d.mo89120l(xVar, aVar)) {
            m157482l(xVar);
            i = 0;
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: l */
    private final void m157482l(C95209x xVar) {
        C58976aa aaVar = C58975e.f156826a;
        C90752i.m148233g(xVar.f266358a);
        mo89195e();
    }

    /* renamed from: a */
    public final int mo89191a(long j, C95284n nVar) {
        boolean z;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f266592b) {
            if (mo89200j(nVar)) {
                C95210y yVar = this.f266594d;
                C95282l lVar = this.f266600j;
                lVar.getClass();
                if (yVar.mo89121m(j, lVar)) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            return 3;
        }
        mo89195e();
        return 0;
    }

    /* renamed from: b */
    public final int mo89192b(int i, C95284n nVar) {
        boolean j;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f266592b) {
            j = mo89200j(nVar);
            if (j) {
                C95186al alVar = this.f266595e;
                C95282l lVar = this.f266600j;
                lVar.getClass();
                alVar.mo89093d(i, lVar);
            }
        }
        if (j) {
            return 3;
        }
        C59104x d = f266591a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AudioPlayer");
        ((C59052c) ((C59052c) d).mo56372aa(14820)).mo56387q("Could not play sound effect: %d", i);
        mo89195e();
        return 0;
    }

    public final void close() {
        this.f266593c.mo28212l("Callback Deregistration", new C95274d(this));
        mo89196f();
    }

    /* renamed from: d */
    public final int mo89194d(C95209x xVar, C95284n nVar) {
        Optional optional;
        synchronized (this.f266592b) {
            if (mo89200j(nVar)) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f266602l.f266609c.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || this.f266597g == null) {
                    C95282l lVar = this.f266600j;
                    lVar.getClass();
                    int intValue = m157481k(xVar, lVar).intValue();
                    return intValue;
                }
                C95282l lVar2 = this.f266600j;
                lVar2.getClass();
                synchronized (lVar2.f266589e.f266592b) {
                    lVar2.f266585a = xVar;
                }
                CharSequence charSequence = xVar.f266358a;
                C95286p pVar = this.f266602l;
                C88489j jVar = new C88489j(C87739bu.PLAY_TTS);
                Bundle bundle = new Bundle();
                bundle.putCharSequence("TTS_STRING", charSequence);
                C89656k kVar = pVar.f266608b;
                Context context = pVar.f266609c;
                Optional n = C95210y.m157366n();
                if (n.isPresent()) {
                    optional = Optional.ofNullable(((Locale) n.get()).toLanguageTag());
                } else {
                    optional = Optional.empty();
                }
                bundle.putString("LOCALE", (String) optional.orElse(null));
                jVar.mo82015c(bundle);
                this.f266593c.mo28212l("playS3Tts", new C95272b(this, jVar.mo82013a()));
                return 3;
            }
            m157482l(xVar);
            return 0;
        }
    }

    /* renamed from: e */
    public final void mo89195e() {
        C95282l lVar;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f266592b) {
            lVar = this.f266600j;
            this.f266600j = null;
        }
        if (lVar != null) {
            C22871g gVar = this.f266593c;
            Objects.requireNonNull(lVar);
            gVar.mo28212l("error", new C95277g(lVar));
        }
    }

    /* renamed from: f */
    public final void mo89196f() {
        C58976aa aaVar = C58975e.f156826a;
        ((C60870cx) this.f266603m.get()).cancel(false);
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        this.f266593c.mo28212l("on-event", new C95271a(this, serviceEventData));
    }

    /* renamed from: g */
    public final void mo89197g() {
        C58976aa aaVar = C58975e.f156826a;
        ((C60870cx) this.f266598h.get()).cancel(false);
    }

    /* renamed from: h */
    public final void mo89198h() {
        long a = this.f266601k.mo83546a("audio_player_timeout_ms");
        mo89196f();
        C58976aa aaVar = C58975e.f156826a;
        ((C60870cx) this.f266603m.getAndSet(this.f266593c.mo28208h("timeout", a, new C95273c(this)))).cancel(false);
    }

    /* renamed from: i */
    public final void mo89199i() {
        C95282l lVar;
        C95209x xVar;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f266592b) {
            lVar = this.f266600j;
            if (lVar != null) {
                synchronized (lVar.f266589e.f266592b) {
                    xVar = lVar.f266585a;
                }
                if (xVar != null) {
                    synchronized (lVar.f266589e.f266592b) {
                        lVar.f266586b = true;
                    }
                }
            } else {
                xVar = null;
            }
        }
        if (lVar != null && xVar != null) {
            m157481k(xVar, lVar);
        }
    }

    /* renamed from: j */
    public final boolean mo89200j(C95284n nVar) {
        if (this.f266600j == null) {
            mo89196f();
            this.f266600j = new C95282l(this, nVar);
            return true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }
}
