package com.google.android.apps.search.podcasts;

import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.player.impl.C140812at;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.p4526f.C59071e;
import com.google.p4225bm.p4229c.C56113b;

/* renamed from: com.google.android.apps.search.podcasts.e */
/* compiled from: PG */
public final class C140198e {

    /* renamed from: a */
    public static final C59071e f380898a = C59071e.m91332i("com.google.android.apps.search.podcasts.e");

    /* renamed from: b */
    public final PodcastsActivity f380899b;

    /* renamed from: c */
    public final C28306ab f380900c;

    /* renamed from: d */
    public final C140498j f380901d;

    /* renamed from: e */
    public final C45989b f380902e;

    /* renamed from: f */
    public final C140812at f380903f;

    /* renamed from: g */
    public final C140749o f380904g;

    public C140198e(PodcastsActivity podcastsActivity, C45989b bVar, C32158h hVar, C28306ab abVar, C140498j jVar, C140812at atVar, C140749o oVar) {
        this.f380899b = podcastsActivity;
        this.f380900c = abVar;
        this.f380901d = jVar;
        this.f380902e = bVar;
        this.f380903f = atVar;
        this.f380904g = oVar;
        hVar.mo37971b(podcastsActivity, new C140193d(this), bVar);
    }

    /* renamed from: a */
    public final C56113b mo115495a() {
        return C56113b.m87894a(this.f380899b.getIntent().getIntExtra("entry_point_type_int", C56113b.PODCASTS_APP_HOMEBASE.f149497u));
    }
}
