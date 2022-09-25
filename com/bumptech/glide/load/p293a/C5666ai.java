package com.bumptech.glide.load.p293a;

import com.bumptech.glide.p287f.C5594k;
import com.bumptech.glide.p291h.C5622i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.ai */
/* compiled from: PG */
final class C5666ai implements Iterable {

    /* renamed from: a */
    public final List f17074a;

    public C5666ai() {
        this.f17074a = new ArrayList(2);
    }

    public C5666ai(List list) {
        this.f17074a = list;
    }

    /* renamed from: b */
    public static C5665ah m14704b(C5594k kVar) {
        return new C5665ah(kVar, C5622i.f16960b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12144a() {
        return this.f17074a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C5666ai mo12145c() {
        return new C5666ai(new ArrayList(this.f17074a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo12146d(C5594k kVar) {
        return this.f17074a.contains(m14704b(kVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo12147e() {
        return this.f17074a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f17074a.iterator();
    }
}
