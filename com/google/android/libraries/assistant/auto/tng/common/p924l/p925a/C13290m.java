package com.google.android.libraries.assistant.auto.tng.common.p924l.p925a;

import android.location.Location;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.l.a.m */
/* compiled from: PG */
final class C13290m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f40982a;

    /* renamed from: b */
    final /* synthetic */ C13291n f40983b;

    public C13290m(C13291n nVar, C58872ci ciVar) {
        this.f40983b = nVar;
        this.f40982a = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f40982a.mo56162g();
        ((C59052c) ((C59052c) ((C59052c) C13291n.f40984a.mo56226d()).mo56382g(th)).mo56372aa(44728)).mo56388r("LocationLatencyTracking -- Failed to get location in %s ms.", Duration.ofNanos(this.f40982a.mo56159b()).toMillis());
        if (th.getClass() == TimeoutException.class) {
            this.f40983b.f40987d.mo41696k("TIMEOUT");
        } else {
            this.f40983b.f40987d.mo41696k("FETCH_ERROR");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        this.f40982a.mo56162g();
        long millis = Duration.ofNanos(this.f40982a.mo56159b()).toMillis();
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C13291n.f40984a.mo56226d()).mo56372aa(44730)).mo56388r("LocationLatencyTracking -- Got null location in %s ms.", millis);
            this.f40983b.f40987d.mo41696k("NULL_LOCATION");
            return;
        }
        Location location = (Location) axVar.mo56107c();
        long c = this.f40983b.f40986c.mo26871c();
        long millis2 = Duration.ofNanos(location.getElapsedRealtimeNanos()).toMillis();
        float accuracy = location.getAccuracy();
        Float valueOf = Float.valueOf(location.getAccuracy());
        Long valueOf2 = Long.valueOf(c - millis2);
        ((C59052c) ((C59052c) C13291n.f40984a.mo56224b()).mo56372aa(44729)).mo56359L("LocationLatencyTracking -- Location with accuracy %s, age %s ms, took %s ms.", valueOf, valueOf2, Long.valueOf(millis));
        C13291n nVar = this.f40983b;
        C58833ax k = C58833ax.m90834k(valueOf2);
        C58833ax k2 = C58833ax.m90834k(Float.valueOf(accuracy));
        ((C19569f) nVar.f40987d.f103054z.mo6453a()).mo24824b((double) millis, new Object[0]);
        ((C19569f) nVar.f40987d.f103053y.mo6453a()).mo24824b((double) ((Long) ((C58847bk) k).f156646a).longValue(), new Object[0]);
        ((C19569f) nVar.f40987d.f103052x.mo6453a()).mo24824b((double) ((Float) ((C58847bk) k2).f156646a).floatValue(), new Object[0]);
        this.f40983b.f40987d.mo41696k("SUCCESS");
    }
}
