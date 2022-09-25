package androidx.camera.core;

import android.view.Surface;
import androidx.core.p097i.C1967b;

/* renamed from: androidx.camera.core.dn */
/* compiled from: PG */
public final /* synthetic */ class C1537dn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1967b f4236a;

    /* renamed from: b */
    public final /* synthetic */ Surface f4237b;

    public /* synthetic */ C1537dn(C1967b bVar, Surface surface) {
        this.f4236a = bVar;
        this.f4237b = surface;
    }

    public final void run() {
        this.f4236a.mo3353a(new C1560j(4, this.f4237b));
    }
}
