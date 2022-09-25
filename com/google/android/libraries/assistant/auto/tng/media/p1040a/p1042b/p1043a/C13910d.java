package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.p1043a;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13918b;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C13910d implements C13918b {

    /* renamed from: a */
    public final /* synthetic */ C13917k f42359a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f42360b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f42361c;

    /* renamed from: d */
    public final /* synthetic */ Optional f42362d;

    /* renamed from: e */
    public final /* synthetic */ String f42363e;

    public /* synthetic */ C13910d(C13917k kVar, C2164c cVar, C0320v vVar, Optional optional, String str) {
        this.f42359a = kVar;
        this.f42360b = cVar;
        this.f42361c = vVar;
        this.f42362d = optional;
        this.f42363e = str;
    }

    /* renamed from: a */
    public final void mo21348a(PlaybackStateCompat playbackStateCompat) {
        C13917k kVar = this.f42359a;
        C2164c cVar = this.f42360b;
        C0320v vVar = this.f42361c;
        Optional optional = this.f42362d;
        String str = this.f42363e;
        ((C13923a) kVar.f42387g.mo17428b()).mo21356c(playbackStateCompat);
        if (((Boolean) kVar.f42386f.mo17428b()).booleanValue()) {
            C59104x b = C13917k.f42381a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
            ((C59052c) ((C59052c) b).mo56372aa(45180)).mo56386p("Received playbackState changed signal for play/resume.");
        }
        if (C13983h.m30280g(playbackStateCompat)) {
            cVar.mo5437b(kVar.mo21351c(vVar, optional, playbackStateCompat, str));
        } else if (playbackStateCompat.f994a == 3) {
            C60870cx d = kVar.mo21352d(vVar, optional, str);
            C60845bz n = C47810es.m84974n(new C13916j(cVar));
            C60856cj.m92911t(d, C47810es.m84974n(n), kVar.f42382b);
        }
    }
}
