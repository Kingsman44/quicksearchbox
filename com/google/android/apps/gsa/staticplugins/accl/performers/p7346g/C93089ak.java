package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ak */
/* compiled from: PG */
final class C93089ak extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C37215b f259678d;

    public C93089ak(C37215b bVar) {
        this.f259678d = bVar;
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        int i = playbackStateCompat.f994a;
        if (i == 1) {
            this.f259678d.mo19974a(C37176a.f97217hQ.mo40805c(C62722b.OK));
        } else if (i == 2) {
            this.f259678d.mo19974a(C37176a.f97215hO.mo40815i(C62722b.OK));
        } else if (i == 3) {
            this.f259678d.mo19974a(C37176a.f97216hP.mo40815i(C62722b.OK));
        } else if (i != 7) {
            ((C59052c) ((C59052c) C93094ap.f259690a.mo56225c()).mo56372aa(13355)).mo56387q("Unsupport state: %d", playbackStateCompat.f994a);
        } else {
            this.f259678d.mo19974a(C37176a.f97220hT.mo40815i(C62722b.OK));
        }
    }

    /* renamed from: i */
    public final void mo1010i() {
        this.f259678d.mo19974a(C37176a.f97218hR.mo40805c(C62722b.OK));
    }
}
