package com.google.android.apps.gsa.shared.p7045k.p7047b;

import android.net.TrafficStats;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.io.IOException;
import java.net.URL;

/* renamed from: com.google.android.apps.gsa.shared.k.b.e */
/* compiled from: PG */
public final /* synthetic */ class C89802e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C89806i f243076a;

    /* renamed from: b */
    public final /* synthetic */ URL f243077b;

    /* renamed from: c */
    public final /* synthetic */ boolean f243078c;

    /* renamed from: d */
    public final /* synthetic */ C89800c f243079d;

    /* renamed from: e */
    public final /* synthetic */ int f243080e;

    public /* synthetic */ C89802e(C89806i iVar, URL url, boolean z, C89800c cVar, int i) {
        this.f243076a = iVar;
        this.f243077b = url;
        this.f243078c = z;
        this.f243079d = cVar;
        this.f243080e = i;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C89806i iVar = this.f243076a;
        URL url = this.f243077b;
        boolean z = this.f243078c;
        C89800c cVar = this.f243079d;
        try {
            TrafficStats.setThreadStatsTag(this.f243080e);
            if (z) {
                iVar.mo83662a(url, cVar, false);
            } else {
                iVar.mo83662a(url, (C89800c) null, true);
            }
            if (iVar.f243088a != 200) {
                return C60856cj.m92899h(C89805h.m146195b("Error getting response"));
            }
            C89800c cVar2 = iVar.f243090c;
            if (cVar2 == null) {
                return C60856cj.m92899h(C89805h.m146195b("Invalid response"));
            }
            byte[] bArr = cVar2.f243073b;
            if (bArr == null) {
                return C60856cj.m92899h(C89805h.m146195b("Invalid response"));
            }
            return C60856cj.m92900i(bArr);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C89805h.f243084a.mo56225c()).mo56382g(e)).mo56372aa(10566)).mo56386p("Request failed");
            Object[] objArr = new Object[1];
            objArr[0] = true != z ? "GET" : "POST";
            return C60856cj.m92899h(C89805h.m146195b(String.format("Fail to perform %s request", objArr)));
        }
    }
}
