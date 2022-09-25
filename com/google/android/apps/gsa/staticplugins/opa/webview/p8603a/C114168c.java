package com.google.android.apps.gsa.staticplugins.opa.webview.p8603a;

import com.google.android.apps.gsa.assistant.shared.l.f;
import com.google.android.apps.gsa.assistant.shared.l.g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.a.c */
/* compiled from: PG */
public final class C114168c extends C68247h {

    /* renamed from: a */
    private final C68283d f316519a;

    /* renamed from: c */
    private final C68283d f316520c;

    public C114168c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C114168c.class), aVar);
        this.f316519a = C68236af.m98549d(dVar);
        this.f316520c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        g gVar;
        List list = (List) obj;
        String str = (String) list.get(0);
        Query query = (Query) list.get(1);
        if (query.equals(Query.f252741b)) {
            f createBuilder = g.e.createBuilder();
            createBuilder.copyOnWrite();
            g gVar2 = createBuilder.instance;
            str.getClass();
            gVar2.b = 2;
            gVar2.c = str;
            gVar = (g) createBuilder.build();
        } else {
            f createBuilder2 = g.e.createBuilder();
            String bf = query.mo84347bf("com.google.opa.webview.CLICKED_SEARCH_URL");
            if (bf != null) {
                createBuilder2.copyOnWrite();
                g gVar3 = createBuilder2.instance;
                gVar3.b = 1;
                gVar3.c = bf;
            } else {
                createBuilder2.copyOnWrite();
                g gVar4 = createBuilder2.instance;
                str.getClass();
                gVar4.b = 2;
                gVar4.c = str;
            }
            gVar = createBuilder2.build();
        }
        return C60856cj.m92900i(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f316519a.mo60297gq(), this.f316520c.mo60297gq());
    }
}
