package com.google.android.apps.search.googleapp.incognito;

import android.app.Activity;
import com.google.android.apps.search.googleapp.incognito.p10323d.C136245c;
import com.google.android.libraries.search.p3025k.C38559n;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.inject.C47245e;

/* renamed from: com.google.android.apps.search.googleapp.incognito.a */
/* compiled from: PG */
public final class C136226a {

    /* renamed from: a */
    private final C38559n f371003a;

    /* renamed from: b */
    private final C136245c f371004b;

    public C136226a(C38559n nVar, C136245c cVar) {
        this.f371003a = nVar;
        this.f371004b = cVar;
    }

    /* renamed from: a */
    public final void mo112852a(Activity activity, C45986ax axVar) {
        if (!this.f371004b.mo112857a()) {
            return;
        }
        if (axVar.f120817b.equals("incognito")) {
            activity.getWindow().setFlags(8192, 8192);
        } else {
            activity.getWindow().clearFlags(8192);
        }
    }

    /* renamed from: b */
    public final void mo112853b(C45985aw awVar) {
        if (this.f371004b.mo112857a()) {
            C38559n nVar = this.f371003a;
            if (awVar.f120815a.f120817b.equals("incognito")) {
                ((C38559n.C38560a) C47245e.m84045a(nVar.f101938a, C38559n.C38560a.class, awVar.f120815a.f120816a)).mo41487fQ().f101930a = true;
            }
        }
    }
}
