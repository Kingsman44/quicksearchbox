package androidx.media3.exoplayer.video.p153a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* renamed from: androidx.media3.exoplayer.video.a.e */
/* compiled from: PG */
final class C3280e implements SensorEventListener {

    /* renamed from: a */
    private final float[] f9847a = new float[16];

    /* renamed from: b */
    private final float[] f9848b = new float[16];

    /* renamed from: c */
    private final float[] f9849c = new float[16];

    /* renamed from: d */
    private final float[] f9850d = new float[3];

    /* renamed from: e */
    private final Display f9851e;

    /* renamed from: f */
    private final C3279d[] f9852f;

    /* renamed from: g */
    private boolean f9853g;

    public C3280e(Display display, C3279d... dVarArr) {
        this.f9851e = display;
        this.f9852f = dVarArr;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        SensorManager.getRotationMatrixFromVector(this.f9847a, sensorEvent.values);
        float[] fArr = this.f9847a;
        int rotation = this.f9851e.getRotation();
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i2 = 130;
                        i = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i2 = 2;
                i = 129;
            }
            System.arraycopy(fArr, 0, this.f9848b, 0, 16);
            SensorManager.remapCoordinateSystem(this.f9848b, i2, i, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f9847a, 1, 131, this.f9848b);
        SensorManager.getOrientation(this.f9848b, this.f9850d);
        float f = this.f9850d[2];
        Matrix.rotateM(this.f9847a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = this.f9847a;
        if (!this.f9853g) {
            C3278c.m9532a(this.f9849c, fArr2);
            this.f9853g = true;
        }
        System.arraycopy(fArr2, 0, this.f9848b, 0, 16);
        Matrix.multiplyMM(fArr2, 0, this.f9848b, 0, this.f9849c, 0);
        float[] fArr3 = this.f9847a;
        C3279d[] dVarArr = this.f9852f;
        for (int i3 = 0; i3 < 2; i3++) {
            dVarArr[i3].mo7264a(fArr3, f);
        }
    }
}
