package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import androidx.lifecycle.C2332ag;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.ap */
/* compiled from: PG */
public final /* synthetic */ class C30667ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30668aq f82780a;

    /* renamed from: b */
    public final /* synthetic */ Object f82781b;

    public /* synthetic */ C30667ap(C30668aq aqVar, Object obj) {
        this.f82780a = aqVar;
        this.f82781b = obj;
    }

    public final void run() {
        C30668aq aqVar = this.f82780a;
        Object obj = this.f82781b;
        C30669ar arVar = aqVar.f82782a;
        C2332ag agVar = arVar.f82791f;
        Context context = arVar.getContext();
        C30669ar arVar2 = aqVar.f82782a;
        agVar.mo5708l(C58485gu.m89842j(C30676b.m57331a(context, arVar2.f82802q, arVar2.f82803r)));
        if (obj != null) {
            aqVar.f82782a.f82786a.mo36390f();
            SelectedAccountView selectedAccountView = aqVar.f82782a.f82787b;
            C58838bb.m90884s(selectedAccountView.f81794f != null, "Initialize must be called before setting an account.");
            selectedAccountView.f81794f.mo35703a(obj, selectedAccountView.f81799k);
            if (aqVar.f82782a.f82804s.mo56113h()) {
                aqVar.f82782a.f82792g.mo774hX(C58836b.f156633a);
            }
        }
    }
}
