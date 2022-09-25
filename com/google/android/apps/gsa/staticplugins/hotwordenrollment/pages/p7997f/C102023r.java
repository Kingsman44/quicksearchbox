package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.r */
/* compiled from: PG */
public final /* synthetic */ class C102023r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102029x f284651a;

    public /* synthetic */ C102023r(C102029x xVar) {
        this.f284651a = xVar;
    }

    public final void onClick(View view) {
        C102029x xVar = this.f284651a;
        xVar.f284666g.mo83702b(C89849ae.VOICE_MATCH_HOTWORD_CONSENT_SCREEN_AGREED);
        C60870cx c = xVar.f284663d.mo92764c();
        if (c != null) {
            xVar.f284664e.mo50428h(C46438d.m82809a(c).f121541a, (Object) null, xVar.f284667h);
            return;
        }
        C47393f.m84237h(new C101783w(), view);
    }
}
