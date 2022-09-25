package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.search.googleapp.p10370p.C136864bd;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import java.util.Collections;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.shared.v.o */
/* compiled from: PG */
public final /* synthetic */ class C91162o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f254523a;

    public /* synthetic */ C91162o(Instant instant) {
        this.f254523a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f254523a;
        C136866bf bfVar = (C136866bf) obj;
        C58528ij ijVar = C91165r.f254530a;
        C136864bd bdVar = (C136864bd) bfVar.toBuilder();
        boolean z = false;
        for (Long longValue : Collections.unmodifiableMap(bfVar.f372524e).keySet()) {
            long longValue2 = longValue.longValue();
            if (Instant.ofEpochMilli(longValue2).truncatedTo(ChronoUnit.DAYS).isBefore(instant)) {
                bdVar.copyOnWrite();
                ((C136866bf) bdVar.instance).mo113417b().remove(Long.valueOf(longValue2));
                z = true;
            }
        }
        return z ? (C136866bf) bdVar.build() : bfVar;
    }
}
