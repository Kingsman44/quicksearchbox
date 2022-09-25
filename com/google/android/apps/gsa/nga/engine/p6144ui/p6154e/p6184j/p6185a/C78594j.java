package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import android.graphics.Bitmap;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.lens.sdk.avs.data.C24871f;
import com.google.android.libraries.lens.sdk.avs.data.C24875j;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24880o;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.j */
/* compiled from: PG */
public final /* synthetic */ class C78594j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78583aa f216393a;

    public /* synthetic */ C78594j(C78583aa aaVar) {
        this.f216393a = aaVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C78583aa aaVar = this.f216393a;
        C24876k kVar = new C24876k();
        C24875j jVar = new C24875j();
        C24871f fVar = new C24871f();
        fVar.mo30077c((Bitmap) obj);
        jVar.mo30086b(fVar);
        C24880o oVar = new C24880o();
        oVar.f67961a.putString("foreground_app_package_name", aaVar.mo73547c());
        jVar.f67958a.putBundle("screen_context", oVar.f67961a);
        kVar.mo30090d(jVar);
        return kVar;
    }
}
