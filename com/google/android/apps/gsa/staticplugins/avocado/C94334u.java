package com.google.android.apps.gsa.staticplugins.avocado;

import android.view.View;
import android.widget.Button;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.u */
/* compiled from: PG */
public final /* synthetic */ class C94334u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94170an f263611a;

    /* renamed from: b */
    public final /* synthetic */ Button f263612b;

    public /* synthetic */ C94334u(C94170an anVar, Button button) {
        this.f263611a = anVar;
        this.f263612b = button;
    }

    public final void onClick(View view) {
        C94170an anVar = this.f263611a;
        Button button = this.f263612b;
        anVar.f263065Q = true;
        button.setVisibility(8);
        anVar.f263072X.setVisibility(8);
        anVar.mo88367l();
        ((C89859i) anVar.f263106o.mo27525b()).mo83702b(C89849ae.FACE_MATCH_RECORD_FACE_START);
    }
}
