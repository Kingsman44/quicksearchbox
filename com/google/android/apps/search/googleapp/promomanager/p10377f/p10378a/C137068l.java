package com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.a.l */
/* compiled from: PG */
final class C137068l implements C137057a {

    /* renamed from: a */
    private static final C59071e f373005a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.a.l");

    /* renamed from: b */
    private final Context f373006b;

    public C137068l(Fragment fragment) {
        this.f373006b = fragment.getContext();
    }

    /* renamed from: a */
    public final boolean mo113483a(C63944h hVar) {
        C59052c cVar = (C59052c) ((C59052c) f373005a.mo56224b()).mo56372aa(40924);
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("#executeAction(%s)", a.name());
        return AppWidgetManager.getInstance(this.f373006b).requestPinAppWidget(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.googlequicksearchbox.SearchWidgetProvider"), (Bundle) null, (PendingIntent) null);
    }
}
