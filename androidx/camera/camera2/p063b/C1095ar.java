package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.p063b.p064a.C1042c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.ar */
/* compiled from: PG */
public final class C1095ar extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    private final List f3276a = new ArrayList();

    public C1095ar(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof C1096as)) {
                this.f3276a.add(captureCallback);
            }
        }
    }

    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback a : this.f3276a) {
            C1042c.m3032a(a, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureCompleted : this.f3276a) {
            onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback onCaptureFailed : this.f3276a) {
            onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureProgressed : this.f3276a) {
            onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : this.f3276a) {
            onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
        }
    }

    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : this.f3276a) {
            onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback onCaptureStarted : this.f3276a) {
            onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
