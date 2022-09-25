package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.u */
/* compiled from: PG */
public final /* synthetic */ class C130226u implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C130230y f356996a;

    public /* synthetic */ C130226u(C130230y yVar) {
        this.f356996a = yVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C130230y yVar = this.f356996a;
        if ("ms-android-google".equals(Uri.parse(lVar.f113296b).getQueryParameter("client"))) {
            yVar.mo109584b(lVar);
            return;
        }
        Intent a = C19601c.m37394a("inappwebpage", new Intent("android.intent.action.VIEW", Uri.parse(lVar.f113296b)), new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.NoOrientationConfigVelvetDynamicHostActivity"), true);
        a.putExtra("full_screen", true);
        yVar.f357016q.mo19974a(C37176a.f97259iF.mo40805c(C62722b.OK));
        C46439e eVar = yVar.f357010k;
        C46438d b = C46438d.m82810b(yVar.f357002c.mo20101f(a));
        eVar.mo50428h(b.f121541a, (Object) null, yVar.f357011l);
    }
}
