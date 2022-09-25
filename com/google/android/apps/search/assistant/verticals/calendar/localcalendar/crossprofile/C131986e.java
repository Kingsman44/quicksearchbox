package com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.C131994m;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.e */
/* compiled from: PG */
public final class C131986e {

    /* renamed from: a */
    public static final C131986e f360324a = new C131986e();

    /* renamed from: b */
    public static final Bundler f360325b = new CalendarProviderCalendarConfigurationFetcher_Bundler();

    /* renamed from: c */
    public final C142587l[] f360326c = {new C131985d()};

    private C131986e() {
    }

    /* renamed from: a */
    static final C131982a m214434a(Context context) {
        C132001s sVar = C132001s.f360340a;
        if (sVar.f360341b == null) {
            synchronized (C132001s.class) {
                if (sVar.f360341b == null) {
                    sVar.f360341b = new C131994m();
                }
            }
        }
        return ((C131994m.C131995a) C47266f.m84076a(context, C131994m.C131995a.class)).mo110370bB();
    }
}
