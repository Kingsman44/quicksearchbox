package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.C0826b;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90926bw;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95028a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95110c;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7527c.C96053d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124552h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.p10712d.C142320az;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142346by;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142471go;
import com.google.android.p10712d.C142472gp;
import com.google.android.p10712d.C142500hq;
import com.google.android.p10712d.C142501hr;
import com.google.android.p10712d.C142502hs;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.ao */
/* compiled from: PG */
public abstract class C95724ao implements AutoCloseable, C95803ci, C95028a, C95712ac, C89495cg {

    /* renamed from: a */
    public static final C59071e f267982a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.ao");

    /* renamed from: l */
    private static final C58528ij f267983l = C58528ij.m90015O(C142359ck.PREPARE_VOICE_INPUT, C142359ck.PERFORM_VOICE_INPUT, C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT, C142359ck.COMPLETE_VOICE_INPUT, C142359ck.CANCEL_VOICE_INPUT, C142359ck.VOLUME_UP_ONCE, C142359ck.VOLUME_UP_START, C142359ck.VOLUME_UP_STOP, C142359ck.VOLUME_DOWN_ONCE, C142359ck.VOLUME_DOWN_START, C142359ck.VOLUME_DOWN_STOP, C142359ck.CALL_ANSWER, C142359ck.CALL_REJECT, C142359ck.CALL_HANGUP);

    /* renamed from: b */
    public final Context f267984b;

    /* renamed from: c */
    final AtomicReference f267985c = new AtomicReference((Object) null);

    /* renamed from: d */
    public final boolean f267986d;

    /* renamed from: e */
    public final C89656k f267987e;

    /* renamed from: f */
    public final String f267988f;

    /* renamed from: g */
    public final C96053d f267989g;

    /* renamed from: h */
    public final C95293ae f267990h;

    /* renamed from: i */
    public final C22871g f267991i;

    /* renamed from: j */
    public volatile int f267992j = 0;

    /* renamed from: k */
    public final AtomicReference f267993k = new AtomicReference((Object) null);

    /* renamed from: m */
    private final Set f267994m = new C0979i(0);

    /* renamed from: n */
    private final C22871g f267995n;

    /* renamed from: o */
    private final C60870cx f267996o;

    /* renamed from: p */
    private final C89496ch f267997p;

    /* renamed from: q */
    private final C90926bw f267998q;

    /* renamed from: r */
    private final C95355bf f267999r;

    /* renamed from: s */
    private final C95357bh f268000s;

    /* renamed from: t */
    private final BroadcastReceiver f268001t = new C95721al(this);

    /* renamed from: u */
    private final BroadcastReceiver f268002u = new C95722am(this);

    public C95724ao(Context context, C22871g gVar, C22871g gVar2, C89496ch chVar, C90926bw bwVar, C95293ae aeVar, C95850a aVar, boolean z, C89656k kVar, C95355bf bfVar, C96053d dVar, C95357bh bhVar) {
        this.f267984b = context;
        this.f267995n = gVar;
        this.f267991i = gVar2;
        this.f267997p = chVar;
        this.f267998q = bwVar;
        this.f267990h = aeVar;
        this.f267986d = z;
        this.f267987e = kVar;
        String k = bfVar.mo89270k();
        this.f267988f = k;
        this.f267989g = dVar;
        this.f267999r = bfVar;
        this.f268000s = bhVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
        C60870cx o = chVar.mo83409o(k);
        this.f267996o = o;
        new C90873ag(o, gVar2, "notify", new C95714ae(this, context, kVar)).mo85223a(C95715af.f267970a);
    }

    /* renamed from: m */
    public static String m158504m(C142324bc bcVar) {
        C142346by byVar = bcVar.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142320az azVar = byVar.f386226f;
        if (azVar == null) {
            azVar = C142320az.f386099j;
        }
        return azVar.f386103c;
    }

    /* renamed from: o */
    public static String m158505o(C124548d dVar) {
        return C58837ba.m90858g(dVar.mo106481V());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo89680A() {
        C95110c cVar = (C95110c) this.f267985c.get();
        if (cVar != null && cVar.mo89041h()) {
            cVar.mo89032e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo89681B() {
        C95110c cVar = (C95110c) this.f267985c.get();
        if (cVar != null && cVar.mo89041h()) {
            cVar.mo89033f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo89682C(int i) {
        C22872h.m42742b(C0826b.class);
        this.f267992j = i;
    }

    /* renamed from: D */
    public final void mo89683D() {
        C22872h.m42742b(C0826b.class);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.gsa.shared.bisto.action.BIND_EXTERNAL_VOICE_SERVICE");
        intentFilter.addAction("com.google.android.apps.gsa.shared.bisto.action.UNBIND_EXTERNAL_VOICE_SERVICE");
        this.f267984b.registerReceiver(this.f268001t, intentFilter);
        C58976aa aaVar = C58975e.f156826a;
        this.f267984b.registerReceiver(this.f268002u, new IntentFilter("com.google.android.apps.gsa.shared.bisto.action.SDK_REQUEST"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo89684E(C142500hq hqVar) {
        ComponentName a;
        C58976aa aaVar = C58975e.f156826a;
        Context context = this.f267984b;
        Intent c = C95795ca.m158754c("com.google.android.apps.gsa.shared.bisto.action.SDK_BACKGROUND_ACTION", hqVar, this.f267987e, mo89692l());
        if (c == null || (a = C95795ca.m158752a(context, c)) == null) {
            c = null;
        } else {
            c.setComponent(a);
        }
        if (c != null) {
            String a2 = this.f267989g.mo89909a(this.f267988f);
            C142501hr hrVar = (C142501hr) C142502hs.f386704b.createBuilder();
            hrVar.copyOnWrite();
            a2.getClass();
            ((C142502hs) hrVar.instance).f386706a = a2;
            C142502hs hsVar = (C142502hs) hrVar.build();
            C142471go goVar = (C142471go) C142472gp.f386640c.createBuilder();
            goVar.copyOnWrite();
            C142472gp gpVar = (C142472gp) goVar.instance;
            hsVar.getClass();
            gpVar.f386643b = hsVar;
            gpVar.f386642a = 2;
            c.putExtra("bisto_sdk_payload", ((C142472gp) goVar.build()).toByteArray());
            this.f267984b.sendBroadcast(c);
        }
    }

    /* renamed from: G */
    public final boolean mo89685G() {
        C95110c cVar = (C95110c) this.f267985c.get();
        return cVar != null && cVar.mo89041h();
    }

    /* renamed from: H */
    public abstract boolean mo89686H();

    /* renamed from: I */
    public final void mo89687I(Intent intent, int i) {
        C22872h.m42742b(C0826b.class);
        C58976aa aaVar = C58975e.f156826a;
        C95110c cVar = (C95110c) this.f267985c.get();
        if (cVar != null && cVar.mo89040g()) {
            cVar.mo89034i(intent, i);
        }
    }

    /* renamed from: a */
    public final int mo89688a() {
        return this.f267992j;
    }

    /* renamed from: b */
    public final void mo89673b(C95711ab abVar) {
        this.f267994m.add(abVar);
        if (mo89685G()) {
            abVar.mo89671e();
        } else {
            abVar.mo89672h();
        }
    }

    /* renamed from: c */
    public final void mo88997c() {
        this.f268000s.mo89293f(this.f267999r);
        mo89711Q();
    }

    public final void close() {
        C22872h.m42742b(C0826b.class);
        this.f267994m.clear();
        try {
            this.f267984b.unregisterReceiver(this.f268001t);
            C58976aa aaVar = C58975e.f156826a;
        } catch (IllegalArgumentException e) {
            C59104x c = f267982a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ExtVoiceInHandler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15264)).mo56386p("could not unregister remote voice connection broadcast receiver");
        }
        try {
            this.f267984b.unregisterReceiver(this.f268002u);
        } catch (IllegalArgumentException e2) {
            C59104x c2 = f267982a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ExtVoiceInHandler");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(15266)).mo56386p("could not unregister request receiver");
        }
        mo89687I((Intent) null, 3);
        this.f267993k.set((Object) null);
        mo89682C(0);
    }

    /* renamed from: d */
    public final void mo88998d() {
        this.f268000s.mo89294g(this.f267999r);
        mo89711Q();
    }

    /* renamed from: e */
    public final void mo89674e(C95711ab abVar) {
        this.f267994m.remove(abVar);
    }

    /* renamed from: f */
    public final void mo88999f() {
        this.f268000s.mo89295h(this.f267999r);
        mo89710P((C95288a) null, (PlaybackStatus) null);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (this.f267988f.equals(str)) {
            mo89699y(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C95723an mo89690h() {
        return (C95723an) this.f267993k.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C95723an mo89691i() {
        C58976aa aaVar = C58975e.f156826a;
        C95723an anVar = new C95723an();
        this.f267993k.set(anVar);
        return anVar;
    }

    /* renamed from: l */
    public final String mo89692l() {
        C124552h hVar = (C124552h) C90877ak.m148475i(this.f267996o, (Object) null);
        if (hVar != null) {
            return m158504m(hVar.mo106530b());
        }
        return null;
    }

    /* renamed from: n */
    public final String mo89693n() {
        C124552h hVar = (C124552h) C90877ak.m148475i(this.f267996o, (Object) null);
        if (hVar != null) {
            return m158505o(hVar.mo106529a());
        }
        return null;
    }

    /* renamed from: p */
    public final void mo88942p() {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        C0978h hVar = new C0978h((C0979i) this.f267994m);
        while (hVar.hasNext()) {
            ((C95711ab) hVar.next()).mo89671e();
        }
        this.f267997p.mo83360B(new C58759qy(29), this);
        new C90873ag(this.f267997p.mo83408n(this.f267988f), this.f267995n, "sendOhdStatus", new C95716ag(this)).mo85223a(C95717ah.f267972a);
    }

    /* renamed from: q */
    public final boolean mo89694q(C142359ck ckVar) {
        if (mo89685G()) {
            return f267983l.contains(ckVar);
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo89695r() {
        return true;
    }

    /* renamed from: s */
    public final void mo88943s() {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        this.f267985c.set((Object) null);
        C0978h hVar = new C0978h((C0979i) this.f267994m);
        while (hVar.hasNext()) {
            ((C95711ab) hVar.next()).mo89672h();
        }
        this.f267997p.mo83379U(this);
    }

    /* renamed from: t */
    public final boolean mo89696t() {
        return this.f267992j == 2;
    }

    /* renamed from: u */
    public final void mo88944u() {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        this.f268000s.mo89293f(this.f267999r);
        mo89711Q();
    }

    /* renamed from: v */
    public final void mo88945v() {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        this.f268000s.mo89295h(this.f267999r);
        mo89710P((C95288a) null, (PlaybackStatus) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo89697w(Runnable runnable) {
        C90875ai.m148465b(C95719aj.f267975a, this.f267998q.mo85235a(new C95718ai(this, runnable)), this.f267991i, "external-voice-service").mo85223a(C95720ak.f267976a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo89698x(C95723an anVar) {
        C58976aa aaVar = C58975e.f156826a;
        anVar.f267979a.position();
        ByteBuffer asReadOnlyBuffer = anVar.f267979a.asReadOnlyBuffer();
        asReadOnlyBuffer.position(0);
        int i = anVar.f267980b.get();
        int i2 = 0;
        while (true) {
            int min = Math.min(8000, i - i2);
            if (min > 0) {
                byte[] bArr = new byte[min];
                asReadOnlyBuffer.get(bArr, 0, min);
                mo89700z(bArr);
                i2 += min;
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    public final void mo89699y(C124548d dVar) {
        C95110c cVar = (C95110c) this.f267985c.get();
        if (cVar != null && cVar.mo89040g()) {
            cVar.mo89030c(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo89700z(byte[] bArr) {
        C95110c cVar = (C95110c) this.f267985c.get();
        if (cVar != null && cVar.mo89041h()) {
            cVar.mo89031d(bArr);
        }
    }
}
