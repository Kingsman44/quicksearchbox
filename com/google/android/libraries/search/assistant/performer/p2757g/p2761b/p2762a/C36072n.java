package com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36077b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a.n */
/* compiled from: PG */
final class C36072n implements C36077b {

    /* renamed from: a */
    final /* synthetic */ C2164c f94359a;

    /* renamed from: b */
    final /* synthetic */ C0320v f94360b;

    /* renamed from: c */
    final /* synthetic */ Optional f94361c;

    /* renamed from: d */
    final /* synthetic */ String f94362d;

    /* renamed from: e */
    final /* synthetic */ C36075q f94363e;

    public C36072n(C36075q qVar, C2164c cVar, C0320v vVar, Optional optional, String str) {
        this.f94363e = qVar;
        this.f94359a = cVar;
        this.f94360b = vVar;
        this.f94361c = optional;
        this.f94362d = str;
    }

    /* renamed from: a */
    public final void mo39959a(PlaybackStateCompat playbackStateCompat) {
        if (this.f94363e.f94375f.isPresent()) {
            ((C13923a) this.f94363e.f94375f.get()).mo21356c(playbackStateCompat);
        }
        if (C18434a.m35908d(playbackStateCompat)) {
            this.f94359a.mo5437b(this.f94363e.mo39962c(this.f94360b, this.f94361c, playbackStateCompat, this.f94362d));
        } else if (playbackStateCompat.f994a == 3) {
            C58976aa aaVar = C58975e.f156826a;
            this.f94360b.mo1037e().mo1017b();
        }
    }
}
