package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9130b.p9131a;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c.C120865e;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C120889b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120891d f336103a;

    /* renamed from: b */
    public final /* synthetic */ C120816a f336104b;

    public /* synthetic */ C120889b(C120891d dVar, C120816a aVar) {
        this.f336103a = dVar;
        this.f336104b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C120891d dVar = this.f336103a;
        C120816a aVar = this.f336104b;
        ((C59052c) ((C59052c) ((C59052c) C120891d.f336107a.mo56225c()).mo56382g((C120865e) obj)).mo56372aa(35640)).mo56386p("On-device asr encountered a compatibility check exception. Using online asr result.");
        dVar.f336109c.mo104957a(true);
        return dVar.f336108b.mo104701b(new C120890c(dVar, aVar));
    }
}
