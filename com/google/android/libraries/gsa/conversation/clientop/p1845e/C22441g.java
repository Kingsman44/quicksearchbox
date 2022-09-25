package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.g */
/* compiled from: PG */
public final class C22441g {

    /* renamed from: a */
    boolean f61963a;

    /* renamed from: b */
    public final PackageManager f61964b;

    /* renamed from: c */
    private final CameraManager f61965c;

    public C22441g(CameraManager cameraManager, PackageManager packageManager) {
        this.f61965c = cameraManager;
        this.f61964b = packageManager;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c A[SYNTHETIC, Splitter:B:37:0x009c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo27620a(com.google.assistant.p3897e.p3921j.C52115fu r12) {
        /*
            r11 = this;
            int r12 = r12.f136757c
            int r12 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r12)
            r0 = 1
            if (r12 != 0) goto L_0x000a
            r12 = 1
        L_0x000a:
            int r12 = r12 + -1
            r1 = 0
            r2 = 0
            if (r12 == r0) goto L_0x0021
            r3 = 2
            if (r12 == r3) goto L_0x001e
            com.google.assistant.e.j.kf r12 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r12, r2)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            return r12
        L_0x001e:
            r11.f61963a = r1
            goto L_0x0023
        L_0x0021:
            r11.f61963a = r0
        L_0x0023:
            android.hardware.camera2.CameraManager r12 = r11.f61965c     // Catch:{ CameraAccessException -> 0x00aa }
            if (r12 == 0) goto L_0x00aa
            java.lang.String[] r3 = r12.getCameraIdList()     // Catch:{ Exception -> 0x0098 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0098 }
            r4.<init>()     // Catch:{ Exception -> 0x0098 }
            int r5 = r3.length     // Catch:{ Exception -> 0x0098 }
            r6 = 0
        L_0x0032:
            if (r6 >= r5) goto L_0x005c
            r7 = r3[r6]     // Catch:{ Exception -> 0x0098 }
            android.hardware.camera2.CameraCharacteristics r8 = r12.getCameraCharacteristics(r7)     // Catch:{ Exception -> 0x0098 }
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r9 = r8.get(r9)     // Catch:{ Exception -> 0x0098 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Exception -> 0x0098 }
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r8 = r8.get(r10)     // Catch:{ Exception -> 0x0098 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x0098 }
            if (r9 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0059
            android.util.Pair r8 = android.util.Pair.create(r9, r8)     // Catch:{ Exception -> 0x0098 }
            android.util.Pair r7 = android.util.Pair.create(r7, r8)     // Catch:{ Exception -> 0x0098 }
            r4.add(r7)     // Catch:{ Exception -> 0x0098 }
        L_0x0059:
            int r6 = r6 + 1
            goto L_0x0032
        L_0x005c:
            boolean r12 = r4.isEmpty()     // Catch:{ Exception -> 0x0098 }
            if (r12 == 0) goto L_0x0063
            goto L_0x0099
        L_0x0063:
            int r12 = r4.size()     // Catch:{ Exception -> 0x0098 }
            r3 = r2
        L_0x0068:
            if (r1 >= r12) goto L_0x009a
            java.lang.Object r5 = r4.get(r1)     // Catch:{ Exception -> 0x0098 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r6 = r5.first     // Catch:{ Exception -> 0x0098 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r7 = r5.second     // Catch:{ Exception -> 0x0098 }
            android.util.Pair r7 = (android.util.Pair) r7     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r7 = r7.first     // Catch:{ Exception -> 0x0098 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x0098 }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r5 = r5.second     // Catch:{ Exception -> 0x0098 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r5 = r5.second     // Catch:{ Exception -> 0x0098 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0098 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0098 }
            if (r7 == 0) goto L_0x0095
            if (r5 != r0) goto L_0x0092
            r3 = r6
            goto L_0x009a
        L_0x0092:
            if (r3 != 0) goto L_0x0095
            r3 = r6
        L_0x0095:
            int r1 = r1 + 1
            goto L_0x0068
        L_0x0098:
        L_0x0099:
            r3 = r2
        L_0x009a:
            if (r3 == 0) goto L_0x00aa
            android.hardware.camera2.CameraManager r12 = r11.f61965c     // Catch:{ CameraAccessException -> 0x00aa }
            boolean r0 = r11.f61963a     // Catch:{ CameraAccessException -> 0x00aa }
            r12.setTorchMode(r3, r0)     // Catch:{ CameraAccessException -> 0x00aa }
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a     // Catch:{ CameraAccessException -> 0x00aa }
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)     // Catch:{ CameraAccessException -> 0x00aa }
            return r12
        L_0x00aa:
            com.google.assistant.e.j.kf r12 = com.google.assistant.p3897e.p3921j.C52235kf.UNAVAILABLE
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r12, r2)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.p1845e.C22441g.mo27620a(com.google.assistant.e.j.fu):com.google.common.util.concurrent.cx");
    }
}
