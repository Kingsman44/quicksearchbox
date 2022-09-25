package com.google.android.libraries.lens.view.p2133i;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28459d;
import com.google.apps.tiktok.account.p3603a.C45954d;

/* renamed from: com.google.android.libraries.lens.view.i.e */
/* compiled from: PG */
public final /* synthetic */ class C26920e implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C26932q f73360a;

    public /* synthetic */ C26920e(C26932q qVar) {
        this.f73360a = qVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C26932q qVar = this.f73360a;
        C28306ab abVar = qVar.f73395j;
        View a = C28459d.m53186a(qVar.f73389d);
        C28313c a2 = qVar.f73393h.mo33805a(C28427h.m53115a(92163));
        a2.mo33859g(C45954d.m82060a(qVar.f73394i.f69824a));
        a2.mo33859g(C28375ak.m53061c(51781));
        abVar.mo33801b(a, a2);
        if (qVar.f73386a.f73335b) {
            qVar.f73399n.mo32314b(2, qVar.f73393h, qVar.f73395j);
        } else {
            qVar.f73399n.mo32314b(qVar.f73391f.mo32270a() == 0 ? 1 : 3, qVar.f73393h, qVar.f73395j);
        }
    }
}
