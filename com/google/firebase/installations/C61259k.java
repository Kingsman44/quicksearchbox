package com.google.firebase.installations;

import com.google.android.gms.tasks.C146010af;
import com.google.firebase.installations.p4616b.C61239f;

/* renamed from: com.google.firebase.installations.k */
/* compiled from: PG */
final class C61259k implements C61263o {

    /* renamed from: a */
    private final C61264p f165698a;

    /* renamed from: b */
    private final C146010af f165699b;

    public C61259k(C61264p pVar, C146010af afVar) {
        this.f165698a = pVar;
        this.f165699b = afVar;
    }

    /* renamed from: a */
    public final boolean mo57873a(Exception exc) {
        this.f165699b.f394698a.mo122509w(exc);
        return true;
    }

    /* renamed from: b */
    public final boolean mo57874b(C61239f fVar) {
        if (!fVar.mo57835l() || this.f165698a.mo57876c(fVar)) {
            return false;
        }
        C146010af afVar = this.f165699b;
        String d = fVar.mo57823d();
        if (d != null) {
            afVar.f394698a.mo122508v(new C61231a(d, fVar.mo57820a(), fVar.mo57821b()));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
