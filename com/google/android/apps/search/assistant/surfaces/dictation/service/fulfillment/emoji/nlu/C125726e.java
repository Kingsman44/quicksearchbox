package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.e */
/* compiled from: PG */
public final /* synthetic */ class C125726e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C125727f f346517a;

    /* renamed from: b */
    public final /* synthetic */ C125738q f346518b;

    public /* synthetic */ C125726e(C125727f fVar, C125738q qVar) {
        this.f346517a = fVar;
        this.f346518b = qVar;
    }

    public final Object apply(Object obj) {
        C125727f fVar = this.f346517a;
        C125738q qVar = this.f346518b;
        C59052c cVar = (C59052c) ((C59052c) C125727f.f346519a.mo56225c()).mo56382g((Exception) obj);
        cVar.mo56374ac(1, TimeUnit.MINUTES);
        ((C59052c) cVar.mo56372aa(36613)).mo56389s("Loading emoji nlu handler for %s failed. [SD]", ((C125722a) qVar).f346511a);
        fVar.f346522d.mo107401C(8);
        return new C125740s();
    }
}
