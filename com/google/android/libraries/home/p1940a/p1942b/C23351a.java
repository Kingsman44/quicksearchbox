package com.google.android.libraries.home.p1940a.p1942b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.home.p1940a.p1943c.C23526d;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62988dg;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63061fz;
import com.google.protobuf.C63063ga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.b.a */
/* compiled from: PG */
public final class C23351a {
    /* renamed from: b */
    public static final Map m43787b(C63037fb fbVar) {
        C69664n.m101061g(fbVar, "<this>");
        Map unmodifiableMap = Collections.unmodifiableMap(fbVar.f170146a);
        C69664n.m101060f(unmodifiableMap, "fieldsMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(unmodifiableMap.size()));
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            C63063ga gaVar = (C63063ga) entry.getValue();
            C69664n.m101060f(gaVar, "value");
            linkedHashMap.put(key, m43786a(gaVar));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final C23526d m43786a(C63063ga gaVar) {
        C63037fb fbVar;
        C62988dg dgVar;
        C69664n.m101061g(gaVar, "<this>");
        int i = gaVar.f170181a;
        int b = C63061fz.m96003b(i);
        int i2 = b - 1;
        ArrayList arrayList = null;
        if (b != 0) {
            if (i2 == 1) {
                arrayList = Double.valueOf(i == 2 ? ((Double) gaVar.f170182b).doubleValue() : C59203do.f157270a);
            } else if (i2 == 2) {
                arrayList = i == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
            } else if (i2 == 3) {
                arrayList = Boolean.valueOf(i == 4 ? ((Boolean) gaVar.f170182b).booleanValue() : false);
            } else if (i2 == 4) {
                if (i == 5) {
                    fbVar = (C63037fb) gaVar.f170182b;
                } else {
                    fbVar = C63037fb.f170144b;
                }
                C69664n.m101060f(fbVar, "structValue");
                arrayList = m43787b(fbVar);
            } else if (i2 == 5) {
                if (i == 6) {
                    dgVar = (C62988dg) gaVar.f170182b;
                } else {
                    dgVar = C62988dg.f170043b;
                }
                C62971cq<C63063ga> cqVar = dgVar.f170045a;
                C69664n.m101060f(cqVar, "listValue.valuesList");
                ArrayList arrayList2 = new ArrayList(C69540x.m100804k(cqVar, 10));
                for (C63063ga a : cqVar) {
                    arrayList2.add(m43786a(a));
                }
                arrayList = arrayList2;
            }
            return new C23526d(arrayList);
        }
        throw null;
    }
}
