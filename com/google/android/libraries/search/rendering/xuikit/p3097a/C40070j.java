package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.j */
/* compiled from: PG */
final class C40070j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C40073m f105284a;

    public C40070j(C40073m mVar) {
        this.f105284a = mVar;
    }

    public final void run() {
        ResourcePreloader preloader = ((ResourceLoader) this.f105284a.f105288b.mo17428b()).getPreloader();
        C69664n.m101058d(preloader);
        Status loadAll = preloader.loadAll();
        if (C40069i.f105283a[loadAll.getCode().ordinal()] != 1) {
            C59052c cVar = (C59052c) C40073m.f105287a.mo56226d();
            cVar.mo56379ah(new C59094n(53291));
            cVar.mo56389s("loadAll() failed: %s", loadAll);
        }
    }
}
