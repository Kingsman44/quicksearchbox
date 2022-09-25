package com.google.android.apps.search.googleapp.googleappbrowser;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10294h.C135855b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.s */
/* compiled from: PG */
final class C136112s implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136109q f370711a;

    public C136112s(C136109q qVar) {
        this.f370711a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C135855b bVar2 = (C135855b) bVar;
        C136109q qVar = this.f370711a;
        C58838bb.m90883r(qVar.f370700r.mo112949a());
        C135462h hVar = qVar.f370686d;
        if (!hVar.f369069i || hVar.f369072l) {
            qVar.f370687e.requireActivity().finishAndRemoveTask();
        } else {
            if (qVar.f370707y) {
                qVar.f370680B = true;
            }
            C135461g a = C135461g.m219650a(hVar.f369064d);
            if (a == null) {
                a = C135461g.UNKNOWN;
            }
            qVar.mo112765j(a);
        }
        return C47392e.f123115a;
    }
}
