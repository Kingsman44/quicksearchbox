package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C95177ac implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public final /* synthetic */ C95186al f266288a;

    /* renamed from: b */
    public final /* synthetic */ C95294af f266289b;

    /* renamed from: c */
    public final /* synthetic */ Uri f266290c;

    public /* synthetic */ C95177ac(C95186al alVar, C95294af afVar, Uri uri) {
        this.f266288a = alVar;
        this.f266289b = afVar;
        this.f266290c = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPrepared(android.media.MediaPlayer r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.staticplugins.bisto.b.b.al r0 = r6.f266288a
            com.google.android.apps.gsa.staticplugins.bisto.f.af r1 = r6.f266289b
            android.net.Uri r2 = r6.f266290c
            java.lang.Object r3 = r0.f266312d
            monitor-enter(r3)
            android.media.MediaPlayer r4 = r0.f266314f     // Catch:{ all -> 0x007e }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x0015
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            return
        L_0x0015:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            r4 = 2
            int r4 = r7.getSelectedTrack(r4)     // Catch:{ RuntimeException -> 0x0056 }
            android.media.MediaPlayer$TrackInfo[] r5 = r7.getTrackInfo()     // Catch:{ RuntimeException -> 0x0056 }
            if (r5 == 0) goto L_0x002d
            if (r4 < 0) goto L_0x002d
            com.google.android.libraries.performance.primes.au r0 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c.f267102b     // Catch:{ all -> 0x007e }
            r1.mo89220a(r0)     // Catch:{ all -> 0x007e }
            r7.start()     // Catch:{ all -> 0x007e }
            goto L_0x0054
        L_0x002d:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.f266307a     // Catch:{ all -> 0x007e }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ all -> 0x007e }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "UriPlayer"
            r7.mo56378ag(r1, r4)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x007e }
            r1 = 14645(0x3935, float:2.0522E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r1)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "No audio track found for Uri %s"
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.p7158b.C90754k.f253829b     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.p7158b.C90754k.f253829b     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7158b.C90753j.m148240b(r2)     // Catch:{ all -> 0x007e }
            r7.mo56389s(r1, r2)     // Catch:{ all -> 0x007e }
            r0.mo89091b()     // Catch:{ all -> 0x007e }
        L_0x0054:
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            return
        L_0x0056:
            r7 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.f266307a     // Catch:{ all -> 0x007e }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x007e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "UriPlayer"
            r1.mo56378ag(r2, r4)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x007e }
            com.google.common.f.x r7 = r1.mo56382g(r7)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x007e }
            r1 = 14646(0x3936, float:2.0523E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r1)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "Error occurred when requesting audio track"
            r7.mo56386p(r1)     // Catch:{ all -> 0x007e }
            r0.mo89091b()     // Catch:{ all -> 0x007e }
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            return
        L_0x007e:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95177ac.onPrepared(android.media.MediaPlayer):void");
    }
}
