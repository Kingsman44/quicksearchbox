package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b.C146776d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.w */
/* compiled from: PG */
public final class C146992w extends C68247h {

    /* renamed from: a */
    private final C68283d f396889a;

    /* renamed from: c */
    private final C68283d f396890c;

    public C146992w(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146992w.class), aVar);
        this.f396889a = C68236af.m98549d(dVar);
        this.f396890c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Void voidR = (Void) list.get(0);
        try {
            ((C68282c) list.get(1)).mo60292a();
            throw new IllegalStateException("Token revocation should always throw!");
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C146776d) {
                throw new C146776d(e);
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396889a.mo60297gq(), C68236af.m98546a(this.f396890c.mo60297gq()));
    }
}
