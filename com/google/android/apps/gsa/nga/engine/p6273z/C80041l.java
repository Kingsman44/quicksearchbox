package com.google.android.apps.gsa.nga.engine.p6273z;

import android.app.PendingIntent;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80943d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.engine.z.l */
/* compiled from: PG */
public final /* synthetic */ class C80041l implements C80943d {

    /* renamed from: a */
    public final /* synthetic */ C80042m f219634a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f219635b;

    public /* synthetic */ C80041l(C80042m mVar, PendingIntent pendingIntent) {
        this.f219634a = mVar;
        this.f219635b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo71377a(C1839z zVar) {
        C80042m mVar = this.f219634a;
        PendingIntent pendingIntent = this.f219635b;
        zVar.f5705y = "status";
        zVar.f5685e = C1839z.m5037c(mVar.f219636a.getResources().getString(R.string.dev_only_nga_notification_content_title));
        zVar.f5686f = C1839z.m5037c(mVar.f219636a.getResources().getString(R.string.dev_only_nga_notification_abnormal_memory));
        zVar.f5687g = pendingIntent;
        zVar.mo5015d(16, true);
    }
}
