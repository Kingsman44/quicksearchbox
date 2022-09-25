package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.p */
/* compiled from: PG */
public final /* synthetic */ class C130721p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130725t f357904a;

    /* renamed from: b */
    public final /* synthetic */ String f357905b;

    public /* synthetic */ C130721p(C130725t tVar, String str) {
        this.f357904a = tVar;
        this.f357905b = str;
    }

    public final Object apply(Object obj) {
        C130725t tVar = this.f357904a;
        String str = this.f357905b;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).filter(C130723r.f357908a).map(C130724s.f357909a).findFirst();
        tVar.f357911b.mo109938k(str, findFirst.isPresent());
        return findFirst;
    }
}
