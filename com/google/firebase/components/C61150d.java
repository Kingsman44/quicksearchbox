package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.d */
/* compiled from: PG */
public final class C61150d {

    /* renamed from: a */
    public int f165472a;

    /* renamed from: b */
    private final Set f165473b;

    /* renamed from: c */
    private final Set f165474c = new HashSet();

    /* renamed from: d */
    private int f165475d;

    /* renamed from: e */
    private C61155i f165476e;

    /* renamed from: f */
    private Set f165477f;

    @SafeVarargs
    public C61150d(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.f165473b = hashSet;
        this.f165475d = 0;
        this.f165472a = 0;
        this.f165477f = new HashSet();
        hashSet.add(cls);
        for (Class b : clsArr) {
            C61145ae.m93503b(b, "Null interface");
        }
        Collections.addAll(this.f165473b, clsArr);
    }

    /* renamed from: a */
    public final C61151e mo57715a() {
        C61145ae.m93502a(this.f165476e != null, "Missing required property: factory.");
        return new C61151e(new HashSet(this.f165473b), new HashSet(this.f165474c), this.f165475d, this.f165472a, this.f165476e, this.f165477f);
    }

    /* renamed from: b */
    public final void mo57716b(C61166t tVar) {
        if (!this.f165473b.contains(tVar.f165505a)) {
            this.f165474c.add(tVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    /* renamed from: c */
    public final void mo57717c(C61155i iVar) {
        C61145ae.m93503b(iVar, "Null factory");
        this.f165476e = iVar;
    }

    /* renamed from: d */
    public final void mo57718d(int i) {
        C61145ae.m93502a(this.f165475d == 0, "Instantiation type has already been set.");
        this.f165475d = i;
    }
}
