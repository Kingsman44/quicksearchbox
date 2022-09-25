package com.google.android.apps.search.googleapp.search.srp.error;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.p10318i.C136216e;
import com.google.android.apps.search.googleapp.p10318i.C136217f;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138791b;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.c */
/* compiled from: PG */
public final /* synthetic */ class C137804c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C137811j f374916a;

    /* renamed from: b */
    public final /* synthetic */ C136217f f374917b;

    public /* synthetic */ C137804c(C137811j jVar, C136217f fVar) {
        this.f374916a = jVar;
        this.f374917b = fVar;
    }

    public final void onClick(View view) {
        C137811j jVar = this.f374916a;
        C136216e a = C136216e.m221349a(this.f374917b.f370973b);
        if (a == null) {
            a = C136216e.GRANT_MIC_PERMISSION;
        }
        jVar.f374930g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C137824w wVar = C137824w.ERROR_REQUEST_DATA_UNAVAILABLE;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS").addCategory("android.intent.category.DEFAULT").setData(Uri.parse("package:".concat(String.valueOf(jVar.f374927d.getContext().getPackageName())))).addFlags(268435456).addFlags(1073741824).addFlags(8388608);
            jVar.f374931h.mo51345a(intent);
        } else if (ordinal != 9) {
            switch (ordinal) {
                case 2:
                    C47393f.m84237h(C137822u.f374964a, view);
                    return;
                case 3:
                case 7:
                    jVar.f374931h.mo51345a(new Intent("android.settings.WIFI_SETTINGS").setFlags(268435456));
                    return;
                case 4:
                    jVar.mo113975d();
                    return;
                case 5:
                    jVar.f374931h.mo51345a(new Intent("android.settings.AIRPLANE_MODE_SETTINGS").setFlags(268435456));
                    return;
                case 6:
                    jVar.f374931h.mo51345a(new Intent("android.settings.DATA_ROAMING_SETTINGS").setFlags(268435456));
                    return;
                default:
                    ((C58970a) ((C58970a) C137811j.f374924a.mo56226d()).mo56372aa(41041)).mo56389s("No handler for error card button %s", a.name());
                    return;
            }
        } else {
            C47393f.m84237h(C138791b.f377544a, view);
        }
    }
}
