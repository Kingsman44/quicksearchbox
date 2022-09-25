package com.google.android.apps.search.podcasts.settings;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.android.apps.search.podcasts.settings.p10612a.C141057j;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.v */
/* compiled from: PG */
final class C141102v implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f383089a;

    /* renamed from: b */
    final /* synthetic */ C141098t f383090b;

    public C141102v(int i, C141098t tVar) {
        this.f383089a = i;
        this.f383090b = tVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C69664n.m101059e(dialogInterface, "null cannot be cast to non-null type android.support.v7.app.AlertDialog");
        int checkedItemPosition = ((C0392m) dialogInterface).f1349a.f1106f.getCheckedItemPosition();
        if (checkedItemPosition != this.f383089a) {
            Object obj = C141098t.f383069b.get(checkedItemPosition);
            C69664n.m101060f(obj, "OPTIONS_FOR_THEME_SETTING[newSelectedIndex]");
            C140449ak akVar = (C140449ak) obj;
            C141098t tVar = this.f383090b;
            C46439e eVar = tVar.f383074g;
            C141057j jVar = tVar.f383072e;
            C69664n.m101061g(akVar, "themeSettings");
            C60870cx g = jVar.f382964a.mo115682g(akVar);
            C69664n.m101060f(g, "preferencesManager.setThemeSettings(themeSettings)");
            eVar.mo50445g(C46438d.m82810b(g), new C46436b(Integer.valueOf(akVar.getNumber())), this.f383090b.f383083p);
        }
    }
}
