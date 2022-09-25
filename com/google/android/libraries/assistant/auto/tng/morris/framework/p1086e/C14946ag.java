package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14739i;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14284dn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14285do;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14318eu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14332fh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14415ij;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14417il;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14571od;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.ag */
/* compiled from: PG */
public final class C14946ag {

    /* renamed from: a */
    public static final /* synthetic */ int f44897a = 0;

    /* renamed from: b */
    private static final C58495hd f44898b;

    /* renamed from: c */
    private static final C58495hd f44899c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C14284dn.NEXT, C14318eu.ACTION_SKIP_TO_NEXT);
        gzVar.mo55429h(C14284dn.PREV, C14318eu.ACTION_SKIP_TO_PREVIOUS);
        gzVar.mo55429h(C14284dn.FORWARD, C14318eu.ACTION_SEEK_TO);
        gzVar.mo55429h(C14284dn.BACKWARD, C14318eu.ACTION_SEEK_TO);
        f44898b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C14284dn.PLAY, C14739i.m31032e());
        gzVar2.mo55429h(C14284dn.PAUSE, C14739i.m31031d());
        gzVar2.mo55429h(C14284dn.STOP, C14739i.m31035h());
        C14284dn dnVar = C14284dn.NEXT;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14415ij ijVar = (C14415ij) C14417il.f43604g.createBuilder();
        ijVar.copyOnWrite();
        ((C14417il) ijVar.instance).f43606a = 3;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14417il ilVar = (C14417il) ijVar.build();
        ilVar.getClass();
        lfVar.f43801d = ilVar;
        lfVar.f43800c = 6;
        gzVar2.mo55429h(dnVar, (C14492lf) gtVar.build());
        C14284dn dnVar2 = C14284dn.PREV;
        C14371gt gtVar2 = (C14371gt) C14492lf.f43796e.createBuilder();
        C14415ij ijVar2 = (C14415ij) C14417il.f43604g.createBuilder();
        ijVar2.copyOnWrite();
        ((C14417il) ijVar2.instance).f43606a = 5;
        gtVar2.copyOnWrite();
        C14492lf lfVar2 = (C14492lf) gtVar2.instance;
        C14417il ilVar2 = (C14417il) ijVar2.build();
        ilVar2.getClass();
        lfVar2.f43801d = ilVar2;
        lfVar2.f43800c = 6;
        gzVar2.mo55429h(dnVar2, (C14492lf) gtVar2.build());
        C14284dn dnVar3 = C14284dn.FORWARD;
        C14371gt gtVar3 = (C14371gt) C14492lf.f43796e.createBuilder();
        C14415ij ijVar3 = (C14415ij) C14417il.f43604g.createBuilder();
        ijVar3.copyOnWrite();
        ((C14417il) ijVar3.instance).f43606a = 4;
        gtVar3.copyOnWrite();
        C14492lf lfVar3 = (C14492lf) gtVar3.instance;
        C14417il ilVar3 = (C14417il) ijVar3.build();
        ilVar3.getClass();
        lfVar3.f43801d = ilVar3;
        lfVar3.f43800c = 6;
        gzVar2.mo55429h(dnVar3, (C14492lf) gtVar3.build());
        C14284dn dnVar4 = C14284dn.BACKWARD;
        C14371gt gtVar4 = (C14371gt) C14492lf.f43796e.createBuilder();
        C14415ij ijVar4 = (C14415ij) C14417il.f43604g.createBuilder();
        ijVar4.copyOnWrite();
        ((C14417il) ijVar4.instance).f43606a = 6;
        gtVar4.copyOnWrite();
        C14492lf lfVar4 = (C14492lf) gtVar4.instance;
        C14417il ilVar4 = (C14417il) ijVar4.build();
        ilVar4.getClass();
        lfVar4.f43801d = ilVar4;
        lfVar4.f43800c = 6;
        gzVar2.mo55429h(dnVar4, (C14492lf) gtVar4.build());
        f44899c = gzVar2.mo55427f(false);
    }

    /* renamed from: a */
    public static void m31464a(C14342fr frVar, C14332fh fhVar, C86124t tVar) {
        C58485gu guVar;
        C58485gu guVar2;
        String str = frVar.f43394d;
        fhVar.copyOnWrite();
        C14333fi fiVar = C14333fi.f43350q;
        str.getClass();
        ((C14333fi) fhVar.instance).f43357f = str;
        String str2 = frVar.f43395e;
        fhVar.copyOnWrite();
        str2.getClass();
        ((C14333fi) fhVar.instance).f43358g = str2;
        String str3 = frVar.f43391a;
        fhVar.copyOnWrite();
        str3.getClass();
        ((C14333fi) fhVar.instance).f43354c = str3;
        String str4 = frVar.f43392b;
        fhVar.copyOnWrite();
        str4.getClass();
        ((C14333fi) fhVar.instance).f43355d = str4;
        C14216b bVar = frVar.f43393c;
        if (bVar == null) {
            bVar = C14216b.f43007f;
        }
        fhVar.copyOnWrite();
        bVar.getClass();
        ((C14333fi) fhVar.instance).f43356e = bVar;
        C14320ew ewVar = frVar.f43397g;
        if (ewVar == null) {
            ewVar = C14320ew.f43317e;
        }
        C62963cj cjVar = new C62963cj(ewVar.f43320b, C14320ew.f43316c);
        C14285do doVar = (C14285do) C14286dp.f43215f.createBuilder();
        C14284dn dnVar = C14284dn.SEEK_TO;
        doVar.copyOnWrite();
        ((C14286dp) doVar.instance).f43218b = dnVar.getNumber();
        int i = true != cjVar.contains(C14318eu.ACTION_SEEK_TO) ? 4 : 3;
        doVar.copyOnWrite();
        ((C14286dp) doVar.instance).f43217a = i - 2;
        C14286dp dpVar = (C14286dp) doVar.build();
        fhVar.copyOnWrite();
        dpVar.getClass();
        ((C14333fi) fhVar.instance).f43364m = dpVar;
        long j = frVar.f43398h;
        fhVar.copyOnWrite();
        ((C14333fi) fhVar.instance).f43365n = j;
        long j2 = frVar.f43399i;
        fhVar.copyOnWrite();
        ((C14333fi) fhVar.instance).f43366o = j2;
        C14320ew ewVar2 = frVar.f43397g;
        if (ewVar2 == null) {
            ewVar2 = C14320ew.f43317e;
        }
        int b = C14319ev.m30606b(ewVar2.f43319a);
        if (b == 0) {
            b = 1;
        }
        fhVar.copyOnWrite();
        ((C14333fi) fhVar.instance).f43367p = C14319ev.m30605a(b);
        C14361gj gjVar = frVar.f43400j;
        if (gjVar != null) {
            fhVar.copyOnWrite();
            C14333fi fiVar2 = (C14333fi) fhVar.instance;
            fiVar2.f43353b = gjVar;
            fiVar2.f43352a = 6;
        } else {
            String str5 = frVar.f43396f;
            fhVar.copyOnWrite();
            C14333fi fiVar3 = (C14333fi) fhVar.instance;
            str5.getClass();
            fiVar3.f43352a = 5;
            fiVar3.f43353b = str5;
        }
        C14320ew ewVar3 = frVar.f43397g;
        int b2 = C14319ev.m30606b((ewVar3 == null ? C14320ew.f43317e : ewVar3).f43319a);
        if (b2 == 0) {
            b2 = 1;
        }
        if (ewVar3 == null) {
            ewVar3 = C14320ew.f43317e;
        }
        C14286dp e = m31468e(b2, new C62963cj(ewVar3.f43320b, C14320ew.f43316c));
        fhVar.copyOnWrite();
        e.getClass();
        ((C14333fi) fhVar.instance).f43359h = e;
        C14320ew ewVar4 = frVar.f43397g;
        if (ewVar4 == null) {
            ewVar4 = C14320ew.f43317e;
        }
        C62963cj cjVar2 = new C62963cj(ewVar4.f43320b, C14320ew.f43316c);
        C14320ew ewVar5 = frVar.f43397g;
        if (ewVar5 == null) {
            ewVar5 = C14320ew.f43317e;
        }
        C62971cq cqVar = ewVar5.f43321d;
        boolean d = m31467d(tVar, frVar.f43391a);
        ArrayList arrayList = new ArrayList();
        if (!d || cqVar.isEmpty()) {
            guVar = C58485gu.m89847o(C14284dn.PREV, C14284dn.BACKWARD);
        } else {
            guVar = C58485gu.m89846n(C14284dn.PREV);
        }
        C14939a aVar = (C14939a) m31466c(cjVar2, guVar, cqVar, 0, Optional.m71637of(C14284dn.PREV), d);
        arrayList.add(aVar.f44889a);
        int i2 = aVar.f44890b;
        if (!d || cqVar.isEmpty()) {
            guVar2 = C58485gu.m89847o(C14284dn.NEXT, C14284dn.FORWARD);
        } else {
            guVar2 = C58485gu.m89846n(C14284dn.NEXT);
        }
        C14939a aVar2 = (C14939a) m31466c(cjVar2, guVar2, cqVar, i2, Optional.m71637of(C14284dn.NEXT), d);
        arrayList.add(aVar2.f44889a);
        if (aVar2.f44890b) {
            i2++;
        }
        C14939a aVar3 = (C14939a) m31466c(cjVar2, C58485gu.m89845m(), cqVar, i2, Optional.empty(), d);
        arrayList.add(aVar3.f44889a);
        if (aVar3.f44890b) {
            i2++;
        }
        arrayList.add(((C14939a) m31466c(cjVar2, C58485gu.m89845m(), cqVar, i2, Optional.empty(), d)).f44889a);
        C14286dp dpVar2 = (C14286dp) arrayList.get(0);
        fhVar.copyOnWrite();
        dpVar2.getClass();
        ((C14333fi) fhVar.instance).f43360i = dpVar2;
        C14286dp dpVar3 = (C14286dp) arrayList.get(1);
        fhVar.copyOnWrite();
        dpVar3.getClass();
        ((C14333fi) fhVar.instance).f43361j = dpVar3;
        C14286dp dpVar4 = (C14286dp) arrayList.get(2);
        fhVar.copyOnWrite();
        dpVar4.getClass();
        ((C14333fi) fhVar.instance).f43362k = dpVar4;
        C14286dp dpVar5 = (C14286dp) arrayList.get(3);
        fhVar.copyOnWrite();
        dpVar5.getClass();
        ((C14333fi) fhVar.instance).f43363l = dpVar5;
    }

    /* renamed from: b */
    public static void m31465b(C14342fr frVar, C14571od odVar, C86124t tVar) {
        C14286dp dpVar;
        C58485gu guVar;
        String str = frVar.f43394d;
        odVar.copyOnWrite();
        C14572oe oeVar = C14572oe.f44055i;
        str.getClass();
        ((C14572oe) odVar.instance).f44059c = str;
        String str2 = frVar.f43395e;
        odVar.copyOnWrite();
        str2.getClass();
        ((C14572oe) odVar.instance).f44060d = str2;
        String str3 = frVar.f43391a;
        odVar.copyOnWrite();
        str3.getClass();
        ((C14572oe) odVar.instance).f44057a = str3;
        String str4 = frVar.f43392b;
        odVar.copyOnWrite();
        str4.getClass();
        ((C14572oe) odVar.instance).f44058b = str4;
        C14320ew ewVar = frVar.f43397g;
        if (ewVar == null) {
            ewVar = C14320ew.f43317e;
        }
        odVar.copyOnWrite();
        C14572oe oeVar2 = (C14572oe) odVar.instance;
        ewVar.getClass();
        oeVar2.f44062f = ewVar;
        C14320ew ewVar2 = oeVar2.f44062f;
        int b = C14319ev.m30606b((ewVar2 == null ? C14320ew.f43317e : ewVar2).f43319a);
        if (b == 0) {
            b = 1;
        }
        if (ewVar2 == null) {
            ewVar2 = C14320ew.f43317e;
        }
        C14286dp e = m31468e(b, new C62963cj(ewVar2.f43320b, C14320ew.f43316c));
        odVar.copyOnWrite();
        C14572oe oeVar3 = (C14572oe) odVar.instance;
        e.getClass();
        oeVar3.f44061e = e;
        C14320ew ewVar3 = oeVar3.f44062f;
        if (ewVar3 == null) {
            ewVar3 = C14320ew.f43317e;
        }
        boolean d = m31467d(tVar, oeVar3.f44057a);
        C62963cj cjVar = new C62963cj(ewVar3.f43320b, C14320ew.f43316c);
        C62971cq cqVar = ewVar3.f43321d;
        if (d) {
            Iterator it = cqVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C14317et etVar = (C14317et) it.next();
                if (etVar.f43304b.contains("morris_miniplayer")) {
                    dpVar = ((C14939a) m31466c(cjVar, C58485gu.m89845m(), cqVar, cqVar.indexOf(etVar), Optional.empty(), true)).f44889a;
                    break;
                }
            }
        }
        if (!d || cqVar.isEmpty()) {
            guVar = C58485gu.m89847o(C14284dn.NEXT, C14284dn.FORWARD);
        } else {
            guVar = C58485gu.m89846n(C14284dn.NEXT);
        }
        dpVar = ((C14939a) m31466c(cjVar, guVar, cqVar, 1, Optional.m71637of(C14284dn.NEXT), d)).f44889a;
        odVar.copyOnWrite();
        ((C14572oe) odVar.instance).f44064h = dpVar;
    }

    /* renamed from: c */
    private static C14945af m31466c(List list, List list2, List list3, int i, Optional optional, boolean z) {
        C14285do doVar = (C14285do) C14286dp.f43215f.createBuilder();
        C58801sm G = ((C58485gu) list2).listIterator(0);
        while (G.hasNext()) {
            C14284dn dnVar = (C14284dn) G.next();
            if (list.contains(f44898b.get(dnVar))) {
                doVar.copyOnWrite();
                ((C14286dp) doVar.instance).f43218b = dnVar.getNumber();
                doVar.copyOnWrite();
                ((C14286dp) doVar.instance).f43217a = 1;
                C14492lf lfVar = (C14492lf) f44899c.get(dnVar);
                lfVar.getClass();
                doVar.copyOnWrite();
                ((C14286dp) doVar.instance).f43220d = lfVar;
                return new C14939a((C14286dp) doVar.build(), false);
            }
        }
        if (!z || i >= list3.size()) {
            optional.ifPresent(new C14944ae(doVar));
            return new C14939a((C14286dp) doVar.build(), false);
        }
        C14284dn dnVar2 = C14284dn.CUSTOM_ACTION;
        doVar.copyOnWrite();
        ((C14286dp) doVar.instance).f43218b = dnVar2.getNumber();
        int i2 = ((C14317et) list3.get(i)).f43305c;
        doVar.copyOnWrite();
        ((C14286dp) doVar.instance).f43219c = i2;
        String str = ((C14317et) list3.get(i)).f43304b;
        doVar.copyOnWrite();
        str.getClass();
        ((C14286dp) doVar.instance).f43221e = str;
        doVar.copyOnWrite();
        ((C14286dp) doVar.instance).f43217a = 1;
        String str2 = ((C14317et) list3.get(i)).f43303a;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14415ij ijVar = (C14415ij) C14417il.f43604g.createBuilder();
        ijVar.copyOnWrite();
        ((C14417il) ijVar.instance).f43606a = 16;
        ijVar.copyOnWrite();
        str2.getClass();
        ((C14417il) ijVar.instance).f43610e = str2;
        gtVar.copyOnWrite();
        C14492lf lfVar2 = (C14492lf) gtVar.instance;
        C14417il ilVar = (C14417il) ijVar.build();
        ilVar.getClass();
        lfVar2.f43801d = ilVar;
        lfVar2.f43800c = 6;
        C14492lf lfVar3 = (C14492lf) gtVar.build();
        doVar.copyOnWrite();
        lfVar3.getClass();
        ((C14286dp) doVar.instance).f43220d = lfVar3;
        return new C14939a((C14286dp) doVar.build(), true);
    }

    /* renamed from: d */
    private static boolean m31467d(C86124t tVar, String str) {
        C58485gu c = tVar.mo79745c(C90051dc.f248879bh);
        return c.isEmpty() || c.contains(str);
    }

    /* renamed from: e */
    private static C14286dp m31468e(int i, List list) {
        if (i == 5) {
            if (list.contains(C14318eu.ACTION_PAUSE)) {
                C14285do doVar = (C14285do) C14286dp.f43215f.createBuilder();
                C14284dn dnVar = C14284dn.PAUSE;
                doVar.copyOnWrite();
                ((C14286dp) doVar.instance).f43218b = dnVar.getNumber();
                doVar.copyOnWrite();
                ((C14286dp) doVar.instance).f43217a = 1;
                C14492lf d = C14739i.m31031d();
                doVar.copyOnWrite();
                d.getClass();
                ((C14286dp) doVar.instance).f43220d = d;
                return (C14286dp) doVar.build();
            } else if (list.contains(C14318eu.ACTION_STOP)) {
                C14285do doVar2 = (C14285do) C14286dp.f43215f.createBuilder();
                C14284dn dnVar2 = C14284dn.STOP;
                doVar2.copyOnWrite();
                ((C14286dp) doVar2.instance).f43218b = dnVar2.getNumber();
                doVar2.copyOnWrite();
                ((C14286dp) doVar2.instance).f43217a = 1;
                C14492lf h = C14739i.m31035h();
                doVar2.copyOnWrite();
                h.getClass();
                ((C14286dp) doVar2.instance).f43220d = h;
                return (C14286dp) doVar2.build();
            }
        } else if ((i == 4 || i == 6) && list.contains(C14318eu.ACTION_PLAY)) {
            C14285do doVar3 = (C14285do) C14286dp.f43215f.createBuilder();
            C14284dn dnVar3 = C14284dn.PLAY;
            doVar3.copyOnWrite();
            ((C14286dp) doVar3.instance).f43218b = dnVar3.getNumber();
            doVar3.copyOnWrite();
            ((C14286dp) doVar3.instance).f43217a = 1;
            C14492lf e = C14739i.m31032e();
            doVar3.copyOnWrite();
            e.getClass();
            ((C14286dp) doVar3.instance).f43220d = e;
            return (C14286dp) doVar3.build();
        }
        C14285do doVar4 = (C14285do) C14286dp.f43215f.createBuilder();
        C14284dn dnVar4 = C14284dn.PLAY;
        doVar4.copyOnWrite();
        ((C14286dp) doVar4.instance).f43218b = dnVar4.getNumber();
        doVar4.copyOnWrite();
        ((C14286dp) doVar4.instance).f43217a = 2;
        return (C14286dp) doVar4.build();
    }
}
