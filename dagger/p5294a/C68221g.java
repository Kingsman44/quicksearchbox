package dagger.p5294a;

import dagger.C68214a;

/* renamed from: dagger.a.g */
/* compiled from: PG */
public final class C68221g implements C68220f, C68214a {

    /* renamed from: b */
    private static final C68221g f184582b = new C68221g((Object) null);

    /* renamed from: a */
    public final Object f184583a;

    private C68221g(Object obj) {
        this.f184583a = obj;
    }

    /* renamed from: a */
    public static C68220f m98521a(Object obj) {
        C68225k.m98530b(obj, "instance cannot be null");
        return new C68221g(obj);
    }

    /* renamed from: c */
    public static C68220f m98522c(Object obj) {
        return obj == null ? f184582b : new C68221g(obj);
    }

    /* renamed from: b */
    public final Object mo17428b() {
        return this.f184583a;
    }
}
