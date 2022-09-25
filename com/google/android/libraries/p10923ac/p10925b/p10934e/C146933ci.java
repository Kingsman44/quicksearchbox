package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10942i.C147077av;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64057dm;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.ci */
/* compiled from: PG */
public final class C146933ci extends C68247h {

    /* renamed from: a */
    private final C68283d f396647a;

    public C146933ci(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C146933ci.class), aVar);
        this.f396647a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C146856az azVar = (C146856az) obj;
        C147077av a = azVar.mo123790m().mo123903a();
        try {
            C64057dm f = azVar.mo123783f(a);
            a.close();
            return C60856cj.m92900i(f);
        } catch (Throwable th) {
            C146930cf.m239502a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f396647a.mo60297gq();
    }
}
