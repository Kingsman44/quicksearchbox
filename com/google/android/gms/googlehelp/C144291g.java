package com.google.android.gms.googlehelp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.googlehelp.internal.common.C144297ac;
import com.google.android.gms.googlehelp.internal.common.C144324s;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.base.C58881cr;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.googlehelp.g */
/* compiled from: PG */
public final class C144291g {

    /* renamed from: a */
    public final Activity f390815a;

    /* renamed from: b */
    public final C58881cr f390816b;

    public C144291g(Activity activity) {
        this.f390815a = activity;
        this.f390816b = new C144289e(activity);
    }

    /* renamed from: a */
    public final int mo119818a() {
        return C143700ab.m233440b(this.f390815a, 11925000);
    }

    /* renamed from: b */
    public final void mo119819b(int i, GoogleHelp googleHelp) {
        Intent data = new Intent("android.intent.action.VIEW").setData(googleHelp.f390767q);
        if (i == 7) {
            i = 7;
        } else if (!this.f390815a.getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new C144861c(Looper.getMainLooper()).post(new C144290f(this, data));
            return;
        }
        Activity activity = this.f390815a;
        if (true == C143700ab.m233445g(activity, i)) {
            i = 18;
        }
        C143875g.f389987a.mo119361i(activity, i, 0, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: c */
    public final void mo119820c(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int a = mo119818a();
        if (a == 0) {
            C144297ac a2 = C144293i.m234537a(((C144289e) this.f390816b).f390812a);
            C143919bh.m233958a(a2.f390832b);
            C143851w wVar = a2.f389929D;
            C144324s sVar = new C144324s(wVar, intent, new WeakReference(a2.f390832b));
            wVar.mo119159d(sVar);
            C143918bg.m233956b(sVar);
            return;
        }
        mo119819b(a, (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"));
    }
}
