package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.p069a.p070a.p072b.C1255d;

/* renamed from: androidx.camera.core.cy */
/* compiled from: PG */
final class C1521cy implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C1522cz f4190a;

    public C1521cy(C1522cz czVar) {
        this.f4190a = czVar;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        C1477bw.m3981d("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        Surface surface = (Surface) obj;
        synchronized (this.f4190a.f4191a) {
            this.f4190a.f4195e.mo4165e(surface, 1);
        }
    }
}
