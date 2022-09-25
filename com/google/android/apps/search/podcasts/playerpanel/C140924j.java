package com.google.android.apps.search.podcasts.playerpanel;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140788f;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.j */
/* compiled from: PG */
final class C140924j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140787e f382662a;

    /* renamed from: b */
    final /* synthetic */ boolean f382663b;

    /* renamed from: c */
    final /* synthetic */ boolean f382664c;

    /* renamed from: d */
    final /* synthetic */ C140927m f382665d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140924j(C140787e eVar, boolean z, boolean z2, C140927m mVar) {
        super(1);
        this.f382662a = eVar;
        this.f382663b = z;
        this.f382664c = z2;
        this.f382665d = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C140641b bVar = (C140641b) obj;
        C69664n.m101061g(bVar, "updatedEpisode");
        C140787e eVar = this.f382662a;
        PlaybackStateCompat playbackStateCompat = eVar.f382280a;
        MediaMetadataCompat mediaMetadataCompat = eVar.f382281b;
        C140784d dVar = eVar.f382283d;
        C140788f fVar = eVar.f382284e;
        long j = eVar.f382285f;
        C140509u uVar = eVar.f382286g;
        C69664n.m101061g(bVar, "episode");
        C69664n.m101061g(dVar, "playbackParams");
        C69664n.m101061g(uVar, "autoplayContext");
        C140787e eVar2 = new C140787e(playbackStateCompat, mediaMetadataCompat, bVar, dVar, fVar, j, uVar);
        boolean z = false;
        if (this.f382663b && this.f382664c) {
            z = true;
        }
        return new C140923i(eVar2, z, this.f382665d.mo116023a(eVar2));
    }
}
