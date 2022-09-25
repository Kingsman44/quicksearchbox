package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C54972bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.ak */
/* compiled from: PG */
final class C93444ak extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ C93445al f260809a;

    public C93444ak(C93445al alVar) {
        this.f260809a = alVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        C88507a aVar = this.f260809a.f239232a;
        aVar.getClass();
        C93493bu buVar = ((C93446am) aVar).f260811d;
        C58838bb.m90883r(!buVar.f260942b);
        int i = buVar.f260945e + 1;
        buVar.f260945e = i;
        if (i >= buVar.f260946f.size()) {
            buVar.f260945e = 0;
        }
        buVar.mo87802b((C54972bc) buVar.f260946f.get(buVar.f260945e));
    }
}
