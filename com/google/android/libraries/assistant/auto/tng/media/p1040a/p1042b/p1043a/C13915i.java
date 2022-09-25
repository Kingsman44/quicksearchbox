package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.p1043a;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13918b;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.b.a.i */
/* compiled from: PG */
final class C13915i implements C13918b {

    /* renamed from: a */
    final /* synthetic */ C2164c f42375a;

    /* renamed from: b */
    final /* synthetic */ C0320v f42376b;

    /* renamed from: c */
    final /* synthetic */ Optional f42377c;

    /* renamed from: d */
    final /* synthetic */ String f42378d;

    /* renamed from: e */
    final /* synthetic */ C13917k f42379e;

    public C13915i(C13917k kVar, C2164c cVar, C0320v vVar, Optional optional, String str) {
        this.f42379e = kVar;
        this.f42375a = cVar;
        this.f42376b = vVar;
        this.f42377c = optional;
        this.f42378d = str;
    }

    /* renamed from: a */
    public final void mo21348a(PlaybackStateCompat playbackStateCompat) {
        ((C13923a) this.f42379e.f42387g.mo17428b()).mo21356c(playbackStateCompat);
        if (((Boolean) this.f42379e.f42386f.mo17428b()).booleanValue()) {
            C59104x b = C13917k.f42381a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
            ((C59052c) ((C59052c) b).mo56372aa(45178)).mo56386p("Received playbackState changed signal for pause/stop.");
        }
        if (C13983h.m30280g(playbackStateCompat)) {
            this.f42375a.mo5437b(this.f42379e.mo21351c(this.f42376b, this.f42377c, playbackStateCompat, this.f42378d));
        } else if (playbackStateCompat.f994a == 3) {
            this.f42376b.mo1037e().mo1017b();
        }
    }
}
