package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import com.google.assistant.p4016z.C53686ak;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62953e;
import java.io.IOException;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.m */
/* compiled from: PG */
public final /* synthetic */ class C131828m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131829n f360033a;

    /* renamed from: b */
    public final /* synthetic */ Duration f360034b;

    public /* synthetic */ C131828m(C131829n nVar, Duration duration) {
        this.f360033a = nVar;
        this.f360034b = duration;
    }

    public final Object apply(Object obj) {
        C131829n nVar = this.f360033a;
        C58485gu guVar = (C58485gu) obj;
        Instant minus = Instant.ofEpochMilli(nVar.f360036b.mo26870b()).minus(this.f360034b);
        C63087y v = C63088z.m96150v();
        try {
            C58801sm G = guVar.listIterator(0);
            while (G.hasNext()) {
                C53686ak akVar = (C53686ak) G.next();
                C63042fg fgVar = akVar.f140918d;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                if (Instant.ofEpochMilli(C62953e.m95478c(fgVar)).isAfter(minus)) {
                    akVar.writeDelimitedTo(v);
                }
            }
            if (v.mo59164a() != 0) {
                return v.mo59165b().mo59174N();
            }
            throw new IllegalArgumentException("No trace data for this duration");
        } catch (IOException e) {
            throw new IllegalStateException("Write error in trace slicing", e);
        }
    }
}
