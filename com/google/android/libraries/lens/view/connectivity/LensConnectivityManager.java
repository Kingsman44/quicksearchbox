package com.google.android.libraries.lens.view.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.core.content.C1882h;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.utils.C28137z;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.p5208h.C66554ak;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class LensConnectivityManager implements C2376g {

    /* renamed from: c */
    private static final C58974d f70004c = C58974d.m91135i("LensConnectivityManager");

    /* renamed from: a */
    public final Executor f70005a;

    /* renamed from: b */
    public ConnectivityManager.NetworkCallback f70006b;

    /* renamed from: d */
    private final Context f70007d;

    /* renamed from: e */
    private final List f70008e = new ArrayList();

    /* renamed from: f */
    private final C25758g f70009f = new C25758g(true);

    /* renamed from: g */
    private ConnectivityManager f70010g;

    public LensConnectivityManager(Context context, Executor executor) {
        this.f70007d = context;
        this.f70005a = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r1 = r0.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r2 >= r1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        ((com.google.android.libraries.lens.view.connectivity.C25749c) r0.get(r2)).mo30486a(r5);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m47538l(boolean r5) {
        /*
            r4 = this;
            com.google.android.libraries.p1623at.p1632e.C19559g.m37304c()
            monitor-enter(r4)
            com.google.android.libraries.lens.view.d.g r0 = r4.f70009f     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.mo3842a()     // Catch:{ all -> 0x0055 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0055 }
            if (r0 != r5) goto L_0x0014
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x0014:
            com.google.android.libraries.lens.view.d.g r0 = r4.f70009f     // Catch:{ all -> 0x0055 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0055 }
            r0.mo5708l(r1)     // Catch:{ all -> 0x0055 }
            if (r5 != 0) goto L_0x003a
            com.google.common.f.a.d r0 = f70004c     // Catch:{ all -> 0x0055 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0055 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0055 }
            com.google.common.f.ad r1 = com.google.common.p4526f.C58979ad.FULL     // Catch:{ all -> 0x0055 }
            r0.mo56380ai(r1)     // Catch:{ all -> 0x0055 }
            r1 = 49288(0xc088, float:6.9067E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0055 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "Network disconnected"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0055 }
        L_0x003a:
            java.util.List r0 = r4.f70008e     // Catch:{ all -> 0x0055 }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r0)     // Catch:{ all -> 0x0055 }
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            int r1 = r0.size()
            r2 = 0
        L_0x0046:
            if (r2 >= r1) goto L_0x0054
            java.lang.Object r3 = r0.get(r2)
            com.google.android.libraries.lens.view.connectivity.c r3 = (com.google.android.libraries.lens.view.connectivity.C25749c) r3
            r3.mo30486a(r5)
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0054:
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0058:
            throw r5
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.connectivity.LensConnectivityManager.m47538l(boolean):void");
    }

    /* renamed from: m */
    private final boolean m47539m() {
        return C1882h.m5137c(this.f70007d, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    /* renamed from: g */
    public final synchronized C25752a mo30903g() {
        return this.f70009f;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        if (m47539m()) {
            if (this.f70010g == null) {
                Object systemService = this.f70007d.getSystemService("connectivity");
                systemService.getClass();
                this.f70010g = (ConnectivityManager) systemService;
            }
            this.f70006b = new C25748b(this);
            ConnectivityManager connectivityManager = this.f70010g;
            NetworkRequest build = new NetworkRequest.Builder().build();
            ConnectivityManager.NetworkCallback networkCallback = this.f70006b;
            networkCallback.getClass();
            connectivityManager.registerNetworkCallback(build, networkCallback);
            mo30906j();
        }
    }

    /* renamed from: h */
    public final void mo30904h(C25749c cVar, boolean z) {
        boolean k;
        synchronized (this) {
            this.f70008e.add(cVar);
            k = mo30907k();
        }
        if (z) {
            cVar.mo30486a(k);
        }
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        ConnectivityManager.NetworkCallback networkCallback;
        ConnectivityManager connectivityManager = this.f70010g;
        if (connectivityManager != null && (networkCallback = this.f70006b) != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
            this.f70006b = null;
        }
    }

    /* renamed from: i */
    public final synchronized void mo30905i(C25749c cVar) {
        this.f70008e.remove(cVar);
    }

    /* renamed from: j */
    public final void mo30906j() {
        boolean z = true;
        if (!m47539m()) {
            m47538l(true);
            return;
        }
        C66554ak c = C28137z.m52437c(this.f70010g.getActiveNetworkInfo());
        if (c.equals(C66554ak.NO_CONNECTION) || c.equals(C66554ak.UNKNOWN_CONNECTION_TYPE)) {
            z = false;
        }
        m47538l(z);
    }

    /* renamed from: k */
    public final synchronized boolean mo30907k() {
        return ((Boolean) this.f70009f.mo3842a()).booleanValue();
    }
}
