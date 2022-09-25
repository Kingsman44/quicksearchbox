package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1232a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16064a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.C16189a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16328ab;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16331ae;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16334ah;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16374j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.a.f */
/* compiled from: PG */
public final class C16195f implements C16189a {

    /* renamed from: a */
    private static final C59071e f47756a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.f.a.a.f");

    /* renamed from: b */
    private C16374j f47757b = C16374j.f48198h;

    /* renamed from: c */
    private final C21370a f47758c;

    public C16195f(C21370a aVar) {
        this.f47758c = aVar;
    }

    /* renamed from: b */
    private static long m33231b(List list, C13256b bVar) {
        return Collection.EL.stream(list).filter(new C16191b(bVar)).count();
    }

    /* renamed from: c */
    private final C16170n m33232c(C16170n nVar, String str, String str2, String str3, C13256b bVar) {
        String str4;
        C16331ae aeVar = (C16331ae) nVar.mo22747b().toBuilder();
        aeVar.copyOnWrite();
        C16333ag agVar = (C16333ag) aeVar.instance;
        str3.getClass();
        agVar.f48076a |= 2;
        agVar.f48078c = str3;
        boolean containsKey = Collections.unmodifiableMap(Collections.unmodifiableMap(agVar.f48081f)).containsKey("PHONE_NUMBER");
        String str5 = BuildConfig.FLAVOR;
        if (!containsKey || bVar == null) {
            str4 = str5;
        } else {
            str4 = bVar.f40931c;
            str4.getClass();
            aeVar.copyOnWrite();
            C16333ag agVar2 = (C16333ag) aeVar.instance;
            C62995dn dnVar = agVar2.f48081f;
            if (!dnVar.f170058b) {
                agVar2.f48081f = dnVar.mo58980a();
            }
            agVar2.f48081f.put("PHONE_NUMBER", str4);
        }
        C16330ad adVar = ((C16333ag) aeVar.instance).f48082g;
        if (adVar == null) {
            adVar = C16330ad.f48065f;
        }
        if (adVar.f48068b != 4 || bVar == null || bVar.f40931c.isEmpty()) {
            C16330ad adVar2 = ((C16333ag) aeVar.instance).f48082g;
            if ((adVar2 == null ? C16330ad.f48065f : adVar2).f48068b == 2) {
                if (adVar2 == null) {
                    adVar2 = C16330ad.f48065f;
                }
                String str6 = adVar2.f48068b == 2 ? (String) adVar2.f48069c : str5;
                Object[] objArr = new Object[1];
                if (true == str4.isEmpty()) {
                    str4 = str;
                }
                objArr[0] = str4;
                String format = String.format(str6, objArr);
                C16328ab abVar = (C16328ab) C16330ad.f48065f.createBuilder();
                abVar.copyOnWrite();
                C16330ad adVar3 = (C16330ad) abVar.instance;
                format.getClass();
                adVar3.f48068b = 2;
                adVar3.f48069c = format;
                C16330ad adVar4 = (C16330ad) abVar.build();
                aeVar.copyOnWrite();
                C16333ag agVar3 = (C16333ag) aeVar.instance;
                adVar4.getClass();
                agVar3.f48082g = adVar4;
                agVar3.f48076a |= 16;
            }
        } else {
            C16330ad adVar5 = ((C16333ag) aeVar.instance).f48082g;
            if (adVar5 == null) {
                adVar5 = C16330ad.f48065f;
            }
            String format2 = String.format(adVar5.f48068b == 4 ? (String) adVar5.f48069c : str5, new Object[]{bVar.f40931c});
            C58976aa aaVar = C58975e.f156826a;
            C16330ad adVar6 = ((C16333ag) aeVar.instance).f48082g;
            if (adVar6 == null) {
                adVar6 = C16330ad.f48065f;
            }
            C16328ab abVar2 = (C16328ab) adVar6.toBuilder();
            abVar2.copyOnWrite();
            C16330ad adVar7 = (C16330ad) abVar2.instance;
            format2.getClass();
            adVar7.f48068b = 4;
            adVar7.f48069c = format2;
            C16330ad adVar8 = (C16330ad) abVar2.build();
            aeVar.copyOnWrite();
            C16333ag agVar4 = (C16333ag) aeVar.instance;
            adVar8.getClass();
            agVar4.f48082g = adVar8;
            agVar4.f48076a |= 16;
        }
        if (bVar != null) {
            str5 = bVar.f40933e;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C16335ai aiVar = ((C16333ag) aeVar.instance).f48084i;
        if (aiVar == null) {
            aiVar = C16335ai.f48090k;
        }
        if ((aiVar.f48092a & 4) != 0) {
            C16335ai aiVar2 = ((C16333ag) aeVar.instance).f48084i;
            if (aiVar2 == null) {
                aiVar2 = C16335ai.f48090k;
            }
            if ("<CONTACT_PHOTO>".equals(aiVar2.f48095d) && !str5.isEmpty()) {
                C16335ai aiVar3 = ((C16333ag) aeVar.instance).f48084i;
                if (aiVar3 == null) {
                    aiVar3 = C16335ai.f48090k;
                }
                C16334ah ahVar = (C16334ah) aiVar3.toBuilder();
                ahVar.copyOnWrite();
                C16335ai aiVar4 = (C16335ai) ahVar.instance;
                str5.getClass();
                aiVar4.f48092a |= 4;
                aiVar4.f48095d = str5;
                aeVar.copyOnWrite();
                C16333ag agVar5 = (C16333ag) aeVar.instance;
                C16335ai aiVar5 = (C16335ai) ahVar.build();
                aiVar5.getClass();
                agVar5.f48084i = aiVar5;
                agVar5.f48076a |= 32;
            }
        }
        C16064a aVar = new C16064a();
        aVar.mo22677c(nVar.mo22752f());
        aVar.f47529b = str2;
        aVar.mo22676b(String.format(nVar.mo22750e(), new Object[]{str}));
        aVar.mo22678d(nVar.mo22753g());
        aVar.mo22680f(nVar.mo22746a());
        aVar.f47530c = Long.valueOf(this.f47758c.mo26870b());
        aVar.mo22679e((C16333ag) aeVar.build());
        return aVar.mo22675a();
    }

    /* renamed from: a */
    public final List mo22848a(List list, C15777d dVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        C58833ax f = dVar.mo22549f();
        if (!f.mo56113h()) {
            C59104x b = f47756a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SuggestionGenerator");
            ((C59052c) ((C59052c) b).mo56372aa(46621)).mo56386p("Comms signal is absent");
            return arrayList;
        }
        String str2 = dVar.mo22547e().f48164d;
        this.f47757b = (C16374j) f.mo56107c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16170n nVar = (C16170n) it.next();
            C58976aa aaVar = C58975e.f156826a;
            nVar.mo22750e();
            C58485gu m = C58485gu.m89845m();
            C16327aa aaVar2 = C16327aa.UNKNOWN_ACTION_TYPE;
            C16327aa a = C16327aa.m33331a(nVar.mo22747b().f48080e);
            if (a == null) {
                a = C16327aa.UNKNOWN_ACTION_TYPE;
            }
            int ordinal = a.ordinal();
            int i = 2;
            if (ordinal == 1) {
                C16374j jVar = this.f47757b;
                C62971cq<C13256b> cqVar = jVar.f48201b;
                C62971cq cqVar2 = jVar.f48202c;
                C62971cq cqVar3 = jVar.f48203d;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (C13256b bVar : cqVar) {
                    String str3 = bVar.f40930b;
                    if (!TextUtils.isEmpty(str3) && !hashSet.contains(str3)) {
                        String str4 = bVar.f40934f;
                        if (!dVar.mo22544b().mo22733g().equals(C16090ap.COOLWALK) || (!str4.isEmpty() && dVar.mo22549f().mo56113h() && Collection.EL.stream(((C16374j) dVar.mo22549f().mo56107c()).f48206g).anyMatch(new C16190a(str4)))) {
                            long b2 = m33231b(cqVar2, bVar);
                            long b3 = m33231b(cqVar3, bVar);
                            if (b2 == 0 && b3 == 0 && (bVar.f40929a & i) != 0) {
                                if (!dVar.mo22544b().mo22733g().equals(C16090ap.COOLWALK) || nVar.mo22749d() == null) {
                                    str = nVar.mo22749d();
                                } else {
                                    String d = nVar.mo22749d();
                                    d.getClass();
                                    str = String.format(d, new Object[]{str3});
                                }
                                String str5 = str3;
                                ArrayList arrayList3 = arrayList2;
                                HashSet hashSet2 = hashSet;
                                arrayList3.add(m33232c(nVar, str5, str, str2, bVar));
                                hashSet2.add(str5);
                                arrayList2 = arrayList3;
                                hashSet = hashSet2;
                                cqVar3 = cqVar3;
                                i = 2;
                            }
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                arrayList4.isEmpty();
                m = C58485gu.m89842j(arrayList4);
            } else if (ordinal != 9) {
                C16327aa a2 = C16327aa.m33331a(nVar.mo22747b().f48080e);
                if (a2 == null) {
                    a2 = C16327aa.UNKNOWN_ACTION_TYPE;
                }
                a2.name();
            } else {
                List list2 = (List) Collection.EL.stream(this.f47757b.f48200a).map(C16192c.f47753a).filter(C16193d.f47754a).collect(Collectors.toCollection(C16194e.f47755a));
                if (list2.isEmpty()) {
                    m = C58485gu.m89845m();
                } else {
                    int size = new HashSet(list2).size();
                    int i2 = size > 1 ? size == 2 ? 1 : 2 : 0;
                    String str6 = (String) list2.get(0);
                    if (nVar.mo22747b().f48083h.size() > i2) {
                        m = C58485gu.m89846n(m33232c(nVar, str6, String.format((String) nVar.mo22747b().f48083h.get(i2), new Object[]{str6, String.valueOf(size - 1)}), str2, (C13256b) null));
                    } else {
                        C59104x d2 = f47756a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "SuggestionGenerator");
                        ((C59052c) ((C59052c) d2).mo56372aa(46616)).mo56386p("subtext index out of range");
                        m = C58485gu.m89846n(m33232c(nVar, str6, (String) null, str2, (C13256b) null));
                    }
                }
            }
            arrayList.addAll(m);
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return arrayList;
    }
}
