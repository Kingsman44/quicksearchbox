package com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4676b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.a.b.b */
/* compiled from: PG */
public final class C61838b {

    /* renamed from: a */
    public final String f167096a;

    /* renamed from: b */
    public final String f167097b;

    /* renamed from: c */
    public final String f167098c;

    /* renamed from: d */
    public final String f167099d;

    /* renamed from: e */
    public final Intent f167100e;

    /* renamed from: f */
    public final int f167101f;

    public C61838b(String str, String str2, String str3, String str4, Intent intent, int i) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
            this.f167096a = str;
            this.f167097b = str2;
            str3.getClass();
            this.f167098c = str3;
            this.f167099d = str4;
            this.f167100e = intent;
            this.f167101f = i;
            return;
        }
        throw new IllegalArgumentException("titleWithEntity and titleWithoutEntity should not be both null");
    }

    /* renamed from: b */
    static /* synthetic */ CharSequence m94488b(C61838b bVar) {
        return !TextUtils.isEmpty(bVar.f167097b) ? bVar.f167097b : bVar.f167096a;
    }

    /* renamed from: a */
    public final RemoteActionCompat mo58208a(Context context, Intent intent, IconCompat iconCompat, boolean z, ResolveInfo resolveInfo) {
        String str;
        PendingIntent activity = PendingIntent.getActivity(context, this.f167101f, intent, 201326592);
        CharSequence b = m94488b(this);
        if (TextUtils.isEmpty(b)) {
            Log.w("androidtc", "Custom titleChooser return null, fallback to the default titleChooser");
            b = m94488b(this);
        }
        PackageManager packageManager = context.getPackageManager();
        if (!TextUtils.isEmpty(this.f167099d)) {
            String str2 = null;
            if (!(resolveInfo == null || resolveInfo.activityInfo == null || "android".equals(resolveInfo.activityInfo.packageName) || resolveInfo.activityInfo.applicationInfo == null)) {
                str2 = packageManager.getApplicationLabel(resolveInfo.activityInfo.applicationInfo).toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                str = String.format(this.f167099d, new Object[]{str2});
                RemoteActionCompat remoteActionCompat = new RemoteActionCompat(iconCompat, b, str, activity);
                remoteActionCompat.f5561f = z;
                return remoteActionCompat;
            }
        }
        str = this.f167098c;
        RemoteActionCompat remoteActionCompat2 = new RemoteActionCompat(iconCompat, b, str, activity);
        remoteActionCompat2.f5561f = z;
        return remoteActionCompat2;
    }
}
