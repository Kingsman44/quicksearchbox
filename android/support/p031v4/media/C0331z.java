package android.support.p031v4.media;

import android.media.Rating;

/* renamed from: android.support.v4.media.z */
/* compiled from: PG */
public final class C0331z {
    /* renamed from: a */
    public static float m1020a(Rating rating) {
        return rating.getPercentRating();
    }

    /* renamed from: b */
    public static float m1021b(Rating rating) {
        return rating.getStarRating();
    }

    /* renamed from: c */
    public static int m1022c(Rating rating) {
        return rating.getRatingStyle();
    }

    /* renamed from: d */
    static Rating m1023d(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* renamed from: e */
    static Rating m1024e(float f) {
        return Rating.newPercentageRating(f);
    }

    /* renamed from: f */
    static Rating m1025f(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* renamed from: g */
    static Rating m1026g(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* renamed from: h */
    static Rating m1027h(int i) {
        return Rating.newUnratedRating(i);
    }

    /* renamed from: i */
    public static boolean m1028i(Rating rating) {
        return rating.hasHeart();
    }

    /* renamed from: j */
    public static boolean m1029j(Rating rating) {
        return rating.isRated();
    }

    /* renamed from: k */
    public static boolean m1030k(Rating rating) {
        return rating.isThumbUp();
    }
}
