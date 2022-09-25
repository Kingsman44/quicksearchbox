package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.p1043a;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13918b;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C13911e implements C13918b {

    /* renamed from: a */
    public final /* synthetic */ C13917k f42364a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f42365b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f42366c;

    /* renamed from: d */
    public final /* synthetic */ Optional f42367d;

    /* renamed from: e */
    public final /* synthetic */ String f42368e;

    public /* synthetic */ C13911e(C13917k kVar, C2164c cVar, C0320v vVar, Optional optional, String str) {
        this.f42364a = kVar;
        this.f42365b = cVar;
        this.f42366c = vVar;
        this.f42367d = optional;
        this.f42368e = str;
    }

    /* renamed from: a */
    public final void mo21348a(PlaybackStateCompat playbackStateCompat) {
        C13917k kVar = this.f42364a;
        C2164c cVar = this.f42365b;
        C0320v vVar = this.f42366c;
        Optional optional = this.f42367d;
        String str = this.f42368e;
        ((C13923a) kVar.f42387g.mo17428b()).mo21356c(playbackStateCompat);
        if (C13983h.m30280g(playbackStateCompat)) {
            cVar.mo5437b(kVar.mo21351c(vVar, optional, playbackStateCompat, str));
        }
    }
}
