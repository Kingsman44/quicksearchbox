package com.google.android.apps.gsa.search.shared.media;

import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.shared.media.o */
/* compiled from: PG */
final class C87591o extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C0320v f236641d;

    /* renamed from: e */
    final /* synthetic */ C87592p f236642e;

    public C87591o(C87592p pVar, C0320v vVar) {
        this.f236642e = pVar;
        this.f236641d = vVar;
    }

    /* renamed from: i */
    public final void mo1010i() {
        C59071e eVar = C87594r.f236647a;
        this.f236641d.mo1041i(this);
        MediaBrowserCompat mediaBrowserCompat = this.f236642e.f236643c;
        if (mediaBrowserCompat != null && mediaBrowserCompat.mo805i()) {
            this.f236642e.f236643c.mo801e();
        }
    }
}
