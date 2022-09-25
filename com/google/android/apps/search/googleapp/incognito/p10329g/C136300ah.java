package com.google.android.apps.search.googleapp.incognito.p10329g;

import androidx.work.C4634o;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.ah */
/* compiled from: PG */
public final /* synthetic */ class C136300ah implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C136304al f371119a;

    public /* synthetic */ C136300ah(C136304al alVar) {
        this.f371119a = alVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C136304al alVar = this.f371119a;
        C46578l lVar = alVar.f371123b;
        C136299ag agVar = alVar.f371124c;
        C46582p j = C46586t.m83063j(C136299ag.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.search.googleapp.IncognitoTimeoutWorker", C4634o.REPLACE));
        dVar.f121754c = new C46573g(agVar.f371115a, TimeUnit.MILLISECONDS);
        return lVar.mo50546b(j.mo50561a());
    }
}
