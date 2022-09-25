package com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9143a;

import com.google.android.apps.search.assistant.platform.p9141h.p9142a.C120996f;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120986e;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121072a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.a.e */
/* compiled from: PG */
public final class C120976e implements C121072a {

    /* renamed from: a */
    public static final C59071e f336328a = C59071e.m91331h();

    /* renamed from: b */
    public final C120996f f336329b;

    /* renamed from: c */
    public final C120986e f336330c;

    /* renamed from: d */
    public final C71422aw f336331d;

    public C120976e(C120996f fVar, C120986e eVar, C71422aw awVar) {
        C69664n.m101061g(fVar, "searchChangeNotificationListenerService");
        C69664n.m101061g(eVar, "interactorChangeNotificationListenerService");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f336329b = fVar;
        this.f336330c = eVar;
        this.f336331d = awVar;
    }

    /* renamed from: a */
    public final void mo104661a() {
        C59052c cVar = (C59052c) f336328a.mo56224b();
        cVar.mo56379ah(new C59094n(35678));
        cVar.mo56386p("onPreferredMobileLocaleSettingsDataChanged received");
        C71803m.m105043d(this.f336331d, (C69585o) null, (C71424ay) null, new C120974c(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final void mo104662b() {
        C59052c cVar = (C59052c) f336328a.mo56224b();
        cVar.mo56379ah(new C59094n(35679));
        cVar.mo56386p("onPrimaryMobileLocaleSettingsDataChanged received");
        C71803m.m105043d(this.f336331d, (C69585o) null, (C71424ay) null, new C120975d(this, (C69577g) null), 3);
    }
}
