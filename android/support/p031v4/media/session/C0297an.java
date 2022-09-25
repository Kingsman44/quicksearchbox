package android.support.p031v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* renamed from: android.support.v4.media.session.an */
/* compiled from: PG */
final class C0297an {
    /* renamed from: a */
    static Bundle m766a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* renamed from: b */
    static void m767b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
