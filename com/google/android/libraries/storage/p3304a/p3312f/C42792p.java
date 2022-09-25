package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42743d;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.storage.a.f.p */
/* compiled from: PG */
public final class C42792p implements C42797g {

    /* renamed from: a */
    public boolean f112057a;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|(3:6|7|(2:9|(1:11)(2:12|13)))|15|16|(2:19|17)|27|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((android.system.Os.lstat(r0.getAbsolutePath()).st_mode & android.system.OsConstants.S_IFLNK) != 0) goto L_0x0049;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0031 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ IOException -> 0x0051 }, LOOP:0: B:17:0x0039->B:19:0x003f, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m75563b(com.google.android.libraries.storage.p3304a.C42813k r3, android.net.Uri r4, java.util.List r5) {
        /*
            r2 = this;
            com.google.android.libraries.storage.a.f.l r0 = new com.google.android.libraries.storage.a.f.l
            r0.<init>()
            r1 = 1
            r0.f112052a = r1
            boolean r1 = r3.mo45895i(r4)     // Catch:{ IOException -> 0x0051 }
            if (r1 == 0) goto L_0x004d
            boolean r1 = r2.f112057a     // Catch:{ IOException -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            java.lang.Object r0 = r3.mo45889c(r4, r0)     // Catch:{ Exception -> 0x0031 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0031
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x0021
            goto L_0x0031
        L_0x0021:
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0031 }
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch:{ Exception -> 0x0031 }
            int r0 = r0.st_mode     // Catch:{ Exception -> 0x0031 }
            int r1 = android.system.OsConstants.S_IFLNK     // Catch:{ Exception -> 0x0031 }
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0031
            goto L_0x0049
        L_0x0031:
            java.lang.Iterable r0 = r3.mo45888b(r4)     // Catch:{ IOException -> 0x0051 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0051 }
        L_0x0039:
            boolean r1 = r0.hasNext()     // Catch:{ IOException -> 0x0051 }
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r0.next()     // Catch:{ IOException -> 0x0051 }
            android.net.Uri r1 = (android.net.Uri) r1     // Catch:{ IOException -> 0x0051 }
            r2.m75563b(r3, r1, r5)     // Catch:{ IOException -> 0x0051 }
            goto L_0x0039
        L_0x0049:
            r3.mo45891e(r4)     // Catch:{ IOException -> 0x0051 }
            return
        L_0x004d:
            r3.mo45892f(r4)     // Catch:{ IOException -> 0x0051 }
            return
        L_0x0051:
            r3 = move-exception
            r5.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3304a.p3312f.C42792p.m75563b(com.google.android.libraries.storage.a.k, android.net.Uri, java.util.List):void");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        ArrayList arrayList = new ArrayList();
        m75563b(fVar.f112038a, fVar.f112043f, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        throw C42743d.m75522a("Failed to delete one or more files", arrayList);
    }
}
