package com.google.android.apps.search.podcasts.p10565f;

import android.view.View;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.apps.tiktok.dataservice.C46778cv;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.f.g */
/* compiled from: PG */
final class C140311g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140287ah f381167a;

    /* renamed from: b */
    final /* synthetic */ C140285af f381168b;

    public C140311g(C140287ah ahVar, C140285af afVar) {
        this.f381167a = ahVar;
        this.f381168b = afVar;
    }

    public final void onClick(View view) {
        C140641b bVar = this.f381167a.f381132a;
        C140285af afVar = this.f381168b;
        C46778cv cvVar = afVar.f381121e;
        C140084z zVar = afVar.f381122f;
        long millis = Duration.ofSeconds(bVar.f381981h).toMillis();
        C140644e eVar = bVar.f381984k;
        if (eVar == null) {
            eVar = C140644e.f381988d;
        }
        cvVar.mo50787a(zVar.mo115434c(bVar, millis, eVar.f381992c, false), C140192a.f380885a);
    }
}
