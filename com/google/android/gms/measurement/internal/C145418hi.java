package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4535g.C59203do;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.hi */
/* compiled from: PG */
public final /* synthetic */ class C145418hi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145419hj f393155a;

    /* renamed from: b */
    public final /* synthetic */ int f393156b;

    /* renamed from: c */
    public final /* synthetic */ Exception f393157c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f393158d;

    public /* synthetic */ C145418hi(C145419hj hjVar, int i, Exception exc, byte[] bArr) {
        this.f393155a = hjVar;
        this.f393156b = i;
        this.f393157c = exc;
        this.f393158d = bArr;
    }

    public final void run() {
        C145419hj hjVar = this.f393155a;
        int i = this.f393156b;
        Exception exc = this.f393157c;
        byte[] bArr = this.f393158d;
        C145361ff ffVar = hjVar.f393160b.f392920a;
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            ffVar.mo120965ar().f392798f.mo120896c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), exc);
        }
        if (exc == null) {
            ffVar.mo120971g().f392864q.mo120912b(true);
            if (bArr == null || bArr.length == 0) {
                ffVar.mo120965ar().f392802j.mo120894a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                double optDouble = jSONObject.optDouble("timestamp", C59203do.f157270a);
                if (TextUtils.isEmpty(optString)) {
                    ffVar.mo120965ar().f392802j.mo120894a("Deferred Deep Link is empty.");
                    return;
                }
                C145495ke o = ffVar.mo120977o();
                C145361ff ffVar2 = o.f393011w;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = o.f393011w.f392931a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        ffVar.f392943m.mo121101o("auto", "_cmp", bundle);
                        C145495ke o2 = ffVar.mo120977o();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = o2.f393011w.f392931a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    o2.f393011w.f392931a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                o2.f393011w.mo120965ar().f392795c.mo120895b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                ffVar.mo120965ar().f392798f.mo120896c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                ffVar.mo120965ar().f392795c.mo120895b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        ffVar.mo120965ar().f392798f.mo120896c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), exc);
    }
}
