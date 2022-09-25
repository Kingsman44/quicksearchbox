package com.google.android.apps.search.googleapp.discover.feedback;

import com.google.android.apps.search.googleapp.discover.p10244v.C135195o;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57097l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.d */
/* compiled from: PG */
final class C134302d implements C47391d {

    /* renamed from: a */
    final /* synthetic */ FeedbackLauncher f365826a;

    /* renamed from: b */
    final /* synthetic */ ProtoParsers.ParcelableProto f365827b;

    public C134302d(FeedbackLauncher feedbackLauncher, ProtoParsers.ParcelableProto parcelableProto) {
        this.f365826a = feedbackLauncher;
        this.f365827b = parcelableProto;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C134305g gVar = (C134305g) bVar;
        FeedbackLauncher feedbackLauncher = this.f365826a;
        if (feedbackLauncher.f365753e && gVar.f365829a) {
            C134301c cVar = feedbackLauncher.f365752d;
            C58976aa aaVar = C58975e.f156826a;
            C135200t tVar = cVar.f365822b;
            C134755f fVar = cVar.f365825e.f366954c;
            C69664n.m101061g(fVar, "streamStorageKey");
            C47633f g = C47633f.m84733g(C71663i.m104692e(tVar.f368291e, (C71424ay) null, new C135195o(tVar, fVar, (C69577g) null), 3));
            C69664n.m101060f(g, "@JvmName(\"getSessionStat…tate(streamStorageKey) })");
            C47633f i = g.mo51516i(new C134263a(cVar), cVar.f365824d);
            C134300b bVar2 = new C134300b();
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(bVar2), C60826bg.f164896a);
        }
        FeedbackLauncher feedbackLauncher2 = this.f365826a;
        MessageLite a = this.f365827b.mo58938a(C57097l.f152427b, C62921ba.m95368a());
        C69664n.m101060f(a, "feedbackData.getMessage(…istry()\n                )");
        feedbackLauncher2.mo111668h((C57097l) a, gVar.f365829a);
        return C47392e.f123115a;
    }
}
