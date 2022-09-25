package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119650a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119816bk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119867dh;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ap */
/* compiled from: PG */
final class C126778ap implements C119670b {

    /* renamed from: a */
    final /* synthetic */ C126780ar f349121a;

    public C126778ap(C126780ar arVar) {
        this.f349121a = arVar;
    }

    /* renamed from: a */
    public final C119908e mo40056a(C51809dy dyVar, C119793ao aoVar) {
        C59104x b = C126780ar.f349122a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConversationController");
        ((C59052c) ((C59052c) b).mo56372aa(37149)).mo56389s("startPrefetch: %s", dyVar);
        return new C126777ao(this, dyVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo40057b(C119816bk bkVar) {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo40058c(C119904w wVar) {
        this.f349121a.f349126e.execute(C47810es.m84977q(new C126771ai(this, wVar)));
    }

    /* renamed from: d */
    public final void mo40059d(C119785ag agVar) {
        this.f349121a.f349126e.execute(C47810es.m84977q(new C126774al(this, agVar)));
    }

    /* renamed from: e */
    public final void mo40060e(C119748c cVar) {
        this.f349121a.f349126e.execute(C47810es.m84977q(new C126773ak(this, cVar)));
    }

    /* renamed from: f */
    public final void mo40061f(Throwable th) {
        C59104x d = C126780ar.f349122a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConversationController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37158)).mo56389s("onDisconnected, error=%s", th);
        this.f349121a.f349126e.execute(C47810es.m84977q(new C126776an(this, th)));
    }

    /* renamed from: g */
    public final void mo40062g(C119844cl clVar) {
        C59071e eVar = C126780ar.f349122a;
        C58976aa aaVar = C58975e.f156826a;
        this.f349121a.f349126e.execute(C47810es.m84977q(new C126772aj(this, clVar)));
    }

    /* renamed from: h */
    public final /* synthetic */ void mo40063h(C119837ce ceVar) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo40064i(C119867dh dhVar) {
    }

    /* renamed from: j */
    public final void mo40065j(C119885dz dzVar) {
        this.f349121a.f349126e.execute(C47810es.m84977q(new C126770ah(this, dzVar)));
    }

    /* renamed from: k */
    public final /* synthetic */ C60870cx mo40066k() {
        return C119650a.m198564a();
    }
}
