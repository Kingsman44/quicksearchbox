package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.C131982a;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.C131989h;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.C131990i;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.C131991j;
import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.at */
/* compiled from: PG */
public final class C131968at {

    /* renamed from: a */
    private static final C47351i f360309a = C47351i.m84169a("assistant_calendar_local_calendar");

    /* renamed from: c */
    public static C131991j m214418c(Context context) {
        return new C131991j(new C131990i(context));
    }

    /* renamed from: d */
    public static C131989h m214419d(C131991j jVar) {
        return new C131989h(jVar);
    }

    /* renamed from: a */
    static C131982a m214416a(boolean z, C69464a aVar, C69464a aVar2) {
        if (z) {
            return (C131982a) aVar2.mo17428b();
        }
        return (C131982a) aVar.mo17428b();
    }

    /* renamed from: b */
    public static Set m214417b(C69464a aVar, boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        C47354l lVar = new C47354l();
        lVar.f123076a = f360309a;
        lVar.f123078c = aVar;
        C47346d dVar = new C47346d();
        dVar.mo51220c(24, TimeUnit.HOURS);
        lVar.f123077b = dVar.mo51218a();
        return new C58759qy(lVar.mo51226a());
    }
}
