package android.support.p031v4.media;

import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.r */
/* compiled from: PG */
final class C0281r extends C0280q {
    public C0281r(C0282s sVar) {
        super(sVar);
    }

    public final void onChildrenLoaded(String str, List list, Bundle bundle) {
        MediaSessionCompat.m652b(bundle);
        MediaBrowserCompat.MediaItem.m595a(list);
    }

    public final void onError(String str, Bundle bundle) {
        MediaSessionCompat.m652b(bundle);
    }
}
