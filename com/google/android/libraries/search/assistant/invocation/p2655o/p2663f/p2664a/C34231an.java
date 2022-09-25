package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34703m;
import com.google.protobuf.C62917ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.an */
/* compiled from: PG */
public final class C34231an {

    /* renamed from: a */
    public final Map f91082a;

    public C34231an(Set set) {
        C69664n.m101061g(set, "bindings");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C34703m mVar = (C34703m) it.next();
            arrayList.add(new C69685i(mVar.f92120a, mVar));
        }
        this.f91082a = C69505av.m100874p(arrayList);
    }

    /* renamed from: a */
    public final C62917ay mo39277a(C34043bf bfVar) {
        C69664n.m101061g(bfVar, "id");
        C34703m mVar = (C34703m) this.f91082a.get(bfVar);
        if (mVar != null) {
            return mVar.f92121b;
        }
        return null;
    }
}
