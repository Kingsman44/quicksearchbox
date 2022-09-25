package com.google.android.libraries.assistant.auto.tng.common.p928n;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.C1837x;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.common.permissions.PermissionsActivity;
import com.google.android.libraries.p11029ao.p11030a.C147798a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.n.a */
/* compiled from: PG */
public final class C13294a {

    /* renamed from: a */
    private final Context f40999a;

    /* renamed from: b */
    private final NotificationManager f41000b;

    public C13294a(Context context, NotificationManager notificationManager) {
        this.f40999a = context;
        this.f41000b = notificationManager;
    }

    /* renamed from: a */
    public final void mo21012a(String[] strArr) {
        PendingIntent activity = PendingIntent.getActivity(this.f40999a, 0, C147798a.m240896b(PermissionsActivity.m29570a(this.f40999a, strArr), 201326592, 0), 201326592);
        C1837x xVar = new C1837x();
        xVar.f5580f = C1839z.m5037c(this.f40999a.getString(R.string.auto_permission_required_action_notification_title));
        xVar.f5669a = C1839z.m5037c(this.f40999a.getString(R.string.auto_permission_required_action_notification_body));
        C1839z zVar = new C1839z(this.f40999a, "AAAE_ONBOARDING_NOTIFICATION");
        zVar.f5685e = C1839z.m5037c(this.f40999a.getString(R.string.auto_permission_required_action_notification_title));
        zVar.f5686f = C1839z.m5037c(this.f40999a.getString(R.string.auto_permission_required_action_notification_body));
        zVar.f5679J.icon = 17301651;
        zVar.f5687g = activity;
        zVar.f5690j = 2;
        zVar.mo5015d(16, true);
        zVar.mo5022k(xVar);
        this.f41000b.createNotificationChannel(new NotificationChannel("AAAE_ONBOARDING_NOTIFICATION", this.f40999a.getString(R.string.auto_permission_required_notification_channel_title), 4));
        this.f41000b.notify("hf", C89885b.GWS_IO_EXCEPTION_VALUE, zVar.mo5013a());
    }
}
