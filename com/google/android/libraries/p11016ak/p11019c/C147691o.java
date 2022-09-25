package com.google.android.libraries.p11016ak.p11019c;

import com.google.android.libraries.p11016ak.C147731m;
import com.google.android.libraries.p11016ak.C147732n;
import com.google.android.libraries.p11016ak.C147733o;
import com.google.android.libraries.p11016ak.C147734p;
import com.google.android.libraries.p11016ak.C147735q;
import com.google.android.libraries.p11016ak.C147736r;
import com.google.android.libraries.p11016ak.p11017a.C147617f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62948a;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.IntStream;
import p5285d.p5290b.p5291a.p5292a.C68142ae;
import p5285d.p5290b.p5291a.p5292a.C68150am;
import p5285d.p5290b.p5291a.p5292a.C68167bc;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68176bl;
import p5285d.p5290b.p5291a.p5292a.C68179bo;
import p5285d.p5290b.p5291a.p5292a.C68191d;
import p5285d.p5290b.p5291a.p5292a.C68193f;
import p5285d.p5290b.p5291a.p5292a.C68205r;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70877p;

/* renamed from: com.google.android.libraries.ak.c.o */
/* compiled from: PG */
public final class C147691o implements C70877p {

    /* renamed from: e */
    private static final C59071e f398583e = C59071e.m91332i("com.google.android.libraries.ak.c.o");

    /* renamed from: a */
    public final Map f398584a = new TreeMap();

    /* renamed from: b */
    public final SettableFuture f398585b = new SettableFuture();

    /* renamed from: c */
    public final C68150am f398586c;

    /* renamed from: d */
    public final boolean f398587d;

    /* renamed from: f */
    private C147680d f398588f;

    public C147691o(C147679c cVar) {
        C68150am amVar = cVar.f398549a;
        amVar = amVar == null ? C68150am.f184434c : amVar;
        this.f398586c = amVar;
        this.f398587d = cVar.f398550b;
        this.f398588f = new C147680d(amVar.f184436a);
        if (!cVar.f398551c.isEmpty()) {
            this.f398588f.f398554c = C58833ax.m90834k(cVar.f398551c);
        }
        int i = amVar.f184436a;
        while (true) {
            C68150am amVar2 = this.f398586c;
            if (i < amVar2.f184436a + amVar2.f184437b) {
                this.f398584a.put(Integer.valueOf(i), new SettableFuture());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    private final void m240760g(Throwable th) {
        if (!this.f398585b.isDone()) {
            this.f398585b.mo57357o(C147617f.m240686a(th));
        }
        for (Map.Entry value : this.f398584a.entrySet()) {
            SettableFuture settableFuture = (SettableFuture) value.getValue();
            if (!settableFuture.isDone()) {
                settableFuture.mo57357o(C147617f.m240686a(th));
            }
        }
    }

    /* renamed from: a */
    public final void mo20121a() {
        ((C59052c) ((C59052c) f398583e.mo56224b()).mo56372aa(50519)).mo56389s("Finished request for paragraphs %s.", this.f398586c);
        m240760g(new IllegalStateException("Request completed without data"));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f398583e.mo56225c()).mo56382g(th)).mo56372aa(50520)).mo56386p("gRPC error.");
        m240760g(th);
    }

    /* renamed from: d */
    public final void mo22390d(C70868g gVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C58485gu mo124420e() {
        C68150am amVar = this.f398586c;
        int i = amVar.f184436a;
        return C58485gu.m89842j((Collection) IntStream.CC.range(i, amVar.f184437b + i).mapToObj(new C147690n(this)).collect(Collectors.toList()));
    }

    /* renamed from: f */
    public final void mo20123c(C68142ae aeVar) {
        C68193f fVar;
        int i = aeVar.f184425a;
        if (i == 4) {
            ((C59052c) ((C59052c) f398583e.mo56224b()).mo56372aa(50521)).mo56386p("Received metadata.");
            if (aeVar.f184425a == 4) {
                fVar = (C68193f) aeVar.f184426b;
            } else {
                fVar = C68193f.f184513i;
            }
            C147680d dVar = new C147680d(this.f398586c.f184436a);
            this.f398588f = dVar;
            dVar.f398554c = C58833ax.m90834k(fVar.f184517c);
            this.f398585b.mo57356n(fVar);
        } else if (i == 3) {
            C68167bc bcVar = (C68167bc) aeVar.f184426b;
            C147680d dVar2 = this.f398588f;
            C58480gp e = C58485gu.m89837e();
            for (C68176bl blVar : bcVar.f184459a) {
                C68191d dVar3 = blVar.f184485b;
                if (dVar3 == null) {
                    dVar3 = C68191d.f184508d;
                }
                C68169be beVar = dVar3.f184510a;
                if (beVar == null) {
                    beVar = C68169be.f184463c;
                }
                C68191d dVar4 = blVar.f184485b;
                if (dVar4 == null) {
                    dVar4 = C68191d.f184508d;
                }
                C68179bo boVar = dVar4.f184511b;
                if (boVar == null) {
                    boVar = C68179bo.f184486c;
                }
                C68191d dVar5 = blVar.f184485b;
                if (dVar5 == null) {
                    dVar5 = C68191d.f184508d;
                }
                C68169be beVar2 = dVar5.f184512c;
                if (beVar2 == null) {
                    beVar2 = C68169be.f184463c;
                }
                C147735q qVar = (C147735q) C147736r.f398657g.createBuilder();
                int i2 = beVar.f184465a;
                qVar.copyOnWrite();
                ((C147736r) qVar.instance).f398659a = i2;
                int i3 = beVar.f184465a;
                int i4 = beVar.f184466b;
                qVar.copyOnWrite();
                ((C147736r) qVar.instance).f398660b = i3 + i4;
                C62910ar arVar = boVar.f184488a;
                if (arVar == null) {
                    arVar = C62910ar.f169858c;
                }
                long d = C62948a.m95453d(arVar);
                qVar.copyOnWrite();
                ((C147736r) qVar.instance).f398661c = d;
                C62910ar arVar2 = boVar.f184488a;
                if (arVar2 == null) {
                    arVar2 = C62910ar.f169858c;
                }
                long d2 = C62948a.m95453d(arVar2);
                C62910ar arVar3 = boVar.f184489b;
                if (arVar3 == null) {
                    arVar3 = C62910ar.f169858c;
                }
                long d3 = C62948a.m95453d(arVar3);
                qVar.copyOnWrite();
                ((C147736r) qVar.instance).f398662d = d2 + d3;
                int i5 = beVar2.f184465a;
                qVar.copyOnWrite();
                ((C147736r) qVar.instance).f398663e = i5;
                int i6 = beVar2.f184465a;
                int i7 = beVar2.f184466b;
                qVar.copyOnWrite();
                ((C147736r) qVar.instance).f398664f = i6 + i7;
                e.mo55395g((C147736r) qVar.build());
            }
            C58485gu f = e.mo55394f();
            long j = -dVar2.f398557f;
            C58480gp e2 = C58485gu.m89837e();
            int i8 = 0;
            C58801sm G = f.listIterator(0);
            while (G.hasNext()) {
                C147736r rVar = (C147736r) G.next();
                C147735q qVar2 = (C147735q) rVar.toBuilder();
                long j2 = rVar.f398661c;
                qVar2.copyOnWrite();
                ((C147736r) qVar2.instance).f398661c = j2 + j;
                long j3 = rVar.f398662d;
                qVar2.copyOnWrite();
                ((C147736r) qVar2.instance).f398662d = j3 + j;
                e2.mo55395g((C147736r) qVar2.build());
            }
            C58485gu f2 = e2.mo55394f();
            C58480gp e3 = C58485gu.m89837e();
            while (i8 < ((C58724pq) f2).f156474d - 1) {
                C147735q qVar3 = (C147735q) ((C147736r) f2.get(i8)).toBuilder();
                i8++;
                long j4 = ((C147736r) f2.get(i8)).f398661c;
                qVar3.copyOnWrite();
                ((C147736r) qVar3.instance).f398662d = j4 - 1;
                e3.mo55395g((C147736r) qVar3.build());
            }
            if (!f2.isEmpty()) {
                e3.mo55395g((C147736r) C58557jl.m90131l(f2));
            }
            C58485gu f3 = e3.mo55394f();
            long j5 = dVar2.f398557f;
            C68179bo boVar2 = bcVar.f184460b;
            if (boVar2 == null) {
                boVar2 = C68179bo.f184486c;
            }
            C62910ar arVar4 = boVar2.f184489b;
            if (arVar4 == null) {
                arVar4 = C62910ar.f169858c;
            }
            dVar2.f398557f = j5 + C62948a.m95453d(arVar4);
            C68179bo boVar3 = bcVar.f184460b;
            if (boVar3 == null) {
                boVar3 = C68179bo.f184486c;
            }
            C62910ar arVar5 = boVar3.f184489b;
            if (arVar5 == null) {
                arVar5 = C62910ar.f169858c;
            }
            dVar2.f398553b = arVar5;
            C147733o oVar = dVar2.f398555d;
            oVar.mo124427a(f3);
            String str = bcVar.f184462d;
            oVar.copyOnWrite();
            C147734p pVar = C147734p.f398651e;
            str.getClass();
            ((C147734p) oVar.instance).f398655c = str;
        } else if (i == 1) {
            C147680d dVar6 = this.f398588f;
            C147731m mVar = (C147731m) C147732n.f398646d.createBuilder();
            C63088z zVar = ((C68205r) aeVar.f184426b).f184557a;
            mVar.copyOnWrite();
            zVar.getClass();
            ((C147732n) mVar.instance).f398648a = zVar;
            C62910ar arVar6 = dVar6.f398553b;
            mVar.copyOnWrite();
            arVar6.getClass();
            ((C147732n) mVar.instance).f398650c = arVar6;
            if (dVar6.f398554c.mo56113h()) {
                String str2 = (String) dVar6.f398554c.mo56107c();
                mVar.copyOnWrite();
                str2.getClass();
                ((C147732n) mVar.instance).f398649b = str2;
            } else {
                ((C59052c) ((C59052c) C147680d.f398552a.mo56226d()).mo56372aa(50518)).mo56386p("No audio format is set.");
            }
            C147733o oVar2 = dVar6.f398555d;
            C147732n nVar = (C147732n) mVar.build();
            oVar2.copyOnWrite();
            C147734p pVar2 = C147734p.f398651e;
            nVar.getClass();
            ((C147734p) oVar2.instance).f398653a = nVar;
            C147680d dVar7 = this.f398588f;
            C147734p pVar3 = (C147734p) dVar7.f398555d.build();
            dVar7.f398553b = C62948a.f169987b;
            dVar7.f398556e++;
            C147733o oVar3 = (C147733o) C147734p.f398651e.createBuilder();
            int i9 = dVar7.f398556e;
            oVar3.copyOnWrite();
            ((C147734p) oVar3.instance).f398656d = i9;
            dVar7.f398555d = oVar3;
            ((SettableFuture) this.f398584a.get(Integer.valueOf(pVar3.f398656d))).mo57356n(pVar3);
        }
    }
}
