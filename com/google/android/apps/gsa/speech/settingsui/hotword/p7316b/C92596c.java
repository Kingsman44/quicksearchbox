package com.google.android.apps.gsa.speech.settingsui.hotword.p7316b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.b.c */
/* compiled from: PG */
public final /* synthetic */ class C92596c implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C89784a f258406a;

    public /* synthetic */ C92596c(C89784a aVar) {
        this.f258406a = aVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C89784a aVar = this.f258406a;
        int[] intArrayExtra = intent != null ? intent.getIntArrayExtra("permissions_results") : null;
        boolean z = false;
        if (intArrayExtra == null || intArrayExtra.length <= 0) {
            aVar.mo49086a(false);
            return false;
        }
        if (intArrayExtra[0] == 0) {
            z = true;
        }
        aVar.mo49086a(Boolean.valueOf(z));
        return true;
    }
}
