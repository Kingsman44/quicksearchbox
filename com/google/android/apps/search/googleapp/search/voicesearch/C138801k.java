package com.google.android.apps.search.googleapp.search.voicesearch;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.C1745d;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.k */
/* compiled from: PG */
public final /* synthetic */ class C138801k implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ C138859r f377553a;

    /* renamed from: b */
    public final /* synthetic */ View f377554b;

    public /* synthetic */ C138801k(C138859r rVar, View view) {
        this.f377553a = rVar;
        this.f377554b = view;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C138859r rVar = this.f377553a;
        View view2 = this.f377554b;
        C1926c a = cpVar.f5994b.mo5216a(131);
        if (a.f5822c > 0) {
            ImageView imageView = (ImageView) view.findViewById(R.id.googleapp_assistant_logo);
            C1745d dVar = (C1745d) imageView.getLayoutParams();
            dVar.topMargin = a.f5822c + (C138859r.m225591h(rVar.f377709k.getResources()) ? (int) (Resources.getSystem().getDisplayMetrics().density * 23.0f) : 0);
            imageView.setLayoutParams(dVar);
        }
        view2.setPadding(0, 0, 0, a.f5824e);
        return cpVar;
    }
}
