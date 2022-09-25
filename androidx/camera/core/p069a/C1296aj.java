package androidx.camera.core.p069a;

import androidx.camera.core.C1477bw;
import androidx.camera.core.C1562l;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: androidx.camera.core.a.aj */
/* compiled from: PG */
public final class C1296aj {

    /* renamed from: a */
    public final Object f3736a = new Object();

    /* renamed from: b */
    public final Map f3737b = new HashMap();

    /* renamed from: c */
    public int f3738c;

    /* renamed from: d */
    private final StringBuilder f3739d = new StringBuilder();

    public C1296aj() {
        synchronized ("mLock") {
            this.f3738c = 1;
        }
    }

    /* renamed from: b */
    public static boolean m3482b(C1291ae aeVar) {
        return aeVar != null && aeVar.f3729h;
    }

    /* renamed from: a */
    public final void mo4152a() {
        if (C1477bw.m3985h("CameraStateRegistry", 3)) {
            this.f3739d.setLength(0);
            this.f3739d.append("Recalculating open cameras:\n");
            this.f3739d.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{MediaUtilities.CAMERA_FOLDER, "State"}));
            this.f3739d.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f3737b.entrySet()) {
            if (C1477bw.m3985h("CameraStateRegistry", 3)) {
                this.f3739d.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((C1562l) entry.getKey()).toString(), ((C1295ai) entry.getValue()).f3733a != null ? ((C1295ai) entry.getValue()).f3733a.toString() : "UNKNOWN"}));
            }
            if (m3482b(((C1295ai) entry.getValue()).f3733a)) {
                i++;
            }
        }
        if (C1477bw.m3985h("CameraStateRegistry", 3)) {
            this.f3739d.append("-------------------------------------------------------------------\n");
            this.f3739d.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", new Object[]{Integer.valueOf(i), 1}));
            C1477bw.m3978a("CameraStateRegistry", this.f3739d.toString());
        }
        this.f3738c = Math.max(1 - i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4153c(androidx.camera.core.C1562l r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f3736a
            monitor-enter(r0)
            java.util.Map r1 = r11.f3737b     // Catch:{ all -> 0x008f }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ all -> 0x008f }
            androidx.camera.core.a.ai r1 = (androidx.camera.core.p069a.C1295ai) r1     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            androidx.core.p097i.C1974i.m5319g(r1, r2)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "CameraStateRegistry"
            r3 = 3
            boolean r2 = androidx.camera.core.C1477bw.m3985h(r2, r3)     // Catch:{ all -> 0x008f }
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            java.lang.StringBuilder r2 = r11.f3739d     // Catch:{ all -> 0x008f }
            r2.setLength(r5)     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r2 = r11.f3739d     // Catch:{ all -> 0x008f }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x008f }
            java.lang.String r7 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x008f }
            r8[r5] = r12     // Catch:{ all -> 0x008f }
            int r12 = r11.f3738c     // Catch:{ all -> 0x008f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x008f }
            r8[r4] = r12     // Catch:{ all -> 0x008f }
            androidx.camera.core.a.ae r12 = r1.f3733a     // Catch:{ all -> 0x008f }
            boolean r9 = m3482b(r12)     // Catch:{ all -> 0x008f }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x008f }
            r10 = 2
            r8[r10] = r9     // Catch:{ all -> 0x008f }
            r8[r3] = r12     // Catch:{ all -> 0x008f }
            java.lang.String r12 = java.lang.String.format(r6, r7, r8)     // Catch:{ all -> 0x008f }
            r2.append(r12)     // Catch:{ all -> 0x008f }
        L_0x0049:
            int r12 = r11.f3738c     // Catch:{ all -> 0x008f }
            if (r12 > 0) goto L_0x0058
            androidx.camera.core.a.ae r12 = r1.f3733a     // Catch:{ all -> 0x008f }
            boolean r12 = m3482b(r12)     // Catch:{ all -> 0x008f }
            if (r12 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r12 = 0
            goto L_0x005d
        L_0x0058:
            androidx.camera.core.a.ae r12 = androidx.camera.core.p069a.C1291ae.OPENING     // Catch:{ all -> 0x008f }
            r1.f3733a = r12     // Catch:{ all -> 0x008f }
            r12 = 1
        L_0x005d:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.C1477bw.m3985h(r1, r3)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0088
            java.lang.StringBuilder r1 = r11.f3739d     // Catch:{ all -> 0x008f }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x008f }
            java.lang.String r3 = " --> %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x008f }
            if (r4 == r12) goto L_0x0072
            java.lang.String r4 = "FAIL"
            goto L_0x0074
        L_0x0072:
            java.lang.String r4 = "SUCCESS"
        L_0x0074:
            r6[r5] = r4     // Catch:{ all -> 0x008f }
            java.lang.String r2 = java.lang.String.format(r2, r3, r6)     // Catch:{ all -> 0x008f }
            r1.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r11.f3739d     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008f }
            androidx.camera.core.C1477bw.m3978a(r1, r2)     // Catch:{ all -> 0x008f }
        L_0x0088:
            if (r12 == 0) goto L_0x008d
            r11.mo4152a()     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            return r12
        L_0x008f:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.C1296aj.mo4153c(androidx.camera.core.l):boolean");
    }
}
