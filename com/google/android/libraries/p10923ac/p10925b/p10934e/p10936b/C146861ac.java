package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import android.os.SystemClock;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147174h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.ac */
/* compiled from: PG */
public final class C146861ac extends C68247h {

    /* renamed from: a */
    private final C68283d f396433a;

    /* renamed from: c */
    private final C68283d f396434c;

    public C146861ac(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146861ac.class), aVar);
        this.f396433a = C68236af.m98549d(dVar);
        this.f396434c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C147174h hVar = (C147174h) list.get(0);
        C146874c cVar = new C146874c(SystemClock.elapsedRealtimeNanos() / 1000);
        cVar.f396471a.f396470b = 0;
        return C60856cj.m92900i(C58485gu.m89842j(C58597ky.m90217h(C58597ky.m90216g((C58485gu) list.get(1)), new C146858a(cVar))).mo55401lD());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396433a.mo60297gq(), this.f396434c.mo60297gq());
    }
}
