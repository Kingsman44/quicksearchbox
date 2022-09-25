package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133545an;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133546ao;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;

/* renamed from: com.google.android.apps.search.googleapp.compliance.ab */
/* compiled from: PG */
final class C133577ab implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133576aa f363930a;

    public C133577ab(C133576aa aaVar) {
        this.f363930a = aaVar;
    }

    public final void onClick(View view) {
        C133576aa aaVar = this.f363930a;
        aaVar.f363924g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C46439e eVar = aaVar.f363922e;
        C133586ak akVar = aaVar.f363920c;
        C133545an anVar = (C133545an) C133546ao.f363859f.createBuilder();
        anVar.copyOnWrite();
        C133546ao aoVar = (C133546ao) anVar.instance;
        aoVar.f363861a |= 2;
        aoVar.f363863c = true;
        anVar.copyOnWrite();
        C133546ao aoVar2 = (C133546ao) anVar.instance;
        aoVar2.f363861a |= 4;
        aoVar2.f363864d = true;
        eVar.mo50428h(C46438d.m82810b(akVar.mo111249e((C133546ao) anVar.build(), aaVar.f363921d.mo111320a())).f121541a, (Object) null, aaVar.f363923f.f363991a);
    }
}
