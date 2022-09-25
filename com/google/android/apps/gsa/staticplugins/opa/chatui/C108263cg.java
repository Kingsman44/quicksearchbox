package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cg */
/* compiled from: PG */
public final class C108263cg extends C108262cf {
    private C108263cg() {
        super(2, 4);
    }

    /* renamed from: B */
    public static C108263cg m179950B(C86124t tVar) {
        C108263cg cgVar = new C108263cg();
        String x = tVar.mo79758x(C90014bt.f247336fI);
        if (!TextUtils.isEmpty(x)) {
            cgVar.f301174d = x;
        }
        return cgVar;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 5;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (!TextUtils.isEmpty(this.f301174d)) {
            blVar.f301077d.setText(this.f301174d);
        }
        blVar.f301077d.setTextAppearance(bhVar.mo96663f());
        blVar.f301077d.setBackgroundResource(bhVar.mo96679v());
        blVar.f301077d.setMinHeight(bhVar.mo96681x());
        blVar.f301077d.setMinimumHeight(bhVar.mo96681x());
        TextView textView = blVar.f301077d;
        textView.setPadding(textView.getPaddingLeft(), bhVar.mo96682y(), blVar.f301077d.getPaddingRight(), bhVar.mo96680w());
        blVar.f301092s.setPadding(bhVar.mo96662e(), blVar.f301092s.getPaddingTop(), bhVar.mo96662e(), blVar.f301092s.getPaddingBottom());
        blVar.mo96689e(1.0f);
    }
}
