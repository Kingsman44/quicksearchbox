package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122617c;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.g */
/* compiled from: PG */
public final /* synthetic */ class C123289g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123528q f341020a;

    public /* synthetic */ C123289g(C123528q qVar) {
        this.f341020a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C123528q qVar = this.f341020a;
        C122617c cVar = (C122617c) obj;
        int i = C123522k.f341328b;
        String str = qVar.f341343a;
        C52405qn qnVar = qVar.f341344b;
        if (qnVar == null) {
            qnVar = C52405qn.f137519c;
        }
        String str2 = qnVar.f137522b;
        C63179l lVar = qVar.f341345c;
        if (lVar == null) {
            lVar = C63179l.f170583h;
        }
        return cVar.mo105690a(str, str2, lVar, Optional.empty(), Optional.empty());
    }
}
