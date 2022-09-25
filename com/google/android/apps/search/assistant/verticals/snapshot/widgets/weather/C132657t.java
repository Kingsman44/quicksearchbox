package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132659v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.t */
/* compiled from: PG */
public final /* synthetic */ class C132657t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132659v.C132660a f362009a;

    /* renamed from: b */
    public final /* synthetic */ Context f362010b;

    public /* synthetic */ C132657t(C132659v.C132660a aVar, Context context) {
        this.f362009a = aVar;
        this.f362010b = context;
    }

    public final Object apply(Object obj) {
        C132659v.C132660a aVar = this.f362009a;
        Context context = this.f362010b;
        if (((Boolean) obj).booleanValue()) {
            C132606ay bB = aVar.mo110868bB();
            Intent a = bB.f361896m.mo111301a(bB.f361890g);
            a.addFlags(268435456);
            C47810es.m84979s(context, a);
            return null;
        }
        C58976aa aaVar = C58975e.f156826a;
        return null;
    }
}
