package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.camera2.p063b.p064a.p066b.C1027l;
import androidx.camera.camera2.p063b.p064a.p066b.C1028m;
import androidx.camera.camera2.p063b.p064a.p067c.C1045c;
import androidx.camera.camera2.p063b.p064a.p067c.C1046d;
import androidx.camera.camera2.p063b.p064a.p067c.C1052j;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1328bo;
import androidx.camera.core.p069a.C1361cu;
import androidx.camera.core.p069a.C1362cv;
import androidx.camera.core.p069a.C1363cw;
import androidx.camera.core.p069a.C1383j;
import androidx.camera.core.p069a.p070a.C1251b;
import androidx.camera.core.p069a.p070a.C1272c;
import androidx.core.p097i.C1974i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.b.dn */
/* compiled from: PG */
final class C1172dn {

    /* renamed from: a */
    public static final Size f3439a = new Size(0, 0);

    /* renamed from: b */
    public static final Rational f3440b = new Rational(4, 3);

    /* renamed from: c */
    public static final Rational f3441c = new Rational(3, 4);

    /* renamed from: d */
    public static final Rational f3442d = new Rational(16, 9);

    /* renamed from: e */
    public static final Rational f3443e = new Rational(9, 16);

    /* renamed from: n */
    private static final Size f3444n = new Size(1920, 1080);

    /* renamed from: o */
    private static final Size f3445o = new Size(720, 480);

    /* renamed from: f */
    public final Map f3446f = new HashMap();

    /* renamed from: g */
    public final String f3447g;

    /* renamed from: h */
    public final C1068k f3448h;

    /* renamed from: i */
    public final int f3449i;

    /* renamed from: j */
    public final boolean f3450j;

    /* renamed from: k */
    C1363cw f3451k;

    /* renamed from: l */
    public final C1153cv f3452l;

    /* renamed from: m */
    public final C1052j f3453m;

    /* renamed from: p */
    private final List f3454p = new ArrayList();

    /* renamed from: q */
    private final C1045c f3455q;

    /* renamed from: r */
    private final C1046d f3456r;

    /* renamed from: s */
    private final Map f3457s = new HashMap();

    /* renamed from: t */
    private boolean f3458t;

    /* renamed from: u */
    private boolean f3459u;

    /* renamed from: v */
    private Map f3460v;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0474  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1172dn(android.content.Context r10, java.lang.String r11, androidx.camera.camera2.p063b.p064a.C1074q r12) {
        /*
            r9 = this;
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f3454p = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f3446f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f3457s = r0
            r0 = 0
            r9.f3458t = r0
            r9.f3459u = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.f3460v = r1
            androidx.camera.camera2.b.a.c.j r1 = new androidx.camera.camera2.b.a.c.j
            r1.<init>()
            r9.f3453m = r1
            r11.getClass()
            r9.f3447g = r11
            androidx.camera.camera2.b.a.c.c r1 = new androidx.camera.camera2.b.a.c.c
            r1.<init>(r11)
            r9.f3455q = r1
            androidx.camera.camera2.b.a.c.d r1 = new androidx.camera.camera2.b.a.c.d
            r1.<init>()
            r9.f3456r = r1
            androidx.camera.camera2.b.cv r10 = androidx.camera.camera2.p063b.C1153cv.m3205d(r10)
            r9.f3452l = r10
            androidx.camera.camera2.b.a.k r10 = r12.mo3787a(r11)     // Catch:{ e -> 0x04b0 }
            r9.f3448h = r10     // Catch:{ e -> 0x04b0 }
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ e -> 0x04b0 }
            java.lang.Object r11 = r10.mo3785a(r11)     // Catch:{ e -> 0x04b0 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ e -> 0x04b0 }
            r12 = 2
            if (r11 == 0) goto L_0x005a
            int r11 = r11.intValue()     // Catch:{ e -> 0x04b0 }
            goto L_0x005b
        L_0x005a:
            r11 = 2
        L_0x005b:
            r9.f3449i = r11     // Catch:{ e -> 0x04b0 }
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE     // Catch:{ e -> 0x04b0 }
            java.lang.Object r11 = r10.mo3785a(r11)     // Catch:{ e -> 0x04b0 }
            android.util.Size r11 = (android.util.Size) r11     // Catch:{ e -> 0x04b0 }
            r1 = 1
            if (r11 == 0) goto L_0x0075
            int r2 = r11.getWidth()     // Catch:{ e -> 0x04b0 }
            int r11 = r11.getHeight()     // Catch:{ e -> 0x04b0 }
            if (r2 < r11) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r11 = 0
            goto L_0x0076
        L_0x0075:
            r11 = 1
        L_0x0076:
            r9.f3450j = r11     // Catch:{ e -> 0x04b0 }
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r10 = r10.mo3785a(r11)
            int[] r10 = (int[]) r10
            r11 = 3
            if (r10 == 0) goto L_0x0095
            int r2 = r10.length
        L_0x0084:
            if (r0 >= r2) goto L_0x0095
            r3 = r10[r0]
            if (r3 != r11) goto L_0x008d
            r9.f3458t = r1
            goto L_0x0092
        L_0x008d:
            r4 = 6
            if (r3 != r4) goto L_0x0092
            r9.f3459u = r1
        L_0x0092:
            int r0 = r0 + 1
            goto L_0x0084
        L_0x0095:
            java.util.List r10 = r9.f3454p
            int r0 = r9.f3449i
            boolean r2 = r9.f3458t
            boolean r3 = r9.f3459u
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r8 = 4
            r7.<init>(r1, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            r4.addAll(r5)
            if (r0 == 0) goto L_0x0162
            if (r0 == r1) goto L_0x0162
            if (r0 != r11) goto L_0x0212
            r0 = 3
        L_0x0162:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r11)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r11)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r11)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r11)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r11)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r11)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r11)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            r4.addAll(r5)
        L_0x0212:
            if (r0 == r1) goto L_0x0217
            if (r0 != r11) goto L_0x02c7
            r0 = 3
        L_0x0217:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r11, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r1)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r1, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            androidx.camera.core.a.cu r6 = new androidx.camera.core.a.cu
            r6.<init>()
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r1)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r12)
            r6.mo4251b(r7)
            androidx.camera.core.a.i r7 = new androidx.camera.core.a.i
            r7.<init>(r12, r8)
            r6.mo4251b(r7)
            r5.add(r6)
            r4.addAll(r5)
        L_0x02c7:
            if (r2 == 0) goto L_0x03b1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r1, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r12, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r1, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r1, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r1, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r12, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r12, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r12, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r1, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r11, r8)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            androidx.camera.core.a.cu r5 = new androidx.camera.core.a.cu
            r5.<init>()
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r12, r12)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r11, r8)
            r5.mo4251b(r6)
            androidx.camera.core.a.i r6 = new androidx.camera.core.a.i
            r6.<init>(r8, r8)
            r5.mo4251b(r6)
            r2.add(r5)
            r4.addAll(r2)
        L_0x03b1:
            if (r3 == 0) goto L_0x0405
            if (r0 != 0) goto L_0x0405
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.camera.core.a.cu r3 = new androidx.camera.core.a.cu
            r3.<init>()
            androidx.camera.core.a.i r5 = new androidx.camera.core.a.i
            r5.<init>(r1, r12)
            r3.mo4251b(r5)
            androidx.camera.core.a.i r5 = new androidx.camera.core.a.i
            r5.<init>(r1, r8)
            r3.mo4251b(r5)
            r2.add(r3)
            androidx.camera.core.a.cu r3 = new androidx.camera.core.a.cu
            r3.<init>()
            androidx.camera.core.a.i r5 = new androidx.camera.core.a.i
            r5.<init>(r1, r12)
            r3.mo4251b(r5)
            androidx.camera.core.a.i r5 = new androidx.camera.core.a.i
            r5.<init>(r12, r8)
            r3.mo4251b(r5)
            r2.add(r3)
            androidx.camera.core.a.cu r3 = new androidx.camera.core.a.cu
            r3.<init>()
            androidx.camera.core.a.i r5 = new androidx.camera.core.a.i
            r5.<init>(r12, r12)
            r3.mo4251b(r5)
            androidx.camera.core.a.i r5 = new androidx.camera.core.a.i
            r5.<init>(r12, r8)
            r3.mo4251b(r5)
            r2.add(r3)
            r4.addAll(r2)
        L_0x0405:
            if (r0 != r11) goto L_0x045f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.a.cu r2 = new androidx.camera.core.a.cu
            r2.<init>()
            androidx.camera.core.a.i r3 = new androidx.camera.core.a.i
            r3.<init>(r1, r12)
            r2.mo4251b(r3)
            androidx.camera.core.a.i r3 = new androidx.camera.core.a.i
            r3.<init>(r1, r1)
            r2.mo4251b(r3)
            androidx.camera.core.a.i r3 = new androidx.camera.core.a.i
            r3.<init>(r12, r8)
            r2.mo4251b(r3)
            androidx.camera.core.a.i r3 = new androidx.camera.core.a.i
            r3.<init>(r8, r8)
            r2.mo4251b(r3)
            r0.add(r2)
            androidx.camera.core.a.cu r2 = new androidx.camera.core.a.cu
            r2.<init>()
            androidx.camera.core.a.i r3 = new androidx.camera.core.a.i
            r3.<init>(r1, r12)
            r2.mo4251b(r3)
            androidx.camera.core.a.i r12 = new androidx.camera.core.a.i
            r12.<init>(r1, r1)
            r2.mo4251b(r12)
            androidx.camera.core.a.i r12 = new androidx.camera.core.a.i
            r12.<init>(r11, r8)
            r2.mo4251b(r12)
            androidx.camera.core.a.i r11 = new androidx.camera.core.a.i
            r11.<init>(r8, r8)
            r2.mo4251b(r11)
            r0.add(r2)
            r4.addAll(r0)
        L_0x045f:
            r10.addAll(r4)
            java.util.List r10 = r9.f3454p
            androidx.camera.camera2.b.a.c.d r11 = r9.f3456r
            java.lang.String r12 = r9.f3447g
            int r0 = r9.f3449i
            androidx.camera.camera2.b.a.b.o r11 = r11.f3175a
            if (r11 != 0) goto L_0x0474
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            goto L_0x04a9
        L_0x0474:
            boolean r11 = androidx.camera.camera2.p063b.p064a.p066b.C1030o.m3028a()
            if (r11 == 0) goto L_0x048d
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r0 = "1"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x04a9
            androidx.camera.core.a.cu r12 = androidx.camera.camera2.p063b.p064a.p066b.C1030o.f3158a
            r11.add(r12)
            goto L_0x04a9
        L_0x048d:
            boolean r11 = androidx.camera.camera2.p063b.p064a.p066b.C1030o.m3029b()
            if (r11 == 0) goto L_0x04a5
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r0 != 0) goto L_0x04a9
            androidx.camera.core.a.cu r12 = androidx.camera.camera2.p063b.p064a.p066b.C1030o.f3158a
            r11.add(r12)
            androidx.camera.core.a.cu r12 = androidx.camera.camera2.p063b.p064a.p066b.C1030o.f3159b
            r11.add(r12)
            goto L_0x04a9
        L_0x04a5:
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x04a9:
            r10.addAll(r11)
            r9.mo3973c()
            return
        L_0x04b0:
            r10 = move-exception
            androidx.camera.core.w r11 = new androidx.camera.core.w
            r11.<init>(r10)
            goto L_0x04b8
        L_0x04b7:
            throw r11
        L_0x04b8:
            goto L_0x04b7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1172dn.<init>(android.content.Context, java.lang.String, androidx.camera.camera2.b.a.q):void");
    }

    /* renamed from: g */
    public static final void m3252g(List list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Size size2 = (Size) list.get(i2);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i >= 0) {
                    arrayList.add((Size) list.get(i));
                }
                i = i2;
            }
            list.removeAll(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Size mo3971a(int i) {
        return (Size) Collections.max(Arrays.asList(mo3976f(i)), new C1272c(false));
    }

    /* renamed from: b */
    public final Size mo3972b(C1328bo boVar) {
        int z = boVar.mo4192z();
        Size y = boVar.mo4191y();
        if (y != null) {
            Integer num = (Integer) this.f3448h.mo3785a(CameraCharacteristics.SENSOR_ORIENTATION);
            C1974i.m5319g(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
            int b = C1251b.m3416b(z);
            Integer num2 = (Integer) this.f3448h.mo3785a(CameraCharacteristics.LENS_FACING);
            C1974i.m5319g(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
            boolean z2 = true;
            if (num2.intValue() != 1) {
                z2 = false;
            }
            int a = C1251b.m3415a(b, num.intValue(), z2);
            if (a == 90 || a == 270) {
                return new Size(y.getHeight(), y.getWidth());
            }
        }
        return y;
    }

    /* renamed from: c */
    public final void mo3973c() {
        Size size;
        CamcorderProfile camcorderProfile;
        Size size2 = new Size(640, 480);
        Size b = this.f3452l.mo3946b();
        try {
            int parseInt = Integer.parseInt(this.f3447g);
            CamcorderProfile camcorderProfile2 = null;
            if (CamcorderProfile.hasProfile(parseInt, 1)) {
                camcorderProfile = CamcorderProfile.get(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            } else {
                Size size3 = f3445o;
                if (CamcorderProfile.hasProfile(parseInt, 10)) {
                    camcorderProfile2 = CamcorderProfile.get(parseInt, 10);
                } else if (CamcorderProfile.hasProfile(parseInt, 8)) {
                    camcorderProfile2 = CamcorderProfile.get(parseInt, 8);
                } else if (CamcorderProfile.hasProfile(parseInt, 12)) {
                    camcorderProfile2 = CamcorderProfile.get(parseInt, 12);
                } else if (CamcorderProfile.hasProfile(parseInt, 6)) {
                    camcorderProfile2 = CamcorderProfile.get(parseInt, 6);
                } else if (CamcorderProfile.hasProfile(parseInt, 5)) {
                    camcorderProfile2 = CamcorderProfile.get(parseInt, 5);
                } else if (CamcorderProfile.hasProfile(parseInt, 4)) {
                    camcorderProfile2 = CamcorderProfile.get(parseInt, 4);
                }
                size = camcorderProfile2 != null ? new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight) : size3;
            }
        } catch (NumberFormatException unused) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f3448h.mo3785a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                if (outputSizes != null) {
                    Arrays.sort(outputSizes, new C1272c(true));
                    int length = outputSizes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            size = f3445o;
                            break;
                        }
                        Size size4 = outputSizes[i];
                        int width = size4.getWidth();
                        Size size5 = f3444n;
                        if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                            size = size4;
                            break;
                        }
                        i++;
                    }
                } else {
                    size = f3445o;
                }
            } else {
                throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
            }
        }
        this.f3451k = new C1383j(size2, b, size);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo3974d(List list) {
        boolean z = false;
        for (C1361cu cuVar : this.f3454p) {
            if (!list.isEmpty()) {
                if (list.size() <= cuVar.f3851a.size()) {
                    int size = cuVar.f3851a.size();
                    ArrayList arrayList = new ArrayList();
                    C1361cu.m3718a(arrayList, size, new int[size], 0);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int[] iArr = (int[]) it.next();
                        boolean z2 = true;
                        for (int i = 0; i < cuVar.f3851a.size(); i++) {
                            if (iArr[i] < list.size()) {
                                C1362cv cvVar = (C1362cv) cuVar.f3851a.get(i);
                                C1362cv cvVar2 = (C1362cv) list.get(iArr[i]);
                                z2 &= cvVar2.mo4252a() + -1 <= cvVar.mo4252a() + -1 && cvVar2.mo4253b() == cvVar.mo4253b();
                                if (!z2) {
                                    continue;
                                    break;
                                }
                            }
                        }
                        if (z2) {
                            break;
                        }
                    }
                    z = true;
                    continue;
                }
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final Size[] mo3975e(Size[] sizeArr, int i) {
        List emptyList;
        ArrayList arrayList;
        Map map = this.f3457s;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) map.get(valueOf);
        if (list == null) {
            C1045c cVar = this.f3455q;
            if (((C1028m) C1027l.f3156a.mo4225a(C1028m.class)) == null) {
                emptyList = new ArrayList();
            } else {
                String str = cVar.f3174a;
                if (C1028m.m3024b()) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else if (C1028m.m3025c()) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else if (C1028m.m3023a()) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i == 34 || i == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(400, 400));
                    }
                } else {
                    C1477bw.m3983f("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    emptyList = Collections.emptyList();
                }
                list = arrayList;
                this.f3457s.put(valueOf, list);
            }
            list = emptyList;
            this.f3457s.put(valueOf, list);
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(sizeArr));
        arrayList2.removeAll(list);
        return (Size[]) arrayList2.toArray(new Size[0]);
    }

    /* renamed from: f */
    public final Size[] mo3976f(int i) {
        Map map = this.f3460v;
        Integer valueOf = Integer.valueOf(i);
        Size[] sizeArr = (Size[]) map.get(valueOf);
        if (sizeArr != null) {
            return sizeArr;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f3448h.mo3785a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
            if (outputSizes != null) {
                Size[] e = mo3975e(outputSizes, i);
                Arrays.sort(e, new C1272c(true));
                this.f3460v.put(valueOf, e);
                return e;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }
}
