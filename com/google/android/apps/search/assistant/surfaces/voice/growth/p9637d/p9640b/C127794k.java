package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.k */
/* compiled from: PG */
public final /* synthetic */ class C127794k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f351757a;

    public /* synthetic */ C127794k(Instant instant) {
        this.f351757a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f351757a;
        C81237ab abVar = (C81237ab) obj;
        C81328x xVar = (C81328x) abVar.toBuilder();
        int i = abVar.f222389h;
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a |= 4;
        abVar2.f222389h = i + 1;
        xVar.copyOnWrite();
        ((C81237ab) xVar.instance).f222391j = C81237ab.emptyLongList();
        xVar.mo74996a(C127804u.m208820c(abVar.f222391j, Long.valueOf(instant.toEpochMilli())));
        return (C81237ab) xVar.build();
    }
}
