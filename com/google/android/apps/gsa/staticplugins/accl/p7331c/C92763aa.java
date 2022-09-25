package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119052h;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.aa */
/* compiled from: PG */
public final /* synthetic */ class C92763aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119053i f258878a;

    public /* synthetic */ C92763aa(C119053i iVar) {
        this.f258878a = iVar;
    }

    public final void run() {
        C119053i iVar = this.f258878a;
        if (!iVar.f332140a.f332120a.f232931a.isDone()) {
            C119052h hVar = iVar.f332140a;
            hVar.f332120a.f232931a.mo57357o(new C90452a(211, C89885b.OPA_VOICE_SEARCH_DONE_WITHOUT_RESULT.f246280a));
        }
    }
}
