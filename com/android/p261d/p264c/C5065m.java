package com.android.p261d.p264c;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.android.p261d.p262a.C5041e;
import java.nio.Buffer;
import java.util.HashMap;

/* renamed from: com.android.d.c.m */
/* compiled from: PG */
public abstract class C5065m extends C5053a {

    /* renamed from: i */
    private static final HashMap f16135i = new HashMap();

    /* renamed from: l */
    private static final C5064l f16136l = new C5064l();

    /* renamed from: j */
    public boolean f16137j = true;

    /* renamed from: k */
    public Bitmap f16138k;

    /* renamed from: m */
    private final boolean f16139m = true;

    protected C5065m() {
        super((byte[]) null);
    }

    /* renamed from: r */
    private final Bitmap m13919r() {
        if (this.f16138k == null) {
            Bitmap m = mo10026m();
            this.f16138k = m;
            int width = m.getWidth();
            int height = this.f16138k.getHeight();
            if (this.f16094d == -1) {
                mo10021h(width, height);
            }
        }
        return this.f16138k;
    }

    /* renamed from: s */
    private static Bitmap m13920s(boolean z, Bitmap.Config config, int i) {
        Bitmap bitmap;
        C5064l lVar = f16136l;
        lVar.f16132a = z;
        lVar.f16133b = config;
        lVar.f16134c = i;
        HashMap hashMap = f16135i;
        Bitmap bitmap2 = (Bitmap) hashMap.get(lVar);
        if (bitmap2 != null) {
            return bitmap2;
        }
        if (z) {
            bitmap = Bitmap.createBitmap(1, i, config);
        } else {
            bitmap = Bitmap.createBitmap(i, 1, config);
        }
        Bitmap bitmap3 = bitmap;
        hashMap.put(lVar.clone(), bitmap3);
        return bitmap3;
    }

    /* renamed from: a */
    public final int mo10013a() {
        if (this.f16094d == -1) {
            m13919r();
        }
        return this.f16095e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo10014b() {
        return 3553;
    }

    /* renamed from: e */
    public final int mo10017e() {
        if (this.f16094d == -1) {
            m13919r();
        }
        return this.f16094d;
    }

    /* renamed from: g */
    public final void mo10020g() {
        super.mo10018f();
        if (this.f16138k != null) {
            mo10042o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo10025l(C5055c cVar) {
        mo10043p(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract Bitmap mo10026m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo10027n(Bitmap bitmap);

    /* renamed from: o */
    public final void mo10042o() {
        C5041e.m13844c(this.f16138k != null);
        mo10027n(this.f16138k);
        this.f16138k = null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: p */
    public final void mo10043p(C5055c cVar) {
        if (!mo10024k()) {
            Bitmap r = m13919r();
            if (r != null) {
                try {
                    int width = r.getWidth();
                    int height = r.getHeight();
                    int d = mo10016d();
                    int c = mo10015c();
                    C5041e.m13844c(width <= d && height <= c);
                    C5060h hVar = C5059g.f16102o;
                    GLES20.glGenTextures(1, hVar.f16129a, 0);
                    C5059g.m13900f();
                    this.f16092b = hVar.f16129a[0];
                    int b = mo10014b();
                    GLES20.glBindTexture(b, this.f16092b);
                    C5059g.m13900f();
                    GLES20.glTexParameteri(b, 10242, 33071);
                    GLES20.glTexParameteri(b, 10243, 33071);
                    GLES20.glTexParameterf(b, 10241, 9729.0f);
                    GLES20.glTexParameterf(b, 10240, 9729.0f);
                    if (width == d && height == c) {
                        int b2 = mo10014b();
                        GLES20.glBindTexture(b2, this.f16092b);
                        C5059g.m13900f();
                        GLUtils.texImage2D(b2, 0, r, 0);
                    } else {
                        int internalFormat = GLUtils.getInternalFormat(r);
                        int type = GLUtils.getType(r);
                        Bitmap.Config config = r.getConfig();
                        int b3 = mo10014b();
                        GLES20.glBindTexture(b3, this.f16092b);
                        C5059g.m13900f();
                        GLES20.glTexImage2D(b3, 0, internalFormat, mo10016d(), mo10015c(), 0, internalFormat, type, (Buffer) null);
                        Bitmap.Config config2 = config;
                        cVar.mo10030c(this, 0, 0, r, internalFormat, type);
                        if (width < d) {
                            cVar.mo10030c(this, width, 0, m13920s(true, config2, c), internalFormat, type);
                        }
                        if (height < c) {
                            cVar.mo10030c(this, 0, height, m13920s(false, config2, d), internalFormat, type);
                        }
                    }
                    mo10042o();
                    this.f16098h = cVar;
                    this.f16093c = 1;
                    this.f16137j = true;
                } catch (Throwable th) {
                    mo10042o();
                    throw th;
                }
            } else {
                this.f16093c = -1;
                throw new RuntimeException("Texture load fail, no bitmap");
            }
        } else {
            C5055c cVar2 = cVar;
            if (!this.f16137j) {
                Bitmap r2 = m13919r();
                cVar.mo10030c(this, 0, 0, r2, GLUtils.getInternalFormat(r2), GLUtils.getType(r2));
                mo10042o();
                this.f16137j = true;
            }
        }
    }

    /* renamed from: q */
    public final boolean mo10044q() {
        return mo10024k() && this.f16137j;
    }

    /* renamed from: t */
    public final boolean mo10037t() {
        return this.f16139m;
    }
}
