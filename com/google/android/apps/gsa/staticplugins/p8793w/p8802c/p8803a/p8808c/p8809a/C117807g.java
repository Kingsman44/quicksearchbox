package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8808c.p8809a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.c.a.g */
/* compiled from: PG */
public final class C117807g extends C68247h {

    /* renamed from: a */
    private final C68283d f326969a;

    /* renamed from: c */
    private final C68283d f326970c;

    public C117807g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C117807g.class), aVar);
        this.f326969a = C68236af.m98549d(dVar);
        this.f326970c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        List list = (List) obj;
        C92460b bVar = (C92460b) list.get(0);
        C58974d dVar = (C58974d) list.get(1);
        if (bVar.mo87188F() != null) {
            bVar.mo87192c();
            bVar.mo87203o();
            bVar.mo87193d();
            C66677k kVar2 = (C66677k) C66678l.f181384f.createBuilder();
            int c = bVar.mo87192c();
            kVar2.copyOnWrite();
            C66678l lVar = (C66678l) kVar2.instance;
            lVar.f181388a |= 4;
            lVar.f181391d = c;
            C67451at o = bVar.mo87203o();
            kVar2.copyOnWrite();
            C66678l lVar2 = (C66678l) kVar2.instance;
            lVar2.f181389b = o.f183321p;
            lVar2.f181388a = 1 | lVar2.f181388a;
            int d = bVar.mo87193d();
            kVar2.copyOnWrite();
            C66678l lVar3 = (C66678l) kVar2.instance;
            lVar3.f181388a |= 2;
            lVar3.f181390c = (float) d;
            kVar = new C118928k(C58833ax.m90834k((C66678l) kVar2.build()), C66678l.f181386h);
        } else {
            kVar = new C118928k(C58836b.f156633a, C66678l.f181386h);
        }
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326969a.mo60297gq(), this.f326970c.mo60297gq());
    }
}
