package androidx.appsearch.p047a;

import androidx.p060c.C0977g;
import androidx.p060c.C0979i;
import androidx.p060c.C0984n;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.appsearch.a.af */
/* compiled from: PG */
public final class C0833af {

    /* renamed from: a */
    public final Set f2801a;

    /* renamed from: b */
    public final Set f2802b;

    /* renamed from: c */
    public final Map f2803c;

    /* renamed from: d */
    public final Map f2804d;

    /* renamed from: e */
    public final Map f2805e;

    /* renamed from: f */
    public final boolean f2806f;

    /* renamed from: g */
    public final int f2807g = 1;

    public C0833af(Set set, Set set2, Map map, Map map2, Map map3, boolean z) {
        set.getClass();
        this.f2801a = set;
        set2.getClass();
        this.f2802b = set2;
        map.getClass();
        this.f2803c = map;
        map2.getClass();
        this.f2804d = map2;
        map3.getClass();
        this.f2805e = map3;
        this.f2806f = z;
    }

    /* renamed from: a */
    public static C0977g m2687a(Map map) {
        C0977g gVar = new C0977g(((C0984n) map).f3122d);
        for (Map.Entry entry : map.entrySet()) {
            C0979i iVar = new C0979i(0);
            for (Set iVar2 : (Set) entry.getValue()) {
                iVar.add(new C0979i((Collection) iVar2));
            }
            gVar.put((String) entry.getKey(), iVar);
        }
        return gVar;
    }
}
