package androidx.media;

import android.os.Parcel;
import android.support.p031v4.media.MediaBrowserCompat;

/* renamed from: androidx.media.s */
/* compiled from: PG */
final class C2442s extends C2449z {

    /* renamed from: a */
    final /* synthetic */ C2403aa f6736a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2442s(Object obj, C2403aa aaVar) {
        super(obj);
        this.f6736a = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5853a(Object obj) {
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        if (mediaItem == null) {
            this.f6736a.mo5816a((Object) null);
            return;
        }
        Parcel obtain = Parcel.obtain();
        mediaItem.writeToParcel(obtain, 0);
        this.f6736a.mo5816a(obtain);
    }

    /* renamed from: b */
    public final void mo5857b() {
        this.f6736a.f6644a.detach();
    }
}
