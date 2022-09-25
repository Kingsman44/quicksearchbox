package com.google.android.apps.gsa.shared.p7045k.p7046a;

import android.content.Context;
import com.google.android.libraries.home.p1957e.C23770e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4656j.p4657a.C61720d;

/* renamed from: com.google.android.apps.gsa.shared.k.a.b */
/* compiled from: PG */
public final class C89789b implements C23770e {

    /* renamed from: a */
    public static final C59071e f243026a = C59071e.m91332i("com.google.android.apps.gsa.shared.k.a.b");

    /* renamed from: b */
    public C61720d f243027b;

    /* renamed from: c */
    private final Context f243028c;

    /* renamed from: d */
    private final C89792e f243029d;

    public C89789b(Context context, C89792e eVar) {
        this.f243028c = context;
        this.f243029d = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7 A[SYNTHETIC, Splitter:B:45:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118 A[SYNTHETIC, Splitter:B:59:0x0118] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m146173c() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r12.f243027b = r0     // Catch:{ all -> 0x012f }
            android.content.Context r1 = r12.f243028c     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            java.lang.String r2 = "CrlCache"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            boolean r1 = r1.exists()     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            if (r1 != 0) goto L_0x0029
            com.google.common.f.e r1 = f243026a     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            r2 = 10551(0x2937, float:1.4785E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            java.lang.String r2 = "Cache not exist"
            r1.mo56386p(r2)     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            monitor-exit(r12)
            return
        L_0x0029:
            android.content.Context r1 = r12.f243028c     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            java.lang.String r2 = "CrlCache"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ IOException -> 0x00d8, all -> 0x00d6 }
            com.google.j.a.d r2 = com.google.p4656j.p4657a.C61720d.f166745b     // Catch:{ IOException -> 0x00d4 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (java.io.InputStream) r1)     // Catch:{ IOException -> 0x00d4 }
            com.google.j.a.d r2 = (com.google.p4656j.p4657a.C61720d) r2     // Catch:{ IOException -> 0x00d4 }
            r12.f243027b = r2     // Catch:{ IOException -> 0x00d4 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x00d4 }
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ IOException -> 0x00d4 }
            long r3 = r3.getTimeInMillis()     // Catch:{ IOException -> 0x00d4 }
            long r7 = r2.toSeconds(r3)     // Catch:{ IOException -> 0x00d4 }
            com.google.j.a.d r2 = r12.f243027b     // Catch:{ ct -> 0x00a5 }
            com.google.protobuf.cq r2 = r2.f166747a     // Catch:{ ct -> 0x00a5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ ct -> 0x00a5 }
        L_0x0051:
            boolean r3 = r2.hasNext()     // Catch:{ ct -> 0x00a5 }
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r3 = r2.next()     // Catch:{ ct -> 0x00a5 }
            com.google.j.a.b r3 = (com.google.p4656j.p4657a.C61718b) r3     // Catch:{ ct -> 0x00a5 }
            com.google.protobuf.z r3 = r3.f166742b     // Catch:{ ct -> 0x00a5 }
            com.google.j.a.h r4 = com.google.p4656j.p4657a.C61724h.f166754f     // Catch:{ ct -> 0x00a5 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r3)     // Catch:{ ct -> 0x00a5 }
            com.google.j.a.h r3 = (com.google.p4656j.p4657a.C61724h) r3     // Catch:{ ct -> 0x00a5 }
            long r4 = r3.f166757b     // Catch:{ ct -> 0x00a5 }
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0086
            com.google.common.f.e r2 = f243026a     // Catch:{ ct -> 0x00a5 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ ct -> 0x00a5 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x00a5 }
            r4 = 10559(0x293f, float:1.4796E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ ct -> 0x00a5 }
            r5 = r2
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ ct -> 0x00a5 }
            java.lang.String r6 = "CRL is not yet valid: currentTime = %d, CRL not before time = %d"
            long r9 = r3.f166757b     // Catch:{ ct -> 0x00a5 }
            r5.mo56350C(r6, r7, r9)     // Catch:{ ct -> 0x00a5 }
            goto L_0x00b7
        L_0x0086:
            long r4 = r3.f166758c     // Catch:{ ct -> 0x00a5 }
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0051
            com.google.common.f.e r2 = f243026a     // Catch:{ ct -> 0x00a5 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ ct -> 0x00a5 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ ct -> 0x00a5 }
            r4 = 10557(0x293d, float:1.4794E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ ct -> 0x00a5 }
            r5 = r2
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ ct -> 0x00a5 }
            java.lang.String r6 = "CRL has expired: currentTime = %d, CRL not after time = %d"
            long r9 = r3.f166758c     // Catch:{ ct -> 0x00a5 }
            r5.mo56350C(r6, r7, r9)     // Catch:{ ct -> 0x00a5 }
            goto L_0x00b7
        L_0x00a5:
            r2 = move-exception
            com.google.common.f.e r3 = f243026a     // Catch:{ IOException -> 0x00d4 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ IOException -> 0x00d4 }
            java.lang.String r4 = "Exception validating CRL: %s"
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x00d4 }
            r5 = 10558(0x293e, float:1.4795E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56389s(r4, r2)     // Catch:{ IOException -> 0x00d4 }
        L_0x00b7:
            r12.f243027b = r0     // Catch:{ IOException -> 0x00d4 }
        L_0x00b9:
            if (r1 == 0) goto L_0x0110
            r1.close()     // Catch:{ IOException -> 0x00c0 }
            monitor-exit(r12)
            return
        L_0x00c0:
            r0 = move-exception
            com.google.common.f.e r1 = f243026a     // Catch:{ all -> 0x012f }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "Exception closing cache file: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x012f }
            r3 = 10547(0x2933, float:1.478E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r0)     // Catch:{ all -> 0x012f }
            monitor-exit(r12)
            return
        L_0x00d4:
            r0 = move-exception
            goto L_0x00dc
        L_0x00d6:
            r1 = move-exception
            goto L_0x0116
        L_0x00d8:
            r1 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
        L_0x00dc:
            com.google.common.f.e r2 = f243026a     // Catch:{ all -> 0x0112 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0112 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0112 }
            r3 = 10548(0x2934, float:1.4781E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0112 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "Exception reading cache file: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0112 }
            r2.mo56389s(r3, r0)     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x0110
            r1.close()     // Catch:{ IOException -> 0x00fc }
            monitor-exit(r12)
            return
        L_0x00fc:
            r0 = move-exception
            com.google.common.f.e r1 = f243026a     // Catch:{ all -> 0x012f }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x012f }
            java.lang.String r2 = "Exception closing cache file: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x012f }
            r3 = 10549(0x2935, float:1.4782E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r0)     // Catch:{ all -> 0x012f }
            monitor-exit(r12)
            return
        L_0x0110:
            monitor-exit(r12)
            return
        L_0x0112:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
        L_0x0116:
            if (r0 == 0) goto L_0x012e
            r0.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x012e
        L_0x011c:
            r0 = move-exception
            com.google.common.f.e r2 = f243026a     // Catch:{ all -> 0x012f }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x012f }
            java.lang.String r3 = "Exception closing cache file: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x012f }
            r4 = 10550(0x2936, float:1.4784E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r0)     // Catch:{ all -> 0x012f }
        L_0x012e:
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            monitor-exit(r12)
            goto L_0x0133
        L_0x0132:
            throw r0
        L_0x0133:
            goto L_0x0132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7045k.p7046a.C89789b.m146173c():void");
    }

    /* renamed from: a */
    public final C61720d mo29125a() {
        if (this.f243027b == null) {
            m146173c();
            if (this.f243027b != null) {
                ((C59052c) ((C59052c) f243026a.mo56224b()).mo56372aa(10546)).mo56386p("CRL bundle successfully loaded from cache");
            } else {
                ((C59052c) ((C59052c) f243026a.mo56224b()).mo56372aa(10545)).mo56386p("Send request to fetch CRL bundle");
                this.f243029d.mo83642a(new C89790c(new C89788a(this)));
            }
        }
        return this.f243027b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f243026a.mo56226d()).mo56372aa(10553)).mo56389s("Exception closing cache file: %s", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        if (r0 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f243026a.mo56226d()).mo56372aa(10556)).mo56389s("Exception closing cache file: %s", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0016, B:19:0x0032] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo83641b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.j.a.d r0 = r5.f243027b     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0083
            r0 = 0
            android.content.Context r1 = r5.f243028c     // Catch:{ IOException -> 0x0031 }
            java.lang.String r2 = "CrlCache"
            r3 = 0
            java.io.FileOutputStream r0 = r1.openFileOutput(r2, r3)     // Catch:{ IOException -> 0x0031 }
            com.google.j.a.d r1 = r5.f243027b     // Catch:{ IOException -> 0x0031 }
            r1.writeTo(r0)     // Catch:{ IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0068
            r0.close()     // Catch:{ IOException -> 0x001b }
            monitor-exit(r5)
            return
        L_0x001b:
            r0 = move-exception
            com.google.common.f.e r1 = f243026a     // Catch:{ all -> 0x0092 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "Exception closing cache file: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0092 }
            r3 = 10553(0x2939, float:1.4788E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r0)     // Catch:{ all -> 0x0092 }
            monitor-exit(r5)
            return
        L_0x002f:
            r1 = move-exception
            goto L_0x006a
        L_0x0031:
            r1 = move-exception
            com.google.common.f.e r2 = f243026a     // Catch:{ all -> 0x002f }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x002f }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x002f }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x002f }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x002f }
            r2 = 10554(0x293a, float:1.479E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x002f }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "Exception saving cache file"
            r1.mo56386p(r2)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0068
            r0.close()     // Catch:{ IOException -> 0x0054 }
            monitor-exit(r5)
            return
        L_0x0054:
            r0 = move-exception
            com.google.common.f.e r1 = f243026a     // Catch:{ all -> 0x0092 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "Exception closing cache file: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0092 }
            r3 = 10555(0x293b, float:1.4791E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r0)     // Catch:{ all -> 0x0092 }
            monitor-exit(r5)
            return
        L_0x0068:
            monitor-exit(r5)
            return
        L_0x006a:
            if (r0 == 0) goto L_0x0082
            r0.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0082
        L_0x0070:
            r0 = move-exception
            com.google.common.f.e r2 = f243026a     // Catch:{ all -> 0x0092 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "Exception closing cache file: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0092 }
            r4 = 10556(0x293c, float:1.4792E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r0)     // Catch:{ all -> 0x0092 }
        L_0x0082:
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0083:
            com.google.common.f.e r0 = f243026a     // Catch:{ all -> 0x0092 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = "No CRL bundle to save"
            r2 = 10552(0x2938, float:1.4787E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0092 }
            monitor-exit(r5)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7045k.p7046a.C89789b.mo83641b():void");
    }
}
