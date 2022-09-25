package com.google.android.apps.gsa.tasks.p8848a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.tasks.a.c */
/* compiled from: PG */
public final class C118455c implements C118549h {

    /* renamed from: a */
    private static final C59071e f328796a = C59071e.m91332i("com.google.android.apps.gsa.tasks.a.c");

    /* renamed from: b */
    private final C118561t f328797b;

    public C118455c(C118561t tVar) {
        this.f328797b = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        ((C59052c) ((C59052c) f328796a.mo56224b()).mo56372aa(34015)).mo56386p("Task running");
        C118561t tVar = this.f328797b;
        C118522by byVar = C118522by.DEBUG_REPEAT_SCHEDULE;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long millis = TimeUnit.SECONDS.toMillis(10);
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = millis;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
        return C118826c.f331423b;
    }
}
