package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.k */
/* compiled from: PG */
public final /* synthetic */ class C35650k implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35650k f93528a = new C35650k();

    private /* synthetic */ C35650k() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            return C36180b.m64579c(C52235kf.CANCELLED, "Fetch future was cancelled");
        }
        if (th instanceof TimeoutException) {
            ((C59052c) ((C59052c) ((C59052c) C35657r.f93534a.mo56226d()).mo56382g(th)).mo56372aa(51743)).mo56389s("%s", "Fetch future timed out");
            return C36180b.m64579c(C52235kf.DEADLINE_EXCEEDED, "Fetch future timed out");
        }
        ((C59052c) ((C59052c) ((C59052c) C35657r.f93534a.mo56226d()).mo56382g(th)).mo56372aa(51742)).mo56386p("Fetch future failed");
        return C36180b.m64579c(C52235kf.INTERNAL, "Fetch failed with ".concat(String.valueOf(th.getMessage())));
    }
}
