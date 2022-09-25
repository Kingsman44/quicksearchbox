package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f;

import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1041a.C13905a;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51454ih;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52197iv;
import com.google.assistant.p3897e.p3921j.C52198iw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.f.h */
/* compiled from: PG */
public final class C13983h {

    /* renamed from: a */
    public static final C58495hd f42574a;

    /* renamed from: b */
    private static final C59071e f42575b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.a.f.h");

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
        f42574a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static RatingCompat m30274a(C52198iw iwVar, C0320v vVar) {
        if ((iwVar.f136997a & 4) == 0) {
            return null;
        }
        int a = C52197iv.m86538a(iwVar.f136999c);
        if (a != 0 && a == 2) {
            int a2 = vVar.mo1033a();
            switch (a2) {
                case 1:
                    return RatingCompat.m607c(false);
                case 2:
                    return RatingCompat.m610f(false);
                case 3:
                case 4:
                case 5:
                    return RatingCompat.m609e(a2, 0.0f);
                case 6:
                    return RatingCompat.m608d(0.0f);
                default:
                    ((C59052c) ((C59052c) f42575b.mo56226d()).mo56372aa(45258)).mo56386p("#getTargetNegativeRating: Unknown ratingType in current mediacontroller.");
                    return null;
            }
        } else {
            int a3 = vVar.mo1033a();
            switch (a3) {
                case 1:
                    return RatingCompat.m607c(true);
                case 2:
                    return RatingCompat.m610f(true);
                case 3:
                    return RatingCompat.m609e(a3, 3.0f);
                case 4:
                    return RatingCompat.m609e(a3, 4.0f);
                case 5:
                    return RatingCompat.m609e(a3, 5.0f);
                case 6:
                    return RatingCompat.m608d(100.0f);
                default:
                    ((C59052c) ((C59052c) f42575b.mo56226d()).mo56372aa(45260)).mo56386p("#getTargetPositiveRating: Unknown ratingType in current media controller.");
                    return null;
            }
        }
    }

    /* renamed from: b */
    public static String m30275b(String str, CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        return "Got error " + valueOf + " from media app " + str;
    }

    /* renamed from: c */
    public static String m30276c(C51098gh ghVar) {
        C51058ev evVar;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if ((evVar.f132943a & 1) == 0) {
            return null;
        }
        return (ghVar.f133012b == 1 ? (C51058ev) ghVar.f133013c : C51058ev.f132941o).f132944b;
    }

    /* renamed from: d */
    public static List m30277d(long j) {
        ArrayList arrayList = new ArrayList();
        C58800sl lA = C13905a.f42346b.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if ((((Long) entry.getKey()).longValue() & j) != 0) {
                arrayList.add((C51454ih) entry.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static boolean m30278e(C0320v vVar) {
        PlaybackStateCompat f = vVar.mo1038f();
        return f != null && f.f994a == 7 && f.f999f == 3;
    }

    /* renamed from: f */
    public static boolean m30279f(C0320v vVar, long j) {
        PlaybackStateCompat f = vVar.mo1038f();
        if (f == null) {
            ((C59052c) ((C59052c) f42575b.mo56226d()).mo56372aa(45263)).mo56386p("#isActionSupported: PlaybackState is null.");
            return false;
        } else if ((f.f998e & j) == j) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m30280g(PlaybackStateCompat playbackStateCompat) {
        boolean z = true;
        if (playbackStateCompat.f994a != 7 && playbackStateCompat.f999f == 0) {
            z = false;
        }
        if (z) {
            ((C59052c) ((C59052c) f42575b.mo56226d()).mo56372aa(45264)).mo56393w("PlaybackState = %s, PlaybackState ErrorCode = %s", playbackStateCompat.f994a, playbackStateCompat.f999f);
        }
        return z;
    }
}
