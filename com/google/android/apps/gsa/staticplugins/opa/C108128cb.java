package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cb */
/* compiled from: PG */
public final /* synthetic */ class C108128cb implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f300756a;

    public /* synthetic */ C108128cb(C109040fj fjVar) {
        this.f300756a = fjVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C109040fj fjVar = this.f300756a;
        C58976aa aaVar = C58975e.f156826a;
        Activity activity = fjVar.f303441f;
        if (activity == null) {
            return true;
        }
        activity.finish();
        fjVar.f303448m.mo28212l("Restart opa activity", new C108053bg(fjVar));
        return true;
    }
}
