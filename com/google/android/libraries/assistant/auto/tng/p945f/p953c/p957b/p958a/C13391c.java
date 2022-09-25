package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13391c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15481g f41160a;

    public /* synthetic */ C13391c(C15481g gVar) {
        this.f41160a = gVar;
    }

    public final Object apply(Object obj) {
        C15481g gVar = this.f41160a;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            C58976aa aaVar = C58975e.f156826a;
            C13395g.m29663a(C62722b.CANCELLED, gVar);
            C36180b.m64579c(C52235kf.CANCELLED, "NotificationAnnounceExecutor future was cancelled.");
        }
        if (th instanceof TimeoutException) {
            C59104x d = C13395g.f41166a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifAnnounce");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44789)).mo56389s("%s", "NotificationAnnounceExecutor timed out.");
            C13395g.m29663a(C62722b.DEADLINE_EXCEEDED, gVar);
            return C36180b.m64579c(C52235kf.DEADLINE_EXCEEDED, "NotificationAnnounceExecutor timed out.");
        }
        C59104x d2 = C13395g.f41166a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "NotifAnnounce");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(44788)).mo56386p("NotificationAnnounceExecutor failed");
        C13395g.m29663a(C62722b.INTERNAL, gVar);
        return C36180b.m64579c(C52235kf.INTERNAL, "NotificationAnnounceExecutor failed with ".concat(String.valueOf(th.getMessage())));
    }
}
