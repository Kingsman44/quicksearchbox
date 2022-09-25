package com.google.android.apps.gsa.shared.p7148ui.p7150b;

import android.content.DialogInterface;
import com.google.android.apps.gsa.search.shared.service.C88489j;

/* renamed from: com.google.android.apps.gsa.shared.ui.b.c */
/* compiled from: PG */
final class C90654c implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C90655d f253529a;

    public C90654c(C90655d dVar) {
        this.f253529a = dVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C90655d dVar = this.f253529a;
        dVar.f253530a.mo81961c(new C88489j(dVar.f253537h).mo82013a());
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
