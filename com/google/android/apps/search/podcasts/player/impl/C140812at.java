package com.google.android.apps.search.podcasts.player.impl;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.at */
/* compiled from: PG */
public final class C140812at {

    /* renamed from: a */
    public final String f382400a = "start";

    /* renamed from: b */
    public final String f382401b = "stop";

    /* renamed from: c */
    public final String f382402c = "foreground";

    /* renamed from: d */
    public Notification f382403d;

    /* renamed from: e */
    public boolean f382404e;

    /* renamed from: f */
    public int f382405f = 1;

    /* renamed from: g */
    private final Context f382406g;

    public C140812at(Context context) {
        C69664n.m101061g(context, "context");
        this.f382406g = context;
    }

    /* renamed from: a */
    public final void mo115924a(String str, boolean z) {
        Intent putExtra = new Intent(this.f382406g, PodcastPlaybackService.class).setAction(str).putExtra(this.f382402c, z);
        C69664n.m101060f(putExtra, "Intent(context, PodcastP…G_FOREGROUND, foreground)");
        if (!C69664n.m101066l(str, this.f382400a) || !z) {
            this.f382406g.startService(putExtra);
        } else {
            this.f382406g.startForegroundService(putExtra);
        }
    }
}
