package com.google.android.apps.search.googleapp.discover.feedback;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57097l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.e */
/* compiled from: PG */
public final class C134303e implements C46440f {

    /* renamed from: a */
    final /* synthetic */ FeedbackLauncher f365828a;

    public C134303e(FeedbackLauncher feedbackLauncher) {
        this.f365828a = feedbackLauncher;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        C69664n.m101061g(parcelableProto, "feedbackData");
        C59052c cVar = (C59052c) ((C59052c) FeedbackLauncher.f365749a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40341));
        cVar.mo56386p("Couldn't retrieve account name for logging consent dialog");
        FeedbackLauncher feedbackLauncher = this.f365828a;
        MessageLite a = parcelableProto.mo58938a(C57097l.f152427b, C62921ba.m95368a());
        C69664n.m101060f(a, "feedbackData.getMessage(…tedRegistry()\n          )");
        feedbackLauncher.mo111668h((C57097l) a, false);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
        ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        String str = (String) obj2;
        C69664n.m101061g(parcelableProto, "feedbackData");
        if (str == null) {
            FeedbackLauncher feedbackLauncher = this.f365828a;
            MessageLite a = parcelableProto.mo58938a(C57097l.f152427b, C62921ba.m95368a());
            C69664n.m101060f(a, "feedbackData.getMessage(…dRegistry()\n            )");
            feedbackLauncher.mo111668h((C57097l) a, false);
            return;
        }
        AccountId accountId = this.f365828a.f365751c;
        C134307i iVar = new C134307i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C47243l.m84040b(iVar, str);
        iVar.showNow(this.f365828a.f365750b.getChildFragmentManager(), "FEEDBACK_LOG_CONSENT");
        C47393f.m84232c(iVar, C134305g.class, new C134302d(this.f365828a, parcelableProto));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo18068i(Object obj) {
    }
}
