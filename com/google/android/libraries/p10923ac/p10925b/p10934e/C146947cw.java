package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146801h;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147073ar;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147077av;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147090m;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.ac.b.e.cw */
/* compiled from: PG */
public final class C146947cw implements C146845ao {

    /* renamed from: a */
    private final C146907bj f396677a;

    public C146947cw(C146907bj bjVar) {
        this.f396677a = bjVar;
    }

    /* renamed from: a */
    public final C146801h mo123748a(C147077av avVar) {
        return this.f396677a.mo123796b(avVar);
    }

    /* renamed from: b */
    public final C147090m mo123749b() {
        return this.f396677a.mo123799d();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo123750c(C147077av avVar) {
        return C146958dg.m239554e(this.f396677a.mo123797c(avVar), this.f396677a.mo123795a(avVar));
    }

    public final void close() {
        this.f396677a.close();
    }

    /* renamed from: d */
    public final C147073ar mo123751d() {
        return this.f396677a.mo123808m();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo123752e(C147077av avVar, Object obj) {
        long j;
        C146958dg dgVar = (C146958dg) obj;
        Long c = dgVar.mo123721c();
        Long d = dgVar.mo123722d();
        C146907bj bjVar = this.f396677a;
        if (c == null) {
            j = Long.MAX_VALUE;
        } else {
            j = c.longValue();
        }
        long j2 = j;
        long j3 = Long.MIN_VALUE;
        if (!(d == null || d.longValue() == Long.MIN_VALUE)) {
            j3 = d.longValue() - 1;
        }
        return C58485gu.m89842j(bjVar.mo123809n(avVar, j2, j3));
    }
}
