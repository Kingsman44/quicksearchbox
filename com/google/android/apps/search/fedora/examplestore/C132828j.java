package com.google.android.apps.search.fedora.examplestore;

import com.google.android.apps.search.fedora.p10093b.C132721b;
import com.google.android.gms.learning.internal.C144771c;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19406j;

/* renamed from: com.google.android.apps.search.fedora.examplestore.j */
/* compiled from: PG */
public final /* synthetic */ class C132828j implements C132721b {

    /* renamed from: a */
    public final /* synthetic */ C144771c f362425a;

    public /* synthetic */ C132828j(C144771c cVar) {
        this.f362425a = cVar;
    }

    /* renamed from: a */
    public final void mo110893a(Object obj) {
        C144771c cVar = this.f362425a;
        C19406j jVar = (C19406j) obj;
        byte[] bArr = jVar == null ? null : (byte[]) jVar.mo24600a().orElse(null);
        if (bArr == null || bArr.length == 0) {
            cVar.mo120203b((byte[]) null, (byte[]) null);
            return;
        }
        ((Boolean) jVar.mo24601b().orElse(false)).booleanValue();
        cVar.mo120203b(bArr, (byte[]) jVar.mo24602c().orElse(null));
    }
}
