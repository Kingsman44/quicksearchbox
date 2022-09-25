package com.google.android.apps.search.podcasts.player;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.e */
/* compiled from: PG */
public final class C140787e {

    /* renamed from: a */
    public final PlaybackStateCompat f382280a;

    /* renamed from: b */
    public final MediaMetadataCompat f382281b;

    /* renamed from: c */
    public final C140641b f382282c;

    /* renamed from: d */
    public final C140784d f382283d;

    /* renamed from: e */
    public final C140788f f382284e;

    /* renamed from: f */
    public final long f382285f;

    /* renamed from: g */
    public final C140509u f382286g;

    public C140787e(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, C140641b bVar, C140784d dVar, C140788f fVar, long j, C140509u uVar) {
        C69664n.m101061g(bVar, "episode");
        C69664n.m101061g(dVar, "playbackParams");
        C69664n.m101061g(uVar, "autoplayContext");
        this.f382280a = playbackStateCompat;
        this.f382281b = mediaMetadataCompat;
        this.f382282c = bVar;
        this.f382283d = dVar;
        this.f382284e = fVar;
        this.f382285f = j;
        this.f382286g = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140787e)) {
            return false;
        }
        C140787e eVar = (C140787e) obj;
        return C69664n.m101066l(this.f382280a, eVar.f382280a) && C69664n.m101066l(this.f382281b, eVar.f382281b) && C69664n.m101066l(this.f382282c, eVar.f382282c) && C69664n.m101066l(this.f382283d, eVar.f382283d) && C69664n.m101066l(this.f382284e, eVar.f382284e) && this.f382285f == eVar.f382285f && this.f382286g == eVar.f382286g;
    }

    public final int hashCode() {
        PlaybackStateCompat playbackStateCompat = this.f382280a;
        int i = 0;
        int hashCode = (playbackStateCompat == null ? 0 : playbackStateCompat.hashCode()) * 31;
        MediaMetadataCompat mediaMetadataCompat = this.f382281b;
        int hashCode2 = (((((hashCode + (mediaMetadataCompat == null ? 0 : mediaMetadataCompat.hashCode())) * 31) + this.f382282c.hashCode()) * 31) + this.f382283d.hashCode()) * 31;
        C140788f fVar = this.f382284e;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        long j = this.f382285f;
        return ((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f382286g.hashCode();
    }

    public final String toString() {
        PlaybackStateCompat playbackStateCompat = this.f382280a;
        MediaMetadataCompat mediaMetadataCompat = this.f382281b;
        C140641b bVar = this.f382282c;
        C140784d dVar = this.f382283d;
        C140788f fVar = this.f382284e;
        long j = this.f382285f;
        C140509u uVar = this.f382286g;
        return "PlayerInfo(playbackState=" + playbackStateCompat + ", metadata=" + mediaMetadataCompat + ", episode=" + bVar + ", playbackParams=" + dVar + ", sleepTimerInfo=" + fVar + ", currentPosition=" + j + ", autoplayContext=" + uVar + ")";
    }
}
