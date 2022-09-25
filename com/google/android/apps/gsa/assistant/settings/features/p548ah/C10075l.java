package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.content.DialogInterface;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.l */
/* compiled from: PG */
public final /* synthetic */ class C10075l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10064ab f34339a;

    /* renamed from: b */
    public final /* synthetic */ C10073j f34340b;

    /* renamed from: c */
    public final /* synthetic */ C10073j f34341c;

    public /* synthetic */ C10075l(C10064ab abVar, C10073j jVar, C10073j jVar2) {
        this.f34339a = abVar;
        this.f34340b = jVar;
        this.f34341c = jVar2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10064ab abVar = this.f34339a;
        C10073j jVar = this.f34340b;
        C10073j jVar2 = this.f34341c;
        if (jVar.f34335d) {
            abVar.mo18222M(jVar2, (Long) null, false, (C9506h) null);
        } else if (jVar.f34336e) {
            abVar.mo18216G(jVar, jVar.f34334c, true, new C10078o(abVar, jVar2));
        }
    }
}
