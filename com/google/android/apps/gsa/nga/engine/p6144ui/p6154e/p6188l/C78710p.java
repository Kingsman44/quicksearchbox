package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.function.LongFunction;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.p */
/* compiled from: PG */
final class C78710p {

    /* renamed from: a */
    public final Map f216646a = new HashMap();

    /* renamed from: b */
    public final C91142g f216647b;

    /* renamed from: c */
    public final C22871g f216648c;

    public C78710p(C91142g gVar, C22871g gVar2) {
        this.f216647b = gVar;
        this.f216648c = gVar2;
    }

    /* renamed from: d */
    private final C83358h m126424d(int i, Supplier supplier) {
        Map map = this.f216646a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            C83361k kVar = new C83361k(supplier.get(), C78263m.class);
            this.f216646a.put(valueOf, new C78706l(this, kVar, supplier, i));
            return kVar;
        }
        throw new IllegalStateException(String.format("Attempting to register multiple observers for flag: %s", new Object[]{valueOf}));
    }

    /* renamed from: a */
    public final C83358h mo73585a(C90048d dVar) {
        return m126424d(dVar.f248757a, new C78709o(this, dVar));
    }

    /* renamed from: b */
    public final C83358h mo73586b(C90102f fVar, LongFunction longFunction) {
        return m126424d(fVar.f250556a, new C78708n(this, longFunction, fVar));
    }

    /* renamed from: c */
    public final C83358h mo73587c(C90129h hVar) {
        return m126424d(hVar.f251802a, new C78707m(this, hVar));
    }
}
