package com.google.android.apps.gsa.p8889z.p8890a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.z.a.a */
/* compiled from: PG */
final class C118838a extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C118842e f331454a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118838a(C118842e eVar) {
        super("Play TTS data", 1, 12);
        this.f331454a = eVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:8|9|(4:11|12|13|14)|15|(1:17)|18|(2:21|22)|23|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.apps.gsa.z.a.e r0 = r6.f331454a
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
            r0.f331463g = r1
            android.media.MediaPlayer r1 = r0.f331463g
            com.google.android.apps.gsa.z.a.f r2 = r0.f331461e
            android.media.AudioAttributes r2 = r2.mo71764y()
            r1.setAudioAttributes(r2)
            r0.mo104033a()     // Catch:{ IOException -> 0x009f }
            android.media.MediaPlayer r1 = r0.f331463g     // Catch:{ IOException -> 0x009f }
            r1.prepare()     // Catch:{ IOException -> 0x009f }
            com.google.android.apps.gsa.z.a.f r1 = r0.f331461e     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r1.mo71750k()     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            android.media.MediaPlayer r1 = r0.f331463g     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            com.google.android.apps.gsa.z.a.b r2 = new com.google.android.apps.gsa.z.a.b     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r1.setOnErrorListener(r2)     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            android.os.ConditionVariable r1 = r0.f331459c     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r1.block()     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            boolean r1 = r0.f331464h     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            if (r1 == 0) goto L_0x0038
            r0.mo104034b()
            return
        L_0x0038:
            com.google.android.apps.gsa.z.a.f r1 = r0.f331461e     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            android.media.MediaPlayer r2 = r0.f331463g     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            int r2 = r2.getAudioSessionId()     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r1.mo71748i(r2)     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            android.media.MediaPlayer r1 = r0.f331463g     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            com.google.android.apps.gsa.z.a.c r2 = new com.google.android.apps.gsa.z.a.c     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r1.setOnCompletionListener(r2)     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            double r1 = r0.f331465i     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0065
            android.media.MediaPlayer r3 = r0.f331463g     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            int r4 = r3.getDuration()     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            double r1 = r1 * r4
            int r1 = (int) r1
            r3.seekTo(r1)     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
        L_0x0065:
            android.media.MediaPlayer r1 = r0.f331463g     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r1.start()     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            com.google.android.apps.gsa.z.a.d r1 = r0.f331467k     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            if (r1 == 0) goto L_0x0071
            r1.mo65016a()     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
        L_0x0071:
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.g r1 = r0.f331468l     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            android.media.MediaPlayer r2 = r0.f331463g     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            if (r2 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x008d
            int r2 = r2.getDuration()     // Catch:{ IllegalStateException -> 0x008d }
            com.google.android.libraries.gsa.k.g r3 = r1.f299984a     // Catch:{ IllegalStateException -> 0x008d }
            com.google.android.apps.gsa.staticplugins.opa.bb.c.j r4 = r1.f299985b     // Catch:{ IllegalStateException -> 0x008d }
            com.google.android.apps.gsa.staticplugins.opa.bb.a.l r1 = r1.f299986c     // Catch:{ IllegalStateException -> 0x008d }
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.h r5 = new com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.h     // Catch:{ IllegalStateException -> 0x008d }
            r5.<init>(r4, r1, r2)     // Catch:{ IllegalStateException -> 0x008d }
            java.lang.String r1 = "[NGA] Send TTS info."
            r3.mo28212l(r1, r5)     // Catch:{ IllegalStateException -> 0x008d }
        L_0x008d:
            android.os.ConditionVariable r1 = r0.f331460d     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r1.block()     // Catch:{ IllegalArgumentException -> 0x009b, all -> 0x0096 }
            r0.mo104034b()
            return
        L_0x0096:
            r1 = move-exception
            r0.mo104034b()
            throw r1
        L_0x009b:
            r0.mo104034b()
            return
        L_0x009f:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.p8889z.p8890a.C118842e.f331457a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "I/O Exception initializing media player"
            r4 = 34167(0x8577, float:4.7878E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
            r0.mo104034b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8889z.p8890a.C118838a.run():void");
    }
}
