package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62947c;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66432l;
import com.google.speech.p5195a.p5196a.C66433m;
import com.google.speech.p5195a.p5196a.C66434n;
import com.google.speech.p5195a.p5196a.C66435o;
import com.google.speech.p5195a.p5196a.C66436p;
import com.google.speech.p5195a.p5196a.C66437q;
import com.google.speech.p5195a.p5196a.C66442v;
import com.google.speech.p5195a.p5196a.C66443w;
import com.google.speech.p5195a.p5196a.C66444x;
import com.google.speech.p5195a.p5196a.C66445y;
import com.google.speech.p5195a.p5196a.C66446z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.z.e.a.c.c */
/* compiled from: PG */
public final class C118983c {

    /* renamed from: a */
    public static final C59071e f331803a = C59071e.m91332i("com.google.android.apps.gsa.z.e.a.c.c");

    /* renamed from: a */
    public static C66446z m197534a(String str, String str2, String str3) {
        C66432l lVar = (C66432l) C66435o.f180640d.createBuilder();
        C66433m mVar = (C66433m) C66434n.f180635d.createBuilder();
        mVar.copyOnWrite();
        C66434n nVar = (C66434n) mVar.instance;
        nVar.f180637a |= 2;
        nVar.f180639c = str2;
        mVar.copyOnWrite();
        C66434n nVar2 = (C66434n) mVar.instance;
        nVar2.f180637a |= 1;
        nVar2.f180638b = str3;
        lVar.copyOnWrite();
        C66435o oVar = (C66435o) lVar.instance;
        C66434n nVar3 = (C66434n) mVar.build();
        nVar3.getClass();
        oVar.f180644c = nVar3;
        oVar.f180642a |= 2;
        C66436p pVar = (C66436p) C66437q.f180645b.createBuilder();
        pVar.mo59628b((C66435o) lVar.build());
        C66437q qVar = (C66437q) pVar.build();
        C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
        cVar.copyOnWrite();
        C66446z zVar = (C66446z) cVar.instance;
        zVar.f180665a |= 2;
        zVar.f180667c = str;
        cVar.copyOnWrite();
        C66446z zVar2 = (C66446z) cVar.instance;
        zVar2.f180666b = 3;
        zVar2.f180665a |= 1;
        cVar.copyOnWrite();
        C66446z zVar3 = (C66446z) cVar.instance;
        qVar.getClass();
        zVar3.f180671g = qVar;
        zVar3.f180665a |= 128;
        return (C66446z) cVar.build();
    }

    /* renamed from: b */
    public static C66446z m197535b(String str) {
        return m197534a("offline_dialog_state", str, "monastery");
    }

    /* renamed from: c */
    public static C66446z m197536c(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                C66442v vVar = (C66442v) C66443w.f180655d.createBuilder();
                String str = (String) entry.getKey();
                vVar.copyOnWrite();
                C66443w wVar = (C66443w) vVar.instance;
                str.getClass();
                wVar.f180657a |= 1;
                wVar.f180658b = str;
                float floatValue = ((Float) entry.getValue()).floatValue();
                vVar.copyOnWrite();
                C66443w wVar2 = (C66443w) vVar.instance;
                wVar2.f180657a = 2 | wVar2.f180657a;
                wVar2.f180659c = floatValue;
                arrayList.add((C66443w) vVar.build());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
        cVar.copyOnWrite();
        C66446z zVar = (C66446z) cVar.instance;
        zVar.f180665a |= 2;
        zVar.f180667c = "offline_contacts";
        cVar.copyOnWrite();
        C66446z zVar2 = (C66446z) cVar.instance;
        zVar2.f180666b = 2;
        zVar2.f180665a |= 1;
        C66444x xVar = (C66444x) C66445y.f180660b.createBuilder();
        xVar.copyOnWrite();
        C66445y yVar = (C66445y) xVar.instance;
        yVar.mo59631a();
        C62947c.addAll((Iterable) arrayList, (List) yVar.f180662a);
        cVar.copyOnWrite();
        C66446z zVar3 = (C66446z) cVar.instance;
        C66445y yVar2 = (C66445y) xVar.build();
        yVar2.getClass();
        zVar3.f180670f = yVar2;
        zVar3.f180665a |= 64;
        return (C66446z) cVar.build();
    }

    /* renamed from: d */
    public static List m197537d(C87456t tVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (tVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return arrayList;
        }
        PersonDisambiguation b = tVar.mo81156b();
        if (b == null || b.mo81541i()) {
            C58976aa aaVar2 = C58975e.f156826a;
            arrayList.add(m197535b("GenericAction-Prompted-ContactName"));
        } else if (b.mo81545n() || b.f236395k.mo81601c()) {
            C58976aa aaVar3 = C58975e.f156826a;
            List<Person> list = b.f236363b;
            ArrayList arrayList2 = new ArrayList();
            for (Person person : list) {
                if (person.mo81527j() && (str = person.f236373d) != null) {
                    arrayList2.add(str);
                }
            }
            C66446z c = m197536c(m197538e(arrayList2));
            if (c != null) {
                arrayList.add(c);
            }
            arrayList.add(m197535b("contact-disambig-static"));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static Map m197538e(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C58976aa aaVar = C58975e.f156826a;
            String[] split = str.split(" ");
            int length = split.length;
            if (length > 1) {
                String str2 = split[0];
                Float valueOf = Float.valueOf(1.0f);
                linkedHashMap.put(str2, valueOf);
                int i = length - 1;
                linkedHashMap.put(split[i], valueOf);
                String str3 = split[0];
                String str4 = split[i];
            }
            linkedHashMap.put(str, Float.valueOf(1.0f));
        }
        return linkedHashMap;
    }
}
