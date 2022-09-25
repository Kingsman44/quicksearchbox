package com.google.android.apps.gsa.staticplugins.feedback;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.apps.gsa.staticplugins.feedback.service.C101254c;
import com.google.android.apps.gsa.staticplugins.feedback.service.C101255d;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.c */
/* compiled from: PG */
final class C101234c implements C101254c {

    /* renamed from: a */
    final /* synthetic */ Context f282519a;

    /* renamed from: b */
    final /* synthetic */ FeedbackData f282520b;

    /* renamed from: c */
    final /* synthetic */ C101235d f282521c;

    public C101234c(C101235d dVar, Context context, FeedbackData feedbackData) {
        this.f282521c = dVar;
        this.f282519a = context;
        this.f282520b = feedbackData;
    }

    /* renamed from: a */
    public final void mo92183a(C101255d dVar) {
        this.f282521c.f282522b.mo92193a(this.f282519a, dVar, new C90461c()).mo92191i(this.f282520b, true, true);
        dVar.mo92199h();
    }
}
