package com.google.android.apps.gsa.search.shared.actions.modular;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.ActionExecutionState;
import com.google.android.apps.gsa.search.shared.actions.C87501w;
import com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87437ae;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.util.C87487i;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89933d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58758qx;
import com.google.p4152bb.p4153a.C55005ci;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55171im;
import com.google.p4152bb.p4153a.C55202jq;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55242lc;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55253ln;
import com.google.p4152bb.p4153a.C55264ly;
import com.google.p4152bb.p4153a.C55265lz;
import com.google.p4152bb.p4153a.C55268mb;
import com.google.p4152bb.p4153a.C55282mp;
import com.google.p4152bb.p4153a.C55304nk;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55353pf;
import com.google.p4152bb.p4153a.C55354pg;
import com.google.p4152bb.p4153a.C55355ph;
import com.google.p4152bb.p4153a.C55360pm;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55368pu;
import com.google.p4152bb.p4153a.C55370pw;
import com.google.p4152bb.p4153a.C55371px;
import com.google.p4152bb.p4153a.C55372py;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public class ModularAction extends VisitableAbstractVoiceAction implements Cloneable, C87426a {
    public static final Parcelable.Creator CREATOR = new C87466e();

    /* renamed from: r */
    private static final C55171im f236099r = C55171im.f145242b;

    /* renamed from: f */
    public final List f236100f;

    /* renamed from: g */
    public final SparseArray f236101g;

    /* renamed from: h */
    public final ProviderArgument f236102h;

    /* renamed from: i */
    public final C87487i f236103i;

    /* renamed from: j */
    public final C55305nl f236104j;

    /* renamed from: k */
    public C55202jq f236105k;

    /* renamed from: l */
    public final C55282mp f236106l;

    /* renamed from: m */
    public final C55421x f236107m;

    /* renamed from: n */
    public final int f236108n;

    /* renamed from: o */
    public C55242lc f236109o;

    /* renamed from: p */
    public String f236110p;

    /* renamed from: q */
    public boolean f236111q;

    /* renamed from: s */
    private final C55171im f236112s;

    /* renamed from: t */
    private C87463b f236113t;

    /* renamed from: u */
    private C90476a f236114u;

    public ModularAction(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, getClass().getClassLoader());
        ArrayList b = C58597ky.m90211b(arrayList);
        this.f236100f = b;
        ProviderArgument providerArgument = (ProviderArgument) parcel.readParcelable(getClass().getClassLoader());
        this.f236102h = providerArgument;
        this.f236101g = m141605an(b, providerArgument);
        this.f236103i = C87487i.m142003c(parcel, C55305nl.f145689r.getParserForType());
        this.f236104j = (C55305nl) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55305nl.f145689r.getParserForType());
        m141607ap();
        this.f236105k = (C55202jq) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55202jq.f145289f.getParserForType());
        this.f236112s = (C55171im) ProtoLiteParcelable.m147136g(parcel, C55171im.f145242b);
        this.f236106l = (C55282mp) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55282mp.f145616d.getParserForType());
        this.f236109o = (C55242lc) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55242lc.f145462c.getParserForType());
        C55421x a = C55421x.m87686a(parcel.readInt());
        C58838bb.m90866a(a, "actionTypeForLogging");
        this.f236107m = a;
        this.f236108n = parcel.readInt();
        this.f236111q = parcel.readInt() != 1 ? false : true;
        m141606ao();
    }

    /* renamed from: am */
    private final int m141604am(List list) {
        C55361pn b = this.f236102h.mo81321b();
        if (b == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            for (C55240la laVar : ((C55305nl) list.get(i)).f145692b) {
                if (b.f145870c == laVar.f145452b) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: an */
    private static SparseArray m141605an(List list, ProviderArgument providerArgument) {
        SparseArray sparseArray = new SparseArray(list.size() + 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Argument argument = (Argument) it.next();
            sparseArray.put(argument.f236140a, argument);
        }
        if (providerArgument != null) {
            sparseArray.put(providerArgument.f236140a, providerArgument);
        }
        return sparseArray;
    }

    /* renamed from: ao */
    private final void m141606ao() {
        PersonArgument S = mo81212S();
        if (S != null) {
            S.mo81270J(new C87464c(this));
        }
    }

    /* renamed from: ap */
    private final void m141607ap() {
        for (Argument y : this.f236100f) {
            y.mo81290y(this);
        }
        this.f236102h.mo81290y(this);
    }

    /* renamed from: aq */
    private final boolean m141608aq(int i) {
        Argument R = mo81211R(i);
        if (R == null) {
            mo81210Q().mo81402f(i);
            return false;
        } else if (!R.mo81264D() || R.mo81260hB()) {
            return false;
        } else {
            for (Integer intValue : R.mo81284s()) {
                if (!m141608aq(intValue.intValue())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: L */
    public final Object mo81132L(C87501w wVar) {
        return wVar.mo81499f(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        if (!this.f236103i.mo81484i()) {
            return false;
        }
        C55305nl Z = mo81219Z();
        if (Z.f145692b.size() == 0) {
            return false;
        }
        for (Integer intValue : Z.f145704n) {
            if (!m141608aq(intValue.intValue())) {
                return false;
            }
        }
        for (Argument argument : this.f236100f) {
            if (argument.mo81263C() && argument.mo81260hB()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    public final int mo81207N() {
        int i = -1;
        if (this.f236101g.size() > 0) {
            SparseArray sparseArray = this.f236101g;
            i = sparseArray.keyAt(sparseArray.size() - 1);
        }
        return i + 1;
    }

    /* renamed from: O */
    public final synchronized C87463b mo81210Q() {
        if (this.f236113t == null) {
            this.f236113t = new C87463b(false, false);
        }
        return this.f236113t;
    }

    /* renamed from: P */
    public final ModularAction mo81209P(Argument argument) {
        ArrayList d = C58597ky.m90213d(this.f236100f.size());
        for (Argument argument2 : this.f236100f) {
            if (argument == null || argument.f236140a != argument2.f236140a) {
                d.add(argument2.mo81278m(argument2.f236140a));
            } else {
                d.add(argument);
            }
        }
        ProviderArgument providerArgument = this.f236102h;
        return new ModularAction(this.f236103i.f236312a, this.f236104j, this.f236105k, d, (ProviderArgument) providerArgument.mo81278m(providerArgument.f236140a), this.f236112s, this.f236106l, this.f236107m, this.f236108n, this.f236109o, this.f236111q, this.f236114u);
    }

    /* renamed from: R */
    public final Argument mo81211R(int i) {
        return (Argument) this.f236101g.get(i);
    }

    /* renamed from: S */
    public final PersonArgument mo81212S() {
        for (Argument argument : this.f236100f) {
            if (argument instanceof PersonArgument) {
                return (PersonArgument) argument;
            }
        }
        return null;
    }

    /* renamed from: T */
    public final C87429c mo81213T(C87449m mVar, C55134hc hcVar, Context context) {
        Argument R = mo81211R(hcVar.f145122b);
        if (R == null) {
            mo81210Q().mo81395a("Reference to non-existing argument", hcVar, (Throwable) null);
            return C87429c.f236122a;
        } else if (!R.mo81263C()) {
            return hcVar.f145125e ? new C87429c(BuildConfig.FLAVOR) : C87429c.f236122a;
        } else {
            return R.mo81250c(mVar, hcVar, context.getResources());
        }
    }

    /* renamed from: U */
    public final C87429c mo81214U(C55134hc hcVar) {
        C55242lc lcVar;
        ModularActionMatchingProviderInfo modularActionMatchingProviderInfo = (ModularActionMatchingProviderInfo) this.f235986b;
        C55133hb hbVar = C55133hb.NONE;
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        int ordinal = a.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 5 && (lcVar = this.f236109o) != null) {
                    return new C87429c(lcVar.f145465b);
                }
            } else if (modularActionMatchingProviderInfo != null && modularActionMatchingProviderInfo.f236270h.mo81484i()) {
                return ModularActionMatchingProviderInfo.m141651a(modularActionMatchingProviderInfo, hcVar);
            }
        } else if (modularActionMatchingProviderInfo != null && modularActionMatchingProviderInfo.f236270h.mo81484i()) {
            return ModularActionMatchingProviderInfo.m141651a(modularActionMatchingProviderInfo, hcVar);
        } else {
            C55305nl Z = mo81219Z();
            if ((Z.f145691a & 4096) != 0) {
                return new C87429c(Z.f145705o);
            }
        }
        return C87429c.f236122a;
    }

    /* renamed from: V */
    public final C55171im mo81215V() {
        C55171im imVar = this.f236112s;
        return imVar != null ? imVar : f236099r;
    }

    /* renamed from: W */
    public final C55213ka mo81216W(int i) {
        Argument R = mo81211R(i);
        if (R != null) {
            return R.mo81279n();
        }
        return null;
    }

    /* renamed from: X */
    public final C55240la mo81217X(int i) {
        C55240la laVar;
        Iterator it = this.f236103i.f236312a.iterator();
        do {
            laVar = null;
            if (!it.hasNext()) {
                break;
            }
            C55305nl nlVar = (C55305nl) it.next();
            List[] listArr = new List[6];
            int i2 = 0;
            listArr[0] = nlVar.f145692b;
            listArr[1] = nlVar.f145693c;
            C55244le leVar = nlVar.f145694d;
            if (leVar == null) {
                leVar = C55244le.f145466h;
            }
            listArr[2] = leVar.f145470c;
            C55244le leVar2 = nlVar.f145696f;
            if (leVar2 == null) {
                leVar2 = C55244le.f145466h;
            }
            listArr[3] = leVar2.f145470c;
            C55244le leVar3 = nlVar.f145695e;
            if (leVar3 == null) {
                leVar3 = C55244le.f145466h;
            }
            listArr[4] = leVar3.f145470c;
            C55244le leVar4 = nlVar.f145697g;
            if (leVar4 == null) {
                leVar4 = C55244le.f145466h;
            }
            listArr[5] = leVar4.f145470c;
            while (true) {
                if (i2 >= 6) {
                    break;
                }
                for (C55240la laVar2 : listArr[i2]) {
                    if (laVar2.f145452b == i) {
                        laVar = laVar2;
                        continue;
                        break;
                    }
                }
                i2++;
            }
        } while (laVar == null);
        return laVar;
    }

    /* renamed from: Y */
    public final C55265lz mo81218Y(boolean z, boolean z2) {
        C55264ly lyVar = (C55264ly) C55265lz.f145555l.createBuilder();
        C55373pz pzVar = this.f236103i.f236313b;
        if (pzVar != null) {
            lyVar.copyOnWrite();
            C55265lz lzVar = (C55265lz) lyVar.instance;
            lzVar.f145561d = pzVar;
            lzVar.f145558a |= 1;
        }
        for (Argument H : this.f236100f) {
            lyVar.mo54224c(H.mo81268H(z));
        }
        if (z2) {
            C55213ka n = this.f236102h.mo81279n();
            lyVar.copyOnWrite();
            C55265lz lzVar2 = (C55265lz) lyVar.instance;
            n.getClass();
            lzVar2.f145563f = n;
            lzVar2.f145558a |= 4;
        }
        C55171im imVar = this.f236112s;
        if (imVar != null) {
            lyVar.copyOnWrite();
            C55265lz lzVar3 = (C55265lz) lyVar.instance;
            lzVar3.f145566i = imVar;
            lzVar3.f145558a |= 32;
        }
        C55242lc lcVar = this.f236109o;
        if (lcVar != null) {
            lyVar.copyOnWrite();
            C55265lz lzVar4 = (C55265lz) lyVar.instance;
            lzVar4.f145568k = lcVar;
            lzVar4.f145558a |= 64;
        }
        C55202jq jqVar = this.f236105k;
        if (jqVar != null) {
            lyVar.copyOnWrite();
            C55265lz lzVar5 = (C55265lz) lyVar.instance;
            lzVar5.f145564g = jqVar;
            lzVar5.f145558a |= 8;
        }
        List list = this.f236103i.f236312a;
        lyVar.copyOnWrite();
        C55265lz lzVar6 = (C55265lz) lyVar.instance;
        lzVar6.mo54227b();
        C62947c.addAll((Iterable) list, (List) lzVar6.f145560c);
        C55305nl nlVar = this.f236104j;
        lyVar.copyOnWrite();
        C55265lz lzVar7 = (C55265lz) lyVar.instance;
        nlVar.getClass();
        lzVar7.f145562e = nlVar;
        lzVar7.f145558a |= 2;
        int i = this.f236108n;
        lyVar.copyOnWrite();
        C55265lz lzVar8 = (C55265lz) lyVar.instance;
        lzVar8.f145558a |= 16;
        lzVar8.f145565h = i;
        return (C55265lz) lyVar.build();
    }

    /* renamed from: Z */
    public final C55305nl mo81219Z() {
        C55305nl nlVar = (C55305nl) this.f236103i.mo81480d();
        return nlVar != null ? nlVar : this.f236104j;
    }

    /* renamed from: a */
    public final ModularActionMatchingProviderInfo mo81220a() {
        return (ModularActionMatchingProviderInfo) this.f235986b;
    }

    /* renamed from: aa */
    public final String mo81221aa() {
        Object obj;
        int i;
        Object obj2;
        C55213ka W = mo81216W(this.f236102h.f236140a);
        if (W != null) {
            C62940bt r2 = C62942bv.checkIsLite(C55268mb.f145571e);
            W.mo58887l(r2);
            Object l = W.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj = r2.f169969b;
            } else {
                obj = r2.mo58889c(l);
            }
            C55268mb mbVar = (C55268mb) obj;
            C55373pz pzVar = mbVar.f145575c;
            if (pzVar == null) {
                pzVar = C55373pz.f145913d;
            }
            Iterator it = pzVar.f145916b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C55371px pxVar = (C55371px) it.next();
                C55370pw a = C55370pw.m87678a(pxVar.f145911c);
                if (a == null) {
                    a = C55370pw.UNKNOWN_SELECTION_TYPE;
                }
                if (a == C55370pw.USER_SELECTED && (i = pxVar.f145910b) >= 0 && i < mbVar.f145574b.size()) {
                    C55361pn pnVar = (C55361pn) mbVar.f145574b.get(pxVar.f145910b);
                    C62940bt r22 = C62942bv.checkIsLite(C55355ph.f145853f);
                    pnVar.mo58887l(r22);
                    if (pnVar.f169962ag.mo58857o(r22.f169971d)) {
                        C62940bt r1 = C62942bv.checkIsLite(C55355ph.f145853f);
                        pnVar.mo58887l(r1);
                        Object l2 = pnVar.f169962ag.mo58854l(r1.f169971d);
                        if (l2 == null) {
                            obj2 = r1.f169969b;
                        } else {
                            obj2 = r1.mo58889c(l2);
                        }
                        return ((C55355ph) obj2).f145856b;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ab */
    public final List mo81222ab() {
        if (mo81219Z().f145703m.size() == 0) {
            return this.f236100f;
        }
        C55305nl Z = mo81219Z();
        ArrayDeque arrayDeque = new ArrayDeque();
        for (Integer intValue : Z.f145703m) {
            arrayDeque.add(Integer.valueOf(intValue.intValue()));
        }
        HashSet g = C58758qx.m90649g(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            int intValue2 = ((Integer) arrayDeque.remove()).intValue();
            Argument argument = (Argument) this.f236101g.get(intValue2);
            if (argument != null && g.add(Integer.valueOf(intValue2))) {
                for (Integer intValue3 : argument.mo81283r()) {
                    Integer valueOf = Integer.valueOf(intValue3.intValue());
                    if (!g.contains(valueOf)) {
                        arrayDeque.add(valueOf);
                    }
                }
            }
        }
        ArrayList d = C58597ky.m90213d(g.size());
        for (Argument argument2 : this.f236100f) {
            if (g.contains(Integer.valueOf(argument2.f236140a))) {
                d.add(argument2);
            }
        }
        return d;
    }

    /* renamed from: ac */
    public final List mo81223ac() {
        ArrayList arrayList = new ArrayList();
        for (Argument argument : this.f236100f) {
            if (argument.mo81265E()) {
                arrayList.add(argument);
            }
        }
        return arrayList;
    }

    /* renamed from: ad */
    public final Set mo81224ad() {
        HashSet hashSet = new HashSet();
        PersonArgument S = mo81212S();
        if (S != null) {
            if (this.f236103i.mo81484i()) {
                C87515c b = C87437ae.m141906b(mo81219Z(), S.f236140a);
                if (b != null) {
                    hashSet.add(b);
                }
            } else {
                for (C55305nl b2 : this.f236103i.f236312a) {
                    C87515c b3 = C87437ae.m141906b(b2, S.f236140a);
                    if (b3 != null) {
                        hashSet.add(b3);
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r7.f236102h.mo81320a();
     */
    /* renamed from: ae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81225ae() {
        /*
            r7 = this;
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r0 = r7.f236102h
            java.util.List r0 = r0.mo81322d()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r0 = r7.f236102h
            com.google.android.apps.gsa.search.shared.contact.Disambiguation r0 = r0.mo81320a()
            java.util.List r1 = r0.f236363b
            if (r1 == 0) goto L_0x0053
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L_0x0053
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r1 = r7.f236102h
            java.util.List r0 = r0.f236363b
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable r0 = (com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable) r0
            com.google.bb.a.pn r4 = com.google.p4152bb.p4153a.C55361pn.f145866g
            com.google.protobuf.MessageLite r0 = r0.mo84190c(r4)
            com.google.bb.a.pn r0 = (com.google.p4152bb.p4153a.C55361pn) r0
            com.google.android.apps.gsa.search.shared.actions.util.i r4 = r1.f236200i
            r4.getClass()
            com.google.bb.a.pw[] r5 = new com.google.p4152bb.p4153a.C55370pw[r2]
            com.google.bb.a.pw r6 = com.google.p4152bb.p4153a.C55370pw.USER_SELECTED
            r5[r3] = r6
            int r3 = r4.mo81477a(r5)
            r5 = -1
            if (r3 != r5) goto L_0x0041
            r3 = 0
            goto L_0x0049
        L_0x0041:
            java.util.List r4 = r4.f236312a
            java.lang.Object r3 = r4.get(r3)
            com.google.protobuf.MessageLite r3 = (com.google.protobuf.MessageLite) r3
        L_0x0049:
            if (r3 != 0) goto L_0x0050
            com.google.android.apps.gsa.search.shared.actions.util.i r1 = r1.f236200i
            r1.mo81481e(r0)
        L_0x0050:
            r7.mo81227ag(r2)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.ModularAction.mo81225ae():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r3.contains(r4) != false) goto L_0x0035;
     */
    /* renamed from: af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81226af() {
        /*
            r7 = this;
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r0 = r7.mo81212S()
            if (r0 == 0) goto L_0x0085
            java.util.Set r1 = r7.mo81224ad()
            boolean r2 = r0.mo81263C()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r0.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r2 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r2
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = r0.f236144e
            r3 = 0
            if (r0 == 0) goto L_0x0020
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r0 = r0.f236102h
            com.google.bb.a.pn r0 = r0.mo81321b()
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            java.util.Set r4 = r2.f236392h
            boolean r4 = r4.containsAll(r1)
            r5 = 1
            if (r4 == 0) goto L_0x0062
            com.google.bb.a.pn r4 = r2.f236393i
            r6 = 0
            if (r4 == 0) goto L_0x0037
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0037
        L_0x0035:
            r5 = 0
            goto L_0x0062
        L_0x0037:
            com.google.bb.a.pn r4 = r2.f236393i
            if (r4 != 0) goto L_0x0062
            boolean r4 = r2.mo81608D()
            if (r4 == 0) goto L_0x0062
            r2.f236393i = r0
            android.os.Parcelable r4 = r2.f236364c
            r4.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r4 = (com.google.android.apps.gsa.search.shared.contact.Person) r4
            if (r0 != 0) goto L_0x004d
            goto L_0x0052
        L_0x004d:
            com.google.common.b.qy r3 = new com.google.common.b.qy
            r3.<init>(r0)
        L_0x0052:
            java.util.List r3 = r4.mo81562k(r1, r3)
            android.os.Parcelable r4 = r2.f236412o
            r4.getClass()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0062
            goto L_0x0035
        L_0x0062:
            r2.f236392h = r1
            if (r5 != 0) goto L_0x0067
            goto L_0x0085
        L_0x0067:
            r2.f236393i = r0
            r2.mo81609E()
            boolean r0 = r2.mo81544m()
            if (r0 == 0) goto L_0x007f
            android.os.Parcelable r0 = r2.f236364c
            r0.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r0 = (com.google.android.apps.gsa.search.shared.contact.Person) r0
            r0.mo81566q()
            r2.mo81611x(r0)
        L_0x007f:
            r2.mo81533b()
            r2.mo81534c()
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.ModularAction.mo81226af():void");
    }

    /* renamed from: ag */
    public final void mo81227ag(boolean z) {
        List list = this.f236103i.f236312a;
        int am = m141604am(list);
        if (am != -1) {
            C55305nl nlVar = (C55305nl) list.get(am);
            if (z) {
                this.f236103i.mo81481e(nlVar);
            } else {
                this.f236103i.mo81482f(nlVar);
            }
        }
        mo81226af();
    }

    /* renamed from: ah */
    public final boolean mo81228ah(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55005ci ciVar = (C55005ci) it.next();
            if ((1 & ciVar.f144716a) != 0 && (ciVar.f144718c || !this.f235985a.f236005b)) {
                Argument R = mo81211R(ciVar.f144717b);
                if (R == null) {
                    C87463b O = mo81210Q();
                    int i = ciVar.f144717b;
                    O.mo81398b("No argument matching ArgumentConstraint=" + i + ".");
                    return false;
                } else if (!R.mo81266F(ciVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ai */
    public final boolean mo81229ai() {
        int i = this.f235987c;
        if (i == 106) {
            C55253ln b = ((ModularActionMatchingProviderInfo) this.f235986b).mo81239b();
            if (b == null) {
                return false;
            }
            return mo81231ak((C55240la) b.f145510b.get(0));
        } else if (this.f235985a.mo81117f() && (i == 1 || i == 101)) {
            return mo81231ak(((ModularActionMatchingProviderInfo) this.f235986b).f236115a);
        } else {
            if (!this.f235985a.mo81123k() || i != 2) {
                return false;
            }
            return mo81231ak(((ModularActionMatchingProviderInfo) this.f235986b).f236116b);
        }
    }

    /* renamed from: aj */
    public final boolean mo81230aj() {
        for (Argument argument : this.f236100f) {
            if (argument.mo81263C() && !argument.mo81264D() && !argument.mo81260hB()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ak */
    public final boolean mo81231ak(C55240la laVar) {
        Object obj;
        if (laVar == null) {
            return false;
        }
        C62940bt r1 = C62942bv.checkIsLite(C55208jw.f145316z);
        laVar.mo58887l(r1);
        if (!laVar.f169962ag.mo58857o(r1.f169971d)) {
            return false;
        }
        C62940bt r12 = C62942bv.checkIsLite(C55208jw.f145316z);
        laVar.mo58887l(r12);
        Object l = laVar.f169962ag.mo58854l(r12.f169971d);
        if (l == null) {
            obj = r12.f169969b;
        } else {
            obj = r12.mo58889c(l);
        }
        C55208jw jwVar = (C55208jw) obj;
        if (jwVar == null || !jwVar.f145338u) {
            return false;
        }
        return true;
    }

    /* renamed from: al */
    public final boolean mo81232al() {
        int a = C55304nk.m87661a(mo81219Z().f145698h);
        return a != 0 && a == 3;
    }

    /* renamed from: b */
    public final C55202jq mo81233b() {
        return this.f236105k;
    }

    /* renamed from: c */
    public final ActionExecutionState mo81062c() {
        return this.f235985a;
    }

    /* renamed from: d */
    public final C55242lc mo81234d() {
        return this.f236109o;
    }

    /* renamed from: e */
    public final C87456t mo81064e() {
        Map map;
        PersonArgument S = mo81212S();
        if (S == null) {
            return null;
        }
        Set ad = mo81224ad();
        C87487i iVar = this.f236102h.f236200i;
        if (iVar == null) {
            map = new HashMap();
        } else {
            map = ProviderArgument.m141823i(iVar.f236312a);
        }
        return new C87465d(this, ad, map, S);
    }

    /* renamed from: f */
    public final /* synthetic */ MatchingProviderInfo mo81065f() {
        return (ModularActionMatchingProviderInfo) this.f235986b;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return this.f236107m;
    }

    /* renamed from: h */
    public final String mo81235h(int i) {
        Argument R = mo81211R(i);
        if (R != null) {
            return R.mo81282q();
        }
        return null;
    }

    /* renamed from: i */
    public final List mo81236i() {
        return this.f236103i.f236312a;
    }

    /* renamed from: j */
    public final void mo81073j(C89933d dVar) {
        for (Argument u : this.f236100f) {
            u.mo81286u(dVar);
        }
    }

    /* renamed from: k */
    public final List mo81237k() {
        List d = this.f236102h.mo81322d();
        if (d != null) {
            return d;
        }
        return C58485gu.m89845m();
    }

    /* renamed from: l */
    public final boolean mo81238l() {
        return this.f236111q;
    }

    /* renamed from: o */
    public final void mo81076o(MatchingProviderInfo matchingProviderInfo) {
        Object obj;
        Object obj2;
        Object obj3;
        C58838bb.m90868c(matchingProviderInfo instanceof ModularActionMatchingProviderInfo);
        this.f235986b = matchingProviderInfo;
        ProviderArgument providerArgument = this.f236102h;
        ModularActionMatchingProviderInfo modularActionMatchingProviderInfo = (ModularActionMatchingProviderInfo) matchingProviderInfo;
        for (int i = 0; i < modularActionMatchingProviderInfo.f236270h.f236312a.size(); i++) {
            C55360pm pmVar = (C55360pm) ((C55361pn) modularActionMatchingProviderInfo.f236270h.f236312a.get(i)).toBuilder();
            if (providerArgument.f236200i != null && pmVar.mo58882j(C55355ph.f145853f)) {
                C55355ph phVar = (C55355ph) pmVar.mo58881i(C55355ph.f145853f);
                Iterator it = providerArgument.f236200i.f236312a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C55361pn pnVar = (C55361pn) it.next();
                    C62940bt r6 = C62942bv.checkIsLite(C55355ph.f145853f);
                    pnVar.mo58887l(r6);
                    if (pnVar.f169962ag.mo58857o(r6.f169971d)) {
                        C62940bt r62 = C62942bv.checkIsLite(C55355ph.f145853f);
                        pnVar.mo58887l(r62);
                        Object l = pnVar.f169962ag.mo58854l(r62.f169971d);
                        if (l == null) {
                            obj = r62.f169969b;
                        } else {
                            obj = r62.mo58889c(l);
                        }
                        C55355ph phVar2 = (C55355ph) obj;
                        C62940bt r7 = C62942bv.checkIsLite(C55353pf.f145847e);
                        phVar2.mo58887l(r7);
                        if (phVar2.f169962ag.mo58857o(r7.f169971d)) {
                            C62940bt r63 = C62942bv.checkIsLite(C55355ph.f145853f);
                            pnVar.mo58887l(r63);
                            Object l2 = pnVar.f169962ag.mo58854l(r63.f169971d);
                            if (l2 == null) {
                                obj2 = r63.f169969b;
                            } else {
                                obj2 = r63.mo58889c(l2);
                            }
                            C55355ph phVar3 = (C55355ph) obj2;
                            C62940bt r64 = C62942bv.checkIsLite(C55353pf.f145847e);
                            phVar3.mo58887l(r64);
                            Object l3 = phVar3.f169962ag.mo58854l(r64.f169971d);
                            if (l3 == null) {
                                obj3 = r64.f169969b;
                            } else {
                                obj3 = r64.mo58889c(l3);
                            }
                            C55353pf pfVar = (C55353pf) obj3;
                            if (phVar3.f145856b.equals(phVar.f145856b)) {
                                C62940bt btVar = C55355ph.f145853f;
                                C55354pg pgVar = (C55354pg) phVar.toBuilder();
                                pgVar.mo58885m(C55353pf.f145847e, pfVar);
                                pmVar.mo58885m(btVar, (C55355ph) pgVar.build());
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            modularActionMatchingProviderInfo.f236270h.f236312a.set(i, (C55361pn) pmVar.build());
        }
        providerArgument.f236200i = modularActionMatchingProviderInfo.f236270h;
        mo81225ae();
    }

    /* renamed from: r */
    public final boolean mo81079r() {
        return true;
    }

    /* renamed from: u */
    public final boolean mo81082u() {
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.f236100f);
        parcel.writeParcelable(this.f236102h, i);
        C87487i.m142004h(this.f236103i, parcel);
        ProtoLiteParcelable.m147140k(this.f236104j, parcel);
        ProtoLiteParcelable.m147140k(this.f236105k, parcel);
        ProtoLiteParcelable.m147140k(this.f236112s, parcel);
        ProtoLiteParcelable.m147140k(this.f236106l, parcel);
        ProtoLiteParcelable.m147140k(this.f236109o, parcel);
        parcel.writeInt(this.f236107m.f146230cP);
        parcel.writeInt(this.f236108n);
        parcel.writeInt(this.f236111q ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ModularAction(com.google.p4152bb.p4153a.C55265lz r15, java.util.List r16, com.google.p4152bb.p4153a.C55421x r17, boolean r18, com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a r19) {
        /*
            r14 = this;
            r0 = r15
            com.google.protobuf.cq r2 = r0.f145560c
            com.google.bb.a.nl r1 = r0.f145562e
            if (r1 != 0) goto L_0x0009
            com.google.bb.a.nl r1 = com.google.p4152bb.p4153a.C55305nl.f145689r
        L_0x0009:
            r3 = r1
            int r1 = r0.f145558a
            r1 = r1 & 8
            r4 = 0
            if (r1 == 0) goto L_0x0019
            com.google.bb.a.jq r1 = r0.f145564g
            if (r1 != 0) goto L_0x0017
            com.google.bb.a.jq r1 = com.google.p4152bb.p4153a.C55202jq.f145289f
        L_0x0017:
            r5 = r1
            goto L_0x001a
        L_0x0019:
            r5 = r4
        L_0x001a:
            int r1 = r0.f145558a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x002d
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument
            com.google.bb.a.ka r6 = r0.f145563f
            if (r6 != 0) goto L_0x0028
            com.google.bb.a.ka r6 = com.google.p4152bb.p4153a.C55213ka.f145356g
        L_0x0028:
            r1.<init>((com.google.p4152bb.p4153a.C55213ka) r6)
            r6 = r1
            goto L_0x002e
        L_0x002d:
            r6 = r4
        L_0x002e:
            com.google.bb.a.im r1 = r0.f145566i
            if (r1 != 0) goto L_0x0034
            com.google.bb.a.im r1 = com.google.p4152bb.p4153a.C55171im.f145242b
        L_0x0034:
            r7 = r1
            int r10 = r0.f145565h
            int r1 = r0.f145558a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0045
            com.google.bb.a.lc r1 = r0.f145568k
            if (r1 != 0) goto L_0x0043
            com.google.bb.a.lc r1 = com.google.p4152bb.p4153a.C55242lc.f145462c
        L_0x0043:
            r11 = r1
            goto L_0x0046
        L_0x0045:
            r11 = r4
        L_0x0046:
            r8 = 0
            r1 = r14
            r4 = r5
            r5 = r16
            r9 = r17
            r12 = r18
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r0 = r0.f145558a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x005b
            return
        L_0x005b:
            com.google.android.apps.gsa.search.shared.actions.modular.b r0 = r14.mo81210Q()
            java.lang.String r1 = "No ve_ui_type."
            r0.mo81398b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.ModularAction.<init>(com.google.bb.a.lz, java.util.List, com.google.bb.a.x, boolean, com.google.android.apps.gsa.shared.s.a.a):void");
    }

    private ModularAction(List list, C55305nl nlVar, C55202jq jqVar, List list2, ProviderArgument providerArgument, C55171im imVar, C55282mp mpVar, C55421x xVar, int i, C55242lc lcVar, boolean z, C90476a aVar) {
        ArrayList b = C58597ky.m90211b(list2);
        this.f236100f = b;
        SparseArray an = m141605an(b, providerArgument);
        this.f236101g = an;
        this.f236114u = aVar;
        if (providerArgument == null) {
            providerArgument = new ProviderArgument(mo81207N());
            an.append(providerArgument.f236140a, providerArgument);
        }
        this.f236102h = providerArgument;
        if (list.isEmpty()) {
            mo81210Q().mo81398b("No user intent.");
            list = C58485gu.m89846n(C55305nl.f145689r);
        }
        C55372py pyVar = (C55372py) C55373pz.f145913d.createBuilder();
        if (list.size() == 1) {
            C55368pu puVar = (C55368pu) C55371px.f145907d.createBuilder();
            puVar.copyOnWrite();
            C55371px pxVar = (C55371px) puVar.instance;
            pxVar.f145909a = 1 | pxVar.f145909a;
            pxVar.f145910b = 0;
            C55370pw pwVar = C55370pw.USER_SELECTED;
            puVar.copyOnWrite();
            C55371px pxVar2 = (C55371px) puVar.instance;
            pxVar2.f145911c = pwVar.f145906f;
            pxVar2.f145909a |= 4;
            pyVar.mo54253a(puVar);
        } else {
            int am = m141604am(list);
            if (am != -1) {
                C55368pu puVar2 = (C55368pu) C55371px.f145907d.createBuilder();
                puVar2.copyOnWrite();
                C55371px pxVar3 = (C55371px) puVar2.instance;
                pxVar3.f145909a = 1 | pxVar3.f145909a;
                pxVar3.f145910b = am;
                C55370pw pwVar2 = C55370pw.USER_SELECTED;
                puVar2.copyOnWrite();
                C55371px pxVar4 = (C55371px) puVar2.instance;
                pxVar4.f145911c = pwVar2.f145906f;
                pxVar4.f145909a |= 4;
                pyVar.mo54253a(puVar2);
            }
        }
        this.f236103i = new C87487i(list, (C55373pz) pyVar.build(), (C55373pz) null);
        this.f236104j = nlVar == null ? C55305nl.f145689r : nlVar;
        m141607ap();
        mo81226af();
        this.f236105k = jqVar;
        this.f236112s = imVar;
        this.f236106l = mpVar;
        this.f236107m = xVar;
        this.f236108n = i;
        this.f236111q = z;
        m141606ao();
        this.f236109o = lcVar;
    }
}
