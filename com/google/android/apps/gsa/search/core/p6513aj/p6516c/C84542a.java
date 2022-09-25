package com.google.android.apps.gsa.search.core.p6513aj.p6516c;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.search.core.aj.c.a */
/* compiled from: PG */
public final class C84542a {

    /* renamed from: a */
    public final Context f230073a;

    /* renamed from: b */
    public final C85919cm f230074b;

    /* renamed from: c */
    public final C85929cw f230075c;

    /* renamed from: d */
    private final C91097g f230076d;

    public C84542a(Context context, C85919cm cmVar, C85929cw cwVar, C91097g gVar) {
        this.f230073a = context;
        this.f230074b = cmVar;
        this.f230075c = cwVar;
        this.f230076d = gVar;
    }

    /* renamed from: a */
    public final void mo78261a(Intent intent) {
        intent.putExtra("LAUNCH_EXTERNAL_ACTIVITY", true);
        this.f230076d.mo65089a(intent);
    }
}
