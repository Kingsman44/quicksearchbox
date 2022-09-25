package com.google.android.youtube.player.p3561b;

import com.google.android.youtube.player.C45508d;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.youtube.player.b.az */
public final class C45467az {

    /* renamed from: a */
    private final HashSet f118881a = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo49617a(com.google.android.youtube.player.C45508d r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0016
            java.util.HashSet r0 = r1.f118881a     // Catch:{ all -> 0x0013 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0016
        L_0x000c:
            java.util.HashSet r0 = r1.f118881a     // Catch:{ all -> 0x0013 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.p3561b.C45467az.mo49617a(com.google.android.youtube.player.d):void");
    }

    /* renamed from: b */
    public final synchronized void mo49618b(C45508d dVar) {
        this.f118881a.remove(dVar);
    }

    /* renamed from: c */
    public final synchronized void mo49619c(C45447af afVar) {
        if (afVar == null) {
            C45457ap.m81129b("Null error", new Object[0]);
            return;
        }
        Iterator it = new HashSet(this.f118881a).iterator();
        while (it.hasNext()) {
            ((C45508d) it.next()).mo44074n(afVar);
        }
    }
}
