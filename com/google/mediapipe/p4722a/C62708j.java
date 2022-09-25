package com.google.mediapipe.p4722a;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import com.google.mediapipe.framework.TextureFrame;
import com.google.mediapipe.p4723b.C62710a;
import com.google.mediapipe.p4723b.C62715f;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.mediapipe.a.j */
/* compiled from: PG */
public final class C62708j implements GLSurfaceView.Renderer {

    /* renamed from: a */
    public int f169306a = 0;

    /* renamed from: b */
    public int f169307b = 0;

    /* renamed from: c */
    public int f169308c = 0;

    /* renamed from: d */
    public int f169309d = 36197;

    /* renamed from: e */
    public float f169310e = 0.5f;

    /* renamed from: f */
    public float f169311f = 0.5f;

    /* renamed from: g */
    public final AtomicReference f169312g = new AtomicReference();

    /* renamed from: h */
    private int f169313h;

    /* renamed from: i */
    private int f169314i;

    /* renamed from: j */
    private int f169315j;

    /* renamed from: k */
    private int f169316k;

    /* renamed from: l */
    private final float[] f169317l = new float[16];

    /* renamed from: a */
    private final boolean m94911a() {
        return this.f169309d == 36197;
    }

    public final void onDrawFrame(GL10 gl10) {
        TextureFrame textureFrame = null;
        TextureFrame textureFrame2 = (TextureFrame) this.f169312g.getAndSet((Object) null);
        GLES20.glClear(16384);
        C62715f.m94926c("glClear");
        if (textureFrame2 != null) {
            GLES20.glActiveTexture(33984);
            C62715f.m94926c("glActiveTexture");
            GLES20.glBindTexture(this.f169309d, textureFrame2.getTextureName());
            C62715f.m94926c("glBindTexture");
            GLES20.glTexParameteri(this.f169309d, 10241, 9729);
            GLES20.glTexParameteri(this.f169309d, 10240, 9729);
            GLES20.glTexParameteri(this.f169309d, 10242, 33071);
            GLES20.glTexParameteri(this.f169309d, 10243, 33071);
            C62715f.m94926c("texture setup");
            GLES20.glUseProgram(this.f169308c);
            GLES20.glUniform1i(this.f169315j, 0);
            GLES20.glUniformMatrix4fv(this.f169316k, 1, false, this.f169317l, 0);
            C62715f.m94926c("glUniformMatrix4fv");
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, C62710a.f169318a);
            int i = this.f169306a;
            float f = i > 0 ? ((float) this.f169313h) / ((float) i) : 1.0f;
            int i2 = this.f169307b;
            float f2 = i2 > 0 ? ((float) this.f169314i) / ((float) i2) : 1.0f;
            float max = Math.max(f, f2);
            float f3 = f / max;
            float f4 = f2 / max;
            float f5 = (1.0f - f3) * this.f169310e;
            float f6 = (1.0f - f4) * this.f169311f;
            float f7 = f3 + f5;
            float f8 = f4 + f6;
            FloatBuffer b = C62715f.m94925b(f5, f6, f7, f6, f5, f8, f7, f8);
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, b);
            C62715f.m94926c("program setup");
            GLES20.glDrawArrays(5, 0, 4);
            C62715f.m94926c("glDrawArrays");
            GLES20.glBindTexture(this.f169309d, 0);
            C62715f.m94926c("unbind surfaceTexture");
            textureFrame = textureFrame2;
        }
        GLES20.glFlush();
        if (textureFrame != null) {
            textureFrame.release();
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f169313h = i;
        this.f169314i = i2;
        GLES20.glViewport(0, 0, i, i2);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Matrix.setIdentityM(this.f169317l, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        boolean a = m94911a();
        Log.d("DemoRenderer", "external texture: " + a);
        int d = C62715f.m94927d(true != m94911a() ? "varying mediump vec2 sample_coordinate;\nuniform sampler2D video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}" : "#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
        this.f169308c = d;
        this.f169315j = GLES20.glGetUniformLocation(d, "video_frame");
        this.f169316k = GLES20.glGetUniformLocation(this.f169308c, "texture_transform");
        C62715f.m94926c("glGetUniformLocation");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
