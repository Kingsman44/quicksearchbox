package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.g */
/* compiled from: PG */
public final /* synthetic */ class C102662g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102665j f286562a;

    /* renamed from: b */
    public final /* synthetic */ C102663h f286563b;

    public /* synthetic */ C102662g(C102665j jVar, C102663h hVar) {
        this.f286562a = jVar;
        this.f286563b = hVar;
    }

    public final void onClick(View view) {
        C102665j jVar = this.f286562a;
        C102663h hVar = this.f286563b;
        C102667l lVar = jVar.f286569b;
        C8506p pVar = ((C102666k) jVar.f286568a.get(hVar.getBindingAdapterPosition())).f286571b;
        if (pVar != null) {
            String str = pVar.f29513a;
            String str2 = (String) lVar.mo93370a().get(str);
            str2.getClass();
            boolean equals = str2.equals(lVar.f286581i);
            if (true == equals) {
                str2 = BuildConfig.FLAVOR;
            }
            if (true == equals) {
                str = BuildConfig.FLAVOR;
            }
            lVar.mo93372c();
            lVar.mo93375f(3);
            lVar.f286582j = lVar.f286580h.mo93378a(str2);
            C90873ag b = C90875ai.m148465b(new C102647a(lVar, hVar, str, str2), lVar.f286582j, lVar.f286579g, "UpdateChangedLanguage");
            b.mo85225c(CancellationException.class, C102657b.f286557a);
            b.mo85223a(new C102658c(lVar));
        }
    }
}
