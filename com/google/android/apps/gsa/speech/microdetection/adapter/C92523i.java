package com.google.android.apps.gsa.speech.microdetection.adapter;

import com.google.android.voiceinteraction.C45392au;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.adapter.i */
/* compiled from: PG */
final class C92523i extends C45392au {

    /* renamed from: a */
    final /* synthetic */ String f258215a;

    /* renamed from: b */
    final /* synthetic */ C92516b f258216b;

    /* renamed from: c */
    final /* synthetic */ VoiceInteractionServiceAlwaysOnHotwordAdapter f258217c;

    public C92523i(VoiceInteractionServiceAlwaysOnHotwordAdapter voiceInteractionServiceAlwaysOnHotwordAdapter, String str, C92516b bVar) {
        this.f258217c = voiceInteractionServiceAlwaysOnHotwordAdapter;
        this.f258215a = str;
        this.f258216b = bVar;
    }

    /* renamed from: a */
    public final void mo49509a() {
        VoiceInteractionServiceAlwaysOnHotwordAdapter voiceInteractionServiceAlwaysOnHotwordAdapter = this.f258217c;
        String str = this.f258215a;
        C92516b bVar = this.f258216b;
        voiceInteractionServiceAlwaysOnHotwordAdapter.f258204j = str;
        voiceInteractionServiceAlwaysOnHotwordAdapter.f258205k = -1;
        if (bVar != null) {
            bVar.mo49375a(true);
        }
    }
}
