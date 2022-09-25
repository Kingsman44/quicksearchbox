package com.google.android.gms.cast.framework.p10772a;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.cast.framework.C143410ar;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.internal.C143437ac;
import com.google.android.gms.cast.framework.p10772a.p10773a.C143384c;
import com.google.android.gms.cast.framework.p10772a.p10773a.C143385d;
import com.google.android.gms.cast.framework.p10772a.p10773a.C143386e;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146042v;

/* renamed from: com.google.android.gms.cast.framework.a.a */
/* compiled from: PG */
public final /* synthetic */ class C143381a implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ C143392c f388844a;

    /* renamed from: b */
    public final /* synthetic */ String f388845b;

    /* renamed from: c */
    public final /* synthetic */ SharedPreferences f388846c;

    public /* synthetic */ C143381a(C143392c cVar, String str, SharedPreferences sharedPreferences) {
        this.f388844a = cVar;
        this.f388845b = str;
        this.f388846c = sharedPreferences;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        C143392c cVar = this.f388844a;
        String str = this.f388845b;
        C143410ar arVar = cVar.f388893c;
        C143437ac acVar = cVar.f388894d;
        C143386e eVar = new C143386e(this.f388846c, cVar, (Bundle) obj, str);
        cVar.f388895e.mo118647e(eVar.f388854d);
        arVar.mo118623c(new C143384c(eVar), C143466m.class);
        if (acVar != null) {
            C143385d dVar = new C143385d(eVar);
            C143437ac.f388967a.mo118884b("register callback = %s", dVar);
            C143919bh.m233964g("Must be called from the main thread.");
            acVar.f388968b.add(dVar);
        }
    }
}
