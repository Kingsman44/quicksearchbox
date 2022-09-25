package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.p060c.C0977g;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.api.internal.C145194c;
import com.google.android.gms.measurement.api.internal.C145198g;
import com.google.android.gms.measurement.api.internal.C145200i;
import com.google.android.gms.measurement.api.internal.C145202k;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public class AppMeasurementDynamiteService extends C145194c {

    /* renamed from: a */
    C145361ff f392498a = null;

    /* renamed from: b */
    private final Map f392499b = new C0977g();

    /* renamed from: a */
    private final void m235893a() {
        if (this.f392498a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: b */
    private final void m235894b(C145198g gVar, String str) {
        m235893a();
        this.f392498a.mo120977o().mo121261R(gVar, str);
    }

    public void beginAdUnitExposure(String str, long j) {
        m235893a();
        this.f392498a.mo120967b().mo120848a(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m235893a();
        C145416hg j = this.f392498a.mo120972j();
        C145361ff ffVar = j.f393011w;
        j.mo121091H(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        m235893a();
        this.f392498a.mo120972j().mo121112z((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) {
        m235893a();
        this.f392498a.mo120967b().mo120849b(str, j);
    }

    public void generateEventId(C145198g gVar) {
        m235893a();
        long r = this.f392498a.mo120977o().mo121285r();
        m235893a();
        this.f392498a.mo120977o().mo121260Q(gVar, r);
    }

    public void getAppInstanceId(C145198g gVar) {
        m235893a();
        this.f392498a.mo120966as().mo120960h(new C145409h(this, gVar));
    }

    public void getCachedAppInstanceId(C145198g gVar) {
        m235893a();
        m235894b(gVar, this.f392498a.mo120972j().mo121094e());
    }

    public void getConditionalUserProperties(String str, String str2, C145198g gVar) {
        m235893a();
        this.f392498a.mo120966as().mo120960h(new C145496l(this, gVar, str, str2));
    }

    public void getCurrentScreenClass(C145198g gVar) {
        m235893a();
        m235894b(gVar, this.f392498a.mo120972j().mo121095i());
    }

    public void getCurrentScreenName(C145198g gVar) {
        m235893a();
        m235894b(gVar, this.f392498a.mo120972j().mo121096j());
    }

    public void getGmpAppId(C145198g gVar) {
        m235893a();
        C145416hg j = this.f392498a.mo120972j();
        C145361ff ffVar = j.f393011w;
        String str = ffVar.f392932b;
        if (str == null) {
            try {
                str = C145422hm.m236342b(j.f393011w.f392931a, ffVar.f392944n);
            } catch (IllegalStateException e) {
                j.f393011w.mo120965ar().f392795c.mo120895b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m235894b(gVar, str);
    }

    public void getMaxUserProperties(String str, C145198g gVar) {
        m235893a();
        this.f392498a.mo120972j().mo121093K(str);
        m235893a();
        this.f392498a.mo120977o().mo121259P(gVar, 25);
    }

    public void getTestFlag(C145198g gVar, int i) {
        m235893a();
        if (i == 0) {
            C145495ke o = this.f392498a.mo120977o();
            C145416hg j = this.f392498a.mo120972j();
            AtomicReference atomicReference = new AtomicReference();
            o.mo121261R(gVar, (String) j.f393011w.mo120966as().mo120956a(atomicReference, 15000, "String test flag value", new C145405gw(j, atomicReference)));
        } else if (i == 1) {
            C145495ke o2 = this.f392498a.mo120977o();
            C145416hg j2 = this.f392498a.mo120972j();
            AtomicReference atomicReference2 = new AtomicReference();
            o2.mo121260Q(gVar, ((Long) j2.f393011w.mo120966as().mo120956a(atomicReference2, 15000, "long test flag value", new C145406gx(j2, atomicReference2))).longValue());
        } else if (i == 2) {
            C145495ke o3 = this.f392498a.mo120977o();
            C145416hg j3 = this.f392498a.mo120972j();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) j3.f393011w.mo120966as().mo120956a(atomicReference3, 15000, "double test flag value", new C145408gz(j3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(C33259r.f88929b, doubleValue);
            try {
                gVar.mo120689c(bundle);
            } catch (RemoteException e) {
                o3.f393011w.mo120965ar().f392798f.mo120895b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            C145495ke o4 = this.f392498a.mo120977o();
            C145416hg j4 = this.f392498a.mo120972j();
            AtomicReference atomicReference4 = new AtomicReference();
            o4.mo121259P(gVar, ((Integer) j4.f393011w.mo120966as().mo120956a(atomicReference4, 15000, "int test flag value", new C145407gy(j4, atomicReference4))).intValue());
        } else if (i == 4) {
            C145495ke o5 = this.f392498a.mo120977o();
            C145416hg j5 = this.f392498a.mo120972j();
            AtomicReference atomicReference5 = new AtomicReference();
            o5.mo121255L(gVar, ((Boolean) j5.f393011w.mo120966as().mo120956a(atomicReference5, 15000, "boolean test flag value", new C145402gt(j5, atomicReference5))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C145198g gVar) {
        m235893a();
        this.f392498a.mo120966as().mo120960h(new C145463j(this, gVar, str, str2, z));
    }

    public void initForTests(Map map) {
        m235893a();
    }

    public void initialize(C144165j jVar, InitializationParams initializationParams, long j) {
        C145361ff ffVar = this.f392498a;
        if (ffVar == null) {
            Context context = (Context) C144166k.m234388a(jVar);
            C143919bh.m233958a(context);
            this.f392498a = C145361ff.m236186i(context, initializationParams, Long.valueOf(j));
            return;
        }
        ffVar.mo120965ar().f392798f.mo120894a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(C145198g gVar) {
        m235893a();
        this.f392498a.mo120966as().mo120960h(new C145497m(this, gVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m235893a();
        this.f392498a.mo120972j().mo121100n(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C145198g gVar, long j) {
        m235893a();
        C143919bh.m233969l(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f392498a.mo120966as().mo120960h(new C145436i(this, gVar, new EventParcel(str2, new EventParams(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, C144165j jVar, C144165j jVar2, C144165j jVar3) {
        Object obj;
        Object obj2;
        m235893a();
        Object obj3 = null;
        if (jVar == null) {
            obj = null;
        } else {
            obj = C144166k.m234388a(jVar);
        }
        if (jVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C144166k.m234388a(jVar2);
        }
        if (jVar3 != null) {
            obj3 = C144166k.m234388a(jVar3);
        }
        this.f392498a.mo120965ar().mo120900h(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(C144165j jVar, Bundle bundle, long j) {
        m235893a();
        C145415hf hfVar = this.f392498a.mo120972j().f393141b;
        if (hfVar != null) {
            this.f392498a.mo120972j().mo121098l();
            hfVar.onActivityCreated((Activity) C144166k.m234388a(jVar), bundle);
        }
    }

    public void onActivityDestroyed(C144165j jVar, long j) {
        m235893a();
        C145415hf hfVar = this.f392498a.mo120972j().f393141b;
        if (hfVar != null) {
            this.f392498a.mo120972j().mo121098l();
            hfVar.onActivityDestroyed((Activity) C144166k.m234388a(jVar));
        }
    }

    public void onActivityPaused(C144165j jVar, long j) {
        m235893a();
        C145415hf hfVar = this.f392498a.mo120972j().f393141b;
        if (hfVar != null) {
            this.f392498a.mo120972j().mo121098l();
            hfVar.onActivityPaused((Activity) C144166k.m234388a(jVar));
        }
    }

    public void onActivityResumed(C144165j jVar, long j) {
        m235893a();
        C145415hf hfVar = this.f392498a.mo120972j().f393141b;
        if (hfVar != null) {
            this.f392498a.mo120972j().mo121098l();
            hfVar.onActivityResumed((Activity) C144166k.m234388a(jVar));
        }
    }

    public void onActivitySaveInstanceState(C144165j jVar, C145198g gVar, long j) {
        m235893a();
        C145415hf hfVar = this.f392498a.mo120972j().f393141b;
        Bundle bundle = new Bundle();
        if (hfVar != null) {
            this.f392498a.mo120972j().mo121098l();
            hfVar.onActivitySaveInstanceState((Activity) C144166k.m234388a(jVar), bundle);
        }
        try {
            gVar.mo120689c(bundle);
        } catch (RemoteException e) {
            this.f392498a.mo120965ar().f392798f.mo120895b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C144165j jVar, long j) {
        m235893a();
        if (this.f392498a.mo120972j().f393141b != null) {
            this.f392498a.mo120972j().mo121098l();
            Activity activity = (Activity) C144166k.m234388a(jVar);
        }
    }

    public void onActivityStopped(C144165j jVar, long j) {
        m235893a();
        if (this.f392498a.mo120972j().f393141b != null) {
            this.f392498a.mo120972j().mo121098l();
            Activity activity = (Activity) C144166k.m234388a(jVar);
        }
    }

    public void performAction(Bundle bundle, C145198g gVar, long j) {
        m235893a();
        gVar.mo120689c((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C145200i iVar) {
        C145499o oVar;
        m235893a();
        synchronized (this.f392499b) {
            oVar = (C145499o) this.f392499b.get(Integer.valueOf(iVar.mo120748e()));
            if (oVar == null) {
                oVar = new C145499o(this, iVar);
                this.f392499b.put(Integer.valueOf(iVar.mo120748e()), oVar);
            }
        }
        C145416hg j = this.f392498a.mo120972j();
        C145361ff ffVar = j.f393011w;
        j.mo120949a();
        if (!j.f393142c.add(oVar)) {
            j.f393011w.mo120965ar().f392798f.mo120894a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j) {
        m235893a();
        C145416hg j2 = this.f392498a.mo120972j();
        j2.f393143d.set((Object) null);
        j2.f393011w.mo120966as().mo120960h(new C145398gp(j2, j));
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        m235893a();
        if (bundle == null) {
            this.f392498a.mo120965ar().f392795c.mo120894a("Conditional user property must not be null");
        } else {
            this.f392498a.mo120972j().mo121108v(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) {
        m235893a();
        C145416hg j2 = this.f392498a.mo120972j();
        j2.f393011w.mo120966as().mo120961i(new C145390gh(j2, bundle, j));
    }

    public void setConsentThirdParty(Bundle bundle, long j) {
        m235893a();
        this.f392498a.mo120972j().mo121109w(bundle, -20, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r4.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (r5.length() <= 100) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(com.google.android.gms.p10793f.C144165j r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.m235893a()
            com.google.android.gms.measurement.internal.ff r6 = r2.f392498a
            com.google.android.gms.measurement.internal.hu r6 = r6.mo120974l()
            java.lang.Object r3 = com.google.android.gms.p10793f.C144166k.m234388a(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            com.google.android.gms.measurement.internal.ff r7 = r6.f393011w
            com.google.android.gms.measurement.internal.ab r7 = r7.f392937g
            boolean r7 = r7.mo120778o()
            if (r7 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.ff r3 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392800h
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.mo120894a(r4)
            return
        L_0x0027:
            com.google.android.gms.measurement.internal.hn r7 = r6.f393185b
            if (r7 != 0) goto L_0x0039
            com.google.android.gms.measurement.internal.ff r3 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392800h
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.mo120894a(r4)
            return
        L_0x0039:
            java.util.Map r0 = r6.f393188e
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x004f
            com.google.android.gms.measurement.internal.ff r3 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392800h
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.mo120894a(r4)
            return
        L_0x004f:
            if (r5 != 0) goto L_0x0059
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.mo121127n(r5)
        L_0x0059:
            java.lang.String r0 = r7.f393163b
            boolean r0 = p3186j$.util.Objects.equals(r0, r5)
            java.lang.String r7 = r7.f393162a
            boolean r7 = p3186j$.util.Objects.equals(r7, r4)
            if (r0 == 0) goto L_0x0078
            if (r7 != 0) goto L_0x006a
            goto L_0x0078
        L_0x006a:
            com.google.android.gms.measurement.internal.ff r3 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392800h
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.mo120894a(r4)
            return
        L_0x0078:
            r7 = 100
            if (r4 == 0) goto L_0x00a3
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x008d
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            int r0 = r4.length()
            if (r0 > r7) goto L_0x008d
            goto L_0x00a3
        L_0x008d:
            com.google.android.gms.measurement.internal.ff r3 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392800h
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.mo120895b(r5, r4)
            return
        L_0x00a3:
            if (r5 == 0) goto L_0x00cc
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00b6
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            int r0 = r5.length()
            if (r0 > r7) goto L_0x00b6
            goto L_0x00cc
        L_0x00b6:
            com.google.android.gms.measurement.internal.ff r3 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392800h
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.mo120895b(r5, r4)
            return
        L_0x00cc:
            com.google.android.gms.measurement.internal.ff r7 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r7 = r7.mo120965ar()
            com.google.android.gms.measurement.internal.dv r7 = r7.f392803k
            if (r4 != 0) goto L_0x00d9
            java.lang.String r0 = "null"
            goto L_0x00da
        L_0x00d9:
            r0 = r4
        L_0x00da:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.mo120896c(r1, r0, r5)
            com.google.android.gms.measurement.internal.hn r7 = new com.google.android.gms.measurement.internal.hn
            com.google.android.gms.measurement.internal.ff r0 = r6.f393011w
            com.google.android.gms.measurement.internal.ke r0 = r0.mo120977o()
            long r0 = r0.mo121285r()
            r7.<init>(r4, r5, r0)
            java.util.Map r4 = r6.f393188e
            r4.put(r3, r7)
            r4 = 1
            r6.mo121123j(r3, r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(com.google.android.gms.f.j, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z) {
        m235893a();
        C145416hg j = this.f392498a.mo120972j();
        j.mo120949a();
        C145361ff ffVar = j.f393011w;
        j.f393011w.mo120966as().mo120960h(new C145413hd(j, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        m235893a();
        C145416hg j = this.f392498a.mo120972j();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        j.f393011w.mo120966as().mo120960h(new C145391gi(j, bundle2));
    }

    public void setEventInterceptor(C145200i iVar) {
        m235893a();
        C145498n nVar = new C145498n(this, iVar);
        if (this.f392498a.mo120966as().mo120962j()) {
            this.f392498a.mo120972j().mo121089F(nVar);
        } else {
            this.f392498a.mo120966as().mo120960h(new C145490k(this, nVar));
        }
    }

    public void setInstanceIdProvider(C145202k kVar) {
        m235893a();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        m235893a();
        this.f392498a.mo120972j().mo121112z(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) {
        m235893a();
    }

    public void setSessionTimeoutDuration(long j) {
        m235893a();
        C145416hg j2 = this.f392498a.mo120972j();
        C145361ff ffVar = j2.f393011w;
        j2.f393011w.mo120966as().mo120960h(new C145395gm(j2, j));
    }

    public void setUserId(String str, long j) {
        m235893a();
        C145416hg j2 = this.f392498a.mo120972j();
        if (str == null || !TextUtils.isEmpty(str)) {
            j2.f393011w.mo120966as().mo120960h(new C145392gj(j2, str));
            j2.mo121086C((String) null, "_id", str, true, j);
            return;
        }
        j2.f393011w.mo120965ar().f392798f.mo120894a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, C144165j jVar, boolean z, long j) {
        m235893a();
        this.f392498a.mo120972j().mo121086C(str, str2, C144166k.m234388a(jVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C145200i iVar) {
        C145499o oVar;
        m235893a();
        synchronized (this.f392499b) {
            oVar = (C145499o) this.f392499b.remove(Integer.valueOf(iVar.mo120748e()));
        }
        if (oVar == null) {
            oVar = new C145499o(this, iVar);
        }
        C145416hg j = this.f392498a.mo120972j();
        C145361ff ffVar = j.f393011w;
        j.mo120949a();
        if (!j.f393142c.remove(oVar)) {
            j.f393011w.mo120965ar().f392798f.mo120894a("OnEventListener had not been registered");
        }
    }
}
