package com.google.android.apps.gsa.staticplugins.p7401ao;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6813n.C86182a;
import com.google.android.apps.gsa.search.core.p6813n.C86183b;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ao.b */
/* compiled from: PG */
public final class C94025b implements C86183b, C86182a {

    /* renamed from: a */
    static final C118575h f262654a = C118575h.DOWNLOAD_MANAGER;

    /* renamed from: b */
    private static final C59071e f262655b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ao.b");

    /* renamed from: c */
    private final DownloadManager f262656c;

    /* renamed from: d */
    private final C89911f f262657d;

    /* renamed from: e */
    private final C86338r f262658e;

    /* renamed from: f */
    private final C21370a f262659f;

    /* renamed from: g */
    private final C118827a f262660g;

    /* renamed from: h */
    private C58833ax f262661h = C58836b.f156633a;

    public C94025b(Context context, C89911f fVar, C86338r rVar, C21370a aVar, C118827a aVar2, C91022f fVar2) {
        this.f262656c = (DownloadManager) context.getSystemService("download");
        this.f262657d = fVar;
        this.f262658e = rVar;
        this.f262659f = aVar;
        this.f262660g = aVar2;
        fVar2.mo85301a(this);
    }

    /* renamed from: j */
    private final void m155219j() {
        ArrayList arrayList = new ArrayList();
        for (C94024a aVar : mo88308i().values()) {
            if (!aVar.f262652d) {
                C94028e eVar = (C94028e) C94029f.f262665e.createBuilder();
                long j = aVar.f262649a;
                eVar.copyOnWrite();
                C94029f fVar = (C94029f) eVar.instance;
                fVar.f262667a |= 1;
                fVar.f262668b = j;
                long j2 = aVar.f262650b;
                eVar.copyOnWrite();
                C94029f fVar2 = (C94029f) eVar.instance;
                fVar2.f262667a |= 2;
                fVar2.f262669c = j2;
                int i = aVar.f262651c.f330812sk;
                eVar.copyOnWrite();
                C94029f fVar3 = (C94029f) eVar.instance;
                fVar3.f262667a |= 4;
                fVar3.f262670d = i;
                arrayList.add((C94029f) eVar.build());
            }
        }
        C94026c cVar = (C94026c) C94027d.f262662b.createBuilder();
        cVar.copyOnWrite();
        C94027d dVar = (C94027d) cVar.instance;
        C62971cq cqVar = dVar.f262664a;
        if (!cqVar.mo58948c()) {
            dVar.f262664a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) dVar.f262664a);
        C94027d dVar2 = (C94027d) cVar.build();
        C86337q b = this.f262658e.mo80076b();
        b.mo80068c("download_manager_requests", dVar2.toByteArray());
        b.apply();
        C58976aa aaVar = C58975e.f156826a;
        dVar2.f262664a.size();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* renamed from: a */
    public final void mo79819a(long r11) {
        /*
            r10 = this;
            android.app.DownloadManager$Query r0 = new android.app.DownloadManager$Query
            r0.<init>()
            r1 = 1
            long[] r2 = new long[r1]
            r3 = 0
            r2[r3] = r11
            android.app.DownloadManager$Query r0 = r0.setFilterById(r2)
            android.database.Cursor r0 = r10.mo79822e(r0)
            if (r0 == 0) goto L_0x0027
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x001c
            goto L_0x0027
        L_0x001c:
            java.lang.String r2 = "total_size"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ all -> 0x0089 }
            long r2 = r0.getLong(r2)     // Catch:{ all -> 0x0089 }
            goto L_0x0045
        L_0x0027:
            com.google.common.f.e r2 = f262655b     // Catch:{ all -> 0x0089 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0089 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = "DownloadManagerWrapper"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0089 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0089 }
            r3 = 19442(0x4bf2, float:2.7244E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0089 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "Can't find downloadId=%d"
            r2.mo56388r(r3, r11)     // Catch:{ all -> 0x0089 }
            r2 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            r0.close()
        L_0x004a:
            monitor-enter(r10)
            java.util.Map r0 = r10.mo88308i()     // Catch:{ all -> 0x0086 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.staticplugins.ao.a r0 = (com.google.android.apps.gsa.staticplugins.p7401ao.C94024a) r0     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x006a
            com.google.android.apps.gsa.staticplugins.ao.a r0 = new com.google.android.apps.gsa.staticplugins.ao.a     // Catch:{ all -> 0x0086 }
            com.google.android.libraries.f.a r4 = r10.f262659f     // Catch:{ all -> 0x0086 }
            long r7 = r4.mo26872d()     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.u.h r9 = com.google.android.apps.gsa.p8852u.C118575h.UNKNOWN_WORKLOAD     // Catch:{ all -> 0x0086 }
            r4 = r0
            r5 = r11
            r4.<init>(r5, r7, r9)     // Catch:{ all -> 0x0086 }
        L_0x006a:
            r0.f262652d = r1     // Catch:{ all -> 0x0086 }
            r0.f262653e = r2     // Catch:{ all -> 0x0086 }
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0086 }
            r10.m155219j()     // Catch:{ all -> 0x0086 }
            monitor-exit(r10)     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.y.a r11 = r10.f262660g
            com.google.android.apps.gsa.u.b r12 = com.google.android.apps.gsa.p8852u.C118569b.DOWNLOAD_MANAGER_BYTES_RECEIVED
            com.google.android.apps.gsa.u.h r1 = r0.f262651c
            com.google.android.apps.gsa.u.h r2 = f262654a
            com.google.android.apps.gsa.y.a.d r11 = r11.mo77945h(r12, r1, r2)
            long r0 = r0.f262653e
            r11.mo104025g(r0)
            return
        L_0x0086:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0086 }
            throw r11
        L_0x0089:
            r11 = move-exception
            if (r0 == 0) goto L_0x008f
            r0.close()
        L_0x008f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7401ao.C94025b.mo79819a(long):void");
    }

    /* renamed from: b */
    public final int mo79820b(long... jArr) {
        try {
            return this.f262656c.remove(jArr);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            C59104x c = f262655b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DownloadManagerWrapper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19430)).mo56386p("Exception from DownloadManager ");
            this.f262657d.mo83755a(e, 8239226, 29).mo83721a();
            return 0;
        }
    }

    /* renamed from: c */
    public final long mo79821c(DownloadManager.Request request, int i) {
        try {
            long enqueue = this.f262656c.enqueue(request);
            C94024a aVar = new C94024a(enqueue, this.f262659f.mo26872d(), C118575h.m196865a(i));
            synchronized (this) {
                mo88308i().put(Long.valueOf(aVar.f262649a), aVar);
                m155219j();
            }
            return enqueue;
        } catch (SQLiteException | IllegalArgumentException | NullPointerException | SecurityException e) {
            C59104x d = f262655b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DownloadManagerWrapper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(19431)).mo56386p("Download could not be enqueued.");
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: e */
    public final Cursor mo79822e(DownloadManager.Query query) {
        try {
            return this.f262656c.query(query);
        } catch (SQLiteException | IllegalArgumentException e) {
            C59104x d = f262655b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DownloadManagerWrapper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(19432)).mo56386p("DownloadManager.query() failed");
            return null;
        }
    }

    /* renamed from: f */
    public final Uri mo79823f(long j) {
        return this.f262656c.getUriForDownloadedFile(j);
    }

    /* renamed from: g */
    public final InputStream mo79824g(Context context, long j) {
        Uri uriForDownloadedFile = this.f262656c.getUriForDownloadedFile(j);
        if (uriForDownloadedFile != null) {
            return C23335a.m43765b(context.getContentResolver(), uriForDownloadedFile);
        }
        throw new IOException("unable to get URI for file: " + j);
    }

    /* renamed from: gS */
    public final synchronized void mo17602gS(C91006f fVar) {
        fVar.mo85291r("DownloadManager requests");
        for (C94024a gS : mo88308i().values()) {
            gS.mo17602gS(fVar);
        }
    }

    /* renamed from: h */
    public final String mo79825h(long j) {
        return this.f262656c.getMimeTypeForDownloadedFile(j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098 A[SYNTHETIC, Splitter:B:21:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map mo88308i() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "DownloadManagerWrapper"
            com.google.common.base.ax r0 = r1.f262661h
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x00e7
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.google.android.apps.gsa.search.core.preferences.r r0 = r1.f262658e     // Catch:{ ct -> 0x00b0 }
            java.lang.String r4 = "download_manager_requests"
            r5 = 0
            byte[] r6 = new byte[r5]     // Catch:{ ct -> 0x00b0 }
            byte[] r0 = r0.mo80079e(r4, r6)     // Catch:{ ct -> 0x00b0 }
            if (r0 != 0) goto L_0x003a
            com.google.common.f.e r0 = f262655b     // Catch:{ ct -> 0x00b0 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ ct -> 0x00b0 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x00b0 }
            r0.mo56378ag(r4, r2)     // Catch:{ ct -> 0x00b0 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x00b0 }
            r4 = 19440(0x4bf0, float:2.7241E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ ct -> 0x00b0 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ct -> 0x00b0 }
            java.lang.String r4 = "Error: can't load requestContainerBytes"
            r0.mo56386p(r4)     // Catch:{ ct -> 0x00b0 }
            goto L_0x00d1
        L_0x003a:
            com.google.android.apps.gsa.staticplugins.ao.d r4 = com.google.android.apps.gsa.staticplugins.p7401ao.C94027d.f262662b     // Catch:{ ct -> 0x00b0 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0)     // Catch:{ ct -> 0x00b0 }
            com.google.android.apps.gsa.staticplugins.ao.d r0 = (com.google.android.apps.gsa.staticplugins.p7401ao.C94027d) r0     // Catch:{ ct -> 0x00b0 }
            com.google.android.libraries.f.a r4 = r1.f262659f     // Catch:{ ct -> 0x00b0 }
            long r6 = r4.mo26872d()     // Catch:{ ct -> 0x00b0 }
            com.google.protobuf.cq r0 = r0.f262664a     // Catch:{ ct -> 0x00b0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ ct -> 0x00b0 }
        L_0x004e:
            boolean r4 = r0.hasNext()     // Catch:{ ct -> 0x00b0 }
            if (r4 == 0) goto L_0x00a5
            java.lang.Object r4 = r0.next()     // Catch:{ ct -> 0x00b0 }
            com.google.android.apps.gsa.staticplugins.ao.f r4 = (com.google.android.apps.gsa.staticplugins.p7401ao.C94029f) r4     // Catch:{ ct -> 0x00b0 }
            long r9 = r4.f262668b     // Catch:{ ct -> 0x00b0 }
            android.app.DownloadManager$Query r8 = new android.app.DownloadManager$Query     // Catch:{ ct -> 0x00b0 }
            r8.<init>()     // Catch:{ ct -> 0x00b0 }
            r11 = 1
            long[] r11 = new long[r11]     // Catch:{ ct -> 0x00b0 }
            r11[r5] = r9     // Catch:{ ct -> 0x00b0 }
            android.app.DownloadManager$Query r8 = r8.setFilterById(r11)     // Catch:{ ct -> 0x00b0 }
            android.database.Cursor r14 = r1.mo79822e(r8)     // Catch:{ ct -> 0x00b0 }
            if (r14 == 0) goto L_0x0094
            boolean r8 = r14.moveToFirst()     // Catch:{ all -> 0x009d }
            if (r8 == 0) goto L_0x0094
            long r11 = r4.f262669c     // Catch:{ all -> 0x009d }
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x007e
            r11 = 0
        L_0x007e:
            java.lang.Long r15 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x009d }
            com.google.android.apps.gsa.staticplugins.ao.a r13 = new com.google.android.apps.gsa.staticplugins.ao.a     // Catch:{ all -> 0x009d }
            int r4 = r4.f262670d     // Catch:{ all -> 0x009d }
            com.google.android.apps.gsa.u.h r4 = com.google.android.apps.gsa.p8852u.C118575h.m196865a(r4)     // Catch:{ all -> 0x009d }
            r8 = r13
            r5 = r13
            r13 = r4
            r8.<init>(r9, r11, r13)     // Catch:{ all -> 0x009d }
            r3.put(r15, r5)     // Catch:{ all -> 0x009d }
            goto L_0x0096
        L_0x0094:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x009d }
        L_0x0096:
            if (r14 == 0) goto L_0x009b
            r14.close()     // Catch:{ ct -> 0x00b0 }
        L_0x009b:
            r5 = 0
            goto L_0x004e
        L_0x009d:
            r0 = move-exception
            if (r14 != 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r14.close()     // Catch:{ ct -> 0x00b0 }
        L_0x00a4:
            throw r0     // Catch:{ ct -> 0x00b0 }
        L_0x00a5:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r3)
            r1.f262661h = r0
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00d7
        L_0x00ae:
            r0 = move-exception
            goto L_0x00db
        L_0x00b0:
            r0 = move-exception
            com.google.common.f.e r4 = f262655b     // Catch:{ all -> 0x00ae }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x00ae }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ae }
            r4.mo56378ag(r5, r2)     // Catch:{ all -> 0x00ae }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00ae }
            com.google.common.f.x r0 = r4.mo56382g(r0)     // Catch:{ all -> 0x00ae }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00ae }
            r2 = 19437(0x4bed, float:2.7237E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x00ae }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "Caught an exception while loading download requests"
            r0.mo56386p(r2)     // Catch:{ all -> 0x00ae }
        L_0x00d1:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r3)
            r1.f262661h = r0
        L_0x00d7:
            r3.size()
            goto L_0x00e7
        L_0x00db:
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r3)
            r1.f262661h = r2
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.size()
            throw r0
        L_0x00e7:
            com.google.common.base.ax r0 = r1.f262661h
            java.lang.Object r0 = r0.mo56107c()
            java.util.Map r0 = (java.util.Map) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7401ao.C94025b.mo88308i():java.util.Map");
    }
}
