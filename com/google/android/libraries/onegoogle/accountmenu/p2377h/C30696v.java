package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30351af;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30352ag;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30390br;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30439g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30629l;
import com.google.android.libraries.onegoogle.accountmenu.features.C30640w;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.v */
/* compiled from: PG */
public final /* synthetic */ class C30696v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C30699y f82862a;

    public /* synthetic */ C30696v(C30699y yVar) {
        this.f82862a = yVar;
    }

    public final Object apply(Object obj) {
        C30699y yVar = this.f82862a;
        C30629l lVar = (C30629l) obj;
        Context context = yVar.f82864a;
        C2391v vVar = yVar.f82865b;
        C58480gp gpVar = new C58480gp(4);
        if (lVar.mo36292b().mo56113h()) {
            gpVar.mo55396h(((C30640w) lVar.mo36292b().mo56107c()).mo36145a(context, vVar));
        }
        if (lVar.mo36291a().mo56113h()) {
            C30352ag agVar = (C30352ag) lVar.mo36291a().mo56107c();
            lVar.mo36293c();
            C58480gp gpVar2 = new C58480gp(4);
            if (agVar.mo35929a().mo56113h()) {
                gpVar2.mo55395g(new C30439g(new C30390br((C133301h) agVar.mo35929a().mo56107c(), agVar.mo35930b())));
            }
            if (agVar.mo35930b().mo56113h()) {
                gpVar2.mo55395g(new C30439g(new C30351af(agVar)));
            }
            gpVar.mo55396h(gpVar2.mo55394f());
        }
        return gpVar.mo55394f();
    }
}
