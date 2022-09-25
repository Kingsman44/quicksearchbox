package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.ag.at;
import com.google.android.apps.gsa.nga.engine.gestureclassifier.C76118h;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74819bd;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82814bk;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82815bl;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82839ci;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82933fv;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82934fw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83009r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4552o.agu;
import com.google.common.p4552o.agv;
import com.google.common.p4552o.agw;
import com.google.common.p4552o.agx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66706aj;
import com.google.speech.p5218j.p5219a.C66707ak;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5220b.p5221a.C66821y;
import java.util.List;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.z */
/* compiled from: PG */
public final class C79878z {

    /* renamed from: a */
    public static final C79877y f218943a = new C79877y();

    /* renamed from: b */
    public static final C79876x f218944b = new C79876x();

    /* renamed from: c */
    private static final C79875w f218945c = new C79875w();

    /* renamed from: a */
    public static C82885ea m128026a(Throwable th) {
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82814bk bkVar = (C82814bk) C82815bl.f225662e.createBuilder();
        String name = th.getClass().getName();
        bkVar.copyOnWrite();
        name.getClass();
        ((C82815bl) bkVar.instance).f225664a = name;
        Iterable iterable = (Iterable) DesugarArrays.stream((T[]) th.getStackTrace()).map(C79865m.f218930a).collect(C58370cn.f155946a);
        bkVar.copyOnWrite();
        C82815bl blVar = (C82815bl) bkVar.instance;
        C62971cq cqVar = blVar.f225666c;
        if (!cqVar.mo58948c()) {
            blVar.f225666c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) blVar.f225666c);
        C82815bl blVar2 = (C82815bl) bkVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        blVar2.getClass();
        eaVar.f225980b = blVar2;
        eaVar.f225979a = 28;
        return (C82885ea) dzVar.build();
    }

    /* renamed from: b */
    public static C82885ea m128027b(C74819bd bdVar) {
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82933fv fvVar = (C82933fv) C82934fw.f226257e.createBuilder();
        at atVar = (at) bdVar;
        boolean z = atVar.a;
        fvVar.copyOnWrite();
        C82934fw fwVar = (C82934fw) fvVar.instance;
        fwVar.f226259a |= 1;
        fwVar.f226260b = z;
        boolean z2 = atVar.b;
        fvVar.copyOnWrite();
        C82934fw fwVar2 = (C82934fw) fvVar.instance;
        fwVar2.f226259a |= 2;
        fwVar2.f226261c = z2;
        boolean z3 = atVar.c;
        fvVar.copyOnWrite();
        C82934fw fwVar3 = (C82934fw) fvVar.instance;
        fwVar3.f226259a |= 4;
        fwVar3.f226262d = z3;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82934fw fwVar4 = (C82934fw) fvVar.build();
        fwVar4.getClass();
        eaVar.f225980b = fwVar4;
        eaVar.f225979a = 22;
        return (C82885ea) dzVar.build();
    }

    /* renamed from: c */
    public static C80478c m128028c(C77557aj ajVar) {
        return f218945c.apply(ajVar.mo72639b());
    }

    /* renamed from: d */
    public static agx m128029d(C66722az azVar) {
        C66706aj ajVar;
        C66700ad adVar;
        agu agu = (agu) agx.f158676b.createBuilder();
        for (C66707ak akVar : azVar.f181496b) {
            int i = akVar.f181461b;
            int i2 = 0;
            int i3 = i != 0 ? i != 2 ? i != 3 ? 0 : 2 : 1 : 3;
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == 0) {
                    if (i == 2) {
                        ajVar = (C66706aj) akVar.f181462c;
                    } else {
                        ajVar = C66706aj.f181455b;
                    }
                    i2 = ajVar.f181457a.size();
                } else if (i4 == 1) {
                    if (i == 3) {
                        adVar = (C66700ad) akVar.f181462c;
                    } else {
                        adVar = C66700ad.f181439d;
                    }
                    i2 = adVar.f181443c.size();
                }
                agv agv = (agv) agw.f158671d.createBuilder();
                String str = akVar.f181463d;
                agv.copyOnWrite();
                agw agw = (agw) agv.instance;
                str.getClass();
                agw.f158673a = 1 | agw.f158673a;
                agw.f158674b = str;
                agv.copyOnWrite();
                agw agw2 = (agw) agv.instance;
                agw2.f158673a |= 2;
                agw2.f158675c = i2;
                agu.copyOnWrite();
                agx agx = (agx) agu.instance;
                agw agw3 = (agw) agv.build();
                agw3.getClass();
                C62971cq cqVar = agx.f158678a;
                if (!cqVar.mo58948c()) {
                    agx.f158678a = C62942bv.mutableCopy(cqVar);
                }
                agx.f158678a.add(agw3);
            } else {
                throw null;
            }
        }
        return (agx) agu.build();
    }

    /* renamed from: e */
    public static Supplier m128030e(C83009r rVar) {
        return new C79872t(rVar);
    }

    /* renamed from: f */
    public static Supplier m128031f(C82839ci ciVar) {
        return new C79869q(ciVar);
    }

    /* renamed from: g */
    public static Supplier m128032g(C82843cm cmVar) {
        return new C79870r(cmVar);
    }

    /* renamed from: h */
    public static Supplier m128033h(C76118h hVar, double d) {
        return new C79864l(hVar, d);
    }

    /* renamed from: i */
    public static Supplier m128034i(C77557aj ajVar, Optional optional) {
        return new C79874v(optional, ajVar);
    }

    /* renamed from: j */
    public static Supplier m128035j(C66821y yVar, C66722az azVar) {
        return new C79873u(yVar, azVar);
    }

    /* renamed from: k */
    public static Supplier m128036k(int i) {
        return new C79866n(i);
    }

    /* renamed from: l */
    public static Supplier m128037l(List list, C66722az azVar) {
        return new C79871s(list, azVar);
    }
}
