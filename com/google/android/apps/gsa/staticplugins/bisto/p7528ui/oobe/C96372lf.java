package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.View;
import android.view.ViewGroup;
import androidx.p197u.C4199aj;
import androidx.p197u.C4230o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lf */
/* compiled from: PG */
public final /* synthetic */ class C96372lf implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96381lo f269627a;

    public /* synthetic */ C96372lf(C96381lo loVar) {
        this.f269627a = loVar;
    }

    public final void run() {
        C96381lo loVar = this.f269627a;
        ViewGroup viewGroup = (ViewGroup) loVar.f269648l.findViewById(R.id.tos_welcome_offline_container_inner);
        View childAt = viewGroup.getChildAt(loVar.f269651o);
        if (viewGroup.getChildCount() >= 2) {
            C4230o oVar = new C4230o(2);
            oVar.f13592b = 500;
            oVar.f13595e.add(childAt);
            C4199aj.m12054b(viewGroup, oVar);
            childAt.setVisibility(4);
            loVar.f269644h.mo28213m("offline-sequence-advance", 500, new C96379lm(loVar));
        }
    }
}
