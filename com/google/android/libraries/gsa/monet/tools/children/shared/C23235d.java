package com.google.android.libraries.gsa.monet.tools.children.shared;

import android.support.p033v7.p040e.C0422d;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.shared.d */
/* compiled from: PG */
final class C23235d extends C0422d {

    /* renamed from: a */
    private final List f63683a;

    /* renamed from: b */
    private final List f63684b;

    public C23235d(List list, List list2) {
        this.f63683a = list;
        this.f63684b = list2;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f63683a.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f63684b.size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        return ((ChildData) this.f63684b.get(i)).equals(this.f63683a.get(i2));
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        return ((ChildData) this.f63684b.get(i)).equals(this.f63683a.get(i2));
    }
}
