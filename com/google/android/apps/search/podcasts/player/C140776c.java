package com.google.android.apps.search.podcasts.player;

import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;

/* renamed from: com.google.android.apps.search.podcasts.player.c */
/* compiled from: PG */
public final /* synthetic */ class C140776c {
    /* renamed from: b */
    public static /* synthetic */ void m228582b(C140790h hVar, C140641b bVar, C140784d dVar, long j, boolean z, C140509u uVar, int i) {
        if ((i & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        boolean z2 = ((i & 8) == 0) & z;
        boolean z3 = (i & 16) != 0;
        if ((i & 32) != 0) {
            uVar = C140509u.AUTOPLAY_DEFAULT;
        }
        hVar.mo115893o(bVar, dVar, j2, z2, z3, uVar);
    }
}
