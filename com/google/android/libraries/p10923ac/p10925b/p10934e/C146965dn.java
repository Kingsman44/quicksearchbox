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

/* renamed from: com.google.android.libraries.ac.b.e.dn */
/* compiled from: PG */
public final class C146965dn extends C68247h {

    /* renamed from: a */
    private final C68283d f396721a;

    public C146965dn(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C146965dn.class), aVar);
        this.f396721a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C146907bj bjVar = (C146907bj) obj;
        C147077av a = bjVar.mo123808m().mo123903a();
        try {
            C64057dm f = bjVar.mo123801f(a);
            a.close();
            return C60856cj.m92900i(f);
        } catch (Throwable th) {
            C146963dl.m239567a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f396721a.mo60297gq();
    }
}
