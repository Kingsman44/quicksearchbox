package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9307b;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122617c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.b.c */
/* compiled from: PG */
public final /* synthetic */ class C123195c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123196d f340892a;

    /* renamed from: b */
    public final /* synthetic */ C123201i f340893b;

    public /* synthetic */ C123195c(C123196d dVar, C123201i iVar) {
        this.f340892a = dVar;
        this.f340893b = iVar;
    }

    public final C60870cx apply(Object obj) {
        C123196d dVar = this.f340892a;
        C123201i iVar = this.f340893b;
        C122617c cVar = (C122617c) obj;
        String str = iVar.f340902a;
        C52405qn qnVar = iVar.f340903b;
        if (qnVar == null) {
            qnVar = C52405qn.f137519c;
        }
        String str2 = qnVar.f137522b;
        C63179l lVar = iVar.f340904c;
        if (lVar == null) {
            lVar = C63179l.f170583h;
        }
        C60870cx b = cVar.mo105691b(str, str2, lVar);
        C123194b bVar = C123194b.f340891a;
        return C60922j.m93044g(b, C47810es.m84963c(bVar), dVar.f340895a);
    }
}
