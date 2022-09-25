package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Size;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26843d;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26844e;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.ac */
/* compiled from: PG */
final class C26847ac {

    /* renamed from: a */
    private static final C58974d f73151a = C58974d.m91135i("ImagePumpGlOperations");

    /* renamed from: a */
    static int m49710a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m49728s(36197);
        return i;
    }

    /* renamed from: b */
    static int m49711b() {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindBuffer(35051, i);
        return i;
    }

    /* renamed from: c */
    static int m49712c(Context context) {
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, C26860b.m49756a(C26860b.m49757b(context, R.raw.preview_vertex), 35633));
        GLES20.glAttachShader(glCreateProgram, C26860b.m49756a(C26860b.m49757b(context, R.raw.plain_fragment), 35632));
        GLES20.glLinkProgram(glCreateProgram);
        return glCreateProgram;
    }

    /* renamed from: d */
    static void m49713d(int i) {
        GLES20.glBufferData(35051, i, (Buffer) null, 35041);
    }

    /* renamed from: e */
    static void m49714e(boolean z, int i, int i2) {
        C26860b.m49758c(z);
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        C26860b.m49758c(z);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            String hexString = Integer.toHexString(glCheckFramebufferStatus);
            if (!z) {
                ((C58970a) ((C58970a) f73151a.mo56225c()).mo56372aa(49251)).mo56389s("Framebuffer not complete, status 0x%s", hexString);
            } else {
                throw new IllegalStateException(String.format("Framebuffer not complete, status 0x%s", new Object[]{hexString}));
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: f */
    static void m49715f(int i, Size size) {
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: g */
    static void m49716g() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: h */
    static void m49717h(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
    }

    /* renamed from: i */
    static void m49718i(int i) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, i);
        GLES20.glHint(33170, 4354);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: j */
    static void m49719j(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        GLES20.glBindFramebuffer(36160, 0);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    /* renamed from: k */
    static void m49720k(int i, ByteBuffer byteBuffer, int i2, byte[] bArr, int i3, C26851ag agVar) {
        agVar.mo32219a("analyzer/read");
        GLES20.glBindBuffer(35051, i);
        byteBuffer.rewind();
        if (bArr == null) {
            byteBuffer.put((ByteBuffer) GLES30.glMapBufferRange(35051, 0, byteBuffer.capacity(), 1));
        } else {
            ByteBuffer byteBuffer2 = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, bArr.length * i3, 1);
            byteBuffer2.rewind();
            for (int i4 = 0; i4 < i3; i4++) {
                byteBuffer2.get(bArr);
                byteBuffer.put(bArr, 0, i2);
            }
        }
        GLES30.glUnmapBuffer(35051);
        GLES20.glBindBuffer(35051, 0);
        agVar.mo32220b();
    }

    /* renamed from: l */
    static void m49721l(int i, ByteBuffer byteBuffer, Size size, boolean z, C26851ag agVar) {
        agVar.mo32219a("analyzer-s/read");
        byteBuffer.rewind();
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), true != z ? 6408 : 6403, 5121, byteBuffer);
        agVar.mo32220b();
    }

    /* renamed from: m */
    static void m49722m(C26844e eVar, Size size, boolean z, C26851ag agVar) {
        agVar.mo32219a("analyzer/pbo");
        GLES20.glBindFramebuffer(36160, eVar.mo32211a());
        GLES20.glBindBuffer(35051, eVar.mo32212b());
        if (z) {
            GLES20.glPixelStorei(3333, 1);
            GLES30.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6403, 5121, 0);
            GLES20.glPixelStorei(3333, 4);
        } else {
            GLES30.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, 0);
        }
        GLES20.glBindBuffer(35051, 0);
        agVar.mo32220b();
    }

    /* renamed from: n */
    static void m49723n(int i, ByteBuffer byteBuffer, C26851ag agVar) {
        agVar.mo32219a("capture/read");
        byteBuffer.rewind();
        GLES20.glBindBuffer(35051, i);
        try {
            byteBuffer.put((ByteBuffer) GLES30.glMapBufferRange(35051, 0, byteBuffer.capacity(), 1));
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f73151a.mo56225c()).mo56382g(e)).mo56372aa(49252)).mo56386p("An attempt to copy the buffer contents has failed");
        }
        GLES30.glUnmapBuffer(35051);
        GLES20.glBindBuffer(35051, 0);
        agVar.mo32220b();
    }

    /* renamed from: o */
    static void m49724o(int i, ByteBuffer byteBuffer, Size size, C26851ag agVar) {
        agVar.mo32219a("capture-s/read");
        byteBuffer.rewind();
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        agVar.mo32220b();
    }

    /* renamed from: p */
    static void m49725p(C26844e eVar, Size size, C26851ag agVar) {
        agVar.mo32219a("capture/pbo");
        GLES20.glBindFramebuffer(36160, eVar.mo32211a());
        GLES20.glBindBuffer(35051, eVar.mo32212b());
        GLES30.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, 0);
        GLES20.glBindBuffer(35051, 0);
        agVar.mo32220b();
    }

    /* renamed from: q */
    static void m49726q(C26844e eVar, Size size, C26851ag agVar, int i) {
        agVar.mo32219a("capture/pbo");
        GLES20.glBindFramebuffer(36160, eVar.mo32211a());
        GLES20.glBindBuffer(35051, i);
        GLES30.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, 0);
        GLES20.glBindBuffer(35051, 0);
        agVar.mo32220b();
    }

    /* renamed from: r */
    static void m49727r(int i, Size size, Size size2) {
        GLES20.glBindFramebuffer(36008, i);
        GLES20.glBindFramebuffer(36009, 0);
        GLES30.glBlitFramebuffer(0, 0, size.getWidth(), size.getHeight(), 0, 0, size2.getWidth(), size2.getHeight(), 16384, 9729);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: s */
    static void m49728s(int i) {
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        GLES20.glTexParameteri(i, 10241, 9729);
        GLES20.glTexParameteri(i, 10240, 9729);
    }

    /* renamed from: t */
    static void m49729t(Size size, boolean z, int i, int i2) {
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexImage2D(3553, 0, 6408, size.getWidth(), size.getHeight(), 0, 6408, 5121, (Buffer) null);
        m49728s(3553);
        m49714e(z, i, i2);
    }

    /* renamed from: u */
    static void m49730u(boolean z, boolean z2, C26843d dVar, Size size, int i) {
        boolean z3 = z2;
        int i2 = i;
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexImage2D(3553, 0, true != z3 ? 6408 : 33321, size.getWidth(), size.getHeight(), 0, true != z3 ? 6408 : 6403, 5121, (Buffer) null);
        m49728s(3553);
        boolean z4 = z;
        m49714e(z, dVar.mo32205a(), i2);
    }

    /* renamed from: v */
    static void m49731v(Size size, boolean z, int i, int i2) {
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9985);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 33084, 0);
        GLES20.glTexParameteri(3553, 33085, 2);
        GLES20.glTexImage2D(3553, 0, 6408, size.getWidth(), size.getHeight(), 0, 6408, 5121, (Buffer) null);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        m49714e(z, i, i2);
    }

    /* renamed from: w */
    static int m49732w(Context context, boolean z) {
        int glCreateProgram = GLES20.glCreateProgram();
        if (z) {
            GLES20.glAttachShader(glCreateProgram, C26860b.m49756a(C26860b.m49757b(context, R.raw.analyzer_mipmap_vertex), 35633));
            GLES20.glAttachShader(glCreateProgram, C26860b.m49756a(C26860b.m49757b(context, R.raw.analyzer_mipmap_fragment), 35632));
        } else {
            GLES20.glAttachShader(glCreateProgram, C26860b.m49756a(C26860b.m49757b(context, R.raw.preview_vertex), 35633));
            GLES20.glAttachShader(glCreateProgram, C26860b.m49756a(C26860b.m49757b(context, R.raw.luminance_fragment), 35632));
        }
        GLES20.glLinkProgram(glCreateProgram);
        return glCreateProgram;
    }

    /* renamed from: x */
    static int[] m49733x() {
        int[] iArr = new int[3];
        GLES20.glGenFramebuffers(3, iArr, 0);
        return iArr;
    }

    /* renamed from: y */
    static int[] m49734y() {
        int[] iArr = new int[3];
        GLES20.glGenTextures(3, iArr, 0);
        return iArr;
    }
}
