package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.net.Network;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.gsa.c.a.a.a */
/* compiled from: PG */
final class C22157a extends C22195t {

    /* renamed from: a */
    public C89062r f61135a;

    /* renamed from: b */
    public C22199x f61136b;

    /* renamed from: c */
    public Network f61137c;

    /* renamed from: d */
    public Boolean f61138d;

    /* renamed from: e */
    public Integer f61139e;

    /* renamed from: f */
    public Boolean f61140f;

    /* renamed from: g */
    public C58495hd f61141g;

    /* renamed from: h */
    private boolean f61142h;

    /* renamed from: i */
    private boolean f61143i;

    /* renamed from: j */
    private boolean f61144j;

    /* renamed from: k */
    private boolean f61145k;

    /* renamed from: l */
    private long f61146l;

    /* renamed from: m */
    private byte f61147m;

    /* renamed from: a */
    public final C22196u mo27370a() {
        if (this.f61147m == 31 && this.f61135a != null && this.f61136b != null && this.f61141g != null) {
            return new C22177b(this.f61135a, this.f61136b, this.f61137c, this.f61142h, this.f61143i, this.f61144j, this.f61145k, this.f61138d, this.f61139e, this.f61140f, this.f61141g, this.f61146l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f61135a == null) {
            sb.append(" connectivityInfo");
        }
        if (this.f61136b == null) {
            sb.append(" networkId");
        }
        if ((this.f61147m & 1) == 0) {
            sb.append(" wifiEnabled");
        }
        if ((this.f61147m & 2) == 0) {
            sb.append(" cellDataEnabled");
        }
        if ((this.f61147m & 4) == 0) {
            sb.append(" dataRoamingEnabled");
        }
        if ((this.f61147m & 8) == 0) {
            sb.append(" airplaneModeEnabled");
        }
        if (this.f61141g == null) {
            sb.append(" maxNetworkStates");
        }
        if ((this.f61147m & 16) == 0) {
            sb.append(" lastConnectivityInfoChangeTimeMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo27371b(boolean z) {
        this.f61145k = z;
        this.f61147m = (byte) (this.f61147m | 8);
    }

    /* renamed from: c */
    public final void mo27372c(boolean z) {
        this.f61143i = z;
        this.f61147m = (byte) (this.f61147m | 2);
    }

    /* renamed from: d */
    public final void mo27373d(boolean z) {
        this.f61144j = z;
        this.f61147m = (byte) (this.f61147m | 4);
    }

    /* renamed from: e */
    public final void mo27374e(long j) {
        this.f61146l = j;
        this.f61147m = (byte) (this.f61147m | 16);
    }

    /* renamed from: f */
    public final void mo27375f(boolean z) {
        this.f61142h = z;
        this.f61147m = (byte) (this.f61147m | 1);
    }
}
