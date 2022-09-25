package com.google.android.libraries.p1649b.p1651b;

import android.util.Log;
import com.google.android.libraries.p1649b.p1650a.C19607d;
import com.google.android.libraries.p1649b.p1650a.C19609f;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4816ai.p4817a.C63188b;

/* renamed from: com.google.android.libraries.b.b.j */
/* compiled from: PG */
final class C19620j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C19609f f54597a;

    /* renamed from: b */
    final /* synthetic */ boolean f54598b;

    /* renamed from: c */
    final /* synthetic */ C19607d f54599c;

    /* renamed from: d */
    final /* synthetic */ C63188b f54600d;

    public C19620j(C19609f fVar, boolean z, C19607d dVar, C63188b bVar) {
        this.f54597a = fVar;
        this.f54598b = z;
        this.f54599c = dVar;
        this.f54600d = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e(C19621k.f54601a, "Event mutator failure: ", th);
        C19621k.m37455b(this.f54600d, this.f54597a, this.f54598b, this.f54599c);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C19621k.m37455b((C63188b) obj, this.f54597a, this.f54598b, this.f54599c);
    }
}
