package com.google.android.apps.gsa.staticplugins.avocado;

import android.view.SurfaceHolder;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dv */
/* compiled from: PG */
final class C94270dv implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ Camera2SourcePreview f263441a;

    public C94270dv(Camera2SourcePreview camera2SourcePreview) {
        this.f263441a = camera2SourcePreview;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C58976aa aaVar = C58975e.f156826a;
        Camera2SourcePreview camera2SourcePreview = this.f263441a;
        C94336w wVar = camera2SourcePreview.f263021c;
        if (wVar != null && !camera2SourcePreview.f263020b) {
            C59071e eVar = C94170an.f263048b;
            wVar.f263614a.f263051C = surfaceHolder.getSurface();
            wVar.f263614a.mo88366j(i2, i3);
        }
        this.f263441a.f263020b = true;
        C59104x b = Camera2SourcePreview.f263019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Preview2");
        ((C59052c) ((C59052c) b).mo56372aa(14391)).mo56389s("#surfaceChanged %b", Boolean.valueOf(this.f263441a.f263020b));
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C59104x b = Camera2SourcePreview.f263019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Preview2");
        ((C59052c) ((C59052c) b).mo56372aa(14392)).mo56389s("#surfaceCreated  %b", Boolean.valueOf(this.f263441a.f263020b));
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C59104x b = Camera2SourcePreview.f263019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Preview2");
        ((C59052c) ((C59052c) b).mo56372aa(14393)).mo56389s("#surfaceDestroyed  %b", Boolean.valueOf(this.f263441a.f263020b));
        this.f263441a.f263020b = false;
    }
}
