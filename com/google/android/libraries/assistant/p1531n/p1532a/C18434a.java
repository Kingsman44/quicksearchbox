package com.google.android.libraries.assistant.p1531n.p1532a;

import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52197iv;
import com.google.assistant.p3897e.p3921j.C52198iw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.n.a.a */
/* compiled from: PG */
public final class C18434a {

    /* renamed from: a */
    public static final C58495hd f52325a;

    /* renamed from: b */
    private static final C59071e f52326b = C59071e.m91332i("com.google.android.libraries.assistant.n.a.a");

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(0, C52179id.UNKNOWN_MEDIA_ERROR);
        gzVar.mo55429h(1, C52179id.APP_ERROR);
        gzVar.mo55429h(2, C52179id.NOT_SUPPORTED);
        gzVar.mo55429h(3, C52179id.AUTHENTICATION_EXPIRED);
        gzVar.mo55429h(4, C52179id.PREMIUM_ACCOUNT_REQUIRED);
        gzVar.mo55429h(5, C52179id.CONCURRENT_STREAM_LIMIT);
        gzVar.mo55429h(6, C52179id.PARENTAL_CONTROL_RESTRICTED);
        gzVar.mo55429h(7, C52179id.NOT_AVAILABLE_IN_REGION);
        gzVar.mo55429h(9, C52179id.SKIP_LIMIT_REACHED);
        gzVar.mo55429h(10, C52179id.ACTION_ABORTED);
        gzVar.mo55429h(11, C52179id.END_OF_QUEUE);
        f52325a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static Optional m35905a(C52198iw iwVar, C0320v vVar) {
        if ((iwVar.f136997a & 4) == 0) {
            return Optional.empty();
        }
        int a = C52197iv.m86538a(iwVar.f136999c);
        if (a != 0 && a == 2) {
            int a2 = vVar.mo1033a();
            switch (a2) {
                case 1:
                    return Optional.m71637of(RatingCompat.m607c(false));
                case 2:
                    return Optional.m71637of(RatingCompat.m610f(false));
                case 3:
                case 4:
                case 5:
                    return Optional.m71637of(RatingCompat.m609e(a2, 0.0f));
                case 6:
                    return Optional.m71637of(RatingCompat.m608d(0.0f));
                default:
                    ((C59052c) ((C59052c) f52326b.mo56226d()).mo56372aa(47323)).mo56386p("#getTargetNegativeRating: Unknown ratingType in current mediacontroller.");
                    return Optional.empty();
            }
        } else {
            int a3 = vVar.mo1033a();
            switch (a3) {
                case 1:
                    return Optional.m71637of(RatingCompat.m607c(true));
                case 2:
                    return Optional.m71637of(RatingCompat.m610f(true));
                case 3:
                    return Optional.m71637of(RatingCompat.m609e(a3, 3.0f));
                case 4:
                    return Optional.m71637of(RatingCompat.m609e(a3, 4.0f));
                case 5:
                    return Optional.m71637of(RatingCompat.m609e(a3, 5.0f));
                case 6:
                    return Optional.m71637of(RatingCompat.m608d(100.0f));
                default:
                    ((C59052c) ((C59052c) f52326b.mo56226d()).mo56372aa(47325)).mo56386p("#getTargetPositiveRating: Unknown ratingType in current media controller.");
                    return Optional.empty();
            }
        }
    }

    /* renamed from: b */
    public static boolean m35906b(C0320v vVar) {
        PlaybackStateCompat f = vVar.mo1038f();
        return f != null && f.f994a == 7 && f.f999f == 3;
    }

    /* renamed from: c */
    public static boolean m35907c(C0320v vVar, long j) {
        PlaybackStateCompat f = vVar.mo1038f();
        if (f == null) {
            ((C59052c) ((C59052c) f52326b.mo56226d()).mo56372aa(47327)).mo56386p("#isActionSupported: PlaybackState is null.");
            return false;
        } else if ((f.f998e & j) == j) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m35908d(PlaybackStateCompat playbackStateCompat) {
        return playbackStateCompat.f994a == 7 || playbackStateCompat.f999f != 0;
    }
}
