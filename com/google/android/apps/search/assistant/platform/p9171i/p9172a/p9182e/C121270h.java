package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9182e;

import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9222b.C121427a;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19169bc;
import com.google.assistant.p3781ad.p3789d.p3791b.C48685at;
import com.google.assistant.p3781ad.p3789d.p3791b.C48686au;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.e.h */
/* compiled from: PG */
public final /* synthetic */ class C121270h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C121274l f336837a;

    /* renamed from: b */
    public final /* synthetic */ C121481e f336838b;

    public /* synthetic */ C121270h(C121274l lVar, C121481e eVar) {
        this.f336837a = lVar;
        this.f336838b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C121274l lVar = this.f336837a;
        C121269g gVar = (C121269g) obj;
        C19169bc d = this.f336838b.mo105172d();
        C121427a aVar = lVar.f336844b;
        C48685at atVar = (C48685at) C48686au.f125957d.createBuilder();
        String str = d.f53694b;
        atVar.copyOnWrite();
        C48686au auVar = (C48686au) atVar.instance;
        str.getClass();
        auVar.f125959a |= 2;
        auVar.f125961c = str;
        C19167ba baVar = d.f53697e;
        if (baVar == null) {
            baVar = C19167ba.f53673s;
        }
        C19141ab abVar = baVar.f53685m;
        if (abVar == null) {
            abVar = C19141ab.f53614i;
        }
        atVar.copyOnWrite();
        C48686au auVar2 = (C48686au) atVar.instance;
        abVar.getClass();
        auVar2.f125960b = abVar;
        auVar2.f125959a |= 1;
        return aVar.mo105136a((C48686au) atVar.build(), gVar.mo105100a());
    }
}
