package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import com.google.android.apps.gsa.staticplugins.p7611bv.C97300w;
import com.google.android.libraries.p10923ac.p10971e.p10972a.C147333c;
import com.google.protobuf.C62917ay;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.p */
/* compiled from: PG */
final class C147290p {

    /* renamed from: a */
    public final C147333c f397555a;

    /* renamed from: b */
    private WeakReference f397556b;

    public C147290p(Executor executor) {
        this.f397555a = new C147333c(executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C147294t mo124081a(C97300w wVar, C62917ay ayVar) {
        C147294t tVar;
        WeakReference weakReference = this.f397556b;
        if (weakReference != null && (tVar = (C147294t) weakReference.get()) != null) {
            return tVar;
        }
        C147294t tVar2 = new C147294t(wVar, ayVar);
        this.f397556b = new WeakReference(tVar2);
        return tVar2;
    }
}
