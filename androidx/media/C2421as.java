package androidx.media;

import android.media.VolumeProvider;

/* renamed from: androidx.media.as */
/* compiled from: PG */
final class C2421as extends VolumeProvider {

    /* renamed from: a */
    final /* synthetic */ C2423au f6696a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2421as(C2423au auVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.f6696a = auVar;
    }

    public final void onAdjustVolume(int i) {
        this.f6696a.mo5848b(i);
    }

    public final void onSetVolumeTo(int i) {
        this.f6696a.mo5849c(i);
    }
}
