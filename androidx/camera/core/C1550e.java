package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import androidx.camera.core.p069a.p070a.C1284o;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.e */
/* compiled from: PG */
class C1550e implements C1331br {

    /* renamed from: a */
    public final Object f4260a = new Object();

    /* renamed from: b */
    public boolean f4261b = true;

    /* renamed from: c */
    private final ImageReader f4262c;

    public C1550e(ImageReader imageReader) {
        this.f4262c = imageReader;
    }

    /* renamed from: k */
    private static final boolean m4114k(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* renamed from: a */
    public final int mo4198a() {
        int height;
        synchronized (this.f4260a) {
            height = this.f4262c.getHeight();
        }
        return height;
    }

    /* renamed from: b */
    public final int mo4199b() {
        int imageFormat;
        synchronized (this.f4260a) {
            imageFormat = this.f4262c.getImageFormat();
        }
        return imageFormat;
    }

    /* renamed from: c */
    public final int mo4200c() {
        int maxImages;
        synchronized (this.f4260a) {
            maxImages = this.f4262c.getMaxImages();
        }
        return maxImages;
    }

    /* renamed from: d */
    public final int mo4201d() {
        int width;
        synchronized (this.f4260a) {
            width = this.f4262c.getWidth();
        }
        return width;
    }

    /* renamed from: e */
    public final Surface mo4202e() {
        Surface surface;
        synchronized (this.f4260a) {
            surface = this.f4262c.getSurface();
        }
        return surface;
    }

    /* renamed from: f */
    public C1473bs mo4203f() {
        Image image;
        synchronized (this.f4260a) {
            try {
                image = this.f4262c.acquireLatestImage();
            } catch (RuntimeException e) {
                if (m4114k(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            C1426b bVar = new C1426b(image);
            return bVar;
        }
    }

    /* renamed from: g */
    public C1473bs mo4204g() {
        Image image;
        synchronized (this.f4260a) {
            try {
                image = this.f4262c.acquireNextImage();
            } catch (RuntimeException e) {
                if (m4114k(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            C1426b bVar = new C1426b(image);
            return bVar;
        }
    }

    /* renamed from: h */
    public final void mo4205h() {
        synchronized (this.f4260a) {
            this.f4261b = true;
            this.f4262c.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    /* renamed from: i */
    public final void mo4206i() {
        synchronized (this.f4260a) {
            this.f4262c.close();
        }
    }

    /* renamed from: j */
    public final void mo4207j(C1330bq bqVar, Executor executor) {
        synchronized (this.f4260a) {
            this.f4261b = false;
            this.f4262c.setOnImageAvailableListener(new C1523d(this, executor, bqVar), C1284o.m3461a());
        }
    }
}
