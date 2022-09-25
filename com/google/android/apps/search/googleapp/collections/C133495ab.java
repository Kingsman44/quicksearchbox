package com.google.android.apps.search.googleapp.collections;

import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import com.google.common.p4522b.C58528ij;
import java.util.Arrays;

/* renamed from: com.google.android.apps.search.googleapp.collections.ab */
/* compiled from: PG */
public final class C133495ab implements C2010ad {

    /* renamed from: a */
    private final C58528ij f363739a;

    /* renamed from: b */
    private final int f363740b;

    /* renamed from: c */
    private final int f363741c;

    /* renamed from: d */
    private final int f363742d;

    /* renamed from: e */
    private final int f363743e;

    public C133495ab(View view, C133494aa... aaVarArr) {
        this.f363740b = view.getPaddingLeft();
        this.f363741c = view.getPaddingTop();
        this.f363742d = view.getPaddingRight();
        this.f363743e = view.getPaddingBottom();
        this.f363739a = C58528ij.m90006F(Arrays.asList(aaVarArr));
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C1926c a = cpVar.f5994b.mo5216a(131);
        int i = this.f363739a.contains(C133494aa.TOP) ? a.f5822c : 0;
        int i2 = this.f363739a.contains(C133494aa.BOTTOM) ? a.f5824e : 0;
        view.setPadding(this.f363740b, this.f363741c + i, this.f363742d, this.f363743e + i2);
        return cpVar.f5994b.mo5220e(0, i, 0, i2);
    }
}
