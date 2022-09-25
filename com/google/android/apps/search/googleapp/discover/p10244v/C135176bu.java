package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134538ac;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10214s.C134564bb;
import com.google.android.apps.search.googleapp.discover.p10214s.C134573bk;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.bu */
/* compiled from: PG */
public final class C135176bu {
    /* renamed from: a */
    public static final C135177bv m219240a(List list) {
        int i;
        C69664n.m101061g(list, "dataOperations");
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            C134573bk bkVar = ((C134538ac) listIterator.previous()).f366379b;
            if (bkVar == null) {
                bkVar = C134573bk.f366497h;
            }
            C134564bb a = C134564bb.m218286a(bkVar.f366500b);
            if (a == null) {
                a = C134564bb.UNKNOWN;
            }
            if (a == C134564bb.CLEAR_ALL) {
                i = listIterator.nextIndex();
                break;
            }
        }
        List<C134538ac> subList = list.subList(i + 1, list.size());
        ArrayList arrayList = new ArrayList(C69540x.m100804k(subList, 10));
        for (C134538ac acVar : subList) {
            C134573bk bkVar2 = acVar.f366379b;
            if (bkVar2 == null) {
                bkVar2 = C134573bk.f366497h;
            }
            arrayList.add(bkVar2);
        }
        ArrayList<C134538ac> arrayList2 = new ArrayList<>();
        for (Object next : subList) {
            if ((((C134538ac) next).f366378a & 2) != 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C69540x.m100804k(arrayList2, 10));
        for (C134538ac acVar2 : arrayList2) {
            C134560ay ayVar = acVar2.f366380c;
            if (ayVar == null) {
                ayVar = C134560ay.f366453g;
            }
            arrayList3.add(ayVar);
        }
        return new C135177bv(arrayList, arrayList3);
    }
}
