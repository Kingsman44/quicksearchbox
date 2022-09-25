package com.google.android.apps.search.podcasts.player;

import com.google.android.apps.search.podcasts.p10601r.C140979f;
import com.google.android.libraries.p1730f.C21370a;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.a */
/* compiled from: PG */
public final class C140752a {
    /* renamed from: a */
    public static final int m228541a(C140787e eVar, C21370a aVar, Long l) {
        long j;
        C69664n.m101061g(aVar, "clock");
        if (l != null) {
            j = l.longValue();
        } else {
            j = m228543c(eVar);
        }
        return C140979f.m228935a(j, m228544d(eVar));
    }

    /* renamed from: b */
    public static final int m228542b(C140787e eVar, C21370a aVar, Long l) {
        Instant instant;
        C140788f fVar;
        C69664n.m101061g(aVar, "clock");
        C140789g gVar = null;
        if (!(eVar == null || (fVar = eVar.f382284e) == null)) {
            gVar = fVar.f382287a;
        }
        if (gVar == null) {
            return 0;
        }
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return m228541a(eVar, aVar, l);
        }
        if (ordinal != 1) {
            return 0;
        }
        long b = aVar.mo26870b();
        C140788f fVar2 = eVar.f382284e;
        long j = 0;
        if (!(fVar2 == null || (instant = fVar2.f382288b) == null)) {
            j = instant.toEpochMilli();
        }
        return C140979f.m228935a(b, j);
    }

    /* renamed from: c */
    public static final long m228543c(C140787e eVar) {
        if (eVar != null) {
            return eVar.f382285f;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r5.f382281b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m228544d(com.google.android.apps.search.podcasts.player.C140787e r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x000f
            android.support.v4.media.MediaMetadataCompat r2 = r5.f382281b
            if (r2 == 0) goto L_0x000f
            java.lang.String r3 = "android.media.metadata.DURATION"
            long r2 = r2.mo816a(r3)
            goto L_0x0010
        L_0x000f:
            r2 = r0
        L_0x0010:
            long r2 = java.lang.Math.max(r0, r2)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            if (r5 == 0) goto L_0x0020
            com.google.android.apps.search.podcasts.m.a.b r5 = r5.f382282c
            if (r5 == 0) goto L_0x0020
            long r0 = r5.f381981h
        L_0x0020:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.C140752a.m228544d(com.google.android.apps.search.podcasts.player.e):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r8 = r8.f382280a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m228545e(com.google.android.apps.search.podcasts.player.C140787e r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x000d
            android.support.v4.media.session.PlaybackStateCompat r1 = r8.f382280a
            if (r1 == 0) goto L_0x000d
            int r0 = r1.f994a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x000d:
            r1 = 1
            if (r0 != 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            int r2 = r0.intValue()
            if (r2 == 0) goto L_0x0037
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            goto L_0x0021
        L_0x001a:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0021
            goto L_0x0037
        L_0x0021:
            r2 = 0
            if (r8 == 0) goto L_0x002c
            android.support.v4.media.session.PlaybackStateCompat r8 = r8.f382280a
            if (r8 == 0) goto L_0x002c
            long r4 = r8.f998e
            goto L_0x002d
        L_0x002c:
            r4 = r2
        L_0x002d:
            r6 = 256(0x100, double:1.265E-321)
            long r4 = r4 & r6
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0035
            return r1
        L_0x0035:
            r8 = 0
            return r8
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.player.C140752a.m228545e(com.google.android.apps.search.podcasts.player.e):boolean");
    }
}
