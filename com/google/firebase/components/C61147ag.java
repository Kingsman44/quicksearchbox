package com.google.firebase.components;

import com.google.firebase.p4609b.C61124b;
import com.google.firebase.p4611d.C61174a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.ag */
/* compiled from: PG */
final class C61147ag extends C61140a {

    /* renamed from: a */
    private final Set f165466a;

    /* renamed from: b */
    private final Set f165467b;

    /* renamed from: c */
    private final Set f165468c;

    /* renamed from: d */
    private final C61152f f165469d;

    public C61147ag(C61151e eVar, C61152f fVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C61166t tVar : eVar.f165479b) {
            if (tVar.mo57727d()) {
                if (tVar.mo57728e()) {
                    hashSet4.add(tVar.f165505a);
                } else {
                    hashSet.add(tVar.f165505a);
                }
            } else if (tVar.mo57728e()) {
                hashSet5.add(tVar.f165505a);
            } else {
                hashSet2.add(tVar.f165505a);
            }
        }
        if (!eVar.f165482e.isEmpty()) {
            hashSet.add(C61124b.class);
        }
        this.f165466a = Collections.unmodifiableSet(hashSet);
        this.f165467b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f165468c = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        Set set = eVar.f165482e;
        this.f165469d = fVar;
    }

    /* renamed from: a */
    public final Object mo57710a(Class cls) {
        if (this.f165466a.contains(cls)) {
            Object a = this.f165469d.mo57710a(cls);
            if (!cls.equals(C61124b.class)) {
                return a;
            }
            C61124b bVar = (C61124b) a;
            return new C61146af();
        }
        throw new C61168v(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public final Set mo57711b(Class cls) {
        if (this.f165468c.contains(cls)) {
            return (Set) ((C61140a) this.f165469d).mo57714d(cls).mo57687a();
        }
        throw new C61168v(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public final C61174a mo57713c(Class cls) {
        if (this.f165467b.contains(cls)) {
            return this.f165469d.mo57713c(cls);
        }
        throw new C61168v(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public final C61174a mo57714d(Class cls) {
        throw null;
    }
}
