package com.google.android.apps.gsa.assistant.handoff;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.e */
/* compiled from: PG */
public final /* synthetic */ class C9472e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ AssistantHandoffActivity f32905a;

    public /* synthetic */ C9472e(AssistantHandoffActivity assistantHandoffActivity) {
        this.f32905a = assistantHandoffActivity;
    }

    public final void run() {
        String str;
        AssistantHandoffActivity assistantHandoffActivity = this.f32905a;
        Intent intent = assistantHandoffActivity.getIntent();
        C58833ax b = C9450ag.m23975a(intent).mo56106b(new C9445ab(assistantHandoffActivity.f32844g, intent));
        if (!b.mo56113h()) {
            C59104x c = AssistantHandoffActivity.f32838a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AssistantHandoffActvt");
            ((C59052c) ((C59052c) c).mo56372aa(227)).mo56386p("No handoff input");
            return;
        }
        for (C9444aa aaVar : assistantHandoffActivity.f32845h) {
            C58833ax b2 = aaVar.mo17686b(assistantHandoffActivity, (C9447ad) b.mo56107c());
            if (b2.mo56113h()) {
                if (!aaVar.f32859d) {
                    if (intent.getData() == null || TextUtils.isEmpty(intent.getData().getQueryParameter("state"))) {
                        str = intent.hasExtra("state") ? intent.getStringExtra("state") : null;
                    } else {
                        str = intent.getData().getQueryParameter("state");
                    }
                    assistantHandoffActivity.f32850m = str;
                    int a = AssistantHandoffActivity.m23957a(intent, "resume");
                    int i = 3;
                    int i2 = 0;
                    int i3 = a != 0 ? a != 1 ? a != 2 ? 0 : 3 : 2 : 1;
                    assistantHandoffActivity.f32848k = i3 == 0 ? 0 : i3 - 1;
                    int a2 = AssistantHandoffActivity.m23957a(intent, "resume_type");
                    if (a2 == 0) {
                        i = 1;
                    } else if (a2 == 1) {
                        i = 2;
                    } else if (a2 != 2) {
                        i = 0;
                    }
                    if (i != 0) {
                        i2 = i - 1;
                    }
                    assistantHandoffActivity.f32849l = i2;
                    assistantHandoffActivity.startActivityForResult((Intent) b2.mo56107c(), aaVar.f32858c.f32951j);
                    aaVar.f32859d = true;
                    return;
                }
                return;
            }
        }
        for (C9444aa aaVar2 : assistantHandoffActivity.f32845h) {
            if (aaVar2.f32859d) {
                return;
            }
        }
        Intent intent2 = new Intent(assistantHandoffActivity.getIntent());
        intent2.setClass(assistantHandoffActivity, BrowserControlActivity.class);
        intent2.setFlags(intent2.getFlags() & -2);
        intent2.setFlags(intent2.getFlags() & -3);
        if (assistantHandoffActivity.f32840c) {
            C58833ax axVar = (C58833ax) AssistantHandoffActivity.f32839b.getAndSet(C58836b.f156633a);
            if (axVar.mo56113h()) {
                C58976aa aaVar3 = C58975e.f156826a;
                assistantHandoffActivity.setResult(-1, (Intent) axVar.mo56107c());
            }
            assistantHandoffActivity.finish();
            return;
        }
        assistantHandoffActivity.f32840c = true;
        assistantHandoffActivity.f32843f.mo65090b(intent2, new C9475h(assistantHandoffActivity));
    }
}
