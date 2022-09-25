package androidx.camera.core;

import android.view.Surface;
import androidx.core.p097i.C1967b;

/* renamed from: androidx.camera.core.dm */
/* compiled from: PG */
public final /* synthetic */ class C1536dm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1967b f4234a;

    /* renamed from: b */
    public final /* synthetic */ Surface f4235b;

    public /* synthetic */ C1536dm(C1967b bVar, Surface surface) {
        this.f4234a = bVar;
        this.f4235b = surface;
    }

    public final void run() {
        this.f4234a.mo3353a(new C1560j(3, this.f4235b));
    }
}
