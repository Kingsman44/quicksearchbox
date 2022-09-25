package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cw */
/* compiled from: PG */
final class C18877cw extends C0310l {

    /* renamed from: d */
    private final MediaBrowserCompat f53143d;

    /* renamed from: e */
    private final C0320v f53144e;

    public C18877cw(MediaBrowserCompat mediaBrowserCompat, C0320v vVar) {
        this.f53143d = mediaBrowserCompat;
        this.f53144e = vVar;
    }

    /* renamed from: i */
    public final void mo1010i() {
        C59104x d = C18887df.f53161a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) d).mo56372aa(47484)).mo56389s("session destroyed: %s", this.f53144e.mo1039g());
        C0320v vVar = this.f53144e;
        if (vVar != null) {
            vVar.mo1041i(this);
        }
        MediaBrowserCompat mediaBrowserCompat = this.f53143d;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.mo801e();
        }
    }
}
