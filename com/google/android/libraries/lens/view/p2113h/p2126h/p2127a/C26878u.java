package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.lens.view.p2082av.C25579c;
import com.google.android.libraries.lens.view.p2087ay.C25626ai;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26747ap;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26751c;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26764p;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26783ah;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26842c;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a.C26844e;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26854a;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26855b;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2129b.C26856c;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c.C26860b;
import com.google.android.libraries.lens.view.p2152n.C27456i;
import com.google.android.libraries.lens.view.sensors.orientation.C27730g;
import com.google.android.libraries.lens.view.session.C27781bq;
import com.google.android.libraries.lens.view.vision.C28161c;
import com.google.android.libraries.lens.view.vision.C28173o;
import com.google.android.libraries.lens.view.vision.C28174p;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.u */
/* compiled from: PG */
public final class C26878u {

    /* renamed from: a */
    public static final C58974d f73209a = C58974d.m91135i("CameraImagePump");

    /* renamed from: aa */
    private static final float[] f73210aa = {1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: ab */
    private static final float[] f73211ab = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: A */
    public ByteBuffer f73212A;

    /* renamed from: B */
    public byte[] f73213B;

    /* renamed from: C */
    public C26844e f73214C;

    /* renamed from: D */
    public C26844e f73215D;

    /* renamed from: E */
    public C26844e f73216E;

    /* renamed from: F */
    public final int f73217F;

    /* renamed from: G */
    public int f73218G;

    /* renamed from: H */
    public int f73219H;

    /* renamed from: I */
    public int f73220I;

    /* renamed from: J */
    public int f73221J;

    /* renamed from: K */
    public long f73222K;

    /* renamed from: L */
    public volatile boolean f73223L;

    /* renamed from: M */
    public volatile C26873p f73224M = new C26873p(this);

    /* renamed from: N */
    public volatile ByteBuffer f73225N;

    /* renamed from: O */
    public final C58833ax f73226O;

    /* renamed from: P */
    public final AtomicInteger f73227P;

    /* renamed from: Q */
    public final C28174p f73228Q;

    /* renamed from: R */
    public final Executor f73229R;

    /* renamed from: S */
    public final C25626ai f73230S;

    /* renamed from: T */
    public final C47770dh f73231T;

    /* renamed from: U */
    public final boolean f73232U;

    /* renamed from: V */
    public final boolean f73233V;

    /* renamed from: W */
    public final boolean f73234W;

    /* renamed from: X */
    public final boolean f73235X;

    /* renamed from: Y */
    public C26747ap f73236Y;

    /* renamed from: Z */
    public final C26783ah f73237Z;

    /* renamed from: ac */
    private final ByteBuffer f73238ac;

    /* renamed from: ad */
    private final ByteBuffer f73239ad;

    /* renamed from: b */
    public final C26751c f73240b;

    /* renamed from: c */
    public final AtomicBoolean f73241c = new AtomicBoolean();

    /* renamed from: d */
    public final AtomicBoolean f73242d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f73243e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f73244f = new AtomicBoolean();

    /* renamed from: g */
    public final boolean f73245g;

    /* renamed from: h */
    public final boolean f73246h;

    /* renamed from: i */
    public final boolean f73247i;

    /* renamed from: j */
    public final boolean f73248j;

    /* renamed from: k */
    public final Context f73249k;

    /* renamed from: l */
    public final C26880w f73250l;

    /* renamed from: m */
    public final Executor f73251m;

    /* renamed from: n */
    public final ExecutorService f73252n;

    /* renamed from: o */
    public final C26855b f73253o;

    /* renamed from: p */
    public final C58833ax f73254p;

    /* renamed from: q */
    public final C69464a f73255q;

    /* renamed from: r */
    public final C26849ae f73256r;

    /* renamed from: s */
    public final Size f73257s;

    /* renamed from: t */
    public final Size f73258t;

    /* renamed from: u */
    public final Surface[] f73259u;

    /* renamed from: v */
    public final C58833ax f73260v;

    /* renamed from: w */
    public final C26851ag f73261w;

    /* renamed from: x */
    public final C27456i f73262x;

    /* renamed from: y */
    public volatile Runnable f73263y;

    /* renamed from: z */
    public boolean f73264z;

    public C26878u(Context context, C25799b bVar, C26764p pVar, Executor executor, C27781bq bqVar, C58833ax axVar, C69464a aVar, C27456i iVar, C26856c cVar, C26851ag agVar, C26881x xVar, C26850af afVar, Executor executor2, C25626ai aiVar, C47770dh dhVar, boolean z, boolean z2, boolean z3, C26783ah ahVar, C26751c cVar2, C26747ap apVar, Surface[] surfaceArr, Size size, Size size2, C27730g gVar, int i, boolean z4, AtomicInteger atomicInteger) {
        C26764p pVar2 = pVar;
        C26856c cVar3 = cVar;
        C26850af afVar2 = afVar;
        boolean z5 = z2;
        C26751c cVar4 = cVar2;
        Surface[] surfaceArr2 = surfaceArr;
        Size size3 = size2;
        this.f73249k = context;
        this.f73240b = cVar4;
        this.f73251m = executor;
        this.f73260v = axVar;
        this.f73255q = aVar;
        this.f73262x = iVar;
        this.f73261w = agVar;
        this.f73227P = atomicInteger;
        this.f73229R = executor2;
        this.f73230S = aiVar;
        this.f73231T = dhVar;
        this.f73232U = z5;
        this.f73233V = z;
        this.f73234W = z3;
        this.f73248j = z5;
        boolean z6 = false;
        cVar3.f73176e = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        C58838bb.m90883r(EGL14.eglInitialize(cVar3.f73176e, iArr, 0, iArr, 1));
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(cVar3.f73176e, new int[]{12351, 12430, 12329, 0, 12352, 4, 12354, 4, 12339, 4, 12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        C58838bb.m90883r(iArr2[0] != 0);
        cVar3.f73174c = eGLConfigArr[0];
        if (!EGL14.eglMakeCurrent(cVar3.f73176e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            ((C58970a) ((C58970a) C26856c.f73172a.mo56224b()).mo56372aa(49265)).mo56387q("eglMakeCurrent failed: %s", EGL14.eglGetError());
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(cVar3.f73176e, cVar3.f73174c, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        eglCreateContext.getClass();
        cVar3.f73175d = eglCreateContext;
        boolean z7 = false;
        while (EGL14.eglGetError() != 12288) {
            z7 = true;
        }
        boolean z8 = !cVar3.f73173b && !z7;
        cVar3.f73178g = z8;
        if (!z8) {
            ((C58970a) ((C58970a) C26856c.f73172a.mo56224b()).mo56372aa(49262)).mo56356I("***** Cannot initialize OpenGL ES 3.x; forceGl2: %b; eglError: 0x%X ", cVar3.f73173b, 12288);
            EGLContext eglCreateContext2 = EGL14.eglCreateContext(cVar3.f73176e, cVar3.f73174c, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            eglCreateContext2.getClass();
            cVar3.f73175d = eglCreateContext2;
            boolean z9 = false;
            while (EGL14.eglGetError() != 12288) {
                z9 = true;
            }
            C58838bb.m90883r(!z9);
        }
        int length = surfaceArr2.length;
        C58480gp f = C58485gu.m89838f(length);
        int[] iArr3 = {12344};
        for (int i2 = 0; i2 < length; i2++) {
            Surface surface = surfaceArr2[i2];
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(cVar3.f73176e, cVar3.f73174c, surface, iArr3, 0);
            eglCreateWindowSurface.getClass();
            f.mo55395g(new C26842c(surface, eglCreateWindowSurface));
            int eglGetError = EGL14.eglGetError();
            C58838bb.m90889x(eglGetError == 12288, "eglCreateWindowSurface failed with error 0x%s at surface with index %s", Integer.toHexString(eglGetError), i2);
        }
        cVar3.f73177f = f.mo55394f();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        EGLConfig eGLConfig = cVar3.f73174c;
        if (eGLConfig != null) {
            EGLContext eGLContext = cVar3.f73175d;
            if (eGLContext != null) {
                EGLDisplay eGLDisplay = cVar3.f73176e;
                if (eGLDisplay != null) {
                    C58485gu guVar = cVar3.f73177f;
                    if (guVar != null) {
                        C26854a aVar2 = new C26854a(eGLConfig, eGLContext, eGLDisplay, guVar, cVar3.f73178g, atomicInteger2);
                        this.f73253o = aVar2;
                        C25799b bVar2 = (C25799b) afVar2.f73162a.mo17428b();
                        bVar2.getClass();
                        C26851ag agVar2 = (C26851ag) afVar2.f73163b.mo17428b();
                        agVar2.getClass();
                        this.f73256r = new C26849ae(bVar2, agVar2, aVar2);
                        C26854a aVar3 = aVar2;
                        boolean z10 = aVar2.f73169d;
                        this.f73245g = z10;
                        this.f73247i = z10;
                        pVar2.mo31946k(!z10);
                        int width = cVar4.f72878a.getWidth() * (true != z10 ? 4 : 1);
                        this.f73217F = width;
                        C28161c cVar5 = new C28161c();
                        cVar5.mo33622d(cVar4.f72878a.getWidth());
                        cVar5.mo33621c(cVar4.f72878a.getHeight());
                        cVar5.mo33623e(cVar4.f72879b);
                        cVar5.mo33620b(width);
                        cVar5.f76618a = true != z10 ? 2 : 1;
                        C28174p a = cVar5.mo33619a();
                        C28173o.m52605f(a);
                        this.f73228Q = a;
                        this.f73237Z = ahVar;
                        this.f73236Y = apVar;
                        this.f73259u = surfaceArr2;
                        this.f73258t = size3;
                        this.f73257s = size3;
                        this.f73246h = bVar.mo30941b() || bVar.mo30940a();
                        float[] fArr = f73210aa;
                        int length2 = fArr.length;
                        ByteBuffer order = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
                        this.f73239ad = order;
                        order.asFloatBuffer().put(fArr);
                        order.rewind();
                        if (this.f73248j) {
                            float[] fArr2 = f73211ab;
                            int length3 = fArr2.length;
                            ByteBuffer order2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
                            this.f73238ac = order2;
                            order2.asFloatBuffer().put(fArr2);
                            order2.rewind();
                        } else {
                            this.f73238ac = null;
                        }
                        C26848ad adVar = new C26848ad(size, size2, i, gVar, z4);
                        ByteBuffer byteBuffer = this.f73238ac;
                        boolean z11 = this.f73248j;
                        C25799b bVar3 = (C25799b) xVar.f73289a.mo17428b();
                        bVar3.getClass();
                        order.getClass();
                        this.f73250l = new C26880w(bVar3, adVar, order, byteBuffer, z11);
                        bqVar.mo33288a(new C26864g(this));
                        this.f73223L = false;
                        pVar2.mo31944i(size3);
                        this.f73252n = new C26846ab();
                        this.f73226O = (!z5 || !z10) ? C58836b.f156633a : C58833ax.m90834k(new C26876s(this));
                        this.f73254p = C58836b.f156633a;
                        if (z10 && z5) {
                            z6 = true;
                        }
                        this.f73235X = z6;
                        return;
                    }
                    throw new NullPointerException("Null cameraTextures");
                }
                throw new NullPointerException("Null eglDisplay");
            }
            throw new NullPointerException("Null eglContext");
        }
        throw new NullPointerException("Null eglConfig");
    }

    /* renamed from: a */
    public final int mo32244a() {
        return this.f73257s.getWidth() * this.f73257s.getHeight() * 4;
    }

    /* renamed from: b */
    public final void mo32245b() {
        if (this.f73241c.compareAndSet(false, true)) {
            mo32247d();
        }
    }

    /* renamed from: c */
    public final void mo32246c() {
        this.f73236Y.attachToGLContext(C26847ac.m49710a());
    }

    /* renamed from: d */
    public final void mo32247d() {
        if (this.f73241c.get() && this.f73242d.get()) {
            this.f73256r.f73158a.set(true);
            C26858c cVar = new C26858c(this);
            C60870cx l = C60856cj.m92903l(C47810es.m84977q(cVar), this.f73252n);
            C26869l lVar = new C26869l(this);
            C60856cj.m92911t(l, C47810es.m84974n(lVar), this.f73229R);
        }
    }

    /* renamed from: e */
    public final void mo32248e() {
        this.f73261w.mo32219a("preview/draw");
        C26847ac.m49715f(0, this.f73258t);
        this.f73250l.mo32252a(2, this.f73221J, this.f73236Y);
        this.f73261w.mo32220b();
    }

    /* renamed from: f */
    public final void mo32249f(boolean z) {
        C58974d dVar = f73209a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(49245)).mo56389s("***** setIdle %s", Boolean.valueOf(z));
        if (this.f73260v.mo56113h() && !z) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(49246)).mo56387q("***** setIdle SyncRendering flush: %d", ((C25579c) this.f73260v.mo56107c()).mo30661a());
        }
        this.f73243e.set(z);
    }

    /* renamed from: g */
    public final boolean mo32250g() {
        return !this.f73244f.get();
    }

    /* renamed from: h */
    public final void mo32251h(int i) {
        this.f73261w.mo32219a("analyzer/draw");
        C26847ac.m49715f(this.f73214C.mo32211a(), this.f73240b.f72878a);
        if (this.f73248j) {
            C26880w wVar = this.f73250l;
            int i2 = this.f73220I;
            int c = this.f73215D.mo32213c();
            C58838bb.m90883r(wVar.f73284b);
            GLES20.glClear(16384);
            GLES20.glUseProgram(i2);
            C26860b.m49758c(wVar.f73283a);
            int glGetAttribLocation = GLES20.glGetAttribLocation(i2, "vPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(i2, "aTexCoordinate");
            int glGetUniformLocation = GLES20.glGetUniformLocation(i2, "uPreviewM");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(i2, "sTexture");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, c);
            GLES20.glUniform1i(glGetUniformLocation2, 0);
            C26860b.m49758c(wVar.f73283a);
            Matrix.setIdentityM(wVar.f73287e, 0);
            Matrix.scaleM(wVar.f73287e, 0, 1.0f, i == 1 ? 1.0f : -1.0f, 1.0f);
            GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, wVar.f73287e, 0);
            C26860b.m49758c(wVar.f73283a);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, wVar.f73285c);
            ByteBuffer byteBuffer = wVar.f73286d;
            byteBuffer.getClass();
            GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 0, byteBuffer);
            C26860b.m49758c(wVar.f73283a);
            GLES20.glDrawArrays(5, 0, 4);
            C26860b.m49758c(wVar.f73283a);
            GLES20.glBindTexture(3553, 0);
            GLES20.glDisableVertexAttribArray(glGetAttribLocation);
            GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
            C26860b.m49758c(wVar.f73283a);
        } else {
            this.f73250l.mo32252a(i, this.f73220I, this.f73236Y);
        }
        this.f73261w.mo32220b();
    }
}
