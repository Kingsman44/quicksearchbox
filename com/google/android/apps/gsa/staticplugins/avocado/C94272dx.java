package com.google.android.apps.gsa.staticplugins.avocado;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dx */
/* compiled from: PG */
final class C94272dx {

    /* renamed from: a */
    public final CameraCharacteristics f263443a;

    public C94272dx(CameraCharacteristics cameraCharacteristics) {
        this.f263443a = cameraCharacteristics;
    }

    /* renamed from: a */
    public final Size[] mo88424a(Class cls) {
        return ((StreamConfigurationMap) this.f263443a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(cls);
    }
}
