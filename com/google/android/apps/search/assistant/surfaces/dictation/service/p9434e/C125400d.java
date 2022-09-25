package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.d */
/* compiled from: PG */
public final /* synthetic */ class C125400d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125411o f345847a;

    public /* synthetic */ C125400d(C125411o oVar) {
        this.f345847a = oVar;
    }

    public final void accept(Object obj) {
        C125411o oVar = this.f345847a;
        ((C59052c) ((C59052c) ((C59052c) C125411o.f345861a.mo56226d()).mo56382g((Throwable) obj)).mo56372aa(36499)).mo56389s("%s: Failed to release audio focus. [SD]", oVar.f345877q);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
