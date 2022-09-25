package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146025e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.location.s */
/* compiled from: PG */
public final /* synthetic */ class C144971s implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ C146010af f391939a;

    public /* synthetic */ C144971s(C146010af afVar) {
        this.f391939a = afVar;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C146010af afVar = this.f391939a;
        if (abVar.mo122491j()) {
            afVar.f394698a.mo122510x((Location) abVar.mo122488g());
            return null;
        }
        afVar.f394698a.mo122509w((Exception) Objects.requireNonNull(abVar.mo122487f()));
        return null;
    }
}
