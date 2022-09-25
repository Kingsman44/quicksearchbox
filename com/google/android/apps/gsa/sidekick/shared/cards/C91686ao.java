package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.p489g.p494d.C9138aa;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9261ep;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.ao */
/* compiled from: PG */
public final class C91686ao implements C91680ai {

    /* renamed from: a */
    private final C91748d f255683a;

    /* renamed from: b */
    private final Context f255684b;

    public C91686ao(C91748d dVar, Context context) {
        this.f255683a = dVar;
        this.f255684b = context;
    }

    /* renamed from: b */
    public final void mo86157b(C9141ad adVar) {
        C9261ep epVar = adVar.f31546l;
        if (epVar == null) {
            epVar = C9261ep.f32026h;
        }
        String str = null;
        String str2 = (epVar.f32028a & 2) != 0 ? epVar.f32030c : null;
        String[] strArr = epVar.f32034g.size() > 0 ? (String[]) C58557jl.m90142w(epVar.f32034g, String.class) : null;
        Uri parse = (epVar.f32028a & 1) != 0 ? Uri.parse(epVar.f32029b) : null;
        if ((epVar.f32028a & 4) != 0) {
            str = epVar.f32031d;
        }
        boolean z = epVar.f32032e;
        boolean z2 = epVar.f32033f;
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.sidekick.main.endpoints.GoogleServiceWebviewWrapper");
        intent.addFlags(268435456);
        intent.putExtra("enable_javascript", z);
        intent.putExtra("enable_zoom_controls", z2);
        intent.putExtra("android.intent.extra.REFERRER", C90721ae.f253801j);
        if (!C58837ba.m90859h(str2)) {
            intent.putExtra("webview_service", str2);
        }
        if (!C58837ba.m90859h(str)) {
            intent.putExtra("webview_title", str);
        }
        if (strArr != null && strArr.length > 0) {
            intent.putExtra("webview_url_prefixes", strArr);
        }
        int a = C9138aa.m23673a(adVar.f31558x);
        if (a != 0 && a == 2) {
            intent.setFlags(268468224);
        }
        this.f255683a.mo86240d(this.f255684b, intent);
    }
}
