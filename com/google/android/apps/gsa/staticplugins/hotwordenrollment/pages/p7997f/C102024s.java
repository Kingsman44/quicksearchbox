package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.s */
/* compiled from: PG */
public final /* synthetic */ class C102024s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102029x f284652a;

    public /* synthetic */ C102024s(C102029x xVar) {
        this.f284652a = xVar;
    }

    public final void onClick(View view) {
        C102029x xVar = this.f284652a;
        xVar.f284666g.mo83702b(C89849ae.VOICE_MATCH_HOTWORD_CONSENT_SCREEN_DECLINED);
        C60870cx b = xVar.f284663d.mo92763b();
        if (b != null) {
            xVar.f284664e.mo50428h(C46438d.m82809a(b).f121541a, (Object) null, xVar.f284668i);
            return;
        }
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84237h(cVar.mo92555a(), view);
    }
}
