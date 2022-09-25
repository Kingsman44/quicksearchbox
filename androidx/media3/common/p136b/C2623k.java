package androidx.media3.common.p136b;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.media3.common.b.k */
/* compiled from: PG */
public final class C2623k {

    /* renamed from: a */
    public final int f7283a;

    /* renamed from: b */
    private final C2621i[] f7284b;

    /* renamed from: c */
    private final C2622j[] f7285c;

    /* renamed from: d */
    private final Map f7286d;

    /* renamed from: e */
    private final Map f7287e;

    public C2623k() {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f7283a = glCreateProgram;
        C2625m.m7025b();
        m7022c(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        m7022c(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int i = 1;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        C2625m.m7026c(iArr[0] == 1, "Unable to link shader program: \n".concat(String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram))));
        GLES20.glUseProgram(glCreateProgram);
        this.f7286d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f7284b = new C2621i[iArr2[0]];
        int i2 = 0;
        while (i2 < iArr2[0]) {
            int i3 = this.f7283a;
            int[] iArr3 = new int[i];
            GLES20.glGetProgramiv(i3, 35722, iArr3, 0);
            int i4 = iArr3[0];
            byte[] bArr = new byte[i4];
            byte[] bArr2 = bArr;
            GLES20.glGetActiveAttrib(i3, i2, i4, new int[i], 0, new int[i], 0, new int[i], 0, bArr, 0);
            String str = new String(bArr2, 0, m7021b(bArr2));
            GLES20.glGetAttribLocation(i3, str);
            C2621i iVar = new C2621i(str);
            this.f7284b[i2] = iVar;
            this.f7286d.put(iVar.f7281a, iVar);
            i2++;
            i = 1;
        }
        this.f7287e = new HashMap();
        int i5 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f7283a, 35718, iArr4, 0);
        this.f7285c = new C2622j[iArr4[0]];
        int i6 = 0;
        while (i6 < iArr4[0]) {
            int i7 = this.f7283a;
            int[] iArr5 = new int[i5];
            GLES20.glGetProgramiv(i7, 35719, iArr5, 0);
            int i8 = iArr5[0];
            byte[] bArr3 = new byte[i8];
            byte[] bArr4 = bArr3;
            GLES20.glGetActiveUniform(i7, i6, i8, new int[i5], 0, new int[i5], 0, new int[i5], 0, bArr3, 0);
            String str2 = new String(bArr4, 0, m7021b(bArr4));
            GLES20.glGetUniformLocation(i7, str2);
            C2622j jVar = new C2622j(str2);
            this.f7285c[i6] = jVar;
            this.f7287e.put(jVar.f7282a, jVar);
            i6++;
            i5 = 1;
        }
        C2625m.m7025b();
    }

    /* renamed from: b */
    public static int m7021b(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: c */
    private static void m7022c(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = true;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            z = false;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        C2625m.m7026c(z, glGetShaderInfoLog + ", source: " + str);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C2625m.m7025b();
    }

    /* renamed from: a */
    public final int mo6196a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f7283a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        C2625m.m7025b();
        return glGetAttribLocation;
    }
}
