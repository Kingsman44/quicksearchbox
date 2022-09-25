package com.google.android.apps.gsa.nga.shared.p6358n;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80402o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80294ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80306ba;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80361r;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80364u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82984hs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p5030q.C65196fc;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.n.m */
/* compiled from: PG */
public final class C81442m {

    /* renamed from: a */
    public static final C60870cx f222851a = C60856cj.m92900i(C80401n.f220656k);

    /* renamed from: a */
    public static C82988hw m129539a(C80401n nVar) {
        C82984hs hsVar = (C82984hs) C82988hw.f226443y.createBuilder();
        hsVar.copyOnWrite();
        C82988hw hwVar = (C82988hw) hsVar.instance;
        nVar.getClass();
        hwVar.f226470x = nVar;
        hwVar.f226448b |= 512;
        m129547i(nVar).ifPresent(new C81433d(hsVar));
        return (C82988hw) hsVar.build();
    }

    /* renamed from: b */
    public static C80401n m129540b(C80399l lVar, C80303ay ayVar) {
        if (!m129553o(lVar)) {
            C55421x a = C55421x.m87686a(((C80307bb) ayVar.instance).f220386c);
            if (a == null) {
                a = C55421x.UNKNOWN_ACTION_TYPE;
            }
            if (a != C55421x.UNKNOWN_ACTION_TYPE) {
                C80307bb bbVar = (C80307bb) ayVar.instance;
                int a2 = C80306ba.m128119a(bbVar.f220385b);
                if (!(a2 == 0 || a2 == 1 || bbVar.f220387d.size() == 0)) {
                    C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
                    aoVar.copyOnWrite();
                    C80295aq aqVar = (C80295aq) aoVar.instance;
                    C80307bb bbVar2 = (C80307bb) ayVar.build();
                    bbVar2.getClass();
                    aqVar.f220360b = bbVar2;
                    aqVar.f220359a = 6;
                    m129555q(lVar, aoVar);
                }
            }
        }
        return (C80401n) lVar.build();
    }

    /* renamed from: c */
    public static C80401n m129541c(C80506i iVar, C80363t tVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(6);
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        C80361r rVar = (C80361r) C80364u.f220516d.createBuilder();
        rVar.copyOnWrite();
        C80364u uVar = (C80364u) rVar.instance;
        iVar.getClass();
        uVar.f220519b = iVar;
        uVar.f220518a = 3;
        rVar.copyOnWrite();
        ((C80364u) rVar.instance).f220520c = tVar.getNumber();
        C80364u uVar2 = (C80364u) rVar.build();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        uVar2.getClass();
        aqVar.f220360b = uVar2;
        aqVar.f220359a = 9;
        m129555q(lVar, aoVar);
        return (C80401n) lVar.build();
    }

    /* renamed from: d */
    public static C80401n m129542d(String str, C80363t tVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(3);
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        C80361r rVar = (C80361r) C80364u.f220516d.createBuilder();
        rVar.copyOnWrite();
        C80364u uVar = (C80364u) rVar.instance;
        str.getClass();
        uVar.f220518a = 1;
        uVar.f220519b = str;
        rVar.copyOnWrite();
        ((C80364u) rVar.instance).f220520c = tVar.getNumber();
        C80364u uVar2 = (C80364u) rVar.build();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        uVar2.getClass();
        aqVar.f220360b = uVar2;
        aqVar.f220359a = 9;
        m129555q(lVar, aoVar);
        return (C80401n) lVar.build();
    }

    /* renamed from: e */
    public static C58485gu m129543e(C80401n nVar, C65475b bVar) {
        C58485gu f = m129544f(nVar);
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(f);
        e.mo55396h((C58485gu) Collection.EL.stream(m129546h(nVar)).map(new C81437h(bVar)).collect(C58370cn.f155946a));
        return e.mo55394f();
    }

    /* renamed from: f */
    public static C58485gu m129544f(C80401n nVar) {
        return (C58485gu) Collection.EL.stream(nVar.f220658a).filter(C81441l.f222850a).map(C81431b.f222840a).collect(C58370cn.f155946a);
    }

    /* renamed from: g */
    public static C58485gu m129545g(C80401n nVar, String str) {
        return (C58485gu) Collection.EL.stream(m129544f(nVar)).filter(new C81436g(str)).collect(C58370cn.f155946a);
    }

    /* renamed from: h */
    public static C58485gu m129546h(C80401n nVar) {
        return (C58485gu) Collection.EL.stream(nVar.f220658a).filter(C81439j.f222848a).map(C81440k.f222849a).collect(C58370cn.f155946a);
    }

    /* renamed from: i */
    public static Optional m129547i(C80401n nVar) {
        return m129549k(nVar, C80294ap.CLOUD_HANDOVER_OP).map(C81438i.f222847a);
    }

    /* renamed from: j */
    public static Optional m129548j(C80401n nVar) {
        return m129549k(nVar, C80294ap.CLOUD_HANDOVER_OP).map(C81438i.f222847a).map(C81432c.f222841a);
    }

    /* renamed from: k */
    public static Optional m129549k(C80401n nVar, C80294ap apVar) {
        return Collection.EL.stream(m129546h(nVar)).filter(new C81435f(apVar)).findFirst();
    }

    /* renamed from: l */
    public static void m129550l(C80399l lVar, String str, String str2, MessageLite messageLite) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = str2;
        C63088z byteString = messageLite.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        lVar.mo74316h(kbVar);
    }

    /* renamed from: m */
    public static boolean m129551m(C80401n nVar) {
        return nVar.f220662e != null || m129549k(nVar, C80294ap.POPUP_ACTION_OP).isPresent();
    }

    /* renamed from: n */
    public static boolean m129552n(C80401n nVar) {
        return !m129545g(nVar, "text.DICTATE").isEmpty();
    }

    /* renamed from: o */
    public static boolean m129553o(C80402o oVar) {
        return oVar.mo74309a() == 0 && oVar.mo74311c() == 0 && oVar.mo74312d().equals(C65196fc.f176453l) && oVar.mo74310b() == 0;
    }

    /* renamed from: p */
    public static void m129554p(C80399l lVar, C52230ka kaVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.dialog.state.params";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar.getClass();
        kcVar2.f137066c = kaVar;
        kcVar2.f137064a |= 2;
        lVar.mo74316h(kbVar);
    }

    /* renamed from: q */
    public static void m129555q(C80399l lVar, C80293ao aoVar) {
        m129558t(lVar, (C80295aq) aoVar.build());
    }

    /* renamed from: r */
    public static boolean m129556r(boolean z, int i) {
        if (z) {
            return false;
        }
        if (i != 0) {
            return i == 7;
        }
        throw null;
    }

    /* renamed from: s */
    public static void m129557s(C80399l lVar, C51809dy dyVar) {
        C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        dyVar.getClass();
        gVar.f220648b = dyVar;
        gVar.f220647a = 1;
        lVar.mo74317i(eVar);
    }

    /* renamed from: t */
    public static void m129558t(C80399l lVar, C80295aq aqVar) {
        C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        aqVar.getClass();
        gVar.f220648b = aqVar;
        gVar.f220647a = 2;
        lVar.mo74317i(eVar);
    }
}
