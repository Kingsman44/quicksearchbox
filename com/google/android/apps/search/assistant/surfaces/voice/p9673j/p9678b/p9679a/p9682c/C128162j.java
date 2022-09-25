package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128218h;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.j */
/* compiled from: PG */
public final /* synthetic */ class C128162j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C128164l f352569a;

    /* renamed from: b */
    public final /* synthetic */ List f352570b;

    /* renamed from: c */
    public final /* synthetic */ C128182n f352571c;

    public /* synthetic */ C128162j(C128164l lVar, List list, C128182n nVar) {
        this.f352569a = lVar;
        this.f352570b = list;
        this.f352571c = nVar;
    }

    public final Object apply(Object obj) {
        C128164l lVar = this.f352569a;
        List list = this.f352570b;
        C128182n nVar = this.f352571c;
        C128218h hVar = (C128218h) ((C128220j) obj).toBuilder();
        Collection.EL.forEach(list, new C128160h(hVar, nVar, lVar.f352580i.mo57444a()));
        return (C128220j) hVar.build();
    }
}
