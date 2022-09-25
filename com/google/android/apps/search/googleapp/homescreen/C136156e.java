package com.google.android.apps.search.googleapp.homescreen;

import android.os.Bundle;
import androidx.navigation.C3807af;
import androidx.navigation.C3825ax;
import androidx.navigation.C3896q;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e */
/* compiled from: PG */
final class C136156e implements C3896q {

    /* renamed from: a */
    final /* synthetic */ C136193o f370814a;

    public C136156e(C136193o oVar) {
        this.f370814a = oVar;
    }

    /* renamed from: a */
    public final void mo8090a(C3807af afVar, C3825ax axVar, Bundle bundle) {
        C69664n.m101061g(axVar, "destination");
        if (C69664n.m101066l(axVar.f12357f, C139779t.HOME_SCREEN.name())) {
            C136193o oVar = this.f370814a;
            if (!oVar.f370904Q) {
                oVar.f370904Q = true;
                oVar.mo112828n();
                return;
            }
        }
        if (this.f370814a.f370904Q && !C69664n.m101066l(axVar.f12357f, C139779t.HOME_SCREEN.name())) {
            this.f370814a.mo112826l(String.valueOf(axVar.f12357f));
        }
    }
}
