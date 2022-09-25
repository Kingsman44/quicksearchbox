package com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36077b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C36067i implements C36077b {

    /* renamed from: a */
    public final /* synthetic */ C36075q f94339a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f94340b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f94341c;

    /* renamed from: d */
    public final /* synthetic */ Optional f94342d;

    /* renamed from: e */
    public final /* synthetic */ String f94343e;

    public /* synthetic */ C36067i(C36075q qVar, C2164c cVar, C0320v vVar, Optional optional, String str) {
        this.f94339a = qVar;
        this.f94340b = cVar;
        this.f94341c = vVar;
        this.f94342d = optional;
        this.f94343e = str;
    }

    /* renamed from: a */
    public final void mo39959a(PlaybackStateCompat playbackStateCompat) {
        C36075q qVar = this.f94339a;
        C2164c cVar = this.f94340b;
        C0320v vVar = this.f94341c;
        Optional optional = this.f94342d;
        String str = this.f94343e;
        if (qVar.f94375f.isPresent()) {
            ((C13923a) qVar.f94375f.get()).mo21356c(playbackStateCompat);
        }
        if (C18434a.m35908d(playbackStateCompat)) {
            cVar.mo5437b(qVar.mo39962c(vVar, optional, playbackStateCompat, str));
        }
    }
}
