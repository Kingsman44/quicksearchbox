package com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.b.c */
/* compiled from: PG */
public final class C90994c extends C90998g {

    /* renamed from: a */
    private final Object f254193a = new Object();

    /* renamed from: b */
    private final LinkedHashMap f254194b;

    /* renamed from: c */
    private int f254195c = 0;

    public C90994c(C21370a aVar, int i) {
        super(aVar);
        this.f254194b = new C90993b(i + 1, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C58485gu mo85265a() {
        C58485gu j;
        synchronized (this.f254193a) {
            ArrayList arrayList = new ArrayList(this.f254194b.values());
            Collections.sort(arrayList, C90992a.f254191a);
            j = C58485gu.m89842j(arrayList);
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo85266b(C91000i iVar) {
        String num;
        synchronized (this.f254193a) {
            this.f254194b.put(Integer.valueOf(this.f254195c), iVar);
            int i = this.f254195c;
            this.f254195c = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85267c(java.lang.String r3, com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f254193a
            monitor-enter(r0)
            r1 = 10
            int r3 = java.lang.Integer.parseInt(r3, r1)     // Catch:{ NumberFormatException -> 0x0015 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0015 }
            java.util.LinkedHashMap r1 = r2.f254194b     // Catch:{ NumberFormatException -> 0x0015 }
            r1.put(r3, r4)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x0015
        L_0x0013:
            r3 = move-exception
            goto L_0x0017
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90994c.mo85267c(java.lang.String, com.google.android.apps.gsa.shared.util.debug.a.b.i):void");
    }
}
