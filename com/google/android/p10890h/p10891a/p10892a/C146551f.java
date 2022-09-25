package com.google.android.p10890h.p10891a.p10892a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.RatingCompat;
import androidx.media3.common.p136b.C2612ak;
import java.util.Set;

/* renamed from: com.google.android.h.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C146551f {
    /* renamed from: a */
    public static boolean m238629a(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
        if (mediaMetadataCompat == mediaMetadataCompat2) {
            return true;
        }
        if (mediaMetadataCompat.f945b.size() != mediaMetadataCompat2.f945b.size()) {
            return false;
        }
        Set<String> keySet = mediaMetadataCompat.f945b.keySet();
        Bundle c = mediaMetadataCompat.mo818c();
        Bundle c2 = mediaMetadataCompat2.mo818c();
        for (String str : keySet) {
            Object obj = c.get(str);
            Object obj2 = c2.get(str);
            if (obj != obj2) {
                if (!(obj instanceof Bitmap) || !(obj2 instanceof Bitmap)) {
                    if ((obj instanceof RatingCompat) && (obj2 instanceof RatingCompat)) {
                        RatingCompat ratingCompat = (RatingCompat) obj;
                        RatingCompat ratingCompat2 = (RatingCompat) obj2;
                        if (ratingCompat.mo827i() != ratingCompat2.mo827i() || ratingCompat.mo828j() != ratingCompat2.mo828j() || ratingCompat.mo829k() != ratingCompat2.mo829k() || ratingCompat.mo823a() != ratingCompat2.mo823a() || ratingCompat.mo824b() != ratingCompat2.mo824b() || ratingCompat.f948a != ratingCompat2.f948a) {
                            return false;
                        }
                    } else if (!C2612ak.m6951aa(obj, obj2)) {
                        return false;
                    }
                } else if (!((Bitmap) obj).sameAs((Bitmap) obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
