package androidx.camera.core;

import android.util.Size;

/* renamed from: androidx.camera.core.dd */
/* compiled from: PG */
public final class C1527dd extends C1414ao {

    /* renamed from: b */
    private final C1472br f4214b;

    /* renamed from: c */
    private final int f4215c;

    /* renamed from: d */
    private final int f4216d;

    public C1527dd(C1473bs bsVar, Size size, C1472br brVar) {
        super(bsVar);
        if (size == null) {
            this.f4215c = super.mo4302c();
            this.f4216d = super.mo4301b();
        } else {
            this.f4215c = size.getWidth();
            this.f4216d = size.getHeight();
        }
        this.f4214b = brVar;
    }

    /* renamed from: b */
    public final int mo4301b() {
        return this.f4216d;
    }

    /* renamed from: c */
    public final int mo4302c() {
        return this.f4215c;
    }

    /* renamed from: e */
    public final C1472br mo4305e() {
        return this.f4214b;
    }
}
