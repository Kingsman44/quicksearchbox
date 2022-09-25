package com.google.android.apps.gsa.speech.microdetection.adapter;

import android.os.RemoteException;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.adapter.k */
/* compiled from: PG */
final class C92525k extends C90888av {

    /* renamed from: a */
    final /* synthetic */ boolean f258220a;

    /* renamed from: b */
    final /* synthetic */ C92516b f258221b;

    /* renamed from: c */
    final /* synthetic */ VoiceInteractionServiceAlwaysOnHotwordAdapter f258222c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92525k(VoiceInteractionServiceAlwaysOnHotwordAdapter voiceInteractionServiceAlwaysOnHotwordAdapter, boolean z, C92516b bVar) {
        super("Set recognition state", 1, 8);
        this.f258222c = voiceInteractionServiceAlwaysOnHotwordAdapter;
        this.f258220a = z;
        this.f258221b = bVar;
    }

    public final void run() {
        boolean z;
        try {
            if (this.f258220a) {
                VoiceInteractionServiceAlwaysOnHotwordAdapter voiceInteractionServiceAlwaysOnHotwordAdapter = this.f258222c;
                z = voiceInteractionServiceAlwaysOnHotwordAdapter.f258200f.mo49504o(voiceInteractionServiceAlwaysOnHotwordAdapter.f258204j);
            } else {
                z = this.f258222c.f258200f.mo49505p();
            }
        } catch (RemoteException e) {
            C59104x c = VoiceInteractionServiceAlwaysOnHotwordAdapter.f258195a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VISHotwordAdapter");
            ((C59052c) ((C59052c) c).mo56372aa(12659)).mo56389s("Remote Exception %s", e.getMessage());
            z = false;
        }
        if (this.f258221b != null) {
            this.f258222c.f258197c.mo85151p(new C92524j(this, z));
        }
    }
}
