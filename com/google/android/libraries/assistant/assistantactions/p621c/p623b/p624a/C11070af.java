package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11212g;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11241b;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3902c.p3907c.C50962bg;
import com.google.assistant.p3897e.p3902c.p3907c.C50965bj;
import com.google.assistant.p3897e.p3902c.p3907c.C50966bk;
import com.google.assistant.p3897e.p3902c.p3907c.C50968bm;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3902c.p3907c.C51138hu;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3917i.p3918a.C51390fy;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.assistant.p3897e.p3921j.ale;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.alg;
import com.google.assistant.p3897e.p3921j.alh;
import com.google.assistant.p3897e.p3921j.ali;
import com.google.assistant.p3897e.p3921j.alj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p001a.p002a.p003a.p004a.p005a.p006a.C0001a;
import p001a.p002a.p003a.p004a.p005a.p006a.C0002b;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.af */
/* compiled from: PG */
public final class C11070af {

    /* renamed from: a */
    public static final C59071e f36332a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.a.af");

    /* renamed from: b */
    public final Context f36333b;

    /* renamed from: c */
    public final C11078an f36334c;

    /* renamed from: d */
    public String f36335d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f36336e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private final C52479tg f36337f;

    /* renamed from: g */
    private C50969bn f36338g;

    /* renamed from: h */
    private final C11054a f36339h;

    /* renamed from: i */
    private final C11073ai f36340i;

    /* renamed from: j */
    private final C11241b f36341j;

    /* renamed from: k */
    private final C60887da f36342k;

    /* renamed from: l */
    private final String f36343l;

    /* renamed from: m */
    private final C11270g f36344m;

    /* renamed from: n */
    private String f36345n = BuildConfig.FLAVOR;

    /* renamed from: o */
    private String f36346o = BuildConfig.FLAVOR;

    /* renamed from: p */
    private boolean f36347p = false;

    /* renamed from: q */
    private boolean f36348q = false;

    /* renamed from: r */
    private final int f36349r;

    public C11070af(Context context, C50969bn bnVar, C52479tg tgVar, C11073ai aiVar, C11078an anVar, int i, C11241b bVar, C60887da daVar, C21370a aVar, C11054a aVar2, C11270g gVar) {
        this.f36333b = context;
        this.f36338g = bnVar;
        this.f36337f = tgVar;
        this.f36339h = aVar2;
        this.f36349r = i;
        this.f36341j = bVar;
        this.f36342k = daVar;
        this.f36340i = aiVar;
        this.f36334c = anVar;
        C51406gn gnVar = (C51406gn) aiVar.f36352c.mo56107c();
        if (gnVar.f133905q.isEmpty()) {
            String format = String.format(Locale.US, "fa-aum-%d", new Object[]{Long.valueOf(aVar.mo26870b())});
            C51390fy fyVar = (C51390fy) gnVar.toBuilder();
            fyVar.copyOnWrite();
            C51406gn gnVar2 = (C51406gn) fyVar.instance;
            format.getClass();
            gnVar2.f133889a |= 32768;
            gnVar2.f133905q = format;
            gnVar = (C51406gn) fyVar.build();
        }
        this.f36343l = gnVar.f133905q;
        this.f36344m = gVar;
    }

    /* renamed from: o */
    public static C51030du m26158o(C58833ax axVar, Set set) {
        C51021dl dlVar = (C51021dl) C51030du.f132868g.createBuilder();
        axVar.mo56113h();
        if (axVar.mo56113h()) {
            C51024do doVar = (C51024do) C51027dr.f132852m.createBuilder();
            String str = (String) axVar.mo56107c();
            doVar.copyOnWrite();
            C51027dr drVar = (C51027dr) doVar.instance;
            str.getClass();
            drVar.f132855b = 6;
            drVar.f132856c = str;
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            String str2 = (String) axVar.mo56107c();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            str2.getClass();
            dcVar.f132815a |= 32;
            dcVar.f132821g = str2;
            doVar.copyOnWrite();
            C51027dr drVar2 = (C51027dr) doVar.instance;
            C51012dc dcVar2 = (C51012dc) dbVar.build();
            dcVar2.getClass();
            drVar2.f132864k = dcVar2;
            drVar2.f132854a |= 128;
            doVar.copyOnWrite();
            C51027dr drVar3 = (C51027dr) doVar.instance;
            drVar3.f132854a |= 64;
            drVar3.f132863j = "default_selection_item_status";
            dlVar.mo53503d(doVar);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!axVar.mo56113h() || !str3.equals(axVar.mo56107c())) {
                C51024do doVar2 = (C51024do) C51027dr.f132852m.createBuilder();
                doVar2.copyOnWrite();
                C51027dr drVar4 = (C51027dr) doVar2.instance;
                str3.getClass();
                drVar4.f132855b = 6;
                drVar4.f132856c = str3;
                C51011db dbVar2 = (C51011db) C51012dc.f132813k.createBuilder();
                dbVar2.copyOnWrite();
                C51012dc dcVar3 = (C51012dc) dbVar2.instance;
                str3.getClass();
                dcVar3.f132815a |= 32;
                dcVar3.f132821g = str3;
                doVar2.copyOnWrite();
                C51027dr drVar5 = (C51027dr) doVar2.instance;
                C51012dc dcVar4 = (C51012dc) dbVar2.build();
                dcVar4.getClass();
                drVar5.f132864k = dcVar4;
                drVar5.f132854a |= 128;
                dlVar.mo53503d(doVar2);
            }
        }
        return (C51030du) dlVar.build();
    }

    /* renamed from: p */
    private final C58833ax m26159p() {
        C58833ax t = this.f36334c.mo19589t((String) this.f36334c.mo19588s().mo56109e(BuildConfig.FLAVOR), BuildConfig.FLAVOR);
        if (t.mo56113h()) {
            m26165v((C52623yp) t.mo56107c(), new HashSet());
            if (this.f36339h.mo19521b(11) && !this.f36347p) {
                this.f36341j.mo19661e(mo19545l(), C55998f.COMPLETED, this.f36343l);
            }
        } else if (this.f36339h.mo19521b(11) && !this.f36347p) {
            this.f36341j.mo19661e(mo19545l(), C55998f.CANCELED, this.f36343l);
        }
        return C58833ax.m90834k(mo19534a(true));
    }

    /* renamed from: q */
    private final C60870cx m26160q(C60870cx cxVar) {
        return C60846c.m92878g(cxVar, RuntimeException.class, C11132w.f36488a, this.f36342k);
    }

    /* renamed from: r */
    private final C60870cx m26161r(C52623yp ypVar) {
        C58833ax axVar;
        C51030du duVar;
        C11212g.m26598b(this.f36344m, this.f36339h, 5);
        if (((C51406gn) this.f36340i.f36352c.mo56107c()).f133902n) {
            m26165v(ypVar, new HashSet());
            return C60856cj.m92900i(C58833ax.m90834k(mo19534a(true)));
        } else if (this.f36349r != 2) {
            return mo19541h(ypVar);
        } else {
            if (this.f36340i.f36351b.mo56113h()) {
                if (this.f36334c.mo19568N()) {
                    return mo19541h(ypVar);
                }
                C58833ax axVar2 = C58836b.f156633a;
                if (!ypVar.f138169f.isEmpty()) {
                    axVar2 = C58833ax.m90833j(C11110bs.m26382o(this.f36333b));
                }
                HashSet hashSet = new HashSet();
                for (C52633yz yzVar : C11110bs.m26383p(ypVar)) {
                    if ((yzVar.f138194a & 1) != 0) {
                        hashSet.add(yzVar.f138195b);
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (axVar2.mo56113h()) {
                    arrayList.add((String) axVar2.mo56107c());
                }
                arrayList.addAll(hashSet);
                C58833ax r = this.f36334c.mo19587r();
                if (r.mo56113h()) {
                    if (!this.f36348q || arrayList.size() == 1) {
                        if (axVar2.mo56113h() && ((String) r.mo56107c()).equals(axVar2.mo56107c())) {
                            return mo19541h(ypVar);
                        }
                        if (arrayList.contains(r.mo56107c())) {
                            return mo19539f(ypVar, (String) r.mo56107c());
                        }
                    }
                    this.f36334c.mo19556B();
                    return mo19544k(ypVar, m26158o(axVar2, hashSet));
                } else if (arrayList.size() != 1) {
                    return C60922j.m93045h(m26164u((List) Collection.EL.stream(arrayList).sorted().collect(Collectors.toList())), new C11067ac(this, axVar2, ypVar, hashSet), this.f36342k);
                } else {
                    String str = (String) C58557jl.m90133n(arrayList);
                    this.f36334c.mo19564J(str);
                    if (axVar2.mo56113h()) {
                        return mo19541h(ypVar);
                    }
                    return mo19539f(ypVar, str);
                }
            } else if (!C11115f.m26412i(this.f36334c)) {
                ((C59052c) ((C59052c) f36332a.mo56225c()).mo56372aa(42955)).mo56386p("The provider type (call? message?) cannot be determined.");
                return C60856cj.m92900i(C58836b.f156633a);
            } else if (!C11115f.m26414k(this.f36339h)) {
                ((C59052c) ((C59052c) f36332a.mo56225c()).mo56372aa(42956)).mo56386p("provider disambiguation is not supported in CallFeature.");
                return C60856cj.m92900i(C58836b.f156633a);
            } else if (C11115f.m26413j(this.f36334c)) {
                Set g = C11115f.m26410g(ypVar);
                if (!ypVar.f138169f.isEmpty()) {
                    g.add("com.google.android.apps.tachyon");
                }
                if (g.size() == 1) {
                    String str2 = (String) C58557jl.m90133n(g);
                    this.f36334c.mo19564J(str2);
                    if (str2.equals("com.google.android.apps.tachyon")) {
                        return mo19541h(ypVar);
                    }
                    return mo19539f(ypVar, str2);
                }
                if (g.contains("com.google.android.apps.tachyon")) {
                    duVar = m26158o(C58833ax.m90834k("com.google.android.apps.tachyon"), g);
                } else {
                    duVar = m26158o(C58836b.f156633a, g);
                }
                return mo19544k(ypVar, duVar);
            } else {
                C58833ax r2 = this.f36334c.mo19587r();
                if (!r2.mo56113h() || ((String) r2.mo56107c()).equals("com.google.android.dialer")) {
                    if (ypVar.f138169f.isEmpty()) {
                        axVar = C58836b.f156633a;
                    } else {
                        axVar = C11115f.m26407d(this.f36333b, r2);
                    }
                    Set f = C11115f.m26409f(ypVar);
                    ArrayList arrayList2 = new ArrayList();
                    if (axVar.mo56113h()) {
                        arrayList2.add((String) axVar.mo56107c());
                    }
                    arrayList2.addAll(f);
                    if (arrayList2.size() != 1) {
                        return C60922j.m93045h(m26164u(arrayList2), new C11130u(this, axVar, ypVar, f), this.f36342k);
                    }
                    String str3 = (String) C58557jl.m90133n(arrayList2);
                    if (axVar.mo56113h()) {
                        return mo19541h(ypVar);
                    }
                    this.f36334c.mo19564J(str3);
                    if (str3.equals("com.google.android.apps.tachyon")) {
                        return mo19541h(ypVar);
                    }
                    return mo19539f(ypVar, str3);
                }
                this.f36334c.mo19564J((String) r2.mo56107c());
                if (((String) r2.mo56107c()).equals("com.google.android.apps.tachyon")) {
                    return mo19541h(ypVar);
                }
                return mo19539f(ypVar, (String) r2.mo56107c());
            }
        }
    }

    /* renamed from: s */
    private final C60870cx m26162s(Set set) {
        if (!this.f36339h.mo19521b(11) || this.f36347p) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return m26160q(C60922j.m93044g(this.f36341j.mo19658b(this.f36345n, mo19545l(), this.f36346o, this.f36335d, this.f36336e, (List) Collection.EL.stream(set).sorted().collect(Collectors.toList()), this.f36343l), C11134y.f36494a, this.f36342k));
    }

    /* renamed from: t */
    private final C60870cx m26163t(List list) {
        if (!this.f36339h.mo19521b(11) || this.f36347p) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return m26160q(C60922j.m93044g(this.f36341j.mo19659c(this.f36345n, mo19545l(), this.f36346o, this.f36335d, (List) Collection.EL.stream(list).sorted().collect(Collectors.toList()), this.f36343l), new C11068ad(this), this.f36342k));
    }

    /* renamed from: u */
    private final C60870cx m26164u(List list) {
        if (!this.f36339h.mo19521b(11) || this.f36347p) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return m26160q(C60922j.m93044g(this.f36341j.mo19660d(this.f36345n, mo19545l(), this.f36346o, list, this.f36343l), new C11069ae(this), this.f36342k));
    }

    /* renamed from: v */
    private final void m26165v(C52623yp ypVar, Set set) {
        C51021dl dlVar = (C51021dl) C51030du.f132868g.createBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C51024do doVar = (C51024do) C51027dr.f132852m.createBuilder();
            doVar.copyOnWrite();
            C51027dr drVar = (C51027dr) doVar.instance;
            str.getClass();
            drVar.f132855b = 2;
            drVar.f132856c = str;
            dlVar.mo53503d(doVar);
        }
        mo19547n(ypVar, (C51030du) dlVar.build(), 5);
    }

    /* renamed from: a */
    public final C11072ah mo19534a(boolean z) {
        C50969bn bnVar;
        C51406gn gnVar;
        C52091ex exVar;
        C11064a aVar = new C11064a();
        aVar.mo19531b(C50969bn.f132678i);
        aVar.mo19530a(C51406gn.f133887s);
        aVar.mo19533d(C52091ex.f136710b);
        aVar.mo19532c(false);
        aVar.mo19531b(this.f36338g);
        aVar.mo19530a((C51406gn) this.f36340i.f36352c.mo56107c());
        aVar.mo19533d(this.f36340i.mo19552a());
        aVar.mo19532c(z);
        if (aVar.f36317e == 1 && (bnVar = aVar.f36313a) != null && (gnVar = aVar.f36314b) != null && (exVar = aVar.f36316d) != null) {
            return new C11091b(bnVar, gnVar, aVar.f36315c, exVar);
        }
        StringBuilder sb = new StringBuilder();
        if (aVar.f36313a == null) {
            sb.append(" contactSelection");
        }
        if (aVar.f36314b == null) {
            sb.append(" communicationFluidActionsData");
        }
        if (aVar.f36317e == 0) {
            sb.append(" contactSelectionDone");
        }
        if (aVar.f36316d == null) {
            sb.append(" conversationParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58833ax mo19535b(String str, String str2) {
        this.f36334c.mo19567M(str, str2);
        return m26159p();
    }

    /* renamed from: c */
    public final C58833ax mo19536c(String str) {
        this.f36334c.mo19560F(str);
        return m26159p();
    }

    /* renamed from: d */
    public final C58833ax mo19537d(String str) {
        String str2;
        mo19546m(C51401gi.PERSON_CONTACT_SELECTION);
        if (this.f36349r == 3) {
            str2 = this.f36333b.getResources().getString(R.string.assistantactions_contact_selection_no_email, new Object[]{str});
        } else {
            str2 = this.f36333b.getResources().getString(R.string.assistantactions_contact_selection_no_phone_number, new Object[]{str});
        }
        C50966bk bkVar = (C50966bk) this.f36338g.toBuilder();
        C50962bg bgVar = (C50962bg) C50965bj.f132670e.createBuilder();
        bgVar.copyOnWrite();
        C50965bj bjVar = (C50965bj) bgVar.instance;
        bjVar.f132675d = 2;
        bjVar.f132672a |= 1;
        ale ale = (ale) alf.f135314d.createBuilder();
        ale.copyOnWrite();
        alf alf = (alf) ale.instance;
        str2.getClass();
        alf.f135316a |= 1;
        alf.f135317b = str2;
        alg alg = (alg) alh.f135319e.createBuilder();
        ali ali = (ali) alj.f135325f.createBuilder();
        C0001a aVar = (C0001a) C0002b.f0f.createBuilder();
        aVar.copyOnWrite();
        C0002b bVar = (C0002b) aVar.instance;
        bVar.f2a = 1 | bVar.f2a;
        bVar.f3b = 1.0f;
        ali.copyOnWrite();
        alj alj = (alj) ali.instance;
        C0002b bVar2 = (C0002b) aVar.build();
        bVar2.getClass();
        alj.f135329c = bVar2;
        alj.f135327a |= 2;
        alg.copyOnWrite();
        alh alh = (alh) alg.instance;
        alj alj2 = (alj) ali.build();
        alj2.getClass();
        alh.f135324d = alj2;
        alh.f135321a |= 4;
        ale.mo53695a(alg);
        bgVar.copyOnWrite();
        C50965bj bjVar2 = (C50965bj) bgVar.instance;
        alf alf2 = (alf) ale.build();
        alf2.getClass();
        bjVar2.f132674c = alf2;
        bjVar2.f132673b = 2;
        bkVar.copyOnWrite();
        C50969bn bnVar = (C50969bn) bkVar.instance;
        C50965bj bjVar3 = (C50965bj) bgVar.build();
        bjVar3.getClass();
        bnVar.f132682c = bjVar3;
        bnVar.f132680a |= 2;
        this.f36338g = (C50969bn) bkVar.build();
        return C58833ax.m90834k(mo19534a(false));
    }

    /* renamed from: e */
    public final C58833ax mo19538e(String str) {
        this.f36334c.mo19562H(str);
        return m26159p();
    }

    /* renamed from: f */
    public final C60870cx mo19539f(C52623yp ypVar, String str) {
        C58833ax axVar = C58836b.f156633a;
        if (C11115f.m26412i(this.f36334c)) {
            if (C11115f.m26413j(this.f36334c)) {
                axVar = C11115f.m26406c(ypVar, str);
            } else {
                axVar = C11115f.m26405b(ypVar, str);
            }
            if (axVar.mo56113h()) {
                this.f36334c.mo19563I((String) axVar.mo56107c());
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        List<C52633yz> p = C11110bs.m26383p(ypVar);
        C51021dl dlVar = (C51021dl) C51030du.f132868g.createBuilder();
        for (C52633yz yzVar : p) {
            C52613yf yfVar = yzVar.f138197d;
            if (yfVar == null) {
                yfVar = C52613yf.f138138f;
            }
            if (!hashSet.contains(yfVar.f138141b) && (yzVar.f138194a & 1) != 0 && yzVar.f138195b.equals(str)) {
                if (axVar.mo56113h()) {
                    String str2 = (String) axVar.mo56107c();
                    C52613yf yfVar2 = yzVar.f138197d;
                    if (yfVar2 == null) {
                        yfVar2 = C52613yf.f138138f;
                    }
                    if (!str2.equals(yfVar2.f138143d)) {
                    }
                }
                C52613yf yfVar3 = yzVar.f138197d;
                if (yfVar3 == null) {
                    yfVar3 = C52613yf.f138138f;
                }
                hashSet.add(yfVar3.f138141b);
                C52613yf yfVar4 = yzVar.f138197d;
                String str3 = (yfVar4 == null ? C52613yf.f138138f : yfVar4).f138141b;
                if (yfVar4 == null) {
                    yfVar4 = C52613yf.f138138f;
                }
                hashMap.put(str3, yfVar4.f138144e);
                C51024do doVar = (C51024do) C51027dr.f132852m.createBuilder();
                C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
                dbVar.copyOnWrite();
                C51012dc dcVar = (C51012dc) dbVar.instance;
                str.getClass();
                dcVar.f132815a |= 32;
                dcVar.f132821g = str;
                doVar.copyOnWrite();
                C51027dr drVar = (C51027dr) doVar.instance;
                C51012dc dcVar2 = (C51012dc) dbVar.build();
                dcVar2.getClass();
                drVar.f132864k = dcVar2;
                drVar.f132854a |= 128;
                C52613yf yfVar5 = yzVar.f138197d;
                if (yfVar5 == null) {
                    yfVar5 = C52613yf.f138138f;
                }
                String str4 = yfVar5.f138144e;
                doVar.copyOnWrite();
                C51027dr drVar2 = (C51027dr) doVar.instance;
                str4.getClass();
                drVar2.f132855b = 2;
                drVar2.f132856c = str4;
                dlVar.mo53503d(doVar);
            }
        }
        return C60922j.m93044g(m26162s(hashSet), new C11133x(this, hashMap, ypVar, hashSet, dlVar), this.f36342k);
    }

    /* renamed from: g */
    public final C60870cx mo19540g(C52623yp ypVar, String str) {
        HashSet hashSet = new HashSet();
        for (C52619yl ylVar : ypVar.f138168e) {
            if (C58890d.m90990e(ylVar.f138153c, str)) {
                hashSet.add(ylVar.f138152b);
            }
        }
        if (!hashSet.isEmpty()) {
            return C60922j.m93044g(m26162s(hashSet), new C11065aa(this, ypVar, str, hashSet), this.f36342k);
        }
        ((C59052c) ((C59052c) f36332a.mo56225c()).mo56372aa(42947)).mo56386p("performEmailDisambiguation, no emails for selected label");
        return C60856cj.m92900i(mo19537d((String) this.f36334c.mo19588s().mo56109e(BuildConfig.FLAVOR)));
    }

    /* renamed from: i */
    public final C60870cx mo19542i(C52623yp ypVar, String str) {
        HashSet hashSet = new HashSet();
        for (C52629yv yvVar : ypVar.f138169f) {
            if (C58890d.m90990e(yvVar.f138185d, str)) {
                if (!yvVar.f138186e.isEmpty()) {
                    hashSet.add(yvVar.f138186e);
                } else {
                    hashSet.add(yvVar.f138184c);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            return C60922j.m93044g(m26162s(hashSet), new C11135z(this, ypVar, str, hashSet), this.f36342k);
        }
        ((C59052c) ((C59052c) f36332a.mo56225c()).mo56372aa(42951)).mo56386p("performNumberDisambiguation, no numbers for selected label");
        return C60856cj.m92900i(mo19537d((String) this.f36334c.mo19588s().mo56109e(BuildConfig.FLAVOR)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo19543j() {
        /*
            r9 = this;
            com.google.assistant.e.j.tg r0 = r9.f36337f
            com.google.assistant.e.j.tv r0 = r0.f137761c
            if (r0 != 0) goto L_0x0008
            com.google.assistant.e.j.tv r0 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
        L_0x0008:
            int r0 = r0.f137811a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x02ce
            com.google.assistant.e.j.tg r0 = r9.f36337f
            com.google.assistant.e.j.tv r0 = r0.f137761c
            if (r0 != 0) goto L_0x0016
            com.google.assistant.e.j.tv r0 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
        L_0x0016:
            long r2 = r0.f137812b
            int r0 = (int) r2
            com.google.assistant.e.c.c.bn r2 = r9.f36338g
            com.google.assistant.e.c.c.du r2 = r2.f132683d
            if (r2 != 0) goto L_0x0021
            com.google.assistant.e.c.c.du r2 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0021:
            com.google.protobuf.cq r2 = r2.f132875f
            int r3 = r2.size()
            if (r3 > r0) goto L_0x003e
            com.google.common.f.e r0 = f36332a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "progressContactSelection, invalid tapped index"
            r2 = 42960(0xa7d0, float:6.02E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x003e:
            java.lang.Object r0 = r2.get(r0)
            com.google.assistant.e.c.c.dr r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r0
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            com.google.common.base.ax r2 = r2.mo19594y()
            java.lang.String r3 = ""
            java.lang.Object r2 = r2.mo56109e(r3)
            java.lang.String r2 = (java.lang.String) r2
            r9.f36345n = r2
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            com.google.common.base.ax r2 = r2.mo19588s()
            java.lang.Object r2 = r2.mo56109e(r3)
            java.lang.String r2 = (java.lang.String) r2
            r9.f36346o = r2
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            com.google.common.base.ax r2 = r2.mo19587r()
            java.lang.Object r2 = r2.mo56109e(r3)
            java.lang.String r2 = (java.lang.String) r2
            r9.f36335d = r2
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            com.google.common.base.ax r2 = r2.mo19580k()
            java.lang.Object r2 = r2.mo56109e(r3)
            java.lang.String r2 = (java.lang.String) r2
            r9.f36336e = r2
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
            com.google.android.libraries.assistant.assistantactions.c.b.a.ai r2 = r9.f36340i
            com.google.common.base.ax r2 = r2.f36352c
            java.lang.Object r2 = r2.mo56107c()
            com.google.assistant.e.i.a.gn r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r2
            int r2 = r2.f133894f
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r2)
            if (r2 != 0) goto L_0x0094
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0094:
            int r2 = r2.ordinal()
            r4 = 2
            if (r2 == r1) goto L_0x0237
            if (r2 == r4) goto L_0x0237
            r5 = 3
            r6 = 6
            if (r2 == r5) goto L_0x01ac
            r7 = 5
            r8 = 12
            if (r2 == r7) goto L_0x014d
            if (r2 == r6) goto L_0x00af
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x00af:
            com.google.android.libraries.assistant.assistantactions.d.g r2 = r9.f36344m
            com.google.android.libraries.assistant.assistantactions.b.a r5 = r9.f36339h
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11212g.m26598b(r2, r5, r8)
            int r2 = r0.f132855b
            if (r2 != r4) goto L_0x00bf
            java.lang.Object r2 = r0.f132856c
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00c0
        L_0x00bf:
            r2 = r3
        L_0x00c0:
            int r5 = r9.f36349r
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x014b
            if (r6 == 0) goto L_0x0142
            if (r6 == r1) goto L_0x00d6
            if (r6 == r4) goto L_0x00d0
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0146
        L_0x00d0:
            com.google.common.base.ax r0 = r9.mo19536c(r2)
            goto L_0x0146
        L_0x00d6:
            com.google.assistant.e.c.c.dc r0 = r0.f132864k
            if (r0 != 0) goto L_0x00dc
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00dc:
            int r0 = r0.f132815a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x013d
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r0 = r9.f36334c
            com.google.common.base.ax r0 = r0.mo19588s()
            java.lang.Object r0 = r0.mo56109e(r3)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            com.google.common.base.ax r0 = r1.mo19589t(r0, r3)
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x00fd
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0146
        L_0x00fd:
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            java.util.List r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26383p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x010b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x013a
            java.lang.Object r1 = r0.next()
            com.google.assistant.e.j.yz r1 = (com.google.assistant.p3897e.p3921j.C52633yz) r1
            com.google.assistant.e.j.yf r3 = r1.f138197d
            if (r3 != 0) goto L_0x011d
            com.google.assistant.e.j.yf r3 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x011d:
            java.lang.String r3 = r3.f138144e
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x010b
            com.google.assistant.e.j.yf r0 = r1.f138197d
            if (r0 != 0) goto L_0x012c
            com.google.assistant.e.j.yf r1 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
            goto L_0x012d
        L_0x012c:
            r1 = r0
        L_0x012d:
            java.lang.String r1 = r1.f138141b
            if (r0 != 0) goto L_0x0133
            com.google.assistant.e.j.yf r0 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x0133:
            java.lang.String r0 = r0.f138144e
            com.google.common.base.ax r0 = r9.mo19535b(r1, r0)
            goto L_0x0146
        L_0x013a:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0146
        L_0x013d:
            com.google.common.base.ax r0 = r9.mo19538e(r2)
            goto L_0x0146
        L_0x0142:
            com.google.common.base.ax r0 = r9.mo19538e(r2)
        L_0x0146:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x014b:
            r0 = 0
            throw r0
        L_0x014d:
            com.google.android.libraries.assistant.assistantactions.d.g r1 = r9.f36344m
            com.google.android.libraries.assistant.assistantactions.b.a r2 = r9.f36339h
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11212g.m26598b(r1, r2, r8)
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            com.google.common.base.ax r1 = r1.mo19588s()
            java.lang.Object r1 = r1.mo56109e(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.f132855b
            if (r2 != r4) goto L_0x0169
            java.lang.Object r0 = r0.f132856c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x016a
        L_0x0169:
            r0 = r3
        L_0x016a:
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            com.google.common.base.ax r2 = r2.mo19589t(r1, r3)
            boolean r3 = r2.mo56113h()
            if (r3 != 0) goto L_0x018d
            com.google.common.f.e r0 = f36332a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "progressLabelSelection, contact information for selected person absent"
            r3 = 42962(0xa7d2, float:6.0203E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.ax r0 = r9.mo19537d(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x01ab
        L_0x018d:
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            r1.mo19561G(r0)
            int r1 = r9.f36349r
            if (r1 != r5) goto L_0x01a1
            java.lang.Object r1 = r2.mo56107c()
            com.google.assistant.e.j.yp r1 = (com.google.assistant.p3897e.p3921j.C52623yp) r1
            com.google.common.util.concurrent.cx r0 = r9.mo19540g(r1, r0)
            goto L_0x01ab
        L_0x01a1:
            java.lang.Object r1 = r2.mo56107c()
            com.google.assistant.e.j.yp r1 = (com.google.assistant.p3897e.p3921j.C52623yp) r1
            com.google.common.util.concurrent.cx r0 = r9.mo19542i(r1, r0)
        L_0x01ab:
            return r0
        L_0x01ac:
            com.google.android.libraries.assistant.assistantactions.d.g r1 = r9.f36344m
            com.google.android.libraries.assistant.assistantactions.b.a r2 = r9.f36339h
            r5 = 14
            com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11212g.m26598b(r1, r2, r5)
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            com.google.common.base.ax r1 = r1.mo19588s()
            java.lang.Object r1 = r1.mo56109e(r3)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            com.google.common.base.ax r2 = r2.mo19589t(r1, r3)
            boolean r5 = r2.mo56113h()
            if (r5 != 0) goto L_0x01e4
            com.google.common.f.e r0 = f36332a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "progressProviderSelection, contact information for selected person absent"
            r3 = 42966(0xa7d6, float:6.0208E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.ax r0 = r9.mo19537d(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0236
        L_0x01e4:
            int r1 = r0.f132855b
            if (r1 != r6) goto L_0x01ed
            java.lang.Object r1 = r0.f132856c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01ee
        L_0x01ed:
            r1 = r3
        L_0x01ee:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0202
            int r1 = r0.f132855b
            if (r1 != r6) goto L_0x01fd
            java.lang.Object r1 = r0.f132856c
            java.lang.String r1 = (java.lang.String) r1
            r3 = r1
        L_0x01fd:
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            r1.mo19564J(r3)
        L_0x0202:
            java.lang.String r1 = r0.f132863j
            java.lang.String r5 = "default_selection_item_status"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x022c
            int r0 = r0.f132855b
            if (r0 != r4) goto L_0x0211
            goto L_0x022c
        L_0x0211:
            java.lang.String r0 = "com.google.android.apps.tachyon"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = "com.google.android.dialer"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x022c
            java.lang.Object r0 = r2.mo56107c()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            com.google.common.util.concurrent.cx r0 = r9.mo19539f(r0, r3)
            goto L_0x0236
        L_0x022c:
            java.lang.Object r0 = r2.mo56107c()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            com.google.common.util.concurrent.cx r0 = r9.mo19541h(r0)
        L_0x0236:
            return r0
        L_0x0237:
            int r2 = r0.f132855b
            if (r2 != r4) goto L_0x0240
            java.lang.Object r2 = r0.f132856c
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x0240:
            java.lang.String r0 = r0.f132861h
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            com.google.common.base.ax r2 = r2.mo19589t(r3, r0)
            com.google.android.libraries.assistant.assistantactions.b.a r4 = r9.f36339h
            r5 = 26
            boolean r4 = r4.mo19521b(r5)
            if (r4 == 0) goto L_0x02ab
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x02ab
            r9.f36347p = r1
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r4 = r9.f36334c
            com.google.common.base.ax r0 = r4.mo19590u(r3, r0)
            boolean r4 = r2.mo56113h()
            if (r4 == 0) goto L_0x02ab
            boolean r4 = r0.mo56113h()
            if (r4 == 0) goto L_0x02ab
            com.google.assistant.e.j.ade r4 = com.google.assistant.p3897e.p3921j.ade.f134877h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.add r4 = (com.google.assistant.p3897e.p3921j.add) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ade r5 = (com.google.assistant.p3897e.p3921j.ade) r5
            r3.getClass()
            int r6 = r5.f134879a
            r6 = r6 | 8
            r5.f134879a = r6
            r5.f134883e = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ade r5 = (com.google.assistant.p3897e.p3921j.ade) r5
            r3.getClass()
            int r6 = r5.f134879a
            r1 = r1 | r6
            r5.f134879a = r1
            r5.f134880b = r3
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.adm r0 = (com.google.assistant.p3897e.p3921j.adm) r0
            r4.mo53673a(r0)
            com.google.protobuf.bv r0 = r4.build()
            com.google.assistant.e.j.ade r0 = (com.google.assistant.p3897e.p3921j.ade) r0
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            r1.mo19565K(r0)
        L_0x02ab:
            boolean r0 = r2.mo56113h()
            if (r0 != 0) goto L_0x02ba
            com.google.common.base.ax r0 = r9.mo19537d(r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x02cd
        L_0x02ba:
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r0 = r9.f36334c
            r0.mo19566L(r3)
            r9.f36345n = r3
            r9.f36346o = r3
            java.lang.Object r0 = r2.mo56107c()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            com.google.common.util.concurrent.cx r0 = r9.m26161r(r0)
        L_0x02cd:
            return r0
        L_0x02ce:
            com.google.assistant.e.j.tg r0 = r9.f36337f
            int r2 = r0.f137759a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0385
            com.google.assistant.e.j.adm r0 = r0.f137760b
            if (r0 != 0) goto L_0x02db
            com.google.assistant.e.j.adm r0 = com.google.assistant.p3897e.p3921j.adm.f134889h
        L_0x02db:
            com.google.assistant.e.j.yp r2 = r0.f134892b
            if (r2 != 0) goto L_0x02e1
            com.google.assistant.e.j.yp r2 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x02e1:
            com.google.protobuf.cq r2 = r2.f138166c
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x02fe
            com.google.common.f.e r0 = f36332a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "progressContactSelection, no name for selected person"
            r2 = 42958(0xa7ce, float:6.0197E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x02fe:
            r3 = 0
            java.lang.Object r4 = r2.get(r3)
            com.google.assistant.e.j.yn r4 = (com.google.assistant.p3897e.p3921j.C52621yn) r4
            java.lang.String r4 = r4.f138158c
            r9.f36345n = r4
            java.lang.Object r4 = r2.get(r3)
            com.google.assistant.e.j.yn r4 = (com.google.assistant.p3897e.p3921j.C52621yn) r4
            java.lang.String r4 = r4.f138158c
            r9.f36346o = r4
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r4 = r9.f36334c
            java.lang.Object r5 = r2.get(r3)
            com.google.assistant.e.j.yn r5 = (com.google.assistant.p3897e.p3921j.C52621yn) r5
            java.lang.String r5 = r5.f138158c
            r4.mo19566L(r5)
            com.google.assistant.e.j.ade r4 = com.google.assistant.p3897e.p3921j.ade.f134877h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.add r4 = (com.google.assistant.p3897e.p3921j.add) r4
            java.lang.Object r5 = r2.get(r3)
            com.google.assistant.e.j.yn r5 = (com.google.assistant.p3897e.p3921j.C52621yn) r5
            java.lang.String r5 = r5.f138158c
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.e.j.ade r6 = (com.google.assistant.p3897e.p3921j.ade) r6
            r5.getClass()
            int r7 = r6.f134879a
            r7 = r7 | 8
            r6.f134879a = r7
            r6.f134883e = r5
            java.lang.Object r2 = r2.get(r3)
            com.google.assistant.e.j.yn r2 = (com.google.assistant.p3897e.p3921j.C52621yn) r2
            java.lang.String r2 = r2.f138158c
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.e.j.ade r3 = (com.google.assistant.p3897e.p3921j.ade) r3
            r2.getClass()
            int r5 = r3.f134879a
            r1 = r1 | r5
            r3.f134879a = r1
            r3.f134880b = r2
            r4.mo53673a(r0)
            com.google.protobuf.bv r1 = r4.build()
            com.google.assistant.e.j.ade r1 = (com.google.assistant.p3897e.p3921j.ade) r1
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r2 = r9.f36334c
            r2.mo19565K(r1)
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            com.google.common.base.ax r1 = r1.mo19574e()
            boolean r1 = r1.mo56113h()
            r9.f36348q = r1
            com.google.android.libraries.assistant.assistantactions.c.b.a.an r1 = r9.f36334c
            r1.mo19555A()
            com.google.assistant.e.j.yp r0 = r0.f134892b
            if (r0 != 0) goto L_0x0380
            com.google.assistant.e.j.yp r0 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x0380:
            com.google.common.util.concurrent.cx r0 = r9.m26161r(r0)
            return r0
        L_0x0385:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11070af.mo19543j():com.google.common.util.concurrent.cx");
    }

    /* renamed from: k */
    public final C60870cx mo19544k(C52623yp ypVar, C51030du duVar) {
        if (duVar.f132875f.size() == 0) {
            return C60856cj.m92900i(mo19537d((String) this.f36334c.mo19588s().mo56109e(BuildConfig.FLAVOR)));
        }
        mo19547n(ypVar, duVar, 8);
        mo19546m(C51401gi.PROVIDER_SELECTION);
        return C60856cj.m92900i(C58833ax.m90834k(mo19534a(false)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C55421x mo19545l() {
        C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int a = C50968bm.m85997a(this.f36338g.f132687h);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return C55421x.PHONE_CALL_CONTACT;
        }
        if (i == 2 || i == 3 || i == 4) {
            return C55421x.GENERIC_SEND_MESSAGE;
        }
        if (i == 5) {
            return C55421x.VIDEO_CALL;
        }
        ((C59052c) ((C59052c) f36332a.mo56225c()).mo56372aa(42969)).mo56386p("unexpected providerTypeFilter type: DEFAULT");
        if (this.f36340i.f36351b.mo56113h()) {
            return C55421x.GENERIC_SEND_MESSAGE;
        }
        if (C11115f.m26413j(this.f36334c)) {
            return C55421x.VIDEO_CALL;
        }
        return C55421x.PHONE_CALL_CONTACT;
    }

    /* renamed from: m */
    public final void mo19546m(C51401gi giVar) {
        C58833ax axVar = this.f36340i.f36352c;
        if (axVar.mo56113h()) {
            C51406gn a = C11118i.m26416a(giVar, (C51406gn) axVar.mo56107c());
            this.f36340i.f36352c = C58833ax.m90834k(a);
        }
    }

    /* renamed from: n */
    public final void mo19547n(C52623yp ypVar, C51030du duVar, int i) {
        C58833ax axVar;
        C58833ax axVar2 = C58836b.f156633a;
        if (ypVar.f138166c.size() <= 0 || (((C52621yn) ypVar.f138166c.get(0)).f138156a & 2) == 0) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(((C52621yn) ypVar.f138166c.get(0)).f138158c);
        }
        C58833ax f = C11118i.m26421f(ypVar);
        if (axVar.mo56113h()) {
            C51138hu huVar = (C51138hu) C51141hx.f133119h.createBuilder();
            String str = (String) axVar.mo56107c();
            huVar.copyOnWrite();
            C51141hx hxVar = (C51141hx) huVar.instance;
            str.getClass();
            hxVar.f133122b = 1;
            hxVar.f133123c = str;
            if (f.mo56113h()) {
                C51012dc dcVar = (C51012dc) f.mo56107c();
                huVar.copyOnWrite();
                C51141hx hxVar2 = (C51141hx) huVar.instance;
                dcVar.getClass();
                hxVar2.f133126f = dcVar;
                hxVar2.f133121a |= 16;
            }
            C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
            int i2 = this.f36349r;
            int i3 = i2 - 1;
            if (i2 != 0) {
                String str2 = BuildConfig.FLAVOR;
                if (i3 == 0) {
                    str2 = (String) this.f36334c.mo19582m().mo56109e(str2);
                } else if (i3 == 1) {
                    str2 = (String) this.f36334c.mo19591v().mo56105a(this.f36334c.mo19582m()).mo56109e(str2);
                } else if (i3 == 2) {
                    str2 = (String) this.f36334c.mo19578i().mo56109e(str2);
                }
                if (!str2.isEmpty()) {
                    huVar.copyOnWrite();
                    C51141hx hxVar3 = (C51141hx) huVar.instance;
                    str2.getClass();
                    hxVar3.f133121a |= 4;
                    hxVar3.f133124d = str2;
                }
                axVar2 = C58833ax.m90834k((C51141hx) huVar.build());
            } else {
                throw null;
            }
        }
        C50969bn bnVar = this.f36338g;
        C50962bg bgVar = (C50962bg) C50965bj.f132670e.createBuilder();
        bgVar.copyOnWrite();
        C50965bj bjVar = (C50965bj) bgVar.instance;
        bjVar.f132675d = i - 1;
        bjVar.f132672a |= 1;
        if (axVar2.mo56113h()) {
            C51141hx hxVar4 = (C51141hx) axVar2.mo56107c();
            bgVar.copyOnWrite();
            C50965bj bjVar2 = (C50965bj) bgVar.instance;
            hxVar4.getClass();
            bjVar2.f132674c = hxVar4;
            bjVar2.f132673b = 3;
        }
        C50966bk bkVar = (C50966bk) bnVar.toBuilder();
        bkVar.copyOnWrite();
        C50969bn bnVar2 = (C50969bn) bkVar.instance;
        duVar.getClass();
        bnVar2.f132683d = duVar;
        bnVar2.f132680a |= 4;
        bkVar.copyOnWrite();
        C50969bn bnVar3 = (C50969bn) bkVar.instance;
        C50965bj bjVar3 = (C50965bj) bgVar.build();
        bjVar3.getClass();
        bnVar3.f132682c = bjVar3;
        bnVar3.f132680a |= 2;
        this.f36338g = (C50969bn) bkVar.build();
    }

    /* renamed from: h */
    public final C60870cx mo19541h(C52623yp ypVar) {
        if (this.f36349r == 3) {
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            for (C52619yl ylVar : ypVar.f138168e) {
                hashSet.add(ylVar.f138153c);
            }
            for (C52619yl ylVar2 : ypVar.f138168e) {
                String str = ylVar2.f138153c;
                if (hashMap.containsKey(str)) {
                    ((List) hashMap.get(str)).add(ylVar2.f138152b);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ylVar2.f138152b);
                    hashMap.put(str, arrayList);
                }
            }
            if (hashSet.isEmpty()) {
                return C60856cj.m92900i(mo19537d((String) this.f36334c.mo19588s().mo56109e(BuildConfig.FLAVOR)));
            }
            return C60922j.m93045h(m26163t(new ArrayList(hashSet)), new C11066ab(this, ypVar, hashMap, hashSet), this.f36342k);
        }
        HashMap hashMap2 = new HashMap();
        HashSet hashSet2 = new HashSet();
        for (C52629yv yvVar : ypVar.f138169f) {
            hashSet2.add(yvVar.f138185d);
        }
        for (C52629yv yvVar2 : ypVar.f138169f) {
            String str2 = yvVar2.f138185d;
            if (hashMap2.containsKey(str2)) {
                ((List) hashMap2.get(str2)).add(yvVar2.f138184c);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(yvVar2.f138184c);
                hashMap2.put(str2, arrayList2);
            }
        }
        if (hashSet2.isEmpty()) {
            return C60856cj.m92900i(mo19537d((String) this.f36334c.mo19588s().mo56109e(BuildConfig.FLAVOR)));
        }
        return C60922j.m93045h(m26163t(new ArrayList(hashSet2)), new C11131v(this, ypVar, hashMap2, hashSet2), this.f36342k);
    }
}
