package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.apps.gsa.speech.audio.C92173d;
import com.google.android.apps.gsa.speech.audio.C92185e;
import com.google.android.apps.gsa.speech.audio.C92195f;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.b */
/* compiled from: PG */
final class C92396b extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C90584f f257658a;

    /* renamed from: b */
    final /* synthetic */ C89784a f257659b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f257660c;

    /* renamed from: d */
    final /* synthetic */ C92397c f257661d;

    /* renamed from: e */
    final /* synthetic */ int f257662e = 3;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92396b(C92397c cVar, int i, C90584f fVar, C89784a aVar, SettableFuture settableFuture) {
        super("utterancesDownload", 1, 12);
        this.f257661d = cVar;
        this.f257658a = fVar;
        this.f257659b = aVar;
        this.f257660c = settableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C92397c.f257663a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CloudEnrollmentHlpr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(12489)).mo56386p("Utterances cloud download failed.");
        C89784a aVar = this.f257659b;
        if (aVar != null) {
            aVar.mo49086a(new ArrayList());
        }
        this.f257660c.mo57357o(th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C92173d dVar;
        Map map = (Map) obj;
        if (map == null || map.isEmpty()) {
            C59104x b = C92397c.f257663a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CloudEnrollmentHlpr");
            ((C59052c) ((C59052c) b).mo56372aa(12490)).mo56386p("Utterances not found in the cloud.");
            C89784a aVar = this.f257659b;
            if (aVar != null) {
                aVar.mo49086a(new ArrayList());
            }
            this.f257660c.mo57356n(new ArrayList());
            return;
        }
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (!map.isEmpty()) {
            for (List list : map.values()) {
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        arrayList.size();
        C92397c cVar = this.f257661d;
        C90584f fVar = this.f257658a;
        C59104x b2 = C92397c.f257663a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "CloudEnrollmentHlpr");
        ((C59052c) ((C59052c) b2).mo56372aa(12493)).mo56387q("storeUtterancesOnDevice #%d", arrayList.size());
        C92195f a = ((C92196g) cVar.f257666d.mo27525b()).mo86868a(C92185e.f257011b);
        String F = cVar.f257665c.mo79659F();
        String af = cVar.f257664b.mo83886af();
        for (byte[] bArr : arrayList) {
            if (bArr != null) {
                if (cVar.f257664b.mo83850M()) {
                    dVar = C92173d.TISID_ENROLLMENT;
                } else {
                    dVar = C92195f.m151371a(fVar);
                }
                if (F != null) {
                    a.mo86855b(bArr, F, dVar);
                }
                a.mo86855b(bArr, af, dVar);
            }
        }
        C89784a aVar2 = this.f257659b;
        if (aVar2 != null) {
            aVar2.mo49086a(arrayList);
        }
        this.f257660c.mo57356n(arrayList);
    }
}
