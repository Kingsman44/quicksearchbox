package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8587h;

import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.slice.widget.C4134al;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.h.f */
/* compiled from: PG */
public final /* synthetic */ class C113494f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C113495g f314235a;

    /* renamed from: b */
    public final /* synthetic */ Uri f314236b;

    public /* synthetic */ C113494f(C113495g gVar, Uri uri) {
        this.f314235a = gVar;
        this.f314236b = uri;
    }

    public final void run() {
        C113495g gVar = this.f314235a;
        Uri uri = this.f314236b;
        if (gVar.f314239c.isEmpty() && gVar.f314243g.get() == -1) {
            gVar.f314243g.set(gVar.f314242f.mo26870b());
        }
        LiveData a = C4134al.m11866a(gVar.f314237a, uri);
        gVar.f314245i.put(uri, a);
        a.mo5704e(gVar.f314238b, gVar);
    }
}
