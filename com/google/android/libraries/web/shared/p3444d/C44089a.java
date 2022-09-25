package com.google.android.libraries.web.shared.p3444d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.libraries.web.shared.d.a */
/* compiled from: PG */
public final class C44089a {

    /* renamed from: a */
    private final Map f114771a;

    public C44089a(Map map) {
        this.f114771a = map;
    }

    /* renamed from: a */
    public final Object mo47061a(Set set, Class cls) {
        C69664n.m101061g(set, "keys");
        if (set.size() <= 1) {
            Class cls2 = (Class) C69734n.m101137e(C69540x.m100847ac(set));
            if (cls2 != null) {
                return mo47062b(cls2);
            }
            return null;
        }
        String simpleName = cls.getSimpleName();
        String ag = C69540x.m100851ag(set, ", ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
        throw new IllegalStateException(simpleName + " only allows maximum 1 callback to be registered, however multiple were found: " + ag);
    }

    /* renamed from: b */
    public final Object mo47062b(Class cls) {
        C69664n.m101061g(cls, "key");
        String name = cls.getName();
        C69664n.m101060f(name, "key.name");
        C69664n.m101061g(name, "key");
        Object obj = this.f114771a.get(name);
        if (obj != null) {
            Object b = ((C69464a) obj).mo17428b();
            C69664n.m101060f(b, "checkNotNull(keyToCallba…le.\"\n      }\n      .get()");
            return b;
        }
        throw new IllegalStateException("No callback found for key " + name + ". Make sure " + name + " is annotated with @WebConfigInjectable.");
    }

    /* renamed from: c */
    public final Set mo47063c(Set set) {
        C69664n.m101061g(set, "keys");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(mo47062b((Class) it.next()));
        }
        return C69540x.m100846ab(arrayList);
    }
}
