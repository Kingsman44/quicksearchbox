package com.google.android.apps.gsa.p6487s3;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.s3.a */
/* compiled from: PG */
final class C84279a extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C84286d f229353a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84279a(C84286d dVar, Handler handler) {
        super(handler);
        this.f229353a = dVar;
    }

    public final void onChange(boolean z) {
        C84286d dVar = this.f229353a;
        if (dVar.f229369f.moveToNext()) {
            byte[] blob = dVar.f229369f.getBlob(0);
            try {
                C62921ba a = C62921ba.m95368a();
                dVar.f229365b.mo77833d((C66611ci) C62942bv.parseFrom((C62942bv) C66611ci.f181206g, blob, a));
            } catch (C62974ct unused) {
                C59104x d = C84286d.f229364a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FakeNetRecognitionRnr");
                ((C59052c) ((C59052c) d).mo56372aa(7149)).mo56386p("Invalid S3Response.");
                int i = C90755l.f253831a;
            }
        } else {
            C59104x d2 = C84286d.f229364a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "FakeNetRecognitionRnr");
            ((C59052c) ((C59052c) d2).mo56372aa(7148)).mo56386p("pullNextResponse(): No next.");
        }
    }
}
