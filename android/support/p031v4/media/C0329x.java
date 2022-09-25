package android.support.p031v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.x */
/* compiled from: PG */
public final class C0329x {

    /* renamed from: a */
    public final Bundle f1053a;

    public C0329x() {
        this.f1053a = new Bundle();
    }

    /* renamed from: a */
    public final MediaMetadataCompat mo1090a() {
        return new MediaMetadataCompat(this.f1053a);
    }

    /* renamed from: b */
    public final void mo1091b(String str, Bitmap bitmap) {
        if (!MediaMetadataCompat.f941a.containsKey(str) || ((Integer) MediaMetadataCompat.f941a.get(str)).intValue() == 2) {
            this.f1053a.putParcelable(str, bitmap);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
    }

    /* renamed from: c */
    public final void mo1092c(String str, long j) {
        if (!MediaMetadataCompat.f941a.containsKey(str) || ((Integer) MediaMetadataCompat.f941a.get(str)).intValue() == 0) {
            this.f1053a.putLong(str, j);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
    }

    /* renamed from: d */
    public final void mo1093d(String str, String str2) {
        if (!MediaMetadataCompat.f941a.containsKey(str) || ((Integer) MediaMetadataCompat.f941a.get(str)).intValue() == 1) {
            this.f1053a.putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
    }

    public C0329x(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.f945b);
        this.f1053a = bundle;
        MediaSessionCompat.m652b(bundle);
    }
}
