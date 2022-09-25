package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.C143596v;

/* renamed from: com.google.android.gms.cast.ad */
/* compiled from: PG */
public final /* synthetic */ class C143346ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143353ak f388760a;

    /* renamed from: b */
    public final /* synthetic */ ApplicationStatus f388761b;

    public /* synthetic */ C143346ad(C143353ak akVar, ApplicationStatus applicationStatus) {
        this.f388760a = akVar;
        this.f388761b = applicationStatus;
    }

    public final void run() {
        boolean z;
        C143353ak akVar = this.f388760a;
        ApplicationStatus applicationStatus = this.f388761b;
        C143354al alVar = akVar.f388775a;
        String str = applicationStatus.f389250a;
        if (!C143596v.m233278k(str, alVar.f388789k)) {
            alVar.f388789k = str;
            z = true;
        } else {
            z = false;
        }
        C143354al.f388778a.mo118884b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(alVar.f388782d));
        C143557h hVar = alVar.f388798t;
        if (hVar != null && (z || alVar.f388782d)) {
            hVar.mo118712d();
        }
        alVar.f388782d = false;
    }
}
