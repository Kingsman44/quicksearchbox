package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14739i;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14612pr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14613ps;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.x */
/* compiled from: PG */
public final /* synthetic */ class C15321x implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15280ah f45990a;

    public /* synthetic */ C15321x(C15280ah ahVar) {
        this.f45990a = ahVar;
    }

    public final void onClick(View view) {
        C15280ah ahVar = this.f45990a;
        C14613ps psVar = ahVar.f45869f;
        psVar.getClass();
        int a = C14612pr.m30644a(psVar.f44177c);
        if (a != 0 && a == 5) {
            ahVar.f45865b.mo21875g(C14739i.m31030c());
            return;
        }
        ahVar.f45867d.mo21478c(C37182a.f98189hx.mo40813g(), BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        C14986h hVar = ahVar.f45865b;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14362gk gkVar = (C14362gk) C14365gn.f43466q.createBuilder();
        gkVar.copyOnWrite();
        ((C14365gn) gkVar.instance).f43468a = 25;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14365gn gnVar = (C14365gn) gkVar.build();
        gnVar.getClass();
        lfVar.f43801d = gnVar;
        lfVar.f43800c = 3;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
