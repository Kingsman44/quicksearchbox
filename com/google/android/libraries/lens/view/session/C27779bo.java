package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.session.bo */
/* compiled from: PG */
final class C27779bo implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C27780bp f75785a;

    public C27779bo(C27780bp bpVar) {
        this.f75785a = bpVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58974d dVar = C27781bq.f75786a;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        RectF rectF = (RectF) obj;
        if (rectF != null) {
            this.f75785a.mo32175a(rectF);
        } else {
            ((C58970a) ((C58970a) C27781bq.f75786a.mo56225c()).mo56372aa(49956)).mo56386p("User visible region was null.");
        }
    }
}
