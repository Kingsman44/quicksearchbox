package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.search.googleapp.p10370p.C136855av;
import com.google.android.apps.search.googleapp.p10370p.C136856aw;
import com.google.android.apps.search.googleapp.p10370p.C136864bd;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import java.util.Collections;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.shared.v.b */
/* compiled from: PG */
public final /* synthetic */ class C91149b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f254484a;

    public /* synthetic */ C91149b(Instant instant) {
        this.f254484a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f254484a;
        C136866bf bfVar = (C136866bf) obj;
        C58528ij ijVar = C91165r.f254530a;
        C136864bd bdVar = (C136864bd) bfVar.toBuilder();
        boolean z = false;
        for (Map.Entry entry : Collections.unmodifiableMap(Collections.unmodifiableMap(((C136866bf) bdVar.instance).f372521b)).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            C136855av avVar = (C136855av) ((C136856aw) entry.getValue()).toBuilder();
            for (Long longValue : Collections.unmodifiableMap(((C136856aw) entry.getValue()).f372504d).keySet()) {
                long longValue2 = longValue.longValue();
                if (Instant.ofEpochMilli(longValue2).truncatedTo(ChronoUnit.DAYS).isBefore(instant)) {
                    avVar.copyOnWrite();
                    ((C136856aw) avVar.instance).mo113414a().remove(Long.valueOf(longValue2));
                    z = true;
                }
            }
            bdVar.mo113415a(intValue, (C136856aw) avVar.build());
        }
        return z ? (C136866bf) bdVar.build() : bfVar;
    }
}
