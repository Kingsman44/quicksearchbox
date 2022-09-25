package com.google.android.libraries.lens.view.main;

import android.view.View;
import com.google.android.libraries.lens.view.imageviewer.C26940d;
import com.google.android.libraries.lens.view.imageviewer.C26952o;
import com.google.android.libraries.lens.view.imageviewer.C26955r;
import com.google.android.libraries.lens.view.p2078at.C25511aq;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.synthetic.C28467k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.main.fa */
/* compiled from: PG */
final class C27420fa implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75059a;

    public C27420fa(C27384dt dtVar) {
        this.f75059a = dtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C28439i iVar;
        C25511aq aqVar = (C25511aq) bVar;
        C27384dt dtVar = this.f75059a;
        if (((C26952o) dtVar.f74987g.getChildFragmentManager().f634a.mo671c("image-viewer-root-fragment-tag")) == null) {
            AccountId accountId = dtVar.f74989i;
            String uri = aqVar.f69473a.toString();
            C26952o oVar = new C26952o();
            C68324h.m98669f(oVar);
            C47247a.m84047b(oVar, accountId);
            C47243l.m84040b(oVar, uri);
            oVar.showNow(dtVar.f74987g.getChildFragmentManager(), "image-viewer-root-fragment-tag");
            if (!dtVar.f74944an) {
                C26955r a = oVar.mo17754z();
                View view = aqVar.f69474b;
                C26940d a2 = a.mo32344a();
                if (!(a2 == null || (iVar = a2.mo17754z().f73454n) == null)) {
                    C28439i a3 = C28485y.m53234a(view);
                    a3.getClass();
                    C28467k.m53225a(iVar, a3);
                }
            }
        }
        return C47392e.f123115a;
    }
}
