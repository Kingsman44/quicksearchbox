package com.google.android.apps.search.podcasts.settings;

import android.content.Intent;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.w */
/* compiled from: PG */
final class C141103w implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f383091a;

    /* renamed from: b */
    final /* synthetic */ C141098t f383092b;

    public C141103w(View view, C141098t tVar) {
        this.f383091a = view;
        this.f383092b = tVar;
    }

    public final void onClick(View view) {
        Intent intent;
        if (!this.f383092b.f383079l.areNotificationsEnabled() || this.f383092b.f383079l.getNotificationChannel("com.google.android.apps.gsa.plugins.podcastplayer.channel") == null) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("app_package", this.f383091a.getContext().getPackageName()).putExtra("app_uid", this.f383091a.getContext().getApplicationInfo().uid).putExtra("android.provider.extra.APP_PACKAGE", this.f383091a.getContext().getPackageName());
        } else {
            intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").putExtra("app_package", this.f383091a.getContext().getPackageName()).putExtra("app_uid", this.f383091a.getContext().getApplicationInfo().uid).putExtra("android.provider.extra.APP_PACKAGE", this.f383091a.getContext().getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", "com.google.android.apps.gsa.plugins.podcastplayer.channel");
        }
        C69664n.m101060f(intent, "if (Build.VERSION.SDK_IN…geName)\n                }");
        this.f383092b.f383071d.startActivity(intent);
    }
}
