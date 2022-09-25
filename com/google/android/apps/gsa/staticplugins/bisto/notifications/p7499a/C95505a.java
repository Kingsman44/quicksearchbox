package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7499a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.staticplugins.bisto.p7492j.C95472b;
import com.google.android.apps.gsa.staticplugins.bisto.p7492j.C95473c;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96632b;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96460ar;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.a.a */
/* compiled from: PG */
public final /* synthetic */ class C95505a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95507c f267244a;

    /* renamed from: b */
    public final /* synthetic */ String f267245b;

    public /* synthetic */ C95505a(C95507c cVar, String str) {
        this.f267244a = cVar;
        this.f267245b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C95507c cVar = this.f267244a;
        String str = this.f267245b;
        C96632b bVar = (C96632b) obj;
        int i = bVar.f270322c;
        long j = bVar.f270321b;
        boolean z = j == 0 || Math.abs(cVar.f267249c.mo26870b() - j) > C95507c.f267248b.longValue();
        C58976aa aaVar = C58975e.f156826a;
        if (i >= 3 || !z) {
            return false;
        }
        if (cVar.f267254h == null) {
            cVar.f267254h = new C95506b(cVar);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.apps.gsa.staticplugins.bisto.notifications.accessrequest.ACTION_NOTIFICATION_ACCESS_REQUEST");
            cVar.f267252f.registerReceiver(cVar.f267254h, intentFilter);
        }
        Context context = cVar.f267252f;
        Object[] objArr = new Object[1];
        if (str == null) {
            str = context.getString(R.string.fetch_with_no_notification_access_default_device_name);
        }
        objArr[0] = str;
        C1839z b = C96460ar.m159822b(cVar.f267252f, context.getString(R.string.fetch_with_no_notification_access_title, objArr), cVar.f267252f.getString(R.string.fetch_with_no_notification_access_body), C96460ar.f269856c, C58836b.f156633a);
        PendingIntent a = cVar.mo89397a(new Intent("com.google.android.apps.gsa.staticplugins.bisto.notifications.accessrequest.ACTION_NOTIFICATION_ACCESS_REQUEST").putExtra("proxied_message_id", 1), 50);
        PendingIntent a2 = cVar.mo89397a(new Intent("com.google.android.apps.gsa.staticplugins.bisto.notifications.accessrequest.ACTION_NOTIFICATION_ACCESS_REQUEST").putExtra("proxied_message_id", 0), 61);
        PendingIntent a3 = cVar.mo89397a(new Intent("com.google.android.apps.gsa.staticplugins.bisto.notifications.accessrequest.ACTION_NOTIFICATION_ACCESS_REQUEST").putExtra("proxied_message_id", 2), 60);
        b.mo5016e(0, cVar.f267252f.getString(R.string.fetch_with_no_notification_access_settings), a);
        b.mo5016e(0, cVar.f267252f.getString(R.string.fetch_with_no_notification_access_dismiss), a2);
        b.mo5015d(16, false);
        b.f5679J.deleteIntent = a3;
        b.f5687g = a;
        C95473c cVar2 = cVar.f267250d;
        cVar2.mo89379a().mo46039a(new C95472b(cVar2), C60826bg.f164896a);
        cVar.f267253g.notify(53, b.mo5013a());
        cVar.mo89398b(2);
        return true;
    }
}
