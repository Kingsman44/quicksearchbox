package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8808c.p8809a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66544aa;
import com.google.speech.p5208h.C66545ab;
import com.google.speech.p5208h.C66691y;
import com.google.speech.p5208h.C66692z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.c.a.d */
/* compiled from: PG */
public final class C117804d extends C68247h {

    /* renamed from: a */
    private final C68283d f326963a;

    /* renamed from: c */
    private final C68283d f326964c;

    /* renamed from: d */
    private final C68283d f326965d;

    public C117804d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117804d.class), aVar);
        this.f326963a = C68236af.m98549d(dVar);
        this.f326964c = C68236af.m98549d(dVar2);
        this.f326965d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        HotwordResultMetadata hotwordResultMetadata;
        List list = (List) obj;
        C92460b bVar = (C92460b) list.get(1);
        Query query = (Query) list.get(2);
        if (!((C90021c) list.get(0)).mo79746e(C90086ek.f250494eg)) {
            kVar = new C118928k(C58836b.f156633a, C66692z.f181427f);
        } else {
            C66544aa aaVar = (C66544aa) C66545ab.f180982c.createBuilder();
            int G = bVar.mo87189G();
            aaVar.copyOnWrite();
            C66545ab abVar = (C66545ab) aaVar.instance;
            int i = G - 1;
            if (G != 0) {
                abVar.f180985b = i;
                abVar.f180984a |= 1;
                C66691y yVar = (C66691y) C66692z.f181426e.createBuilder();
                yVar.mo59705b((C66545ab) aaVar.build());
                if (query.mo84368cA() && (hotwordResultMetadata = query.f252756N) != null) {
                    boolean p = hotwordResultMetadata.mo84614p();
                    yVar.copyOnWrite();
                    C66692z zVar = (C66692z) yVar.instance;
                    zVar.f181429a = 1 | zVar.f181429a;
                    zVar.f181431c = p;
                    String str = (String) hotwordResultMetadata.mo84605h().mo56111f();
                    if (str != null) {
                        yVar.copyOnWrite();
                        C66692z zVar2 = (C66692z) yVar.instance;
                        zVar2.f181429a |= 16;
                        zVar2.f181432d = str;
                    }
                }
                kVar = new C118928k(C58833ax.m90834k((C66692z) yVar.build()), C66692z.f181427f);
            } else {
                throw null;
            }
        }
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326963a.mo60297gq(), this.f326964c.mo60297gq(), this.f326965d.mo60297gq());
    }
}
