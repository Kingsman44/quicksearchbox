package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.common.p4575r.C60755l;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.k */
/* compiled from: PG */
abstract class C111621k {

    /* renamed from: a */
    public MediaBrowserCompat.MediaItem f310373a;

    /* renamed from: d */
    public static C111621k m185400d(MediaBrowserCompat.MediaItem mediaItem) {
        C60755l lVar;
        MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
        CharSequence charSequence = mediaDescriptionCompat.f933b;
        String obj = charSequence != null ? charSequence.toString() : null;
        Uri uri = mediaDescriptionCompat.f937f;
        Bitmap bitmap = mediaDescriptionCompat.f936e;
        if (bitmap == null) {
            lVar = C60755l.f164796a;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            if (i == 0) {
                lVar = C60755l.f164796a;
            } else {
                int[] copyOf = Arrays.copyOf(iArr, i);
                lVar = new C60755l(copyOf, copyOf.length);
            }
        }
        C111604a aVar = new C111604a(obj, uri, lVar);
        aVar.f310373a = mediaItem;
        return aVar;
    }

    /* renamed from: a */
    public abstract Uri mo99188a();

    /* renamed from: b */
    public abstract C60755l mo99189b();

    /* renamed from: c */
    public abstract String mo99190c();
}
