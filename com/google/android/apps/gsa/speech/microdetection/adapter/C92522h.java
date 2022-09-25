package com.google.android.apps.gsa.speech.microdetection.adapter;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.adapter.h */
/* compiled from: PG */
final class C92522h implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ VoiceInteractionServiceAlwaysOnHotwordAdapter f258214a;

    public C92522h(VoiceInteractionServiceAlwaysOnHotwordAdapter voiceInteractionServiceAlwaysOnHotwordAdapter) {
        this.f258214a = voiceInteractionServiceAlwaysOnHotwordAdapter;
    }

    public final void onNullBinding(ComponentName componentName) {
        C59104x d = VoiceInteractionServiceAlwaysOnHotwordAdapter.f258195a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
        ((C59052c) ((C59052c) d).mo56372aa(12655)).mo56386p("gsaVis null binding. HDM in use.");
        for (C92515a b : (List) this.f258214a.f258199e.get()) {
            b.mo49376b();
        }
        this.f258214a.f258198d.getAndSet(true);
        this.f258214a.f258203i.getAndSet(false);
        try {
            VoiceInteractionServiceAlwaysOnHotwordAdapter voiceInteractionServiceAlwaysOnHotwordAdapter = this.f258214a;
            voiceInteractionServiceAlwaysOnHotwordAdapter.f258196b.unbindService(voiceInteractionServiceAlwaysOnHotwordAdapter.f258201g);
        } catch (IllegalArgumentException e) {
            C59104x c = VoiceInteractionServiceAlwaysOnHotwordAdapter.f258195a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12656)).mo56386p("IllegalArgumentException when unbinding.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.speech.microdetection.adapter.VoiceInteractionServiceAlwaysOnHotwordAdapter r3 = r2.f258214a
            if (r4 != 0) goto L_0x0008
            r4 = 0
            goto L_0x001c
        L_0x0008:
            java.lang.String r0 = "com.google.android.voiceinteraction.IGsaVoiceInteractionService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.voiceinteraction.C45390as
            if (r1 == 0) goto L_0x0016
            r4 = r0
            com.google.android.voiceinteraction.as r4 = (com.google.android.voiceinteraction.C45390as) r4
            goto L_0x001c
        L_0x0016:
            com.google.android.voiceinteraction.aq r0 = new com.google.android.voiceinteraction.aq
            r0.<init>(r4)
            r4 = r0
        L_0x001c:
            r3.f258200f = r4
            com.google.android.apps.gsa.speech.microdetection.adapter.VoiceInteractionServiceAlwaysOnHotwordAdapter r3 = r2.f258214a
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f258198d
            r4 = 0
            r3.getAndSet(r4)
            com.google.android.apps.gsa.speech.microdetection.adapter.VoiceInteractionServiceAlwaysOnHotwordAdapter r3 = r2.f258214a
            r0 = 1
            r3.f258202h = r0
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f258203i
            r3.getAndSet(r4)
            com.google.android.apps.gsa.speech.microdetection.adapter.VoiceInteractionServiceAlwaysOnHotwordAdapter r3 = r2.f258214a
            com.google.android.apps.gsa.speech.microdetection.adapter.g r4 = new com.google.android.apps.gsa.speech.microdetection.adapter.g
            r4.<init>(r2)
            r3.mo87275c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.microdetection.adapter.C92522h.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C58976aa aaVar = C58975e.f156826a;
        this.f258214a.f258202h = false;
    }
}
