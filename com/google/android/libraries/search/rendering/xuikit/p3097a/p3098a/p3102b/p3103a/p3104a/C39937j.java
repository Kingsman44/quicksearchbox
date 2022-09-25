package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3103a.p3104a;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40452l;
import com.google.android.libraries.search.rendering.xuikit.p3144e.C40492j;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64155x;
import com.google.protos.youtube.elements.C66059au;
import java.util.concurrent.Executor;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70129u;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.a.a.j */
/* compiled from: PG */
final class C39937j implements C21312s {

    /* renamed from: a */
    public final C21232ab f104981a;

    /* renamed from: b */
    final /* synthetic */ C39938k f104982b;

    public C39937j(C39938k kVar, C21232ab abVar) {
        this.f104982b = kVar;
        this.f104981a = abVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64155x.f173453g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C69822d dVar;
        C64155x xVar = (C64155x) obj;
        C70129u j = this.f104981a.mo26139b(xVar.f173458d).mo61657s().mo61670j(C39934g.f104977a);
        C39938k kVar = this.f104982b;
        C40452l lVar = kVar.f104983a;
        Executor executor = kVar.f104984b;
        int i = xVar.f173456b;
        if (i == 3) {
            dVar = new C40492j(new C39929b(lVar, xVar, executor), executor);
        } else {
            dVar = (i == 4 || i == 5) ? new C40492j(new C39930c(xVar, lVar, executor), executor) : C39931d.f104974a;
        }
        return j.mo61669h(dVar).mo61668f(new C39935h(this, xVar)).mo61664b().mo61450e(new C39936i(xVar));
    }
}
