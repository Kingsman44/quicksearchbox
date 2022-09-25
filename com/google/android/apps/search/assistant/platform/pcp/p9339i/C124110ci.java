package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ci */
/* compiled from: PG */
public final /* synthetic */ class C124110ci implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124114cm f342775a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f342776b;

    public /* synthetic */ C124110ci(C124114cm cmVar, C53306j jVar) {
        this.f342775a = cmVar;
        this.f342776b = jVar;
    }

    public final C60870cx apply(Object obj) {
        C124114cm cmVar = this.f342775a;
        C53306j jVar = this.f342776b;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C124013j Z = ((C124013j.C124014a) C47245e.m84045a(cmVar.f342787c, C124013j.C124014a.class, cmVar.f342786b)).mo106230Z();
        ((C58970a) ((C58970a) cmVar.f342789e.mo56224b()).mo56372aa(35409)).mo56386p("#maybeSyncWhenMissingWeather start sync...");
        C60870cx b = Z.mo106229b(jVar, C123755bv.f341837o, Optional.m71637of(new C58759qy(1)), true, C123777f.f341922a);
        C124113cl clVar = C124113cl.f342784a;
        return C60922j.m93045h(b, C47810es.m84966f(clVar), cmVar.f342790f);
    }
}
