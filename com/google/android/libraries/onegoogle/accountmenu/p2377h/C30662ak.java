package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.C2332ag;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30355aj;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30356ak;
import com.google.android.libraries.onegoogle.common.C30931r;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.ak */
/* compiled from: PG */
public final /* synthetic */ class C30662ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30669ar f82762a;

    public /* synthetic */ C30662ak(C30669ar arVar) {
        this.f82762a = arVar;
    }

    public final void run() {
        C30669ar arVar = this.f82762a;
        if (arVar.f82804s.mo56113h()) {
            Context context = arVar.getContext();
            Object c = C30281j.m56319c(arVar.f82802q.mo35858i().f81934a.f81883d);
            ViewGroup viewGroup = arVar.f82790e;
            ((C30238l) arVar.f82804s.mo56107c()).mo35725o(context, c, viewGroup, arVar.f82799n, viewGroup, arVar.f82795j, true);
            C2332ag agVar = arVar.f82793h;
            C30355aj a = ((C30356ak) agVar.mo3842a()).mo35934a();
            a.mo35933b(((C30238l) arVar.f82804s.mo56107c()).mo35726p(arVar.f82802q.mo35858i().f81934a.mo35794b()));
            C30931r.m57728a(agVar, a.mo35932a());
        }
    }
}
