package com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d;

import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.d.e */
/* compiled from: PG */
public final /* synthetic */ class C40119e implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f105372a;

    public /* synthetic */ C40119e(Context context) {
        this.f105372a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Context context = this.f105372a;
        C1800aq aqVar = new C1800aq(context);
        if (C1794ak.m4938a(aqVar.f5622a, "XBLEND_BUBBLE_PERSISTENT_NOTIFICATION") == null) {
            C1794ak.m4943f(aqVar.f5622a, new NotificationChannel("XBLEND_BUBBLE_PERSISTENT_NOTIFICATION", context.getString(R.string.bubble_notification_channel_name), 2));
        }
        C1839z zVar = new C1839z(context, "XBLEND_BUBBLE_PERSISTENT_NOTIFICATION");
        zVar.f5690j = -1;
        return zVar;
    }
}
