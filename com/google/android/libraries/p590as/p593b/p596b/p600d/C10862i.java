package com.google.android.libraries.p590as.p593b.p596b.p600d;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4545b.C59363ad;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.p4543n.p4545b.C59389w;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62970cp;
import com.google.speech.p5218j.C66964g;
import java.util.Collections;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.d.i */
/* compiled from: PG */
public final class C10862i {

    /* renamed from: a */
    public static final C59071e f35925a = C59071e.m91332i("com.google.android.libraries.as.b.b.d.i");

    /* renamed from: a */
    public static C58495hd m25882a(C8476as asVar) {
        C58495hd hdVar = (C58495hd) Collection.EL.stream(asVar.f29428n).collect(C58370cn.m89402b(C10854a.f35916a, C10855b.f35917a));
        C59364ae k = C59364ae.m92266l(Collections.unmodifiableMap(new C62970cp(asVar.f29429o, C8476as.f29414q))).mo56901j(new C10856c(asVar)).mo56902k(new C10857d(hdVar, asVar));
        C59363ad adVar = (C59363ad) k;
        return new C59363ad(((C59389w) k).f157594a, adVar.mo56894d(C10858e.f35921a), adVar.mo56894d(new C10859f(hdVar))).mo56899h();
    }

    /* renamed from: b */
    public static C58528ij m25883b(C8476as asVar) {
        if (asVar.f29429o.size() > 0) {
            return (C58528ij) Collection.EL.stream(Collections.unmodifiableMap(new C62970cp(asVar.f29429o, C8476as.f29414q)).keySet()).filter(new C10860g(asVar)).map(C10861h.f35924a).collect(C58370cn.f155947b);
        }
        return C58528ij.m90006F(new C62963cj(asVar.f29427l, C8476as.f29412m));
    }

    /* renamed from: c */
    public static boolean m25884c(int i, String str, int i2) {
        if (C66964g.m97396a(i) != null) {
            return true;
        }
        C59104x c = f35925a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceSearchConfigUtils");
        ((C59052c) ((C59052c) c).mo56372aa(54005)).mo56359L("Unrecognized domain ID for [%s, %d]: %d. Ignoring this domain and its associated features.", str, Integer.valueOf(i2), Integer.valueOf(i));
        return false;
    }
}
