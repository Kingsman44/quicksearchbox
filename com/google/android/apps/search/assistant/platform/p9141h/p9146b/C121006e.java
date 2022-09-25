package com.google.android.apps.search.assistant.platform.p9141h.p9146b;

import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9143a.C120972a;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9143a.C120973b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p3186j$.util.function.Consumer;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.assistant.platform.h.b.e */
/* compiled from: PG */
public final /* synthetic */ class C121006e implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C121006e f336378a = new C121006e();

    private /* synthetic */ C121006e() {
    }

    public final void accept(Object obj) {
        C120973b bVar = (C120973b) obj;
        C59052c cVar = (C59052c) C120973b.f336320a.mo56224b();
        cVar.mo56379ah(new C59094n(35667));
        cVar.mo56386p("onContinuedConversationSettingsChanged received");
        C71803m.m105043d(bVar.f336323d, (C69585o) null, (C71424ay) null, new C120972a(bVar, (C69577g) null), 3);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
