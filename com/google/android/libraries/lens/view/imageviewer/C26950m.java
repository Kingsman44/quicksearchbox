package com.google.android.libraries.lens.view.imageviewer;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.m */
/* compiled from: PG */
public final /* synthetic */ class C26950m implements C43721h {

    /* renamed from: a */
    public static final /* synthetic */ C26950m f73459a = new C26950m();

    private /* synthetic */ C26950m() {
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        ((C58970a) ((C58970a) ImageViewerRequestObserver.f73428a.mo56224b()).mo56372aa(49498)).mo56389s("isImageResUri(): %s", lVar.f113296b);
        return C26956s.m49938a(Uri.parse(lVar.f113296b));
    }
}
