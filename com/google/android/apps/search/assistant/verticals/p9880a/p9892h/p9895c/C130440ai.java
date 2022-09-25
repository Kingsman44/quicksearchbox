package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.ai */
/* compiled from: PG */
final class C130440ai {
    /* renamed from: a */
    public static Optional m212874a(C58148f fVar, String str) {
        return m212875b(fVar, str).filter(C130436ae.f357398a).findFirst().map(C130437af.f357399a);
    }

    /* renamed from: b */
    public static Stream m212875b(C58148f fVar, String str) {
        if (fVar == null) {
            return Stream.CC.m71936of((T[]) new C58146d[0]);
        }
        return Collection.EL.stream(fVar.f155457d).filter(new C130438ag(str));
    }
}
