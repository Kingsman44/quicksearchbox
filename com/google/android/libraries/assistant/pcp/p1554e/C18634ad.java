package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.assistant.p3803ag.p3809c.C49098gj;
import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.assistant.p3803ag.p3809c.C49145o;
import com.google.assistant.p3803ag.p3809c.C49147q;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.e.ad */
/* compiled from: PG */
public final /* synthetic */ class C18634ad implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49099gk f52659a;

    /* renamed from: b */
    public final /* synthetic */ C49099gk f52660b;

    public /* synthetic */ C18634ad(C49099gk gkVar, C49099gk gkVar2) {
        this.f52659a = gkVar;
        this.f52660b = gkVar2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49099gk gkVar = this.f52659a;
        C49099gk gkVar2 = this.f52660b;
        C49099gk gkVar3 = (C49099gk) obj;
        if (gkVar3 != null && !gkVar3.equals(C49099gk.f126983g)) {
            gkVar = gkVar3;
        }
        C49098gj gjVar = (C49098gj) gkVar.toBuilder();
        C49147q qVar = gkVar.f126990f;
        if (qVar == null) {
            qVar = C49147q.f127093f;
        }
        C49145o oVar = (C49145o) qVar.toBuilder();
        C49147q qVar2 = gkVar2.f126990f;
        if ((qVar2 == null ? C49147q.f127093f : qVar2).f127097c != 0) {
            if (qVar2 == null) {
                qVar2 = C49147q.f127093f;
            }
            long j = qVar2.f127097c;
            C49147q qVar3 = gkVar.f126990f;
            if (qVar3 == null) {
                qVar3 = C49147q.f127093f;
            }
            if (j != qVar3.f127097c) {
                gjVar.copyOnWrite();
                ((C49099gk) gjVar.instance).f126987c = C49099gk.emptyProtobufList();
                C62971cq cqVar = gkVar2.f126987c;
                gjVar.copyOnWrite();
                C49099gk gkVar4 = (C49099gk) gjVar.instance;
                C62971cq cqVar2 = gkVar4.f126987c;
                if (!cqVar2.mo58948c()) {
                    gkVar4.f126987c = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) cqVar, (List) gkVar4.f126987c);
                C49147q qVar4 = gkVar2.f126990f;
                if (qVar4 == null) {
                    qVar4 = C49147q.f127093f;
                }
                long j2 = qVar4.f127097c;
                oVar.copyOnWrite();
                C49147q qVar5 = (C49147q) oVar.instance;
                qVar5.f127095a |= 1;
                qVar5.f127097c = j2;
            }
        }
        C49147q qVar6 = gkVar2.f126990f;
        if ((qVar6 == null ? C49147q.f127093f : qVar6).f127098d != 0) {
            if (qVar6 == null) {
                qVar6 = C49147q.f127093f;
            }
            long j3 = qVar6.f127098d;
            C49147q qVar7 = gkVar.f126990f;
            if (qVar7 == null) {
                qVar7 = C49147q.f127093f;
            }
            if (j3 != qVar7.f127098d) {
                gjVar.copyOnWrite();
                ((C49099gk) gjVar.instance).f126988d = C49099gk.emptyProtobufList();
                C62971cq cqVar3 = gkVar2.f126988d;
                gjVar.copyOnWrite();
                C49099gk gkVar5 = (C49099gk) gjVar.instance;
                C62971cq cqVar4 = gkVar5.f126988d;
                if (!cqVar4.mo58948c()) {
                    gkVar5.f126988d = C62942bv.mutableCopy(cqVar4);
                }
                C62947c.addAll((Iterable) cqVar3, (List) gkVar5.f126988d);
                C49147q qVar8 = gkVar2.f126990f;
                if (qVar8 == null) {
                    qVar8 = C49147q.f127093f;
                }
                long j4 = qVar8.f127098d;
                oVar.copyOnWrite();
                C49147q qVar9 = (C49147q) oVar.instance;
                qVar9.f127095a |= 2;
                qVar9.f127098d = j4;
            }
        }
        C49147q qVar10 = gkVar2.f126990f;
        if ((qVar10 == null ? C49147q.f127093f : qVar10).f127099e != 0) {
            if (qVar10 == null) {
                qVar10 = C49147q.f127093f;
            }
            long j5 = qVar10.f127099e;
            C49147q qVar11 = gkVar.f126990f;
            if (qVar11 == null) {
                qVar11 = C49147q.f127093f;
            }
            if (j5 != qVar11.f127099e) {
                gjVar.copyOnWrite();
                ((C49099gk) gjVar.instance).f126989e = C49099gk.emptyProtobufList();
                C62971cq cqVar5 = gkVar2.f126989e;
                gjVar.copyOnWrite();
                C49099gk gkVar6 = (C49099gk) gjVar.instance;
                C62971cq cqVar6 = gkVar6.f126989e;
                if (!cqVar6.mo58948c()) {
                    gkVar6.f126989e = C62942bv.mutableCopy(cqVar6);
                }
                C62947c.addAll((Iterable) cqVar5, (List) gkVar6.f126989e);
                C49147q qVar12 = gkVar2.f126990f;
                if (qVar12 == null) {
                    qVar12 = C49147q.f127093f;
                }
                long j6 = qVar12.f127099e;
                oVar.copyOnWrite();
                C49147q qVar13 = (C49147q) oVar.instance;
                qVar13.f127095a |= 4;
                qVar13.f127099e = j6;
            }
        }
        C49147q qVar14 = gkVar2.f126990f;
        if (qVar14 == null) {
            qVar14 = C49147q.f127093f;
        }
        if (qVar14.f127096b.size() > 0) {
            gjVar.copyOnWrite();
            ((C49099gk) gjVar.instance).f126986b = C49099gk.emptyProtobufList();
            oVar.copyOnWrite();
            ((C49147q) oVar.instance).mo53219a().clear();
            C58471gg g = ((C58495hd) Stream.CC.concat(Collection.EL.stream(((C58495hd) Collection.EL.stream(gkVar.f126986b).collect(C58370cn.m89403c(C18668s.f52701a, Function.CC.identity(), C18670u.f52703a))).entrySet()), Collection.EL.stream(((C58495hd) Collection.EL.stream(gkVar2.f126986b).collect(C58370cn.m89403c(C18668s.f52701a, Function.CC.identity(), C18669t.f52702a))).entrySet())).collect(C58370cn.m89403c(C18671v.f52704a, C18672w.f52705a, C18674y.f52707a))).values();
            gjVar.copyOnWrite();
            C49099gk gkVar7 = (C49099gk) gjVar.instance;
            C62971cq cqVar7 = gkVar7.f126986b;
            if (!cqVar7.mo58948c()) {
                gkVar7.f126986b = C62942bv.mutableCopy(cqVar7);
            }
            C62947c.addAll((Iterable) g, (List) gkVar7.f126986b);
            C49147q qVar15 = gkVar.f126990f;
            if (qVar15 == null) {
                qVar15 = C49147q.f127093f;
            }
            Stream stream = Collection.EL.stream(Collections.unmodifiableMap(qVar15.f127096b).entrySet());
            C49147q qVar16 = gkVar2.f126990f;
            if (qVar16 == null) {
                qVar16 = C49147q.f127093f;
            }
            oVar.copyOnWrite();
            ((C49147q) oVar.instance).mo53219a().putAll((C58495hd) Stream.CC.concat(stream, Collection.EL.stream(Collections.unmodifiableMap(qVar16.f127096b).entrySet())).collect(C58370cn.m89403c(C18671v.f52704a, C18675z.f52708a, C18631aa.f52655a)));
        }
        gjVar.copyOnWrite();
        C49099gk gkVar8 = (C49099gk) gjVar.instance;
        C49147q qVar17 = (C49147q) oVar.build();
        qVar17.getClass();
        gkVar8.f126990f = qVar17;
        gkVar8.f126985a |= 1;
        return (C49099gk) gjVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
