package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.common.p4552o.p4566l.C60178cp;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.ac.b.e.r */
/* compiled from: PG */
public final class C146987r extends C68247h {

    /* renamed from: a */
    private final C68283d f396883a;

    /* renamed from: c */
    private final C68283d f396884c;

    public C146987r(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146987r.class), aVar);
        this.f396883a = C68236af.m98549d(dVar);
        this.f396884c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C68282c cVar = (C68282c) obj;
        C68283d dVar = this.f396884c;
        try {
            return C60856cj.m92900i((C60178cp) cVar.mo60292a());
        } catch (ExecutionException e) {
            if (Status.m102100d(e).getCode() == Status.f186910h.getCode()) {
                return dVar.mo60297gq();
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f396883a.mo60297gq());
    }
}
