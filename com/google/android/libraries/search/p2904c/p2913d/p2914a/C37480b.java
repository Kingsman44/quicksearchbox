package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import android.media.AudioManager;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60836bq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.libraries.search.c.d.a.b */
/* compiled from: PG */
public final class C37480b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final C37346ak f99501a;

    /* renamed from: b */
    private final C37493b f99502b;

    /* renamed from: c */
    private final C37490l f99503c;

    /* renamed from: d */
    private final Executor f99504d;

    /* renamed from: e */
    private final Set f99505e = new HashSet();

    /* renamed from: f */
    private final Map f99506f = new HashMap();

    /* renamed from: g */
    private OptionalInt f99507g = OptionalInt.empty();

    public C37480b(C37346ak akVar, C37493b bVar, C37490l lVar, Executor executor) {
        this.f99501a = akVar;
        this.f99502b = bVar;
        this.f99503c = lVar;
        this.f99504d = executor;
    }

    /* renamed from: b */
    private final void m66494b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        if (!this.f99506f.containsKey(onAudioFocusChangeListener)) {
            this.f99506f.put(onAudioFocusChangeListener, new C60836bq());
        }
        C46459k.m82829b(((C60836bq) this.f99506f.get(onAudioFocusChangeListener)).mo57304a(C47810es.m84978r(new C37479a(onAudioFocusChangeListener, i)), this.f99504d), "Failed to notify OnAudioFocusChangeListener.", new Object[0]);
    }

    /* renamed from: a */
    public final synchronized void mo40982a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f99505e.add(onAudioFocusChangeListener);
        if (this.f99507g.isPresent()) {
            m66494b(onAudioFocusChangeListener, this.f99507g.getAsInt());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAudioFocusChange(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            j$.util.OptionalInt r0 = p3186j$.util.OptionalInt.m71640of(r3)     // Catch:{ all -> 0x0040 }
            r2.f99507g = r0     // Catch:{ all -> 0x0040 }
            java.util.Set r0 = r2.f99505e     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x000d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0040 }
            android.media.AudioManager$OnAudioFocusChangeListener r1 = (android.media.AudioManager.OnAudioFocusChangeListener) r1     // Catch:{ all -> 0x0040 }
            r2.m66494b(r1, r3)     // Catch:{ all -> 0x0040 }
            goto L_0x000d
        L_0x001d:
            r0 = -1
            if (r3 == r0) goto L_0x0026
            r0 = -2
            if (r3 == r0) goto L_0x0026
            r0 = -3
            if (r3 != r0) goto L_0x003e
        L_0x0026:
            com.google.android.libraries.search.c.ak r3 = r2.f99501a     // Catch:{ all -> 0x0040 }
            boolean r3 = r3.f99202d     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x003e
            com.google.android.libraries.search.c.d.a.l r3 = r2.f99503c     // Catch:{ all -> 0x0040 }
            com.google.android.libraries.search.c.d.b.b r0 = r2.f99502b     // Catch:{ all -> 0x0040 }
            com.google.common.util.concurrent.cx r3 = r3.mo40988b(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "Failed to release audio focus."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0040 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r3, r0, r1)     // Catch:{ all -> 0x0040 }
            monitor-exit(r2)
            return
        L_0x003e:
            monitor-exit(r2)
            return
        L_0x0040:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0044
        L_0x0043:
            throw r3
        L_0x0044:
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2913d.p2914a.C37480b.onAudioFocusChange(int):void");
    }
}
