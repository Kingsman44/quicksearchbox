package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.a */
/* compiled from: PG */
public final /* synthetic */ class C90361a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C90374h f252381a;

    /* renamed from: b */
    public final /* synthetic */ Duration f252382b;

    public /* synthetic */ C90361a(C90374h hVar, Duration duration) {
        this.f252381a = hVar;
        this.f252382b = duration;
    }

    public final Object apply(Object obj) {
        C90374h hVar = this.f252381a;
        return (List) Collection.EL.stream((List) obj).filter(new C90368b(hVar, this.f252382b)).sorted(Comparator.CC.comparing(new C90369c(hVar))).collect(Collectors.toList());
    }
}
