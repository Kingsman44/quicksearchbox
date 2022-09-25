package androidx.p116i.p117a.p118a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69495al;
import p5462h.p5463a.C69498ao;

/* renamed from: androidx.i.a.a.d */
/* compiled from: PG */
public final class C2283d {

    /* renamed from: a */
    public static final C2283d f6441a = new C2283d(C69498ao.f185920a);

    /* renamed from: b */
    public final Set f6442b;

    /* renamed from: c */
    public final Map f6443c;

    public C2283d(Set set) {
        this.f6442b = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C69495al alVar = C69495al.f185917a;
        while (alVar.hasNext()) {
            Map.Entry entry = (Map.Entry) alVar.next();
            linkedHashMap.put((Class) entry.getKey(), (Set) entry.getValue());
        }
        this.f6443c = linkedHashMap;
    }
}
