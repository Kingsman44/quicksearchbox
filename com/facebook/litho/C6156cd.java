package com.facebook.litho;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.litho.cd */
/* compiled from: PG */
public final class C6156cd {

    /* renamed from: a */
    private final Map f18202a = new HashMap();

    /* renamed from: a */
    public static void m16225a(C6154cb cbVar, C6168cp cpVar, C6411u uVar) {
        cbVar.f18197b = cpVar;
        Object[] objArr = cbVar.f18199d;
        if (objArr != null) {
            objArr[0] = uVar;
        }
    }

    /* renamed from: b */
    public final synchronized void mo13138b(C6411u uVar, C6168cp cpVar, String str) {
        if (str != null) {
            C6155cc ccVar = (C6155cc) this.f18202a.get(str);
            if (ccVar != null) {
                ccVar.f18201b = true;
                int d = ccVar.f18200a.mo3725d();
                for (int i = 0; i < d; i++) {
                    m16225a((C6154cb) ccVar.f18200a.mo3727f(i), cpVar, uVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo13139c() {
        Iterator it = this.f18202a.keySet().iterator();
        while (it.hasNext()) {
            C6155cc ccVar = (C6155cc) this.f18202a.get(it.next());
            if (ccVar != null) {
                if (ccVar.f18201b) {
                    ccVar.f18201b = false;
                }
            }
            it.remove();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.facebook.litho.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13140d(java.lang.String r4, com.facebook.litho.C6154cb r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0005
            monitor-exit(r3)
            return
        L_0x0005:
            java.util.Map r0 = r3.f18202a     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0047 }
            com.facebook.litho.cc r0 = (com.facebook.litho.C6155cc) r0     // Catch:{ all -> 0x0047 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            com.facebook.litho.cc r0 = new com.facebook.litho.cc     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            java.util.Map r2 = r3.f18202a     // Catch:{ all -> 0x0047 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0047 }
            r4 = r1
            goto L_0x0026
        L_0x001c:
            androidx.c.o r4 = r0.f18200a     // Catch:{ all -> 0x0047 }
            int r2 = r5.f18198c     // Catch:{ all -> 0x0047 }
            java.lang.Object r4 = r4.mo3726e(r2)     // Catch:{ all -> 0x0047 }
            com.facebook.litho.cb r4 = (com.facebook.litho.C6154cb) r4     // Catch:{ all -> 0x0047 }
        L_0x0026:
            boolean r2 = r5.mo13057a(r4)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x003e
            java.lang.Object[] r0 = r5.f18199d     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            r1 = 0
            r0 = r0[r1]     // Catch:{ all -> 0x0047 }
            r1 = r0
            com.facebook.litho.u r1 = (com.facebook.litho.C6411u) r1     // Catch:{ all -> 0x0047 }
        L_0x0037:
            com.facebook.litho.cp r5 = r5.f18197b     // Catch:{ all -> 0x0047 }
            m16225a(r4, r5, r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x003e:
            androidx.c.o r4 = r0.f18200a     // Catch:{ all -> 0x0047 }
            int r0 = r5.f18198c     // Catch:{ all -> 0x0047 }
            r4.mo3730i(r0, r5)     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6156cd.mo13140d(java.lang.String, com.facebook.litho.cb):void");
    }
}
