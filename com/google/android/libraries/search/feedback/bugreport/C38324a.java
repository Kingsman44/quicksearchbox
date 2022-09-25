package com.google.android.libraries.search.feedback.bugreport;

import com.google.common.base.C58817ah;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.feedback.bugreport.a */
/* compiled from: PG */
public final /* synthetic */ class C38324a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ BugReportContentProvider f101498a;

    /* renamed from: b */
    public final /* synthetic */ Map f101499b;

    public /* synthetic */ C38324a(BugReportContentProvider bugReportContentProvider, Map map) {
        this.f101498a = bugReportContentProvider;
        this.f101499b = map;
    }

    public final Object apply(Object obj) {
        BugReportContentProvider bugReportContentProvider = this.f101498a;
        HashMap hashMap = new HashMap(this.f101499b);
        Collection.EL.stream((Set) obj).forEach(new C38328e(bugReportContentProvider, hashMap));
        return hashMap;
    }
}
