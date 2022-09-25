package com.google.android.apps.search.assistant.platform.pcp.p9324a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62910ar;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.a.b */
/* compiled from: PG */
public final /* synthetic */ class C123564b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124013j f341437a;

    public /* synthetic */ C123564b(C124013j jVar) {
        this.f341437a = jVar;
    }

    public final C60870cx apply(Object obj) {
        C124013j jVar = this.f341437a;
        C62910ar arVar = C123576n.f341451a;
        if (((C46108a) obj).mo50210b().f121165j.equals("pseudonymous")) {
            return C60866ct.f164955a;
        }
        C60870cx b = jVar.mo106229b(C53306j.INPUT_PLATE, C123755bv.f341837o, Optional.empty(), false, C123777f.f341922a);
        C123563a aVar = C123563a.f341436a;
        return C60922j.m93045h(b, C47810es.m84966f(aVar), C60826bg.f164896a);
    }
}
