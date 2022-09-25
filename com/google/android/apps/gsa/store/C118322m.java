package com.google.android.apps.gsa.store;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.store.m */
/* compiled from: PG */
public final class C118322m extends C68247h {

    /* renamed from: a */
    private final C68283d f328442a;

    /* renamed from: c */
    private final C68283d f328443c;

    /* renamed from: d */
    private final C68283d f328444d;

    public C118322m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C118322m.class), aVar);
        this.f328442a = C68236af.m98549d(dVar);
        this.f328443c = C68236af.m98549d(dVar2);
        this.f328444d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118312c cVar = (C118312c) list.get(1);
        C118335x g = cVar.mo91761g();
        ArrayList arrayList = new ArrayList();
        arrayList.add(C118308af.f328387b);
        arrayList.add(new C118305ac((C21370a) list.get(0)));
        g.f328476c.mo55395g(C118326q.m196505a(arrayList, 10));
        g.f328479f = true;
        for (C118324o a : (Set) list.get(2)) {
            for (C118302a g2 : a.mo103662a()) {
                g.f328474a.mo55395g(g2);
            }
        }
        return C60922j.m93044g(cVar.mo91763i(g.mo103674a()), new C118318i(), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f328442a.mo60297gq(), this.f328443c.mo60297gq(), this.f328444d.mo60297gq());
    }
}
