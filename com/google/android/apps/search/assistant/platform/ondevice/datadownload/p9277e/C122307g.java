package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import com.google.android.libraries.mdi.C29690f;
import com.google.assistant.p3793ae.p3794a.C48769a;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.g */
/* compiled from: PG */
public final /* synthetic */ class C122307g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29690f f339159a;

    public /* synthetic */ C122307g(C29690f fVar) {
        this.f339159a = fVar;
    }

    public final Object apply(Object obj) {
        C29690f fVar = this.f339159a;
        C58974d dVar = C122314n.f339169a;
        C48769a aVar = (C48769a) C48770b.f126194c.createBuilder();
        Objects.requireNonNull(aVar);
        ((Optional) obj).ifPresent(new C122313m(aVar));
        aVar.copyOnWrite();
        fVar.getClass();
        ((C48770b) aVar.instance).f126196a = fVar;
        return (C48770b) aVar.build();
    }
}
