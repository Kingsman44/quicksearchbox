package com.google.android.libraries.p579ar.faceviewer.p587b;

import androidx.camera.core.C1506cj;
import androidx.camera.core.C1551ea;
import androidx.camera.core.p069a.p070a.C1285p;
import androidx.camera.lifecycle.C1578b;
import androidx.camera.lifecycle.C1584h;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.ar.faceviewer.b.f */
/* compiled from: PG */
final class C10641f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C10642g f35531a;

    public C10641f(C10642g gVar) {
        this.f35531a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C10642g.f35532a.mo56225c()).mo56382g(th)).mo56372aa(42304)).mo56386p("Stop camera failed.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C1584h hVar = (C1584h) obj;
        C1506cj cjVar = this.f35531a.f35536e;
        if (cjVar != null) {
            C1285p.m3462a();
            LifecycleCameraRepository lifecycleCameraRepository = hVar.f4334e;
            List asList = Arrays.asList(new C1551ea[]{cjVar});
            synchronized (lifecycleCameraRepository.f4315a) {
                for (C1578b bVar : lifecycleCameraRepository.f4316b.keySet()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f4316b.get(bVar);
                    boolean z = !lifecycleCamera.mo4455b().isEmpty();
                    synchronized (lifecycleCamera.f4310a) {
                        ArrayList arrayList = new ArrayList(asList);
                        arrayList.retainAll(lifecycleCamera.f4312c.mo4338a());
                        lifecycleCamera.f4312c.mo4342e(arrayList);
                    }
                    if (z) {
                        if (lifecycleCamera.mo4455b().isEmpty()) {
                            lifecycleCameraRepository.mo4464c(lifecycleCamera.mo4454a());
                        }
                    }
                }
            }
            this.f35531a.f35536e = null;
        }
    }
}
