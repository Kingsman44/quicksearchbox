package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6588bg.C84839a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.dh */
/* compiled from: PG */
public final class C86982dh extends C86898ct {

    /* renamed from: a */
    public static final C59071e f234930a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.dh");

    /* renamed from: b */
    public final C68214a f234931b;

    /* renamed from: c */
    public final C86124t f234932c;

    /* renamed from: d */
    public Query f234933d = Query.f252741b;

    /* renamed from: e */
    public PlaybackStatus f234934e;

    /* renamed from: f */
    private final C84839a f234935f;

    /* renamed from: g */
    private final C22871g f234936g;

    public C86982dh(C68214a aVar, C68214a aVar2, C86124t tVar, C84839a aVar3, C22871g gVar) {
        super(aVar, 79);
        this.f234931b = aVar2;
        this.f234932c = tVar;
        this.f234935f = aVar3;
        this.f234936g = gVar;
    }

    /* renamed from: a */
    public final void mo80622a() {
        new C90873ag(this.f234935f.mo78523a(), this.f234936g, "MediaControlState.storePlaybackStatusSnapshot", new C86980df(this)).mo85223a(C86981dg.f234929a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }
}
