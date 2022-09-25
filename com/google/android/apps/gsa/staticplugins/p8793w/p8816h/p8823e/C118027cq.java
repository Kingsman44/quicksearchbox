package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87722bd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87723be;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87724bf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.cq */
/* compiled from: PG */
public final class C118027cq {

    /* renamed from: c */
    private static final C59071e f327574c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.e.cq");

    /* renamed from: a */
    C87682aj f327575a;

    /* renamed from: b */
    boolean f327576b;

    /* renamed from: d */
    private final List f327577d = new ArrayList();

    /* renamed from: a */
    public final void mo103499a() {
        C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_NETWORK_STATE);
        C62940bt btVar = C87722bd.f237197a;
        C87723be beVar = (C87723be) C87724bf.f237198c.createBuilder();
        C16730ar arVar = C16730ar.SLOW_CONNECTION;
        beVar.copyOnWrite();
        C87724bf bfVar = (C87724bf) beVar.instance;
        bfVar.f237201b = arVar.f48937e;
        bfVar.f237200a |= 1;
        alVar.mo81965b(btVar, (C87724bf) beVar.build());
        mo103503e(alVar.mo81964a());
    }

    /* renamed from: b */
    public final void mo103500b() {
        mo103503e(new C87684al(C88244um.NOTIFY_COMPLETED_CONVERSATION).mo81964a());
    }

    /* renamed from: d */
    public final synchronized void mo103502d() {
        if (!this.f327577d.isEmpty()) {
            ((C59052c) ((C59052c) f327574c.mo56226d()).mo56372aa(18916)).mo56387q("Dropping %d undelivered events", this.f327577d.size());
        }
        this.f327577d.clear();
        this.f327575a = null;
        this.f327576b = true;
    }

    /* renamed from: e */
    public final synchronized void mo103503e(ServiceEventData serviceEventData) {
        C87682aj ajVar = this.f327575a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(serviceEventData);
        } else if (!this.f327576b) {
            this.f327577d.add(serviceEventData);
        }
    }

    /* renamed from: c */
    public final synchronized void mo103501c(C87682aj ajVar) {
        ajVar.getClass();
        if (this.f327576b) {
            ((C59052c) ((C59052c) f327574c.mo56226d()).mo56372aa(18914)).mo56386p("setCurrentClientCallback called after ServiceEventSender shutdown!");
        }
        for (ServiceEventData b : this.f327577d) {
            ((C86771n) ajVar).mo80379b(b);
        }
        this.f327575a = ajVar;
        this.f327577d.clear();
    }
}
