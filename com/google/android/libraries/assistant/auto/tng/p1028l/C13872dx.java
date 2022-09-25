package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.android.concurrent.C58301z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.speech.recognizer.p5233a.C67438ag;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.dx */
/* compiled from: PG */
public final class C13872dx {

    /* renamed from: a */
    public final C58833ax f42267a;

    /* renamed from: b */
    public final C58833ax f42268b;

    /* renamed from: c */
    C58833ax f42269c;

    /* renamed from: d */
    private final C60888db f42270d;

    /* renamed from: e */
    private final C69464a f42271e;

    /* renamed from: f */
    private final C21370a f42272f;

    public C13872dx(int i, long j, boolean z, C60888db dbVar, C13870dv dvVar, C13867ds dsVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C21370a aVar4) {
        long j2;
        C58833ax axVar;
        Long l;
        int i2 = i;
        C58976aa aaVar = C58975e.f156826a;
        if (i2 == 1 || i2 == 3) {
            this.f42267a = C58833ax.m90834k(dsVar.mo21321a(j, 0, C13871dw.NETWORK, dvVar));
        } else {
            this.f42267a = C58836b.f156633a;
        }
        if (i2 == 3) {
            if (z) {
                l = (Long) aVar3.mo17428b();
            } else {
                l = (Long) aVar2.mo17428b();
            }
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        long j3 = j2;
        if (i2 == 2 || i2 == 3) {
            axVar = C58833ax.m90834k(dsVar.mo21321a(j, j3, C13871dw.EMBEDDED, dvVar));
        } else {
            axVar = C58836b.f156633a;
        }
        this.f42268b = axVar;
        this.f42270d = dbVar;
        this.f42271e = aVar;
        this.f42272f = aVar4;
        this.f42269c = C58836b.f156633a;
    }

    /* renamed from: a */
    public final void mo21323a(C67438ag agVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58833ax axVar = this.f42268b;
        if (axVar.mo56113h()) {
            ((C13866dr) axVar.mo56107c()).mo21319b(agVar);
        }
    }

    /* renamed from: b */
    public final void mo21324b(C67438ag agVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58833ax axVar = this.f42267a;
        if (axVar.mo56113h()) {
            ((C13866dr) axVar.mo56107c()).mo21319b(agVar);
        }
    }

    /* renamed from: c */
    public final void mo21325c() {
        this.f42269c = C58833ax.m90834k(C58301z.m89281a(new C13868dt(this), 0, ((Long) this.f42271e.mo17428b()).longValue(), TimeUnit.MILLISECONDS, this.f42272f, this.f42270d));
    }

    /* renamed from: d */
    public final void mo21326d() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f42269c.mo56113h() && !((C60870cx) this.f42269c.mo56107c()).isCancelled() && !((C60870cx) this.f42269c.mo56107c()).isDone()) {
            ((C60870cx) this.f42269c.mo56107c()).cancel(true);
        }
    }
}
