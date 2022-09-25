package com.google.android.gms.tasks;

import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.tasks.al */
/* compiled from: PG */
public final /* synthetic */ class C146016al implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C144861c f394709a;

    /* renamed from: b */
    public final /* synthetic */ C146010af f394710b;

    /* renamed from: c */
    public final /* synthetic */ C146023c f394711c;

    public /* synthetic */ C146016al(C144861c cVar, C146010af afVar, C146023c cVar2) {
        this.f394709a = cVar;
        this.f394710b = afVar;
        this.f394711c = cVar2;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C144861c cVar = this.f394709a;
        C146010af afVar = this.f394710b;
        C146023c cVar2 = this.f394711c;
        cVar.removeCallbacksAndMessages((Object) null);
        if (abVar.mo122491j()) {
            afVar.f394698a.mo122510x(abVar.mo122488g());
        } else if (((C146014aj) abVar).f394703b) {
            cVar2.f394724a.mo122510x((Object) null);
        } else {
            afVar.f394698a.mo122509w((Exception) Objects.requireNonNull(abVar.mo122487f()));
        }
    }
}
