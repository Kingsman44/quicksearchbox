package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.p959a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.C13389aa;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35625ar;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35626as;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.assistant.p3897e.p3921j.afb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C13383h implements C13389aa {

    /* renamed from: a */
    public final /* synthetic */ C12801n f41150a;

    /* renamed from: b */
    public final /* synthetic */ C35626as f41151b;

    public /* synthetic */ C13383h(C12801n nVar, C35626as asVar) {
        this.f41150a = nVar;
        this.f41151b = asVar;
    }

    /* renamed from: a */
    public final C35625ar mo21062a(afb afb) {
        C12801n nVar = this.f41150a;
        C35626as asVar = this.f41151b;
        if (!afb.f134989d) {
            return new C13385j(nVar, asVar);
        }
        throw ((C35471g) new C35471g("incorrect reply arg").initCause(new IllegalArgumentException("Incorrect way to reply for surface")));
    }
}
