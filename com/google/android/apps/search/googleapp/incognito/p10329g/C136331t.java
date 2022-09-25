package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.app.Dialog;
import android.view.View;
import com.google.android.apps.search.googleapp.incognito.p10329g.p10330a.C136288d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.t */
/* compiled from: PG */
public final /* synthetic */ class C136331t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136334w f371194a;

    public /* synthetic */ C136331t(C136334w wVar) {
        this.f371194a = wVar;
    }

    public final void onClick(View view) {
        C136334w wVar = this.f371194a;
        if (wVar.f371199c.f371193c) {
            C47393f.m84235f(new C136288d(), wVar.f371198b);
        } else {
            C46459k.m82829b(wVar.f371200d.mo112927b(true), "Failed to set Incognito biometrics settings.", new Object[0]);
            wVar.mo112923a();
        }
        Dialog dialog = wVar.f371198b.getDialog();
        dialog.getClass();
        dialog.dismiss();
    }
}
