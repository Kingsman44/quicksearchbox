package com.google.android.libraries.lens.view.utils;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.p5208h.C66554ak;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.lens.view.utils.z */
/* compiled from: PG */
public final class C28137z {

    /* renamed from: a */
    private static final C58974d f76549a = C58974d.m91135i("LensNetworkUtils");

    /* renamed from: b */
    private static final C58495hd f76550b = C58495hd.m89903q(1, C66554ak.WIFI, 6, C66554ak.WIMAX, 7, C66554ak.BLUETOOTH, 9, C66554ak.ETHERNET);

    /* renamed from: c */
    private static final C58495hd f76551c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(7, C66554ak.RTT);
        gzVar.mo55429h(4, C66554ak.CDMA);
        gzVar.mo55429h(2, C66554ak.EDGE);
        gzVar.mo55429h(14, C66554ak.EHRPD);
        gzVar.mo55429h(5, C66554ak.EVDO_0);
        gzVar.mo55429h(6, C66554ak.EVDO_A);
        gzVar.mo55429h(12, C66554ak.EVDO_B);
        gzVar.mo55429h(1, C66554ak.GPRS);
        gzVar.mo55429h(8, C66554ak.HSDPA);
        gzVar.mo55429h(10, C66554ak.HSPA);
        gzVar.mo55429h(15, C66554ak.HSPAP);
        gzVar.mo55429h(9, C66554ak.HSUPA);
        gzVar.mo55429h(11, C66554ak.IDEN);
        gzVar.mo55429h(13, C66554ak.LTE);
        gzVar.mo55429h(3, C66554ak.UMTS);
        gzVar.mo55429h(20, C66554ak.NR);
        f76551c = gzVar.mo55427f(false);
        C58528ij.m90013M(Integer.valueOf(Status.Code.UNKNOWN.value()), Integer.valueOf(Status.Code.DEADLINE_EXCEEDED.value()), Integer.valueOf(Status.Code.ABORTED.value()), Integer.valueOf(Status.Code.UNAVAILABLE.value()));
    }

    /* renamed from: a */
    public static TelephonyManager m52435a(Context context) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return (TelephonyManager) context.getSystemService("phone");
        }
        return (TelephonyManager) C39239a.m68666a(context, C39226b.TAG_CLASSIC_LENS).getSystemService("phone");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4552o.aac m52436b(android.content.Context r10, boolean r11) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r10.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = "Could not get ConnectivityManager."
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            r4 = 0
            if (r1 != 0) goto L_0x001d
            com.google.common.f.a.d r1 = f76549a
            com.google.common.f.x r1 = r1.mo56225c()
            r5 = 50269(0xc45d, float:7.0442E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r5)).mo56386p(r2)
        L_0x001b:
            r1 = r4
            goto L_0x0028
        L_0x001d:
            boolean r5 = m52439e(r10, r3)
            if (r5 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
        L_0x0028:
            com.google.speech.h.ak r1 = m52437c(r1)
            int r1 = r1.f181028z
            r5 = 1
            if (r11 == 0) goto L_0x023c
            com.google.common.o.aac r11 = com.google.common.p4552o.aac.f158079h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.zv r11 = (com.google.common.p4552o.C60706zv) r11
            android.content.Context r6 = r10.getApplicationContext()
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r7 = "airplane_mode_on"
            r8 = 0
            int r6 = android.provider.Settings.Global.getInt(r6, r7, r8)
            if (r6 == 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.common.o.aac r7 = (com.google.common.p4552o.aac) r7
            int r9 = r7.f158081a
            r9 = r9 | 2
            r7.f158081a = r9
            r7.f158083c = r6
            r11.copyOnWrite()
            com.google.protobuf.bv r6 = r11.instance
            com.google.common.o.aac r6 = (com.google.common.p4552o.aac) r6
            int r7 = r6.f158081a
            r7 = r7 | r5
            r6.f158081a = r7
            r6.f158082b = r1
            com.google.common.o.zu r1 = com.google.common.p4552o.C60705zu.f164708d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.zt r1 = (com.google.common.p4552o.C60704zt) r1
            java.lang.Object r0 = r10.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 != 0) goto L_0x008e
            com.google.common.f.a.d r0 = f76549a
            com.google.common.f.x r0 = r0.mo56225c()
            r3 = 50270(0xc45e, float:7.0443E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.zu r0 = (com.google.common.p4552o.C60705zu) r0
            goto L_0x0103
        L_0x008e:
            boolean r2 = m52439e(r10, r3)
            if (r2 != 0) goto L_0x009b
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.zu r0 = (com.google.common.p4552o.C60705zu) r0
            goto L_0x0103
        L_0x009b:
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()
            if (r2 != 0) goto L_0x00a3
        L_0x00a1:
            r2 = r4
            goto L_0x00c2
        L_0x00a3:
            android.net.Network[] r3 = r0.getAllNetworks()
        L_0x00a7:
            int r6 = r3.length
            if (r8 >= r6) goto L_0x00a1
            r6 = r3[r8]
            android.net.NetworkInfo r6 = r0.getNetworkInfo(r6)
            if (r6 == 0) goto L_0x00bf
            int r6 = r6.getType()
            int r7 = r2.getType()
            if (r6 != r7) goto L_0x00bf
            r2 = r3[r8]
            goto L_0x00c2
        L_0x00bf:
            int r8 = r8 + 1
            goto L_0x00a7
        L_0x00c2:
            if (r2 != 0) goto L_0x00cb
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.zu r0 = (com.google.common.p4552o.C60705zu) r0
            goto L_0x0103
        L_0x00cb:
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r2)
            if (r0 != 0) goto L_0x00d8
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.zu r0 = (com.google.common.p4552o.C60705zu) r0
            goto L_0x0103
        L_0x00d8:
            int r2 = r0.getLinkUpstreamBandwidthKbps()
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.common.o.zu r3 = (com.google.common.p4552o.C60705zu) r3
            int r6 = r3.f164710a
            r6 = r6 | r5
            r3.f164710a = r6
            r3.f164711b = r2
            int r0 = r0.getLinkDownstreamBandwidthKbps()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.zu r2 = (com.google.common.p4552o.C60705zu) r2
            int r3 = r2.f164710a
            r3 = r3 | 2
            r2.f164710a = r3
            r2.f164712c = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.zu r0 = (com.google.common.p4552o.C60705zu) r0
        L_0x0103:
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.common.o.aac r1 = (com.google.common.p4552o.aac) r1
            r0.getClass()
            r1.f158084d = r0
            int r0 = r1.f158081a
            r0 = r0 | 4
            r1.f158081a = r0
            com.google.common.o.zz r0 = com.google.common.p4552o.C60710zz.f164718e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.zy r0 = (com.google.common.p4552o.C60709zy) r0
            android.telephony.TelephonyManager r1 = m52435a(r10)
            if (r1 != 0) goto L_0x0139
            com.google.common.f.a.d r1 = f76549a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Could not get TelephonyManager."
            r3 = 50271(0xc45f, float:7.0445E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.zz r0 = (com.google.common.p4552o.C60710zz) r0
            goto L_0x01bf
        L_0x0139:
            int r2 = r1.getDataState()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.zz r3 = (com.google.common.p4552o.C60710zz) r3
            int r6 = r3.f164720a
            r6 = r6 | r5
            r3.f164720a = r6
            r3.f164721b = r2
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r2 = m52439e(r10, r2)
            if (r2 == 0) goto L_0x016c
            java.lang.Integer r2 = m52438d(r1)
            if (r2 == 0) goto L_0x016c
            int r2 = r2.intValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.zz r3 = (com.google.common.p4552o.C60710zz) r3
            int r6 = r3.f164720a
            r6 = r6 | 2
            r3.f164720a = r6
            r3.f164722c = r2
        L_0x016c:
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = m52439e(r10, r2)
            if (r2 == 0) goto L_0x01b9
            android.telephony.SignalStrength r1 = r1.getSignalStrength()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x019b
            java.util.List r1 = r1.getCellSignalStrengths()
            java.util.Iterator r1 = r1.iterator()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0186:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x019d
            java.lang.Object r6 = r1.next()
            android.telephony.CellSignalStrength r6 = (android.telephony.CellSignalStrength) r6
            int r6 = r6.getDbm()
            int r3 = java.lang.Math.max(r3, r6)
            goto L_0x0186
        L_0x019b:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x019d:
            if (r3 != r2) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L_0x01a4:
            if (r4 == 0) goto L_0x01b9
            int r1 = r4.intValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.zz r2 = (com.google.common.p4552o.C60710zz) r2
            int r3 = r2.f164720a
            r3 = r3 | 4
            r2.f164720a = r3
            r2.f164723d = r1
        L_0x01b9:
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.zz r0 = (com.google.common.p4552o.C60710zz) r0
        L_0x01bf:
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.common.o.aac r1 = (com.google.common.p4552o.aac) r1
            r0.getClass()
            r1.f158085e = r0
            int r0 = r1.f158081a
            r0 = r0 | 8
            r1.f158081a = r0
            com.google.common.o.aab r0 = com.google.common.p4552o.aab.f158075c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.aaa r0 = (com.google.common.p4552o.aaa) r0
            android.content.Context r1 = r10.getApplicationContext()
            java.lang.String r2 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            if (r1 != 0) goto L_0x01fc
            com.google.common.f.a.d r10 = f76549a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r1 = "Could not get WifiManager."
            r2 = 50272(0xc460, float:7.0446E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r2)).mo56386p(r1)
            com.google.protobuf.bv r10 = r0.build()
            com.google.common.o.aab r10 = (com.google.common.p4552o.aab) r10
            goto L_0x0223
        L_0x01fc:
            java.lang.String r2 = "android.permission.ACCESS_WIFI_STATE"
            boolean r10 = m52439e(r10, r2)
            if (r10 != 0) goto L_0x020b
            com.google.protobuf.bv r10 = r0.build()
            com.google.common.o.aab r10 = (com.google.common.p4552o.aab) r10
            goto L_0x0223
        L_0x020b:
            int r10 = r1.getWifiState()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.aab r1 = (com.google.common.p4552o.aab) r1
            int r2 = r1.f158077a
            r2 = r2 | r5
            r1.f158077a = r2
            r1.f158078b = r10
            com.google.protobuf.bv r10 = r0.build()
            com.google.common.o.aab r10 = (com.google.common.p4552o.aab) r10
        L_0x0223:
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.common.o.aac r0 = (com.google.common.p4552o.aac) r0
            r10.getClass()
            r0.f158086f = r10
            int r10 = r0.f158081a
            r10 = r10 | 16
            r0.f158081a = r10
            com.google.protobuf.bv r10 = r11.build()
            com.google.common.o.aac r10 = (com.google.common.p4552o.aac) r10
            return r10
        L_0x023c:
            com.google.common.o.aac r10 = com.google.common.p4552o.aac.f158079h
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.common.o.zv r10 = (com.google.common.p4552o.C60706zv) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.common.o.aac r11 = (com.google.common.p4552o.aac) r11
            int r0 = r11.f158081a
            r0 = r0 | r5
            r11.f158081a = r0
            r11.f158082b = r1
            com.google.protobuf.bv r10 = r10.build()
            com.google.common.o.aac r10 = (com.google.common.p4552o.aac) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.utils.C28137z.m52436b(android.content.Context, boolean):com.google.common.o.aac");
    }

    /* renamed from: c */
    public static C66554ak m52437c(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C66554ak.UNKNOWN_CONNECTION_TYPE;
        }
        if (!networkInfo.isConnected()) {
            return C66554ak.NO_CONNECTION;
        }
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        C58495hd hdVar = f76550b;
        Integer valueOf = Integer.valueOf(type);
        if (hdVar.containsKey(valueOf)) {
            C66554ak akVar = (C66554ak) hdVar.get(valueOf);
            akVar.getClass();
            return akVar;
        } else if (type == 0) {
            return (C66554ak) f76551c.getOrDefault(Integer.valueOf(subtype), C66554ak.UNKNOWN_CELLULAR);
        } else {
            return C66554ak.UNKNOWN_CONNECTION_TYPE;
        }
    }

    /* renamed from: d */
    public static Integer m52438d(TelephonyManager telephonyManager) {
        int i;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                i = telephonyManager.getDataNetworkType();
            } else {
                i = telephonyManager.getNetworkType();
            }
            return Integer.valueOf(i);
        } catch (NullPointerException e) {
            ((C58970a) ((C58970a) ((C58970a) f76549a.mo56225c()).mo56382g(e)).mo56372aa(50273)).mo56386p("Can't get mobile network data.");
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m52439e(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        ((C58970a) ((C58970a) f76549a.mo56226d()).mo56372aa(50274)).mo56389s("Missing permissions %s", str);
        return false;
    }
}
