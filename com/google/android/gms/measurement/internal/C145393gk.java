package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.p10725a.p10730b.C142676c;
import com.google.android.gms.p10725a.p10730b.C142677d;
import java.net.URL;

/* renamed from: com.google.android.gms.measurement.internal.gk */
/* compiled from: PG */
public final /* synthetic */ class C145393gk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145416hg f393072a;

    public /* synthetic */ C145393gk(C145416hg hgVar) {
        this.f393072a = hgVar;
    }

    public final void run() {
        Pair pair;
        C145416hg hgVar = this.f393072a;
        hgVar.mo120904g();
        C145334ef efVar = hgVar.f393011w.mo120971g().f392864q;
        efVar.mo120911a();
        if (!efVar.f392825a) {
            C145336eh ehVar = hgVar.f393011w.mo120971g().f392865r;
            ehVar.mo120915a();
            long j = ehVar.f392834a;
            hgVar.f393011w.mo120971g().f392865r.mo120916b(1 + j);
            C145361ff ffVar = hgVar.f393011w;
            C145222ab abVar = ffVar.f392937g;
            if (j >= 5) {
                ffVar.mo120965ar().f392798f.mo120894a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                hgVar.f393011w.mo120971g().f392864q.mo120912b(true);
                return;
            }
            C145361ff ffVar2 = hgVar.f393011w;
            ffVar2.mo120966as().mo120904g();
            C145361ff.m236187t(ffVar2.mo120973k());
            String e = ffVar2.mo120969d().mo120874e();
            C145339ek g = ffVar2.mo120971g();
            g.mo120904g();
            C144006f fVar = g.f393011w.f392924A;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = g.f392854g;
            if (str == null || elapsedRealtime >= g.f392856i) {
                g.f392856i = elapsedRealtime + g.f393011w.f392937g.mo120771h(e, C145313dl.f392736b);
                try {
                    C142676c b = C142677d.m231497b(g.f393011w.f392931a);
                    g.f392854g = BuildConfig.FLAVOR;
                    String str2 = b.f387158a;
                    if (str2 != null) {
                        g.f392854g = str2;
                    }
                    g.f392855h = b.f387159b;
                } catch (Exception e2) {
                    g.f393011w.mo120965ar().f392802j.mo120895b("Unable to get advertising id", e2);
                    g.f392854g = BuildConfig.FLAVOR;
                }
                pair = new Pair(g.f392854g, Boolean.valueOf(g.f392855h));
            } else {
                pair = new Pair(str, Boolean.valueOf(g.f392855h));
            }
            if (!ffVar2.f392937g.mo120775l() || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                ffVar2.mo120965ar().f392802j.mo120894a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                return;
            }
            C145420hk k = ffVar2.mo120973k();
            k.mo121002k();
            ConnectivityManager connectivityManager = (ConnectivityManager) k.f393011w.f392931a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                ffVar2.mo120965ar().f392798f.mo120894a("Network is not available for Deferred Deep Link request. Skipping");
                return;
            }
            C145495ke o = ffVar2.mo120977o();
            ffVar2.mo120969d().f393011w.f392937g.mo120770f();
            C145336eh ehVar2 = ffVar2.mo120971g().f392865r;
            ehVar2.mo120915a();
            URL A = o.mo121248A(74009, e, (String) pair.first, ehVar2.f392834a - 1);
            if (A != null) {
                C145420hk k2 = ffVar2.mo120973k();
                C145359fd fdVar = new C145359fd(ffVar2);
                k2.mo120904g();
                k2.mo121002k();
                k2.f393011w.mo120966as().mo120959f(new C145419hj(k2, e, A, fdVar));
                return;
            }
            return;
        }
        hgVar.f393011w.mo120965ar().f392802j.mo120894a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
