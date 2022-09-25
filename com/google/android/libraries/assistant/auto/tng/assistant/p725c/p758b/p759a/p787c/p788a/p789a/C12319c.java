package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.p789a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.a.a.c */
/* compiled from: PG */
final class C12319c extends C57975a {
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C12182h hVar = (C12182h) obj;
        ((C59052c) ((C59052c) C12320d.f39125a.mo56224b()).mo56372aa(44184)).mo56386p("ConversationDeltaResponse#onNext");
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C12320d.f39125a.mo56226d()).mo56382g(th)).mo56372aa(44182)).mo56386p("ConversationDeltaResponse#onFailure");
        }
    }
}
