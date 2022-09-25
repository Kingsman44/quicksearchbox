package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Size;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dy */
/* compiled from: PG */
public final class C94273dy {

    /* renamed from: a */
    public static final C59071e f263444a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.dy");

    /* renamed from: b */
    public final Context f263445b;

    /* renamed from: c */
    public final OrientationEventListener f263446c;

    /* renamed from: d */
    public String f263447d = null;

    /* renamed from: e */
    public boolean f263448e;

    /* renamed from: f */
    public Size f263449f;

    /* renamed from: g */
    public int f263450g = -1;

    /* renamed from: h */
    private final CameraManager f263451h;

    /* renamed from: i */
    private final WindowManager f263452i;

    /* renamed from: j */
    private final Camera2SourcePreview f263453j;

    /* renamed from: k */
    private final int f263454k;

    /* renamed from: l */
    private final int f263455l;

    /* renamed from: m */
    private final C90021c f263456m;

    /* renamed from: n */
    private int f263457n = -1;

    /* renamed from: o */
    private Size f263458o;

    /* renamed from: p */
    private Size f263459p;

    /* renamed from: q */
    private C94272dx f263460q;

    /* renamed from: r */
    private final C94167ak f263461r;

    public C94273dy(Context context, Camera2SourcePreview camera2SourcePreview, C94167ak akVar, int i, int i2, C90021c cVar) {
        this.f263445b = context;
        this.f263451h = (CameraManager) context.getSystemService("camera");
        this.f263452i = (WindowManager) context.getSystemService("window");
        this.f263453j = camera2SourcePreview;
        this.f263461r = akVar;
        this.f263454k = i;
        this.f263455l = i2;
        this.f263456m = cVar;
        C94271dw dwVar = new C94271dw(this, context);
        this.f263446c = dwVar;
        dwVar.enable();
        m155569b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x029e A[Catch:{ CameraAccessException -> 0x0446 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a0 A[Catch:{ CameraAccessException -> 0x0446 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a8 A[Catch:{ CameraAccessException -> 0x0446 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02df A[Catch:{ CameraAccessException -> 0x0446 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03c0 A[Catch:{ CameraAccessException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03f6 A[Catch:{ CameraAccessException -> 0x0444 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df A[Catch:{ CameraAccessException -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3 A[Catch:{ CameraAccessException -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9 A[Catch:{ CameraAccessException -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0136 A[Catch:{ CameraAccessException -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0211 A[Catch:{ CameraAccessException -> 0x0446 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0228 A[Catch:{ CameraAccessException -> 0x0446 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x027b A[Catch:{ CameraAccessException -> 0x0446 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m155569b() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "ConfigManager"
            android.hardware.camera2.CameraManager r0 = r1.f263451h     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ CameraAccessException -> 0x044a }
            int r3 = r0.length     // Catch:{ CameraAccessException -> 0x044a }
            r4 = 0
            r5 = 0
        L_0x000d:
            if (r5 >= r3) goto L_0x003a
            r6 = r0[r5]     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.dx r7 = new com.google.android.apps.gsa.staticplugins.avocado.dx     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.CameraManager r8 = r1.f263451h     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.CameraCharacteristics r8 = r8.getCameraCharacteristics(r6)     // Catch:{ CameraAccessException -> 0x044a }
            r7.<init>(r8)     // Catch:{ CameraAccessException -> 0x044a }
            r1.f263460q = r7     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.CameraCharacteristics r7 = r7.f263443a     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ CameraAccessException -> 0x044a }
            if (r7 == 0) goto L_0x0037
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ CameraAccessException -> 0x044a }
            boolean r7 = r7.equals(r8)     // Catch:{ CameraAccessException -> 0x044a }
            if (r7 == 0) goto L_0x0037
            r1.f263447d = r6     // Catch:{ CameraAccessException -> 0x044a }
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x000d
        L_0x003a:
            java.lang.String r0 = r1.f263447d     // Catch:{ CameraAccessException -> 0x044a }
            if (r0 != 0) goto L_0x0064
            com.google.android.apps.gsa.staticplugins.avocado.ak r0 = r1.f263461r     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.fa r3 = com.google.android.apps.gsa.staticplugins.avocado.C94303fa.FRONT_CAMERA_MISSING     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.n r3 = com.google.android.apps.gsa.staticplugins.avocado.AvocadoUtils.m155379c(r3)     // Catch:{ CameraAccessException -> 0x044a }
            r0.mo88359a(r3)     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.e r0 = f263444a     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CameraAccessException -> 0x044a }
            r0.mo56378ag(r3, r2)     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CameraAccessException -> 0x044a }
            r3 = 14414(0x384e, float:2.0198E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.String r3 = "No front Camera!"
            r0.mo56386p(r3)     // Catch:{ CameraAccessException -> 0x044a }
            return
        L_0x0064:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ CameraAccessException -> 0x044a }
            r3 = 30
            if (r0 < r3) goto L_0x0071
            android.content.Context r0 = r1.f263445b     // Catch:{ CameraAccessException -> 0x044a }
            android.view.Display r0 = r0.getDisplay()     // Catch:{ CameraAccessException -> 0x044a }
            goto L_0x0077
        L_0x0071:
            android.view.WindowManager r0 = r1.f263452i     // Catch:{ CameraAccessException -> 0x044a }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ CameraAccessException -> 0x044a }
        L_0x0077:
            if (r0 == 0) goto L_0x007e
            int r0 = r0.getRotation()     // Catch:{ CameraAccessException -> 0x044a }
            goto L_0x007f
        L_0x007e:
            r0 = -1
        L_0x007f:
            com.google.android.apps.gsa.staticplugins.avocado.dx r3 = r1.f263460q     // Catch:{ CameraAccessException -> 0x044a }
            r3.getClass()
            android.hardware.camera2.CameraCharacteristics r3 = r3.f263443a     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ CameraAccessException -> 0x044a }
            int r3 = r3.intValue()     // Catch:{ CameraAccessException -> 0x044a }
            r1.f263457n = r3     // Catch:{ CameraAccessException -> 0x044a }
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x00c1
            if (r0 == r6) goto L_0x00ba
            if (r0 == r5) goto L_0x00c1
            r7 = 3
            if (r0 == r7) goto L_0x00ba
            com.google.common.f.e r3 = f263444a     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CameraAccessException -> 0x044a }
            r3.mo56378ag(r7, r2)     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ CameraAccessException -> 0x044a }
            r7 = 14405(0x3845, float:2.0186E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r7)     // Catch:{ CameraAccessException -> 0x044a }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.String r7 = "Display rotation is invalid: %d"
            r3.mo56387q(r7, r0)     // Catch:{ CameraAccessException -> 0x044a }
            goto L_0x00ca
        L_0x00ba:
            if (r3 == 0) goto L_0x00cc
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 != r0) goto L_0x00ca
            goto L_0x00cc
        L_0x00c1:
            r0 = 90
            if (r3 == r0) goto L_0x00cc
            r0 = 270(0x10e, float:3.78E-43)
            if (r3 != r0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r0 = 0
            goto L_0x00cd
        L_0x00cc:
            r0 = 1
        L_0x00cd:
            int r3 = r1.f263454k     // Catch:{ CameraAccessException -> 0x044a }
            int r7 = r1.f263455l     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r8 = r1.f263453j     // Catch:{ CameraAccessException -> 0x044a }
            int r8 = r8.getWidth()     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r9 = r1.f263453j     // Catch:{ CameraAccessException -> 0x044a }
            int r9 = r9.getHeight()     // Catch:{ CameraAccessException -> 0x044a }
            if (r0 == 0) goto L_0x00ef
            int r3 = r1.f263455l     // Catch:{ CameraAccessException -> 0x044a }
            int r7 = r1.f263454k     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r0 = r1.f263453j     // Catch:{ CameraAccessException -> 0x044a }
            int r8 = r0.getHeight()     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r0 = r1.f263453j     // Catch:{ CameraAccessException -> 0x044a }
            int r9 = r0.getWidth()     // Catch:{ CameraAccessException -> 0x044a }
        L_0x00ef:
            r0 = 1920(0x780, float:2.69E-42)
            if (r8 <= r0) goto L_0x00f5
            r8 = 1920(0x780, float:2.69E-42)
        L_0x00f5:
            r0 = 1080(0x438, float:1.513E-42)
            if (r9 <= r0) goto L_0x00fb
            r9 = 1080(0x438, float:1.513E-42)
        L_0x00fb:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r0 = r1.f263453j     // Catch:{ CameraAccessException -> 0x044a }
            r0.getWidth()     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r0 = r1.f263453j     // Catch:{ CameraAccessException -> 0x044a }
            r0.getHeight()     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.dx r0 = r1.f263460q     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.CameraCharacteristics r0 = r0.f263443a     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ CameraAccessException -> 0x044a }
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0     // Catch:{ CameraAccessException -> 0x044a }
            r10 = 35
            android.util.Size[] r0 = r0.getOutputSizes(r10)     // Catch:{ CameraAccessException -> 0x044a }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.dt r10 = new com.google.android.apps.gsa.staticplugins.avocado.dt     // Catch:{ CameraAccessException -> 0x044a }
            r10.<init>()     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.Object r0 = java.util.Collections.max(r0, r10)     // Catch:{ CameraAccessException -> 0x044a }
            android.util.Size r0 = (android.util.Size) r0     // Catch:{ CameraAccessException -> 0x044a }
            r1.f263458o = r0     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.shared.m.c r0 = r1.f263456m     // Catch:{ CameraAccessException -> 0x044a }
            if (r0 == 0) goto L_0x0211
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249973bj     // Catch:{ CameraAccessException -> 0x044a }
            boolean r0 = r0.mo79746e(r10)     // Catch:{ CameraAccessException -> 0x044a }
            if (r0 == 0) goto L_0x0211
            com.google.android.apps.gsa.shared.m.c r0 = r1.f263456m     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.shared.m.f r10 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249965bb     // Catch:{ CameraAccessException -> 0x044a }
            long r10 = r0.mo79743a(r10)     // Catch:{ CameraAccessException -> 0x044a }
            int r0 = (int) r10     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.staticplugins.avocado.dx r10 = r1.f263460q     // Catch:{ CameraAccessException -> 0x044a }
            java.lang.Class<android.view.SurfaceHolder> r11 = android.view.SurfaceHolder.class
            android.util.Size[] r10 = r10.mo88424a(r11)     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.shared.m.c r11 = r1.f263456m     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.shared.m.f r12 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249968be     // Catch:{ CameraAccessException -> 0x044a }
            long r11 = r11.mo79743a(r12)     // Catch:{ CameraAccessException -> 0x044a }
            int r12 = (int) r11     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.shared.m.c r11 = r1.f263456m     // Catch:{ CameraAccessException -> 0x044a }
            com.google.android.apps.gsa.shared.m.f r13 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249967bd     // Catch:{ CameraAccessException -> 0x044a }
            long r13 = r11.mo79743a(r13)     // Catch:{ CameraAccessException -> 0x044a }
            int r11 = (int) r13     // Catch:{ CameraAccessException -> 0x044a }
            if (r0 <= 0) goto L_0x0166
            android.util.Size r13 = r1.f263458o     // Catch:{ CameraAccessException -> 0x044a }
            int r13 = r13.getWidth()     // Catch:{ CameraAccessException -> 0x044a }
            int r13 = java.lang.Math.min(r0, r13)     // Catch:{ CameraAccessException -> 0x044a }
            goto L_0x016c
        L_0x0166:
            android.util.Size r13 = r1.f263458o     // Catch:{ CameraAccessException -> 0x044a }
            int r13 = r13.getWidth()     // Catch:{ CameraAccessException -> 0x044a }
        L_0x016c:
            if (r0 <= 0) goto L_0x0179
            android.util.Size r14 = r1.f263458o     // Catch:{ CameraAccessException -> 0x044a }
            int r14 = r14.getHeight()     // Catch:{ CameraAccessException -> 0x044a }
            int r0 = java.lang.Math.min(r0, r14)     // Catch:{ CameraAccessException -> 0x044a }
            goto L_0x017f
        L_0x0179:
            android.util.Size r0 = r1.f263458o     // Catch:{ CameraAccessException -> 0x044a }
            int r0 = r0.getHeight()     // Catch:{ CameraAccessException -> 0x044a }
        L_0x017f:
            android.util.Size r14 = r1.f263458o     // Catch:{ CameraAccessException -> 0x044a }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x044a }
            r15.<init>()     // Catch:{ CameraAccessException -> 0x044a }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x044a }
            r6.<init>()     // Catch:{ CameraAccessException -> 0x044a }
            int r16 = r14.getWidth()     // Catch:{ CameraAccessException -> 0x044a }
            int r14 = r14.getHeight()     // Catch:{ CameraAccessException -> 0x044a }
            int r5 = r10.length     // Catch:{ CameraAccessException -> 0x044a }
        L_0x0194:
            if (r4 >= r5) goto L_0x01d7
            r17 = r5
            r5 = r10[r4]     // Catch:{ CameraAccessException -> 0x044a }
            r18 = r2
            int r2 = r5.getWidth()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r2 > r13) goto L_0x01cc
            int r2 = r5.getHeight()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r2 > r0) goto L_0x01cc
            int r2 = r5.getHeight()     // Catch:{ CameraAccessException -> 0x0446 }
            int r19 = r5.getWidth()     // Catch:{ CameraAccessException -> 0x0446 }
            int r19 = r19 * r14
            r20 = r0
            int r0 = r19 / r16
            if (r2 != r0) goto L_0x01ce
            int r0 = r5.getWidth()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r0 < r12) goto L_0x01c8
            int r0 = r5.getHeight()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r0 < r11) goto L_0x01c8
            r15.add(r5)     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x01ce
        L_0x01c8:
            r6.add(r5)     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x01ce
        L_0x01cc:
            r20 = r0
        L_0x01ce:
            int r4 = r4 + 1
            r5 = r17
            r2 = r18
            r0 = r20
            goto L_0x0194
        L_0x01d7:
            r18 = r2
            boolean r0 = r15.isEmpty()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r0 != 0) goto L_0x01eb
            com.google.android.apps.gsa.staticplugins.avocado.dt r0 = new com.google.android.apps.gsa.staticplugins.avocado.dt     // Catch:{ CameraAccessException -> 0x0446 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Object r0 = java.util.Collections.min(r15, r0)     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Size r0 = (android.util.Size) r0     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x020e
        L_0x01eb:
            boolean r0 = r6.isEmpty()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r0 != 0) goto L_0x01fd
            com.google.android.apps.gsa.staticplugins.avocado.dt r0 = new com.google.android.apps.gsa.staticplugins.avocado.dt     // Catch:{ CameraAccessException -> 0x0446 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Object r0 = java.util.Collections.max(r6, r0)     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Size r0 = (android.util.Size) r0     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x020e
        L_0x01fd:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.avocado.C94269du.f263440a     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.String r2 = "Couldn't find any suitable preview size"
            r4 = 14386(0x3832, float:2.0159E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r2)     // Catch:{ CameraAccessException -> 0x0446 }
            r0 = 0
            r2 = r10[r0]     // Catch:{ CameraAccessException -> 0x0446 }
            r0 = r2
        L_0x020e:
            r1.f263449f = r0     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x0217
        L_0x0211:
            r18 = r2
            android.util.Size r0 = r1.f263458o     // Catch:{ CameraAccessException -> 0x0446 }
            r1.f263449f = r0     // Catch:{ CameraAccessException -> 0x0446 }
        L_0x0217:
            com.google.android.apps.gsa.staticplugins.avocado.dx r0 = r1.f263460q     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Class<android.view.SurfaceHolder> r2 = android.view.SurfaceHolder.class
            android.util.Size[] r0 = r0.mo88424a(r2)     // Catch:{ CameraAccessException -> 0x0446 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ CameraAccessException -> 0x0446 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            int r4 = r0.length     // Catch:{ CameraAccessException -> 0x0446 }
            r5 = 0
        L_0x0226:
            if (r5 >= r4) goto L_0x0251
            r6 = r0[r5]     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Rational r10 = new android.util.Rational     // Catch:{ CameraAccessException -> 0x0446 }
            int r11 = r6.getWidth()     // Catch:{ CameraAccessException -> 0x0446 }
            int r12 = r6.getHeight()     // Catch:{ CameraAccessException -> 0x0446 }
            r10.<init>(r11, r12)     // Catch:{ CameraAccessException -> 0x0446 }
            boolean r11 = r2.containsKey(r10)     // Catch:{ CameraAccessException -> 0x0446 }
            if (r11 != 0) goto L_0x0245
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ CameraAccessException -> 0x0446 }
            r11.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            r2.put(r10, r11)     // Catch:{ CameraAccessException -> 0x0446 }
        L_0x0245:
            java.lang.Object r10 = r2.get(r10)     // Catch:{ CameraAccessException -> 0x0446 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ CameraAccessException -> 0x0446 }
            r10.add(r6)     // Catch:{ CameraAccessException -> 0x0446 }
            int r5 = r5 + 1
            goto L_0x0226
        L_0x0251:
            java.util.Set r4 = r2.keySet()     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Rational r5 = new android.util.Rational     // Catch:{ CameraAccessException -> 0x0446 }
            r5.<init>(r3, r7)     // Catch:{ CameraAccessException -> 0x0446 }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Object r6 = r6.next()     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Rational r6 = (android.util.Rational) r6     // Catch:{ CameraAccessException -> 0x0446 }
            float r10 = r5.floatValue()     // Catch:{ CameraAccessException -> 0x0446 }
            float r11 = r6.floatValue()     // Catch:{ CameraAccessException -> 0x0446 }
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)     // Catch:{ CameraAccessException -> 0x0446 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ CameraAccessException -> 0x0446 }
        L_0x0275:
            boolean r11 = r4.hasNext()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r11 == 0) goto L_0x029c
            java.lang.Object r11 = r4.next()     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Rational r11 = (android.util.Rational) r11     // Catch:{ CameraAccessException -> 0x0446 }
            float r12 = r5.floatValue()     // Catch:{ CameraAccessException -> 0x0446 }
            float r13 = r11.floatValue()     // Catch:{ CameraAccessException -> 0x0446 }
            float r12 = r12 - r13
            float r12 = java.lang.Math.abs(r12)     // Catch:{ CameraAccessException -> 0x0446 }
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0294
            r13 = r12
            goto L_0x0295
        L_0x0294:
            r13 = r10
        L_0x0295:
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x029a
            r6 = r11
        L_0x029a:
            r10 = r13
            goto L_0x0275
        L_0x029c:
            if (r6 != 0) goto L_0x02a0
            r2 = 0
            goto L_0x02a6
        L_0x02a0:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ CameraAccessException -> 0x0446 }
        L_0x02a6:
            if (r2 != 0) goto L_0x02df
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.avocado.C94269du.f263440a     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ CameraAccessException -> 0x0446 }
            r4 = 14385(0x3831, float:2.0158E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ CameraAccessException -> 0x0446 }
            r8 = r2
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.String r9 = "Couldn't find any size close to desired aspect ratio viewWidth %d, viewHeight %d, choose choices[0].getWidth %d,  choices[0].getHeight %d"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)     // Catch:{ CameraAccessException -> 0x0446 }
            r2 = 0
            r3 = r0[r2]     // Catch:{ CameraAccessException -> 0x0446 }
            int r3 = r3.getWidth()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ CameraAccessException -> 0x0446 }
            r3 = r0[r2]     // Catch:{ CameraAccessException -> 0x0446 }
            int r2 = r3.getHeight()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x0446 }
            r8.mo56360M(r9, r10, r11, r12, r13)     // Catch:{ CameraAccessException -> 0x0446 }
            r2 = 0
            r0 = r0[r2]     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x0322
        L_0x02df:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0446 }
            r3.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0446 }
            r4.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ CameraAccessException -> 0x0446 }
        L_0x02ed:
            boolean r6 = r5.hasNext()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r6 == 0) goto L_0x0311
            java.lang.Object r6 = r5.next()     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Size r6 = (android.util.Size) r6     // Catch:{ CameraAccessException -> 0x0446 }
            int r10 = r6.getWidth()     // Catch:{ CameraAccessException -> 0x0446 }
            int r11 = r6.getHeight()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r10 > r8) goto L_0x02ed
            if (r11 > r9) goto L_0x02ed
            if (r10 < r7) goto L_0x030d
            if (r11 < r7) goto L_0x030d
            r3.add(r6)     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x02ed
        L_0x030d:
            r4.add(r6)     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x02ed
        L_0x0311:
            boolean r5 = r3.isEmpty()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r5 != 0) goto L_0x0324
            com.google.android.apps.gsa.staticplugins.avocado.dt r0 = new com.google.android.apps.gsa.staticplugins.avocado.dt     // Catch:{ CameraAccessException -> 0x0446 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Object r0 = java.util.Collections.min(r3, r0)     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Size r0 = (android.util.Size) r0     // Catch:{ CameraAccessException -> 0x0446 }
        L_0x0322:
            r5 = 0
            goto L_0x0360
        L_0x0324:
            boolean r3 = r4.isEmpty()     // Catch:{ CameraAccessException -> 0x0446 }
            if (r3 != 0) goto L_0x0336
            com.google.android.apps.gsa.staticplugins.avocado.dt r0 = new com.google.android.apps.gsa.staticplugins.avocado.dt     // Catch:{ CameraAccessException -> 0x0446 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Object r0 = java.util.Collections.max(r4, r0)     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Size r0 = (android.util.Size) r0     // Catch:{ CameraAccessException -> 0x0446 }
            goto L_0x0322
        L_0x0336:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.avocado.C94269du.f263440a     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ CameraAccessException -> 0x0446 }
            r4 = 14382(0x382e, float:2.0153E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.String r4 = "Couldn't find any suitable preview size, choose choices[0].getWidth %d,  choices[0].getHeight %d"
            r5 = 0
            r6 = r0[r5]     // Catch:{ CameraAccessException -> 0x0446 }
            int r6 = r6.getWidth()     // Catch:{ CameraAccessException -> 0x0446 }
            r7 = r0[r5]     // Catch:{ CameraAccessException -> 0x0446 }
            int r7 = r7.getHeight()     // Catch:{ CameraAccessException -> 0x0446 }
            r3.mo56393w(r4, r6, r7)     // Catch:{ CameraAccessException -> 0x0446 }
            r0 = r0[r5]     // Catch:{ CameraAccessException -> 0x0446 }
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90130k(r2, r0)     // Catch:{ CameraAccessException -> 0x0446 }
            android.util.Size r0 = (android.util.Size) r0     // Catch:{ CameraAccessException -> 0x0446 }
        L_0x0360:
            r1.f263459p = r0     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.e r0 = f263444a     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.x r2 = r0.mo56224b()     // Catch:{ CameraAccessException -> 0x0446 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CameraAccessException -> 0x0446 }
            r4 = r18
            r2.mo56378ag(r3, r4)     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ CameraAccessException -> 0x0444 }
            r3 = 14407(0x3847, float:2.0189E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ CameraAccessException -> 0x0444 }
            r6 = r2
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.String r7 = "largest Height %d, largest Width %d, capture Height %d, capture Width %d"
            android.util.Size r2 = r1.f263458o     // Catch:{ CameraAccessException -> 0x0444 }
            int r2 = r2.getHeight()     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r2 = r1.f263458o     // Catch:{ CameraAccessException -> 0x0444 }
            int r2 = r2.getWidth()     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r2 = r1.f263449f     // Catch:{ CameraAccessException -> 0x0444 }
            int r2 = r2.getHeight()     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r2 = r1.f263449f     // Catch:{ CameraAccessException -> 0x0444 }
            int r2 = r2.getWidth()     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x0444 }
            r6.mo56360M(r7, r8, r9, r10, r11)     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r2 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            r2.getHeight()     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r2 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            r2.getWidth()     // Catch:{ CameraAccessException -> 0x0444 }
            android.content.Context r2 = r1.f263445b     // Catch:{ CameraAccessException -> 0x0444 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ CameraAccessException -> 0x0444 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ CameraAccessException -> 0x0444 }
            int r2 = r2.orientation     // Catch:{ CameraAccessException -> 0x0444 }
            r3 = 2
            if (r2 != r3) goto L_0x03f6
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r2 = r1.f263453j     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r3 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r3 = r3.getWidth()     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r6 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r6 = r6.getHeight()     // Catch:{ CameraAccessException -> 0x0444 }
            r2.mo88350a(r3, r6)     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CameraAccessException -> 0x0444 }
            r0.mo56378ag(r2, r4)     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CameraAccessException -> 0x0444 }
            r2 = 14413(0x384d, float:2.0197E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.String r2 = "ORIENTATION_LANDSCAPE  setAspectRatio  width %d, height %d"
            android.util.Size r3 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r3 = r3.getWidth()     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r6 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r6 = r6.getHeight()     // Catch:{ CameraAccessException -> 0x0444 }
            r0.mo56393w(r2, r3, r6)     // Catch:{ CameraAccessException -> 0x0444 }
            goto L_0x042b
        L_0x03f6:
            com.google.android.apps.gsa.staticplugins.avocado.Camera2SourcePreview r2 = r1.f263453j     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r3 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r3 = r3.getHeight()     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r6 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r6 = r6.getWidth()     // Catch:{ CameraAccessException -> 0x0444 }
            r2.mo88350a(r3, r6)     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ CameraAccessException -> 0x0444 }
            r0.mo56378ag(r2, r4)     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CameraAccessException -> 0x0444 }
            r2 = 14409(0x3849, float:2.0191E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ CameraAccessException -> 0x0444 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.String r2 = "Not ORIENTATION_LANDSCAPE setAspectRatio  width %d, height %d"
            android.util.Size r3 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r3 = r3.getHeight()     // Catch:{ CameraAccessException -> 0x0444 }
            android.util.Size r6 = r1.f263459p     // Catch:{ CameraAccessException -> 0x0444 }
            int r6 = r6.getWidth()     // Catch:{ CameraAccessException -> 0x0444 }
            r0.mo56393w(r2, r3, r6)     // Catch:{ CameraAccessException -> 0x0444 }
        L_0x042b:
            com.google.android.apps.gsa.staticplugins.avocado.dx r0 = r1.f263460q     // Catch:{ CameraAccessException -> 0x0444 }
            android.hardware.camera2.CameraCharacteristics r0 = r0.f263443a     // Catch:{ CameraAccessException -> 0x0444 }
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ CameraAccessException -> 0x0444 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ CameraAccessException -> 0x0444 }
            if (r0 == 0) goto L_0x0441
            int r0 = r0.intValue()     // Catch:{ CameraAccessException -> 0x0444 }
            r2 = 2
            if (r0 == r2) goto L_0x0441
            r5 = 1
        L_0x0441:
            r1.f263448e = r5     // Catch:{ CameraAccessException -> 0x0444 }
            return
        L_0x0444:
            r0 = move-exception
            goto L_0x044c
        L_0x0446:
            r0 = move-exception
            r4 = r18
            goto L_0x044c
        L_0x044a:
            r0 = move-exception
            r4 = r2
        L_0x044c:
            com.google.common.f.e r2 = f263444a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r4)
            r3 = 14411(0x384b, float:2.0194E-41)
            com.google.common.f.ad r4 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r5 = "try getCameraIdList"
            android.databinding.C0118a.m110r(r2, r5, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.avocado.C94273dy.m155569b():void");
    }

    /* renamed from: a */
    public final int mo88425a() {
        int i = this.f263450g;
        int i2 = i == -1 ? 0 : -i;
        int i3 = this.f263457n;
        C58976aa aaVar = C58975e.f156826a;
        return ((i3 + i2) + 360) % 360;
    }
}
