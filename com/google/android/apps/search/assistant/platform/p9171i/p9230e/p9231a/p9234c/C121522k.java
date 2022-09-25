package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c;

import android.content.Intent;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.c.k */
/* compiled from: PG */
public final /* synthetic */ class C121522k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121523l f337235a;

    /* renamed from: b */
    public final /* synthetic */ Intent f337236b;

    public /* synthetic */ C121522k(C121523l lVar, Intent intent) {
        this.f337235a = lVar;
        this.f337236b = intent;
    }

    public final void run() {
        C121523l lVar = this.f337235a;
        Intent intent = this.f337236b;
        ((C59052c) ((C59052c) C121525n.f337238a.mo56224b()).mo56372aa(35853)).mo56386p("Received request to perform callback ..");
        int intExtra = intent.getIntExtra("port", 0);
        if (intExtra == 0) {
            ((C59052c) ((C59052c) C121525n.f337238a.mo56226d()).mo56372aa(35854)).mo56386p("Ignored call-back request due to missing target port.");
        } else {
            lVar.f337237a.mo105225d(intExtra);
        }
    }
}
