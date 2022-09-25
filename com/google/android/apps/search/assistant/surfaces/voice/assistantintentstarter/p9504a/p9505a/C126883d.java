package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.p9505a;

import android.content.Intent;
import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.aistrampolineactivity.AisTrampolineActivity;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9509d.C126907b;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.a.d */
/* compiled from: PG */
final class C126883d implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C126885f f349361a;

    /* renamed from: b */
    final /* synthetic */ Intent f349362b;

    public C126883d(C126885f fVar, Intent intent) {
        this.f349361a = fVar;
        this.f349362b = intent;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C128258a aVar = (C128258a) obj;
        if (aVar == null || C126882c.f349360a[aVar.ordinal()] != 1) {
            new StringBuilder("Unable to unlock keyguard with keyguardDismissState:  ").append(aVar);
            throw new RuntimeException("Unable to unlock keyguard with keyguardDismissState:  ".concat(String.valueOf(aVar)));
        }
        int i = C126885f.f349364e;
        C58976aa aaVar = C58975e.f156826a;
        C126885f fVar = this.f349361a;
        Intent intent = this.f349362b;
        int andIncrement = fVar.f349371d.f349422a.getAndIncrement();
        C60870cx a = C2169h.m6027a(new C126907b(fVar.f349371d, andIncrement));
        Bundle bundle = new Bundle();
        bundle.putParcelable("CLIENT_INTENT", intent);
        Intent addFlags = new Intent(fVar.f349368a, AisTrampolineActivity.class).putExtras(bundle).putExtra("requestCode", andIncrement).addFlags(402653184);
        C69664n.m101060f(addFlags, "Intent(context, AisTramp…G_ACTIVITY_MULTIPLE_TASK)");
        fVar.mo107836d(addFlags);
        return a;
    }
}
