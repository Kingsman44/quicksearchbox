package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.be */
/* compiled from: PG */
public final /* synthetic */ class C114808be implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114809bf f318563a;

    /* renamed from: b */
    public final /* synthetic */ long f318564b;

    /* renamed from: c */
    public final /* synthetic */ List f318565c;

    /* renamed from: d */
    public final /* synthetic */ long f318566d;

    public /* synthetic */ C114808be(C114809bf bfVar, long j, List list, long j2) {
        this.f318563a = bfVar;
        this.f318564b = j;
        this.f318565c = list;
        this.f318566d = j2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114809bf bfVar = this.f318563a;
        long j = this.f318564b;
        List list = this.f318565c;
        long j2 = this.f318566d;
        if (((Long) obj).longValue() < j) {
            C114883o oVar = new C114883o();
            oVar.mo101614f(5);
            oVar.mo101612d(bfVar.f318567a.getString(R.string.whats_the_weather_tomorrow));
            oVar.mo101613e(j2);
            list.add(oVar.mo101616h());
        }
        return list;
    }
}
