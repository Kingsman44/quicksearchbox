package androidx.media;

import android.media.VolumeProvider;

/* renamed from: androidx.media.ar */
/* compiled from: PG */
final class C2420ar extends VolumeProvider {

    /* renamed from: a */
    final /* synthetic */ C2423au f6695a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2420ar(C2423au auVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.f6695a = auVar;
    }

    public final void onAdjustVolume(int i) {
        this.f6695a.mo5848b(i);
    }

    public final void onSetVolumeTo(int i) {
        this.f6695a.mo5849c(i);
    }
}
