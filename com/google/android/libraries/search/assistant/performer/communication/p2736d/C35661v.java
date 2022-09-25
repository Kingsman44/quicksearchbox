package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.v */
/* compiled from: PG */
public final /* synthetic */ class C35661v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f93540a;

    public /* synthetic */ C35661v(boolean z) {
        this.f93540a = z;
    }

    public final Object apply(Object obj) {
        C52070ec ecVar;
        boolean z = this.f93540a;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            ecVar = C36180b.m64579c(C52235kf.CANCELLED, "Mark as read future was cancelled");
        } else if (th instanceof TimeoutException) {
            ((C59052c) ((C59052c) ((C59052c) C35664y.f93541a.mo56226d()).mo56382g(th)).mo56372aa(51749)).mo56389s("%s", "Mark as read future timed out");
            ecVar = C36180b.m64579c(C52235kf.DEADLINE_EXCEEDED, "Mark as read future timed out");
        } else if (th instanceof C35471g) {
            ((C59052c) ((C59052c) ((C59052c) C35664y.f93541a.mo56226d()).mo56382g(th)).mo56372aa(51748)).mo56386p("Mark as read has invalid arg");
            return C36180b.m64579c(C52235kf.INVALID_ARGUMENT, C58837ba.m90858g(th.getMessage()));
        } else {
            ((C59052c) ((C59052c) ((C59052c) C35664y.f93541a.mo56226d()).mo56382g(th)).mo56372aa(51747)).mo56386p("Mark as read future failed");
            ecVar = C36180b.m64579c(C52235kf.INTERNAL, "Mark as read failed with ".concat(String.valueOf(th.getMessage())));
        }
        return z ? C36180b.f94545b : ecVar;
    }
}
