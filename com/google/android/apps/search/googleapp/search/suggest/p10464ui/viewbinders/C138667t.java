package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138125g;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138591p;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.protos.p4932ax.p4933a.C64269i;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.t */
/* compiled from: PG */
public final /* synthetic */ class C138667t implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C64269i f377163a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f377164b;

    public /* synthetic */ C138667t(C64269i iVar, MaterialButton materialButton) {
        this.f377163a = iVar;
        this.f377164b = materialButton;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C64269i iVar = this.f377163a;
        MaterialButton materialButton = this.f377164b;
        String str = iVar.f173767c;
        C138125g gVar = (C138125g) C138127i.f375805b.createBuilder();
        gVar.mo114159a(Collections.unmodifiableMap(iVar.f173768d));
        C47393f.m84237h(new C138591p(str, (C138127i) gVar.build()), materialButton);
        return false;
    }
}
