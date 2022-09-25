package com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36077b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C36066h implements C36077b {

    /* renamed from: a */
    public final /* synthetic */ C36075q f94332a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f94333b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f94334c;

    /* renamed from: d */
    public final /* synthetic */ Optional f94335d;

    /* renamed from: e */
    public final /* synthetic */ String f94336e;

    /* renamed from: f */
    public final /* synthetic */ boolean f94337f;

    /* renamed from: g */
    public final /* synthetic */ C35470f f94338g;

    public /* synthetic */ C36066h(C36075q qVar, C2164c cVar, C0320v vVar, Optional optional, String str, boolean z, C35470f fVar) {
        this.f94332a = qVar;
        this.f94333b = cVar;
        this.f94334c = vVar;
        this.f94335d = optional;
        this.f94336e = str;
        this.f94337f = z;
        this.f94338g = fVar;
    }

    /* renamed from: a */
    public final void mo39959a(PlaybackStateCompat playbackStateCompat) {
        C36075q qVar = this.f94332a;
        C2164c cVar = this.f94333b;
        C0320v vVar = this.f94334c;
        Optional optional = this.f94335d;
        String str = this.f94336e;
        boolean z = this.f94337f;
        C35470f fVar = this.f94338g;
        if (qVar.f94375f.isPresent()) {
            ((C13923a) qVar.f94375f.get()).mo21356c(playbackStateCompat);
        }
        if (C18434a.m35908d(playbackStateCompat)) {
            cVar.mo5437b(qVar.mo39962c(vVar, optional, playbackStateCompat, str));
        } else if (playbackStateCompat.f994a == 3) {
            C58976aa aaVar = C58975e.f156826a;
            C60870cx d = qVar.mo39963d(vVar, optional, str);
            C60845bz n = C47810es.m84974n(new C36074p(qVar, cVar, z, vVar, fVar));
            C60856cj.m92911t(d, C47810es.m84974n(n), qVar.f94374e);
        }
    }
}
