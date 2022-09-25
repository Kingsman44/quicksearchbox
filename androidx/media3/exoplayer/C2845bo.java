package androidx.media3.exoplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: androidx.media3.exoplayer.bo */
/* compiled from: PG */
public final class C2845bo implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: b */
    public static final /* synthetic */ int f7943b = 0;

    /* renamed from: a */
    public final /* synthetic */ C2848br f7944a;

    public C2845bo(C2848br brVar) {
        this.f7944a = brVar;
    }

    /* renamed from: a */
    public final void mo6570a(Surface surface) {
        this.f7944a.mo6596aM(surface);
    }

    /* renamed from: b */
    public final void mo6571b() {
        this.f7944a.mo6599aP();
    }

    /* renamed from: c */
    public final void mo6572c() {
        this.f7944a.mo6596aM((Object) null);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f7944a.mo6595aL(surfaceTexture);
        this.f7944a.mo6589aF(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f7944a.mo6596aM((Object) null);
        this.f7944a.mo6589aF(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f7944a.mo6589aF(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f7944a.mo6589aF(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C2848br brVar = this.f7944a;
        if (brVar.f8010w) {
            brVar.mo6596aM(surfaceHolder.getSurface());
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2848br brVar = this.f7944a;
        if (brVar.f8010w) {
            brVar.mo6596aM((Object) null);
        }
        this.f7944a.mo6589aF(0, 0);
    }
}
