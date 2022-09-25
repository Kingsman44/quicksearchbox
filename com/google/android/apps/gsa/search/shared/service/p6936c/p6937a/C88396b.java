package com.google.android.apps.gsa.search.shared.service.p6936c.p6937a;

import com.google.android.apps.gsa.p6484r.C84250e;
import com.google.android.apps.gsa.p6484r.C84251f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.a.b */
/* compiled from: PG */
public class C88396b extends C84250e {

    /* renamed from: b */
    private static final C59071e f239014b = C59071e.m91332i("com.google.android.apps.gsa.search.shared.service.c.a.b");

    /* renamed from: c */
    private C22871g f239015c;

    /* renamed from: d */
    private C88395a f239016d;

    public C88396b(C88395a aVar, C22871g gVar) {
        this.f239016d = aVar;
        this.f239015c = gVar;
    }

    /* renamed from: e */
    public boolean mo77734e() {
        return this.f239016d != null;
    }

    /* renamed from: f */
    public final synchronized void mo81996f() {
        this.f239016d = null;
    }

    /* renamed from: g */
    public final synchronized void mo81997g() {
        C22871g gVar = this.f239015c;
        if (gVar != null) {
            C84251f.m134340b(this, gVar);
            this.f239015c = null;
            return;
        }
        C59104x d = f239014b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SessionDebugComp");
        ((C59052c) ((C59052c) d).mo56372aa(9778)).mo56386p("#register: Component is already registered");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.os.Bundle mo77730a(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 4
            if (r3 != r0) goto L_0x0026
            com.google.android.apps.gsa.search.shared.service.c.a.a r3 = r2.f239016d     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0026
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0041 }
            r3.<init>()     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.search.shared.service.c.a.a r1 = r2.f239016d     // Catch:{ all -> 0x0041 }
            int r1 = r1.mo80724a()     // Catch:{ all -> 0x0041 }
            switch(r1) {
                case 1: goto L_0x001e;
                case 2: goto L_0x001c;
                case 3: goto L_0x001a;
                case 4: goto L_0x001f;
                case 5: goto L_0x0018;
                case 6: goto L_0x0018;
                case 7: goto L_0x0018;
                case 8: goto L_0x0018;
                case 9: goto L_0x001f;
                case 10: goto L_0x001a;
                default: goto L_0x0016;
            }     // Catch:{ all -> 0x0041 }
        L_0x0016:
            r0 = 0
            goto L_0x001f
        L_0x0018:
            r0 = 3
            goto L_0x001f
        L_0x001a:
            r0 = 2
            goto L_0x001f
        L_0x001c:
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 5
        L_0x001f:
            java.lang.String r1 = "state"
            r3.putInt(r1, r0)     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)
            return r3
        L_0x0026:
            com.google.android.apps.gsa.search.shared.service.c.a.a r3 = r2.f239016d     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x003e
            com.google.common.f.e r3 = f239014b     // Catch:{ all -> 0x0041 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0041 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "SessionDebugComp"
            r3.mo56378ag(r0, r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "getViewMetadata: Component is invalid"
            r1 = 9777(0x2631, float:1.37E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0041 }
        L_0x003e:
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.service.p6936c.p6937a.C88396b.mo77730a(int):android.os.Bundle");
    }
}
