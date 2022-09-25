package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.an */
/* compiled from: PG */
public final /* synthetic */ class C35621an implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35621an f93474a = new C35621an();

    private /* synthetic */ C35621an() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            return C36180b.m64579c(C52235kf.CANCELLED, "Reply future was cancelled");
        }
        if (th instanceof TimeoutException) {
            ((C59052c) ((C59052c) ((C59052c) C35624aq.f93475a.mo56226d()).mo56382g(th)).mo56372aa(51758)).mo56389s("%s", "Reply future timed out");
            return C36180b.m64579c(C52235kf.DEADLINE_EXCEEDED, "Reply future timed out");
        } else if (th instanceof C35471g) {
            ((C59052c) ((C59052c) ((C59052c) C35624aq.f93475a.mo56226d()).mo56382g(th)).mo56372aa(51757)).mo56386p("Reply has invalid arg");
            return C36180b.m64579c(C52235kf.INVALID_ARGUMENT, C58837ba.m90858g(th.getMessage()));
        } else {
            ((C59052c) ((C59052c) ((C59052c) C35624aq.f93475a.mo56226d()).mo56382g(th)).mo56372aa(51756)).mo56386p("Reply future failed");
            return C36180b.m64579c(C52235kf.INTERNAL, "Reply failed with ".concat(String.valueOf(th.getMessage())));
        }
    }
}
