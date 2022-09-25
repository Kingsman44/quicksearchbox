package com.google.android.libraries.assistant.soda;

import com.google.android.libraries.search.p2904c.p2908b.C37382f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.C67018i;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.i */
/* compiled from: PG */
public final /* synthetic */ class C19341i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19340h f54116a;

    public /* synthetic */ C19341i(C19340h hVar) {
        this.f54116a = hVar;
    }

    public final Object call() {
        C19340h hVar = this.f54116a;
        C59071e eVar = C19343k.f54123a;
        if (hVar != null) {
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            knVar.mo58885m(C67018i.f182180b, C67018i.f182179a);
            synchronized (hVar.f54115a.f53869b) {
                hVar.f54115a.f53872e.mo23782t((C67087ko) knVar.build());
                ((C59052c) ((C59052c) Soda.f53868a.mo56224b()).mo56372aa(47579)).mo56386p("#onDisconnect. AudioAdapterDisconnectSignal sent.");
            }
            ((C59052c) ((C59052c) C19343k.f54123a.mo56224b()).mo56372aa(47602)).mo56386p("#disconnect. onDisconnect called.");
        }
        return C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS;
    }
}
