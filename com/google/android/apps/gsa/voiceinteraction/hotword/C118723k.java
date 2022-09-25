package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.os.SharedMemory;
import com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData;
import com.google.android.libraries.assistant.hotword.data.HotwordData;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.k */
/* compiled from: PG */
public final /* synthetic */ class C118723k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118724l f331171a;

    public /* synthetic */ C118723k(C118724l lVar) {
        this.f331171a = lVar;
    }

    public final void run() {
        C118724l lVar = this.f331171a;
        synchronized (lVar.f331172a.f331174b) {
            C118725m mVar = lVar.f331172a;
            HotwordData hotwordData = mVar.f331184l;
            if (hotwordData != null && mVar.f331187o != null) {
                byte[] bArr = ((AutoValue_HotwordData) hotwordData).f52057c;
                SharedMemory b = C118726n.m197094b(bArr, ((AutoValue_HotwordData) hotwordData).f52056b);
                if (b != null) {
                    C118725m mVar2 = lVar.f331172a;
                    C118715c cVar = mVar2.f331187o;
                    int length = bArr.length;
                    HotwordData hotwordData2 = mVar2.f331184l;
                    mVar2.f331175c = cVar.mo103903a(C118726n.m197093a(length, ((AutoValue_HotwordData) hotwordData2).f52056b, C118725m.m197081j(hotwordData2)), b, lVar.f331172a.f331186n);
                } else {
                    ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34124)).mo56386p("Cannot create the SharedMemory, so cannot recreate detector.");
                }
            } else if (hotwordData == null) {
                ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34122)).mo56386p("No hotword data, so cannot recreate detector.");
            } else {
                ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34121)).mo56386p("No callback provided, cannot recreate HotwordDetector.");
            }
        }
    }
}
