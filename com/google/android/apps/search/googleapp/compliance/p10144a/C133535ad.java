package com.google.android.apps.search.googleapp.compliance.p10144a;

import android.app.Dialog;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C133535ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133543al f363840a;

    public /* synthetic */ C133535ad(C133543al alVar) {
        this.f363840a = alVar;
    }

    public final C60870cx apply(Object obj) {
        C133543al alVar = this.f363840a;
        String str = (String) obj;
        for (Dialog dismiss : alVar.f363852e) {
            dismiss.dismiss();
        }
        alVar.f363852e.clear();
        return alVar.f363849b.mo46039a(new C133575z(alVar), alVar.f363858k);
    }
}
