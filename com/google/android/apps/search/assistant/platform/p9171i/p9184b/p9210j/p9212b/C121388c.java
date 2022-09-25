package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9212b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121219ad;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121241e;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121242f;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121244h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62995dn;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.b.c */
/* compiled from: PG */
public final /* synthetic */ class C121388c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121391f f337020a;

    public /* synthetic */ C121388c(C121391f fVar) {
        this.f337020a = fVar;
    }

    public final Object apply(Object obj) {
        C121391f fVar = this.f337020a;
        C121242f fVar2 = (C121242f) C121244h.f336790b.createBuilder();
        for (C121241e eVar : (List) obj) {
            String str = eVar.f336785b;
            str.getClass();
            eVar.getClass();
            fVar2.copyOnWrite();
            C121244h hVar = (C121244h) fVar2.instance;
            C62995dn dnVar = hVar.f336792a;
            if (!dnVar.f170058b) {
                hVar.f336792a = dnVar.mo58980a();
            }
            hVar.f336792a.put(str, eVar);
        }
        C121219ad adVar = (C121219ad) C121220ae.f336741f.createBuilder();
        long epochMilli = fVar.f337026d.mo57444a().toEpochMilli();
        adVar.copyOnWrite();
        C121220ae aeVar = (C121220ae) adVar.instance;
        aeVar.f336743a |= 1;
        aeVar.f336746d = epochMilli;
        C48714bv bvVar = C48714bv.APP_INFO_SIGNAL;
        adVar.copyOnWrite();
        C121220ae aeVar2 = (C121220ae) adVar.instance;
        aeVar2.f336747e = bvVar.f126042j;
        aeVar2.f336743a |= 2;
        adVar.copyOnWrite();
        C121220ae aeVar3 = (C121220ae) adVar.instance;
        C121244h hVar2 = (C121244h) fVar2.build();
        hVar2.getClass();
        aeVar3.f336745c = hVar2;
        aeVar3.f336744b = 6;
        C121220ae aeVar4 = (C121220ae) adVar.build();
        C60856cj.m92911t(fVar.f337027e.mo46039a(new C121387b(aeVar4), fVar.f337025c), C47810es.m84974n(new C121390e()), C60826bg.f164896a);
        return aeVar4;
    }
}
