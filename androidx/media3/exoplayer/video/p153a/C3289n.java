package androidx.media3.exoplayer.video.p153a;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.exoplayer.C2845bo;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.video.a.n */
/* compiled from: PG */
public final /* synthetic */ class C3289n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3292q f9892a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f9893b;

    public /* synthetic */ C3289n(C3292q qVar, SurfaceTexture surfaceTexture) {
        this.f9892a = qVar;
        this.f9893b = surfaceTexture;
    }

    public final void run() {
        C3292q qVar = this.f9892a;
        SurfaceTexture surfaceTexture = this.f9893b;
        SurfaceTexture surfaceTexture2 = qVar.f9909d;
        Surface surface = qVar.f9910e;
        Surface surface2 = new Surface(surfaceTexture);
        qVar.f9909d = surfaceTexture;
        qVar.f9910e = surface2;
        Iterator it = qVar.f9906a.iterator();
        while (it.hasNext()) {
            ((C2845bo) it.next()).mo6570a(surface2);
        }
        C3292q.m9544a(surfaceTexture2, surface);
    }
}
