package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.acz;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.z */
/* compiled from: PG */
final class C10089z extends C9506h {

    /* renamed from: a */
    final /* synthetic */ boolean f34366a;

    /* renamed from: b */
    final /* synthetic */ boolean f34367b;

    /* renamed from: c */
    final /* synthetic */ C10073j f34368c;

    /* renamed from: d */
    final /* synthetic */ boolean f34369d;

    /* renamed from: e */
    final /* synthetic */ C10073j f34370e;

    /* renamed from: f */
    final /* synthetic */ C10064ab f34371f;

    public C10089z(C10064ab abVar, boolean z, boolean z2, C10073j jVar, boolean z3, C10073j jVar2) {
        this.f34371f = abVar;
        this.f34366a = z;
        this.f34367b = z2;
        this.f34368c = jVar;
        this.f34369d = z3;
        this.f34370e = jVar2;
    }

    /* renamed from: a */
    public final void mo17817a(Throwable th) {
        super.mo17817a(th);
        if (this.f34366a) {
            if (this.f34367b) {
                C10064ab abVar = this.f34371f;
                abVar.mo18220K(abVar.f34315m, this.f34370e);
            } else {
                C10064ab abVar2 = this.f34371f;
                abVar2.mo18220K(abVar2.f34316n, this.f34370e);
            }
        }
        C10073j jVar = this.f34368c;
        if (jVar.f34336e) {
            this.f34371f.mo18216G(jVar, jVar.f34334c, false, (Runnable) null);
        }
        C10064ab abVar3 = this.f34371f;
        C10073j jVar2 = this.f34368c;
        Activity fX = abVar3.mo17794fX();
        if (fX != null) {
            new AlertDialog.Builder(fX).setTitle(abVar3.mo17797h(R.string.provider_selection_failure_dialog_title, jVar2.f12745q)).setMessage(abVar3.mo17795g(R.string.failure_dialog_description)).setPositiveButton(abVar3.mo17795g(R.string.failure_dialog_positive_button), (DialogInterface.OnClickListener) null).show();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17818b(Object obj) {
        acz acz = (acz) obj;
        if (!this.f34366a) {
            if (this.f34367b) {
                C10064ab abVar = this.f34371f;
                abVar.mo18220K(abVar.f34315m, this.f34368c);
            } else {
                C10064ab abVar2 = this.f34371f;
                abVar2.mo18220K(abVar2.f34316n, this.f34368c);
            }
        }
        if (this.f34369d) {
            this.f34371f.mo18218I();
        }
    }
}
