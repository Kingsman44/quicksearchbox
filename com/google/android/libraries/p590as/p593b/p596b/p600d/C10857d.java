package com.google.android.libraries.p590as.p593b.p596b.p600d;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.speech.p5204e.C66498i;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.d.d */
/* compiled from: PG */
public final /* synthetic */ class C10857d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f35919a;

    /* renamed from: b */
    public final /* synthetic */ C8476as f35920b;

    public /* synthetic */ C10857d(C58495hd hdVar, C8476as asVar) {
        this.f35919a = hdVar;
        this.f35920b = asVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C58495hd hdVar = this.f35919a;
        C8476as asVar = this.f35920b;
        C66498i iVar = (C66498i) obj;
        if (hdVar.containsKey(iVar)) {
            return true;
        }
        C59104x c = C10862i.f35925a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceSearchConfigUtils");
        ((C59052c) ((C59052c) c).mo56372aa(54006)).mo56359L("Unrecognized recognizer for [%s, %d]: %d. Ignoring it and its associated features.", asVar.f29417b, Integer.valueOf(asVar.f29419d), Integer.valueOf(iVar.f180859Z));
        return false;
    }
}
