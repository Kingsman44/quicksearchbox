package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.os.SystemClock;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147174h;
import com.google.common.p4552o.p4566l.C60177co;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.dj */
/* compiled from: PG */
public final class C146961dj extends C68247h {

    /* renamed from: a */
    private final C68283d f396714a;

    /* renamed from: c */
    private final C68283d f396715c;

    public C146961dj(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146961dj.class), aVar);
        this.f396714a = C68236af.m98549d(dVar);
        this.f396715c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C147174h hVar = (C147174h) list.get(0);
        C60177co coVar = (C60177co) list.get(1);
        return C60856cj.m92900i(Long.valueOf(SystemClock.elapsedRealtimeNanos()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396714a.mo60297gq(), this.f396715c.mo60297gq());
    }
}
