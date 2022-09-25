package android.support.p031v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.v */
/* compiled from: PG */
final class C0327v {
    /* renamed from: a */
    static Uri m1014a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* renamed from: b */
    static void m1015b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
