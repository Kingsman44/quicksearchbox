package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10944k.C147143c;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.bz */
/* compiled from: PG */
public final class C146923bz extends C68247h {

    /* renamed from: a */
    private final C69464a f396624a;

    /* renamed from: c */
    private final C68283d f396625c;

    /* renamed from: d */
    private final C68283d f396626d;

    public C146923bz(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146923bz.class), aVar);
        this.f396624a = aVar3;
        this.f396625c = C68236af.m98549d(dVar);
        this.f396626d = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C68282c cVar = (C68282c) obj;
        C68214a a = C68219e.m98518a(this.f396624a);
        C68283d dVar = this.f396626d;
        try {
            return C60856cj.m92900i((Void) cVar.mo60292a());
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C147143c) {
                C147244a aVar = (C147244a) a.mo27525b();
                return dVar.mo60297gq();
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f396625c.mo60297gq());
    }
}
