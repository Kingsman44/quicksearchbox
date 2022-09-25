package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.opengl.GLES20;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26747ap;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.w */
/* compiled from: PG */
public final class C26880w {

    /* renamed from: a */
    public final boolean f73283a;

    /* renamed from: b */
    public final boolean f73284b;

    /* renamed from: c */
    public final ByteBuffer f73285c;

    /* renamed from: d */
    public final ByteBuffer f73286d;

    /* renamed from: e */
    public final float[] f73287e = new float[16];

    /* renamed from: f */
    private final C26848ad f73288f;

    public C26880w(C25799b bVar, C26848ad adVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z) {
        this.f73288f = adVar;
        this.f73285c = byteBuffer;
        this.f73286d = byteBuffer2;
        this.f73284b = z;
        boolean z2 = true;
        if (!bVar.mo30941b() && !bVar.mo30940a()) {
            z2 = false;
        }
        this.f73283a = z2;
    }

    /* renamed from: a */
    public final void mo32252a(int i, int i2, C26747ap apVar) {
        GLES20.glClear(16384);
        GLES20.glUseProgram(i2);
        int glGetAttribLocation = GLES20.glGetAttribLocation(i2, "vPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        mo32253b(i, apVar, GLES20.glGetUniformLocation(i2, "uPreviewM"), GLES20.glGetUniformLocation(i2, "uTextureM"));
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, this.f73285c);
        GLES20.glDrawArrays(5, 0, 4);
        C26860b.m49758c(this.f73283a);
        GLES20.glDisableVertexAttribArray(glGetAttribLocation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32253b(int r9, com.google.android.libraries.lens.view.p2113h.p2121d.C26747ap r10, int r11, int r12) {
        /*
            r8 = this;
            float[] r0 = r8.f73287e
            r10.getTransformMatrix(r0)
            float[] r10 = r8.f73287e
            r0 = 1
            r1 = 0
            android.opengl.GLES20.glUniformMatrix4fv(r12, r0, r1, r10, r1)
            com.google.android.libraries.lens.view.h.h.a.ad r10 = r8.f73288f
            float[] r2 = r8.f73287e
            android.util.Size r12 = r10.f73152a
            r12.getWidth()
            android.util.Size r12 = r10.f73152a
            r12.getHeight()
            android.util.Size r12 = r10.f73153b
            r12.getWidth()
            android.util.Size r12 = r10.f73153b
            r12.getHeight()
            android.util.Size r12 = r10.f73152a
            int r12 = r12.getWidth()
            float r12 = (float) r12
            android.util.Size r3 = r10.f73152a
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r12 = r12 / r3
            int r3 = r10.f73154c
            com.google.android.libraries.lens.view.sensors.orientation.g r4 = r10.f73155d
            int r4 = r4.mo33214a()
            int r3 = r3 - r4
            int r3 = r3 % 180
            int r3 = java.lang.Math.abs(r3)
            if (r3 == 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            if (r3 == 0) goto L_0x0050
            android.util.Size r4 = r10.f73153b
            int r4 = r4.getHeight()
            goto L_0x0056
        L_0x0050:
            android.util.Size r4 = r10.f73153b
            int r4 = r4.getWidth()
        L_0x0056:
            float r4 = (float) r4
            if (r3 == 0) goto L_0x0060
            android.util.Size r5 = r10.f73153b
            int r5 = r5.getWidth()
            goto L_0x0066
        L_0x0060:
            android.util.Size r5 = r10.f73153b
            int r5 = r5.getHeight()
        L_0x0066:
            float r5 = (float) r5
            float r4 = r4 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0074
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0072
            float r12 = r12 / r4
            goto L_0x007f
        L_0x0072:
            float r4 = r4 / r12
            goto L_0x007a
        L_0x0074:
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x007d
            float r4 = r12 / r4
        L_0x007a:
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0081
        L_0x007d:
            float r12 = r4 / r12
        L_0x007f:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0081:
            android.opengl.Matrix.setIdentityM(r2, r1)
            boolean r3 = r10.f73156e
            if (r3 == 0) goto L_0x0089
            float r4 = -r4
        L_0x0089:
            if (r9 != r0) goto L_0x008c
            float r12 = -r12
        L_0x008c:
            android.opengl.Matrix.scaleM(r2, r1, r4, r12, r5)
            com.google.android.libraries.lens.view.sensors.orientation.g r9 = r10.f73155d
            int r10 = r9.f75706a
            if (r10 == 0) goto L_0x00a2
            r3 = 0
            int r9 = r9.mo33214a()
            float r4 = (float) r9
            r5 = 0
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            android.opengl.Matrix.rotateM(r2, r3, r4, r5, r6, r7)
        L_0x00a2:
            float[] r9 = r8.f73287e
            android.opengl.GLES20.glUniformMatrix4fv(r11, r0, r1, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26880w.mo32253b(int, com.google.android.libraries.lens.view.h.d.ap, int, int):void");
    }
}
