package com.google.android.apps.gsa.staticplugins.smartspace.p8763d;

import android.provider.CalendarContract;
import com.google.android.apps.gsa.tasks.C118467ab;
import com.google.android.apps.gsa.tasks.C118468ac;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.d.c */
/* compiled from: PG */
public final /* synthetic */ class C117374c implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ C117374c f325835a = new C117374c();

    private /* synthetic */ C117374c() {
    }

    /* renamed from: a */
    public final Object mo6453a() {
        int i = C117375d.f325836c;
        C118467ab abVar = (C118467ab) C118468ac.f328813d.createBuilder();
        abVar.copyOnWrite();
        C118468ac acVar = (C118468ac) abVar.instance;
        acVar.f328815a |= 1;
        acVar.f328817c = 1000;
        abVar.mo103713a(CalendarContract.Events.CONTENT_URI.toString());
        return (C118468ac) abVar.build();
    }
}
