package androidx.media3.exoplayer.p150j;

import android.media.Spatializer;

/* renamed from: androidx.media3.exoplayer.j.t */
/* compiled from: PG */
public final class C3224t implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: a */
    final /* synthetic */ C3195ab f9690a;

    public C3224t(C3195ab abVar) {
        this.f9690a = abVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f9690a.mo7204d();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f9690a.mo7204d();
    }
}
