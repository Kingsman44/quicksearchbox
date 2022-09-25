package com.google.android.libraries.web.weblayer.contrib.medianotification.internal;

import android.content.Intent;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.medianotification.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C44209a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MediaNotificationWebFragmentObserver f114989a;

    /* renamed from: b */
    public final /* synthetic */ Intent f114990b;

    public /* synthetic */ C44209a(MediaNotificationWebFragmentObserver mediaNotificationWebFragmentObserver, Intent intent) {
        this.f114989a = mediaNotificationWebFragmentObserver;
        this.f114990b = intent;
    }

    public final void run() {
        MediaNotificationWebFragmentObserver mediaNotificationWebFragmentObserver = this.f114989a;
        mediaNotificationWebFragmentObserver.f114986a.startActivity(this.f114990b);
    }
}
