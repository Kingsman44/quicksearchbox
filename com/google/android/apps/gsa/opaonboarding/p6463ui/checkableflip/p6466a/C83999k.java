package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.CheckableFlipComponent;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.a.k */
/* compiled from: PG */
public final class C83999k extends C0673gh {

    /* renamed from: a */
    final View f228826a;

    /* renamed from: b */
    public final TextView f228827b;

    /* renamed from: c */
    public final TextView f228828c;

    /* renamed from: d */
    public final CheckableFlipComponent f228829d;

    public C83999k(C84002n nVar, View view) {
        super(view);
        this.f228826a = view.findViewById(R.id.container);
        this.f228827b = (TextView) view.findViewById(R.id.line1);
        this.f228828c = (TextView) view.findViewById(R.id.line2);
        CheckableFlipComponent checkableFlipComponent = (CheckableFlipComponent) view.findViewById(R.id.checkable_button);
        this.f228829d = checkableFlipComponent;
        checkableFlipComponent.f228792f = nVar.f228833c;
    }
}
