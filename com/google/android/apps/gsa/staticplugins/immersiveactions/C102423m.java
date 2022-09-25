package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.p6941ui.C88531k;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.libraries.logging.C28295m;
import com.google.p4152bb.p4153a.C55253ln;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.m */
/* compiled from: PG */
final class C102423m extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ C93602cz f285850a;

    /* renamed from: b */
    final /* synthetic */ C102424n f285851b;

    public C102423m(C102424n nVar, C93602cz czVar) {
        this.f285851b = nVar;
        this.f285850a = czVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        C88531k kVar;
        if (this.f285850a.mo82039ao().mo81425i() && this.f285850a.mo88039ah()) {
            C93602cz czVar = this.f285850a;
            List R = czVar.mo88023R();
            R.getClass();
            czVar.mo88027V((C55253ln) R.get(0));
        } else if (((ModularAction) this.f285850a.f239226b).f235985a.mo81115e()) {
            String str = ((ModularAction) this.f285850a.f239226b).f235989e;
            if (!TextUtils.isEmpty(str) && (kVar = this.f285851b.f285855d) != null) {
                kVar.mo82168b(str, C28295m.m52915a(view));
            }
        } else {
            this.f285850a.mo88032aa();
        }
    }
}
