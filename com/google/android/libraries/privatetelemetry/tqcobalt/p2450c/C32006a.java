package com.google.android.libraries.privatetelemetry.tqcobalt.p2450c;

import androidx.work.C4383ag;
import androidx.work.C4396at;
import androidx.work.C4634o;
import com.google.android.libraries.privatetelemetry.tqcobalt.C32001a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32011e;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.C32021d;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.C32043e;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogUploadTimer;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogWriter;
import com.google.android.p10713e.C142537c;
import com.google.android.p10713e.C142538d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.c.a */
/* compiled from: PG */
public final class C32006a implements C32001a {

    /* renamed from: a */
    private static final C59071e f86014a = C59071e.m91332i("com.google.android.libraries.privatetelemetry.tqcobalt.c.a");

    /* renamed from: b */
    private final C4396at f86015b;

    /* renamed from: c */
    private final String f86016c;

    /* renamed from: d */
    private final int f86017d;

    /* renamed from: e */
    private final long f86018e;

    /* renamed from: f */
    private final Duration f86019f;

    public C32006a(C4396at atVar, C32021d dVar) {
        this.f86015b = atVar;
        int a = dVar.mo37787a().mo37777a();
        this.f86017d = a;
        long b = dVar.mo37787a().mo37778b();
        this.f86018e = b;
        this.f86019f = dVar.mo37788b();
        this.f86016c = C32043e.m59708b(a, b);
    }

    /* renamed from: a */
    public final void mo37765a(C32011e eVar) {
        C142537c cVar = (C142537c) C142538d.f386774q.createBuilder();
        int a = eVar.mo37774a().mo37768a();
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386778c = a;
        long c = eVar.mo37774a().mo37770c();
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386779d = c;
        long b = eVar.mo37774a().mo37769b();
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386780e = b;
        List b2 = eVar.mo37775b();
        cVar.copyOnWrite();
        C142538d dVar = (C142538d) cVar.instance;
        dVar.mo117141a();
        C62947c.addAll((Iterable) b2, (List) dVar.f386781f);
        long c2 = eVar.mo37776c();
        cVar.copyOnWrite();
        C142538d dVar2 = (C142538d) cVar.instance;
        dVar2.f386776a = 11;
        dVar2.f386777b = Long.valueOf(c2);
        C4383ag c3 = LogWriter.m59690c((C142538d) cVar.build(), 1, this.f86016c);
        ((C59052c) ((C59052c) f86014a.mo56224b()).mo56372aa(50473)).mo56394x("Cobalt: enqueue log request for customerId = %d, projectId = %d", this.f86017d, this.f86018e);
        C32043e.m59710d(this.f86015b, c3, this.f86017d, this.f86018e);
    }

    /* renamed from: b */
    public final void mo37766b() {
        ((C59052c) ((C59052c) f86014a.mo56224b()).mo56372aa(50474)).mo56394x("Cobalt: schedule sending data to the Cobalt Server for customerId = %d, projectId = %d", this.f86017d, this.f86018e);
        C4396at atVar = this.f86015b;
        int i = this.f86017d;
        long j = this.f86018e;
        atVar.mo9331e(C32043e.m59709c(i, j), C4634o.KEEP, LogUploadTimer.m59682f(i, j, this.f86019f));
    }

    /* renamed from: c */
    public final void mo37767c() {
        ((C59052c) ((C59052c) f86014a.mo56224b()).mo56372aa(50475)).mo56394x("Cobalt: stop existing jobs sending data to the Cobalt Server for customerId = %d, projectId = %d", this.f86017d, this.f86018e);
        this.f86015b.mo9328b(C32043e.m59709c(this.f86017d, this.f86018e));
    }
}
