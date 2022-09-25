package com.google.android.apps.gsa.search.shared.contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.w */
/* compiled from: PG */
public abstract class C87535w {
    /* renamed from: d */
    public static List m142172d(Set set) {
        ArrayList arrayList = new ArrayList();
        if (set.isEmpty()) {
            arrayList.add(new C87522j());
            return arrayList;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C87515c cVar = (C87515c) it.next();
            if (cVar != null) {
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    arrayList.add(new C87525m());
                } else if (ordinal == 1) {
                    arrayList.add(new C87533u());
                } else if (ordinal == 2) {
                    arrayList.add(new C87534v());
                } else if (ordinal == 3) {
                    arrayList.add(new C87526n());
                } else if (ordinal != 4) {
                    arrayList.add(new C87522j());
                } else {
                    arrayList.add(new C87523k());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public abstract Person mo81630a(Person person, Person person2);
}
