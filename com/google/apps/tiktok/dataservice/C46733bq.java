package com.google.apps.tiktok.dataservice;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.apps.tiktok.p3624b.C46356a;
import com.google.apps.tiktok.tracing.C47559bj;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58881cr;

/* renamed from: com.google.apps.tiktok.dataservice.bq */
/* compiled from: PG */
public final /* synthetic */ class C46733bq implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C46761ce f122064a;

    /* renamed from: b */
    public final /* synthetic */ Uri f122065b;

    public /* synthetic */ C46733bq(C46761ce ceVar, Uri uri) {
        this.f122064a = ceVar;
        this.f122065b = uri;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C46761ce ceVar = this.f122064a;
        Uri uri = this.f122065b;
        Context context = ceVar.f122114a;
        if (Build.VERSION.SDK_INT >= 30) {
            C47559bj c = C47831fm.m85008c(C46356a.f121351a);
            if (c.mo51420b()) {
                context = context.createAttributionContext((String) c.mo51419a());
            }
        }
        return context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
