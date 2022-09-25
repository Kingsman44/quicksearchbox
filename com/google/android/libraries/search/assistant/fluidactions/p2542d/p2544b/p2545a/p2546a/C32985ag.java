package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
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
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ag */
/* compiled from: PG */
public final class C32985ag {

    /* renamed from: a */
    public static final C59071e f88370a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ag");

    /* renamed from: b */
    public final Context f88371b;

    /* renamed from: c */
    public final C32993ao f88372c;

    /* renamed from: d */
    public String f88373d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f88374e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private final C52479tg f88375f;

    /* renamed from: g */
    private C50969bn f88376g;

    /* renamed from: h */
    private final C32951d f88377h;

    /* renamed from: i */
    private final C32988aj f88378i;

    /* renamed from: j */
    private final C60887da f88379j;

    /* renamed from: k */
    private boolean f88380k = false;

    /* renamed from: l */
    private boolean f88381l = false;

    /* renamed from: m */
    private final int f88382m;

    public C32985ag(Context context, C50969bn bnVar, C52479tg tgVar, C32988aj ajVar, C32993ao aoVar, int i, C60887da daVar, C21370a aVar, C32951d dVar) {
        this.f88371b = context;
        this.f88376g = bnVar;
        this.f88375f = tgVar;
        this.f88377h = dVar;
        this.f88382m = i;
        this.f88379j = daVar;
        this.f88378i = ajVar;
        this.f88372c = aoVar;
        C51406gn gnVar = (C51406gn) ajVar.f88385c.get();
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
        String str = gnVar.f133905q;
    }

    /* renamed from: b */
    public static C51030du m61065b(Optional optional, Optional optional2, Set set) {
        C51021dl dlVar = (C51021dl) C51030du.f132868g.createBuilder();
        if (optional.isPresent() && optional2.isPresent()) {
            C51024do doVar = (C51024do) C51027dr.f132852m.createBuilder();
            String str = (String) optional.get();
            doVar.copyOnWrite();
            C51027dr drVar = (C51027dr) doVar.instance;
            str.getClass();
            drVar.f132855b = 2;
            drVar.f132856c = str;
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            String str2 = (String) optional2.get();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            str2.getClass();
            dcVar.f132815a = 2 | dcVar.f132815a;
            dcVar.f132817c = str2;
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
        } else if (optional.isPresent()) {
            C51024do doVar2 = (C51024do) C51027dr.f132852m.createBuilder();
            String str3 = (String) optional.get();
            doVar2.copyOnWrite();
            C51027dr drVar4 = (C51027dr) doVar2.instance;
            str3.getClass();
            drVar4.f132855b = 6;
            drVar4.f132856c = str3;
            C51011db dbVar2 = (C51011db) C51012dc.f132813k.createBuilder();
            String str4 = (String) optional.get();
            dbVar2.copyOnWrite();
            C51012dc dcVar3 = (C51012dc) dbVar2.instance;
            str4.getClass();
            dcVar3.f132815a |= 32;
            dcVar3.f132821g = str4;
            doVar2.copyOnWrite();
            C51027dr drVar5 = (C51027dr) doVar2.instance;
            C51012dc dcVar4 = (C51012dc) dbVar2.build();
            dcVar4.getClass();
            drVar5.f132864k = dcVar4;
            drVar5.f132854a |= 128;
            doVar2.copyOnWrite();
            C51027dr drVar6 = (C51027dr) doVar2.instance;
            drVar6.f132854a |= 64;
            drVar6.f132863j = "default_selection_item_status";
            dlVar.mo53503d(doVar2);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (!optional.isPresent() || !str5.equals(optional.get())) {
                C51024do doVar3 = (C51024do) C51027dr.f132852m.createBuilder();
                doVar3.copyOnWrite();
                C51027dr drVar7 = (C51027dr) doVar3.instance;
                str5.getClass();
                drVar7.f132855b = 6;
                drVar7.f132856c = str5;
                C51011db dbVar3 = (C51011db) C51012dc.f132813k.createBuilder();
                dbVar3.copyOnWrite();
                C51012dc dcVar5 = (C51012dc) dbVar3.instance;
                str5.getClass();
                dcVar5.f132815a |= 32;
                dcVar5.f132821g = str5;
                doVar3.copyOnWrite();
                C51027dr drVar8 = (C51027dr) doVar3.instance;
                C51012dc dcVar6 = (C51012dc) dbVar3.build();
                dcVar6.getClass();
                drVar8.f132864k = dcVar6;
                drVar8.f132854a |= 128;
                dlVar.mo53503d(doVar3);
            }
        }
        return (C51030du) dlVar.build();
    }

    /* renamed from: p */
    private final C60870cx m61066p(C60870cx cxVar) {
        return C60846c.m92878g(cxVar, RuntimeException.class, C32980ab.f88355a, this.f88379j);
    }

    /* renamed from: q */
    private final C60870cx m61067q(C52623yp ypVar) {
        Optional optional;
        C51030du duVar;
        if (((C51406gn) this.f88378i.f88385c.get()).f133902n) {
            m61072v(ypVar, new HashSet());
            return C60856cj.m92900i(Optional.m71637of(mo38434a(true)));
        } else if (this.f88382m != 2) {
            return mo38437e(ypVar);
        } else {
            if (this.f88378i.f88384b.isPresent()) {
                if (this.f88372c.mo38469N()) {
                    return mo38437e(ypVar);
                }
                Optional empty = Optional.empty();
                if (!ypVar.f138169f.isEmpty()) {
                    empty = Optional.ofNullable(C33027bv.m61281l(this.f88371b));
                }
                HashSet hashSet = new HashSet();
                for (C52633yz yzVar : C33027bv.m61282m(ypVar)) {
                    if ((yzVar.f138194a & 1) != 0) {
                        hashSet.add(yzVar.f138195b);
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (empty.isPresent()) {
                    arrayList.add((String) empty.get());
                }
                arrayList.addAll(hashSet);
                Optional r = this.f88372c.mo38488r();
                if (r.isPresent()) {
                    if (!this.f88381l || arrayList.size() == 1) {
                        if (empty.isPresent() && ((String) r.get()).equals(empty.get())) {
                            return mo38437e(ypVar);
                        }
                        if (arrayList.contains(r.get())) {
                            return mo38435c(ypVar, (String) r.get());
                        }
                    }
                    this.f88372c.mo38457B();
                    return mo38440h(ypVar, m61065b(empty, Optional.empty(), hashSet));
                } else if (arrayList.size() == 1) {
                    String str = (String) C58557jl.m90133n(arrayList);
                    this.f88372c.mo38465J(str);
                    if (empty.isPresent()) {
                        return mo38437e(ypVar);
                    }
                    return mo38435c(ypVar, str);
                } else {
                    List list = (List) Collection.EL.stream(arrayList).sorted().collect(Collectors.toCollection(C33050x.f88500a));
                    return C60922j.m93045h(m61071u(), new C33051y(this, empty, ypVar, hashSet), this.f88379j);
                }
            } else if (!C33033g.m61307i(this.f88372c)) {
                ((C59052c) ((C59052c) f88370a.mo56225c()).mo56372aa(50773)).mo56386p("The provider type (call? message?) cannot be determined.");
                return C60856cj.m92900i(Optional.empty());
            } else if (C33033g.m61308j(this.f88372c)) {
                Set g = C33033g.m61305g(ypVar);
                if (!ypVar.f138169f.isEmpty()) {
                    g.add("com.google.android.apps.tachyon");
                }
                if (g.size() == 1) {
                    String str2 = (String) C58557jl.m90133n(g);
                    this.f88372c.mo38465J(str2);
                    if (str2.equals("com.google.android.apps.tachyon")) {
                        return mo38437e(ypVar);
                    }
                    return mo38435c(ypVar, str2);
                }
                if (g.contains("com.google.android.apps.tachyon")) {
                    duVar = m61065b(Optional.m71637of("com.google.android.apps.tachyon"), Optional.empty(), g);
                } else {
                    duVar = m61065b(Optional.empty(), Optional.empty(), g);
                }
                return mo38440h(ypVar, duVar);
            } else {
                Optional r2 = this.f88372c.mo38488r();
                if (!r2.isPresent() || ((String) r2.get()).equals("com.google.android.dialer")) {
                    if (ypVar.f138169f.isEmpty()) {
                        optional = Optional.empty();
                    } else {
                        optional = C33033g.m61302d(this.f88371b, r2);
                    }
                    Set f = C33033g.m61304f(ypVar);
                    ArrayList arrayList2 = new ArrayList();
                    if (optional.isPresent()) {
                        arrayList2.add((String) optional.get());
                    }
                    arrayList2.addAll(f);
                    if (arrayList2.size() != 1) {
                        return C60922j.m93045h(m61071u(), new C32979aa(this, optional, ypVar, f), this.f88379j);
                    }
                    String str3 = (String) C58557jl.m90133n(arrayList2);
                    if (optional.isPresent()) {
                        return mo38437e(ypVar);
                    }
                    this.f88372c.mo38465J(str3);
                    if (str3.equals("com.google.android.apps.tachyon")) {
                        return mo38437e(ypVar);
                    }
                    return mo38435c(ypVar, str3);
                }
                this.f88372c.mo38465J((String) r2.get());
                if (((String) r2.get()).equals("com.google.android.apps.tachyon")) {
                    return mo38437e(ypVar);
                }
                return mo38435c(ypVar, (String) r2.get());
            }
        }
    }

    /* renamed from: r */
    private final C60870cx m61068r(Set set) {
        if (!this.f88377h.mo38382l() || this.f88380k) {
            return C60856cj.m92900i(Optional.empty());
        }
        mo38447o();
        List list = (List) Collection.EL.stream(set).sorted().collect(Collectors.toCollection(C33050x.f88500a));
        return m61066p(C60922j.m93044g(C60856cj.m92900i(Optional.empty()), C32984af.f88369a, this.f88379j));
    }

    /* renamed from: s */
    private final C60870cx m61069s(List list) {
        if (!this.f88377h.mo38382l() || this.f88380k) {
            return C60856cj.m92900i(Optional.empty());
        }
        mo38447o();
        List list2 = (List) Collection.EL.stream(list).sorted().collect(Collectors.toCollection(C33050x.f88500a));
        return m61066p(C60922j.m93044g(C60856cj.m92900i(Optional.empty()), new C33048v(this), this.f88379j));
    }

    /* renamed from: t */
    private final Optional m61070t() {
        Optional t = this.f88372c.mo38490t((String) this.f88372c.mo38489s().orElse(BuildConfig.FLAVOR), BuildConfig.FLAVOR);
        if (t.isPresent()) {
            m61072v((C52623yp) t.get(), new HashSet());
            if (this.f88377h.mo38382l() && !this.f88380k) {
                mo38447o();
                C55998f fVar = C55998f.UNKNOWN;
            }
        } else if (this.f88377h.mo38382l() && !this.f88380k) {
            mo38447o();
            C55998f fVar2 = C55998f.UNKNOWN;
        }
        return Optional.m71637of(mo38434a(true));
    }

    /* renamed from: u */
    private final C60870cx m61071u() {
        if (!this.f88377h.mo38382l() || this.f88380k) {
            return C60856cj.m92900i(Optional.empty());
        }
        mo38447o();
        return m61066p(C60922j.m93044g(C60856cj.m92900i(Optional.empty()), new C33047u(this), this.f88379j));
    }

    /* renamed from: v */
    private final void m61072v(C52623yp ypVar, Set set) {
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
        mo38446n(ypVar, (C51030du) dlVar.build(), 5);
    }

    /* renamed from: a */
    public final C32987ai mo38434a(boolean z) {
        C50969bn bnVar;
        C51406gn gnVar;
        C52091ex exVar;
        C32978a aVar = new C32978a();
        aVar.mo38431b(C50969bn.f132678i);
        aVar.mo38430a(C51406gn.f133887s);
        aVar.mo38433d(C52091ex.f136710b);
        aVar.mo38432c(false);
        aVar.mo38431b(this.f88376g);
        aVar.mo38430a((C51406gn) this.f88378i.f88385c.get());
        aVar.mo38433d(this.f88378i.mo38452a());
        aVar.mo38432c(z);
        if (aVar.f88350e == 1 && (bnVar = aVar.f88346a) != null && (gnVar = aVar.f88347b) != null && (exVar = aVar.f88349d) != null) {
            return new C33005b(bnVar, gnVar, aVar.f88348c, exVar);
        }
        StringBuilder sb = new StringBuilder();
        if (aVar.f88346a == null) {
            sb.append(" contactSelection");
        }
        if (aVar.f88347b == null) {
            sb.append(" communicationFluidActionsData");
        }
        if (aVar.f88350e == 0) {
            sb.append(" contactSelectionDone");
        }
        if (aVar.f88349d == null) {
            sb.append(" conversationParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final C60870cx mo38435c(C52623yp ypVar, String str) {
        Optional empty = Optional.empty();
        if (C33033g.m61307i(this.f88372c)) {
            if (C33033g.m61308j(this.f88372c)) {
                empty = C33033g.m61301c(ypVar, str);
            } else {
                empty = C33033g.m61300b(ypVar, str);
            }
            if (empty.isPresent()) {
                this.f88372c.mo38464I((String) empty.get());
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        List<C52633yz> m = C33027bv.m61282m(ypVar);
        C51021dl dlVar = (C51021dl) C51030du.f132868g.createBuilder();
        for (C52633yz yzVar : m) {
            C52613yf yfVar = yzVar.f138197d;
            if (yfVar == null) {
                yfVar = C52613yf.f138138f;
            }
            if (!hashSet.contains(yfVar.f138141b) && (yzVar.f138194a & 1) != 0 && yzVar.f138195b.equals(str)) {
                if (empty.isPresent()) {
                    String str2 = (String) empty.get();
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
        return C60922j.m93044g(m61068r(hashSet), new C32983ae(this, hashMap, ypVar, hashSet, dlVar), this.f88379j);
    }

    /* renamed from: d */
    public final C60870cx mo38436d(C52623yp ypVar, String str) {
        HashSet hashSet = new HashSet();
        for (C52619yl ylVar : ypVar.f138168e) {
            if (C58890d.m90990e(ylVar.f138153c, str)) {
                hashSet.add(ylVar.f138152b);
            }
        }
        if (!hashSet.isEmpty()) {
            return C60922j.m93044g(m61068r(hashSet), new C32981ac(this, ypVar, str, hashSet), this.f88379j);
        }
        ((C59052c) ((C59052c) f88370a.mo56225c()).mo56372aa(50765)).mo56386p("performEmailDisambiguation, no emails for selected label");
        return C60856cj.m92900i(mo38443k((String) this.f88372c.mo38489s().orElse(BuildConfig.FLAVOR)));
    }

    /* renamed from: f */
    public final C60870cx mo38438f(C52623yp ypVar, String str) {
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
            return C60922j.m93044g(m61068r(hashSet), new C33049w(this, ypVar, str, hashSet), this.f88379j);
        }
        ((C59052c) ((C59052c) f88370a.mo56225c()).mo56372aa(50769)).mo56386p("performNumberDisambiguation, no numbers for selected label");
        return C60856cj.m92900i(mo38443k((String) this.f88372c.mo38489s().orElse(BuildConfig.FLAVOR)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo38439g() {
        /*
            r8 = this;
            com.google.assistant.e.j.tg r0 = r8.f88375f
            com.google.assistant.e.j.tv r0 = r0.f137761c
            if (r0 != 0) goto L_0x0008
            com.google.assistant.e.j.tv r0 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
        L_0x0008:
            int r0 = r0.f137811a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x02b5
            com.google.assistant.e.j.tg r0 = r8.f88375f
            com.google.assistant.e.j.tv r0 = r0.f137761c
            if (r0 != 0) goto L_0x0016
            com.google.assistant.e.j.tv r0 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
        L_0x0016:
            long r2 = r0.f137812b
            int r0 = (int) r2
            com.google.assistant.e.c.c.bn r2 = r8.f88376g
            com.google.assistant.e.c.c.du r2 = r2.f132683d
            if (r2 != 0) goto L_0x0021
            com.google.assistant.e.c.c.du r2 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0021:
            com.google.protobuf.cq r2 = r2.f132875f
            int r3 = r2.size()
            if (r3 > r0) goto L_0x0040
            com.google.common.f.e r0 = f88370a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "progressContactSelection, invalid tapped index"
            r2 = 50777(0xc659, float:7.1154E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0040:
            java.lang.Object r0 = r2.get(r0)
            com.google.assistant.e.c.c.dr r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r0
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            j$.util.Optional r2 = r2.mo38495y()
            java.lang.String r3 = ""
            java.lang.Object r2 = r2.orElse(r3)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            j$.util.Optional r2 = r2.mo38489s()
            java.lang.Object r2 = r2.orElse(r3)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            j$.util.Optional r2 = r2.mo38488r()
            java.lang.Object r2 = r2.orElse(r3)
            java.lang.String r2 = (java.lang.String) r2
            r8.f88373d = r2
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            j$.util.Optional r2 = r2.mo38481k()
            java.lang.Object r2 = r2.orElse(r3)
            java.lang.String r2 = (java.lang.String) r2
            r8.f88374e = r2
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj r2 = r8.f88378i
            j$.util.Optional r2 = r2.f88385c
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.i.a.gn r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r2
            int r2 = r2.f133894f
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r2)
            if (r2 != 0) goto L_0x0092
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0092:
            int r2 = r2.ordinal()
            r4 = 2
            if (r2 == r1) goto L_0x0224
            if (r2 == r4) goto L_0x0224
            r5 = 3
            r6 = 6
            if (r2 == r5) goto L_0x01a2
            r7 = 5
            if (r2 == r7) goto L_0x014a
            if (r2 == r6) goto L_0x00ad
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x00ad:
            int r2 = r0.f132855b
            if (r2 != r4) goto L_0x00b6
            java.lang.Object r2 = r0.f132856c
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00b7
        L_0x00b6:
            r2 = r3
        L_0x00b7:
            int r5 = r8.f88382m
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x0148
            if (r6 == 0) goto L_0x013f
            if (r6 == r1) goto L_0x00cf
            if (r6 == r4) goto L_0x00c9
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0143
        L_0x00c9:
            j$.util.Optional r0 = r8.mo38442j(r2)
            goto L_0x0143
        L_0x00cf:
            com.google.assistant.e.c.c.dc r0 = r0.f132864k
            if (r0 != 0) goto L_0x00d5
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00d5:
            int r0 = r0.f132815a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x013a
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r8.f88372c
            j$.util.Optional r0 = r0.mo38489s()
            java.lang.Object r0 = r0.orElse(r3)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            j$.util.Optional r0 = r1.mo38490t(r0, r3)
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L_0x00f8
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0143
        L_0x00f8:
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            java.util.List r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61282m(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0106:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0135
            java.lang.Object r1 = r0.next()
            com.google.assistant.e.j.yz r1 = (com.google.assistant.p3897e.p3921j.C52633yz) r1
            com.google.assistant.e.j.yf r3 = r1.f138197d
            if (r3 != 0) goto L_0x0118
            com.google.assistant.e.j.yf r3 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x0118:
            java.lang.String r3 = r3.f138144e
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0106
            com.google.assistant.e.j.yf r0 = r1.f138197d
            if (r0 != 0) goto L_0x0127
            com.google.assistant.e.j.yf r1 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
            goto L_0x0128
        L_0x0127:
            r1 = r0
        L_0x0128:
            java.lang.String r1 = r1.f138141b
            if (r0 != 0) goto L_0x012e
            com.google.assistant.e.j.yf r0 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x012e:
            java.lang.String r0 = r0.f138144e
            j$.util.Optional r0 = r8.mo38441i(r1, r0)
            goto L_0x0143
        L_0x0135:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0143
        L_0x013a:
            j$.util.Optional r0 = r8.mo38444l(r2)
            goto L_0x0143
        L_0x013f:
            j$.util.Optional r0 = r8.mo38444l(r2)
        L_0x0143:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0148:
            r0 = 0
            throw r0
        L_0x014a:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            j$.util.Optional r1 = r1.mo38489s()
            java.lang.Object r1 = r1.orElse(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.f132855b
            if (r2 != r4) goto L_0x015f
            java.lang.Object r0 = r0.f132856c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0160
        L_0x015f:
            r0 = r3
        L_0x0160:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            j$.util.Optional r2 = r2.mo38490t(r1, r3)
            boolean r3 = r2.isPresent()
            if (r3 != 0) goto L_0x0183
            com.google.common.f.e r0 = f88370a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "progressLabelSelection, contact information for selected person absent"
            r3 = 50779(0xc65b, float:7.1157E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            j$.util.Optional r0 = r8.mo38443k(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x01a1
        L_0x0183:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            r1.mo38462G(r0)
            int r1 = r8.f88382m
            if (r1 != r5) goto L_0x0197
            java.lang.Object r1 = r2.get()
            com.google.assistant.e.j.yp r1 = (com.google.assistant.p3897e.p3921j.C52623yp) r1
            com.google.common.util.concurrent.cx r0 = r8.mo38436d(r1, r0)
            goto L_0x01a1
        L_0x0197:
            java.lang.Object r1 = r2.get()
            com.google.assistant.e.j.yp r1 = (com.google.assistant.p3897e.p3921j.C52623yp) r1
            com.google.common.util.concurrent.cx r0 = r8.mo38438f(r1, r0)
        L_0x01a1:
            return r0
        L_0x01a2:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            j$.util.Optional r1 = r1.mo38489s()
            java.lang.Object r1 = r1.orElse(r3)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            j$.util.Optional r2 = r2.mo38490t(r1, r3)
            boolean r5 = r2.isPresent()
            if (r5 != 0) goto L_0x01d1
            com.google.common.f.e r0 = f88370a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "progressProviderSelection, contact information for selected person absent"
            r3 = 50783(0xc65f, float:7.1162E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            j$.util.Optional r0 = r8.mo38443k(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0223
        L_0x01d1:
            int r1 = r0.f132855b
            if (r1 != r6) goto L_0x01da
            java.lang.Object r1 = r0.f132856c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x01db
        L_0x01da:
            r1 = r3
        L_0x01db:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ef
            int r1 = r0.f132855b
            if (r1 != r6) goto L_0x01ea
            java.lang.Object r1 = r0.f132856c
            java.lang.String r1 = (java.lang.String) r1
            r3 = r1
        L_0x01ea:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            r1.mo38465J(r3)
        L_0x01ef:
            java.lang.String r1 = r0.f132863j
            java.lang.String r5 = "default_selection_item_status"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0219
            int r0 = r0.f132855b
            if (r0 != r4) goto L_0x01fe
            goto L_0x0219
        L_0x01fe:
            java.lang.String r0 = "com.google.android.apps.tachyon"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0219
            java.lang.String r0 = "com.google.android.dialer"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0219
            java.lang.Object r0 = r2.get()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            com.google.common.util.concurrent.cx r0 = r8.mo38435c(r0, r3)
            goto L_0x0223
        L_0x0219:
            java.lang.Object r0 = r2.get()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            com.google.common.util.concurrent.cx r0 = r8.mo38437e(r0)
        L_0x0223:
            return r0
        L_0x0224:
            int r2 = r0.f132855b
            if (r2 != r4) goto L_0x022d
            java.lang.Object r2 = r0.f132856c
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x022d:
            java.lang.String r0 = r0.f132861h
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            j$.util.Optional r2 = r2.mo38490t(r3, r0)
            com.google.android.libraries.search.assistant.fluidactions.b.d r4 = r8.f88377h
            boolean r4 = r4.mo38392u()
            if (r4 == 0) goto L_0x0296
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0296
            r8.f88380k = r1
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r4 = r8.f88372c
            j$.util.Optional r0 = r4.mo38491u(r3, r0)
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x0296
            boolean r4 = r0.isPresent()
            if (r4 == 0) goto L_0x0296
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
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.adm r0 = (com.google.assistant.p3897e.p3921j.adm) r0
            r4.mo53673a(r0)
            com.google.protobuf.bv r0 = r4.build()
            com.google.assistant.e.j.ade r0 = (com.google.assistant.p3897e.p3921j.ade) r0
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            r1.mo38466K(r0)
        L_0x0296:
            boolean r0 = r2.isPresent()
            if (r0 != 0) goto L_0x02a5
            j$.util.Optional r0 = r8.mo38443k(r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x02b4
        L_0x02a5:
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r0 = r8.f88372c
            r0.mo38467L(r3)
            java.lang.Object r0 = r2.get()
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            com.google.common.util.concurrent.cx r0 = r8.m61067q(r0)
        L_0x02b4:
            return r0
        L_0x02b5:
            com.google.assistant.e.j.tg r0 = r8.f88375f
            int r2 = r0.f137759a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x036a
            com.google.assistant.e.j.adm r0 = r0.f137760b
            if (r0 != 0) goto L_0x02c2
            com.google.assistant.e.j.adm r0 = com.google.assistant.p3897e.p3921j.adm.f134889h
        L_0x02c2:
            com.google.assistant.e.j.yp r2 = r0.f134892b
            if (r2 != 0) goto L_0x02c8
            com.google.assistant.e.j.yp r2 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x02c8:
            com.google.protobuf.cq r2 = r2.f138166c
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x02e7
            com.google.common.f.e r0 = f88370a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "progressContactSelection, no name for selected person"
            r2 = 50775(0xc657, float:7.1151E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x02e7:
            r3 = 0
            java.lang.Object r4 = r2.get(r3)
            com.google.assistant.e.j.yn r4 = (com.google.assistant.p3897e.p3921j.C52621yn) r4
            java.lang.String r4 = r4.f138158c
            java.lang.Object r4 = r2.get(r3)
            com.google.assistant.e.j.yn r4 = (com.google.assistant.p3897e.p3921j.C52621yn) r4
            java.lang.String r4 = r4.f138158c
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r4 = r8.f88372c
            java.lang.Object r5 = r2.get(r3)
            com.google.assistant.e.j.yn r5 = (com.google.assistant.p3897e.p3921j.C52621yn) r5
            java.lang.String r5 = r5.f138158c
            r4.mo38467L(r5)
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
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r2 = r8.f88372c
            r2.mo38466K(r1)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            j$.util.Optional r1 = r1.mo38475e()
            boolean r1 = r1.isPresent()
            r8.f88381l = r1
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ao r1 = r8.f88372c
            r1.mo38456A()
            com.google.assistant.e.j.yp r0 = r0.f134892b
            if (r0 != 0) goto L_0x0365
            com.google.assistant.e.j.yp r0 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x0365:
            com.google.common.util.concurrent.cx r0 = r8.m61067q(r0)
            return r0
        L_0x036a:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C32985ag.mo38439g():com.google.common.util.concurrent.cx");
    }

    /* renamed from: h */
    public final C60870cx mo38440h(C52623yp ypVar, C51030du duVar) {
        if (duVar.f132875f.size() == 0) {
            return C60856cj.m92900i(mo38443k((String) this.f88372c.mo38489s().orElse(BuildConfig.FLAVOR)));
        }
        mo38446n(ypVar, duVar, 8);
        mo38445m(C51401gi.PROVIDER_SELECTION);
        return C60856cj.m92900i(Optional.m71637of(mo38434a(false)));
    }

    /* renamed from: i */
    public final Optional mo38441i(String str, String str2) {
        this.f88372c.mo38468M(str, str2);
        return m61070t();
    }

    /* renamed from: j */
    public final Optional mo38442j(String str) {
        this.f88372c.mo38461F(str);
        return m61070t();
    }

    /* renamed from: k */
    public final Optional mo38443k(String str) {
        String str2;
        mo38445m(C51401gi.PERSON_CONTACT_SELECTION);
        if (this.f88382m == 3) {
            str2 = this.f88371b.getResources().getString(R.string.assistantactions_contact_selection_no_email, new Object[]{str});
        } else {
            str2 = this.f88371b.getResources().getString(R.string.assistantactions_contact_selection_no_phone_number, new Object[]{str});
        }
        C50966bk bkVar = (C50966bk) this.f88376g.toBuilder();
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
        this.f88376g = (C50969bn) bkVar.build();
        return Optional.m71637of(mo38434a(false));
    }

    /* renamed from: l */
    public final Optional mo38444l(String str) {
        this.f88372c.mo38463H(str);
        return m61070t();
    }

    /* renamed from: m */
    public final void mo38445m(C51401gi giVar) {
        Optional optional = this.f88378i.f88385c;
        if (optional.isPresent()) {
            C51406gn a = C33036j.m61310a(giVar, (C51406gn) optional.get());
            this.f88378i.f88385c = Optional.m71637of(a);
        }
    }

    /* renamed from: n */
    public final void mo38446n(C52623yp ypVar, C51030du duVar, int i) {
        Optional optional;
        Optional empty = Optional.empty();
        if (ypVar.f138166c.size() <= 0 || (((C52621yn) ypVar.f138166c.get(0)).f138156a & 2) == 0) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(((C52621yn) ypVar.f138166c.get(0)).f138158c);
        }
        Optional f = C33036j.m61315f(ypVar);
        if (optional.isPresent()) {
            C51138hu huVar = (C51138hu) C51141hx.f133119h.createBuilder();
            String str = (String) optional.get();
            huVar.copyOnWrite();
            C51141hx hxVar = (C51141hx) huVar.instance;
            str.getClass();
            hxVar.f133122b = 1;
            hxVar.f133123c = str;
            if (f.isPresent()) {
                C51012dc dcVar = (C51012dc) f.get();
                huVar.copyOnWrite();
                C51141hx hxVar2 = (C51141hx) huVar.instance;
                dcVar.getClass();
                hxVar2.f133126f = dcVar;
                hxVar2.f133121a |= 16;
            }
            C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
            int i2 = this.f88382m;
            int i3 = i2 - 1;
            if (i2 != 0) {
                String str2 = BuildConfig.FLAVOR;
                if (i3 == 0) {
                    str2 = (String) this.f88372c.mo38483m().orElse(str2);
                } else if (i3 != 1) {
                    if (i3 == 2) {
                        str2 = (String) this.f88372c.mo38479i().orElse(str2);
                    }
                } else if (this.f88372c.mo38492v().isPresent()) {
                    str2 = (String) this.f88372c.mo38492v().get();
                } else {
                    str2 = (String) this.f88372c.mo38483m().orElse(str2);
                }
                if (!str2.isEmpty()) {
                    huVar.copyOnWrite();
                    C51141hx hxVar3 = (C51141hx) huVar.instance;
                    str2.getClass();
                    hxVar3.f133121a |= 4;
                    hxVar3.f133124d = str2;
                }
                empty = Optional.m71637of((C51141hx) huVar.build());
            } else {
                throw null;
            }
        }
        C50969bn bnVar = this.f88376g;
        C50962bg bgVar = (C50962bg) C50965bj.f132670e.createBuilder();
        bgVar.copyOnWrite();
        C50965bj bjVar = (C50965bj) bgVar.instance;
        bjVar.f132675d = i - 1;
        bjVar.f132672a |= 1;
        if (empty.isPresent()) {
            C51141hx hxVar4 = (C51141hx) empty.get();
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
        this.f88376g = (C50969bn) bkVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo38447o() {
        C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int a = C50968bm.m85997a(this.f88376g.f132687h);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            C55421x xVar = C55421x.UNKNOWN_ACTION_TYPE;
        } else if (i == 2 || i == 3 || i == 4) {
            C55421x xVar2 = C55421x.UNKNOWN_ACTION_TYPE;
        } else if (i != 5) {
            ((C59052c) ((C59052c) f88370a.mo56225c()).mo56372aa(50786)).mo56386p("unexpected providerTypeFilter type: DEFAULT");
            if (this.f88378i.f88384b.isPresent()) {
                C55421x xVar3 = C55421x.UNKNOWN_ACTION_TYPE;
            } else if (C33033g.m61308j(this.f88372c)) {
                C55421x xVar4 = C55421x.UNKNOWN_ACTION_TYPE;
            } else {
                C55421x xVar5 = C55421x.UNKNOWN_ACTION_TYPE;
            }
        } else {
            C55421x xVar6 = C55421x.UNKNOWN_ACTION_TYPE;
        }
    }

    /* renamed from: e */
    public final C60870cx mo38437e(C52623yp ypVar) {
        if (this.f88382m == 3) {
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
                return C60856cj.m92900i(mo38443k((String) this.f88372c.mo38489s().orElse(BuildConfig.FLAVOR)));
            }
            return C60922j.m93045h(m61069s(new ArrayList(hashSet)), new C32982ad(this, ypVar, hashMap, hashSet), this.f88379j);
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
            return C60856cj.m92900i(mo38443k((String) this.f88372c.mo38489s().orElse(BuildConfig.FLAVOR)));
        }
        return C60922j.m93045h(m61069s(new ArrayList(hashSet2)), new C33052z(this, ypVar, hashMap2, hashSet2), this.f88379j);
    }
}
