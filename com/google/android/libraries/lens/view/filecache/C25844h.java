package com.google.android.libraries.lens.view.filecache;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.lens.view.filecache.h */
/* compiled from: PG */
public final /* synthetic */ class C25844h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25848l f70204a;

    /* renamed from: b */
    public final /* synthetic */ String f70205b;

    /* renamed from: c */
    public final /* synthetic */ String f70206c;

    /* renamed from: d */
    public final /* synthetic */ String f70207d;

    public /* synthetic */ C25844h(C25848l lVar, String str, String str2, String str3) {
        this.f70204a = lVar;
        this.f70205b = str;
        this.f70206c = str2;
        this.f70207d = str3;
    }

    public final Object apply(Object obj) {
        Intent intent;
        C25848l lVar = this.f70204a;
        String str = this.f70205b;
        String str2 = this.f70206c;
        String str3 = this.f70207d;
        Uri uri = (Uri) obj;
        Context context = lVar.f70210a;
        if (!TextUtils.isEmpty(str3)) {
            try {
                lVar.f70210a.getPackageManager().getPackageInfo(str3, 1);
            } catch (PackageManager.NameNotFoundException unused) {
                intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str3).build());
            }
        }
        Intent intent2 = new Intent("android.intent.action.SEND");
        if (!TextUtils.isEmpty(str3)) {
            intent2.setPackage(str3);
        }
        intent2.setType("text/plain");
        if (!TextUtils.isEmpty(str)) {
            intent2.putExtra("android.intent.extra.SUBJECT", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent2.putExtra("android.intent.extra.TEXT", str2);
        }
        if (uri != null) {
            intent2.setType(lVar.f70210a.getContentResolver().getType(uri)).putExtra("android.intent.extra.STREAM", uri).addFlags(1);
        }
        intent = TextUtils.isEmpty(str3) ? Intent.createChooser(intent2, (CharSequence) null) : intent2;
        intent.setComponent(intent.resolveActivity(lVar.f70210a.getPackageManager()));
        PendingIntent activity = PendingIntent.getActivity(context, 2, C147798a.m240896b(intent, 1140850688, 0), 1140850688);
        activity.getClass();
        return activity;
    }
}
