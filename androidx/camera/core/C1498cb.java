package androidx.camera.core;

import android.graphics.Matrix;
import android.media.ImageReader;
import android.util.Size;
import androidx.camera.core.p069a.C1364cx;

/* renamed from: androidx.camera.core.cb */
/* compiled from: PG */
final class C1498cb extends C1550e {

    /* renamed from: c */
    public volatile C1364cx f4128c = null;

    /* renamed from: d */
    private volatile Long f4129d = null;

    /* renamed from: e */
    private volatile Integer f4130e = null;

    /* renamed from: f */
    private volatile Matrix f4131f = null;

    public C1498cb(ImageReader imageReader) {
        super(imageReader);
    }

    /* renamed from: k */
    private final C1473bs m4016k(C1473bs bsVar) {
        C1364cx cxVar;
        C1472br e = bsVar.mo4305e();
        if (this.f4128c != null) {
            cxVar = this.f4128c;
        } else {
            cxVar = e.mo4333d();
        }
        return new C1527dd(bsVar, (Size) null, new C1559i(cxVar, e.mo4331b(), e.mo4330a(), e.mo4332c()));
    }

    /* renamed from: f */
    public final C1473bs mo4203f() {
        return m4016k(super.mo4204g());
    }

    /* renamed from: g */
    public final C1473bs mo4204g() {
        return m4016k(super.mo4204g());
    }
}
