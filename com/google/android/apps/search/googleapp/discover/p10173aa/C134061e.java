package com.google.android.apps.search.googleapp.discover.p10173aa;

import android.net.ConnectivityManager;
import androidx.work.C4381ae;
import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.e */
/* compiled from: PG */
public final class C134061e {

    /* renamed from: a */
    public static final C59071e f365172a = C59071e.m91331h();

    /* renamed from: b */
    public final C60950i f365173b;

    /* renamed from: c */
    public final boolean f365174c;

    /* renamed from: d */
    public final boolean f365175d;

    /* renamed from: e */
    public final boolean f365176e;

    /* renamed from: f */
    public final boolean f365177f;

    /* renamed from: g */
    public final Duration f365178g;

    /* renamed from: h */
    public final Duration f365179h;

    /* renamed from: i */
    public final Duration f365180i;

    /* renamed from: j */
    public final Duration f365181j;

    /* renamed from: k */
    private final ConnectivityManager f365182k;

    /* renamed from: l */
    private final boolean f365183l;

    /* renamed from: m */
    private final long f365184m;

    /* renamed from: n */
    private final boolean f365185n;

    /* renamed from: o */
    private final boolean f365186o;

    /* renamed from: p */
    private final Duration f365187p;

    /* renamed from: q */
    private final Duration f365188q;

    public C134061e(C60950i iVar, ConnectivityManager connectivityManager, boolean z, long j, C62910ar arVar, C62910ar arVar2, C62910ar arVar3, C62910ar arVar4, C62910ar arVar5, C62910ar arVar6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C69664n.m101061g(iVar, "timeSource");
        this.f365173b = iVar;
        this.f365182k = connectivityManager;
        this.f365183l = z;
        this.f365184m = j;
        this.f365174c = z2;
        this.f365175d = z3;
        this.f365185n = z4;
        this.f365186o = z5;
        this.f365176e = z6;
        this.f365177f = z7;
        this.f365187p = C62949a.m95468c(arVar);
        this.f365178g = C62949a.m95468c(arVar2);
        this.f365179h = C62949a.m95468c(arVar3);
        this.f365180i = C62949a.m95468c(arVar4);
        this.f365181j = C62949a.m95468c(arVar5);
        this.f365188q = C62949a.m95468c(arVar6);
    }

    /* renamed from: a */
    public final C4381ae mo111544a() {
        if (this.f365182k.getRestrictBackgroundStatus() == 3) {
            return C4381ae.UNMETERED;
        }
        return C4381ae.CONNECTED;
    }

    /* renamed from: b */
    public final C134034b mo111545b(Instant instant, Duration duration) {
        C59052c cVar = (C59052c) f365172a.mo56224b();
        cVar.mo56379ah(new C59094n(40544));
        cVar.mo56354G("#scheduledConfig, timestampCreated %s, scheduledOffset %s", instant, duration);
        return new C134034b(mo111544a(), instant, mo111548e(duration), this.f365185n);
    }

    /* renamed from: c */
    public final C134060d mo111546c(Duration duration) {
        C59052c cVar = (C59052c) f365172a.mo56224b();
        cVar.mo56379ah(new C59094n(40550));
        cVar.mo56389s("#watchdogConfig, scheduledOffset %s", duration);
        C4381ae a = mo111544a();
        Instant a2 = this.f365173b.mo57444a();
        C69664n.m101060f(a2, "timeSource.now()");
        return new C134059c(a, a2, mo111548e(duration), this.f365186o);
    }

    /* renamed from: d */
    public final Duration mo111547d(C134591i iVar) {
        return iVar == C134591i.ELIGIBLE ? this.f365187p : this.f365178g;
    }

    /* renamed from: e */
    public final Duration mo111548e(Duration duration) {
        if (!this.f365183l) {
            return this.f365188q.compareTo(duration) > 0 ? this.f365188q : duration;
        }
        C59052c cVar = (C59052c) f365172a.mo56224b();
        cVar.mo56379ah(new C59094n(40551));
        cVar.mo56386p("#scheduledRefresh: Faster Refresh Requested.");
        Duration dividedBy = duration.dividedBy(this.f365184m);
        C69664n.m101060f(dividedBy, "duration.dividedBy(fasterRefreshSpeedupFactor)");
        return dividedBy;
    }
}
