package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cv */
/* compiled from: PG */
public final /* synthetic */ class C35593cv implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35593cv f93428a = new C35593cv();

    private /* synthetic */ C35593cv() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        C59071e eVar = C35666da.f93543a;
        if (th instanceof CancellationException) {
            return C36180b.m64579c(C52235kf.CANCELLED, "Fetch location state future was cancelled");
        }
        if (th instanceof TimeoutException) {
            ((C59052c) ((C59052c) ((C59052c) C35666da.f93543a.mo56226d()).mo56382g(th)).mo56372aa(51660)).mo56389s("%s", "Fetch location state future timed out");
            return C36180b.m64579c(C52235kf.DEADLINE_EXCEEDED, "Fetch location state future timed out");
        }
        ((C59052c) ((C59052c) ((C59052c) C35666da.f93543a.mo56226d()).mo56382g(th)).mo56372aa(51659)).mo56386p("Fetch location future failed with internal error");
        return C36180b.m64579c(C52235kf.INTERNAL, "Fetch failed with ".concat(String.valueOf(th.getMessage())));
    }
}
