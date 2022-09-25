package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.p9522a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a.b */
/* compiled from: PG */
public final class C126940b implements C126939a {
    @Deprecated

    /* renamed from: a */
    public static final C58528ij f349477a;
    @Deprecated

    /* renamed from: f */
    private static final C59071e f349478f = C59071e.m91331h();
    @Deprecated

    /* renamed from: g */
    private static final C58528ij f349479g;

    /* renamed from: b */
    public final Context f349480b;

    /* renamed from: c */
    public final ConnectivityManager f349481c;

    /* renamed from: d */
    public final WifiManager f349482d;

    /* renamed from: e */
    public final TelephonyManager f349483e;

    /* renamed from: h */
    private final long f349484h;

    /* renamed from: i */
    private final long f349485i;

    static {
        C58528ij K = C58528ij.m90011K(2, 3);
        C69664n.m101060f(K, "of(SIM_STATE_PIN_REQUIRED, SIM_STATE_PUK_REQUIRED)");
        f349477a = K;
        C58528ij L = C58528ij.m90012L(21, 16, 12);
        C69664n.m101060f(L, "{\n        ImmutableSet.o…NTERNET\n        )\n      }");
        f349479g = L;
    }

    public C126940b(long j, Context context) {
        C69664n.m101061g(context, "context");
        this.f349484h = j;
        this.f349480b = context;
        this.f349481c = (ConnectivityManager) context.getSystemService("connectivity");
        this.f349482d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f349483e = (TelephonyManager) context.getSystemService("phone");
        this.f349485i = j * 8;
    }

    /* renamed from: a */
    public final int mo107861a() {
        TelephonyManager telephonyManager = this.f349483e;
        if (telephonyManager != null) {
            return telephonyManager.getSimState();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo107862b() {
        Integer num;
        Object obj;
        ConnectivityManager connectivityManager = this.f349481c;
        if (connectivityManager == null) {
            return 1;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return 2;
        }
        NetworkCapabilities networkCapabilities = this.f349481c.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return 3;
        }
        Iterator it = f349479g.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num2 = (Integer) obj;
            C69664n.m101060f(num2, "it");
            if (!networkCapabilities.hasCapability(num2.intValue())) {
                break;
            }
        }
        Integer num3 = (Integer) obj;
        if (num3 != null) {
            num3.intValue();
            num3.intValue();
            num = num3;
        }
        if (num == null) {
            long j = this.f349485i;
            if (networkCapabilities.getLinkDownstreamBandwidthKbps() == 0 || networkCapabilities.getLinkUpstreamBandwidthKbps() == 0) {
                C59052c cVar = (C59052c) f349478f.mo56226d();
                cVar.mo56379ah(new C59094n(37339));
                cVar.mo56386p("Bandwidth could not be determined");
                return 4;
            }
            networkCapabilities.getLinkUpstreamBandwidthKbps();
            networkCapabilities.getLinkDownstreamBandwidthKbps();
            if (((long) networkCapabilities.getLinkUpstreamBandwidthKbps()) < j || ((long) networkCapabilities.getLinkDownstreamBandwidthKbps()) < j) {
                return 3;
            }
            return 4;
        }
        return 3;
    }
}
