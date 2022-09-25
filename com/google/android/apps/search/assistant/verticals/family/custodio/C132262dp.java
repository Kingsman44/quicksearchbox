package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.p427am.p432b.p433a.C8623ab;
import com.google.p427am.p432b.p433a.C8624ac;
import com.google.p427am.p432b.p433a.C8640as;
import com.google.p427am.p432b.p433a.C8642au;
import com.google.p427am.p432b.p433a.C8664bp;
import com.google.p427am.p432b.p433a.C8685o;
import com.google.p427am.p432b.p433a.C8691u;
import com.google.p427am.p432b.p433a.C8693w;
import com.google.p427am.p432b.p433a.C8695y;
import com.google.p427am.p432b.p433a.C8696z;
import com.google.p4479cg.C58077i;
import com.google.p4479cg.C58081m;
import java.util.Calendar;
import java.util.HashSet;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dp */
/* compiled from: PG */
final class C132262dp {
    /* renamed from: a */
    public static String m214922a(Context context, C8685o oVar) {
        C58528ij N = C58528ij.m90014N(C58077i.MONDAY, C58077i.TUESDAY, C58077i.WEDNESDAY, C58077i.THURSDAY, C58077i.FRIDAY);
        C58528ij N2 = C58528ij.m90014N(C58077i.SUNDAY, C58077i.MONDAY, C58077i.TUESDAY, C58077i.WEDNESDAY, C58077i.THURSDAY);
        C58528ij K = C58528ij.m90011K(C58077i.SATURDAY, C58077i.SUNDAY);
        if (oVar.f30012b) {
            return context.getString(R.string.assistant_custodio_downtime_days_custom);
        }
        if (oVar.f30011a.size() > 0) {
            HashSet hashSet = new HashSet();
            for (C8664bp bpVar : oVar.f30011a) {
                C58077i a = C58077i.m88832a(bpVar.f29973a);
                if (a == null) {
                    a = C58077i.UNRECOGNIZED;
                }
                hashSet.add(a);
            }
            if (hashSet.equals(N)) {
                return context.getString(R.string.assistant_custodio_downtime_days_weekday);
            }
            if (hashSet.equals(K)) {
                return context.getString(R.string.assistant_custodio_downtime_days_weekend);
            }
            if (hashSet.equals(N2)) {
                return context.getString(R.string.assistant_custodio_downtime_days_school_night);
            }
        }
        return context.getString(R.string.assistant_custodio_downtime_days_custom);
    }

    /* renamed from: b */
    public static String m214923b(Context context, C8693w wVar) {
        int a = C8691u.m23375a(wVar.f30029a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i == 1) {
            return context.getString(R.string.assistant_custodio_music_settings_summary_allow_all);
        }
        if (i == 2) {
            return context.getString(R.string.assistant_custodio_music_settings_summary_block_explicit);
        }
        if (i != 3) {
            return null;
        }
        return context.getString(R.string.assistant_custodio_music_settings_summary_block_all);
    }

    /* renamed from: c */
    public static String m214924c(Context context, C8642au auVar) {
        int a = C8640as.m23358a(auVar.f29926a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i == 1) {
            return context.getString(R.string.assistant_custodio_video_settings_summary_allow_all);
        }
        if (i == 2) {
            return context.getString(R.string.assistant_custodio_video_settings_summary_block_explicit);
        }
        if (i != 3) {
            return null;
        }
        return context.getString(R.string.assistant_custodio_video_settings_summary_block_all);
    }

    /* renamed from: d */
    public static String m214925d(Context context, C8696z zVar, C8624ac acVar) {
        int a = C8695y.m23377a(zVar.f30034a);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int a2 = C8623ab.m23350a(acVar.f29889a);
        if (a2 != 0) {
            i = a2;
        }
        if (a == 4 && i == 4) {
            return context.getString(R.string.assistant_custodio_news_podcasts_settings_summary_both_blocked);
        }
        if (a == 4 && i == 3) {
            return context.getString(R.string.assistant_custodio_news_podcasts_settings_summary_news_blocked);
        }
        if (a == 3 && i == 4) {
            return context.getString(R.string.assistant_custodio_news_podcasts_settings_summary_podcasts_blocked);
        }
        if (a == 3 && i == 3) {
            return context.getString(R.string.assistant_custodio_news_podcasts_settings_summary_none_blocked);
        }
        return null;
    }

    /* renamed from: e */
    public static String m214926e(Context context, C8685o oVar) {
        if (oVar.f30011a.size() <= 0) {
            return null;
        }
        C8664bp bpVar = (C8664bp) oVar.f30011a.get(0);
        Object[] objArr = new Object[2];
        C58081m mVar = bpVar.f29974b;
        if (mVar == null) {
            mVar = C58081m.f155254e;
        }
        objArr[0] = m214927f(context, mVar);
        C58081m mVar2 = bpVar.f29975c;
        if (mVar2 == null) {
            mVar2 = C58081m.f155254e;
        }
        objArr[1] = m214927f(context, mVar2);
        return context.getString(R.string.assistant_custodio_downtime_settings_fragment_time_range, objArr);
    }

    /* renamed from: f */
    public static String m214927f(Context context, C58081m mVar) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, mVar.f155256a);
        instance.set(12, mVar.f155257b);
        return DateUtils.formatDateTime(context, instance.getTimeInMillis(), 1);
    }
}
