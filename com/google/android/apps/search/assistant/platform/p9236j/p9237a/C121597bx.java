package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33509c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33510d;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.bx */
/* compiled from: PG */
public final class C121597bx implements C33509c {

    /* renamed from: a */
    public final C121663t f337380a;

    /* renamed from: b */
    public final Optional f337381b;

    /* renamed from: c */
    public final C33510d f337382c = new C33510d(this);

    public C121597bx(C121663t tVar, Optional optional) {
        C69664n.m101061g(tVar, "apaDirectActionsVisEventsReceiver");
        C69664n.m101061g(optional, "classicDirectActionsVisEventsReceiver");
        this.f337380a = tVar;
        this.f337381b = optional;
    }

    /* renamed from: a */
    public final void mo38938a(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, Optional optional, Optional optional2) {
        C69664n.m101061g(optional, "activityId");
        C69664n.m101061g(optional2, "mappedActivityId");
        this.f337380a.mo74757n(optional);
        C121663t tVar = (C121663t) this.f337381b.orElse(null);
        if (tVar != null) {
            tVar.mo74757n(optional);
        }
    }

    /* renamed from: b */
    public final void mo105260b(int i) {
        this.f337382c.mo38941c();
        this.f337380a.mo74753f(i);
        C121663t tVar = (C121663t) this.f337381b.orElse(null);
        if (tVar != null) {
            tVar.mo74753f(i);
        }
    }
}
