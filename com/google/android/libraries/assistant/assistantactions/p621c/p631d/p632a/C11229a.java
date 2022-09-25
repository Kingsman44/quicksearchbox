package com.google.android.libraries.assistant.assistantactions.p621c.p631d.p632a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11220o;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11228a;
import com.google.assistant.p3745ab.p3755g.C48339n;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.d.a.a */
/* compiled from: PG */
public final class C11229a implements C11228a {

    /* renamed from: a */
    private final C89859i f36639a;

    public C11229a(C89859i iVar) {
        this.f36639a = iVar;
    }

    /* renamed from: a */
    public final void mo19631a() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_ALARM_FLOW_END);
    }

    /* renamed from: b */
    public final void mo19632b() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_ALARM_FLOW_START);
    }

    /* renamed from: c */
    public final void mo19633c() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_CALL_DIFF_ENDPOINT);
    }

    /* renamed from: d */
    public final void mo19634d() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_CALL_SAME_ENDPOINT);
    }

    /* renamed from: e */
    public final void mo19635e() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_CONTACT_LOOKUP_CALL_ACTION);
    }

    /* renamed from: f */
    public final void mo19636f() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_CONTACT_LOOKUP_MSG_ACTION);
    }

    /* renamed from: g */
    public final void mo19637g() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_MSG_DIFF_ENDPOINT);
    }

    /* renamed from: h */
    public final void mo19638h() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_MSG_SAME_ENDPOINT);
    }

    /* renamed from: i */
    public final void mo19639i() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_NOT_APPLIED);
    }

    /* renamed from: j */
    public final void mo19640j() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_RESOLVE_CONTACT_NO_SELECTION);
    }

    /* renamed from: k */
    public final void mo19641k() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_RESOLVE_INSTANCE_NO_SELECTION);
    }

    /* renamed from: l */
    public final void mo19642l() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_RESOLVE_LABEL_NO_SELECTION);
    }

    /* renamed from: m */
    public final void mo19643m() {
        this.f36639a.mo83702b(C89849ae.OPA_AUM_RESOLVE_PROVIDER_NO_SELECTION);
    }

    /* renamed from: n */
    public final void mo19644n() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_CALL_FLOW_END);
    }

    /* renamed from: o */
    public final void mo19645o() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_CALL_FLOW_START);
    }

    /* renamed from: p */
    public final void mo19646p() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_EVENT_FLOW_END);
    }

    /* renamed from: q */
    public final void mo19647q() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_EVENT_FLOW_START);
    }

    /* renamed from: r */
    public final void mo19648r() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_MESSAGE_FLOW_END);
    }

    /* renamed from: s */
    public final void mo19649s() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_MESSAGE_FLOW_START);
    }

    /* renamed from: t */
    public final void mo19650t() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_MESSAGE_TRANSCRIPTION_CHANGED);
    }

    /* renamed from: u */
    public final void mo19651u(String str, String str2, String str3) {
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.OPA_FLUID_ACTION_MESSAGE_TRANSCRIPTION_CHANGED;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        str.getClass();
        cbVar.f160062a |= 16;
        cbVar.f160129j = str;
        C48339n a = C11220o.m26602a(str2, str3);
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        a.getClass();
        cbVar2.f160136q = a;
        cbVar2.f160062a |= 4096;
        fVar.f246203c = (C59687cb) ajVar.build();
        this.f36639a.mo74236a(fVar.mo83699a());
    }

    /* renamed from: v */
    public final void mo19652v() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_MESSAGE_TRANSCRIPTION_NO_CHANGE);
    }

    /* renamed from: w */
    public final void mo19653w() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_REMINDER_FLOW_END);
    }

    /* renamed from: x */
    public final void mo19654x() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_REMINDER_FLOW_START);
    }

    /* renamed from: y */
    public final void mo19655y() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_TIMER_FLOW_END);
    }

    /* renamed from: z */
    public final void mo19656z() {
        this.f36639a.mo83702b(C89849ae.OPA_FLUID_ACTION_TIMER_FLOW_START);
    }
}
