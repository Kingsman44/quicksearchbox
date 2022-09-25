package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dk */
/* compiled from: PG */
public final /* synthetic */ class C35676dk implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35676dk f93564a = new C35676dk();

    private /* synthetic */ C35676dk() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            C58976aa aaVar = C58975e.f156826a;
            return C36180b.m64579c(C52235kf.CANCELLED, "Fetch navigation state future was cancelled");
        } else if (th instanceof TimeoutException) {
            C59104x d = C35678dm.f93566a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NavigationStateFetcher");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(51695)).mo56389s("%s", "Fetch navigation state future timed out");
            return C36180b.m64579c(C52235kf.DEADLINE_EXCEEDED, "Fetch navigation state future timed out");
        } else {
            C59104x d2 = C35678dm.f93566a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NavigationStateFetcher");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(51694)).mo56386p("Fetch future failed");
            return C36180b.m64579c(C52235kf.INTERNAL, "Fetch failed with ".concat(String.valueOf(th.getMessage())));
        }
    }
}
