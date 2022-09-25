package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gc */
/* compiled from: PG */
public final class C108368gc implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C107698i f301419a;

    /* renamed from: b */
    final /* synthetic */ Query f301420b;

    /* renamed from: c */
    final /* synthetic */ C107710u f301421c;

    public C108368gc(C107698i iVar, Query query, C107710u uVar) {
        this.f301419a = iVar;
        this.f301420b = query;
        this.f301421c = uVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C69664n.m101061g(serviceEventData, "serviceEventData");
        this.f301419a.mo96219b(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
        this.f301419a.mo96218a(this.f301420b.mo84245H(1, true, (QueryTriggerType) null).mo84264aA("and.opa", new Bundle()));
        this.f301421c.mo96221d(this, C88244um.TTS_PLAYBACK_DONE);
    }
}
