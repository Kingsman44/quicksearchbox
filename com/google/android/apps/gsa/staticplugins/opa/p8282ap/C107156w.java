package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6624bw.C85031a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.opa.C109032fb;
import com.google.android.apps.gsa.staticplugins.opa.C109036ff;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.w */
/* compiled from: PG */
public final class C107156w extends C86734a implements C85031a {

    /* renamed from: a */
    public static final C59071e f298271a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ap.w");

    /* renamed from: b */
    public final C91189au f298272b;

    /* renamed from: c */
    public final Context f298273c;

    /* renamed from: f */
    public final C22871g f298274f;

    /* renamed from: g */
    private final SortedMap f298275g = new TreeMap();

    /* renamed from: h */
    private boolean f298276h;

    /* renamed from: i */
    private final C22871g f298277i;

    /* renamed from: j */
    private int f298278j = 0;

    public C107156w(C22871g gVar, C91189au auVar, Context context, C90821bm bmVar) {
        super(C118575h.WORKER_PHOTO_DOWNLOADER, "photo_downloader");
        this.f298277i = gVar;
        this.f298272b = auVar;
        this.f298273c = context;
        this.f298274f = bmVar.mo85163a(C107155v.class);
    }

    /* renamed from: n */
    private final synchronized boolean m177889n() {
        return this.f298278j == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m177890p(com.google.android.apps.gsa.staticplugins.opa.C109036ff r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m177889n()     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r0 = 1
            r3.f298278j = r0     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x0021
            com.google.android.apps.gsa.staticplugins.opa.ap.n r0 = new com.google.android.apps.gsa.staticplugins.opa.ap.n     // Catch:{ all -> 0x0023 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0023 }
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r4.f303204c     // Catch:{ all -> 0x0023 }
            com.google.android.libraries.gsa.k.g r1 = r1.f303448m     // Catch:{ all -> 0x0023 }
            com.google.android.apps.gsa.staticplugins.opa.fd r2 = new com.google.android.apps.gsa.staticplugins.opa.fd     // Catch:{ all -> 0x0023 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = "Inflate the progress bar and show it"
            r1.mo28212l(r4, r2)     // Catch:{ all -> 0x0023 }
            monitor-exit(r3)
            return
        L_0x0021:
            monitor-exit(r3)
            return
        L_0x0023:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107156w.m177890p(com.google.android.apps.gsa.staticplugins.opa.ff):void");
    }

    /* renamed from: a */
    public final synchronized C60870cx mo78661a(List list) {
        return C60922j.m93045h(mo95814i(list, (C109036ff) null), new C107148o(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final synchronized int mo95809c() {
        return this.f298278j;
    }

    /* renamed from: e */
    public final synchronized C58833ax mo95810e() {
        if (!this.f298275g.isEmpty()) {
            return C58833ax.m90834k(new ArrayList(this.f298275g.values()));
        }
        return C58836b.f156633a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:29|30|31|32|33|34|35|36|37|38|39) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:44|(2:50|51)|52|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r0.createNewFile() == false) goto L_0x009b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00ff */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fc A[SYNTHETIC, Splitter:B:50:0x00fc] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x00c2=Splitter:B:36:0x00c2, B:52:0x00ff=Splitter:B:52:0x00ff} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95811f(int r8, byte[] r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.f298273c     // Catch:{ all -> 0x0110 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            java.util.SortedMap r1 = r7.f298275g     // Catch:{ all -> 0x0110 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0110 }
            com.google.android.apps.gsa.shared.util.ac r2 = com.google.android.apps.gsa.shared.util.C90719ac.f253778a     // Catch:{ all -> 0x0110 }
            java.util.Random r2 = r2.f253779b     // Catch:{ all -> 0x0110 }
            long r2 = r2.nextLong()     // Catch:{ all -> 0x0110 }
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "content://com.google.android.googlequicksearchbox.GsaPublicContentProvider/personal_photos/"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0110 }
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r5.<init>()     // Catch:{ all -> 0x0110 }
            r5.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = ".png"
            r5.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0110 }
            android.net.Uri$Builder r2 = r4.appendPath(r2)     // Catch:{ all -> 0x0110 }
            android.net.Uri r2 = r2.build()     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r2.getLastPathSegment()     // Catch:{ all -> 0x0110 }
            r4 = 0
            if (r3 == 0) goto L_0x009b
            java.io.File r0 = com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107131a.m177852g(r3, r0)     // Catch:{ all -> 0x0110 }
            java.io.File r5 = r0.getParentFile()     // Catch:{ IOException -> 0x008d }
            if (r5 != 0) goto L_0x0063
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107131a.f298209a     // Catch:{ IOException -> 0x008d }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ IOException -> 0x008d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x008d }
            r2 = 25332(0x62f4, float:3.5498E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ IOException -> 0x008d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x008d }
            java.lang.String r2 = "FileProvider: Failed to create file, no parent directory."
            r0.mo56386p(r2)     // Catch:{ IOException -> 0x008d }
            goto L_0x009b
        L_0x0063:
            boolean r6 = r5.exists()     // Catch:{ IOException -> 0x008d }
            if (r6 != 0) goto L_0x0086
            boolean r5 = r5.mkdirs()     // Catch:{ IOException -> 0x008d }
            if (r5 == 0) goto L_0x0070
            goto L_0x0086
        L_0x0070:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107131a.f298209a     // Catch:{ IOException -> 0x008d }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ IOException -> 0x008d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x008d }
            r2 = 25331(0x62f3, float:3.5496E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ IOException -> 0x008d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x008d }
            java.lang.String r2 = "FileProvider: Failed to create parent dir"
            r0.mo56386p(r2)     // Catch:{ IOException -> 0x008d }
            goto L_0x009b
        L_0x0086:
            boolean r0 = r0.createNewFile()     // Catch:{ IOException -> 0x008d }
            if (r0 != 0) goto L_0x00a9
            goto L_0x009b
        L_0x008d:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107131a.f298209a     // Catch:{ all -> 0x0110 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = "FileProvider: Failed to create file"
            r6 = 25330(0x62f2, float:3.5495E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x0110 }
        L_0x009b:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107131a.f298209a     // Catch:{ all -> 0x0110 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = "Failed to create temp file. fileName: %s"
            r5 = 25326(0x62ee, float:3.5489E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56389s(r2, r3)     // Catch:{ all -> 0x0110 }
            r2 = r4
        L_0x00a9:
            if (r2 == 0) goto L_0x0108
            java.lang.String r0 = r2.getLastPathSegment()     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0100
            android.content.Context r3 = r7.f298273c     // Catch:{ all -> 0x0110 }
            java.io.File r0 = com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107131a.m177852g(r0, r3)     // Catch:{ all -> 0x0110 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00cf }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00cf }
            r3.write(r9)     // Catch:{ IOException -> 0x00ca, all -> 0x00c7 }
            r3.close()     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            r1.put(r8, r2)     // Catch:{ all -> 0x0110 }
            monitor-exit(r7)
            return
        L_0x00c7:
            r8 = move-exception
            r4 = r3
            goto L_0x00fa
        L_0x00ca:
            r8 = move-exception
            r4 = r3
            goto L_0x00d0
        L_0x00cd:
            r8 = move-exception
            goto L_0x00fa
        L_0x00cf:
            r8 = move-exception
        L_0x00d0:
            r0.delete()     // Catch:{ all -> 0x00cd }
            com.google.common.f.e r9 = f298271a     // Catch:{ all -> 0x00cd }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ all -> 0x00cd }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x00cd }
            com.google.common.f.x r8 = r9.mo56382g(r8)     // Catch:{ all -> 0x00cd }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00cd }
            r9 = 25342(0x62fe, float:3.5512E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r9)     // Catch:{ all -> 0x00cd }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00cd }
            java.lang.String r9 = "Cannot create temporary file %s"
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x00cd }
            r8.mo56389s(r9, r0)     // Catch:{ all -> 0x00cd }
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x00cd }
            java.lang.String r9 = "Cannot create photo file"
            r8.<init>(r9)     // Catch:{ all -> 0x00cd }
            throw r8     // Catch:{ all -> 0x00cd }
        L_0x00fa:
            if (r4 == 0) goto L_0x00ff
            r4.close()     // Catch:{ IOException -> 0x00ff }
        L_0x00ff:
            throw r8     // Catch:{ all -> 0x0110 }
        L_0x0100:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = "Invalid file name for photo file"
            r8.<init>(r9)     // Catch:{ all -> 0x0110 }
            throw r8     // Catch:{ all -> 0x0110 }
        L_0x0108:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = "Failed to get uri for photo file"
            r8.<init>(r9)     // Catch:{ all -> 0x0110 }
            throw r8     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107156w.mo95811f(int, byte[]):void");
    }

    /* renamed from: g */
    public final synchronized void mo95812g() {
        File[] listFiles = new File(this.f298273c.getCacheDir(), "personal_photos").listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95813h() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f298276h     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.f298273c     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000a
            goto L_0x001b
        L_0x000a:
            com.google.android.libraries.gsa.k.g r0 = r3.f298277i     // Catch:{ all -> 0x001d }
            com.google.android.apps.gsa.staticplugins.opa.ap.m r1 = new com.google.android.apps.gsa.staticplugins.opa.ap.m     // Catch:{ all -> 0x001d }
            r1.<init>(r3)     // Catch:{ all -> 0x001d }
            java.lang.String r2 = "Toast execution"
            r0.mo28212l(r2, r1)     // Catch:{ all -> 0x001d }
            r0 = 1
            r3.f298276h = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r3)
            return
        L_0x001b:
            monitor-exit(r3)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107156w.mo95813h():void");
    }

    /* renamed from: i */
    public final synchronized C60870cx mo95814i(List list, C109036ff ffVar) {
        ArrayList arrayList;
        mo95816k(ffVar);
        this.f298275g.clear();
        this.f298274f.mo28212l("clear photo directory", new C107150q(this));
        m177890p(ffVar);
        int size = list.size();
        mo95817l(ffVar, size);
        arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(this.f298274f.mo28202b("download photo: ".concat(String.valueOf((String) list.get(i))), new C107151r(this, i, list, ffVar)));
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C107152s(this, ffVar), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final synchronized C60870cx mo95815j(List list, C109036ff ffVar) {
        return C60922j.m93044g(mo95814i(list, ffVar), new C107149p(this, list), C60826bg.f164896a);
    }

    /* renamed from: k */
    public final synchronized void mo95816k(C109036ff ffVar) {
        if (m177889n()) {
            this.f298278j = 2;
        }
        if (ffVar != null) {
            ffVar.f303204c.f303448m.mo28212l("Hide the progress bar", new C109032fb(ffVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95817l(com.google.android.apps.gsa.staticplugins.opa.C109036ff r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r7 == 0) goto L_0x0059
            if (r6 == 0) goto L_0x0059
            java.util.SortedMap r0 = r5.f298275g     // Catch:{ all -> 0x0056 }
            int r0 = r0.size()     // Catch:{ all -> 0x0056 }
            r1 = 1
            int r0 = r0 + r1
            int r0 = java.lang.Math.min(r0, r7)     // Catch:{ all -> 0x0056 }
            com.google.android.apps.gsa.staticplugins.opa.fj r2 = r6.f303204c     // Catch:{ all -> 0x0056 }
            com.google.android.libraries.gsa.k.g r2 = r2.f303448m     // Catch:{ all -> 0x0056 }
            com.google.android.apps.gsa.staticplugins.opa.ez r3 = new com.google.android.apps.gsa.staticplugins.opa.ez     // Catch:{ all -> 0x0056 }
            r3.<init>(r6, r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "Set the progress bar max"
            r2.mo28212l(r4, r3)     // Catch:{ all -> 0x0056 }
            com.google.android.apps.gsa.staticplugins.opa.fj r2 = r6.f303204c     // Catch:{ all -> 0x0056 }
            com.google.android.libraries.gsa.k.g r2 = r2.f303448m     // Catch:{ all -> 0x0056 }
            com.google.android.apps.gsa.staticplugins.opa.fc r3 = new com.google.android.apps.gsa.staticplugins.opa.fc     // Catch:{ all -> 0x0056 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "Set the progress bar progress"
            r2.mo28212l(r4, r3)     // Catch:{ all -> 0x0056 }
            android.content.Context r2 = r5.f298273c     // Catch:{ all -> 0x0056 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0056 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0056 }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x0056 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0056 }
            r3[r1] = r7     // Catch:{ all -> 0x0056 }
            r7 = 2132092335(0x7f1525af, float:1.9825064E38)
            java.lang.String r7 = r2.getString(r7, r3)     // Catch:{ all -> 0x0056 }
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r6.f303204c     // Catch:{ all -> 0x0056 }
            com.google.android.libraries.gsa.k.g r0 = r0.f303448m     // Catch:{ all -> 0x0056 }
            com.google.android.apps.gsa.staticplugins.opa.fe r1 = new com.google.android.apps.gsa.staticplugins.opa.fe     // Catch:{ all -> 0x0056 }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = "Change text of the progress bar"
            r0.mo28212l(r6, r1)     // Catch:{ all -> 0x0056 }
            monitor-exit(r5)
            return
        L_0x0056:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0059:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107156w.mo95817l(com.google.android.apps.gsa.staticplugins.opa.ff, int):void");
    }

    /* renamed from: m */
    public final synchronized boolean mo95818m(C109036ff ffVar) {
        if (!m177889n()) {
            return false;
        }
        this.f298278j = 3;
        mo95816k(ffVar);
        return true;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
