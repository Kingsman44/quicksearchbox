package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26744am;
import com.google.android.libraries.lens.view.p2161r.C27658e;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.h */
/* compiled from: PG */
public final /* synthetic */ class C26689h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26701t f72766a;

    /* renamed from: b */
    public final /* synthetic */ C27658e f72767b;

    public /* synthetic */ C26689h(C26701t tVar, C27658e eVar) {
        this.f72766a = tVar;
        this.f72767b = eVar;
    }

    public final void run() {
        C26701t tVar = this.f72766a;
        C27658e eVar = this.f72767b;
        int i = tVar.f72781A;
        String a = C26744am.m49455a(i);
        if (i != 0) {
            eVar.mo33148e("requestedState", a);
            eVar.mo33148e("firstFrameCaptured", Boolean.toString(tVar.f72802o));
            boolean z = true;
            eVar.mo33148e("hasActiveCamera", Boolean.toString(tVar.f72795h != null));
            eVar.mo33148e("hasCameraCaptureSession", Boolean.toString(tVar.f72797j != null));
            if (tVar.f72794g == null) {
                z = false;
            }
            eVar.mo33148e("hasActiveCameraCharacteristics", Boolean.toString(z));
            eVar.mo33146c(tVar.f72792e);
            return;
        }
        throw null;
    }
}
