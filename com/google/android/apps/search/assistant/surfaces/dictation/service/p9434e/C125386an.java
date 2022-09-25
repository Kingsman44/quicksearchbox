package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.an */
/* compiled from: PG */
public final /* synthetic */ class C125386an implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f345824a;

    public /* synthetic */ C125386an(Instant instant) {
        this.f345824a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f345824a;
        C59071e eVar = C125390ar.f345828a;
        C125384al alVar = (C125384al) ((C125385am) obj).toBuilder();
        long epochMilli = instant.toEpochMilli();
        alVar.copyOnWrite();
        ((C125385am) alVar.instance).f345822a = epochMilli;
        long epochMilli2 = instant.toEpochMilli();
        alVar.copyOnWrite();
        ((C125385am) alVar.instance).f345823b = epochMilli2;
        return (C125385am) alVar.build();
    }
}
