package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.p068c.C1233i;
import androidx.camera.camera2.p068c.C1234j;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1348ch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.b.bt */
/* compiled from: PG */
final class C1124bt {
    /* renamed from: a */
    public static CaptureRequest m3147a(C1302ap apVar, CameraDevice cameraDevice, Map map) {
        CaptureRequest.Builder builder;
        if (cameraDevice == null) {
            return null;
        }
        List<C1314ba> unmodifiableList = Collections.unmodifiableList(apVar.f3749c);
        ArrayList<Surface> arrayList = new ArrayList<>();
        for (C1314ba baVar : unmodifiableList) {
            Surface surface = (Surface) map.get(baVar);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1131c cVar = apVar.f3755i;
        if (apVar.f3751e != 5 || cVar == null || !(cVar.f3347b instanceof TotalCaptureResult)) {
            C1477bw.m3978a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            builder = cameraDevice.createCaptureRequest(apVar.f3751e);
        } else {
            C1477bw.m3978a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builder = C1123bs.m3146a(cameraDevice, (TotalCaptureResult) cVar.f3347b);
        }
        m3148b(builder, apVar.f3750d);
        if (apVar.f3750d.mo3960j(C1302ap.f3747a)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) apVar.f3750d.mo3953E(C1302ap.f3747a));
        }
        if (apVar.f3750d.mo3960j(C1302ap.f3748b)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) apVar.f3750d.mo3953E(C1302ap.f3748b)).byteValue()));
        }
        for (Surface addTarget : arrayList) {
            builder.addTarget(addTarget);
        }
        builder.setTag(apVar.f3754h);
        return builder.build();
    }

    /* renamed from: b */
    public static void m3148b(CaptureRequest.Builder builder, C1308av avVar) {
        C1234j c = C1233i.m3390a(avVar).mo4062c();
        for (C1306at atVar : C1348ch.m3678f(c)) {
            CaptureRequest.Key key = (CaptureRequest.Key) atVar.mo4169b();
            try {
                builder.set(key, C1348ch.m3674b(c, atVar));
            } catch (IllegalArgumentException unused) {
                new StringBuilder("CaptureRequest.Key is not supported: ").append(key);
                C1477bw.m3980c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: ".concat(String.valueOf(key)));
            }
        }
    }
}
