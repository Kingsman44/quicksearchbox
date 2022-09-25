package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143948d;
import com.google.android.gms.googlehelp.C144287c;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.googlehelp.internal.common.ab */
/* compiled from: PG */
public final class C144296ab implements C144287c {

    /* renamed from: a */
    public static final Status f390830a = new Status(1, 13, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: a */
    static final void m234540a(C144295aa aaVar, Activity activity, Intent intent, GoogleHelp googleHelp) {
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp = (InProductHelp) C143948d.m234109b(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            inProductHelp.f390777a = googleHelp;
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", C143948d.m234110c(inProductHelp));
        }
        new C144861c(Looper.getMainLooper()).post(new C144312g(activity, intent));
        aaVar.mo119112p(Status.f389615a);
    }
}
