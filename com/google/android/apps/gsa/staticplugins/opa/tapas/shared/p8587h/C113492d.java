package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8587h;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.d */
/* compiled from: PG */
public final /* synthetic */ class C113492d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C113495g f314231a;

    /* renamed from: b */
    public final /* synthetic */ Uri f314232b;

    public /* synthetic */ C113492d(C113495g gVar, Uri uri) {
        this.f314231a = gVar;
        this.f314232b = uri;
    }

    public final void run() {
        C113495g gVar = this.f314231a;
        Uri uri = this.f314232b;
        LiveData liveData = (LiveData) gVar.f314245i.get(uri);
        if (liveData != null) {
            liveData.mo5679j(gVar);
            gVar.f314245i.remove(uri);
        }
    }
}
