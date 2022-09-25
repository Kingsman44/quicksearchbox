package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23045j;
import com.google.android.libraries.gsa.monet.p1886a.C22936a;
import com.google.android.libraries.gsa.monet.p1886a.C22948m;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.x */
/* compiled from: PG */
public final class C23000x implements C23045j {

    /* renamed from: a */
    private final C22948m f63266a;

    /* renamed from: b */
    private final C23084ao f63267b;

    /* renamed from: c */
    private final Map f63268c = new HashMap();

    public C23000x(C22948m mVar, C23084ao aoVar) {
        this.f63266a = mVar;
        this.f63267b = aoVar;
    }

    /* renamed from: c */
    public final synchronized void mo28397c(String str) {
        this.f63267b.mo28328a();
        this.f63268c.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.libraries.gsa.monet.p1886a.C22936a mo28395a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.libraries.gsa.monet.shared.ao r0 = r2.f63267b     // Catch:{ all -> 0x0022 }
            r0.mo28328a()     // Catch:{ all -> 0x0022 }
            java.util.Map r0 = r2.f63268c     // Catch:{ all -> 0x0022 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0022 }
            com.google.android.libraries.gsa.monet.a.a r0 = (com.google.android.libraries.gsa.monet.p1886a.C22936a) r0     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0020
            com.google.android.libraries.gsa.monet.a.m r0 = r2.f63266a     // Catch:{ all -> 0x0022 }
            com.google.android.libraries.gsa.monet.a.a r0 = r0.mo28319a(r3)     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0019
            goto L_0x0020
        L_0x0019:
            java.util.Map r1 = r2.f63268c     // Catch:{ all -> 0x0022 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)
            return r0
        L_0x0020:
            monitor-exit(r2)
            return r0
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.monet.internal.p1887a.C23000x.mo28395a(java.lang.String):com.google.android.libraries.gsa.monet.a.a");
    }

    /* renamed from: e */
    public final synchronized void mo28396b(String str, C22936a aVar) {
        this.f63267b.mo28328a();
        this.f63268c.put(str, aVar);
    }
}
