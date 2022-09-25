package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.r */
/* compiled from: PG */
public final /* synthetic */ class C123641r implements C42844bc {

    /* renamed from: a */
    public static final /* synthetic */ C123641r f341572a = new C123641r();

    private /* synthetic */ C123641r() {
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        Cursor d = bfVar.mo45932d(C123611ad.f341535a);
        try {
            Long valueOf = Long.valueOf(d.moveToFirst() ? d.getLong(d.getColumnIndexOrThrow("next_alarm_trigger_time")) : 0);
            if (d != null) {
                d.close();
            }
            return valueOf;
        } catch (Throwable th) {
            C123633j.m203004a(th, th);
        }
        throw th;
    }
}
