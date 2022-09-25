package com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ai.b.a */
/* compiled from: PG */
public final class C10091a implements C73740a {

    /* renamed from: a */
    private final C87568k f34372a;

    /* renamed from: b */
    private final Context f34373b;

    public C10091a(Context context, C87568k kVar) {
        this.f34373b = context;
        this.f34372a = kVar;
    }

    /* renamed from: c */
    private final void m24904c() {
        Toast makeText = Toast.makeText(this.f34373b, R.string.assistant_settings_opening_system_notifications_settings_message, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "notificationOpenSettingsInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openSettings(int r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = r6.hashCode()
            r1 = -1636482787(0xffffffff9e75411d, float:-1.2983657E-20)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 == r1) goto L_0x0020
            r1 = 1456933091(0x56d708e3, float:1.18216584E14)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "CHANNEL"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 0
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "APP"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "SUBSCRIPTION"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 2
            goto L_0x0035
        L_0x0034:
            r6 = -1
        L_0x0035:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r1 = "android.provider.extra.APP_PACKAGE"
            if (r6 == 0) goto L_0x0085
            if (r6 == r3) goto L_0x0062
            if (r6 == r2) goto L_0x0040
            return
        L_0x0040:
            com.google.android.apps.gsa.search.shared.h.k r5 = r4.f34372a
            android.content.Context r6 = r4.f34373b
            com.google.android.apps.gsa.search.shared.h.h r0 = new com.google.android.apps.gsa.search.shared.h.h
            r0.<init>()
            r0.f236497A = r3
            r0.f236509M = r3
            r0.f236560f = r3
            android.content.Context r1 = r4.f34373b
            r2 = 2132084652(0x7f1507ac, float:1.980948E38)
            java.lang.String r1 = r1.getString(r2)
            r0.f236568n = r1
            android.os.Bundle r0 = r0.mo81685a()
            r5.mo81688b(r6, r0)
            return
        L_0x0062:
            r4.m24904c()
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r5.<init>(r6)
            android.content.Context r6 = r4.f34373b
            java.lang.String r6 = r6.getPackageName()
            android.content.Intent r5 = r5.putExtra(r1, r6)
            android.content.Context r6 = r4.f34373b
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 != 0) goto L_0x007f
            r5.addFlags(r0)
        L_0x007f:
            android.content.Context r6 = r4.f34373b
            r6.startActivity(r5)
            return
        L_0x0085:
            r4.m24904c()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r2 = "android.settings.CHANNEL_NOTIFICATION_SETTINGS"
            r6.<init>(r2)
            android.content.Context r2 = r4.f34373b
            java.lang.String r2 = r2.getPackageName()
            android.content.Intent r6 = r6.putExtra(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OpaChannel_"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = "android.provider.extra.CHANNEL_ID"
            java.lang.String r1 = r1.toString()
            android.content.Intent r5 = r6.putExtra(r5, r1)
            android.content.Context r6 = r4.f34373b
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 != 0) goto L_0x00b6
            r5.addFlags(r0)
        L_0x00b6:
            android.content.Context r6 = r4.f34373b
            r6.startActivity(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b.C10091a.openSettings(int, java.lang.String):void");
    }
}
