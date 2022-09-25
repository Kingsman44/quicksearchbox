package com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3150d;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40354g;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3147a.C40497a;
import com.google.android.libraries.silk.p3205a.p3221j.C41724a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4305j.C56714b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4305j.C56716d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56850f;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.a.d.a */
/* compiled from: PG */
public final class C40500a implements C41724a {

    /* renamed from: a */
    private static final C56848d f106262a;

    /* renamed from: b */
    private final C47477n f106263b;

    /* renamed from: c */
    private final C40354g f106264c;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C56850f a = C69664n.m101061g(cVar, "builder");
        a.mo54435c("invalid_product_specific_data");
        a.mo54434b("A PSD is missing the key or the value.");
        f106262a = a.mo54433a();
    }

    public C40500a(C47477n nVar, C40354g gVar) {
        C69664n.m101061g(gVar, "featureAttributionId");
        this.f106263b = nVar;
        this.f106264c = gVar;
    }

    /* renamed from: b */
    public static final C46669g m70215b(String str, boolean z) {
        C69664n.m101061g(str, "value");
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.KEY_VALUE);
        aVar.f121916a = C63088z.m96143E(str);
        if (z) {
            aVar.mo50684b(true);
        } else {
            aVar.mo50684b(false);
        }
        C46669g a = aVar.mo50683a();
        C69664n.m101060f(a, "debugDataBuilder.build()");
        return a;
    }

    /* renamed from: a */
    public final C60870cx mo42468a(C56716d dVar) {
        C69664n.m101061g(dVar, "request");
        try {
            C47477n nVar = this.f106263b;
            C47474k g = C47475l.m84477g();
            ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
            g.mo51310d(true);
            String str = dVar.f151384a;
            C69664n.m101060f(str, "request.context");
            g.mo51333f("Silk Feedback Context", m70215b(str, false));
            C40497a.m70211a(g, this.f106264c);
            C62971cq<C56714b> cqVar = dVar.f151385b;
            C69664n.m101060f(cqVar, "request.productSpecificDataList");
            for (C56714b bVar : cqVar) {
                int i = bVar.f151378a;
                if ((i & 1) == 0 || (i & 2) == 0) {
                    throw new C41742a(f106262a);
                }
                String str2 = bVar.f151379b;
                String str3 = bVar.f151380c;
                C69664n.m101060f(str3, "it.value");
                g.mo51333f(str2, m70215b(str3, bVar.f151381d));
            }
            C47475l e = g.mo51332e();
            C69664n.m101060f(e, "feedbackOptionsBuilder.build()");
            nVar.mo51336a(e);
            return C60866ct.f164955a;
        } catch (C41742a e2) {
            return C60856cj.m92899h(e2);
        }
    }
}
