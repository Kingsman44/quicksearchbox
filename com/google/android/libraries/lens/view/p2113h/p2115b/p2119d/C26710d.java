package com.google.android.libraries.lens.view.p2113h.p2115b.p2119d;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26758j;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26778ac;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.h.b.d.d */
/* compiled from: PG */
public final /* synthetic */ class C26710d implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C26715i f72823a;

    public /* synthetic */ C26710d(C26715i iVar) {
        this.f72823a = iVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C26715i iVar = this.f72823a;
        if (iVar.f72843n == 1 && iVar.f72832c.get() && iVar.f72842m != null && iVar.f72836g != null) {
            Long l = iVar.f72839j;
            if (l == null) {
                ((C58970a) ((C58970a) C26715i.f72830a.mo56224b()).mo56372aa(49131)).mo56386p("onFrameAvailable with no onVideoFrameAboutToBeRendered");
                return;
            }
            long nanos = TimeUnit.MICROSECONDS.toNanos(iVar.f72840k - l.longValue());
            C26778ac acVar = iVar.f72842m;
            acVar.getClass();
            C26758j jVar = new C26758j();
            jVar.f72912d = C58833ax.m90834k(Long.valueOf(nanos));
            jVar.f72913e = C58833ax.m90833j(iVar.f72835f.f72829c);
            acVar.mo32145a(jVar);
        }
    }
}
