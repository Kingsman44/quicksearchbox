package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.w */
/* compiled from: PG */
public final /* synthetic */ class C101404w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282936a;

    public /* synthetic */ C101404w(C101325be beVar) {
        this.f282936a = beVar;
    }

    public final Object apply(Object obj) {
        C62722b bVar;
        C101325be beVar = this.f282936a;
        if (((Throwable) obj) instanceof CancellationException) {
            bVar = C62722b.CANCELLED;
        } else {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56226d()).mo56372aa(19990)).mo56386p("Assistant request creation failed.");
            bVar = C62722b.INTERNAL;
        }
        beVar.mo92234k(C37179a.f97494bM.mo40815i(bVar));
        return null;
    }
}
