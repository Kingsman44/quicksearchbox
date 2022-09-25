package com.bumptech.glide.load.p293a.p294a;

import java.util.List;

/* renamed from: com.bumptech.glide.load.a.a.g */
/* compiled from: PG */
final class C5645g {

    /* renamed from: a */
    final Object f17012a;

    /* renamed from: b */
    public List f17013b;

    /* renamed from: c */
    C5645g f17014c;

    /* renamed from: d */
    C5645g f17015d;

    C5645g() {
        this((Object) null);
    }

    public C5645g(Object obj) {
        this.f17015d = this;
        this.f17014c = this;
        this.f17012a = obj;
    }

    /* renamed from: a */
    public final int mo12118a() {
        List list = this.f17013b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: b */
    public final Object mo12119b() {
        int a = mo12118a();
        if (a > 0) {
            return this.f17013b.remove(a - 1);
        }
        return null;
    }
}
