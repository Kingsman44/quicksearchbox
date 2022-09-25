package com.google.android.libraries.assistant.auto.tng.p1008j.p1012b.p1013a;

import com.google.android.gms.car.C143117ba;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.C13643d;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1010a.C13637a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1011b.C13641b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13646a implements C143117ba {

    /* renamed from: a */
    public final /* synthetic */ C13647b f41685a;

    public /* synthetic */ C13646a(C13647b bVar) {
        this.f41685a = bVar;
    }

    /* renamed from: a */
    public final void mo21199a(byte[] bArr) {
        C13641b bVar;
        C13647b bVar2 = this.f41685a;
        if (bArr == null || bArr.length == 0) {
            C59104x c = C13647b.f41686a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VendorExtensionManager");
            ((C59052c) ((C59052c) c).mo56372aa(44909)).mo56386p("Bytes received are null or have length zero.");
            return;
        }
        try {
            bVar = (C13641b) C62942bv.parseFrom((C62942bv) C13641b.f41678d, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            C59104x c2 = C13647b.f41686a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "VendorExtensionManager");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(44910)).mo56386p("Failed to retrieve auto hotword fulfilment status.");
            bVar = C13641b.f41678d;
        }
        C46459k.m82829b(((C13643d) bVar2.f41687b.mo27525b()).mo21198b(bVar), "Failed to get auto hotword fulfilment status", new Object[0]);
        boolean z = bVar.f41681b;
        C58976aa aaVar = C58975e.f156826a;
        ((C13637a) bVar2.f41688c.mo27525b()).f41676b = z;
    }
}
