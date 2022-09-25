package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.media.AudioTrack;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.an */
/* compiled from: PG */
public final class C117970an extends C90888av {

    /* renamed from: a */
    public boolean f327417a = false;

    /* renamed from: b */
    public boolean f327418b = false;

    /* renamed from: c */
    public AudioTrack f327419c;

    /* renamed from: d */
    final /* synthetic */ C117971ao f327420d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117970an(C117971ao aoVar) {
        super("CarAudioSpinnerPlayer", "AudioSpinnerTask", 1, 8);
        this.f327420d = aoVar;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: b */
    public static final void m196009b(AudioTrack audioTrack) {
        if (audioTrack != null && audioTrack.getState() == 1) {
            AtomicInteger atomicInteger = C117971ao.f327421a;
            C58976aa aaVar = C58975e.f156826a;
            try {
                audioTrack.pause();
                audioTrack.flush();
                audioTrack.release();
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r1 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C117971ao.f327421a;
        r1 = com.google.common.p4526f.p4527a.C58975e.f156826a;
        r1 = r6.f327420d.f327422b.mo86843b(com.google.android.googlequicksearchbox.R.raw.auto_waiting_signal);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        r3 = r6.f327420d;
        r3 = r3.f327422b.mo86842a(r1, r3.f327423c.mo71745f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r3 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = r1.length;
        r3.setLoopPoints(0, r1 >> 1, (960000 / r1) + 1);
        r3.play();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r6.f327417a == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r6.f327419c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        m196009b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f327417a     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C117971ao.f327421a     // Catch:{ all -> 0x0060 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            return
        L_0x000b:
            boolean r0 = r6.f327418b     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C117971ao.f327421a     // Catch:{ all -> 0x0060 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            return
        L_0x0015:
            r0 = 1
            r6.f327418b = r0     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            java.util.concurrent.atomic.AtomicInteger r1 = com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C117971ao.f327421a
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.w.h.e.ao r1 = r6.f327420d
            com.google.android.apps.gsa.speech.audio.e.a r1 = r1.f327422b
            r2 = 2132017174(0x7f140016, float:1.9672619E38)
            byte[] r1 = r1.mo86843b(r2)
            r2 = 0
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r3 = r2
            goto L_0x004d
        L_0x002d:
            com.google.android.apps.gsa.staticplugins.w.h.e.ao r3 = r6.f327420d
            com.google.android.apps.gsa.speech.audio.e.a r4 = r3.f327422b
            com.google.android.apps.gsa.z.a.f r3 = r3.f327423c
            android.media.AudioAttributes r3 = r3.mo71745f()
            android.media.AudioTrack r3 = r4.mo86842a(r1, r3)
            if (r3 != 0) goto L_0x003e
            goto L_0x002b
        L_0x003e:
            int r1 = r1.length     // Catch:{ IllegalStateException -> 0x002b }
            int r4 = r1 >> 1
            r5 = 960000(0xea600, float:1.345247E-39)
            int r5 = r5 / r1
            int r5 = r5 + r0
            r0 = 0
            r3.setLoopPoints(r0, r4, r5)     // Catch:{ IllegalStateException -> 0x002b }
            r3.play()     // Catch:{ IllegalStateException -> 0x002b }
        L_0x004d:
            monitor-enter(r6)
            boolean r0 = r6.f327417a     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0055
            r6.f327419c = r3     // Catch:{ all -> 0x005d }
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x005c
            m196009b(r2)
        L_0x005c:
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            throw r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0063:
            throw r0
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.C117970an.run():void");
    }
}
