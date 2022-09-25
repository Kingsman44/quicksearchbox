package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26736ae;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26758j;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26778ac;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C26666d implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C26679q f72707a;

    public /* synthetic */ C26666d(C26679q qVar) {
        this.f72707a = qVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C26736ae aeVar;
        C26679q qVar = this.f72707a;
        if (qVar.f72752z == 4 && (aeVar = qVar.f72740n) != null && surfaceTexture == aeVar) {
            C26758j jVar = new C26758j();
            jVar.f72909a = C58833ax.m90834k(Boolean.valueOf(qVar.f72745s));
            jVar.mo32046b(qVar.f72746t);
            C26778ac acVar = qVar.f72750x;
            if (acVar != null) {
                acVar.mo32145a(jVar);
            } else {
                qVar.f72743q = jVar;
            }
        }
    }
}
