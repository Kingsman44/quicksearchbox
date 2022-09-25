package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.search.googleapp.p10370p.C136859az;
import com.google.android.apps.search.googleapp.p10370p.C136864bd;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.shared.v.h */
/* compiled from: PG */
public final /* synthetic */ class C91155h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f254497a;

    /* renamed from: b */
    public final /* synthetic */ C136859az f254498b;

    public /* synthetic */ C91155h(Instant instant, C136859az azVar) {
        this.f254497a = instant;
        this.f254498b = azVar;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f254497a;
        C136859az azVar = this.f254498b;
        C58528ij ijVar = C91165r.f254530a;
        C136864bd bdVar = (C136864bd) ((C136866bf) obj).toBuilder();
        long epochMilli = instant.toEpochMilli();
        azVar.getClass();
        bdVar.copyOnWrite();
        ((C136866bf) bdVar.instance).mo113417b().put(Long.valueOf(epochMilli), azVar);
        return (C136866bf) bdVar.build();
    }
}
