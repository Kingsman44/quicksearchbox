package com.google.android.apps.gsa.staticplugins.p7714cv.p7722f;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118947a;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118948b;
import com.google.android.apps.gsa.shared.util.C90760bd;
import com.google.android.apps.gsa.shared.util.C90761be;
import com.google.android.apps.gsa.speech.p7269b.C92217b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.f.b */
/* compiled from: PG */
public final class C98747b implements C118947a {

    /* renamed from: a */
    private static final C59071e f275830a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.f.b");

    /* renamed from: b */
    private static final String[] f275831b = {"IDLE", "RUNNING"};

    /* renamed from: c */
    private Collection f275832c;

    /* renamed from: d */
    private C92217b f275833d;

    /* renamed from: e */
    private final C90761be f275834e;

    /* renamed from: f */
    private C74458k f275835f;

    public C98747b() {
        String[] strArr = f275831b;
        SparseArray sparseArray = new SparseArray(2);
        C90760bd.m148253b(0, strArr);
        C90760bd.m148254c(0, new int[]{1}, strArr, sparseArray);
        C90760bd.m148254c(1, new int[]{0}, strArr, sparseArray);
        this.f275834e = C90760bd.m148252a(strArr, sparseArray, "RecognitionDispatcher", true);
    }

    /* renamed from: g */
    private final synchronized void m163574g(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C90761be beVar = this.f275834e;
        beVar.f253842b.mo85091a();
        int i = beVar.f253843c;
        if (i != 1) {
            String[] strArr = beVar.f253841a;
            String str = strArr[i];
            String str2 = strArr[1];
            beVar.mo85098a("Current state is " + str + ", expected " + str2);
        }
        this.f275834e.mo85099b(0);
        C92217b bVar = this.f275833d;
        if (bVar != null) {
            bVar.mo86897d();
        }
        this.f275833d = null;
        Collection<Pair> collection = this.f275832c;
        if (collection != null) {
            for (Pair pair : collection) {
                ((C118948b) pair.second).mo91277a(z);
            }
        }
        this.f275832c = null;
        this.f275835f = null;
    }

    /* renamed from: a */
    public final synchronized void mo91281a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f275834e.mo85100c(1)) {
            m163574g(z);
        }
    }

    /* renamed from: b */
    public final synchronized void mo91282b(Collection collection, C92217b bVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f275834e.mo85100c(1)) {
            C59104x d = f275830a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RecognitionDispatcher");
            ((C59052c) ((C59052c) d).mo56372aa(31061)).mo56386p("Multiple recognitions in progress, the first will be cancelled.");
            m163574g(true);
        }
        if (axVar.mo56113h()) {
            this.f275835f = (C74458k) axVar.mo56107c();
        }
        this.f275834e.mo85099b(1);
        this.f275832c = collection;
        this.f275833d = bVar;
    }

    /* renamed from: c */
    public final synchronized void mo91283c(Collection collection, C92473f fVar, C92217b bVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo91282b(collection, bVar, axVar);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((C118948b) ((Pair) it.next()).second).mo91278b(bVar, fVar, axVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r2 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo91284d(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005e }
            com.google.android.apps.gsa.shared.util.be r0 = r5.f275834e     // Catch:{ all -> 0x005e }
            r1 = 1
            boolean r0 = r0.mo85100c(r1)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005c
            java.util.Collection r0 = r5.f275832c     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0039
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005e }
            r2 = 0
        L_0x0015:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x005e }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x005e }
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x005e }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x005e }
            int r4 = r4.intValue()     // Catch:{ all -> 0x005e }
            if (r6 != r4) goto L_0x0015
            java.lang.Object r2 = r3.second     // Catch:{ all -> 0x005e }
            com.google.android.apps.gsa.z.d.a.b r2 = (com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118948b) r2     // Catch:{ all -> 0x005e }
            r2.mo91277a(r1)     // Catch:{ all -> 0x005e }
            r0.remove()     // Catch:{ all -> 0x005e }
            r2 = 1
            goto L_0x0015
        L_0x0037:
            if (r2 != 0) goto L_0x004d
        L_0x0039:
            com.google.common.f.e r0 = f275830a     // Catch:{ all -> 0x005e }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x005e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "RecognitionDispatcher"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "Could not stop engine: %d."
            r3 = 31065(0x7959, float:4.3531E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56387q(r2, r6)     // Catch:{ all -> 0x005e }
        L_0x004d:
            java.util.Collection r6 = r5.f275832c     // Catch:{ all -> 0x005e }
            if (r6 == 0) goto L_0x005c
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x005e }
            if (r6 == 0) goto L_0x005c
            r5.m163574g(r1)     // Catch:{ all -> 0x005e }
            monitor-exit(r5)
            return
        L_0x005c:
            monitor-exit(r5)
            return
        L_0x005e:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0062
        L_0x0061:
            throw r6
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7722f.C98747b.mo91284d(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized boolean mo91285e() {
        return this.f275834e.mo85100c(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo91286f(com.google.android.apps.gsa.p5836c.p5843f.C74458k r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo91285e()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0024
            com.google.android.apps.gsa.c.f.k r0 = r4.f275835f     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0024
            com.google.android.apps.gsa.speech.l.b r0 = r0.mo70774a()     // Catch:{ all -> 0x0027 }
            long r0 = r0.mo87197h()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.speech.l.b r5 = r5.mo70774a()     // Catch:{ all -> 0x0027 }
            long r2 = r5.mo87197h()     // Catch:{ all -> 0x0027 }
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0022
            monitor-exit(r4)
            r5 = 1
            return r5
        L_0x0022:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0027 }
        L_0x0024:
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x0027:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7714cv.p7722f.C98747b.mo91286f(com.google.android.apps.gsa.c.f.k):boolean");
    }
}
