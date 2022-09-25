package com.google.android.apps.search.assistant.verticals.newsplayer.media;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.media.b */
/* compiled from: PG */
public final class C132447b {

    /* renamed from: a */
    public final MediaSessionCompat f361494a;

    /* renamed from: b */
    public final C132446a f361495b;

    public C132447b(Context context) {
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "NewsPlayer", (ComponentName) null, (PendingIntent) null);
        this.f361494a = mediaSessionCompat;
        this.f361495b = new C132446a(new C0320v(context, mediaSessionCompat));
    }
}
