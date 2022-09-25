package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.b.a */
/* compiled from: PG */
final class C13906a extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C13919c f42347d;

    public C13906a(C13919c cVar) {
        this.f42347d = cVar;
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        C13918b bVar = this.f42347d.f42393d;
        if (bVar == null) {
            ((C59052c) ((C59052c) C13919c.f42390a.mo56226d()).mo56372aa(45175)).mo56386p("playbackStateChangedListener is null.");
        } else {
            bVar.mo21348a(playbackStateCompat);
        }
    }
}
