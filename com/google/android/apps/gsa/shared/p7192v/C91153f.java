package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.search.googleapp.p10370p.C136864bd;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.shared.v.f */
/* compiled from: PG */
public final /* synthetic */ class C91153f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21370a f254494a;

    public /* synthetic */ C91153f(C21370a aVar) {
        this.f254494a = aVar;
    }

    public final Object apply(Object obj) {
        C21370a aVar = this.f254494a;
        C58528ij ijVar = C91165r.f254530a;
        C136864bd bdVar = (C136864bd) ((C136866bf) obj).toBuilder();
        if (!((C136866bf) bdVar.instance).f372523d) {
            return (C136866bf) bdVar.build();
        }
        long epochMilli = Instant.ofEpochMilli(aVar.mo26870b()).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
        bdVar.copyOnWrite();
        C136866bf bfVar = (C136866bf) bdVar.instance;
        bfVar.f372520a |= 1;
        bfVar.f372522c = epochMilli;
        return (C136866bf) bdVar.build();
    }
}
