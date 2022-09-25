package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1364cx;
import androidx.camera.core.p069a.C1387n;
import androidx.camera.core.p069a.C1388o;
import androidx.camera.core.p069a.C1389p;

/* renamed from: androidx.camera.camera2.b.c */
/* compiled from: PG */
public final class C1131c {

    /* renamed from: a */
    public final C1364cx f3346a;

    /* renamed from: b */
    public final CaptureResult f3347b;

    public C1131c(C1364cx cxVar, CaptureResult captureResult) {
        this.f3346a = cxVar;
        this.f3347b = captureResult;
    }

    /* renamed from: a */
    public final long mo3892a() {
        Long l = (Long) this.f3347b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    /* renamed from: b */
    public final C1387n mo3893b() {
        Integer num = (Integer) this.f3347b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return C1387n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return C1387n.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return C1387n.CONVERGED;
            }
            if (intValue == 3) {
                return C1387n.LOCKED;
            }
            if (intValue == 4) {
                return C1387n.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                new StringBuilder("Undefined ae state: ").append(num);
                C1477bw.m3980c("C2CameraCaptureResult", "Undefined ae state: ".concat(num.toString()));
                return C1387n.UNKNOWN;
            }
        }
        return C1387n.SEARCHING;
    }

    /* renamed from: c */
    public final C1388o mo3894c() {
        Integer num = (Integer) this.f3347b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return C1388o.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return C1388o.INACTIVE;
            case 1:
            case 3:
                return C1388o.SCANNING;
            case 2:
                return C1388o.PASSIVE_FOCUSED;
            case 4:
                return C1388o.LOCKED_FOCUSED;
            case 5:
                return C1388o.LOCKED_NOT_FOCUSED;
            case 6:
                return C1388o.PASSIVE_NOT_FOCUSED;
            default:
                new StringBuilder("Undefined af state: ").append(num);
                C1477bw.m3980c("C2CameraCaptureResult", "Undefined af state: ".concat(num.toString()));
                return C1388o.UNKNOWN;
        }
    }

    /* renamed from: d */
    public final C1389p mo3895d() {
        Integer num = (Integer) this.f3347b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return C1389p.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return C1389p.INACTIVE;
        }
        if (intValue == 1) {
            return C1389p.METERING;
        }
        if (intValue == 2) {
            return C1389p.CONVERGED;
        }
        if (intValue == 3) {
            return C1389p.LOCKED;
        }
        new StringBuilder("Undefined awb state: ").append(num);
        C1477bw.m3980c("C2CameraCaptureResult", "Undefined awb state: ".concat(num.toString()));
        return C1389p.UNKNOWN;
    }

    /* renamed from: e */
    public final int mo3896e() {
        Integer num = (Integer) this.f3347b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return 3;
            }
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            if (intValue != 5) {
                new StringBuilder("Undefined af mode: ").append(num);
                C1477bw.m3980c("C2CameraCaptureResult", "Undefined af mode: ".concat(num.toString()));
                return 1;
            }
        }
        return 2;
    }
}
