package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.assistant.shared.l.n;
import com.google.android.apps.gsa.assistant.shared.l.o;
import com.google.android.apps.gsa.assistant.shared.l.p;
import com.google.android.apps.gsa.assistant.shared.l.q;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.bb */
/* compiled from: PG */
public final class C112691bb implements C112687ay {

    /* renamed from: a */
    public static final C59071e f312397a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.logging.bb");

    /* renamed from: b */
    private final C112471ap f312398b;

    /* renamed from: c */
    private final C60950i f312399c;

    /* renamed from: d */
    private final C86124t f312400d;

    /* renamed from: e */
    private final C83581al f312401e;

    /* renamed from: f */
    private final C22871g f312402f;

    public C112691bb(C112471ap apVar, C60950i iVar, C86124t tVar, C83581al alVar, C22871g gVar) {
        this.f312398b = apVar;
        this.f312399c = iVar;
        this.f312400d = tVar;
        this.f312401e = alVar;
        this.f312402f = gVar;
    }

    /* renamed from: c */
    private final n m186505c(LocalDate localDate) {
        n createBuilder = o.d.createBuilder();
        createBuilder.copyOnWrite();
        o oVar = createBuilder.instance;
        oVar.a |= 1;
        oVar.c = 0;
        int i = 0;
        while (true) {
            long j = (long) i;
            if (j >= this.f312400d.mo79743a(C90063do.f249623gy)) {
                return createBuilder;
            }
            p createBuilder2 = q.d.createBuilder();
            C58072d a = C58068e.m88823a(localDate.plusDays(j));
            createBuilder2.copyOnWrite();
            q qVar = createBuilder2.instance;
            a.getClass();
            qVar.b = a;
            qVar.a |= 1;
            createBuilder2.copyOnWrite();
            q qVar2 = createBuilder2.instance;
            qVar2.a |= 2;
            qVar2.c = 0;
            createBuilder.b(createBuilder2.build());
            i++;
        }
    }

    /* renamed from: a */
    public final int mo99643a(int i) {
        int i2;
        Optional p = this.f312398b.mo99545p();
        if (!p.isEmpty()) {
            o oVar = (o) p.get();
            if (oVar.b.size() == 0 || (i2 = oVar.c) < 0 || i2 >= oVar.b.size()) {
                C59104x d = f312397a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasRetentionLogger");
                ((C59052c) ((C59052c) d).mo56372aa(27547)).mo56386p("Tapas User Retention malformed.");
            } else {
                LocalDate b = this.f312399c.mo57445b(ZoneId.systemDefault());
                LocalDate minusDays = b.minusDays((long) (i - 1));
                int i3 = 0;
                for (int i4 = 0; i4 < Math.min(oVar.b.size(), i); i4++) {
                    int i5 = oVar.c;
                    int size = oVar.b.size();
                    int i6 = (i5 - i4) % size;
                    if (i6 < 0) {
                        i6 += size;
                    }
                    C58072d dVar = ((q) oVar.b.get(i6)).b;
                    if (dVar == null) {
                        dVar = C58072d.f155218d;
                    }
                    LocalDate d2 = C58068e.m88826d(dVar);
                    if (d2.isBefore(minusDays) || d2.isAfter(b)) {
                        break;
                    }
                    i3 += ((q) oVar.b.get(i6)).c;
                }
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo99644b() {
        n nVar;
        if (this.f312400d.mo79746e(C90063do.f249604gf)) {
            Optional p = this.f312398b.mo99545p();
            LocalDate b = this.f312399c.mo57445b(ZoneId.systemDefault());
            if (p.isPresent()) {
                o oVar = (o) p.get();
                int i = oVar.c;
                if (i < 0 || i >= oVar.b.size()) {
                    C59104x d = f312397a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "TapasRetentionLogger");
                    ((C59052c) ((C59052c) d).mo56372aa(27548)).mo56386p("Tapas User Retention malformed.");
                    nVar = m186505c(b);
                } else {
                    nVar = (n) oVar.toBuilder();
                    int size = oVar.b.size();
                    C58072d dVar = ((q) oVar.b.get(i)).b;
                    if (dVar == null) {
                        dVar = C58072d.f155218d;
                    }
                    LocalDate d2 = C58068e.m88826d(dVar);
                    if (b.isAfter(d2)) {
                        if (!d2.plusDays((long) (size - 1)).isBefore(b)) {
                            int i2 = 1;
                            while (true) {
                                if (i2 >= size + 1) {
                                    nVar = m186505c(b);
                                    break;
                                }
                                int i3 = (i + i2) % size;
                                C58072d dVar2 = nVar.a(i3).b;
                                if (dVar2 == null) {
                                    dVar2 = C58072d.f155218d;
                                }
                                if (C58068e.m88826d(dVar2).isBefore(d2)) {
                                    p createBuilder = q.d.createBuilder();
                                    C58072d a = C58068e.m88823a(d2.plusDays(1));
                                    createBuilder.copyOnWrite();
                                    q qVar = createBuilder.instance;
                                    a.getClass();
                                    qVar.b = a;
                                    qVar.a |= 1;
                                    createBuilder.copyOnWrite();
                                    q qVar2 = createBuilder.instance;
                                    qVar2.a |= 2;
                                    qVar2.c = 0;
                                    nVar.c(i3, createBuilder);
                                }
                                C58072d dVar3 = nVar.a(i3).b;
                                if (dVar3 == null) {
                                    dVar3 = C58072d.f155218d;
                                }
                                d2 = C58068e.m88826d(dVar3);
                                if (d2.equals(b)) {
                                    nVar.copyOnWrite();
                                    o oVar2 = nVar.instance;
                                    oVar2.a |= 1;
                                    oVar2.c = i3;
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            int a2 = ((int) this.f312400d.mo79743a(C90063do.f249623gy)) - 1;
                            nVar = o.d.createBuilder();
                            nVar.copyOnWrite();
                            o oVar3 = nVar.instance;
                            oVar3.a |= 1;
                            oVar3.c = a2;
                            for (int i4 = 0; i4 <= a2; i4++) {
                                p createBuilder2 = q.d.createBuilder();
                                C58072d a3 = C58068e.m88823a(b.minusDays((long) (a2 - i4)));
                                createBuilder2.copyOnWrite();
                                q qVar3 = createBuilder2.instance;
                                a3.getClass();
                                qVar3.b = a3;
                                qVar3.a |= 1;
                                createBuilder2.copyOnWrite();
                                q qVar4 = createBuilder2.instance;
                                qVar4.a |= 2;
                                qVar4.c = 0;
                                nVar.b(createBuilder2.build());
                            }
                        }
                    } else if (!b.equals(d2)) {
                        nVar = m186505c(b);
                    }
                }
            } else {
                nVar = m186505c(b);
            }
            p builder = nVar.a(nVar.instance.c).toBuilder();
            int i5 = builder.instance.c;
            builder.copyOnWrite();
            q qVar5 = builder.instance;
            qVar5.a |= 2;
            qVar5.c = i5 + 1;
            nVar.c(nVar.instance.c, builder);
            C58976aa aaVar = C58975e.f156826a;
            C90875ai.m148465b(C112688az.f312393a, this.f312401e.mo76942q(nVar.build()), this.f312402f, "Writing Tapas User Retention").mo85223a(C112690ba.f312396a);
            this.f312398b.f311989a.mo99551e(C48634bw.TAPAS_USER_RETENTION);
        }
    }
}
