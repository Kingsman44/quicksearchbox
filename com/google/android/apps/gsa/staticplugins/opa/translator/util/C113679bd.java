package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.res.Resources;
import android.widget.TextView;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.bd */
/* compiled from: PG */
final class C113679bd {

    /* renamed from: a */
    final /* synthetic */ ModeTogglePlateView f314870a;

    public C113679bd(ModeTogglePlateView modeTogglePlateView) {
        this.f314870a = modeTogglePlateView;
    }

    /* renamed from: c */
    static final int m188249c() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo100500a(C113680be beVar) {
        if (beVar == C113680be.AUTO) {
            return this.f314870a.mo100447b().getX() + this.f314870a.mo100446a().getX();
        }
        if (beVar == C113680be.MANUAL) {
            return this.f314870a.mo100449d().getX() + this.f314870a.mo100446a().getX();
        }
        if (beVar == C113680be.KEYBOARD) {
            return this.f314870a.mo100448c().getX() + this.f314870a.mo100446a().getX();
        }
        ((C59052c) ((C59052c) ModeTogglePlateView.f314785a.mo56225c()).mo56372aa(28298)).mo56389s("Unexpected mode type: %s", beVar);
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo100501b(C113680be beVar) {
        int i;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f314870a.mo100447b());
        arrayList.add(this.f314870a.mo100449d());
        arrayList.add(this.f314870a.mo100448c());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TextView) arrayList.get(i2)).setVisibility(8);
        }
        this.f314870a.requestLayout();
        if (beVar == C113680be.AUTO) {
            i = 0;
        } else if (beVar == C113680be.MANUAL) {
            i = 1;
        } else if (beVar != C113680be.KEYBOARD) {
            return 0;
        } else {
            i = 2;
        }
        ((TextView) arrayList.get(i)).setVisibility(0);
        this.f314870a.requestLayout();
        ((TextView) arrayList.get(i)).measure(0, 0);
        int measuredWidth = ((TextView) arrayList.get(i)).getMeasuredWidth();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((TextView) arrayList.get(i3)).setVisibility(0);
        }
        this.f314870a.requestLayout();
        return measuredWidth;
    }
}
