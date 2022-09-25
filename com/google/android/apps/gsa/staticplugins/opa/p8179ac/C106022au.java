package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3814ai.p3815a.p3816a.C49172f;
import com.google.assistant.p3814ai.p3815a.p3816a.C49175i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p386ak.C8402r;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.au */
/* compiled from: PG */
public final /* synthetic */ class C106022au implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295978a;

    /* renamed from: b */
    public final /* synthetic */ String f295979b;

    public /* synthetic */ C106022au(C106023av avVar, String str) {
        this.f295978a = avVar;
        this.f295979b = str;
    }

    public final void run() {
        C106023av avVar = this.f295978a;
        String str = this.f295979b;
        C106025ax axVar = avVar.f295980a;
        try {
            C49172f fVar = (C49172f) axVar.f296016n.mo17146d(str, C49172f.class);
            C49175i iVar = fVar.f127149a;
            if (iVar == null) {
                iVar = C49175i.f127151d;
            }
            String str2 = iVar.f127155c;
            if (!axVar.f296017o.containsKey(str2) || !((C49172f) axVar.f296017o.get(str2)).equals(fVar)) {
                axVar.f296017o.put(str2, fVar);
                if (C106044bp.m176654a(fVar)) {
                    axVar.f296018p.put(str2, UUID.randomUUID().toString());
                }
                axVar.mo95217G();
                return;
            }
            C59104x d = C106025ax.f295983a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) d).mo56372aa(24681)).mo56389s("%s with the same message is already expected.", str2);
        } catch (C8402r e) {
            C59104x c = C106025ax.f295983a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24682)).mo56386p("Failed to deserialize ExpectIntentMessage from json to proto.");
        }
    }
}
