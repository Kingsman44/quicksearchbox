package com.google.android.apps.gsa.staticplugins.p7930es;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import androidx.core.p094f.C1888a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.f */
/* compiled from: PG */
public final /* synthetic */ class C100651f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100653h f281450a;

    public /* synthetic */ C100651f(C100653h hVar) {
        this.f281450a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100653h hVar = this.f281450a;
        Uri uri = (Uri) obj;
        Context context = hVar.f281453a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.apps.gsa.staticplugins.xms.MMS_SENT_ACTION").setPackage(context.getPackageName()), true != C1888a.m5149c() ? 1073741824 : 1107296256);
        IntentFilter intentFilter = new IntentFilter("com.google.android.apps.gsa.staticplugins.xms.MMS_SENT_ACTION");
        SettableFuture settableFuture = new SettableFuture();
        hVar.f281455c = new C100654i(settableFuture, hVar.f281457e);
        context.registerReceiver(hVar.f281455c, intentFilter);
        SmsManager.getDefault().sendMultimediaMessage(context, uri, (String) null, (Bundle) null, broadcast);
        return C60922j.m93045h(C60838bs.m92859i(settableFuture), new C100652g(hVar), C60826bg.f164896a);
    }
}
