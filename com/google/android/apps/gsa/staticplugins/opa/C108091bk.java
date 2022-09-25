package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8566n.C112985a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8566n.C112987c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.material.featurehighlight.C28509a;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bk */
/* compiled from: PG */
public final /* synthetic */ class C108091bk implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f300677a;

    public /* synthetic */ C108091bk(C109040fj fjVar) {
        this.f300677a = fjVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C109040fj fjVar = this.f300677a;
        Integer num = (Integer) obj;
        if (((long) num.intValue()) >= fjVar.f303455t.mo79743a(C90063do.f249469eC)) {
            return false;
        }
        C28509a a = C28509a.m53319a(R.id.keyboard_indicator);
        a.f77363a = fjVar.f303346c.getString(R.string.tapas_promo_text);
        a.mo33993b().mo34065a(fjVar.f303385cq);
        ((C112987c) fjVar.f303381cm.mo27525b()).f313112a.mo46039a(new C112985a(num.intValue() + 1), C60826bg.f164896a);
        return true;
    }
}
