package com.google.android.apps.search.googleapp.launcher.minusone;

import android.view.View;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.o */
/* compiled from: PG */
final class C136660o implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C134744f f372017a;

    /* renamed from: b */
    final /* synthetic */ C136652i f372018b;

    public C136660o(C134744f fVar, C136652i iVar) {
        this.f372017a = fVar;
        this.f372018b = iVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            this.f372017a.mo111959m(this.f372018b.f372004w.mo113241a(i2, i4));
        }
    }
}
