package com.google.android.apps.gsa.staticplugins.customtabs.p7711d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.d.e */
/* compiled from: PG */
public final class C98653e extends C68247h {

    /* renamed from: a */
    private final C68283d f275548a;

    /* renamed from: c */
    private final C68283d f275549c;

    /* renamed from: d */
    private final C68283d f275550d;

    /* renamed from: e */
    private final C68283d f275551e;

    /* renamed from: f */
    private final C68283d f275552f;

    /* renamed from: g */
    private final C68283d f275553g;

    public C98653e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C98653e.class), aVar);
        this.f275548a = C68236af.m98549d(dVar);
        this.f275549c = C68236af.m98549d(dVar2);
        this.f275550d = C68236af.m98549d(dVar3);
        this.f275551e = C68236af.m98549d(dVar4);
        this.f275552f = C68236af.m98549d(dVar5);
        this.f275553g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C68283d dVar = this.f275549c;
        C68283d dVar2 = this.f275550d;
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        Query query = (Query) list.get(2);
        C86124t tVar = (C86124t) list.get(3);
        if (!C57940c.m88582i(cVar) || !((Boolean) C57940c.m88577d(cVar)).booleanValue() || !query.mo84425dF()) {
            return C118826c.f331423b;
        }
        ArrayList arrayList = new ArrayList();
        if (tVar.mo79746e(C90110fh.f250630ab) && !booleanValue) {
            arrayList.add(dVar2.mo60297gq());
        }
        if (tVar.mo79743a(C90110fh.f250597V) > 0) {
            arrayList.add(dVar.mo60297gq());
        }
        return C118826c.m197212b(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f275548a.mo60297gq()), this.f275551e.mo60297gq(), this.f275552f.mo60297gq(), this.f275553g.mo60297gq());
    }
}
