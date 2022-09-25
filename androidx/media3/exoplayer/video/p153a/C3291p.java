package androidx.media3.exoplayer.video.p153a;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2623k;
import androidx.media3.common.p136b.C2624l;
import androidx.media3.common.p136b.C2625m;
import androidx.media3.common.p136b.C2633u;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: androidx.media3.exoplayer.video.a.p */
/* compiled from: PG */
final class C3291p implements GLSurfaceView.Renderer, C3293r, C3279d {

    /* renamed from: a */
    final /* synthetic */ C3292q f9895a;

    /* renamed from: b */
    private final C3288m f9896b;

    /* renamed from: c */
    private final float[] f9897c = new float[16];

    /* renamed from: d */
    private final float[] f9898d = new float[16];

    /* renamed from: e */
    private final float[] f9899e;

    /* renamed from: f */
    private final float[] f9900f;

    /* renamed from: g */
    private final float[] f9901g;

    /* renamed from: h */
    private float f9902h;

    /* renamed from: i */
    private float f9903i;

    /* renamed from: j */
    private final float[] f9904j;

    /* renamed from: k */
    private final float[] f9905k;

    public C3291p(C3292q qVar, C3288m mVar) {
        this.f9895a = qVar;
        float[] fArr = new float[16];
        this.f9899e = fArr;
        float[] fArr2 = new float[16];
        this.f9900f = fArr2;
        float[] fArr3 = new float[16];
        this.f9901g = fArr3;
        this.f9904j = new float[16];
        this.f9905k = new float[16];
        this.f9896b = mVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f9903i = 3.1415927f;
    }

    /* renamed from: c */
    private final void m9541c() {
        Matrix.setRotateM(this.f9900f, 0, -this.f9902h, (float) Math.cos((double) this.f9903i), (float) Math.sin((double) this.f9903i), 0.0f);
    }

    /* renamed from: a */
    public final synchronized void mo7264a(float[] fArr, float f) {
        System.arraycopy(fArr, 0, this.f9899e, 0, 16);
        this.f9903i = -f;
        m9541c();
    }

    /* renamed from: b */
    public final synchronized void mo7270b(PointF pointF) {
        this.f9902h = pointF.y;
        m9541c();
        Matrix.setRotateM(this.f9901g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        synchronized (this) {
            Matrix.multiplyMM(this.f9905k, 0, this.f9899e, 0, this.f9901g, 0);
            Matrix.multiplyMM(this.f9904j, 0, this.f9900f, 0, this.f9905k, 0);
        }
        Matrix.multiplyMM(this.f9898d, 0, this.f9897c, 0, this.f9904j, 0);
        C3288m mVar = this.f9896b;
        float[] fArr2 = this.f9898d;
        GLES20.glClear(16384);
        try {
            C2625m.m7025b();
        } catch (C2624l e) {
            C2633u.m7048c("SceneRenderer", C2633u.m7046a("Failed to draw a frame", e));
        }
        if (mVar.f9879a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = mVar.f9888j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                C2625m.m7025b();
            } catch (C2624l e2) {
                C2633u.m7048c("SceneRenderer", C2633u.m7046a("Failed to draw a frame", e2));
            }
            if (mVar.f9880b.compareAndSet(true, false)) {
                Matrix.setIdentityM(mVar.f9885g, 0);
            }
            long timestamp = mVar.f9888j.getTimestamp();
            Long l = (Long) mVar.f9883e.mo6174b(timestamp);
            if (l != null) {
                C3278c cVar = mVar.f9882d;
                float[] fArr3 = mVar.f9885g;
                float[] fArr4 = (float[]) cVar.f9845c.mo6176d(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = cVar.f9844b;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        fArr = fArr3;
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
                    } else {
                        fArr = fArr3;
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!cVar.f9846d) {
                        C3278c.m9532a(cVar.f9843a, cVar.f9844b);
                        cVar.f9846d = true;
                    }
                    Matrix.multiplyMM(fArr, 0, cVar.f9843a, 0, cVar.f9844b, 0);
                }
            }
            C3283h hVar = (C3283h) mVar.f9884f.mo6176d(timestamp);
            if (hVar != null) {
                C3286k kVar = mVar.f9881c;
                if (C3286k.m9537a(hVar)) {
                    kVar.f9870d = hVar.f9861c;
                    kVar.f9871e = new C3285j(hVar.f9859a.f9854a[0]);
                    if (!hVar.f9862d) {
                        new C3285j(hVar.f9860b.f9854a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(mVar.f9886h, 0, fArr2, 0, mVar.f9885g, 0);
        C3286k kVar2 = mVar.f9881c;
        int i = mVar.f9887i;
        float[] fArr6 = mVar.f9886h;
        C3285j jVar = kVar2.f9871e;
        if (jVar != null) {
            int i2 = kVar2.f9870d;
            GLES20.glUniformMatrix3fv(kVar2.f9874h, 1, false, i2 == 1 ? C3286k.f9868b : i2 == 2 ? C3286k.f9869c : C3286k.f9867a, 0);
            GLES20.glUniformMatrix4fv(kVar2.f9873g, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(kVar2.f9877k, 0);
            try {
                C2625m.m7025b();
            } catch (C2624l e3) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(kVar2.f9875i, 3, 5126, false, 12, jVar.f9864b);
            try {
                C2625m.m7025b();
            } catch (C2624l e4) {
                Log.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(kVar2.f9876j, 2, 5126, false, 8, jVar.f9865c);
            try {
                C2625m.m7025b();
            } catch (C2624l e5) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(jVar.f9866d, 0, jVar.f9863a);
            try {
                C2625m.m7025b();
            } catch (C2624l e6) {
                Log.e("ProjectionRenderer", "Failed to render", e6);
            }
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = ((float) i) / ((float) i2);
        if (f2 > 1.0f) {
            double tan = Math.tan(Math.toRadians(45.0d));
            double d = (double) f2;
            Double.isNaN(d);
            double degrees = Math.toDegrees(Math.atan(tan / d));
            f = (float) (degrees + degrees);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.f9897c, 0, f, f2, 0.1f, 100.0f);
    }

    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C3292q qVar = this.f9895a;
        C3288m mVar = this.f9896b;
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C2625m.m7025b();
            C3286k kVar = mVar.f9881c;
            try {
                kVar.f9872f = new C2623k();
                kVar.f9873g = GLES20.glGetUniformLocation(kVar.f9872f.f7283a, "uMvpMatrix");
                kVar.f9874h = GLES20.glGetUniformLocation(kVar.f9872f.f7283a, "uTexMatrix");
                kVar.f9875i = kVar.f9872f.mo6196a("aPosition");
                kVar.f9876j = kVar.f9872f.mo6196a("aTexCoords");
                kVar.f9877k = GLES20.glGetUniformLocation(kVar.f9872f.f7283a, "uTexture");
            } catch (C2624l e) {
                Log.e("ProjectionRenderer", "Failed to initialize the program", e);
            }
            C2625m.m7025b();
            C2625m.m7026c(!C2612ak.m6951aa(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C2625m.m7025b();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            C2625m.m7025b();
            GLES20.glTexParameteri(36197, 10240, 9729);
            C2625m.m7025b();
            GLES20.glTexParameteri(36197, 10241, 9729);
            C2625m.m7025b();
            GLES20.glTexParameteri(36197, 10242, 33071);
            C2625m.m7025b();
            GLES20.glTexParameteri(36197, 10243, 33071);
            C2625m.m7025b();
            mVar.f9887i = i;
        } catch (C2624l e2) {
            C2633u.m7048c("SceneRenderer", C2633u.m7046a("Failed to initialize the renderer", e2));
        }
        mVar.f9888j = new SurfaceTexture(mVar.f9887i);
        mVar.f9888j.setOnFrameAvailableListener(new C3287l(mVar));
        qVar.f9907b.post(new C3289n(qVar, mVar.f9888j));
    }
}
