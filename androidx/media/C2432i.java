package androidx.media;

import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.p032os.ResultReceiver;

/* renamed from: androidx.media.i */
/* compiled from: PG */
final class C2432i extends C2449z {

    /* renamed from: a */
    final /* synthetic */ ResultReceiver f6714a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2432i(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f6714a = resultReceiver;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5853a(Object obj) {
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        if ((this.f6745h & 2) != 0) {
            this.f6714a.mo1096b(-1, (Bundle) null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem);
        this.f6714a.mo1096b(0, bundle);
    }
}
