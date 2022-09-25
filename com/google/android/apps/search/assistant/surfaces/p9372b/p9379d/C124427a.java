package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119650a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119662e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119816bk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119867dh;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124476bs;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124503a;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124504b;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124506d;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124507e;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124508f;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124512j;
import com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9514c.C126916b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a */
/* compiled from: PG */
public final class C124427a implements C119670b {

    /* renamed from: a */
    private static final C59071e f343414a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.d.a");

    /* renamed from: b */
    private final C124512j f343415b;

    /* renamed from: c */
    private final C119662e f343416c;

    public C124427a(C124512j jVar, C119662e eVar) {
        this.f343415b = jVar;
        this.f343416c = eVar;
    }

    /* renamed from: a */
    public final C119908e mo40056a(C51809dy dyVar, C119793ao aoVar) {
        return C126916b.m207603b(this.f343416c).mo104425a(dyVar, aoVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo40057b(C119816bk bkVar) {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo40058c(C119904w wVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = wVar.f333911a;
        C124512j jVar = this.f343415b;
        jVar.mo106445b(new C124508f(jVar, wVar));
    }

    /* renamed from: d */
    public final void mo40059d(C119785ag agVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = agVar.f333650a;
        C124512j jVar = this.f343415b;
        jVar.mo106445b(new C124504b(jVar, agVar));
    }

    /* renamed from: e */
    public final void mo40060e(C119748c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f343415b.mo106446c(C124476bs.CONNECTED);
    }

    /* renamed from: f */
    public final void mo40061f(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f343415b.mo106446c(C124476bs.DISCONNECTED);
        if (th != null) {
            C59104x c = f343414a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ApaConversationCallback");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37052)).mo56386p("Connection to Conversation API got disconnected");
            C124512j jVar = this.f343415b;
            jVar.mo106445b(new C124507e(jVar, th));
            jVar.mo106444a();
            return;
        }
        this.f343415b.mo106444a();
    }

    /* renamed from: g */
    public final void mo40062g(C119844cl clVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = clVar.f333790a;
        C124512j jVar = this.f343415b;
        jVar.mo106445b(new C124506d(jVar, clVar));
    }

    /* renamed from: h */
    public final /* synthetic */ void mo40063h(C119837ce ceVar) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo40064i(C119867dh dhVar) {
    }

    /* renamed from: j */
    public final void mo40065j(C119885dz dzVar) {
        C58976aa aaVar = C58975e.f156826a;
        String str = dzVar.f333868b;
        C124512j jVar = this.f343415b;
        jVar.mo106445b(new C124503a(jVar, dzVar));
    }

    /* renamed from: k */
    public final /* synthetic */ C60870cx mo40066k() {
        return C119650a.m198564a();
    }
}
