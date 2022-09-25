package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7006ax.C89324c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.am */
/* compiled from: PG */
public final /* synthetic */ class C108551am implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C108556ar f301984a;

    /* renamed from: b */
    public final /* synthetic */ C89324c f301985b;

    /* renamed from: c */
    public final /* synthetic */ int f301986c;

    public /* synthetic */ C108551am(C108556ar arVar, C89324c cVar, int i) {
        this.f301984a = arVar;
        this.f301985b = cVar;
        this.f301986c = i;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C108556ar arVar = this.f301984a;
        C89324c cVar = this.f301985b;
        int i = this.f301986c;
        C89949q.m146525j(C108607cg.m180627a(2), (C60321oe) null, (C63196b) null, (String) null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        arVar.f301999g.set(countDownLatch);
        try {
            countDownLatch.await((long) i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            C59104x b = C108556ar.f301993a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceDiscoveryCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(24126)).mo56386p("User interrupted mDNS discovery (stopDiscovery() is called).");
        }
        C58495hd l = C58495hd.m89898l(cVar.f242165a);
        C22871g gVar = arVar.f301996d;
        Objects.requireNonNull(cVar);
        gVar.mo28212l("Stop Scan", new C108554ap(cVar));
        arVar.f301999g.set((Object) null);
        return l == null ? C58485gu.m89845m() : l.values();
    }
}
