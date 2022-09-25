package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.n */
/* compiled from: PG */
public final class C10613n {

    /* renamed from: a */
    private static final C59071e f35475a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.e.n");

    /* renamed from: a */
    public static Optional m25587a(Context context, Integer num) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String cameraCharacteristics : Arrays.asList(cameraManager.getCameraIdList())) {
                CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(cameraCharacteristics);
                if (num.equals(cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING))) {
                    return Optional.m71637of(cameraCharacteristics2);
                }
            }
        } catch (CameraAccessException e) {
            ((C59052c) ((C59052c) ((C59052c) f35475a.mo56225c()).mo56382g(e)).mo56372aa(42290)).mo56386p("Accessing camera ID info got error.");
        }
        return Optional.empty();
    }
}
