package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26681b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.o */
/* compiled from: PG */
final class C26696o implements C26681b {

    /* renamed from: a */
    final /* synthetic */ C26701t f72776a;

    public C26696o(C26701t tVar) {
        this.f72776a = tVar;
    }

    /* renamed from: a */
    public final void mo31969a() {
        C59071e eVar = C26701t.f72779a;
        C26701t tVar = this.f72776a;
        if (tVar.f72795h == null) {
            try {
                CameraCharacteristics b = tVar.f72793f.mo32138b();
                b.getClass();
                tVar.f72794g = b;
                String e = this.f72776a.f72793f.mo32141e();
                C26701t tVar2 = this.f72776a;
                ((CameraManager) this.f72776a.f72793f.f72949b.mo6453a()).openCamera(e, tVar2.f72810w, tVar2.f72790c);
            } catch (CameraAccessException e2) {
                ((C59052c) ((C59052c) ((C59052c) C26701t.f72779a.mo56226d()).mo56382g(e2)).mo56372aa(49084)).mo56386p("Failed to open the camera due to CameraAccessException.");
                this.f72776a.mo32009g(e2);
            } catch (RuntimeException e3) {
                ((C59052c) ((C59052c) ((C59052c) C26701t.f72779a.mo56226d()).mo56382g(e3)).mo56372aa(49085)).mo56386p("Failed to init the camera due to unexpected RuntimeException.");
                this.f72776a.mo32009g(e3);
            }
        } else {
            ((C59052c) ((C59052c) C26701t.f72779a.mo56226d()).mo56372aa(49086)).mo56386p("Camera is already open.");
        }
    }
}
