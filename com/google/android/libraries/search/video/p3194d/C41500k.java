package com.google.android.libraries.search.video.p3194d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.video.players.C41589t;
import com.google.android.libraries.search.video.players.C41590u;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54791k;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54793m;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54794n;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54795o;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54796p;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54797q;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54798r;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54800t;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54803w;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.video.d.k */
/* compiled from: PG */
public final class C41500k implements C41590u {

    /* renamed from: a */
    public final C41497h f108426a;

    /* renamed from: b */
    private final boolean f108427b;

    public C41500k(C41499j jVar, C57128al alVar, Consumer consumer) {
        C41496g gVar = (C41496g) jVar.f108424a.mo17428b();
        gVar.getClass();
        C21370a aVar = (C21370a) jVar.f108425b.mo17428b();
        aVar.getClass();
        this.f108426a = new C41498i(gVar, aVar, alVar, consumer);
        this.f108427b = alVar.f152497a != 1 ? false : true;
    }

    /* renamed from: a */
    public final void mo44024a(int i) {
        C41589t tVar = C41589t.INIT_START;
        if (i - 1 == 0) {
            C41498i iVar = (C41498i) this.f108426a;
            if (!iVar.f108411b) {
                iVar.mo44023e((C54796p) null, (C54803w) null, (C54794n) null, true, false);
                iVar.f108411b = true;
                iVar.mo44019a(4);
            }
        } else if (this.f108427b) {
            C41498i iVar2 = (C41498i) this.f108426a;
            C54795o oVar = iVar2.f108412c;
            if (oVar != null && (((C54796p) oVar.instance).f143748a & 64) != 0) {
                iVar2.mo44023e((C54796p) oVar.build(), (C54803w) null, (C54794n) null, false, true);
            }
        } else {
            C41498i iVar3 = (C41498i) this.f108426a;
            C54795o oVar2 = iVar3.f108412c;
            if (oVar2 != null) {
                int i2 = ((C54796p) oVar2.instance).f143748a;
                if ((i2 & 4) != 0 || (i2 & 16) != 0) {
                    iVar3.mo44023e((C54796p) oVar2.build(), (C54803w) null, (C54794n) null, false, true);
                    iVar3.f108411b = false;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo44014c(C41592w wVar, C41589t tVar) {
        C41589t tVar2 = C41589t.INIT_START;
        switch (tVar.ordinal()) {
            case 0:
                if (!this.f108427b) {
                    this.f108426a.mo44019a(1);
                    return;
                }
                return;
            case 1:
                if (!this.f108427b) {
                    this.f108426a.mo44019a(2);
                    return;
                }
                return;
            case 2:
                if (this.f108427b) {
                    this.f108426a.mo44019a(8);
                    return;
                } else {
                    this.f108426a.mo44019a(5);
                    return;
                }
            case 3:
                if (!this.f108427b) {
                    this.f108426a.mo44019a(6);
                    return;
                }
                return;
            case 4:
                if (this.f108427b) {
                    this.f108426a.mo44019a(9);
                    this.f108426a.mo44020b(wVar.mo44082e(), 4);
                    return;
                }
                return;
            case 5:
                if (this.f108427b) {
                    this.f108426a.mo44019a(9);
                    this.f108426a.mo44020b(wVar.mo44082e(), 3);
                    return;
                }
                this.f108426a.mo44019a(7);
                this.f108426a.mo44020b(wVar.mo44082e(), 2);
                return;
            case 6:
                this.f108426a.mo44021c(21, wVar.mo44083f());
                return;
            case 7:
                this.f108426a.mo44021c(4, wVar.mo44083f());
                return;
            case 8:
                this.f108426a.mo44021c(3, wVar.mo44083f());
                return;
            case 9:
                this.f108426a.mo44021c(6, wVar.mo44083f());
                return;
            case 10:
                this.f108426a.mo44021c(13, wVar.mo44083f());
                return;
            case 11:
                if (!this.f108427b) {
                    this.f108426a.mo44021c(8, wVar.mo44083f());
                    return;
                } else {
                    this.f108426a.mo44021c(5, wVar.mo44083f());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: d */
    public final void mo44015d(C41592w wVar, int i) {
        C41589t tVar = C41589t.INIT_START;
        int i2 = i - 1;
        if (i2 == 0) {
            this.f108426a.mo44021c(9, wVar.mo44083f());
        } else if (i2 == 1) {
            this.f108426a.mo44021c(11, wVar.mo44083f());
        } else if (i2 == 2) {
            this.f108426a.mo44021c(12, wVar.mo44083f());
        } else if (i2 != 3) {
            if (this.f108427b) {
                this.f108426a.mo44021c(19, wVar.mo44083f());
                this.f108426a.mo44020b(wVar.mo44082e(), 3);
            }
        } else if (this.f108427b) {
            this.f108426a.mo44021c(10, wVar.mo44083f());
            this.f108426a.mo44020b(wVar.mo44082e(), 3);
        }
    }

    /* renamed from: e */
    public final void mo44016e(C54794n nVar) {
        C54803w wVar;
        C54796p pVar;
        C54798r rVar;
        C41497h hVar = this.f108426a;
        int a = C54793m.m87528a(nVar.f143744b);
        if (a == 0) {
            a = 1;
        }
        boolean z = nVar.f143745c;
        C54791k kVar = (C54791k) C54794n.f143741d.createBuilder();
        kVar.copyOnWrite();
        C54794n nVar2 = (C54794n) kVar.instance;
        nVar2.f143744b = a - 1;
        nVar2.f143743a |= 1;
        kVar.copyOnWrite();
        C54794n nVar3 = (C54794n) kVar.instance;
        nVar3.f143743a |= 2;
        nVar3.f143745c = z;
        C54794n nVar4 = (C54794n) kVar.build();
        C41498i iVar = (C41498i) hVar;
        if (iVar.f108413d != null) {
            C54798r rVar2 = iVar.f108413d;
            rVar2.copyOnWrite();
            C54800t tVar = (C54800t) rVar2.instance;
            C54800t tVar2 = C54800t.f143759f;
            tVar.f143762b = 12;
            tVar.f143761a |= 2;
            long millis = iVar.mo44022d(Duration.ofMillis(((C54800t) iVar.f108413d.instance).f143763c)).toMillis();
            rVar2.copyOnWrite();
            C54800t tVar3 = (C54800t) rVar2.instance;
            tVar3.f143761a |= 8;
            tVar3.f143764d = millis;
            C54797q qVar = iVar.f108414e;
            if (!(qVar == null || (rVar = iVar.f108413d) == null)) {
                qVar.mo54154b(rVar);
            }
        }
        C54797q qVar2 = iVar.f108414e;
        if (qVar2 == null) {
            wVar = null;
        } else {
            wVar = (C54803w) qVar2.build();
        }
        C54795o oVar = iVar.f108412c;
        if (oVar == null) {
            pVar = null;
        } else {
            pVar = (C54796p) oVar.build();
        }
        iVar.mo44023e(pVar, wVar, nVar4, false, true);
    }
}
