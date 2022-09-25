package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.core.state.p6875g.C87072g;
import com.google.android.apps.gsa.search.core.state.p6875g.C87073h;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C90724ah;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.ssb.C45346c;
import com.google.android.ssb.C45347d;
import com.google.common.base.C58832aw;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61814g;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.google.android.apps.gsa.search.core.state.ai */
/* compiled from: PG */
public final class C86812ai extends C86898ct implements Observer {

    /* renamed from: a */
    public ClientConfig f234471a = ClientConfig.f236948a;

    /* renamed from: b */
    public long f234472b = 0;

    /* renamed from: c */
    public boolean f234473c;

    /* renamed from: d */
    public final C68214a f234474d;

    /* renamed from: e */
    public final C68214a f234475e;

    /* renamed from: f */
    public final C68214a f234476f;

    /* renamed from: g */
    public final C68214a f234477g;

    /* renamed from: h */
    private Bundle f234478h;

    /* renamed from: i */
    private C45347d f234479i;

    /* renamed from: j */
    private final BitFlags f234480j = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: k */
    private List f234481k;

    /* renamed from: l */
    private boolean f234482l = false;

    /* renamed from: m */
    private CardDecision f234483m;

    /* renamed from: n */
    private final C85232a f234484n;

    /* renamed from: o */
    private final C68214a f234485o;

    /* renamed from: p */
    private final C86792g f234486p;

    public C86812ai(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C85232a aVar5, C86792g gVar, C68214a aVar6, C86843bl blVar) {
        super(aVar6, 55);
        this.f234474d = aVar;
        this.f234475e = aVar3;
        this.f234476f = aVar4;
        this.f234477g = aVar2;
        this.f234484n = aVar5;
        this.f234486p = gVar;
        this.f234485o = aVar6;
        blVar.addObserver(this);
    }

    /* renamed from: a */
    public final String mo80516a() {
        C45347d dVar = this.f234479i;
        if (dVar == null) {
            return null;
        }
        C61790ai aiVar = dVar.f118536b;
        if (aiVar == null) {
            aiVar = C61790ai.f166898o;
        }
        if ((aiVar.f166900a & 16) == 0) {
            return null;
        }
        C61790ai aiVar2 = dVar.f118536b;
        if (aiVar2 == null) {
            aiVar2 = C61790ai.f166898o;
        }
        C61814g gVar = aiVar2.f166903d;
        if (gVar == null) {
            gVar = C61814g.f166984j;
        }
        return gVar.f166987b;
    }

    /* renamed from: b */
    public final void mo80517b(C87171z zVar, boolean z) {
        if (zVar.mo80791X() && this.f234471a.mo81871A()) {
            List i = zVar.mo80810i();
            VoiceAction f = zVar.mo80807f();
            CardDecision g = zVar.mo80808g();
            boolean z2 = this.f234482l;
            boolean z3 = false;
            if (f != null && f.mo81084w()) {
                z3 = true;
            }
            this.f234482l = z3;
            if (z || !C90724ah.m148178a(this.f234481k, i) || !C58832aw.m90831a(this.f234483m, g) || z2 != this.f234482l) {
                this.f234481k = i;
                this.f234483m = g;
                Query query = zVar.f235554i;
                ActionData actionData = zVar.f235555j;
                String str = actionData != null ? actionData.f236000j : null;
                if (str != null) {
                    query = query.mo84306ar(str);
                }
                this.f234484n.mo78815j(query, i, g, i != null ? i.indexOf(f) : -1);
            }
        }
        if (this.f234471a.mo81910z() && !zVar.mo80793Z() && zVar.f235552g.mo85049c(8, 0)) {
            this.f234484n.mo78818m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo80518e() {
        return this.f234472b != 0;
    }

    /* renamed from: f */
    public final boolean mo80519f() {
        if (this.f234479i == null || this.f234471a.mo81891i() || !((C87052fn) this.f234476f.mo27525b()).f235185u) {
            return false;
        }
        this.f234478h = null;
        this.f234479i = null;
        this.f234484n.mo78812g((C45347d) null);
        return true;
    }

    /* renamed from: g */
    public final boolean mo80520g(C87171z zVar, C86833bb bbVar, C87052fn fnVar, boolean z) {
        Query query = fnVar.f235177m;
        if (!this.f234471a.mo81902t() || !z || ((query.mo84456dj() && query.mo84403cj() && this.f234471a.mo81904u()) || (!bbVar.mo80530b() && (!query.mo84468dv() || (!zVar.mo80780L() && zVar.mo80791X() && !zVar.mo80793Z() && zVar.mo80781M(query)))))) {
            if (!this.f234480j.mo85049c(1, 0)) {
                return false;
            }
            this.f234484n.mo78814i(false);
            return true;
        } else if (!this.f234480j.mo85049c(0, 1)) {
            return false;
        } else {
            this.f234484n.mo78814i(true);
            return true;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActiveClientState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("currentClientId", Long.valueOf(this.f234472b));
        linkedHashMap.put("clientConfig", this.f234471a);
        linkedHashMap.put("hotwordDetectionEnabled", Boolean.valueOf(this.f234473c));
        linkedHashMap.put("Flags", this.f234480j.mo85048b());
        String a = mo80516a();
        if (a == null) {
            a = "NULL";
        }
        linkedHashMap.put("Assist Package", a);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148228b((Boolean) value));
            } else if (value instanceof Number) {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148230d((Number) value));
            } else {
                fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148233g(String.valueOf(value)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hn */
    public final void mo80406hn(C88432bc bcVar) {
        C87072g gVar = (C87072g) C87073h.f235271d.createBuilder();
        Bundle bundle = this.f234478h;
        if (bundle != null) {
            C63088z m = C90772bp.m148305m(bundle);
            gVar.copyOnWrite();
            C87073h hVar = (C87073h) gVar.instance;
            m.getClass();
            hVar.f235274a |= 1;
            hVar.f235275b = m;
        }
        bcVar.mo58885m(C87073h.f235272e, (C87073h) gVar.build());
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: hq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80407hq(com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd r3, int r4) {
        /*
            r2 = this;
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.core.state.p6875g.C87073h.f235272e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r3.mo58887l(r0)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r3 = r3.mo58854l(r1)
            if (r3 != 0) goto L_0x0016
            java.lang.Object r3 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r3 = r0.mo58889c(r3)
        L_0x001a:
            com.google.android.apps.gsa.search.core.state.g.h r3 = (com.google.android.apps.gsa.search.core.state.p6875g.C87073h) r3
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L_0x003b
            int r4 = r3.f235274a
            r4 = r4 & r1
            if (r4 == 0) goto L_0x003b
            com.google.protobuf.z r3 = r3.f235275b
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.apps.gsa.shared.util.C90772bp.m148301i(r3, r4)
            r0 = r3
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L_0x003b
            java.lang.Class<com.google.android.apps.gsa.search.core.state.ai> r3 = com.google.android.apps.gsa.search.core.state.C86812ai.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r0.setClassLoader(r3)
        L_0x003b:
            r2.m139980i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C86812ai.mo80407hq(com.google.android.apps.gsa.search.shared.service.c.b.bd, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        m139980i(bundle);
    }

    public final void update(Observable observable, Object obj) {
        C22872h.m42743c(C86593a.class);
        String str = this.f234486p.mo80446e().f236953f;
        String b = this.f234486p.mo80447f().mo81992b();
        boolean z = true;
        boolean z2 = this.f234472b != 0 && str.equals("search");
        if (((C86815al) this.f234477g.mo27525b()).f234493a == 0 || !b.equals("search")) {
            z = false;
        }
        if (z2 || z) {
            try {
                ((C87140ih) this.f234485o.mo27525b()).mo80554c();
            } finally {
                ((C87140ih) this.f234485o.mo27525b()).mo80555e();
            }
        }
    }

    /* renamed from: i */
    private final void m139980i(Bundle bundle) {
        C45347d dVar;
        if (bundle != this.f234478h) {
            this.f234478h = bundle;
            if (bundle == null) {
                dVar = null;
            } else {
                C61790ai c = C86152a.m138561c(bundle.getString("android.intent.extra.ASSIST_PACKAGE"), bundle.getBundle("android.intent.extra.ASSIST_CONTEXT"), System.currentTimeMillis());
                if (c == null) {
                    dVar = C45347d.f118533e;
                } else {
                    C45346c cVar = (C45346c) C45347d.f118533e.createBuilder();
                    cVar.copyOnWrite();
                    C45347d dVar2 = (C45347d) cVar.instance;
                    dVar2.f118536b = c;
                    dVar2.f118535a |= 2;
                    dVar = (C45347d) cVar.build();
                }
            }
            this.f234479i = dVar;
            this.f234484n.mo78812g(dVar);
            mo80519f();
            mo80591ar();
        }
    }
}
