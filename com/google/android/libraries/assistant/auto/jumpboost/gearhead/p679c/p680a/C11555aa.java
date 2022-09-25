package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import android.os.RemoteException;
import com.google.android.apps.auto.p450a.p451a.C8893bk;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C11555aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C142660f f37464a;

    public /* synthetic */ C11555aa(C142660f fVar) {
        this.f37464a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C142660f fVar = this.f37464a;
        if (((Integer) obj).intValue() >= 4) {
            try {
                return C60856cj.m92900i((C8893bk) C62942bv.parseFrom((C62942bv) C8893bk.f30858l, fVar.mo117447i(), C62921ba.m95368a()));
            } catch (RemoteException | C62974ct e) {
                C59104x d = C11570ap.f37483a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(43382)).mo56386p("Couldn't log Gearhead session info.");
                return C60856cj.m92899h(e);
            }
        } else {
            C59104x d2 = C11570ap.f37483a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(43381)).mo56386p("Minimum API version of 4 required to log Gearhead session info.");
            return C60856cj.m92899h(new UnsupportedOperationException("Minimum API version of 4 required"));
        }
    }
}
