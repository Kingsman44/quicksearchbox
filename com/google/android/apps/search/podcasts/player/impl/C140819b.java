package com.google.android.apps.search.podcasts.player.impl;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.apps.search.podcasts.player.C140790h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.b */
/* compiled from: PG */
public final class C140819b {

    /* renamed from: a */
    public MediaSessionCompat f382432a;

    /* renamed from: b */
    public C140790h f382433b;

    /* renamed from: a */
    public final synchronized MediaSessionCompat mo115927a(Context context, C140790h hVar) {
        MediaSessionCompat mediaSessionCompat;
        C140790h hVar2;
        C69664n.m101061g(context, "context");
        mediaSessionCompat = this.f382432a;
        if (mediaSessionCompat == null) {
            mediaSessionCompat = new MediaSessionCompat(context, "PodcastPlayer", (ComponentName) null, (PendingIntent) null);
        }
        this.f382432a = mediaSessionCompat;
        if (!C69664n.m101066l(this.f382433b, hVar) && (hVar2 = this.f382433b) != null) {
            hVar2.mo115889k(false);
        }
        this.f382433b = hVar;
        return mediaSessionCompat;
    }
}
