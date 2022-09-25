package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.common.p4522b.C58528ij;
import java.util.Collections;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.s */
/* compiled from: PG */
abstract class C10053s {
    /* renamed from: a */
    public abstract int mo18168a();

    /* renamed from: b */
    public abstract int mo18169b();

    /* renamed from: c */
    public abstract int mo18170c();

    /* renamed from: d */
    public abstract C58528ij mo18171d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo18208e(C10026c cVar) {
        return Collection.EL.stream(mo18171d()).anyMatch(new C10052r(cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo18209f(C58528ij ijVar) {
        return !Collections.disjoint(ijVar, mo18171d());
    }
}
