package com.google.android.apps.gsa.assistant.handoff;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.g */
/* compiled from: PG */
final class C9474g implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C9448ae f32907a;

    /* renamed from: b */
    final /* synthetic */ AssistantHandoffActivity f32908b;

    public C9474g(AssistantHandoffActivity assistantHandoffActivity, C9448ae aeVar) {
        this.f32908b = assistantHandoffActivity;
        this.f32907a = aeVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = AssistantHandoffActivity.f32838a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AssistantHandoffActvt");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(223)).mo56386p("Exception sending results to Handoff service.");
        this.f32908b.setResult(0);
        this.f32908b.finish();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C62912at atVar = (C62912at) obj;
        C59071e eVar = AssistantHandoffActivity.f32838a;
        C58976aa aaVar = C58975e.f156826a;
        this.f32908b.setResult(this.f32907a.mo17692a(), (Intent) this.f32907a.mo17694c().mo56111f());
        this.f32908b.finish();
    }
}
