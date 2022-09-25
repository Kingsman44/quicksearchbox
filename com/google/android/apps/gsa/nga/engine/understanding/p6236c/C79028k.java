package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.b.a.c;
import com.google.android.apps.gsa.nga.b.a.d;
import com.google.android.apps.gsa.nga.b.a.e;
import com.google.android.apps.gsa.nga.b.a.f;
import com.google.android.apps.gsa.nga.b.a.j;
import com.google.android.apps.gsa.nga.engine.annotators.C74984ah;
import com.google.android.apps.gsa.nga.engine.p6137s.C77910h;
import com.google.android.apps.gsa.nga.p5885b.p5886a.C74743b;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80412ad;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.assistant.p3897e.p3917i.p3918a.C51499jz;
import com.google.assistant.p3897e.p3917i.p3918a.C51502kb;
import com.google.assistant.p3897e.p3917i.p3918a.C51504kd;
import com.google.assistant.p3897e.p3917i.p3918a.C51508kh;
import com.google.assistant.p3897e.p3917i.p3918a.C51509ki;
import com.google.assistant.p3897e.p3917i.p3918a.C51512kl;
import com.google.assistant.p3897e.p3917i.p3918a.C51513km;
import com.google.assistant.p3897e.p3917i.p3918a.C51514kn;
import com.google.assistant.p3897e.p3917i.p3918a.C51515ko;
import com.google.assistant.p3897e.p3917i.p3918a.C51516kp;
import com.google.assistant.p3897e.p3917i.p3918a.C51518kr;
import com.google.assistant.p3897e.p3917i.p3918a.C51519ks;
import com.google.assistant.p3897e.p3917i.p3918a.C51520kt;
import com.google.assistant.p3897e.p3917i.p3918a.C51521ku;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58831av;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60945d;
import com.google.common.p4580v.C60950i;
import com.google.p4283bv.p4373g.C57667b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.k */
/* compiled from: PG */
public final class C79028k {

    /* renamed from: a */
    public static final /* synthetic */ int f217326a = 0;

    /* renamed from: b */
    private static final C58974d f217327b = C58974d.m91136j();

    /* renamed from: c */
    private static final Duration f217328c = Duration.ofSeconds(60);

    /* renamed from: d */
    private static final C79027j f217329d = new C79027j();

    /* renamed from: a */
    public static f m126972a(C51504kd kdVar) {
        C62942bv bvVar;
        e createBuilder = f.b.createBuilder();
        for (C51502kb kbVar : kdVar.f134184a) {
            c createBuilder2 = d.f.createBuilder();
            int a = C51499jz.m86203a(kbVar.f134179c);
            if (a != 0 && a == 4) {
                createBuilder2.copyOnWrite();
                d dVar = createBuilder2.instance;
                dVar.c = 3;
                dVar.a |= 8;
                if ((kbVar.f134177a & 1) != 0) {
                    String str = kbVar.f134178b;
                    createBuilder2.copyOnWrite();
                    d dVar2 = createBuilder2.instance;
                    str.getClass();
                    dVar2.a |= 4;
                    dVar2.b = str;
                }
                if ((kbVar.f134177a & 4) != 0) {
                    String str2 = kbVar.f134180d;
                    createBuilder2.copyOnWrite();
                    d dVar3 = createBuilder2.instance;
                    str2.getClass();
                    dVar3.a |= 16;
                    dVar3.d = str2;
                }
                createBuilder2.a(kbVar.f134181e);
                bvVar = createBuilder2.build();
            } else {
                bvVar = createBuilder2.build();
            }
            createBuilder.a((d) bvVar);
        }
        return createBuilder.build();
    }

    /* renamed from: b */
    public static f m126973b(f fVar, Function function) {
        int a;
        e createBuilder = f.b.createBuilder();
        for (d dVar : fVar.a) {
            if (!((dVar.a & 8) == 0 || (a = C74743b.m120860a(dVar.c)) == 0 || a != 4)) {
                Optional optional = (Optional) function.apply(dVar.d);
                if (!optional.isEmpty()) {
                    c builder = dVar.toBuilder();
                    String b = ((C74984ah) optional.get()).mo71368b();
                    builder.copyOnWrite();
                    d dVar2 = builder.instance;
                    b.getClass();
                    dVar2.a = 4 | dVar2.a;
                    dVar2.b = b;
                    builder.a(((C74984ah) optional.get()).mo71367a());
                    dVar = (d) builder.build();
                }
            }
            createBuilder.a(dVar);
        }
        return createBuilder.build();
    }

    /* renamed from: d */
    public static C51515ko m126975d(C77910h hVar, String str, C83320io ioVar, C60950i iVar, Optional optional) {
        C80053ag agVar;
        C80053ag agVar2;
        C80053ag agVar3;
        long a = C60945d.m93096a(iVar.mo57444a());
        C51508kh khVar = (C51508kh) C51509ki.f134188k.createBuilder();
        khVar.copyOnWrite();
        C51509ki kiVar = (C51509ki) khVar.instance;
        kiVar.f134190a |= 2;
        kiVar.f134193d = str;
        khVar.copyOnWrite();
        C51509ki kiVar2 = (C51509ki) khVar.instance;
        kiVar2.f134190a |= 4;
        kiVar2.f134194e = a;
        if (optional.isPresent()) {
            String str2 = (String) optional.get();
            khVar.copyOnWrite();
            C51509ki kiVar3 = (C51509ki) khVar.instance;
            str2.getClass();
            kiVar3.f134190a |= 32;
            kiVar3.f134197h = str2;
        }
        C51514kn knVar = (C51514kn) C51515ko.f134212e.createBuilder();
        knVar.copyOnWrite();
        C51515ko koVar = (C51515ko) knVar.instance;
        C51509ki kiVar4 = (C51509ki) khVar.build();
        kiVar4.getClass();
        koVar.f134216c = kiVar4;
        koVar.f134214a |= 2;
        C51512kl klVar = (C51512kl) C51513km.f134204e.createBuilder();
        for (C80413ae aeVar : hVar.mo72886k(ioVar)) {
            C51508kh khVar2 = (C51508kh) C51509ki.f134188k.createBuilder();
            String str3 = aeVar.f220692c;
            khVar2.copyOnWrite();
            C51509ki kiVar5 = (C51509ki) khVar2.instance;
            str3.getClass();
            kiVar5.f134190a |= 1;
            kiVar5.f134191b = str3;
            long j = aeVar.f220694e;
            khVar2.copyOnWrite();
            C51509ki kiVar6 = (C51509ki) khVar2.instance;
            kiVar6.f134190a |= 4;
            kiVar6.f134194e = j;
            String str4 = aeVar.f220691b;
            khVar2.copyOnWrite();
            C51509ki kiVar7 = (C51509ki) khVar2.instance;
            str4.getClass();
            kiVar7.f134190a |= 2;
            kiVar7.f134193d = str4;
            if ((aeVar.f220690a & 8) != 0) {
                long j2 = aeVar.f220695f;
                khVar2.copyOnWrite();
                C51509ki kiVar8 = (C51509ki) khVar2.instance;
                kiVar8.f134190a |= 8;
                kiVar8.f134195f = j2;
            }
            if ((aeVar.f220690a & 128) != 0) {
                String str5 = aeVar.f220699j;
                khVar2.copyOnWrite();
                C51509ki kiVar9 = (C51509ki) khVar2.instance;
                str5.getClass();
                kiVar9.f134190a |= 32;
                kiVar9.f134197h = str5;
            }
            for (C80047aa aaVar : aeVar.f220693d) {
                C51516kp kpVar = (C51516kp) C51519ks.f134243h.createBuilder();
                C79027j jVar = f217329d;
                C80080z a2 = C80080z.m128077a(aaVar.f219659c);
                if (a2 == null) {
                    a2 = C80080z.UNRECOGNIZED;
                }
                C51518kr a3 = jVar.apply(a2);
                kpVar.copyOnWrite();
                C51519ks ksVar = (C51519ks) kpVar.instance;
                ksVar.f134248d = a3.f134242v;
                ksVar.f134245a |= 1;
                int i = aaVar.f219660d;
                kpVar.copyOnWrite();
                C51519ks ksVar2 = (C51519ks) kpVar.instance;
                ksVar2.f134245a |= 2;
                ksVar2.f134249e = i;
                int i2 = aaVar.f219661e;
                kpVar.copyOnWrite();
                C51519ks ksVar3 = (C51519ks) kpVar.instance;
                ksVar3.f134245a |= 4;
                ksVar3.f134250f = i2;
                double d = aaVar.f219663g;
                kpVar.copyOnWrite();
                C51519ks ksVar4 = (C51519ks) kpVar.instance;
                ksVar4.f134245a |= 8;
                ksVar4.f134251g = d;
                if (aaVar.f219657a == 10) {
                    C51520kt ktVar = (C51520kt) C51521ku.f134252e.createBuilder();
                    if (aaVar.f219657a == 10) {
                        agVar = (C80053ag) aaVar.f219658b;
                    } else {
                        agVar = C80053ag.f219675f;
                    }
                    String str6 = agVar.f219677a;
                    ktVar.copyOnWrite();
                    C51521ku kuVar = (C51521ku) ktVar.instance;
                    str6.getClass();
                    kuVar.f134254a |= 1;
                    kuVar.f134255b = str6;
                    if (aaVar.f219657a == 10) {
                        agVar2 = (C80053ag) aaVar.f219658b;
                    } else {
                        agVar2 = C80053ag.f219675f;
                    }
                    String str7 = agVar2.f219678b;
                    ktVar.copyOnWrite();
                    C51521ku kuVar2 = (C51521ku) ktVar.instance;
                    str7.getClass();
                    kuVar2.f134254a |= 2;
                    kuVar2.f134256c = str7;
                    if (aaVar.f219657a == 10) {
                        agVar3 = (C80053ag) aaVar.f219658b;
                    } else {
                        agVar3 = C80053ag.f219675f;
                    }
                    C62971cq cqVar = agVar3.f219679c;
                    ktVar.copyOnWrite();
                    C51521ku kuVar3 = (C51521ku) ktVar.instance;
                    C62971cq cqVar2 = kuVar3.f134257d;
                    if (!cqVar2.mo58948c()) {
                        kuVar3.f134257d = C62942bv.mutableCopy(cqVar2);
                    }
                    C62947c.addAll((Iterable) cqVar, (List) kuVar3.f134257d);
                    kpVar.copyOnWrite();
                    C51519ks ksVar5 = (C51519ks) kpVar.instance;
                    C51521ku kuVar4 = (C51521ku) ktVar.build();
                    kuVar4.getClass();
                    ksVar5.f134247c = kuVar4;
                    ksVar5.f134246b = 5;
                }
                C51519ks ksVar6 = (C51519ks) kpVar.build();
                khVar2.copyOnWrite();
                C51509ki kiVar10 = (C51509ki) khVar2.instance;
                ksVar6.getClass();
                C62971cq cqVar3 = kiVar10.f134192c;
                if (!cqVar3.mo58948c()) {
                    kiVar10.f134192c = C62942bv.mutableCopy(cqVar3);
                }
                kiVar10.f134192c.add(ksVar6);
            }
            C62963cj<C57667b> cjVar = new C62963cj(aeVar.f220700k, C80413ae.f220687l);
            khVar2.copyOnWrite();
            C51509ki kiVar11 = (C51509ki) khVar2.instance;
            C62961ch chVar = kiVar11.f134198i;
            if (!chVar.mo58948c()) {
                kiVar11.f134198i = C62942bv.mutableCopy(chVar);
            }
            for (C57667b bVar : cjVar) {
                kiVar11.f134198i.mo58916g(bVar.f154045D);
            }
            klVar.copyOnWrite();
            C51513km kmVar = (C51513km) klVar.instance;
            C51509ki kiVar12 = (C51509ki) khVar2.build();
            kiVar12.getClass();
            C62971cq cqVar4 = kmVar.f134207b;
            if (!cqVar4.mo58948c()) {
                kmVar.f134207b = C62942bv.mutableCopy(cqVar4);
            }
            kmVar.f134207b.add(kiVar12);
        }
        Optional j3 = hVar.mo72885j();
        boolean z = false;
        if (j3.isPresent() && Duration.between((Temporal) j3.get(), iVar.mo57444a()).compareTo(f217328c) < 0) {
            z = true;
        }
        klVar.copyOnWrite();
        C51513km kmVar2 = (C51513km) klVar.instance;
        kmVar2.f134206a |= 4;
        kmVar2.f134209d = z;
        klVar.copyOnWrite();
        C51513km kmVar3 = (C51513km) klVar.instance;
        kmVar3.f134206a |= 2;
        kmVar3.f134208c = true;
        C51513km kmVar4 = (C51513km) klVar.build();
        knVar.copyOnWrite();
        C51515ko koVar2 = (C51515ko) knVar.instance;
        kmVar4.getClass();
        koVar2.f134215b = kmVar4;
        koVar2.f134214a |= 1;
        return (C51515ko) knVar.build();
    }

    /* renamed from: e */
    public static Optional m126976e(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.query.context.params".equals(kcVar.f137065b)) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return Optional.m71637of((C51515ko) C62942bv.parseFrom((C62942bv) C51515ko.f134212e, kaVar.f137061c));
                } catch (C62974ct e) {
                    ((C58970a) ((C58970a) ((C58970a) f217327b.mo56226d()).mo56382g(e)).mo56372aa(5472)).mo56386p("Failed to parse QueryContextParams from ConversationParams.");
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: f */
    public static Function m126977f(C51515ko koVar, Optional optional, Function function, Function function2) {
        return new C79026i(koVar, optional, function2, function);
    }

    /* renamed from: c */
    public static C80413ae m126974c(C80413ae aeVar, C80413ae aeVar2) {
        if (aeVar == null || aeVar2 == null) {
            return (C80413ae) C58831av.m90830c(aeVar, aeVar2);
        }
        C80412ad adVar = (C80412ad) aeVar.toBuilder();
        if ((aeVar2.f220690a & 2) != 0) {
            String str = aeVar2.f220692c;
            adVar.copyOnWrite();
            C80413ae aeVar3 = (C80413ae) adVar.instance;
            str.getClass();
            aeVar3.f220690a |= 2;
            aeVar3.f220692c = str;
            adVar.copyOnWrite();
            ((C80413ae) adVar.instance).f220693d = C80413ae.emptyProtobufList();
            adVar.mo74324a(aeVar2.f220693d);
        }
        if ((aeVar2.f220690a & 1) != 0) {
            String str2 = aeVar2.f220691b;
            adVar.copyOnWrite();
            C80413ae aeVar4 = (C80413ae) adVar.instance;
            str2.getClass();
            aeVar4.f220690a |= 1;
            aeVar4.f220691b = str2;
        }
        if ((aeVar2.f220690a & 8) != 0) {
            long j = aeVar2.f220695f;
            adVar.copyOnWrite();
            C80413ae aeVar5 = (C80413ae) adVar.instance;
            aeVar5.f220690a |= 8;
            aeVar5.f220695f = j;
        }
        if ((aeVar2.f220690a & 16) != 0) {
            j jVar = aeVar2.f220696g;
            if (jVar == null) {
                jVar = j.c;
            }
            adVar.copyOnWrite();
            C80413ae aeVar6 = (C80413ae) adVar.instance;
            jVar.getClass();
            aeVar6.f220696g = jVar;
            aeVar6.f220690a |= 16;
        }
        adVar.mo74325b(new C62963cj(aeVar2.f220700k, C80413ae.f220687l));
        return (C80413ae) adVar.build();
    }
}
