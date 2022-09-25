package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5082b.p5083a.p5084a.C65482b;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C120216bf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C120221bk f334548a;

    public /* synthetic */ C120216bf(C120221bk bkVar) {
        this.f334548a = bkVar;
    }

    public final void run() {
        C120221bk bkVar = this.f334548a;
        boolean z = bkVar.f334561f;
        C32534ai aiVar = bkVar.f334556a;
        if (z) {
            aiVar.mo38135c(new C120236bz("Unexpected end of the conversation delta stream", C65482b.UNEXPECTED_END_OF_CONVERSATION_DELTA_STREAM, (Throwable) null));
        } else {
            aiVar.mo38135c((Throwable) null);
        }
    }
}
