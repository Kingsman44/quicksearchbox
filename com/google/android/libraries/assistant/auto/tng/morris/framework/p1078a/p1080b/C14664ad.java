package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C14664ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14668ah f44286a;

    /* renamed from: b */
    public final /* synthetic */ C14749d f44287b;

    public /* synthetic */ C14664ad(C14668ah ahVar, C14749d dVar) {
        this.f44286a = ahVar;
        this.f44287b = dVar;
    }

    public final void run() {
        C14668ah ahVar = this.f44286a;
        C14749d dVar = this.f44287b;
        synchronized (ahVar) {
            ahVar.f44297g = 4;
            ahVar.mo21641l();
            ahVar.f44293c = ahVar.f44294d.getString(R.string.can_not_connect);
        }
        C14668ah.m30746k(ahVar.f44294d.getString(R.string.connection_issue_tts), dVar);
        C58976aa aaVar = C58975e.f156826a;
    }
}
