package com.google.android.apps.search.podcasts.player.impl;

import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10890h.p10891a.p10892a.C146550e;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.av */
/* compiled from: PG */
public final class C140814av implements C146550e {

    /* renamed from: a */
    public static final C58974d f382411a = C58974d.m91134h("PodcastAudioPlayer");

    /* renamed from: b */
    public static final Duration f382412b = Duration.ofMillis(40);

    /* renamed from: c */
    public final C140790h f382413c;

    /* renamed from: d */
    public final C60888db f382414d;

    /* renamed from: e */
    public final C21370a f382415e;

    /* renamed from: f */
    public final boolean f382416f;

    /* renamed from: g */
    public final C140813au f382417g = new C140813au(this);

    public C140814av(C140790h hVar, C60888db dbVar, C21370a aVar, boolean z) {
        C69664n.m101061g(dbVar, "uiThreadScheduledExecutorService");
        C69664n.m101061g(aVar, "clock");
        this.f382413c = hVar;
        this.f382414d = dbVar;
        this.f382415e = aVar;
        this.f382416f = z;
    }
}
