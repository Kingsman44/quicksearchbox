package com.google.android.gms.pseudonymous;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.pseudonymous.p10861a.C145762a;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.pseudonymous.e */
/* compiled from: PG */
final class C145769e extends C145762a {

    /* renamed from: a */
    private final C146010af f394106a;

    public C145769e(C146010af afVar) {
        this.f394106a = afVar;
    }

    /* renamed from: a */
    public final void mo121926a(Status status, long j) {
        C143811de.m233724a(status, Long.valueOf(j), this.f394106a);
    }

    /* renamed from: b */
    public final void mo121927b(Status status) {
        C143811de.m233724a(status, (Object) null, this.f394106a);
    }

    /* renamed from: c */
    public final void mo121928c(Status status, PseudonymousIdToken pseudonymousIdToken) {
        C143811de.m233724a(status, pseudonymousIdToken, this.f394106a);
    }
}
