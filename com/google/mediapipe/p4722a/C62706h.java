package com.google.mediapipe.p4722a;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.mediapipe.framework.C62716a;
import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.p4723b.C62713d;
import com.google.mediapipe.p4723b.C62714e;
import com.google.mediapipe.p4723b.C62715f;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.google.mediapipe.a.h */
/* compiled from: PG */
public final class C62706h extends C62714e implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public volatile SurfaceTexture f169290a;

    /* renamed from: b */
    public final List f169291b;

    /* renamed from: c */
    public volatile boolean f169292c;

    /* renamed from: d */
    public final Queue f169293d;

    /* renamed from: e */
    public int f169294e;

    /* renamed from: f */
    public C62713d f169295f;

    /* renamed from: g */
    public long f169296g;

    /* renamed from: h */
    public long f169297h;

    /* renamed from: i */
    public boolean f169298i;

    /* renamed from: j */
    protected int f169299j;

    /* renamed from: k */
    protected int f169300k;

    /* renamed from: t */
    private volatile SurfaceTexture f169301t;

    /* renamed from: u */
    private int[] f169302u;

    /* renamed from: v */
    private final int f169303v;

    public C62706h(EGLContext eGLContext) {
        super(eGLContext);
        this.f169290a = null;
        this.f169301t = null;
        this.f169302u = null;
        this.f169292c = false;
        this.f169293d = new ArrayDeque();
        this.f169294e = 0;
        this.f169295f = null;
        this.f169296g = 0;
        this.f169297h = 0;
        this.f169298i = false;
        this.f169299j = 0;
        this.f169300k = 0;
        this.f169303v = 3;
        this.f169295f = new C62713d();
        this.f169291b = new ArrayList();
    }

    /* renamed from: g */
    public static void m94903g(C62716a aVar) {
        GLES20.glDeleteTextures(1, new int[]{aVar.f169366b}, 0);
    }

    /* renamed from: h */
    public static final void m94904h(C62716a aVar) {
        try {
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Waiting for tex: %d width: %d height: %d timestamp: %d", new Object[]{Integer.valueOf(aVar.f169366b), Integer.valueOf(aVar.f169367c), Integer.valueOf(aVar.f169368d), Long.valueOf(aVar.f169369e)}));
            }
            synchronized (aVar) {
                while (aVar.f169370f && aVar.f169371g == null) {
                    aVar.wait();
                }
                GlSyncToken glSyncToken = aVar.f169371g;
                if (glSyncToken != null) {
                    glSyncToken.waitOnGpu();
                    aVar.f169371g.release();
                    aVar.f169370f = false;
                    aVar.f169371g = null;
                }
            }
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Finished waiting for tex: %d width: %d height: %d timestamp: %d", new Object[]{Integer.valueOf(aVar.f169366b), Integer.valueOf(aVar.f169367c), Integer.valueOf(aVar.f169368d), Long.valueOf(aVar.f169369e)}));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final C62705g mo58584a() {
        int i = this.f169299j;
        int i2 = this.f169300k;
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, (Buffer) null);
        C62715f.m94926c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        C62715f.m94926c("texture setup");
        int i3 = iArr[0];
        Log.d("ExternalTextureConv", String.format("Created output texture: %d width: %d height: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f169299j), Integer.valueOf(this.f169300k)}));
        mo58598i(i3, this.f169299j, this.f169300k);
        return new C62705g(this, i3, this.f169299j, this.f169300k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo58585b(C62705g gVar) {
        this.f169293d.offer(gVar);
        int i = this.f169294e - 1;
        this.f169294e = i;
        int max = Math.max(this.f169303v - i, 0);
        while (this.f169293d.size() > max) {
            this.f169348q.post(new C62704f((C62705g) this.f169293d.remove()));
        }
    }

    /* renamed from: c */
    public final void mo58586c() {
        super.mo58586c();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C62713d dVar = this.f169295f;
        HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        int d = C62715f.m94927d("#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
        dVar.f169338f = d;
        dVar.f169339g = GLES20.glGetUniformLocation(d, "video_frame");
        dVar.f169340h = GLES20.glGetUniformLocation(dVar.f169338f, "texture_transform");
        C62715f.m94926c("glGetUniformLocation");
        int[] iArr = new int[1];
        this.f169302u = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        this.f169301t = new SurfaceTexture(this.f169302u[0]);
        mo58589f(this.f169301t, 0, 0);
    }

    /* renamed from: d */
    public final void mo58587d() {
        mo58589f((SurfaceTexture) null, 0, 0);
        while (!this.f169293d.isEmpty()) {
            m94903g((C62716a) this.f169293d.remove());
        }
        this.f169301t.release();
        int[] iArr = this.f169302u;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        GLES20.glDeleteProgram(this.f169295f.f169338f);
        super.mo58587d();
    }

    /* renamed from: e */
    public final void mo58588e(C62709k kVar) {
        synchronized (this.f169291b) {
            this.f169291b.clear();
            this.f169291b.add(kVar);
        }
    }

    /* renamed from: f */
    public final void mo58589f(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f169292c = false;
        if (this.f169290a != null) {
            this.f169290a.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        }
        this.f169290a = surfaceTexture;
        if (this.f169290a != null) {
            this.f169290a.setOnFrameAvailableListener(this);
        }
        this.f169299j = i;
        this.f169300k = i2;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f169348q.post(new C62703e(this, surfaceTexture));
    }
}
