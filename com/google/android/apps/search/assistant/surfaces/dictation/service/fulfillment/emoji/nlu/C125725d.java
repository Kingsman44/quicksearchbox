package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.d */
/* compiled from: PG */
public final /* synthetic */ class C125725d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C125727f f346515a;

    /* renamed from: b */
    public final /* synthetic */ C125738q f346516b;

    public /* synthetic */ C125725d(C125727f fVar, C125738q qVar) {
        this.f346515a = fVar;
        this.f346516b = qVar;
    }

    public final Object apply(Object obj) {
        C125727f fVar = this.f346515a;
        C125738q qVar = this.f346516b;
        C59052c cVar = (C59052c) ((C59052c) C125727f.f346519a.mo56225c()).mo56382g((TimeoutException) obj);
        cVar.mo56374ac(1, TimeUnit.MINUTES);
        ((C59052c) cVar.mo56372aa(36612)).mo56389s("Loading emoji nlu handler for %s timed out. [SD]", ((C125722a) qVar).f346511a);
        fVar.f346522d.mo107401C(7);
        return new C125740s();
    }
}
