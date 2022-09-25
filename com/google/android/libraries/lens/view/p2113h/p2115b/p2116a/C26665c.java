package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Size;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.NetError;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.c */
/* compiled from: PG */
final class C26665c {

    /* renamed from: a */
    public static final Rect f72705a = new Rect(-1000, -1000, 1000, 1000);

    /* renamed from: b */
    private static final C58974d f72706b = C58974d.m91135i("Camera1Util");

    /* renamed from: a */
    public static Camera.Area m49273a(PointF pointF) {
        boolean z = false;
        if (pointF.x >= 0.0f && pointF.x <= 1.0f && pointF.y >= 0.0f && pointF.y <= 1.0f) {
            z = true;
        }
        C58838bb.m90873h(z, "The point at %s is out of the normalized range.", pointF.toString());
        int i = (int) ((pointF.x - 8.0f) * 2000.0f);
        int i2 = (int) ((pointF.y - 8.0f) * 2000.0f);
        return new Camera.Area(new Rect(Math.max(i + NetError.ERR_CERT_COMMON_NAME_INVALID, -1000), Math.max(i2 + NetError.ERR_CERT_COMMON_NAME_INVALID, -1000), Math.min(i + 199, 1000), Math.min(i2 + 199, 1000)), 999);
    }

    /* renamed from: b */
    public static C58833ax m49274b() {
        return C58833ax.m90834k(C58485gu.m89846n(f72705a));
    }

    /* renamed from: c */
    public static C58833ax m49275c(Camera.Area area) {
        return C58833ax.m90834k(C58485gu.m89846n(area.rect));
    }

    /* renamed from: d */
    public static C58485gu m49276d(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        C58480gp e = C58485gu.m89837e();
        for (Camera.Size next : supportedPreviewSizes) {
            e.mo55395g(new Size(next.width, next.height));
        }
        return e.mo55394f();
    }

    /* renamed from: e */
    public static Integer m49277e(boolean z) {
        int numberOfCameras = Camera.getNumberOfCameras();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                arrayList.add(new C26664b(i, cameraInfo));
                if (cameraInfo.facing == z) {
                    return Integer.valueOf(i);
                }
                i++;
            } catch (RuntimeException e) {
                ((C58970a) ((C58970a) ((C58970a) f72706b.mo56225c()).mo56382g(e)).mo56372aa(49042)).mo56387q("Failed to get camera info for ID %s", i);
            }
        }
        ((C58970a) ((C58970a) f72706b.mo56225c()).mo56372aa(49041)).mo56359L("getCameraId(): Failed to fetch any usable cameraId: frontFacingRequested[%b]# of Cameras[%d], CameraInfos: [%s]", Boolean.valueOf(z), Integer.valueOf(numberOfCameras), arrayList);
        return null;
    }

    /* renamed from: f */
    public static boolean m49278f(Camera.Parameters parameters) {
        return parameters.getMaxNumFocusAreas() > 0;
    }

    /* renamed from: g */
    public static boolean m49279g(Camera.Parameters parameters) {
        return parameters.getMaxNumMeteringAreas() > 0;
    }
}
