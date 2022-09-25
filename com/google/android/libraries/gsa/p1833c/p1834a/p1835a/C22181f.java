package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.gsa.c.a.a.f */
/* compiled from: PG */
public final class C22181f {

    /* renamed from: a */
    public static final C59071e f61228a = C59071e.m91332i("com.google.android.libraries.gsa.c.a.a.f");

    /* renamed from: b */
    public final C21370a f61229b;

    /* renamed from: c */
    public final C22871g f61230c;

    /* renamed from: d */
    public final ConnectivityManager f61231d;

    /* renamed from: e */
    public final C22170am f61232e;

    /* renamed from: f */
    public long f61233f = 0;

    /* renamed from: g */
    private ConnectivityManager.NetworkCallback f61234g = null;

    public C22181f(C21370a aVar, C22871g gVar, ConnectivityManager connectivityManager, C22170am amVar) {
        this.f61229b = aVar;
        this.f61230c = gVar;
        this.f61231d = connectivityManager;
        this.f61232e = amVar;
    }

    /* renamed from: a */
    public final synchronized void mo27424a() {
        if (this.f61234g != null) {
            this.f61233f = this.f61229b.mo26871c() + 40000;
            return;
        }
        this.f61234g = new C22180e();
        try {
            this.f61231d.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), this.f61234g);
            this.f61230c.mo28213m("UnrequestCellRadio", 40000, new C22179d(this));
        } catch (SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f61228a.mo56225c()).mo56382g(e)).mo56372aa(48518)).mo56386p("SecurityException during requestNetwork()");
            this.f61234g = null;
        } catch (RuntimeException e2) {
            ((C59052c) ((C59052c) ((C59052c) f61228a.mo56226d()).mo56382g(e2)).mo56372aa(48519)).mo56386p("Unexpected exception");
            int i = C90755l.f253831a;
            this.f61234g = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo27425b() {
        try {
            this.f61231d.unregisterNetworkCallback(this.f61234g);
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f61228a.mo56225c()).mo56382g(e)).mo56372aa(48522)).mo56386p("IllegalArgumentException during unregisterNetworkCallback()");
        } catch (RuntimeException e2) {
            ((C59052c) ((C59052c) ((C59052c) f61228a.mo56226d()).mo56382g(e2)).mo56372aa(48523)).mo56386p("Unexpected exception");
            int i = C90755l.f253831a;
        }
        this.f61234g = null;
    }
}
