package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.libraries.phenotype.client.C31654aj;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.measurement.internal.ff */
/* compiled from: PG */
public final class C145361ff implements C145383ga {

    /* renamed from: B */
    private static volatile C145361ff f392923B;

    /* renamed from: A */
    public final C144006f f392924A;

    /* renamed from: C */
    private final C145473jj f392925C;

    /* renamed from: D */
    private final C145430hu f392926D;

    /* renamed from: E */
    private final C145301d f392927E;

    /* renamed from: F */
    private final C145420hk f392928F;

    /* renamed from: G */
    private Boolean f392929G;

    /* renamed from: H */
    private long f392930H;

    /* renamed from: a */
    public final Context f392931a;

    /* renamed from: b */
    public final String f392932b;

    /* renamed from: c */
    public final String f392933c;

    /* renamed from: d */
    public final String f392934d;

    /* renamed from: e */
    public final boolean f392935e;

    /* renamed from: f */
    public final C145508x f392936f;

    /* renamed from: g */
    public final C145222ab f392937g;

    /* renamed from: h */
    public final C145339ek f392938h;

    /* renamed from: i */
    public final C145325dx f392939i;

    /* renamed from: j */
    public final C145358fc f392940j;

    /* renamed from: k */
    public final C145495ke f392941k;

    /* renamed from: l */
    public final C145320ds f392942l;

    /* renamed from: m */
    public final C145416hg f392943m;

    /* renamed from: n */
    public final String f392944n;

    /* renamed from: o */
    public C145319dr f392945o;

    /* renamed from: p */
    public C145456it f392946p;

    /* renamed from: q */
    public C145232al f392947q;

    /* renamed from: r */
    public C145317dp f392948r;

    /* renamed from: s */
    public boolean f392949s = false;

    /* renamed from: t */
    public volatile Boolean f392950t;

    /* renamed from: u */
    protected Boolean f392951u;

    /* renamed from: v */
    protected Boolean f392952v;

    /* renamed from: w */
    public volatile boolean f392953w;

    /* renamed from: x */
    public int f392954x;

    /* renamed from: y */
    public final AtomicInteger f392955y = new AtomicInteger(0);

    /* renamed from: z */
    final long f392956z;

    public C145361ff(C145389gg ggVar) {
        long j;
        Bundle bundle;
        boolean z = false;
        Context context = ggVar.f393055a;
        C145508x xVar = new C145508x();
        this.f392936f = xVar;
        C145311dj.f392686a = xVar;
        this.f392931a = context;
        this.f392932b = ggVar.f393056b;
        this.f392933c = ggVar.f393057c;
        this.f392934d = ggVar.f393058d;
        this.f392935e = ggVar.f393062h;
        this.f392950t = ggVar.f393059e;
        this.f392944n = ggVar.f393064j;
        this.f392953w = true;
        InitializationParams initializationParams = ggVar.f393061g;
        if (!(initializationParams == null || (bundle = initializationParams.f392417g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f392951u = (Boolean) obj;
            }
            Object obj2 = initializationParams.f392417g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f392952v = (Boolean) obj2;
            }
        }
        C31654aj.m58985d(context);
        this.f392924A = C144006f.f390244a;
        Long l = ggVar.f393063i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = System.currentTimeMillis();
        }
        this.f392956z = j;
        this.f392937g = new C145222ab(this);
        C145339ek ekVar = new C145339ek(this);
        ekVar.mo121003l();
        this.f392938h = ekVar;
        C145325dx dxVar = new C145325dx(this);
        dxVar.mo121003l();
        this.f392939i = dxVar;
        C145495ke keVar = new C145495ke(this);
        keVar.mo121003l();
        this.f392941k = keVar;
        this.f392942l = new C145320ds(new C145388gf(this));
        this.f392927E = new C145301d(this);
        C145430hu huVar = new C145430hu(this);
        huVar.mo120950b();
        this.f392926D = huVar;
        C145416hg hgVar = new C145416hg(this);
        hgVar.mo120950b();
        this.f392943m = hgVar;
        C145473jj jjVar = new C145473jj(this);
        jjVar.mo120950b();
        this.f392925C = jjVar;
        C145420hk hkVar = new C145420hk(this);
        hkVar.mo121003l();
        this.f392928F = hkVar;
        C145358fc fcVar = new C145358fc(this);
        fcVar.mo121003l();
        this.f392940j = fcVar;
        InitializationParams initializationParams2 = ggVar.f393061g;
        z = (initializationParams2 == null || initializationParams2.f392412b == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C145416hg j2 = mo120972j();
            if (j2.f393011w.f392931a.getApplicationContext() instanceof Application) {
                Application application = (Application) j2.f393011w.f392931a.getApplicationContext();
                if (j2.f393141b == null) {
                    j2.f393141b = new C145415hf(j2);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(j2.f393141b);
                    application.registerActivityLifecycleCallbacks(j2.f393141b);
                    j2.f393011w.mo120965ar().f392803k.mo120894a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo120965ar().f392798f.mo120894a("Application context is not an Application");
        }
        fcVar.mo120960h(new C145360fe(this, ggVar));
    }

    /* renamed from: i */
    public static C145361ff m236186i(Context context, InitializationParams initializationParams, Long l) {
        Bundle bundle;
        if (initializationParams != null && (initializationParams.f392415e == null || initializationParams.f392416f == null)) {
            initializationParams = new InitializationParams(initializationParams.f392411a, initializationParams.f392412b, initializationParams.f392413c, initializationParams.f392414d, (String) null, (String) null, initializationParams.f392417g, (String) null);
        }
        C143919bh.m233958a(context);
        C143919bh.m233958a(context.getApplicationContext());
        if (f392923B == null) {
            synchronized (C145361ff.class) {
                if (f392923B == null) {
                    f392923B = new C145361ff(new C145389gg(context, initializationParams, l));
                }
            }
        } else if (!(initializationParams == null || (bundle = initializationParams.f392417g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C143919bh.m233958a(f392923B);
            f392923B.f392950t = Boolean.valueOf(initializationParams.f392417g.getBoolean("dataCollectionDefaultEnabled"));
        }
        C143919bh.m233958a(f392923B);
        return f392923B;
    }

    /* renamed from: t */
    public static final void m236187t(C145381fz fzVar) {
        if (fzVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!fzVar.mo121005n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(fzVar.getClass()))));
        }
    }

    /* renamed from: u */
    static final void m236188u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: v */
    private static final void m236189v(C145380fy fyVar) {
        if (fyVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: w */
    private static final void m236190w(C145355f fVar) {
        if (fVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!fVar.mo120951c()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(fVar.getClass()))));
        }
    }

    /* renamed from: a */
    public final int mo120964a() {
        mo120966as().mo120904g();
        if (this.f392937g.mo120779p()) {
            return 1;
        }
        Boolean bool = this.f392952v;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo120966as().mo120904g();
        if (!this.f392953w) {
            return 8;
        }
        Boolean d = mo120971g().mo120924d();
        if (d == null) {
            C145222ab abVar = this.f392937g;
            C145508x xVar = abVar.f393011w.f392936f;
            Boolean j = abVar.mo120773j("firebase_analytics_collection_enabled");
            if (j == null) {
                Boolean bool2 = this.f392951u;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f392950t == null || this.f392950t.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (j.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (d.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* renamed from: ar */
    public final C145325dx mo120965ar() {
        m236187t(this.f392939i);
        return this.f392939i;
    }

    /* renamed from: as */
    public final C145358fc mo120966as() {
        m236187t(this.f392940j);
        return this.f392940j;
    }

    /* renamed from: b */
    public final C145301d mo120967b() {
        C145301d dVar = this.f392927E;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: c */
    public final C145232al mo120968c() {
        m236187t(this.f392947q);
        return this.f392947q;
    }

    /* renamed from: d */
    public final C145317dp mo120969d() {
        m236190w(this.f392948r);
        return this.f392948r;
    }

    /* renamed from: e */
    public final C145319dr mo120970e() {
        m236190w(this.f392945o);
        return this.f392945o;
    }

    /* renamed from: g */
    public final C145339ek mo120971g() {
        m236189v(this.f392938h);
        return this.f392938h;
    }

    /* renamed from: j */
    public final C145416hg mo120972j() {
        m236190w(this.f392943m);
        return this.f392943m;
    }

    /* renamed from: k */
    public final C145420hk mo120973k() {
        m236187t(this.f392928F);
        return this.f392928F;
    }

    /* renamed from: l */
    public final C145430hu mo120974l() {
        m236190w(this.f392926D);
        return this.f392926D;
    }

    /* renamed from: m */
    public final C145456it mo120975m() {
        m236190w(this.f392946p);
        return this.f392946p;
    }

    /* renamed from: n */
    public final C145473jj mo120976n() {
        m236190w(this.f392925C);
        return this.f392925C;
    }

    /* renamed from: o */
    public final C145495ke mo120977o() {
        m236189v(this.f392941k);
        return this.f392941k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo120978p() {
        this.f392954x++;
    }

    /* renamed from: q */
    public final boolean mo120979q() {
        return this.f392950t != null && this.f392950t.booleanValue();
    }

    /* renamed from: r */
    public final boolean mo120980r() {
        return mo120964a() == 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo120981s() {
        /*
            r6 = this;
            boolean r0 = r6.f392949s
            if (r0 == 0) goto L_0x00bc
            com.google.android.gms.measurement.internal.fc r0 = r6.mo120966as()
            r0.mo120904g()
            java.lang.Boolean r0 = r6.f392929G
            if (r0 == 0) goto L_0x002e
            long r1 = r6.f392930H
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b5
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.f392930H
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b5
        L_0x002e:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f392930H = r0
            com.google.android.gms.measurement.internal.ke r0 = r6.mo120977o()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.mo121269Z(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0076
            com.google.android.gms.measurement.internal.ke r0 = r6.mo120977o()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.mo121269Z(r3)
            if (r0 == 0) goto L_0x0076
            android.content.Context r0 = r6.f392931a
            com.google.android.gms.common.e.c r3 = com.google.android.gms.common.p10782e.C143873c.f389983a
            com.google.android.gms.common.e.b r0 = r3.mo119351a(r0)
            boolean r0 = r0.mo119349c()
            if (r0 != 0) goto L_0x0074
            com.google.android.gms.measurement.internal.ab r0 = r6.f392937g
            boolean r0 = r0.mo120780q()
            if (r0 != 0) goto L_0x0074
            android.content.Context r0 = r6.f392931a
            boolean r0 = com.google.android.gms.measurement.internal.C145495ke.m236487af(r0)
            if (r0 == 0) goto L_0x0076
            android.content.Context r0 = r6.f392931a
            boolean r0 = com.google.android.gms.measurement.internal.C145495ke.m236489am(r0)
            if (r0 == 0) goto L_0x0076
        L_0x0074:
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f392929G = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.ke r0 = r6.mo120977o()
            com.google.android.gms.measurement.internal.dp r3 = r6.mo120969d()
            java.lang.String r3 = r3.mo120875f()
            com.google.android.gms.measurement.internal.dp r4 = r6.mo120969d()
            r4.mo120949a()
            java.lang.String r4 = r4.f392771l
            boolean r0 = r0.mo121263T(r3, r4)
            if (r0 != 0) goto L_0x00af
            com.google.android.gms.measurement.internal.dp r0 = r6.mo120969d()
            r0.mo120949a()
            java.lang.String r0 = r0.f392771l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f392929G = r0
        L_0x00b5:
            java.lang.Boolean r0 = r6.f392929G
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145361ff.mo120981s():boolean");
    }
}
