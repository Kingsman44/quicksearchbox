package com.google.android.apps.search.googleapp.p10117aa;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.base.C58817ah;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.aa.q */
/* compiled from: PG */
public final /* synthetic */ class C133132q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Predicate f362943a;

    public /* synthetic */ C133132q(Predicate predicate) {
        this.f362943a = predicate;
    }

    public final Object apply(Object obj) {
        Predicate predicate = this.f362943a;
        C46690ah ahVar = C133103au.f362875a;
        return (Set) Collection.EL.stream(((C133127l) obj).f362935b).filter(predicate).map(C133134s.f362945a).collect(Collectors.toCollection(C133136u.f362948a));
    }
}
