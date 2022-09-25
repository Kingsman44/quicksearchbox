package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.h.d.x */
/* compiled from: PG */
public final class C26772x {

    /* renamed from: d */
    private static final C58974d f72947d = C58974d.m91135i("CameraHardware");

    /* renamed from: a */
    public final Context f72948a;

    /* renamed from: b */
    public final C58881cr f72949b = C58886cw.m90973a(new C26768t(this));

    /* renamed from: c */
    public final C58881cr f72950c = C58886cw.m90973a(new C26769u(this));

    /* renamed from: e */
    private final C58881cr f72951e = C58886cw.m90973a(new C26770v(this));

    public C26772x(Context context) {
        this.f72948a = context;
    }

    /* renamed from: a */
    public final int mo32137a() {
        Integer num;
        CameraCharacteristics b = mo32138b();
        if (b == null || (num = (Integer) b.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) == null) {
            return 2;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final CameraCharacteristics mo32138b() {
        C58833ax axVar = (C58833ax) this.f72951e.mo6453a();
        if (axVar.mo56113h()) {
            return ((C26771w) axVar.mo56107c()).f72946b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo32139c() {
        /*
            r11 = this;
            com.google.common.base.cr r0 = r11.f72949b
            java.lang.Object r0 = r0.mo6453a()
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0
            com.google.common.base.cr r1 = r11.f72950c
            java.lang.Object r1 = r1.mo6453a()
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
            int r2 = r1.size()
            r3 = 0
            r4 = 0
            r5 = r4
        L_0x0017:
            if (r3 >= r2) goto L_0x006d
            java.lang.Object r6 = r1.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            android.hardware.camera2.CameraCharacteristics r7 = r0.getCameraCharacteristics(r6)     // Catch:{ CameraAccessException -> 0x0036, Exception -> 0x0026, AssertionError -> 0x0024 }
            goto L_0x0046
        L_0x0024:
            r7 = move-exception
            goto L_0x0027
        L_0x0026:
            r7 = move-exception
        L_0x0027:
            com.google.common.f.a.d r8 = f72947d
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Internal error when querying camera manager"
            r10 = 49152(0xc000, float:6.8877E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56382g(r7)).mo56372aa(r10)).mo56386p(r9)
            goto L_0x0045
        L_0x0036:
            r7 = move-exception
            com.google.common.f.a.d r8 = f72947d
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r9 = "Encountered CameraAccessException"
            r10 = 49151(0xbfff, float:6.8875E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56382g(r7)).mo56372aa(r10)).mo56386p(r9)
        L_0x0045:
            r7 = r4
        L_0x0046:
            if (r7 == 0) goto L_0x006a
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r8 = r7.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x006a
            com.google.android.libraries.lens.view.h.d.w r9 = new com.google.android.libraries.lens.view.h.d.w
            r9.<init>(r6, r7)
            int r6 = r8.intValue()
            r7 = 1
            if (r6 != r7) goto L_0x0063
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r9)
            return r0
        L_0x0063:
            int r6 = r8.intValue()
            if (r6 != 0) goto L_0x006a
            r5 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x006d:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2121d.C26772x.mo32139c():com.google.common.base.ax");
    }

    /* renamed from: d */
    public final C58485gu mo32140d() {
        try {
            return C58485gu.m89844l(((CameraManager) this.f72949b.mo6453a()).getCameraIdList());
        } catch (CameraAccessException e) {
            ((C58970a) ((C58970a) ((C58970a) f72947d.mo56225c()).mo56382g(e)).mo56372aa(49153)).mo56386p("getCameraId encountered CameraAccessException");
            return C58485gu.m89845m();
        } catch (AssertionError | Exception e2) {
            ((C58970a) ((C58970a) ((C58970a) f72947d.mo56225c()).mo56382g(e2)).mo56372aa(49154)).mo56386p("Internal error when querying camera manager");
            return C58485gu.m89845m();
        }
    }

    /* renamed from: e */
    public final String mo32141e() {
        C58833ax axVar = (C58833ax) this.f72951e.mo6453a();
        if (axVar.mo56113h()) {
            return ((C26771w) axVar.mo56107c()).f72945a;
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo32142f() {
        Integer num;
        CameraCharacteristics b = mo32138b();
        if (b == null || (num = (Integer) b.get(CameraCharacteristics.LENS_FACING)) == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }
}
