package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import android.provider.CalendarContract;
import com.google.android.apps.gsa.tasks.C118467ab;
import com.google.android.apps.gsa.tasks.C118468ac;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.v */
/* compiled from: PG */
public final /* synthetic */ class C110562v implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ C110562v f308239a = new C110562v();

    private /* synthetic */ C110562v() {
    }

    /* renamed from: a */
    public final Object mo6453a() {
        int i = C110538ac.f308154l;
        C118467ab abVar = (C118467ab) C118468ac.f328813d.createBuilder();
        abVar.copyOnWrite();
        C118468ac acVar = (C118468ac) abVar.instance;
        acVar.f328815a |= 1;
        acVar.f328817c = 10000;
        abVar.mo103713a(CalendarContract.Events.CONTENT_URI.toString());
        return (C118468ac) abVar.build();
    }
}
