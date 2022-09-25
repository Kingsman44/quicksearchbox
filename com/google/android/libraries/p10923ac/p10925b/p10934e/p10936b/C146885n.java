package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4895aw.p4902b.C64101s;
import com.google.protos.p4895aw.p4902b.C64102t;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.n */
/* compiled from: PG */
public final class C146885n extends C68247h {

    /* renamed from: a */
    private final C68283d f396491a;

    /* renamed from: c */
    private final C68283d f396492c;

    public C146885n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146885n.class), aVar);
        this.f396491a = C68236af.m98549d(dVar);
        this.f396492c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C146872an anVar = new C146872an(((Long) list.get(1)).longValue());
        C64101s sVar = (C64101s) C64102t.f173303b.createBuilder();
        Objects.requireNonNull(anVar);
        List h = C58597ky.m90217h((C58485gu) list.get(0), new C146880i(anVar));
        sVar.copyOnWrite();
        C64102t tVar = (C64102t) sVar.instance;
        C62971cq cqVar = tVar.f173305a;
        if (!cqVar.mo58948c()) {
            tVar.f173305a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) h, (List) tVar.f173305a);
        return C60856cj.m92900i((C64102t) sVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396491a.mo60297gq(), this.f396492c.mo60297gq());
    }
}
