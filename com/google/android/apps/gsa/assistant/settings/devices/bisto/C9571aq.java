package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.DialogInterface;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124680cs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.aq */
/* compiled from: PG */
public final /* synthetic */ class C9571aq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33166a;

    public /* synthetic */ C9571aq(C9619ck ckVar) {
        this.f33166a = ckVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C9619ck ckVar = this.f33166a;
        if (ckVar.f33286t != null) {
            C124680cs csVar = (C124680cs) C124681ct.f343972c.createBuilder();
            String str = ckVar.f33286t;
            csVar.copyOnWrite();
            C124681ct ctVar = (C124681ct) csVar.instance;
            str.getClass();
            ctVar.f343974a |= 1;
            ctVar.f343975b = str;
            ((C124669ch) ckVar.f33282p.mo27525b()).mo106580b((C124681ct) csVar.build());
        }
        ckVar.mo17798i();
    }
}
