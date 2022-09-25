package com.google.p4583d.p4584a.p4586b;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4587c.C60971b;
import com.google.p4583d.p4584a.p4587c.C60972c;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60984k;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.d.a.b.b */
/* compiled from: PG */
public final class C60956b extends C60980g {

    /* renamed from: a */
    private final C60972c f165074a;

    public C60956b(C60972c cVar) {
        super("internal.eventLogger");
        this.f165074a = cVar;
    }

    /* renamed from: a */
    public final C60987n mo57451a(C61012g gVar, List list) {
        Map map;
        C61013h.m93265g(this.f165107d, 3, list);
        String i = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0)).mo57475i();
        long a = (long) C61013h.m93259a(gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)).mo57473h().doubleValue());
        C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2));
        if (a2 instanceof C60984k) {
            map = C61013h.m93264f((C60984k) a2);
        } else {
            map = new HashMap();
        }
        this.f165074a.f165096c.add(new C60971b(i, a, map));
        return C60987n.f165114f;
    }
}
