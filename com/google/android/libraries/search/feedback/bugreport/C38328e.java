package com.google.android.libraries.search.feedback.bugreport;

import android.content.Context;
import com.google.android.libraries.search.feedback.bugreport.BugReportContentProvider;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.feedback.bugreport.e */
/* compiled from: PG */
public final /* synthetic */ class C38328e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ BugReportContentProvider f101504a;

    /* renamed from: b */
    public final /* synthetic */ Map f101505b;

    public /* synthetic */ C38328e(BugReportContentProvider bugReportContentProvider, Map map) {
        this.f101504a = bugReportContentProvider;
        this.f101505b = map;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void accept(Object obj) {
        BugReportContentProvider bugReportContentProvider = this.f101504a;
        Map map = this.f101505b;
        AccountId accountId = (AccountId) obj;
        Context context = bugReportContentProvider.getContext();
        context.getClass();
        Map.EL.forEach(((BugReportContentProvider.C38320a) C47245e.m84045a(context, BugReportContentProvider.C38320a.class, accountId)).mo41378iU(), new C38327d(map, accountId));
    }
}
