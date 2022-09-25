package com.google.android.apps.gsa.staticplugins.p7666ci.p7669c;

import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.c.c */
/* compiled from: PG */
final class C97816c extends C0310l {

    /* renamed from: d */
    private final MediaBrowserCompat f273156d;

    /* renamed from: e */
    private final C0320v f273157e;

    public C97816c(MediaBrowserCompat mediaBrowserCompat, C0320v vVar) {
        this.f273156d = mediaBrowserCompat;
        this.f273157e = vVar;
    }

    /* renamed from: i */
    public final void mo1010i() {
        C59104x d = C97821h.f273172a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) d).mo56372aa(30309)).mo56389s("session destroyed: %s", this.f273157e.mo1039g());
        C0320v vVar = this.f273157e;
        if (vVar != null) {
            vVar.mo1041i(this);
        }
        MediaBrowserCompat mediaBrowserCompat = this.f273156d;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.mo801e();
        }
    }
}
