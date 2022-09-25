package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import androidx.core.app.C1831r;
import androidx.core.app.C1839z;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.l */
/* compiled from: PG */
public final class C122360l {

    /* renamed from: a */
    public static final C59071e f339254a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.l");

    /* renamed from: b */
    public final Context f339255b;

    /* renamed from: c */
    public final C1800aq f339256c;

    /* renamed from: d */
    private final C60888db f339257d;

    public C122360l(Context context, C60888db dbVar) {
        this.f339255b = context;
        this.f339257d = dbVar;
        this.f339256c = new C1800aq(context);
    }

    /* renamed from: a */
    public static int m201846a(long j) {
        if (j < 1000) {
            return 0;
        }
        return (int) (Math.log((double) j) / Math.log(1000.0d));
    }

    /* renamed from: c */
    public static String m201847c(long j, int i, int i2) {
        if (i == 0) {
            return j + " B";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        decimalFormat.setMaximumFractionDigits(i2);
        double d = (double) j;
        double pow = Math.pow(1000.0d, (double) i);
        Double.isNaN(d);
        return String.format("%s %sB", new Object[]{decimalFormat.format(d / pow), Character.valueOf("KMGTPE".charAt(i - 1))});
    }

    /* renamed from: e */
    static void m201848e(C1839z zVar, long j, long j2, boolean z) {
        zVar.mo5020i((int) j, (int) j2, z);
        if (z) {
            zVar.f5694n = C1839z.m5037c(BuildConfig.FLAVOR);
            zVar.f5689i = C1839z.m5037c(BuildConfig.FLAVOR);
            return;
        }
        zVar.f5694n = C1839z.m5037c(String.format("%s / %s", new Object[]{m201849f(j2), m201849f(j)}));
    }

    /* renamed from: f */
    private static String m201849f(long j) {
        return m201847c(j, m201846a(j), 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1839z mo105604b(Optional optional) {
        C1839z zVar = new C1839z(this.f339255b, "DOWNLOAD_PROMPT_NOTIFICATION");
        zVar.f5679J.icon = 17301633;
        zVar.f5705y = "status";
        zVar.f5685e = C1839z.m5037c(this.f339255b.getString(R.string.assistant_tmp_notification_title));
        zVar.mo5015d(8, true);
        zVar.mo5015d(2, true);
        zVar.f5686f = C1839z.m5037c(this.f339255b.getString(R.string.assistant_tmp_notification_downloading_status));
        zVar.mo5020i(1, 0, true);
        if (optional.isPresent()) {
            zVar.mo5017f(new C1831r(0, this.f339255b.getString(R.string.assistant_tmp_notification_cancel_action), (PendingIntent) optional.get()).mo5008a());
        }
        return zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo105605d(C1839z zVar, boolean z) {
        if (C1794ak.m4938a(this.f339256c.f5622a, "DOWNLOAD_PROMPT_NOTIFICATION") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("DOWNLOAD_PROMPT_NOTIFICATION", this.f339255b.getString(R.string.assistant_tmp_notification_channel_name), 4);
            notificationChannel.setDescription(this.f339255b.getString(R.string.assistant_tmp_notification_channel_description));
            C1794ak.m4943f(this.f339256c.f5622a, notificationChannel);
        }
        if (z) {
            Notification a = zVar.mo5013a();
            zVar.mo5015d(8, true);
            C60870cx f = C60856cj.m92897f(this.f339257d.mo29164d(new C122357i(this, a), 250, TimeUnit.MILLISECONDS), this.f339257d.mo29164d(new C122358j(this, zVar.mo5013a()), 1500, TimeUnit.MILLISECONDS));
            C122359k kVar = new C122359k();
            C60856cj.m92911t(f, C47810es.m84974n(kVar), this.f339257d);
        }
        this.f339256c.mo5003b((String) null, 1048576, zVar.mo5013a());
    }
}
