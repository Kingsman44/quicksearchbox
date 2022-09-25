package com.google.android.libraries.search.feedback.bugreport;

import android.content.Context;
import com.google.android.libraries.search.feedback.bugreport.InteractorBugReportContentProvider;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.feedback.bugreport.f */
/* compiled from: PG */
public final /* synthetic */ class C38329f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ InteractorBugReportContentProvider f101506a;

    /* renamed from: b */
    public final /* synthetic */ Map f101507b;

    public /* synthetic */ C38329f(InteractorBugReportContentProvider interactorBugReportContentProvider, Map map) {
        this.f101506a = interactorBugReportContentProvider;
        this.f101507b = map;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void accept(Object obj) {
        InteractorBugReportContentProvider interactorBugReportContentProvider = this.f101506a;
        Map map = this.f101507b;
        AccountId accountId = (AccountId) obj;
        Context context = interactorBugReportContentProvider.getContext();
        context.getClass();
        Map.EL.forEach(((InteractorBugReportContentProvider.C38322a) C47245e.m84045a(context, InteractorBugReportContentProvider.C38322a.class, accountId)).mo41391iW(), new C38330g(map, accountId));
    }
}
