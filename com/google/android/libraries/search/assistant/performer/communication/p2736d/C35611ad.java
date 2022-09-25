package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.ad */
/* compiled from: PG */
public final /* synthetic */ class C35611ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35617aj f93457a;

    /* renamed from: b */
    public final /* synthetic */ boolean f93458b;

    public /* synthetic */ C35611ad(C35617aj ajVar, boolean z) {
        this.f93457a = ajVar;
        this.f93458b = z;
    }

    public final Object apply(Object obj) {
        C52070ec ecVar;
        C35617aj ajVar = this.f93457a;
        boolean z = this.f93458b;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            C58976aa aaVar = C58975e.f156826a;
            ajVar.mo21078c(C62722b.CANCELLED);
            C36180b.m64579c(C52235kf.CANCELLED, "ReadExecutor future was cancelled.");
        }
        if (th instanceof TimeoutException) {
            C59104x d = C35616ai.f93468a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReadExecutor");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(51753)).mo56389s("%s", "ReadExecutor timed out.");
            ajVar.mo21078c(C62722b.DEADLINE_EXCEEDED);
            ecVar = C36180b.m64579c(C52235kf.DEADLINE_EXCEEDED, "ReadExecutor timed out.");
        } else {
            C59104x d2 = C35616ai.f93468a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ReadExecutor");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(51752)).mo56386p("ReadExecutor failed");
            ajVar.mo21078c(C62722b.INTERNAL);
            ecVar = C36180b.m64579c(C52235kf.INTERNAL, "ReadExecutor failed with ".concat(String.valueOf(th.getMessage())));
        }
        return z ? C36180b.f94545b : ecVar;
    }
}
