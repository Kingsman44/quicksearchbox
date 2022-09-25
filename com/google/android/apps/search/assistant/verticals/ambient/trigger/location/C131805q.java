package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.accounts.Account;
import com.google.android.gms.semanticlocation.C145986x;
import com.google.android.gms.semanticlocation.internal.C145969g;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.q */
/* compiled from: PG */
public final /* synthetic */ class C131805q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131763ad f359999a;

    public /* synthetic */ C131805q(C131763ad adVar) {
        this.f359999a = adVar;
    }

    public final Object apply(Object obj) {
        C131763ad adVar = this.f359999a;
        C145986x xVar = new C145986x();
        xVar.mo122458b((Account) obj);
        xVar.f394661a = "ambient_assistant";
        return new C145969g(adVar.f359934a, xVar.mo122457a());
    }
}
