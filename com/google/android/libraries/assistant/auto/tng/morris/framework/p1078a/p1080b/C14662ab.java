package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C14662ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14668ah f44283a;

    /* renamed from: b */
    public final /* synthetic */ C14749d f44284b;

    public /* synthetic */ C14662ab(C14668ah ahVar, C14749d dVar) {
        this.f44283a = ahVar;
        this.f44284b = dVar;
    }

    public final void run() {
        C14668ah ahVar = this.f44283a;
        C14749d dVar = this.f44284b;
        synchronized (ahVar) {
            ahVar.f44297g = 2;
            ahVar.f44293c = ahVar.f44294d.getString(R.string.trying_to_connect);
        }
        C14668ah.m30746k(ahVar.f44294d.getString(R.string.just_a_moment_tts), dVar);
        C58976aa aaVar = C58975e.f156826a;
        ahVar.f44296f.mo21411b(C37182a.f97922cv.mo40813g(), Optional.empty());
    }
}
