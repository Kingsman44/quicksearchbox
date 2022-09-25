package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10945l.C147172f;
import com.google.common.p4552o.p4566l.C60173ck;
import com.google.common.p4552o.p4566l.C60175cm;
import com.google.common.p4552o.p4566l.C60177co;
import com.google.common.p4552o.p4566l.C60178cp;
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

/* renamed from: com.google.android.libraries.ac.b.e.cb */
/* compiled from: PG */
public final class C146926cb extends C68247h {

    /* renamed from: a */
    private final C68283d f396637a;

    /* renamed from: c */
    private final C68283d f396638c;

    /* renamed from: d */
    private final C68283d f396639d;

    public C146926cb(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146926cb.class), aVar);
        this.f396637a = C68236af.m98549d(dVar);
        this.f396638c = C68236af.m98549d(dVar2);
        this.f396639d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C68282c cVar2 = (C68282c) list.get(1);
        C147172f fVar = (C147172f) list.get(2);
        try {
            C60173ck ckVar = (C60173ck) C60178cp.f162787o.createBuilder();
            C60177co coVar = (C60177co) cVar.mo60292a();
            ckVar.copyOnWrite();
            C60178cp cpVar = (C60178cp) ckVar.instance;
            coVar.getClass();
            cpVar.f162797i = coVar;
            cpVar.f162789a |= 128;
            C60175cm cmVar = (C60175cm) cVar2.mo60292a();
            ckVar.copyOnWrite();
            C60178cp cpVar2 = (C60178cp) ckVar.instance;
            cmVar.getClass();
            cpVar2.f162796h = cmVar;
            cpVar2.f162789a |= 64;
            C60178cp cpVar3 = (C60178cp) ckVar.build();
            fVar.close();
            return C60856cj.m92900i(cpVar3);
        } catch (ExecutionException e) {
            throw fVar.mo123994a(e.getCause(), Exception.class);
        } catch (Throwable th) {
            fVar.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f396637a.mo60297gq()), C68236af.m98546a(this.f396638c.mo60297gq()), this.f396639d.mo60297gq());
    }
}
