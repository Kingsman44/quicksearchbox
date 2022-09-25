package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.shared.f.a.ag */
/* compiled from: PG */
public final class C89730ag {
    /* renamed from: a */
    public static Optional m146122a(C58148f fVar, String str) {
        return m146123b(fVar, str).filter(C89761u.f242954a).findFirst().map(C89765y.f242958a);
    }

    /* renamed from: b */
    public static Stream m146123b(C58148f fVar, String str) {
        if (fVar == null) {
            return Stream.CC.m71936of((T[]) new C58146d[0]);
        }
        return Collection.EL.stream(fVar.f155457d).filter(new C89725ab(str));
    }
}
