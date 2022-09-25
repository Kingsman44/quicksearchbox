package com.google.android.apps.search.weather.p10681a.p10682a;

import android.view.View;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.weather.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C142050c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C142055h f385411a;

    public /* synthetic */ C142050c(C142055h hVar) {
        this.f385411a = hVar;
    }

    public final void onClick(View view) {
        C47477n nVar = this.f385411a.f385426j;
        C47474k g = C47475l.m84477g();
        ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        g.mo51310d(true);
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.KEY_VALUE);
        aVar.f121916a = C63088z.m96143E("yes");
        aVar.mo50684b(false);
        g.mo51333f("tng-weather-feedback", aVar.mo50683a());
        nVar.mo51336a(g.mo51332e());
    }
}
