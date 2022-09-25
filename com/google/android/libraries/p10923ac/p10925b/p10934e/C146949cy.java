package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.os.SystemClock;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147174h;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147177k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.cy */
/* compiled from: PG */
public final class C146949cy extends C68247h {

    /* renamed from: a */
    private final C68283d f396681a;

    /* renamed from: c */
    private final C68283d f396682c;

    /* renamed from: d */
    private final C68283d f396683d;

    public C146949cy(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146949cy.class), aVar);
        this.f396681a = C68236af.m98549d(dVar);
        this.f396682c = C68236af.m98549d(dVar2);
        this.f396683d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C147177k kVar = (C147177k) list.get(0);
        C147174h hVar = (C147174h) list.get(1);
        Void voidR = (Void) list.get(2);
        kVar.mo124000d(SystemClock.elapsedRealtimeNanos());
        return C60856cj.m92900i(kVar.mo123997a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396681a.mo60297gq(), this.f396682c.mo60297gq(), this.f396683d.mo60297gq());
    }
}
