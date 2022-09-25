package com.google.android.youtube.player.p3561b;

import com.google.android.youtube.player.C45511g;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.youtube.player.b.ba */
public final class C45469ba {

    /* renamed from: a */
    private final YouTubeEmbedSupportFragment f118882a;

    /* renamed from: b */
    private final HashSet f118883b = new HashSet();

    public C45469ba(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment) {
        this.f118882a = youTubeEmbedSupportFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo49621a(com.google.android.youtube.player.C45511g r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0016
            java.util.HashSet r0 = r1.f118883b     // Catch:{ all -> 0x0013 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0016
        L_0x000c:
            java.util.HashSet r0 = r1.f118883b     // Catch:{ all -> 0x0013 }
            r0.add(r2)     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0016:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.p3561b.C45469ba.mo49621a(com.google.android.youtube.player.g):void");
    }

    /* renamed from: b */
    public final synchronized void mo49622b(C45511g gVar) {
        this.f118883b.remove(gVar);
    }

    /* renamed from: c */
    public final synchronized void mo49623c(C45448ag agVar) {
        Iterator it = new HashSet(this.f118883b).iterator();
        while (it.hasNext()) {
            ((C45511g) it.next()).mo44073m(this.f118882a, agVar);
        }
    }
}
