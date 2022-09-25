package com.google.android.libraries.search.assistant.p2570h.p2578b.p2581c;

import com.google.android.libraries.search.assistant.p2570h.p2578b.p2583e.C33471a;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2583e.C33472b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.h.b.c.a */
/* compiled from: PG */
public final class C33468a {

    /* renamed from: a */
    public final String f89575a;

    /* renamed from: b */
    private final List f89576b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C33468a(String str) {
        this(str, C69496am.f185918a);
        C69664n.m101061g(str, "label");
    }

    public C33468a(String str, List list) {
        C69664n.m101061g(str, "label");
        C69664n.m101061g(list, "children");
        this.f89575a = str;
        this.f89576b = list;
    }

    /* renamed from: a */
    public final C33472b mo38871a() {
        ArrayList arrayList = new ArrayList();
        for (C33468a a : this.f89576b) {
            arrayList.add(a.mo38871a());
        }
        C33471a aVar = (C33471a) C33472b.f89580c.createBuilder();
        String str = this.f89575a;
        aVar.copyOnWrite();
        str.getClass();
        ((C33472b) aVar.instance).f89582a = str;
        aVar.copyOnWrite();
        C33472b bVar = (C33472b) aVar.instance;
        C62971cq cqVar = bVar.f89583b;
        if (!cqVar.mo58948c()) {
            bVar.f89583b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) bVar.f89583b);
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newBuilder().setLabel(la…dledChildrenList).build()");
        return (C33472b) build;
    }

    /* renamed from: b */
    public final String mo38872b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.concat(String.valueOf(this.f89575a)));
        sb.append(10);
        for (C33468a b : this.f89576b) {
            sb.append(b.mo38872b("  ".concat(str)));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final boolean mo38873c() {
        for (C33468a c : this.f89576b) {
            if (c.mo38873c()) {
                return true;
            }
        }
        return false;
    }
}
