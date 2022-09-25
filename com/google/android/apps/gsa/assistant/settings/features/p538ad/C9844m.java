package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.view.View;
import android.widget.Switch;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.m */
/* compiled from: PG */
public final /* synthetic */ class C9844m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9849r f33853a;

    /* renamed from: b */
    public final /* synthetic */ Switch f33854b;

    public /* synthetic */ C9844m(C9849r rVar, Switch switchR) {
        this.f33853a = rVar;
        this.f33854b = switchR;
    }

    public final void onClick(View view) {
        C9849r rVar = this.f33853a;
        Switch switchR = this.f33854b;
        C28443m mVar = rVar.f33869i;
        C28440j h = C28442l.m53142h();
        h.mo33895b(C28442l.m53144j(switchR));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(switchR));
    }
}
