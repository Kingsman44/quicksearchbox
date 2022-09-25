package com.google.android.apps.search.assistant.platform.pcp.api;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.h */
/* compiled from: PG */
public final /* synthetic */ class C123592h implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C123592h f341480a = new C123592h();

    private /* synthetic */ C123592h() {
    }

    public final C60870cx apply(Object obj) {
        C58480gp e = C58485gu.m89837e();
        for (C123744bk builder : ((C123746bm) obj).f341820a) {
            C123743bj bjVar = (C123743bj) builder.toBuilder();
            bjVar.copyOnWrite();
            C123744bk bkVar = (C123744bk) bjVar.instance;
            bkVar.f341807b |= 2;
            bkVar.f341814i = true;
            e.mo55395g((C123744bk) bjVar.build());
        }
        C123745bl blVar = (C123745bl) C123746bm.f341818b.createBuilder();
        blVar.mo106124a(e.mo55394f());
        return C60856cj.m92900i((C123746bm) blVar.build());
    }
}
