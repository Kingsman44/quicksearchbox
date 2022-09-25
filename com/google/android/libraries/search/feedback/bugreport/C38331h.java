package com.google.android.libraries.search.feedback.bugreport;

import com.google.common.base.C58817ah;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.feedback.bugreport.h */
/* compiled from: PG */
public final /* synthetic */ class C38331h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ InteractorBugReportContentProvider f101510a;

    /* renamed from: b */
    public final /* synthetic */ Map f101511b;

    public /* synthetic */ C38331h(InteractorBugReportContentProvider interactorBugReportContentProvider, Map map) {
        this.f101510a = interactorBugReportContentProvider;
        this.f101511b = map;
    }

    public final Object apply(Object obj) {
        InteractorBugReportContentProvider interactorBugReportContentProvider = this.f101510a;
        HashMap hashMap = new HashMap(this.f101511b);
        Collection.EL.stream((Set) obj).forEach(new C38329f(interactorBugReportContentProvider, hashMap));
        return hashMap;
    }
}
