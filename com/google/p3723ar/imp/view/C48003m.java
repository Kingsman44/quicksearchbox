package com.google.p3723ar.imp.view;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.lens.view.render.C27664f;
import com.google.android.libraries.lens.view.render.C27666h;
import com.google.android.libraries.lens.view.render.LensRenderer;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.ar.imp.view.m */
/* compiled from: PG */
public final class C48003m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C47985ae f124233a;

    /* renamed from: b */
    final /* synthetic */ C48004n f124234b;

    /* renamed from: c */
    final /* synthetic */ C47993i f124235c;

    /* renamed from: d */
    final /* synthetic */ View f124236d;

    /* renamed from: e */
    final /* synthetic */ C27664f f124237e;

    public C48003m(C47985ae aeVar, C48004n nVar, C47993i iVar, View view, C27664f fVar) {
        this.f124233a = aeVar;
        this.f124234b = nVar;
        this.f124235c = iVar;
        this.f124236d = view;
        this.f124237e = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.w(C48004n.f124238a, "Failed to create ImpViewController.", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        View view = (View) obj;
        View.nSetup(view.f124179a, this.f124233a.f124193d);
        C48004n nVar = this.f124234b;
        C47993i iVar = this.f124235c;
        View view2 = this.f124236d;
        C47985ae aeVar = this.f124233a;
        nVar.f124239b = new C47981aa(iVar, view2, aeVar.f124192c, view, aeVar.f124195f);
        C27664f fVar = this.f124237e;
        C48004n nVar2 = this.f124234b;
        C27666h hVar = fVar.f75526a;
        if (hVar.f75532c == null) {
            hVar.f75532c = new LensRenderer(nVar2.mo53115a());
        }
        LensRenderer lensRenderer = hVar.f75532c;
        lensRenderer.nSetDynamicResolutionOptions(lensRenderer.f75522b, true, 0.5f, 0.25f);
        hVar.f75530a = nVar2;
    }
}
