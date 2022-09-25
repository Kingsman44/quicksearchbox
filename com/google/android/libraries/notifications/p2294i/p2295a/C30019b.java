package com.google.android.libraries.notifications.p2294i.p2295a;

import com.google.android.libraries.notifications.C29986f;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;

/* renamed from: com.google.android.libraries.notifications.i.a.b */
/* compiled from: PG */
public final class C30019b {

    /* renamed from: a */
    public C30021d f81240a;

    /* renamed from: a */
    public final void mo35345a(C55540at atVar) {
        C19559g.m37303b();
        C30021d dVar = this.f81240a;
        for (C29820k kVar : dVar.f81241a.mo35089c()) {
            String h = kVar.mo35009h();
            C29986f b = kVar.mo35002b();
            if (b == C29986f.REGISTERED || b == C29986f.PENDING_REGISTRATION || b == C29986f.FAILED_REGISTRATION) {
                dVar.mo35346a(h, true, atVar);
            }
        }
    }
}
