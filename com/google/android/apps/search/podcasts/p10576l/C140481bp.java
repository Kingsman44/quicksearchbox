package com.google.android.apps.search.podcasts.p10576l;

import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.l.bp */
/* compiled from: PG */
public final /* synthetic */ class C140481bp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140488bw f381566a;

    /* renamed from: b */
    public final /* synthetic */ List f381567b;

    public /* synthetic */ C140481bp(C140488bw bwVar, List list) {
        this.f381566a = bwVar;
        this.f381567b = list;
    }

    public final Object apply(Object obj) {
        C140488bw bwVar = this.f381566a;
        List list = this.f381567b;
        C140448aj ajVar = (C140448aj) ((C140450al) obj).toBuilder();
        C140440ab abVar = (C140440ab) C140441ac.f381485d.createBuilder();
        abVar.mo115674a(list);
        long b = bwVar.f381576c.mo26870b();
        abVar.copyOnWrite();
        ((C140441ac) abVar.instance).f381488b = b;
        abVar.copyOnWrite();
        ((C140441ac) abVar.instance).f381489c = true;
        ajVar.copyOnWrite();
        C140441ac acVar = (C140441ac) abVar.build();
        acVar.getClass();
        ((C140450al) ajVar.instance).f381515a = acVar;
        return (C140450al) ajVar.build();
    }
}
