package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b;

import com.google.android.apps.gsa.sidekick.shared.p7254o.C91880d;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.android.youtube.player.C45510f;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45447af;
import com.google.android.youtube.player.p3561b.C45448ag;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54785e;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54791k;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54794n;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54795o;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54796p;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54797q;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54798r;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54800t;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54802v;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54803w;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54804x;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.c */
/* compiled from: PG */
public final class C105022c implements C91881e {

    /* renamed from: a */
    public boolean f292641a = false;

    /* renamed from: b */
    public Optional f292642b;

    /* renamed from: c */
    public int f292643c = 1;

    /* renamed from: d */
    int f292644d = 1;

    /* renamed from: e */
    private final long f292645e;

    /* renamed from: f */
    private final String f292646f;

    /* renamed from: g */
    private final String f292647g;

    /* renamed from: h */
    private final C21370a f292648h;

    /* renamed from: i */
    private final boolean f292649i;

    /* renamed from: j */
    private final Optional f292650j;

    /* renamed from: k */
    private final Optional f292651k;

    /* renamed from: l */
    private boolean f292652l;

    /* renamed from: m */
    private long f292653m;

    /* renamed from: n */
    private boolean f292654n;

    /* renamed from: o */
    private C54795o f292655o;

    /* renamed from: p */
    private C54798r f292656p;

    /* renamed from: q */
    private C54797q f292657q;

    /* renamed from: r */
    private final int f292658r;

    /* renamed from: s */
    private final int f292659s;

    public C105022c(long j, int i, String str, String str2, int i2, C21370a aVar, boolean z, Optional optional, Optional optional2) {
        boolean z2 = true;
        if (str == null && str2 == null) {
            z2 = false;
        }
        C58838bb.m90869d(z2, "Either videoId or videoUrl must be present");
        this.f292645e = j;
        this.f292646f = str;
        this.f292647g = str2;
        this.f292658r = i;
        this.f292659s = i2;
        this.f292648h = aVar;
        this.f292649i = z;
        this.f292650j = optional;
        this.f292651k = optional2;
        this.f292642b = Optional.empty();
    }

    /* renamed from: p */
    private final long m174203p(long j) {
        return j + (this.f292648h.mo26870b() - this.f292653m);
    }

    /* renamed from: q */
    private final void m174204q(C54803w wVar) {
        C58976aa aaVar = C58975e.f156826a;
        m174205r((C54796p) null, wVar, (C54794n) null, false, true);
        this.f292657q = null;
    }

    /* renamed from: r */
    private final void m174205r(C54796p pVar, C54803w wVar, C54794n nVar, boolean z, boolean z2) {
        C54804x xVar = (C54804x) C54806z.f143773n.createBuilder();
        long j = this.f292645e;
        xVar.copyOnWrite();
        C54806z zVar = (C54806z) xVar.instance;
        zVar.f143775a |= 16;
        zVar.f143780f = j;
        int i = this.f292659s;
        xVar.copyOnWrite();
        C54806z zVar2 = (C54806z) xVar.instance;
        zVar2.f143782h = i - 1;
        zVar2.f143775a |= 64;
        String str = this.f292646f;
        if (str != null) {
            xVar.copyOnWrite();
            C54806z zVar3 = (C54806z) xVar.instance;
            zVar3.f143775a |= 128;
            zVar3.f143783i = str;
        }
        String str2 = this.f292647g;
        if (str2 != null) {
            xVar.copyOnWrite();
            C54806z zVar4 = (C54806z) xVar.instance;
            zVar4.f143775a |= 256;
            zVar4.f143784j = str2;
        }
        int i2 = this.f292658r;
        if (i2 != 0) {
            xVar.copyOnWrite();
            C54806z zVar5 = (C54806z) xVar.instance;
            zVar5.f143785k = i2 - 1;
            zVar5.f143775a |= 512;
        }
        if (pVar != null) {
            xVar.copyOnWrite();
            C54806z zVar6 = (C54806z) xVar.instance;
            zVar6.f143776b = pVar;
            zVar6.f143775a |= 1;
        }
        if (wVar != null) {
            xVar.copyOnWrite();
            C54806z zVar7 = (C54806z) xVar.instance;
            zVar7.f143777c = wVar;
            zVar7.f143775a |= 2;
        }
        if (nVar != null) {
            xVar.copyOnWrite();
            C54806z zVar8 = (C54806z) xVar.instance;
            zVar8.f143778d = nVar;
            zVar8.f143775a |= 4;
        }
        if (this.f292650j.isPresent()) {
            C54785e eVar = (C54785e) this.f292650j.get();
            xVar.copyOnWrite();
            C54806z zVar9 = (C54806z) xVar.instance;
            eVar.getClass();
            zVar9.f143786l = eVar;
            zVar9.f143775a |= 1024;
        }
        xVar.copyOnWrite();
        C54806z zVar10 = (C54806z) xVar.instance;
        zVar10.f143775a |= 32;
        zVar10.f143781g = z;
        boolean z3 = this.f292654n;
        xVar.copyOnWrite();
        C54806z zVar11 = (C54806z) xVar.instance;
        zVar11.f143775a |= 2048;
        zVar11.f143787m = z3;
        if (this.f292651k.isPresent()) {
            ((Consumer) this.f292651k.get()).accept((C54806z) xVar.build());
        }
        if (z2) {
            this.f292655o = null;
            this.f292656p = null;
        }
    }

    /* renamed from: s */
    private static int m174206s(int i) {
        C45510f fVar = C45510f.SUCCESS;
        int i2 = i - 1;
        if (i2 == 1) {
            return 26;
        }
        if (i2 == 2) {
            return 27;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 29;
        }
        return 28;
    }

    /* renamed from: a */
    public final void mo86413a() {
        C54795o oVar = this.f292655o;
        if (oVar != null && (((C54796p) oVar.instance).f143748a & 64) != 0) {
            m174205r((C54796p) oVar.build(), (C54803w) null, (C54794n) null, false, true);
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: b */
    public final void mo86414b() {
        C54795o oVar = this.f292655o;
        if (oVar != null) {
            int i = ((C54796p) oVar.instance).f143748a;
            if ((i & 4) != 0 || (i & 16) != 0) {
                m174205r((C54796p) oVar.build(), (C54803w) null, (C54794n) null, false, true);
                C58976aa aaVar = C58975e.f156826a;
                this.f292652l = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo86415c() {
        if (!this.f292652l) {
            m174205r((C54796p) null, (C54803w) null, (C54794n) null, true, false);
            C58976aa aaVar = C58975e.f156826a;
            this.f292652l = true;
            mo86418f(3);
        }
    }

    /* renamed from: d */
    public final void mo86416d(C91880d dVar) {
        this.f292642b = Optional.m71637of(dVar);
    }

    /* renamed from: e */
    public final void mo86417e(boolean z) {
        this.f292654n = z;
    }

    /* renamed from: f */
    public final void mo86418f(int i) {
        if (this.f292655o != null || (i != 6 && i != 5 && i != 2 && i != 8)) {
            long b = this.f292648h.mo26870b();
            if (this.f292655o == null) {
                this.f292655o = (C54795o) C54796p.f143746k.createBuilder();
            }
            C45510f fVar = C45510f.SUCCESS;
            switch (i - 1) {
                case 0:
                    C54795o oVar = this.f292655o;
                    oVar.copyOnWrite();
                    C54796p pVar = (C54796p) oVar.instance;
                    C54796p pVar2 = C54796p.f143746k;
                    pVar.f143748a |= 1;
                    pVar.f143749b = b;
                    return;
                case 1:
                    C54795o oVar2 = this.f292655o;
                    oVar2.copyOnWrite();
                    C54796p pVar3 = (C54796p) oVar2.instance;
                    C54796p pVar4 = C54796p.f143746k;
                    pVar3.f143748a |= 2;
                    pVar3.f143750c = b;
                    return;
                case 2:
                    C54795o oVar3 = this.f292655o;
                    if ((((C54796p) oVar3.instance).f143748a & 16) == 0) {
                        oVar3.copyOnWrite();
                        C54796p pVar5 = (C54796p) oVar3.instance;
                        pVar5.f143748a |= 16;
                        pVar5.f143753f = b;
                        return;
                    }
                    return;
                case 3:
                    C54795o oVar4 = this.f292655o;
                    oVar4.copyOnWrite();
                    C54796p pVar6 = (C54796p) oVar4.instance;
                    C54796p pVar7 = C54796p.f143746k;
                    pVar6.f143748a |= 4;
                    pVar6.f143751d = b;
                    return;
                case 4:
                    C54795o oVar5 = this.f292655o;
                    oVar5.copyOnWrite();
                    C54796p pVar8 = (C54796p) oVar5.instance;
                    C54796p pVar9 = C54796p.f143746k;
                    pVar8.f143748a |= 8;
                    pVar8.f143752e = b;
                    return;
                case 5:
                    C54795o oVar6 = this.f292655o;
                    oVar6.copyOnWrite();
                    C54796p pVar10 = (C54796p) oVar6.instance;
                    C54796p pVar11 = C54796p.f143746k;
                    pVar10.f143748a |= 32;
                    pVar10.f143754g = b;
                    C58976aa aaVar = C58975e.f156826a;
                    m174205r((C54796p) this.f292655o.build(), (C54803w) null, (C54794n) null, false, true);
                    return;
                case 6:
                    C54795o oVar7 = this.f292655o;
                    oVar7.copyOnWrite();
                    C54796p pVar12 = (C54796p) oVar7.instance;
                    C54796p pVar13 = C54796p.f143746k;
                    pVar12.f143748a |= 64;
                    pVar12.f143755h = b;
                    return;
                default:
                    C54795o oVar8 = this.f292655o;
                    oVar8.copyOnWrite();
                    C54796p pVar14 = (C54796p) oVar8.instance;
                    C54796p pVar15 = C54796p.f143746k;
                    pVar14.f143748a |= 128;
                    pVar14.f143756i = b;
                    C58976aa aaVar2 = C58975e.f156826a;
                    m174205r((C54796p) this.f292655o.build(), (C54803w) null, (C54794n) null, false, true);
                    return;
            }
        }
    }

    /* renamed from: h */
    public final void mo86420h(int i, boolean z) {
        C54803w wVar;
        C54796p pVar;
        C54798r rVar;
        C54791k kVar = (C54791k) C54794n.f143741d.createBuilder();
        kVar.copyOnWrite();
        C54794n nVar = (C54794n) kVar.instance;
        nVar.f143744b = i - 1;
        nVar.f143743a |= 1;
        kVar.copyOnWrite();
        C54794n nVar2 = (C54794n) kVar.instance;
        nVar2.f143743a |= 2;
        nVar2.f143745c = z;
        C54794n nVar3 = (C54794n) kVar.build();
        C54798r rVar2 = this.f292656p;
        if (rVar2 != null) {
            long j = ((C54800t) rVar2.instance).f143763c;
            rVar2.copyOnWrite();
            C54800t tVar = (C54800t) rVar2.instance;
            tVar.f143762b = 12;
            tVar.f143761a |= 2;
            long p = m174203p(j);
            rVar2.copyOnWrite();
            C54800t tVar2 = (C54800t) rVar2.instance;
            tVar2.f143761a |= 8;
            tVar2.f143764d = p;
            C54797q qVar = this.f292657q;
            if (!(qVar == null || (rVar = this.f292656p) == null)) {
                qVar.mo54154b(rVar);
            }
        }
        C54797q qVar2 = this.f292657q;
        if (qVar2 == null) {
            wVar = null;
        } else {
            wVar = (C54803w) qVar2.build();
        }
        C54795o oVar = this.f292655o;
        if (oVar == null) {
            pVar = null;
        } else {
            pVar = (C54796p) oVar.build();
        }
        m174205r(pVar, wVar, nVar3, false, true);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: hW */
    public final void mo44142hW() {
        mo86419g(4);
    }

    /* renamed from: i */
    public final void mo44143i(int i) {
        mo86420h(m174206s(i), false);
    }

    /* renamed from: j */
    public final void mo44144j(int i) {
        if (i == 6) {
            mo94477o(Duration.ZERO, 4);
            mo86419g(13);
            return;
        }
        mo86420h(m174206s(5), true);
    }

    /* renamed from: k */
    public final void mo44145k(int i, C41607i iVar) {
        int a;
        C45510f fVar = C45510f.SUCCESS;
        int i2 = 4;
        switch (i - 1) {
            case 1:
                if (true == this.f292649i) {
                    i2 = 7;
                }
                mo86418f(i2);
                return;
            case 2:
                mo86419g(3);
                return;
            case 3:
                mo86418f(5);
                mo86418f(6);
                mo94477o(iVar.mo44176z(), 2);
                return;
            case 4:
                mo86418f(8);
                mo94477o(iVar.mo44176z(), 4);
                return;
            case 5:
                C54797q qVar = this.f292657q;
                if (!(qVar == null || (a = C54802v.m87532a(((C54803w) qVar.instance).f143770b)) == 0 || a != 4)) {
                    mo86419g(5);
                }
                mo86418f(8);
                mo94477o(iVar.mo44176z(), 3);
                return;
            case 6:
                mo86419g(8);
                return;
            case 7:
                mo86419g(5);
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo44104l(Object obj) {
        int i;
        C45510f fVar = (C45510f) obj;
        if (fVar != C45510f.SUCCESS) {
            switch (fVar.ordinal()) {
                case 1:
                    i = 3;
                    break;
                case 3:
                    i = 16;
                    break;
                case 4:
                    i = 17;
                    break;
                case 5:
                    i = 18;
                    break;
                case 6:
                    i = 19;
                    break;
                case 7:
                    i = 20;
                    break;
                case 8:
                    i = 21;
                    break;
                case 9:
                    i = 4;
                    break;
                case 10:
                    i = 22;
                    break;
                case 11:
                    i = 23;
                    break;
                default:
                    i = 1;
                    break;
            }
            mo86420h(i, false);
            return;
        }
        mo86418f(2);
    }

    /* renamed from: m */
    public final void mo44073m(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment, C45448ag agVar) {
        int i;
        C45510f fVar = C45510f.SUCCESS;
        int i2 = agVar.f118867b - 1;
        if (i2 == 0) {
            this.f292644d = 2;
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.f292644d = 3;
                    return;
                } else if (i2 != 4) {
                    return;
                }
            }
            mo86419g(3);
        } else {
            if (this.f292641a) {
                i = this.f292643c;
            } else {
                i = this.f292644d;
            }
            if (i == 3) {
                mo86418f(8);
            } else {
                mo86418f(5);
                mo86418f(6);
            }
            mo94477o(Duration.ofMillis(agVar.f118866a), i);
        }
    }

    /* renamed from: n */
    public final void mo44074n(C45447af afVar) {
        int i;
        C45510f fVar = C45510f.SUCCESS;
        switch (afVar.f118865a - 1) {
            case 0:
                i = 2;
                break;
            case 1:
            case 8:
                i = 4;
                break;
            case 2:
                i = 13;
                break;
            case 3:
                i = 14;
                break;
            case 4:
                i = 15;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 9;
                break;
            case 9:
                i = 3;
                break;
            default:
                i = 1;
                break;
        }
        mo86420h(i, false);
    }

    /* renamed from: o */
    public final void mo94477o(Duration duration, int i) {
        if (this.f292641a) {
            i = this.f292643c;
        }
        if (this.f292656p == null) {
            if (this.f292657q == null) {
                C54797q qVar = (C54797q) C54803w.f143767d.createBuilder();
                qVar.copyOnWrite();
                C54803w wVar = (C54803w) qVar.instance;
                int i2 = i - 1;
                if (i != 0) {
                    wVar.f143770b = i2;
                    wVar.f143769a |= 1;
                    this.f292657q = qVar;
                } else {
                    throw null;
                }
            }
            C54798r rVar = (C54798r) C54800t.f143759f.createBuilder();
            long millis = duration.toMillis();
            rVar.copyOnWrite();
            C54800t tVar = (C54800t) rVar.instance;
            tVar.f143761a |= 4;
            tVar.f143763c = millis;
            this.f292656p = rVar;
            this.f292653m = this.f292648h.mo26870b();
            C58976aa aaVar = C58975e.f156826a;
            duration.toMillis();
        }
    }

    /* renamed from: g */
    public final void mo86419g(int i) {
        C54797q qVar = this.f292657q;
        if (qVar != null) {
            boolean z = false;
            boolean z2 = (i == 3 || i == 4) ? false : true;
            C54798r rVar = this.f292656p;
            if (rVar != null) {
                z = z2;
            } else if (z2) {
                int size = ((C54803w) qVar.instance).f143771c.size();
                if (size > 0) {
                    int i2 = size - 1;
                    C54798r rVar2 = (C54798r) qVar.mo54153a(i2).toBuilder();
                    rVar2.copyOnWrite();
                    C54800t tVar = (C54800t) rVar2.instance;
                    tVar.f143762b = i - 1;
                    tVar.f143761a |= 2;
                    qVar.mo54155c(i2, (C54800t) rVar2.build());
                }
                m174204q((C54803w) qVar.build());
                return;
            }
            if (rVar != null) {
                long p = m174203p(((C54800t) rVar.instance).f143763c);
                rVar.copyOnWrite();
                C54800t tVar2 = (C54800t) rVar.instance;
                tVar2.f143762b = i - 1;
                tVar2.f143761a |= 2;
                rVar.copyOnWrite();
                C54800t tVar3 = (C54800t) rVar.instance;
                tVar3.f143761a |= 8;
                tVar3.f143764d = p;
                if (this.f292642b.isPresent()) {
                    Optional a = ((C91880d) this.f292642b.get()).mo86412a();
                    if (a.isPresent()) {
                        long longValue = ((Long) a.get()).longValue();
                        rVar.copyOnWrite();
                        C54800t tVar4 = (C54800t) rVar.instance;
                        tVar4.f143761a |= 16;
                        tVar4.f143765e = longValue;
                    }
                }
                qVar.mo54154b(rVar);
                this.f292656p = null;
                C58976aa aaVar = C58975e.f156826a;
                if (z) {
                    m174204q((C54803w) qVar.build());
                }
            }
        }
    }
}
