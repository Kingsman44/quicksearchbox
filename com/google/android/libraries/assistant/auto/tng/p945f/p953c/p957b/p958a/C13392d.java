package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aaa;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C13392d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13395g f41161a;

    /* renamed from: b */
    public final /* synthetic */ C15481g f41162b;

    /* renamed from: c */
    public final /* synthetic */ aaa f41163c;

    /* renamed from: d */
    public final /* synthetic */ C13394f f41164d;

    public /* synthetic */ C13392d(C13395g gVar, C15481g gVar2, aaa aaa, C13394f fVar) {
        this.f41161a = gVar;
        this.f41162b = gVar2;
        this.f41163c = aaa;
        this.f41164d = fVar;
    }

    public final C60870cx apply(Object obj) {
        C13395g gVar = this.f41161a;
        C15481g gVar2 = this.f41162b;
        aaa aaa = this.f41163c;
        C13394f fVar = this.f41164d;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C13395g.m29663a(C62722b.INTERNAL, gVar2);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Received an absent snapshot from MessageSnapshotCache."));
        }
        C58485gu a = ((C34890k) axVar.mo56107c()).mo39602a();
        if (a.isEmpty()) {
            C13395g.m29663a(C62722b.INTERNAL, gVar2);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Received an empty BundledMessageNotification list from MessageSnapshotCache."));
        }
        int i = aaa.f134624b;
        if (i >= a.size()) {
            C13395g.m29663a(C62722b.OUT_OF_RANGE, gVar2);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.OUT_OF_RANGE, "NotificationAnnounceArgs index is out of range."));
        }
        C13375a aVar = (C13375a) fVar;
        String str = aVar.f41133c;
        C60870cx c = aVar.f41134d.mo21075c((BundledMessageNotification) a.get(i), str, "notification_announce_v2");
        C13393e eVar = new C13393e(gVar2);
        Class<Throwable> cls = Throwable.class;
        C60870cx h = C60846c.m92879h(c, cls, C47810es.m84966f(eVar), gVar.f41167b);
        C13390b bVar = new C13390b(gVar2);
        C60870cx g = C60922j.m93044g(h, C47810es.m84963c(bVar), gVar.f41167b);
        C13391c cVar = new C13391c(gVar2);
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(cVar), gVar.f41167b);
    }
}
