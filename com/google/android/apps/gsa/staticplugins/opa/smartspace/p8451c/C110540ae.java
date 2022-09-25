package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83765h;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.ae */
/* compiled from: PG */
final class C110540ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f308168a;

    /* renamed from: b */
    final /* synthetic */ long f308169b;

    /* renamed from: c */
    final /* synthetic */ long f308170c;

    /* renamed from: d */
    final /* synthetic */ C110541af f308171d;

    public C110540ae(C110541af afVar, long j, long j2, long j3) {
        this.f308171d = afVar;
        this.f308168a = j;
        this.f308169b = j2;
        this.f308170c = j3;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f308171d.f308172a.mo56226d()).mo56372aa(26573)).mo56386p("Failed to get current displayed calendar events, and skipped the display latency logging.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        long j;
        if (!((List) Collection.EL.stream(((C83765h) obj).f228312a).map(C110539ad.f308167a).collect(Collectors.toList())).contains(Long.valueOf(this.f308168a))) {
            if (this.f308171d.f308174c.mo77176n()) {
                j = Duration.ofMinutes(this.f308171d.f308174c.mo77166b()).getSeconds();
            } else {
                j = C131179d.f358772h;
            }
            long j2 = this.f308169b;
            C110541af afVar = this.f308171d;
            afVar.f308173b.mo109914al(this.f308170c - (j2 - j), afVar.f308174c.mo77175m(), true);
        }
    }
}
