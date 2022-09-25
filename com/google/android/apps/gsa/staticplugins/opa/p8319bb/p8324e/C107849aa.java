package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.p6486s.C84261a;
import com.google.android.apps.gsa.p6486s.C84265e;
import com.google.android.apps.gsa.p6486s.C84267g;
import com.google.android.apps.gsa.p6486s.C84268h;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6588bg.C84839a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88453c;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.shared.p6975af.C89102a;
import com.google.android.apps.gsa.shared.p6975af.C89103b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107616a;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107617b;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109457c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38354e;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38358i;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52201iz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.aa */
/* compiled from: PG */
public final class C107849aa implements C107861am {

    /* renamed from: a */
    public static final C59071e f300101a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.aa");

    /* renamed from: b */
    public final C84839a f300102b;

    /* renamed from: c */
    public final C22871g f300103c;

    /* renamed from: d */
    public final C68214a f300104d;

    /* renamed from: e */
    public final C68214a f300105e;

    /* renamed from: f */
    public final C68214a f300106f;

    /* renamed from: g */
    public final AtomicBoolean f300107g = new AtomicBoolean(false);

    /* renamed from: h */
    public C107922z f300108h;

    /* renamed from: i */
    public C52176ia f300109i;

    /* renamed from: j */
    public int f300110j;

    /* renamed from: k */
    public final C89103b f300111k;

    /* renamed from: l */
    public C89102a f300112l;

    /* renamed from: m */
    public int f300113m;

    /* renamed from: n */
    private final C68214a f300114n;

    /* renamed from: o */
    private final C68214a f300115o;

    /* renamed from: p */
    private final C108100a f300116p;

    /* renamed from: q */
    private final C68214a f300117q;

    public C107849aa(C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C84839a aVar4, C68214a aVar5, C108100a aVar6, C68214a aVar7, C68214a aVar8) {
        C52176ia iaVar = null;
        this.f300108h = null;
        this.f300113m = 1;
        this.f300117q = aVar8;
        this.f300104d = aVar3;
        this.f300103c = gVar;
        this.f300115o = aVar2;
        this.f300114n = aVar;
        this.f300102b = aVar4;
        this.f300105e = aVar5;
        this.f300116p = aVar6;
        this.f300106f = aVar7;
        byte[] e = ((C86338r) aVar.mo27525b()).mo80079e(mo96309c(), (byte[]) null);
        if (e != null) {
            try {
                C107617b bVar = (C107617b) C62942bv.parseFrom((C62942bv) C107617b.f299379e, e);
                if ((bVar.f299381a & 4) != 0) {
                    C52176ia iaVar2 = bVar.f299384d;
                    iaVar = iaVar2 == null ? C52176ia.f136911k : iaVar2;
                }
            } catch (C62974ct e2) {
                C59104x d = f300101a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AudioPlayerSubCtrl");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(26223)).mo56386p("Invalid MediaSessionData proto stored in sharedpref.");
            }
        }
        this.f300109i = iaVar;
        C89103b bVar2 = new C89103b("CurrentIndexOnQueue");
        this.f300111k = bVar2;
        C52176ia iaVar3 = this.f300109i;
        if (iaVar3 != null) {
            bVar2.mo83075c(iaVar3.f136916d);
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: a */
    public final void mo96296a() {
        throw null;
    }

    /* renamed from: b */
    public final C60870cx mo96308b(C52176ia iaVar, C52176ia iaVar2, boolean z) {
        C84274n nVar = (C84274n) this.f300106f.mo27525b();
        if (this.f300108h == null) {
            C107922z zVar = new C107922z(this);
            this.f300108h = zVar;
            nVar.mo77791g(zVar);
        }
        if (!iaVar.equals(iaVar2)) {
            this.f300113m = 1;
            C84265e eVar = new C84265e();
            eVar.mo77768d(iaVar2);
            C38354e eVar2 = (C38354e) C38355f.f101543s.createBuilder();
            eVar2.copyOnWrite();
            C38355f fVar = (C38355f) eVar2.instance;
            fVar.f101546b = 1;
            fVar.f101545a |= 1;
            eVar2.copyOnWrite();
            C38355f fVar2 = (C38355f) eVar2.instance;
            fVar2.f101555k = 3;
            fVar2.f101545a |= 512;
            C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
            baVar.mo58885m(C38358i.f101564a, (C38355f) eVar2.build());
            eVar.f229323a = C58833ax.m90834k(new C84267g((C88431bb) baVar.build()));
            eVar.mo77766b(z);
            eVar.mo77767c(true);
            eVar.f229325c = C58833ax.m90834k("opa");
            return nVar.mo77789e(eVar.mo77765a());
        } else if (z) {
            return nVar.mo77787c(C84269i.PLAY);
        } else {
            return C60856cj.m92900i(C84272l.SUCCESS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo96309c() {
        return "opa_active_media_session_data_".concat(String.valueOf(((C86054o) this.f300115o.mo27525b()).mo79659F()));
    }

    /* renamed from: d */
    public final void mo96310d(C58833ax axVar, C58833ax axVar2) {
        boolean z = false;
        boolean booleanValue = ((Boolean) axVar.mo56106b(C107907k.f300249a).mo56109e(false)).booleanValue();
        if (!axVar2.mo56113h()) {
            z = booleanValue;
        } else if (booleanValue && ((C84275o) axVar2.mo56107c()).mo77800f() != 0) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f300107g.set(z);
    }

    /* renamed from: e */
    public final void mo96311e() {
        this.f300113m = 4;
        C89103b bVar = this.f300111k;
        this.f300110j = bVar.f241535a;
        C107908l lVar = new C107908l(this);
        this.f300112l = lVar;
        bVar.mo83073a(lVar);
    }

    /* renamed from: f */
    public final void mo96312f() {
        this.f300113m = 5;
        C89103b bVar = this.f300111k;
        this.f300110j = bVar.f241535a;
        C107904h hVar = new C107904h(this);
        this.f300112l = hVar;
        bVar.mo83073a(hVar);
    }

    /* renamed from: g */
    public final void mo96313g(C88458h hVar, C58833ax axVar) {
        ((C84261a) this.f300117q.mo27525b()).mo77747a(hVar);
        if (axVar.mo56113h() && (hVar.f239138a & 2) != 0) {
            if (this.f300109i == null) {
                C59104x c = f300101a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AudioPlayerSubCtrl");
                ((C59052c) ((C59052c) c).mo56372aa(26243)).mo56386p("MediaData not set");
                return;
            }
            C84268h hVar2 = (C84268h) axVar.mo56107c();
            boolean equals = hVar2.mo77750c().equals("opa");
            int a = C88453c.m142812a(hVar.f239140c);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                this.f300111k.mo83075c(equals ? hVar2.mo77748a() : 0);
                C52176ia iaVar = this.f300109i;
                iaVar.getClass();
                mo96316j(iaVar.f136917e);
            } else if (i == 2 && equals) {
                int a2 = hVar2.mo77748a();
                C52176ia iaVar2 = this.f300109i;
                iaVar2.getClass();
                if (a2 == iaVar2.f136914b.size() - 1) {
                    C52176ia iaVar3 = this.f300109i;
                    iaVar3.getClass();
                    int a3 = C52201iz.m86539a(iaVar3.f136918f);
                    if (a3 == 0 || a3 == 1) {
                        long j = iaVar3.f136917e;
                        if (this.f300116p.mo96449n()) {
                            C58976aa aaVar = C58975e.f156826a;
                            ((C107852ad) this.f300104d.mo27525b()).mo96320e(C109457c.m182152a(j, 2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo96314h(C88458h hVar, C58833ax axVar) {
        mo96310d(axVar, C58836b.f156633a);
        if (!axVar.mo56113h() || ((C84268h) axVar.mo56107c()).mo77750c().equals("opa") || (hVar.f239138a & 1) == 0 || this.f300109i == null) {
            mo96313g(hVar, axVar);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C52176ia iaVar = C52176ia.f136911k;
        C52176ia iaVar2 = this.f300109i;
        iaVar2.getClass();
        C90875ai.m148465b(new C107909m(this, hVar, axVar), mo96308b(iaVar, iaVar2, false), this.f300103c, "prepare-opa-media-player").mo85223a(new C107910n(this, hVar, axVar));
    }

    /* renamed from: i */
    public final void mo96315i() {
        C58976aa aaVar = C58975e.f156826a;
        new C90873ag(((C84274n) this.f300106f.mo27525b()).mo77786b(), this.f300103c, "send-media-session-token", new C107905i(this)).mo85223a(new C107906j(this));
    }

    /* renamed from: j */
    public final void mo96316j(long j) {
        C107616a aVar = (C107616a) C107617b.f299379e.createBuilder();
        aVar.copyOnWrite();
        C107617b bVar = (C107617b) aVar.instance;
        bVar.f299381a |= 2;
        bVar.f299383c = j;
        aVar.copyOnWrite();
        C107617b bVar2 = (C107617b) aVar.instance;
        bVar2.f299381a |= 1;
        bVar2.f299382b = Long.MAX_VALUE;
        C52176ia iaVar = this.f300109i;
        if (iaVar != null && this.f300111k.f241535a < iaVar.f136914b.size()) {
            C52176ia iaVar2 = this.f300109i;
            iaVar2.getClass();
            C52170hv hvVar = (C52170hv) iaVar2.toBuilder();
            int i = this.f300111k.f241535a;
            hvVar.copyOnWrite();
            C52176ia iaVar3 = (C52176ia) hvVar.instance;
            iaVar3.f136913a |= 8;
            iaVar3.f136916d = i;
            int i2 = this.f300111k.f241535a;
            C52171hw hwVar = (C52171hw) hvVar.mo53805a(i2).toBuilder();
            hwVar.copyOnWrite();
            C52174hz hzVar = (C52174hz) hwVar.instance;
            hzVar.f136894a |= 16;
            hzVar.f136898e = 0;
            hvVar.mo53810f(i2, hwVar);
            C52176ia iaVar4 = (C52176ia) hvVar.build();
            this.f300109i = iaVar4;
            aVar.copyOnWrite();
            C107617b bVar3 = (C107617b) aVar.instance;
            iaVar4.getClass();
            bVar3.f299384d = iaVar4;
            bVar3.f299381a |= 4;
        }
        C86337q b = ((C86338r) this.f300114n.mo27525b()).mo80076b();
        b.mo80068c(mo96309c(), ((C107617b) aVar.build()).toByteArray());
        b.apply();
    }
}
