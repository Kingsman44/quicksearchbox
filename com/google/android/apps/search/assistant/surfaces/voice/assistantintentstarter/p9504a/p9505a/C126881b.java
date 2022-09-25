package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.p9505a;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity.TransparentActivity;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity.TransparentTngActivity;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9506b.C126904a;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9507c.p9508a.C126905a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126978e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127043a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127045c;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127046d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127110b;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.aml;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.a.b */
/* compiled from: PG */
final class C126881b implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C126885f f349358a;

    /* renamed from: b */
    final /* synthetic */ Intent f349359b;

    public C126881b(C126885f fVar, Intent intent) {
        this.f349358a = fVar;
        this.f349359b = intent;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        Intent intent;
        C128258a aVar = (C128258a) obj;
        if (aVar == null || C126880a.f349357a[aVar.ordinal()] != 1) {
            new StringBuilder("Unable to unlock keyguard with keyguardDismissState:  ").append(aVar);
            throw new RuntimeException("Unable to unlock keyguard with keyguardDismissState:  ".concat(String.valueOf(aVar)));
        }
        int i = C126885f.f349364e;
        C58976aa aaVar = C58975e.f156826a;
        C126885f fVar = this.f349358a;
        Intent intent2 = this.f349359b;
        if (C69764m.m101228g("opa-android://send_feedback", intent2.getDataString(), true)) {
            C126904a aVar2 = fVar.f349370c;
            C69664n.m101061g(intent2, "intent");
            if (aVar2.f349417c) {
                intent = new Intent(aVar2.f349415a, TransparentTngActivity.class);
                C45963aa.m82131a(intent, aVar2.f349416b);
            } else {
                intent = new Intent(aVar2.f349415a, TransparentActivity.class);
            }
            intent.setFlags(268435456);
            C47810es.m84979s(aVar2.f349415a, intent);
        } else {
            C69664n.m101061g(intent2, "intent");
            String stringExtra = intent2.getStringExtra("com.google.opa.QUERY");
            if (stringExtra == null || stringExtra.length() == 0) {
                intent2.addFlags(268435456);
                fVar.mo107836d(intent2);
                return C60866ct.f164955a;
            }
            C126905a aVar3 = fVar.f349369b;
            C69664n.m101061g(intent2, "intent");
            String stringExtra2 = intent2.getStringExtra("com.google.opa.QUERY");
            if (stringExtra2 == null) {
                stringExtra2 = BuildConfig.FLAVOR;
            }
            if (stringExtra2.length() != 0) {
                C127454b bVar = C127454b.INLINE_REFINEMENT_QUERY;
                amm amm = (amm) C51682amp.f135384d.createBuilder();
                C69664n.m101060f(amm, "newBuilder()");
                aml a = C69664n.m101061g(amm, "builder");
                a.mo53708c(stringExtra2);
                a.mo53707b(amo.TRUSTED);
                C127110b c = C127407d.m208363c(bVar, a.mo53706a());
                C69664n.m101060f(c, "textQuery(\n        SelfT…TRUSTED\n        }\n      )");
                C126978e eVar = aVar3.f349418a;
                C127043a aVar4 = (C127043a) C127046d.f349837e.createBuilder();
                C119851cs csVar = c.f350003b;
                if (csVar == null) {
                    csVar = C119851cs.f333803i;
                }
                aVar4.copyOnWrite();
                C127046d dVar = (C127046d) aVar4.instance;
                csVar.getClass();
                dVar.f349840b = csVar;
                dVar.f349839a |= 2;
                C127045c cVar = c.f350004c;
                if (cVar == null) {
                    cVar = C127045c.f349832d;
                }
                aVar4.copyOnWrite();
                C127046d dVar2 = (C127046d) aVar4.instance;
                cVar.getClass();
                dVar2.f349842d = cVar;
                dVar2.f349839a |= 8;
                C46459k.m82829b(eVar.mo107878a((C127046d) aVar4.build()), "AssistantIntentStarter: Failed to process InlineRefinement query", new Object[0]);
            } else {
                new StringBuilder("query extra should not be null, intent: ").append(intent2);
                throw new IllegalArgumentException("query extra should not be null, intent: ".concat(String.valueOf(intent2)));
            }
        }
        return C60866ct.f164955a;
    }
}
