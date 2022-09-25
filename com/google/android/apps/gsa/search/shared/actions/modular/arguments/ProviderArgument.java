package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.search.shared.actions.util.C87487i;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55215kc;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55267ma;
import com.google.p4152bb.p4153a.C55268mb;
import com.google.p4152bb.p4153a.C55301nh;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55352pe;
import com.google.p4152bb.p4153a.C55353pf;
import com.google.p4152bb.p4153a.C55355ph;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55368pu;
import com.google.p4152bb.p4153a.C55370pw;
import com.google.p4152bb.p4153a.C55371px;
import com.google.p4152bb.p4153a.C55372py;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class ProviderArgument extends Argument implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87458v();

    /* renamed from: i */
    public C87487i f236200i;

    public ProviderArgument(int i) {
        super(i, C54944ab.PROVIDER);
        this.f236200i = null;
    }

    /* renamed from: N */
    private static boolean m141820N(C55361pn pnVar, C55240la laVar, PersonArgument personArgument) {
        if (personArgument.mo81263C() && !((PersonDisambiguation) personArgument.f236203n).mo81607C() && ((PersonDisambiguation) personArgument.f236203n).f236411n != null) {
            C87515c a = C87437ae.m141905a(laVar, personArgument.f236140a);
            if (((PersonDisambiguation) personArgument.f236203n).mo81543l()) {
                Parcelable parcelable = ((PersonDisambiguation) personArgument.f236203n).f236412o;
                parcelable.getClass();
                return m141821O((Contact) parcelable, a, pnVar);
            }
            for (Contact O : ((PersonDisambiguation) personArgument.f236203n).f236411n) {
                if (m141821O(O, a, pnVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: O */
    private static boolean m141821O(Contact contact, C87515c cVar, C55361pn pnVar) {
        Object obj;
        if (contact.f236350a != cVar) {
            return false;
        }
        if (cVar != C87515c.APP_SPECIFIC_ENDPOINT_ID) {
            return true;
        }
        C62940bt r4 = C62942bv.checkIsLite(C55355ph.f145853f);
        pnVar.mo58887l(r4);
        if (pnVar.f169962ag.mo58857o(r4.f169971d)) {
            String str = contact.f236356g;
            C62940bt r42 = C62942bv.checkIsLite(C55355ph.f145853f);
            pnVar.mo58887l(r42);
            Object l = pnVar.f169962ag.mo58854l(r42.f169971d);
            if (l == null) {
                obj = r42.f169969b;
            } else {
                obj = r42.mo58889c(l);
            }
            if (TextUtils.equals(str, ((C55355ph) obj).f145856b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static Map m141822h(C55213ka kaVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C55268mb.f145571e);
        kaVar.mo58887l(r0);
        if (!kaVar.f169962ag.mo58857o(r0.f169971d)) {
            return new HashMap();
        }
        C62940bt r02 = C62942bv.checkIsLite(C55268mb.f145571e);
        kaVar.mo58887l(r02);
        Object l = kaVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        return m141823i(((C55268mb) obj).f145574b);
    }

    /* renamed from: i */
    public static Map m141823i(List list) {
        Object obj;
        Object obj2;
        Object obj3;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55361pn pnVar = (C55361pn) it.next();
            C62940bt r2 = C62942bv.checkIsLite(C55355ph.f145853f);
            pnVar.mo58887l(r2);
            if (pnVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r22 = C62942bv.checkIsLite(C55355ph.f145853f);
                pnVar.mo58887l(r22);
                Object l = pnVar.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                if ((((C55355ph) obj).f145855a & 1) != 0) {
                    C62940bt r23 = C62942bv.checkIsLite(C55355ph.f145853f);
                    pnVar.mo58887l(r23);
                    Object l2 = pnVar.f169962ag.mo58854l(r23.f169971d);
                    if (l2 == null) {
                        obj2 = r23.f169969b;
                    } else {
                        obj2 = r23.mo58889c(l2);
                    }
                    C55355ph phVar = (C55355ph) obj2;
                    C62940bt r24 = C62942bv.checkIsLite(C55353pf.f145847e);
                    phVar.mo58887l(r24);
                    if (phVar.f169962ag.mo58857o(r24.f169971d)) {
                        C62940bt r25 = C62942bv.checkIsLite(C55353pf.f145847e);
                        phVar.mo58887l(r25);
                        Object l3 = phVar.f169962ag.mo58854l(r25.f169971d);
                        if (l3 == null) {
                            obj3 = r25.f169969b;
                        } else {
                            obj3 = r25.mo58889c(l3);
                        }
                        C55352pe peVar = (C55352pe) ((C55353pf) obj3).toBuilder();
                        C55353pf pfVar = (C55353pf) peVar.instance;
                        if ((pfVar.f145849a & 1) != 0) {
                            if (pfVar.f145851c.isEmpty()) {
                                String str = phVar.f145856b;
                                peVar.copyOnWrite();
                                C55353pf pfVar2 = (C55353pf) peVar.instance;
                                str.getClass();
                                pfVar2.f145849a |= 2;
                                pfVar2.f145851c = str;
                            }
                            hashMap.put(phVar.f145856b, (C55353pf) peVar.build());
                        }
                    }
                }
            }
        }
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: C */
    public final boolean mo81263C() {
        C87487i iVar = this.f236200i;
        return iVar != null && !iVar.f236312a.isEmpty();
    }

    /* renamed from: I */
    public final List mo81269I(C55215kc kcVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C55301nh.f145684c);
        kcVar.mo58887l(r0);
        Object l = kcVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C62971cq cqVar = ((C55301nh) obj).f145686a;
        if (cqVar.isEmpty()) {
            return null;
        }
        if (mo81260hB() || !mo81263C()) {
            return C87431e.m141673d(cqVar, mo81320a().f236363b.size());
        }
        return null;
    }

    /* renamed from: a */
    public final Disambiguation mo81320a() {
        ModularAction modularAction = this.f236144e;
        boolean z = false;
        if (modularAction != null && !this.f236200i.mo81484i()) {
            Iterator it = this.f236144e.f236103i.f236312a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i += ((C55305nl) it.next()).f145692b.size();
                if (i > 1) {
                    List<C55361pn> g = mo81323g();
                    if (modularAction.mo81212S() != null) {
                        g = m141819M(g);
                    }
                    if (!g.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (C55361pn protoLiteParcelable : g) {
                            arrayList.add(new ProtoLiteParcelable((MessageLite) protoLiteParcelable));
                        }
                        return new Disambiguation(BuildConfig.FLAVOR, arrayList, false, true);
                    }
                }
            }
        }
        C87487i iVar = this.f236200i;
        if (iVar.mo81477a(C55370pw.USER_SELECTED) != -1) {
            z = true;
        }
        List<MessageLite> list = iVar.f236312a;
        ArrayList d = C58597ky.m90213d(list.size());
        for (MessageLite protoLiteParcelable2 : list) {
            d.add(new ProtoLiteParcelable(protoLiteParcelable2));
        }
        Disambiguation disambiguation = new Disambiguation(BuildConfig.FLAVOR, d, z, true);
        MessageLite d2 = iVar.mo81480d();
        if (d2 != null) {
            disambiguation.mo81535d(new ProtoLiteParcelable(d2), z);
        }
        return disambiguation;
    }

    /* renamed from: b */
    public final C55361pn mo81321b() {
        C87487i iVar = this.f236200i;
        if (iVar == null) {
            return null;
        }
        return (C55361pn) iVar.mo81480d();
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        if (mo81263C()) {
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            if (a == C55133hb.APP_NAME) {
                return C87431e.m141670a(m141819M(this.f236200i.f236312a), hcVar, new C87457u(), (C58817ah) null);
            }
        }
        return C87429c.f236122a;
    }

    /* renamed from: d */
    public final List mo81322d() {
        C87487i iVar = this.f236200i;
        if (iVar == null) {
            return null;
        }
        return iVar.f236312a;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        if (!mo81263C() || this.f236200i.mo81484i() || mo81320a().f236363b.size() == 1) {
            return false;
        }
        ModularAction modularAction = this.f236144e;
        if (modularAction == null || modularAction.mo81212S() == null) {
            return true;
        }
        List<C55361pn> d = mo81322d();
        if (d == null) {
            return false;
        }
        PersonArgument S = modularAction.mo81212S();
        for (C55361pn pnVar : d) {
            if (m141820N(pnVar, modularAction.mo81217X(pnVar.f145870c), S)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new ProviderArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55372py pyVar;
        C55267ma maVar = (C55267ma) C55268mb.f145570d.createBuilder();
        C87487i iVar = this.f236200i;
        List list = iVar != null ? iVar.f236312a : null;
        if (list != null && !list.isEmpty()) {
            maVar.copyOnWrite();
            C55268mb mbVar = (C55268mb) maVar.instance;
            C62971cq cqVar = mbVar.f145574b;
            if (!cqVar.mo58948c()) {
                mbVar.f145574b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) mbVar.f145574b);
            ArrayList arrayList = new ArrayList(list);
            arrayList.removeAll(m141819M(list));
            C87487i iVar2 = this.f236200i;
            ArrayList<MessageLite> arrayList2 = new ArrayList<>(arrayList);
            C55373pz pzVar = iVar2.f236313b;
            iVar2.f236314c = pzVar;
            if (pzVar == null) {
                pyVar = (C55372py) C55373pz.f145913d.createBuilder();
            } else {
                pyVar = (C55372py) pzVar.toBuilder();
            }
            HashSet hashSet = new HashSet();
            pyVar.copyOnWrite();
            ((C55373pz) pyVar.instance).f145917c = C55373pz.emptyProtobufList();
            for (MessageLite indexOf : arrayList2) {
                int indexOf2 = iVar2.f236312a.indexOf(indexOf);
                hashSet.add(Integer.valueOf(indexOf2));
                C55368pu puVar = (C55368pu) C55371px.f145907d.createBuilder();
                puVar.copyOnWrite();
                C55371px pxVar = (C55371px) puVar.instance;
                pxVar.f145909a |= 1;
                pxVar.f145910b = indexOf2;
                pyVar.copyOnWrite();
                C55373pz pzVar2 = (C55373pz) pyVar.instance;
                C55371px pxVar2 = (C55371px) puVar.build();
                pxVar2.getClass();
                C62971cq cqVar2 = pzVar2.f145917c;
                if (!cqVar2.mo58948c()) {
                    pzVar2.f145917c = C62942bv.mutableCopy(cqVar2);
                }
                pzVar2.f145917c.add(pxVar2);
            }
            pyVar.copyOnWrite();
            ((C55373pz) pyVar.instance).f145916b = C55373pz.emptyProtobufList();
            C55373pz pzVar3 = iVar2.f236313b;
            if (pzVar3 != null) {
                for (C55371px pxVar3 : pzVar3.f145916b) {
                    if (!hashSet.contains(Integer.valueOf(pxVar3.f145910b))) {
                        pyVar.mo54254b(pxVar3);
                    }
                }
            }
            iVar2.f236313b = (C55373pz) pyVar.build();
            C55373pz pzVar4 = this.f236200i.f236313b;
            if (pzVar4 != null) {
                maVar.copyOnWrite();
                C55268mb mbVar2 = (C55268mb) maVar.instance;
                mbVar2.f145575c = pzVar4;
                mbVar2.f145573a |= 1;
            }
        }
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55268mb.f145571e, (C55268mb) maVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81361h(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    public ProviderArgument(ProviderArgument providerArgument, int i) {
        super((Argument) providerArgument, i);
        C87487i iVar = providerArgument.f236200i;
        this.f236200i = iVar != null ? iVar.clone() : null;
    }

    /* renamed from: M */
    private final List m141819M(List list) {
        PersonArgument personArgument;
        ModularAction modularAction = this.f236144e;
        if (modularAction == null) {
            personArgument = null;
        } else {
            personArgument = modularAction.mo81212S();
        }
        ArrayList arrayList = new ArrayList();
        if (personArgument != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C55361pn pnVar = (C55361pn) it.next();
                if (m141820N(pnVar, modularAction.mo81217X(pnVar.f145870c), personArgument)) {
                    arrayList.add(pnVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f236200i.f236312a);
        }
        return arrayList;
    }

    public ProviderArgument(C55213ka kaVar) {
        super(kaVar);
        Object obj;
        C55373pz pzVar;
        C62940bt r0 = C62942bv.checkIsLite(C55268mb.f145571e);
        kaVar.mo58887l(r0);
        Object l = kaVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C55268mb mbVar = (C55268mb) obj;
        mbVar.getClass();
        if (mbVar.f145574b.size() == 0) {
            this.f236200i = null;
            return;
        }
        C62971cq cqVar = mbVar.f145574b;
        if ((mbVar.f145573a & 1) != 0) {
            pzVar = mbVar.f145575c;
            if (pzVar == null) {
                pzVar = C55373pz.f145913d;
            }
        } else {
            pzVar = null;
        }
        this.f236200i = new C87487i(cqVar, pzVar, (C55373pz) null);
    }

    /* renamed from: g */
    public final List mo81323g() {
        ArrayList<C55361pn> arrayList;
        C87487i iVar = this.f236200i;
        iVar.getClass();
        if (iVar.f236313b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (C55371px pxVar : iVar.f236313b.f145916b) {
                int i = pxVar.f145910b;
                if (i >= 0) {
                    arrayList2.add((MessageLite) iVar.f236312a.get(i));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (C55305nl nlVar : this.f236144e.f236103i.f236312a) {
                for (C55240la laVar : nlVar.f145692b) {
                    for (C55361pn pnVar : mo81322d()) {
                        if (!hashSet.contains(pnVar) && pnVar.f145870c == laVar.f145452b) {
                            arrayList3.add(pnVar);
                            hashSet.add(pnVar);
                        }
                    }
                }
            }
            return arrayList3;
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (C55361pn pnVar2 : arrayList) {
            arrayList4.add(pnVar2);
            hashSet2.add(pnVar2);
        }
        for (C55361pn pnVar3 : mo81322d()) {
            if (!hashSet2.contains(pnVar3)) {
                arrayList4.add(pnVar3);
                hashSet2.add(pnVar3);
            }
        }
        return arrayList4;
    }
}
