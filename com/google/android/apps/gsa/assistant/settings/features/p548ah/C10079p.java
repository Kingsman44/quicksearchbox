package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.p */
/* compiled from: PG */
public final /* synthetic */ class C10079p implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10064ab f34349a;

    /* renamed from: b */
    public final /* synthetic */ C10073j f34350b;

    /* renamed from: c */
    public final /* synthetic */ C10073j f34351c;

    public /* synthetic */ C10079p(C10064ab abVar, C10073j jVar, C10073j jVar2) {
        this.f34349a = abVar;
        this.f34350b = jVar;
        this.f34351c = jVar2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10064ab abVar = this.f34349a;
        C10073j jVar = this.f34350b;
        C10073j jVar2 = this.f34351c;
        if (jVar.f34336e) {
            abVar.mo18216G(jVar, jVar.f34334c, true, new C10080q(abVar, jVar2));
        } else if (jVar.f34335d) {
            abVar.mo18219J(jVar2, true);
        }
    }
}
