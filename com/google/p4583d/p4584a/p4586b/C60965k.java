package com.google.p4583d.p4584a.p4586b;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4587c.C60970a;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60984k;
import com.google.p4583d.p4584a.p4588d.C60986m;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.d.a.b.k */
/* compiled from: PG */
public final class C60965k extends C60980g {

    /* renamed from: a */
    private final C60970a f165082a;

    public C60965k(C60970a aVar) {
        super("internal.registerCallback");
        this.f165082a = aVar;
    }

    /* renamed from: a */
    public final C60987n mo57451a(C61012g gVar, List list) {
        TreeMap treeMap;
        C61013h.m93265g(this.f165107d, 3, list);
        gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57475i();
        C60987n a = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
        if (a instanceof C60986m) {
            C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2));
            if (a2 instanceof C60984k) {
                C60984k kVar = (C60984k) a2;
                if (kVar.mo57486s("type")) {
                    String i = kVar.mo57471f("type").mo57475i();
                    int b = kVar.mo57486s("priority") ? C61013h.m93260b(kVar.mo57471f("priority").mo57473h().doubleValue()) : 1000;
                    C60970a aVar = this.f165082a;
                    C60986m mVar = (C60986m) a;
                    if ("create".equals(i)) {
                        treeMap = aVar.f165090b;
                    } else if ("edit".equals(i)) {
                        treeMap = aVar.f165089a;
                    } else {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(i)));
                    }
                    if (treeMap.containsKey(Integer.valueOf(b))) {
                        b = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(b), mVar);
                    return C60987n.f165114f;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
