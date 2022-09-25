package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.a */
/* compiled from: PG */
public final class C26682a {

    /* renamed from: a */
    private static final C58974d f72753a = C58974d.m91135i("Camera2Util");

    /* renamed from: a */
    public static float m49301a(CaptureResult captureResult) {
        Float f = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        f.getClass();
        return f.floatValue();
    }

    /* renamed from: b */
    public static float m49302b(CameraCharacteristics cameraCharacteristics) {
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    /* renamed from: c */
    public static int m49303c(CameraCharacteristics cameraCharacteristics) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return num.intValue();
    }

    /* renamed from: d */
    public static C58833ax m49304d(CaptureResult captureResult) {
        try {
            MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) captureResult.get(CaptureResult.CONTROL_AF_REGIONS);
            if (meteringRectangleArr == null || (r0 = meteringRectangleArr.length) == 0) {
                return C58836b.f156633a;
            }
            C58480gp e = C58485gu.m89837e();
            for (MeteringRectangle rect : meteringRectangleArr) {
                e.mo55395g(rect.getRect());
            }
            return C58833ax.m90834k(e.mo55394f());
        } catch (IllegalArgumentException e2) {
            ((C58970a) ((C58970a) ((C58970a) f72753a.mo56226d()).mo56382g(e2)).mo56372aa(49060)).mo56386p("Failed to get valid auto focus regions from CaptureResult.");
            return C58836b.f156633a;
        }
    }

    /* renamed from: e */
    public static C58833ax m49305e(CaptureResult captureResult) {
        return C58833ax.m90833j((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME));
    }

    /* renamed from: f */
    public static C58833ax m49306f(CameraCharacteristics cameraCharacteristics, C58833ax axVar, PointF pointF) {
        Rect rect;
        boolean z = false;
        if (pointF.x >= 0.0f && pointF.x <= 1.0f && pointF.y >= 0.0f && pointF.y <= 1.0f) {
            z = true;
        }
        C58838bb.m90873h(z, "The point at %s is out of the normalized range.", pointF.toString());
        new Rect();
        if (axVar.mo56113h()) {
            rect = (Rect) axVar.mo56107c();
        } else {
            rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                return C58836b.f156633a;
            }
        }
        int width = (int) ((((float) rect.width()) * 0.2f) / 2.0f);
        int height = (int) ((((float) rect.height()) * 0.2f) / 2.0f);
        int width2 = ((int) (pointF.x * ((float) rect.width()))) + rect.left;
        int max = Math.max(width2 - width, rect.left);
        int min = Math.min((width2 + width) - 1, rect.right - 1);
        int height2 = ((int) (pointF.y * ((float) rect.height()))) + rect.top;
        int max2 = Math.max(height2 - height, rect.top);
        return C58833ax.m90834k(new MeteringRectangle(max, max2, (min - max) + 1, (Math.min((height2 + height) - 1, rect.bottom - 1) - max2) + 1, 999));
    }

    /* renamed from: g */
    public static C58833ax m49307g(CaptureResult captureResult) {
        Integer num;
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
        if (num2 == null || num2.intValue() == 0 || (num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE)) == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Boolean.valueOf(num.intValue() == 2));
    }

    /* renamed from: h */
    public static C58833ax m49308h(PointF pointF, Size size, C58833ax axVar) {
        if (!axVar.mo56113h() || size.getHeight() == 0 || size.getWidth() == 0 || ((Rect) axVar.mo56107c()).height() == 0 || ((Rect) axVar.mo56107c()).width() == 0) {
            return C58836b.f156633a;
        }
        float width = ((float) size.getWidth()) / ((float) size.getHeight());
        float width2 = ((float) ((Rect) axVar.mo56107c()).width()) / ((float) ((Rect) axVar.mo56107c()).height());
        if (width <= width2) {
            return C58833ax.m90834k(new PointF((((pointF.x - 8.0f) * width) / width2) + 0.5f, pointF.y));
        }
        return C58833ax.m90834k(new PointF(pointF.x, (((pointF.y - 8.0f) * width2) / width) + 0.5f));
    }

    /* renamed from: i */
    public static boolean m49309i(CameraCharacteristics cameraCharacteristics) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        return num != null && num.intValue() > 0;
    }

    /* renamed from: j */
    public static boolean m49310j(CameraCharacteristics cameraCharacteristics) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        return num != null && num.intValue() > 0 && f != null && f.floatValue() > 0.0f;
    }

    /* renamed from: k */
    public static Size[] m49311k(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        streamConfigurationMap.getClass();
        return streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
    }

    /* renamed from: l */
    public static float m49312l(CaptureRequest captureRequest) {
        Rect rect = (Rect) captureRequest.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect == null) {
            return 1.0f;
        }
        return ((float) (rect.left + rect.right)) / ((float) (rect.right - rect.left));
    }

    /* renamed from: m */
    public static C58833ax m49313m(CaptureResult captureResult) {
        Integer num;
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_MODE);
        if (num2 == null || num2.intValue() != 4 || (num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE)) == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Boolean.valueOf(num.intValue() == 2));
    }
}
