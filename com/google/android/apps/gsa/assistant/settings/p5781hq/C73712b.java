package com.google.android.apps.gsa.assistant.settings.p5781hq;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.p5784c.C73602a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.b */
/* compiled from: PG */
public final /* synthetic */ class C73712b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73715e f194958a;

    public /* synthetic */ C73712b(C73715e eVar) {
        this.f194958a = eVar;
    }

    public final void onClick(View view) {
        C73715e eVar = this.f194958a;
        C73602a aVar = eVar.f194965d;
        aVar.f194723a.mo83702b(C89849ae.APP_DIRECTORY_HOME_PAGE_RETRY);
        eVar.mo65046c();
        C73567ad adVar = eVar.f194967f;
        if (adVar != null) {
            adVar.mo65051a();
        }
    }
}
