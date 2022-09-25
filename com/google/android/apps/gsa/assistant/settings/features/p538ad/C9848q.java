package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9849r;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.q */
/* compiled from: PG */
public final /* synthetic */ class C9848q implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C9849r.C9850a f33860a;

    public /* synthetic */ C9848q(C9849r.C9850a aVar) {
        this.f33860a = aVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C9849r.C9850a aVar = this.f33860a;
        if (i != 0) {
            return true;
        }
        aVar.f33871a.getActivity().onBackPressed();
        return true;
    }
}
