package com.google.android.apps.search.googleapp.notifications.feedback;

import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C63086x;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.feedback.d */
/* compiled from: PG */
public final class C136774d implements C45987ay {

    /* renamed from: a */
    public static final C59071e f372311a = C59071e.m91331h();

    /* renamed from: b */
    public final InvokeSendFeedbackActivity f372312b;

    /* renamed from: c */
    public final C47477n f372313c;

    /* renamed from: d */
    private final C45989b f372314d;

    /* renamed from: e */
    private final C133155c f372315e;

    public C136774d(InvokeSendFeedbackActivity invokeSendFeedbackActivity, C47477n nVar, C45989b bVar, C133155c cVar) {
        C69664n.m101061g(bVar, "accountController");
        this.f372312b = invokeSendFeedbackActivity;
        this.f372313c = nVar;
        this.f372314d = bVar;
        this.f372315e = cVar;
        cVar.mo110998a(invokeSendFeedbackActivity, this, bVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo19982a(C45985aw awVar) {
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) f372311a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40822));
        cVar.mo56386p("#onAccountError");
        this.f372312b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }

    /* renamed from: e */
    public final C46667e mo113358e(C63088z zVar) {
        if (((C63086x) zVar).f170239a.length <= 5120) {
            return C46667e.KEY_VALUE;
        }
        return C46667e.TEXT;
    }
}
