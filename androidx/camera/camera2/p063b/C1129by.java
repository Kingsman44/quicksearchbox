package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.p063b.p064a.C1042c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.b.by */
/* compiled from: PG */
final class C1129by extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    final Map f3343a = new HashMap();

    /* renamed from: b */
    C1139ch f3344b = null;

    /* renamed from: b */
    private final List m3153b(CaptureRequest captureRequest) {
        List list = (List) this.f3343a.get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3877a(CaptureRequest captureRequest, List list) {
        List list2 = (List) this.f3343a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.f3343a.put(captureRequest, arrayList);
            return;
        }
        this.f3343a.put(captureRequest, list);
    }

    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback a : m3153b(captureRequest)) {
            C1042c.m3032a(a, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureCompleted : m3153b(captureRequest)) {
            onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback onCaptureFailed : m3153b(captureRequest)) {
            onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureProgressed : m3153b(captureRequest)) {
            onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f3343a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : it) {
                onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        C1139ch chVar = this.f3344b;
        if (chVar != null) {
            chVar.f3353a.mo3933n();
        }
    }

    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (List<CameraCaptureSession.CaptureCallback> it : this.f3343a.values()) {
            for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : it) {
                onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        C1139ch chVar = this.f3344b;
        if (chVar != null) {
            chVar.f3353a.mo3933n();
        }
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback onCaptureStarted : m3153b(captureRequest)) {
            onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
