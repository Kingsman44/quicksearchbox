package com.android.p261d.p264c;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.android.d.c.g */
/* compiled from: PG */
public final class C5059g implements C5055c {

    /* renamed from: o */
    public static final C5060h f16102o = new C5060h();

    /* renamed from: p */
    private static final String f16103p = "g";

    /* renamed from: q */
    private static final float[] f16104q = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: A */
    private final int[] f16105A;

    /* renamed from: a */
    public float[] f16106a = new float[128];

    /* renamed from: b */
    public int f16107b;

    /* renamed from: c */
    public int f16108c;

    /* renamed from: d */
    public int f16109d;

    /* renamed from: e */
    public final float[] f16110e;

    /* renamed from: f */
    final C5057e[] f16111f;

    /* renamed from: g */
    final C5057e[] f16112g;

    /* renamed from: h */
    final C5057e[] f16113h;

    /* renamed from: i */
    final C5057e[] f16114i;

    /* renamed from: j */
    public final C5061i f16115j;

    /* renamed from: k */
    public final ArrayList f16116k;

    /* renamed from: l */
    public final float[] f16117l;

    /* renamed from: m */
    public final RectF f16118m;

    /* renamed from: n */
    public final RectF f16119n;

    /* renamed from: r */
    private final float[] f16120r;

    /* renamed from: s */
    private final C5061i f16121s;

    /* renamed from: t */
    private int f16122t;

    /* renamed from: u */
    private final int f16123u;

    /* renamed from: v */
    private final int f16124v;

    /* renamed from: w */
    private final int f16125w;

    /* renamed from: x */
    private final C5061i f16126x;

    /* renamed from: y */
    private int f16127y;

    /* renamed from: z */
    private final float[] f16128z;

    public C5059g() {
        float[] fArr = new float[8];
        this.f16120r = fArr;
        this.f16121s = new C5061i();
        this.f16122t = 0;
        this.f16107b = 0;
        this.f16110e = new float[16];
        C5057e[] eVarArr = {new C5056d("aPosition"), new C5058f("uMatrix"), new C5058f("uColor")};
        this.f16111f = eVarArr;
        C5057e[] eVarArr2 = {new C5056d("aPosition"), new C5058f("uMatrix"), new C5058f("uTextureMatrix"), new C5058f("uTextureSampler"), new C5058f("uAlpha")};
        this.f16112g = eVarArr2;
        C5057e[] eVarArr3 = {new C5056d("aPosition"), new C5058f("uMatrix"), new C5058f("uTextureMatrix"), new C5058f("uTextureSampler"), new C5058f("uAlpha")};
        this.f16113h = eVarArr3;
        C5057e[] eVarArr4 = {new C5056d("aPosition"), new C5058f("uMatrix"), new C5056d("aTextureCoordinate"), new C5058f("uTextureSampler"), new C5058f("uAlpha")};
        this.f16114i = eVarArr4;
        this.f16115j = new C5061i();
        this.f16126x = new C5061i();
        this.f16127y = 0;
        ArrayList arrayList = new ArrayList();
        this.f16116k = arrayList;
        this.f16117l = new float[32];
        this.f16118m = new RectF();
        this.f16119n = new RectF();
        float[] fArr2 = new float[16];
        this.f16128z = fArr2;
        int[] iArr = new int[1];
        this.f16105A = iArr;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(this.f16106a, this.f16107b);
        fArr[this.f16122t] = 1.0f;
        arrayList.add((Object) null);
        float[] fArr3 = f16104q;
        int length = fArr3.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr3, 0, 20).position(0);
        GLES20.glGenBuffers(1, iArr, 0);
        m13900f();
        m13900f();
        int i = iArr[0];
        GLES20.glBindBuffer(34962, i);
        m13900f();
        GLES20.glBufferData(34962, asFloatBuffer.capacity() * 4, asFloatBuffer, 35044);
        m13900f();
        this.f16125w = i;
        int j = m13903j(35633, "uniform mat4 uMatrix;\nattribute vec2 aPosition;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n}\n");
        int j2 = m13903j(35633, "uniform mat4 uMatrix;\nuniform mat4 uTextureMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n  vTextureCoord = (uTextureMatrix * pos).xy;\n}\n");
        int j3 = m13903j(35633, "uniform mat4 uMatrix;\nattribute vec2 aPosition;\nattribute vec2 aTextureCoordinate;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n  vTextureCoord = aTextureCoordinate;\n}\n");
        int j4 = m13903j(35632, "precision mediump float;\nuniform vec4 uColor;\nvoid main() {\n  gl_FragColor = uColor;\n}\n");
        int j5 = m13903j(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nuniform sampler2D uTextureSampler;\nvoid main() {\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n  gl_FragColor *= uAlpha;\n}\n");
        int j6 = m13903j(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nuniform samplerExternalOES uTextureSampler;\nvoid main() {\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n  gl_FragColor *= uAlpha;\n}\n");
        m13902i(j, j4, eVarArr);
        this.f16123u = m13902i(j2, j5, eVarArr2);
        this.f16124v = m13902i(j2, j6, eVarArr3);
        m13902i(j3, j5, eVarArr4);
        GLES20.glBlendFunc(1, 771);
        m13900f();
    }

    /* renamed from: f */
    public static void m13900f() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Throwable th = new Throwable();
            String str = f16103p;
            Log.e(str, "GL error: " + glGetError, th);
        }
    }

    /* renamed from: g */
    public static void m13901g(RectF rectF, RectF rectF2, C5053a aVar) {
        int e = aVar.mo10017e();
        int a = aVar.mo10013a();
        int d = aVar.mo10016d();
        int c = aVar.mo10015c();
        float f = (float) d;
        rectF.left /= f;
        rectF.right /= f;
        float f2 = (float) c;
        rectF.top /= f2;
        rectF.bottom /= f2;
        float f3 = ((float) e) / f;
        if (rectF.right > f3) {
            rectF2.right = rectF2.left + ((rectF2.width() * (f3 - rectF.left)) / rectF.width());
            rectF.right = f3;
        }
        float f4 = ((float) a) / f2;
        if (rectF.bottom > f4) {
            rectF2.bottom = rectF2.top + ((rectF2.height() * (f4 - rectF.top)) / rectF.height());
            rectF.bottom = f4;
        }
    }

    /* renamed from: i */
    private final int m13902i(int i, int i2, C5057e[] eVarArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        m13900f();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, i);
            m13900f();
            GLES20.glAttachShader(glCreateProgram, i2);
            m13900f();
            GLES20.glLinkProgram(glCreateProgram);
            m13900f();
            int[] iArr = this.f16105A;
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String str = f16103p;
                Log.e(str, "Could not link program: ");
                Log.e(str, GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                glCreateProgram = 0;
            }
            for (C5057e a : eVarArr) {
                a.mo10033a(glCreateProgram);
            }
            return glCreateProgram;
        }
        throw new RuntimeException("Cannot create GL program: " + GLES20.glGetError());
    }

    /* renamed from: j */
    private static int m13903j(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        m13900f();
        GLES20.glCompileShader(glCreateShader);
        m13900f();
        return glCreateShader;
    }

    /* renamed from: a */
    public final void mo10028a(C5053a aVar, RectF rectF, RectF rectF2) {
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            this.f16118m.set(rectF);
            this.f16119n.set(rectF2);
            m13901g(this.f16118m, this.f16119n, aVar);
            mo10034h(aVar, this.f16118m, this.f16119n);
        }
    }

    /* renamed from: b */
    public final void mo10029b() {
        C5061i iVar = this.f16121s;
        int i = iVar.f16131b - 1;
        iVar.f16131b = i;
        int i2 = iVar.f16130a[i];
        if ((i2 & 1) == 1) {
            this.f16122t--;
        }
        if ((i2 & 2) == 2) {
            this.f16107b -= 16;
        }
    }

    /* renamed from: c */
    public final void mo10030c(C5053a aVar, int i, int i2, Bitmap bitmap, int i3, int i4) {
        int b = aVar.mo10014b();
        GLES20.glBindTexture(b, aVar.f16092b);
        m13900f();
        GLUtils.texSubImage2D(b, 0, i, i2, bitmap, i3, i4);
    }

    /* renamed from: d */
    public final void mo10031d(float f, float f2) {
        int i = this.f16107b;
        float[] fArr = this.f16106a;
        int i2 = i + 12;
        fArr[i2] = fArr[i2] + (fArr[i] * f) + (fArr[i + 4] * f2);
        int i3 = i + 13;
        fArr[i3] = fArr[i3] + (fArr[i + 1] * f) + (fArr[i + 5] * f2);
        int i4 = i + 14;
        fArr[i4] = fArr[i4] + (fArr[i + 2] * f) + (fArr[i + 6] * f2);
        int i5 = i + 15;
        fArr[i5] = fArr[i5] + (fArr[i + 3] * f) + (fArr[i + 7] * f2);
    }

    /* renamed from: e */
    public final void mo10032e() {
        int i = this.f16107b;
        int i2 = i + 16;
        this.f16107b = i2;
        float[] fArr = this.f16106a;
        int length = fArr.length;
        if (length <= i2) {
            this.f16106a = Arrays.copyOf(fArr, length + length);
        }
        float[] fArr2 = this.f16106a;
        System.arraycopy(fArr2, i, fArr2, this.f16107b, 16);
        this.f16121s.mo10035a(2);
    }

    /* renamed from: h */
    public final void mo10034h(C5053a aVar, RectF rectF, RectF rectF2) {
        int i;
        C5057e[] eVarArr;
        C5053a aVar2 = aVar;
        RectF rectF3 = rectF;
        RectF rectF4 = rectF2;
        this.f16128z[0] = rectF.width();
        this.f16128z[5] = rectF.height();
        this.f16128z[12] = rectF3.left;
        this.f16128z[13] = rectF3.top;
        float[] fArr = this.f16128z;
        if (aVar.mo10014b() == 3553) {
            eVarArr = this.f16112g;
            i = this.f16123u;
        } else {
            eVarArr = this.f16113h;
            i = this.f16124v;
        }
        synchronized (this.f16115j) {
            C5061i iVar = this.f16115j;
            int i2 = iVar.f16131b;
            if (i2 > 0) {
                GLES20.glDeleteTextures(i2, iVar.f16130a, 0);
                m13900f();
                iVar.mo10036b();
            }
            C5061i iVar2 = this.f16126x;
            int i3 = iVar2.f16131b;
            if (i3 > 0) {
                GLES20.glDeleteBuffers(i3, iVar2.f16130a, 0);
                m13900f();
                iVar2.mo10036b();
            }
        }
        GLES20.glUseProgram(i);
        m13900f();
        if (!aVar.mo10037t() || this.f16120r[this.f16122t] < 0.95f) {
            GLES20.glEnable(3042);
            m13900f();
        } else {
            GLES20.glDisable(3042);
            m13900f();
        }
        GLES20.glActiveTexture(33984);
        m13900f();
        aVar2.mo10025l(this);
        GLES20.glBindTexture(aVar.mo10014b(), aVar2.f16092b);
        m13900f();
        GLES20.glUniform1i(eVarArr[3].f16100a, 0);
        m13900f();
        GLES20.glUniform1f(eVarArr[4].f16100a, this.f16120r[this.f16122t]);
        m13900f();
        GLES20.glBindBuffer(34962, this.f16125w);
        m13900f();
        GLES20.glVertexAttribPointer(eVarArr[0].f16100a, 2, 5126, false, 8, 0);
        m13900f();
        GLES20.glBindBuffer(34962, 0);
        m13900f();
        GLES20.glUniformMatrix4fv(eVarArr[2].f16100a, 1, false, fArr, 0);
        m13900f();
        if (aVar.mo10023j()) {
            mo10032e();
            mo10031d(0.0f, rectF2.centerY());
            Matrix.scaleM(this.f16106a, this.f16107b, 1.0f, -1.0f, 1.0f);
            mo10031d(0.0f, -rectF2.centerY());
        }
        float f = rectF4.left;
        float f2 = rectF4.top;
        float width = rectF2.width();
        float height = rectF2.height();
        Matrix.translateM(this.f16117l, 0, this.f16106a, this.f16107b, f, f2, 0.0f);
        Matrix.scaleM(this.f16117l, 0, width, height, 1.0f);
        float[] fArr2 = this.f16117l;
        Matrix.multiplyMM(fArr2, 16, this.f16110e, 0, fArr2, 0);
        GLES20.glUniformMatrix4fv(eVarArr[1].f16100a, 1, false, this.f16117l, 16);
        m13900f();
        int i4 = eVarArr[0].f16100a;
        GLES20.glEnableVertexAttribArray(i4);
        m13900f();
        GLES20.glDrawArrays(5, 0, 4);
        m13900f();
        GLES20.glDisableVertexAttribArray(i4);
        m13900f();
        if (aVar.mo10023j()) {
            mo10029b();
        }
        this.f16127y++;
    }
}
