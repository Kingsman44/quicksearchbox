package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.p10781d.C143860a;
import com.google.android.p10895i.p10896a.C146592a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.measurement.internal.el */
/* compiled from: PG */
final class C145340el implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ServiceConnection f392870a;

    /* renamed from: b */
    final /* synthetic */ C145341em f392871b;

    /* renamed from: c */
    final /* synthetic */ C146592a f392872c;

    public C145340el(C145341em emVar, C146592a aVar, ServiceConnection serviceConnection) {
        this.f392871b = emVar;
        this.f392872c = aVar;
        this.f392870a = serviceConnection;
    }

    public final void run() {
        C145341em emVar = this.f392871b;
        C145342en enVar = emVar.f392874b;
        String str = emVar.f392873a;
        C146592a aVar = this.f392872c;
        ServiceConnection serviceConnection = this.f392870a;
        enVar.f392875a.mo120966as().mo120904g();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Parcel gA = aVar.mo17260gA();
            C8850c.m23497f(gA, bundle);
            Parcel gT = aVar.mo17261gT(1, gA);
            Bundle bundle3 = (Bundle) C8850c.m23492a(gT, Bundle.CREATOR);
            gT.recycle();
            if (bundle3 == null) {
                enVar.f392875a.mo120965ar().f392795c.mo120894a("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundle3;
            }
        } catch (Exception e) {
            enVar.f392875a.mo120965ar().f392795c.mo120895b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        enVar.f392875a.mo120966as().mo120904g();
        C145361ff.m236188u();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                enVar.f392875a.mo120965ar().f392798f.mo120894a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    enVar.f392875a.mo120965ar().f392795c.mo120894a("No referrer defined in Install Referrer response");
                } else {
                    enVar.f392875a.mo120965ar().f392803k.mo120895b("InstallReferrer API result", string);
                    Bundle t = enVar.f392875a.mo120977o().mo121287t(Uri.parse("?".concat(string)));
                    if (t == null) {
                        enVar.f392875a.mo120965ar().f392795c.mo120894a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = t.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                enVar.f392875a.mo120965ar().f392795c.mo120894a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                t.putLong("click_timestamp", j2);
                            }
                        }
                        C145336eh ehVar = enVar.f392875a.mo120971g().f392852e;
                        ehVar.mo120915a();
                        if (j == ehVar.f392834a) {
                            enVar.f392875a.mo120965ar().f392803k.mo120894a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (enVar.f392875a.mo120980r()) {
                            enVar.f392875a.mo120971g().f392852e.mo120916b(j);
                            enVar.f392875a.mo120965ar().f392803k.mo120895b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t.putString("_cis", "referrer API v2");
                            enVar.f392875a.mo120972j().mo121090G("_cmp", t, str);
                        }
                    }
                }
            }
        }
        C143860a.m233845a().mo119311b(enVar.f392875a.f392931a, serviceConnection);
    }
}
