package android.support.p031v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.u */
/* compiled from: PG */
final class C0326u {
    /* renamed from: a */
    static Bitmap m998a(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* renamed from: b */
    static MediaDescription.Builder m999b() {
        return new MediaDescription.Builder();
    }

    /* renamed from: c */
    static MediaDescription m1000c(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* renamed from: d */
    static Uri m1001d(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* renamed from: e */
    static Bundle m1002e(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* renamed from: f */
    static CharSequence m1003f(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* renamed from: g */
    static CharSequence m1004g(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* renamed from: h */
    static CharSequence m1005h(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* renamed from: i */
    static String m1006i(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* renamed from: j */
    static void m1007j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* renamed from: k */
    static void m1008k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: l */
    static void m1009l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* renamed from: m */
    static void m1010m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* renamed from: n */
    static void m1011n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* renamed from: o */
    static void m1012o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: p */
    static void m1013p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
