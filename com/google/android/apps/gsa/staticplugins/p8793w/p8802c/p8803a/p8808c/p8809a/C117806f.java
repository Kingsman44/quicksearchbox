package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8808c.p8809a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.recognizer.p5233a.C67451at;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.c.a.f */
/* compiled from: PG */
public final class C117806f extends C68247h {

    /* renamed from: a */
    private final C68283d f326967a;

    /* renamed from: c */
    private final C68283d f326968c;

    public C117806f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C117806f.class), aVar);
        this.f326967a = C68236af.m98549d(dVar);
        this.f326968c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C92460b bVar = (C92460b) list.get(0);
        C58974d dVar = (C58974d) list.get(1);
        C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
        C67451at n = bVar.mo87202n();
        kVar.copyOnWrite();
        C66678l lVar = (C66678l) kVar.instance;
        lVar.f181389b = n.f183321p;
        lVar.f181388a = 1 | lVar.f181388a;
        int f = bVar.mo87195f();
        kVar.copyOnWrite();
        C66678l lVar2 = (C66678l) kVar.instance;
        lVar2.f181388a |= 2;
        lVar2.f181390c = (float) f;
        int bitCount = Integer.bitCount(bVar.mo87190a());
        kVar.copyOnWrite();
        C66678l lVar3 = (C66678l) kVar.instance;
        lVar3.f181388a |= 4;
        lVar3.f181391d = bitCount;
        return C60856cj.m92900i(new C118928k(C58833ax.m90834k((C66678l) kVar.build()), C66678l.f181385g));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326967a.mo60297gq(), this.f326968c.mo60297gq());
    }
}
