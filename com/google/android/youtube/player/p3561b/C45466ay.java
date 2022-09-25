package com.google.android.youtube.player.p3561b;

import com.google.android.youtube.player.C45438a;
import java.security.AccessControlException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.youtube.player.b.ay */
public final class C45466ay {

    /* renamed from: a */
    public final Set f118879a = new HashSet();

    /* renamed from: b */
    public int f118880b = 1;

    /* renamed from: a */
    public final synchronized void mo49614a(C45438a aVar) {
        if (this.f118880b == 3) {
            throw new AccessControlException("Permission denied: unauthorized usage of Ad Events API");
        } else if (!this.f118879a.contains(aVar)) {
            this.f118879a.add(aVar);
        }
    }

    /* renamed from: b */
    public final synchronized void mo49615b(C45438a aVar) {
        this.f118879a.remove(aVar);
    }

    /* renamed from: c */
    public final synchronized void mo49616c(C45504x xVar) {
        Iterator it = new HashSet(this.f118879a).iterator();
        while (it.hasNext()) {
            ((C45438a) it.next()).mo44072i(xVar);
        }
    }
}
