package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.p069a.C1364cx;

/* renamed from: androidx.camera.core.b */
/* compiled from: PG */
final class C1426b implements C1473bs {

    /* renamed from: a */
    private final Image f3982a;

    /* renamed from: b */
    private final C1235a[] f3983b;

    /* renamed from: c */
    private final C1472br f3984c;

    public C1426b(Image image) {
        this.f3982a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f3983b = new C1235a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f3983b[i] = new C1235a(planes[i]);
            }
        } else {
            this.f3983b = new C1235a[0];
        }
        this.f3984c = new C1559i(C1364cx.f3852a, image.getTimestamp(), 0, new Matrix());
    }

    /* renamed from: a */
    public final int mo4300a() {
        return this.f3982a.getFormat();
    }

    /* renamed from: b */
    public final int mo4301b() {
        return this.f3982a.getHeight();
    }

    /* renamed from: c */
    public final int mo4302c() {
        return this.f3982a.getWidth();
    }

    public final void close() {
        this.f3982a.close();
    }

    /* renamed from: d */
    public final Image mo4304d() {
        return this.f3982a;
    }

    /* renamed from: e */
    public final C1472br mo4305e() {
        return this.f3984c;
    }

    /* renamed from: f */
    public final C1235a[] mo4306f() {
        return this.f3983b;
    }
}
