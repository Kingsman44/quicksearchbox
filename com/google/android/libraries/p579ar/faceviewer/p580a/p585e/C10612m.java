package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.m */
/* compiled from: PG */
public final /* synthetic */ class C10612m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10612m f35474a = new C10612m();

    private /* synthetic */ C10612m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C58485gu.m89844l(((StreamConfigurationMap) ((CameraCharacteristics) obj).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
