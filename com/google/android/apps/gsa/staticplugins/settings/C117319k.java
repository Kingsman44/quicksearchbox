package com.google.android.apps.gsa.staticplugins.settings;

import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81214fi;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.base.C58881cr;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.k */
/* compiled from: PG */
public final /* synthetic */ class C117319k implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C117320l f325666a;

    public /* synthetic */ C117319k(C117320l lVar) {
        this.f325666a = lVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C117320l lVar = this.f325666a;
        boolean z = false;
        if (lVar.f325668b.mo79746e(C90126fx.f251161db) && !((Optional) lVar.f325670d.mo27525b()).isEmpty()) {
            C81214fi fiVar = (C81214fi) ((Optional) lVar.f325670d.mo27525b()).get();
            if (!lVar.f325668b.mo79758x(C90126fx.f250982aH).isEmpty() || !lVar.f325668b.mo79758x(C90126fx.f250980aF).isEmpty()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
