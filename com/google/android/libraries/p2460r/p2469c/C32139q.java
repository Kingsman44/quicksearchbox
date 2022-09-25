package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57364ap;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57368at;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57371aw;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57373ay;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57383bh;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57388bm;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57396bu;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57397bv;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.libraries.r.c.q */
/* compiled from: PG */
final class C32139q {

    /* renamed from: a */
    private final C32126d f86312a;

    /* renamed from: b */
    private final C32126d f86313b;

    /* renamed from: c */
    private final C32126d f86314c;

    /* renamed from: d */
    private final C32126d f86315d;

    /* renamed from: e */
    private final C32126d f86316e;

    /* renamed from: f */
    private final C32126d f86317f;

    /* renamed from: g */
    private final C32126d f86318g;

    /* renamed from: h */
    private final C32075af f86319h;

    public C32139q(Context context, C32127e eVar, C32075af afVar) {
        C32126d dVar = new C32126d(context, eVar, new C32133k());
        C32126d dVar2 = new C32126d(context, eVar, new C32131i());
        C32126d dVar3 = new C32126d(context, eVar, new C32080ak());
        C32126d dVar4 = new C32126d(context, eVar, new C32073ad());
        C32126d dVar5 = new C32126d(context, eVar, new C32070aa());
        C32126d dVar6 = new C32126d(context, eVar, new C32141s());
        C32126d dVar7 = new C32126d(context, eVar, new C32143u());
        this.f86312a = dVar;
        this.f86313b = dVar2;
        this.f86314c = dVar3;
        this.f86315d = dVar4;
        this.f86316e = dVar5;
        this.f86317f = dVar6;
        this.f86318g = dVar7;
        Collections.unmodifiableList(Arrays.asList(new C32126d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7}));
        this.f86319h = afVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37950b(C32138p pVar) {
        pVar.mo37946l();
        C32091av avVar = pVar.f86303g;
        if (avVar instanceof C32113ba) {
            C32113ba baVar = (C32113ba) avVar;
            if (baVar != null) {
                this.f86319h.mo37857b(baVar, pVar);
            }
        } else if (pVar instanceof C32134l) {
            this.f86312a.mo37929b((C32134l) pVar);
        } else if (pVar instanceof C32132j) {
            this.f86313b.mo37929b((C32132j) pVar);
        } else if (pVar instanceof C32081al) {
            this.f86314c.mo37929b((C32081al) pVar);
        } else if (pVar instanceof C32074ae) {
            this.f86315d.mo37929b((C32074ae) pVar);
        } else if (pVar instanceof C32071ab) {
            this.f86316e.mo37929b((C32071ab) pVar);
        } else if (pVar instanceof C32142t) {
            this.f86317f.mo37929b((C32142t) pVar);
        } else if (pVar instanceof C32144v) {
            this.f86318g.mo37929b((C32144v) pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C32138p mo37949a(C57369au auVar, C32148z zVar) {
        C32138p pVar;
        C57388bm bmVar;
        C57397bv bvVar;
        C57397bv bvVar2;
        C57383bh bhVar;
        C57371aw awVar;
        C57373ay ayVar;
        C57364ap apVar;
        int i = auVar.f153257b;
        int b = C57368at.m88333b(i);
        int i2 = b - 1;
        if (b != 0) {
            if (i2 == 0) {
                C32126d dVar = this.f86315d;
                if (i == 3) {
                    bmVar = (C57388bm) auVar.f153258c;
                } else {
                    bmVar = C57388bm.f153297c;
                }
                pVar = dVar.mo37928a(bmVar, zVar);
            } else if (i2 == 1) {
                if (i == 2) {
                    bvVar = (C57397bv) auVar.f153258c;
                } else {
                    bvVar = C57397bv.f153317c;
                }
                int b2 = C57396bu.m88343b(bvVar.f153319a);
                int i3 = b2 - 1;
                if (b2 == 0) {
                    throw null;
                } else if (i3 == 0 || i3 == 1) {
                    pVar = this.f86313b.mo37928a(auVar, zVar);
                } else if (i3 == 2 || i3 == 3) {
                    pVar = this.f86314c.mo37928a(auVar, zVar);
                } else {
                    C57404cb cbVar = C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT;
                    C57404cb cbVar2 = C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT;
                    Object[] objArr = new Object[1];
                    if (auVar.f153257b == 2) {
                        bvVar2 = (C57397bv) auVar.f153258c;
                    } else {
                        bvVar2 = C57397bv.f153317c;
                    }
                    objArr[0] = C57396bu.m88342a(C57396bu.m88343b(bvVar2.f153319a));
                    throw new C32083an(cbVar, zVar.mo37967i(1, cbVar2, String.format("Unsupported TextElement type: %s", objArr)));
                }
            } else if (i2 == 2) {
                C32126d dVar2 = this.f86316e;
                if (i == 5) {
                    bhVar = (C57383bh) auVar.f153258c;
                } else {
                    bhVar = C57383bh.f153290b;
                }
                pVar = dVar2.mo37928a(bhVar, zVar);
            } else if (i2 == 3) {
                C32126d dVar3 = this.f86317f;
                if (i == 6) {
                    awVar = (C57371aw) auVar.f153258c;
                } else {
                    awVar = C57371aw.f153268b;
                }
                pVar = dVar3.mo37928a(awVar, zVar);
            } else if (i2 == 4) {
                C32126d dVar4 = this.f86318g;
                if (i == 24) {
                    ayVar = (C57373ay) auVar.f153258c;
                } else {
                    ayVar = C57373ay.f153272b;
                }
                pVar = dVar4.mo37928a(ayVar, zVar);
            } else if (i2 == 5) {
                C32126d dVar5 = this.f86312a;
                if (i == 1) {
                    apVar = (C57364ap) auVar.f153258c;
                } else {
                    apVar = C57364ap.f153246c;
                }
                pVar = dVar5.mo37928a(apVar, zVar);
            } else {
                throw new C32083an(C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, zVar.mo37967i(1, C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, String.format("Unsupported Element type: %s", new Object[]{C57368at.m88332a(C57368at.m88333b(auVar.f153257b))})));
            }
            pVar.mo37942h(pVar.mo37852v(auVar), auVar, zVar);
            return pVar;
        }
        throw null;
    }
}
