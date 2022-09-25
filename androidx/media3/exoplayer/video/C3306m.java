package androidx.media3.exoplayer.video;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.video.m */
/* compiled from: PG */
final class C3306m implements DisplayManager.DisplayListener, C3304k {

    /* renamed from: a */
    public static final /* synthetic */ int f9972a = 0;

    /* renamed from: b */
    private final DisplayManager f9973b;

    /* renamed from: c */
    private C3302i f9974c;

    public C3306m(DisplayManager displayManager) {
        this.f9973b = displayManager;
    }

    /* renamed from: c */
    private final Display m9598c() {
        return this.f9973b.getDisplay(0);
    }

    /* renamed from: a */
    public final void mo7286a() {
        this.f9973b.unregisterDisplayListener(this);
        this.f9974c = null;
    }

    /* renamed from: b */
    public final void mo7287b(C3302i iVar) {
        this.f9974c = iVar;
        this.f9973b.registerDisplayListener(this, C2612ak.m6922E((Handler.Callback) null));
        iVar.f9970a.mo7295c(m9598c());
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        C3302i iVar = this.f9974c;
        if (iVar != null && i == 0) {
            iVar.f9970a.mo7295c(m9598c());
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
