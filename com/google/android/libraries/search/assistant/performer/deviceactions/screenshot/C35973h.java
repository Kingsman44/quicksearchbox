package com.google.android.libraries.search.assistant.performer.deviceactions.screenshot;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.h */
/* compiled from: PG */
public final class C35973h {

    /* renamed from: a */
    private final Context f94154a;

    /* renamed from: b */
    private final C1800aq f94155b;

    public C35973h(Context context) {
        this.f94154a = context;
        this.f94155b = new C1800aq(context);
    }

    /* renamed from: a */
    public final void mo39911a() {
        this.f94155b.f5622a.cancel((String) null, 447531336);
    }

    /* renamed from: b */
    public final void mo39912b(Notification notification) {
        if (C1794ak.m4938a(this.f94155b.f5622a, "com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.ScreenshotNotificationChannel") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.ScreenshotNotificationChannel", this.f94154a.getString(R.string.ma_screenshot_notifications_channel_name), 4);
            notificationChannel.setDescription(this.f94154a.getString(R.string.ma_screenshot_notifications_channel_description));
            C1794ak.m4943f(this.f94155b.f5622a, notificationChannel);
        }
        this.f94155b.mo5003b((String) null, 447531336, notification);
    }
}
