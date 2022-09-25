package com.google.android.libraries.assistant.auto.jumpboost.p649a.p652c;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.apps.gsa.projection.p6477a.C84184a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.android.gearhead.sdk.assistant.IntentResult;
import com.google.android.gearhead.sdk.assistant.VoiceSessionResult;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p684f.C11651e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.c.a */
/* compiled from: PG */
public final class C11432a {

    /* renamed from: a */
    private static final C59071e f37205a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.a.c.a");

    /* renamed from: b */
    private final C84184a f37206b;

    /* renamed from: c */
    private final C91097g f37207c;

    public C11432a(C91097g gVar, C84184a aVar) {
        this.f37207c = gVar;
        this.f37206b = aVar;
    }

    /* renamed from: a */
    public final void mo19966a(Intent intent) {
        if (this.f37206b.f229166a == null) {
            ((C59052c) ((C59052c) f37205a.mo56225c()).mo56372aa(43326)).mo56386p("ClientCallbacks were null");
        } else {
            C142660f fVar = this.f37206b.f229166a;
            fVar.getClass();
            if (intent == null) {
                C59104x c = C11651e.f37625a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GearheadIntHelper");
                ((C59052c) ((C59052c) c).mo56372aa(43438)).mo56386p("Intent was null");
            } else {
                IntentResult intentResult = new IntentResult();
                intentResult.f387113a = 1;
                intentResult.f387114b = intent;
                VoiceSessionResult voiceSessionResult = new VoiceSessionResult();
                voiceSessionResult.f387143a = 1;
                voiceSessionResult.f387144b = intentResult;
                try {
                    if (fVar.mo117446h(voiceSessionResult)) {
                        return;
                    }
                } catch (RemoteException e) {
                    C59104x c2 = C11651e.f37625a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "GearheadIntHelper");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(43437)).mo56386p("Client callback onVoiceSessionResult() failed");
                }
            }
        }
        intent.addFlags(268468224);
        this.f37207c.mo65089a(intent);
    }
}
