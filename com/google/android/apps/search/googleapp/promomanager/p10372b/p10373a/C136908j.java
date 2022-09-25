package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import com.google.protos.p5124m.p5125a.C65603f;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.j */
/* compiled from: PG */
public final class C136908j implements C136903e {

    /* renamed from: a */
    private static final C58974d f372616a = C58974d.m91135i("PinWidgetSupportedPE");

    /* renamed from: b */
    private final Context f372617b;

    /* renamed from: c */
    private final C58528ij f372618c;

    public C136908j(Context context, C65603f fVar) {
        this.f372617b = context;
        this.f372618c = C58528ij.m90006F(fVar.f178307a);
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        C58970a aVar = (C58970a) ((C58970a) f372616a.mo56224b()).mo56372aa(40884);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = this.f372617b.getPackageManager().resolveActivity(intent, 65536);
        String str = (resolveActivity == null || resolveActivity.activityInfo == null) ? BuildConfig.FLAVOR : resolveActivity.activityInfo.packageName;
        boolean z = false;
        if ((TextUtils.isEmpty(str) || !this.f372618c.contains(str)) && AppWidgetManager.getInstance(this.f372617b).isRequestPinAppWidgetSupported()) {
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }
}
