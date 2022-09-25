package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52575wv;
import com.google.assistant.p3897e.p3921j.C52577wx;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.assistant.p3897e.p3921j.C52590xj;
import com.google.assistant.p3897e.p3921j.C52591xk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p4988b.p4992c.C64768p;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.w */
/* compiled from: PG */
final class C115387w {

    /* renamed from: a */
    private static final C59071e f320166a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.w");

    /* renamed from: a */
    public static C52174hz m191340a(C52174hz hzVar) {
        C52583xc xcVar;
        C52171hw hwVar = (C52171hw) C52174hz.f136892m.createBuilder(hzVar);
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder(woVar);
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f137996c == 26) {
            xcVar = (C52583xc) woVar2.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52575wv wvVar = (C52575wv) C52583xc.f138063o.createBuilder(xcVar);
        wvVar.copyOnWrite();
        C52583xc xcVar2 = (C52583xc) wvVar.instance;
        xcVar2.f138065a |= 2;
        xcVar2.f138067c = 0;
        C52579wz wzVar = C52579wz.UNREAD;
        wvVar.copyOnWrite();
        C52583xc xcVar3 = (C52583xc) wvVar.instance;
        xcVar3.f138066b = wzVar.f138049f;
        xcVar3.f138065a |= 1;
        wjVar.copyOnWrite();
        C52568wo woVar3 = (C52568wo) wjVar.instance;
        C52583xc xcVar4 = (C52583xc) wvVar.build();
        xcVar4.getClass();
        woVar3.f137997d = xcVar4;
        woVar3.f137996c = 26;
        hwVar.copyOnWrite();
        C52174hz hzVar2 = (C52174hz) hwVar.instance;
        C52568wo woVar4 = (C52568wo) wjVar.build();
        woVar4.getClass();
        hzVar2.f136897d = woVar4;
        hzVar2.f136894a |= 8;
        return (C52174hz) hwVar.build();
    }

    /* renamed from: b */
    public static C52176ia m191341b(C52176ia iaVar, int i) {
        C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder(iaVar);
        hvVar.mo53811g(i, m191350k((C52174hz) iaVar.f136914b.get(i)));
        return (C52176ia) hvVar.build();
    }

    /* renamed from: c */
    public static C52176ia m191342c(C52176ia iaVar, int i, boolean z) {
        C52583xc xcVar;
        boolean z2 = true;
        if (iaVar.f136914b.size() <= i && i < 0) {
            z2 = false;
        }
        C58838bb.m90869d(z2, "invalid item index");
        if (iaVar.f136916d == i) {
            return iaVar;
        }
        C52170hv hvVar = (C52170hv) iaVar.toBuilder();
        hvVar.copyOnWrite();
        C52176ia iaVar2 = (C52176ia) hvVar.instance;
        iaVar2.f136913a |= 8;
        iaVar2.f136916d = i;
        if (z) {
            int i2 = iaVar.f136916d;
            hvVar.mo53811g(i2, m191350k((C52174hz) iaVar.f136914b.get(i2)));
        }
        C52174hz a = hvVar.mo53805a(i);
        C52568wo woVar = a.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52579wz a2 = C52579wz.m86656a(xcVar.f138066b);
        if (a2 == null) {
            a2 = C52579wz.UNKNOWN_READ_STATE;
        }
        if (a2 == C52579wz.READ) {
            hvVar.mo53811g(i, m191340a(a));
        }
        return (C52176ia) hvVar.build();
    }

    /* renamed from: d */
    public static C52577wx m191343d(C52176ia iaVar) {
        C52583xc xcVar;
        if (iaVar.f136914b.size() <= 0) {
            return C52577wx.READ_IT_LATER;
        }
        C52568wo woVar = ((C52174hz) iaVar.f136914b.get(0)).f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52577wx a = C52577wx.m86654a(xcVar.f138069e);
        return a == null ? C52577wx.UNKNOWN_PLAYBACK_TYPE : a;
    }

    /* renamed from: e */
    public static C52577wx m191344e(C52176ia iaVar) {
        C52583xc xcVar;
        if (iaVar.f136914b.isEmpty()) {
            return C52577wx.UNKNOWN_PLAYBACK_TYPE;
        }
        C52568wo woVar = ((C52174hz) iaVar.f136914b.get(0)).f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52577wx a = C52577wx.m86654a(xcVar.f138069e);
        if (a == null) {
            a = C52577wx.UNKNOWN_PLAYBACK_TYPE;
        }
        for (C52174hz hzVar : iaVar.f136914b) {
            C52568wo woVar2 = hzVar.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            C52577wx a2 = C52577wx.m86654a((woVar2.f137996c == 26 ? (C52583xc) woVar2.f137997d : C52583xc.f138063o).f138069e);
            if (a2 == null) {
                a2 = C52577wx.UNKNOWN_PLAYBACK_TYPE;
                continue;
            }
            if (a2 != a) {
                return C52577wx.UNKNOWN_PLAYBACK_TYPE;
            }
        }
        return a;
    }

    /* renamed from: f */
    public static C52591xk m191345f(C68189by byVar) {
        C52590xj xjVar = (C52590xj) C52591xk.f138094b.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(byVar.f184507a).map(C115385u.f320163a).collect(Collectors.toList());
        xjVar.copyOnWrite();
        C52591xk xkVar = (C52591xk) xjVar.instance;
        C62971cq cqVar = xkVar.f138096a;
        if (!cqVar.mo58948c()) {
            xkVar.f138096a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) xkVar.f138096a);
        return (C52591xk) xjVar.build();
    }

    /* renamed from: g */
    public static C58833ax m191346g(C52176ia iaVar, int i) {
        C52583xc xcVar;
        while (i < iaVar.f136914b.size()) {
            C52568wo woVar = ((C52174hz) iaVar.f136914b.get(i)).f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 26) {
                xcVar = (C52583xc) woVar.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            C52579wz a = C52579wz.m86656a(xcVar.f138066b);
            if (a == null) {
                a = C52579wz.UNKNOWN_READ_STATE;
            }
            Integer valueOf = Integer.valueOf(i);
            ((C59052c) ((C59052c) f320166a.mo56224b()).mo56372aa(29771)).mo56359L("getIndexToPlay#index: %d, readState: %s, url: %s", valueOf, a, ((C52174hz) iaVar.f136914b.get(i)).f136895b);
            if (a != C52579wz.ARCHIVED && a != C52579wz.READ) {
                return C58833ax.m90834k(valueOf);
            }
            i++;
        }
        return C58836b.f156633a;
    }

    /* renamed from: h */
    public static boolean m191347h(C52174hz hzVar) {
        C52583xc xcVar;
        C52583xc xcVar2;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        if (xcVar.f138074j.size() > 0) {
            return true;
        }
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f137996c == 26) {
            xcVar2 = (C52583xc) woVar2.f137997d;
        } else {
            xcVar2 = C52583xc.f138063o;
        }
        C64768p pVar = xcVar2.f138075k;
        if (pVar == null) {
            pVar = C64768p.f175564b;
        }
        return pVar.f175566a.size() > 0;
    }

    /* renamed from: i */
    public static boolean m191348i(C52176ia iaVar) {
        if (iaVar.f136914b.size() == 1) {
            C52568wo woVar = ((C52174hz) iaVar.f136914b.get(0)).f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C52567wn b = C52567wn.m86649b(woVar.f138003j);
            if (b == null) {
                b = C52567wn.UNKNOWN;
            }
            if (b == C52567wn.PHOTO) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m191349j(C52176ia iaVar, C52176ia iaVar2) {
        return m191343d(iaVar).equals(m191343d(iaVar2)) && iaVar.f136916d == iaVar2.f136916d && C58597ky.m90218i(m191351l(iaVar), m191351l(iaVar2));
    }

    /* renamed from: k */
    private static C52174hz m191350k(C52174hz hzVar) {
        C52583xc xcVar;
        C52171hw hwVar = (C52171hw) C52174hz.f136892m.createBuilder(hzVar);
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder(woVar);
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        if (woVar2.f137996c == 26) {
            xcVar = (C52583xc) woVar2.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52575wv wvVar = (C52575wv) C52583xc.f138063o.createBuilder(xcVar);
        C52579wz wzVar = C52579wz.READ;
        wvVar.copyOnWrite();
        C52583xc xcVar2 = (C52583xc) wvVar.instance;
        xcVar2.f138066b = wzVar.f138049f;
        xcVar2.f138065a |= 1;
        wjVar.copyOnWrite();
        C52568wo woVar3 = (C52568wo) wjVar.instance;
        C52583xc xcVar3 = (C52583xc) wvVar.build();
        xcVar3.getClass();
        woVar3.f137997d = xcVar3;
        woVar3.f137996c = 26;
        hwVar.copyOnWrite();
        C52174hz hzVar2 = (C52174hz) hwVar.instance;
        C52568wo woVar4 = (C52568wo) wjVar.build();
        woVar4.getClass();
        hzVar2.f136897d = woVar4;
        hzVar2.f136894a |= 8;
        return (C52174hz) hwVar.build();
    }

    /* renamed from: l */
    private static C58485gu m191351l(C52176ia iaVar) {
        C52583xc xcVar;
        C58480gp e = C58485gu.m89837e();
        for (C52174hz hzVar : iaVar.f136914b) {
            e.mo55395g(C58485gu.m89846n(hzVar.f136895b));
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 26) {
                xcVar = (C52583xc) woVar.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            e.mo55395g(C58485gu.m89842j(xcVar.f138074j));
        }
        return e.mo55394f();
    }
}
