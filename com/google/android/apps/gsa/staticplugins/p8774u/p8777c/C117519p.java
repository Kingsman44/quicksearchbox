package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.p */
/* compiled from: PG */
public final /* synthetic */ class C117519p implements C117501af {

    /* renamed from: a */
    public final /* synthetic */ C117497ab f326205a;

    public /* synthetic */ C117519p(C117497ab abVar) {
        this.f326205a = abVar;
    }

    /* renamed from: a */
    public final void mo103347a() {
        C90233i iVar;
        C117497ab abVar = this.f326205a;
        abVar.f326146k = false;
        if (abVar.f326140e.mo28316z()) {
            C90233i iVar2 = abVar.f326150o;
            if (iVar2 != null) {
                View b = iVar2.mo83945b();
                int[] iArr = new int[2];
                if (b != null) {
                    b.getLocationOnScreen(iArr);
                    if (b.isShown() && iArr[0] >= 0 && iArr[1] >= 0 && (iVar = abVar.f326150o) != null) {
                        b.announceForAccessibility(iVar.mo83946c());
                    }
                }
            }
            abVar.f326139d.mo103315f();
        }
    }
}
