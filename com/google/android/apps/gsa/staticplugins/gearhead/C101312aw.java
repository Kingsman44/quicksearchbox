package com.google.android.apps.gsa.staticplugins.gearhead;

import android.os.IBinder;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.aw */
/* compiled from: PG */
final class C101312aw implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ C101325be f282725a;

    public C101312aw(C101325be beVar) {
        this.f282725a = beVar;
    }

    public final void binderDied() {
        ((C58970a) ((C58970a) C101325be.f282743a.mo56226d()).mo56372aa(19976)).mo56386p("Client process has died");
        this.f282725a.mo92237n("binderDied()", new C101311av(this));
    }
}
