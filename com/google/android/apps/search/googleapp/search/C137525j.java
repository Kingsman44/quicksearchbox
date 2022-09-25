package com.google.android.apps.search.googleapp.search;

import androidx.activity.result.C0815b;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.C137699ab;
import com.google.android.apps.search.googleapp.search.srp.C137711an;
import com.google.android.apps.search.googleapp.search.srp.error.C137824w;
import com.google.android.apps.search.googleapp.search.srp.error.C137825x;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43508a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.googleapp.search.j */
/* compiled from: PG */
public final /* synthetic */ class C137525j implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C137553n f374052a;

    public /* synthetic */ C137525j(C137553n nVar) {
        this.f374052a = nVar;
    }

    public final void onActivityResult(Object obj) {
        C137553n nVar = this.f374052a;
        if (!((Boolean) obj).booleanValue()) {
            nVar.mo113817r();
            C137699ab l = nVar.mo113811l();
            l.getClass();
            C137711an a = l.mo17754z();
            if (a.f374546A.mo112951a()) {
                a.mo113917f();
                if (a.f374554I) {
                    ((C137543b) a.f374550E.mo5768a()).mo113805b(C137542d.f374085g);
                } else {
                    a.f374555J.mo50381d(C62912at.f169862a, C137542d.f374085g);
                }
                C43513c cVar = a.f374588g;
                C43508a aVar = (C43508a) C43512b.f113627a.createBuilder();
                aVar.mo58885m(C137825x.f374971a, C137824w.ERROR_VS_MIC_PERMISSION);
                cVar.mo46578a((C43512b) aVar.build());
                a.mo113920j();
            }
            nVar.mo113825z(2);
            return;
        }
        nVar.mo113821v(C137418g.f373767r);
    }
}
