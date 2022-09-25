package com.google.android.libraries.search.assistant.performer.p2757g.p2761b;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a.C36060b;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a.C36075q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a */
/* compiled from: PG */
final class C36058a extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C36079c f94317d;

    public C36058a(C36079c cVar) {
        this.f94317d = cVar;
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        C36077b bVar = this.f94317d.f94394d;
        if (bVar == null) {
            ((C59052c) ((C59052c) C36079c.f94391a.mo56226d()).mo56372aa(52164)).mo56386p("playbackStateChangedListener is null.");
        } else {
            bVar.mo39959a(playbackStateCompat);
        }
    }

    /* renamed from: i */
    public final void mo1010i() {
        C36060b bVar = this.f94317d.f94395e;
        if (bVar == null) {
            ((C59052c) ((C59052c) C36079c.f94391a.mo56226d()).mo56372aa(52165)).mo56386p("sessionDestroyedListener is null.");
            return;
        }
        C36075q qVar = bVar.f94323a;
        C59104x b = C36075q.f94370a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
        ((C59052c) ((C59052c) b).mo56372aa(52178)).mo56386p("Received signal that media session has been destroyed.");
        qVar.f94376g = true;
    }
}
