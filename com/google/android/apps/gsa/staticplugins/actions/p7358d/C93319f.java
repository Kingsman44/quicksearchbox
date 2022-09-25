package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.p4152bb.p4153a.C54946ad;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.f */
/* compiled from: PG */
final class C93319f extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C54946ad f260240a;

    /* renamed from: b */
    final /* synthetic */ Query f260241b;

    /* renamed from: c */
    final /* synthetic */ C93320g f260242c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93319f(C93320g gVar, C54946ad adVar, Query query) {
        super("Processing ActionV2", 1, 0);
        this.f260242c = gVar;
        this.f260240a = adVar;
        this.f260241b = query;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f260242c.mo87635b(this.f260240a, this.f260241b, (PlaybackStatus) null);
    }
}
