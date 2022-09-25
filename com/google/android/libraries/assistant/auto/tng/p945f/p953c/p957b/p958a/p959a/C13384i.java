package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.p959a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.C13414z;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35665z;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.assistant.p3897e.p3921j.aeq;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C13384i implements C13414z {

    /* renamed from: a */
    public final /* synthetic */ C12801n f41152a;

    /* renamed from: b */
    public final /* synthetic */ C35665z f41153b;

    public /* synthetic */ C13384i(C12801n nVar, C35665z zVar) {
        this.f41152a = nVar;
        this.f41153b = zVar;
    }

    /* renamed from: a */
    public final C35665z mo21064a(aeq aeq) {
        C12801n nVar = this.f41152a;
        C35665z zVar = this.f41153b;
        if (!aeq.f134951c) {
            return nVar.mo20799b(zVar);
        }
        throw ((C35471g) new C35471g("incorrect mark as read arg").initCause(new IllegalArgumentException("Incorrect way to mark as read for surface")));
    }
}
