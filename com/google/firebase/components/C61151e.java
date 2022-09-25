package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.firebase.components.e */
/* compiled from: PG */
public final class C61151e {

    /* renamed from: a */
    public final Set f165478a;

    /* renamed from: b */
    public final Set f165479b;

    /* renamed from: c */
    public final int f165480c;

    /* renamed from: d */
    public final C61155i f165481d;

    /* renamed from: e */
    public final Set f165482e;

    /* renamed from: f */
    private final int f165483f;

    public C61151e(Set set, Set set2, int i, int i2, C61155i iVar, Set set3) {
        this.f165478a = Collections.unmodifiableSet(set);
        this.f165479b = Collections.unmodifiableSet(set2);
        this.f165480c = i;
        this.f165483f = i2;
        this.f165481d = iVar;
        this.f165482e = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static C61150d m93514a(Class cls) {
        return new C61150d(cls, new Class[0]);
    }

    /* renamed from: b */
    public static C61151e m93515b(Object obj, Class cls) {
        C61150d a = m93514a(cls);
        a.f165472a = 1;
        a.mo57717c(new C61149c(obj));
        return a.mo57715a();
    }

    @SafeVarargs
    /* renamed from: c */
    public static C61151e m93516c(Object obj, Class cls, Class... clsArr) {
        C61150d dVar = new C61150d(cls, clsArr);
        dVar.mo57717c(new C61148b(obj));
        return dVar.mo57715a();
    }

    /* renamed from: d */
    public final boolean mo57719d() {
        return this.f165483f == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f165478a.toArray()) + ">{" + this.f165480c + ", type=" + this.f165483f + ", deps=" + Arrays.toString(this.f165479b.toArray()) + "}";
    }
}
