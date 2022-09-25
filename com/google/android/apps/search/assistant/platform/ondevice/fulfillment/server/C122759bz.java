package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122408b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122452g;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122617c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62963cj;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.bz */
/* compiled from: PG */
public final /* synthetic */ class C122759bz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122408b f340075a;

    public /* synthetic */ C122759bz(C122408b bVar) {
        this.f340075a = bVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        Optional optional2;
        C122408b bVar = this.f340075a;
        C122617c cVar = (C122617c) obj;
        String str = bVar.f339359b;
        String str2 = bVar.f339361d;
        C63179l lVar = bVar.f339362e;
        if (lVar == null) {
            lVar = C63179l.f170583h;
        }
        C63179l lVar2 = lVar;
        if ((bVar.f339358a & 1) != 0) {
            optional = Optional.m71637of(Instant.ofEpochMilli(bVar.f339363f));
        } else {
            optional = Optional.empty();
        }
        Optional optional3 = optional;
        C122452g gVar = bVar.f339364g;
        if (gVar != null) {
            optional2 = Optional.m71637of(C58485gu.m89842j(new C62963cj(gVar.f339471a, C122452g.f339468b)));
        } else {
            optional2 = Optional.empty();
        }
        return cVar.mo105690a(str, str2, lVar2, optional3, optional2);
    }
}
