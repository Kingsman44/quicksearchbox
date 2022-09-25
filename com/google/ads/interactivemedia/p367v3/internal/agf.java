package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agf */
/* compiled from: PG */
public final class agf {

    /* renamed from: a */
    private ahr f20617a = ahr.f20662a;

    /* renamed from: b */
    private final afx f20618b = afw.IDENTITY;

    /* renamed from: c */
    private final Map f20619c = new HashMap();

    /* renamed from: d */
    private final List f20620d = new ArrayList();

    /* renamed from: e */
    private final List f20621e = new ArrayList();

    /* renamed from: f */
    private final int f20622f = 2;

    /* renamed from: g */
    private final int f20623g = 2;

    /* renamed from: h */
    private final boolean f20624h = true;

    /* renamed from: i */
    private final int f20625i = agr.f20631a;

    /* renamed from: a */
    public final age mo14713a() {
        ArrayList arrayList = new ArrayList(this.f20620d.size() + this.f20621e.size() + 3);
        arrayList.addAll(this.f20620d);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f20621e);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        return new age(this.f20617a, this.f20618b, this.f20619c, true, this.f20625i, arrayList);
    }

    /* renamed from: b */
    public final void mo14714b(Type type, Object obj) {
        boolean z = obj instanceof agp;
        boolean z2 = true;
        if (!z && !(obj instanceof agi) && !(obj instanceof agg) && !(obj instanceof agt)) {
            z2 = false;
        }
        C6731ax.m18029e(z2);
        if (obj instanceof agg) {
            this.f20619c.put(type, (agg) obj);
        }
        if (z || (obj instanceof agi)) {
            this.f20620d.add(aji.m18838a(akz.m18867c(type), obj));
        }
        if (obj instanceof agt) {
            this.f20620d.add(aku.m18855a(akz.m18867c(type), (agt) obj));
        }
    }

    /* renamed from: c */
    public final void mo14715c(agu agu) {
        this.f20620d.add(agu);
    }

    /* renamed from: d */
    public final void mo14716d(apz apz) {
        this.f20617a = this.f20617a.mo14775e(apz);
    }
}
