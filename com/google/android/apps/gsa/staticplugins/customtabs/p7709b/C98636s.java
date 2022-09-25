package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.graphics.BitmapFactory;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.s */
/* compiled from: PG */
public final /* synthetic */ class C98636s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C98642y f275488a;

    public /* synthetic */ C98636s(C98642y yVar) {
        this.f275488a = yVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C98642y yVar = this.f275488a;
        Boolean bool = (Boolean) obj;
        yVar.mo91246e(BitmapFactory.decodeResource(yVar.f275497b.getResources(), true != bool.booleanValue() ? R.drawable.quantum_gm_ic_bookmark_border_gm_grey_48 : R.drawable.quantum_gm_ic_bookmark_gm_grey_48), yVar.f275497b.getResources().getString(true != bool.booleanValue() ? R.string.save_action : R.string.save_unsave_action));
    }
}
