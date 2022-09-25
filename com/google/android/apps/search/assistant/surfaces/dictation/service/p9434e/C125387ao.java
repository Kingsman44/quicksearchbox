package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.ao */
/* compiled from: PG */
public final /* synthetic */ class C125387ao implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C125387ao f345825a = new C125387ao();

    private /* synthetic */ C125387ao() {
    }

    public final Object apply(Object obj) {
        C59071e eVar = C125390ar.f345828a;
        C125384al alVar = (C125384al) ((C125385am) obj).toBuilder();
        long epochMilli = Instant.EPOCH.toEpochMilli();
        alVar.copyOnWrite();
        ((C125385am) alVar.instance).f345823b = epochMilli;
        return (C125385am) alVar.build();
    }
}
