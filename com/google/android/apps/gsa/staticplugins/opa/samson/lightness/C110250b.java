package com.google.android.apps.gsa.staticplugins.opa.samson.lightness;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.lifecycle.C2332ag;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.lightness.b */
/* compiled from: PG */
public final class C110250b implements SensorEventListener {

    /* renamed from: k */
    private static final C59071e f307246k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.lightness.b");

    /* renamed from: a */
    public final SensorManager f307247a;

    /* renamed from: b */
    public final Sensor f307248b;

    /* renamed from: c */
    public final Sensor f307249c;

    /* renamed from: d */
    int f307250d = PrivateKeyType.INVALID;

    /* renamed from: e */
    int f307251e = PrivateKeyType.INVALID;

    /* renamed from: f */
    float f307252f = -1.0f;

    /* renamed from: g */
    boolean f307253g = false;

    /* renamed from: h */
    C60870cx f307254h;

    /* renamed from: i */
    public C2332ag f307255i;

    /* renamed from: j */
    int f307256j = 3;

    /* renamed from: l */
    private final int f307257l;

    /* renamed from: m */
    private final float f307258m;

    /* renamed from: n */
    private final float f307259n;

    /* renamed from: o */
    private final float f307260o;

    /* renamed from: p */
    private final float f307261p;

    /* renamed from: q */
    private final float f307262q;

    /* renamed from: r */
    private final float f307263r;

    /* renamed from: s */
    private final C22871g f307264s;

    public C110250b(SensorManager sensorManager, C86124t tVar, C22871g gVar) {
        this.f307247a = sensorManager;
        this.f307264s = gVar;
        this.f307248b = m183594c(5);
        this.f307249c = m183594c(8);
        this.f307257l = (int) tVar.mo79743a(C90014bt.f247070aH);
        this.f307258m = (float) tVar.mo79747m(C90014bt.f247097ai);
        this.f307259n = (float) tVar.mo79747m(C90014bt.f247101am);
        this.f307260o = (float) tVar.mo79747m(C90014bt.f247099ak);
        this.f307261p = (float) tVar.mo79747m(C90014bt.f247100al);
        this.f307262q = (float) tVar.mo79747m(C90014bt.f247102an);
        this.f307263r = (float) tVar.mo79747m(C90014bt.f247098aj);
    }

    /* renamed from: c */
    private final Sensor m183594c(int i) {
        List<Sensor> sensorList = this.f307247a.getSensorList(i);
        if (!sensorList.isEmpty()) {
            return sensorList.get(0);
        }
        return null;
    }

    /* renamed from: d */
    private final void m183595d() {
        C60870cx cxVar = this.f307254h;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f307254h = null;
        }
    }

    /* renamed from: a */
    public final void mo98496a() {
        C2332ag agVar = this.f307255i;
        if (agVar != null) {
            agVar.mo5708l(Integer.valueOf(this.f307250d));
        }
        this.f307251e = this.f307250d;
    }

    /* renamed from: b */
    public final void mo98497b(Sensor sensor) {
        if (sensor != null) {
            this.f307247a.registerListener(this, sensor, 0);
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r0 < r10.f307262q) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bf, code lost:
        if (r0 < r10.f307263r) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        if (r0 < r10.f307263r) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        if (r0 < 0.0f) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0100, code lost:
        if (r0 < r10.f307263r) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0102, code lost:
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0104, code lost:
        r2 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSensorChanged(android.hardware.SensorEvent r11) {
        /*
            r10 = this;
            float[] r0 = r11.values
            if (r0 == 0) goto L_0x0139
            float[] r0 = r11.values
            int r0 = r0.length
            if (r0 != 0) goto L_0x000b
            goto L_0x0139
        L_0x000b:
            android.hardware.Sensor r0 = r11.sensor
            java.lang.String r0 = r0.getStringType()
            java.lang.String r1 = "android.sensor.light"
            boolean r0 = r1.equals(r0)
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0023
            float[] r11 = r11.values
            r11 = r11[r1]
            r10.f307252f = r11
            goto L_0x0054
        L_0x0023:
            android.hardware.Sensor r0 = r11.sensor
            java.lang.String r0 = r0.getStringType()
            java.lang.String r4 = "android.sensor.proximity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0139
            float[] r0 = r11.values
            r0 = r0[r1]
            double r4 = (double) r0
            int r0 = r10.f307257l
            float r0 = (float) r0
            android.hardware.Sensor r11 = r11.sensor
            float r11 = r11.getMaximumRange()
            float r11 = java.lang.Math.max(r0, r11)
            double r6 = (double) r11
            r8 = 4532020583461814272(0x3ee4f8b580000000, double:9.999999747378752E-6)
            int r11 = com.google.common.p4573p.C60713c.m92639a(r4, r6, r8)
            if (r11 < 0) goto L_0x0051
            r11 = 2
            goto L_0x0052
        L_0x0051:
            r11 = 1
        L_0x0052:
            r10.f307256j = r11
        L_0x0054:
            int r11 = r10.f307250d
            float r0 = r10.f307252f
            int r4 = r10.f307256j
            r5 = 255(0xff, float:3.57E-43)
            if (r4 != r3) goto L_0x0071
            r10.f307250d = r1
            boolean r0 = r10.f307253g
            if (r0 != 0) goto L_0x0107
            r10.f307253g = r3
            android.hardware.Sensor r0 = r10.f307248b
            if (r0 == 0) goto L_0x0107
            android.hardware.SensorManager r1 = r10.f307247a
            r1.unregisterListener(r10, r0)
            goto L_0x0107
        L_0x0071:
            if (r4 != r2) goto L_0x0107
            r4 = 4
            r6 = 3
            if (r11 == 0) goto L_0x00d7
            if (r11 == r3) goto L_0x00ed
            if (r11 == r2) goto L_0x00c2
            if (r11 == r6) goto L_0x00ad
            if (r11 == r4) goto L_0x0097
            if (r11 == r5) goto L_0x00d7
            com.google.common.f.e r0 = f307246k
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "BBrightVSensor"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "onSensorChanged - unknown state!"
            r2 = 25747(0x6493, float:3.6079E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0107
        L_0x0097:
            float r1 = r10.f307258m
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x009e
            goto L_0x00f3
        L_0x009e:
            float r1 = r10.f307260o
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a6
            goto L_0x0105
        L_0x00a6:
            float r1 = r10.f307262q
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            goto L_0x0102
        L_0x00ad:
            float r1 = r10.f307258m
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b4
            goto L_0x00f3
        L_0x00b4:
            float r1 = r10.f307260o
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bb
            goto L_0x0105
        L_0x00bb:
            float r1 = r10.f307263r
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            goto L_0x0102
        L_0x00c2:
            float r1 = r10.f307258m
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00c9
            goto L_0x00f3
        L_0x00c9:
            float r1 = r10.f307261p
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d0
            goto L_0x0105
        L_0x00d0:
            float r1 = r10.f307263r
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            goto L_0x0102
        L_0x00d7:
            boolean r7 = r10.f307253g
            if (r7 == 0) goto L_0x00e7
            r10.f307253g = r1
            android.hardware.Sensor r0 = r10.f307248b
            r10.mo98497b(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.f307252f = r0
            goto L_0x0107
        L_0x00e7:
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ed
            goto L_0x0107
        L_0x00ed:
            float r1 = r10.f307259n
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f5
        L_0x00f3:
            r2 = 1
            goto L_0x0105
        L_0x00f5:
            float r1 = r10.f307261p
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fc
            goto L_0x0105
        L_0x00fc:
            float r1 = r10.f307263r
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
        L_0x0102:
            r2 = 3
            goto L_0x0105
        L_0x0104:
            r2 = 4
        L_0x0105:
            r10.f307250d = r2
        L_0x0107:
            int r0 = r10.f307250d
            if (r0 == r11) goto L_0x0139
            if (r0 != r5) goto L_0x010e
            goto L_0x0139
        L_0x010e:
            if (r11 != r5) goto L_0x0114
            r10.mo98496a()
            return
        L_0x0114:
            int r1 = r10.f307251e
            if (r0 != r1) goto L_0x011e
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.m183595d()
            return
        L_0x011e:
            if (r11 != r1) goto L_0x0139
            if (r11 != 0) goto L_0x0125
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0127
        L_0x0125:
            r0 = 3000(0xbb8, double:1.482E-320)
        L_0x0127:
            r10.m183595d()
            com.google.android.libraries.gsa.k.g r11 = r10.f307264s
            com.google.android.apps.gsa.staticplugins.opa.samson.lightness.a r2 = new com.google.android.apps.gsa.staticplugins.opa.samson.lightness.a
            r2.<init>(r10)
            java.lang.String r3 = "DELAYED_PUBLISH_EVENT"
            com.google.common.util.concurrent.cx r11 = r11.mo28208h(r3, r0, r2)
            r10.f307254h = r11
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110250b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
