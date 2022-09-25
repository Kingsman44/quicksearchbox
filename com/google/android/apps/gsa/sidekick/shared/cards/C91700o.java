package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.p375ai.p378b.C7642eo;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.o */
/* compiled from: PG */
final class C91700o implements C91096f {

    /* renamed from: a */
    final /* synthetic */ C91702q f255788a;

    public C91700o(C91702q qVar) {
        this.f255788a = qVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        if (i == -1) {
            this.f255788a.f255779b.mo86168g().mo86233a(this.f255788a.f255790c, false);
            this.f255788a.f255779b.mo86165e().mo86208b(C7642eo.HOTWORD_ENROLLMENT_REFRESH);
        }
        return false;
    }
}
