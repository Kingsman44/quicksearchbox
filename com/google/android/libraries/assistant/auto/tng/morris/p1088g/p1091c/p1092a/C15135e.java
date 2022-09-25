package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.C15150l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.a.e */
/* compiled from: PG */
public final class C15135e implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f45423a;

    /* renamed from: b */
    final /* synthetic */ View f45424b;

    public C15135e(Runnable runnable, View view) {
        this.f45423a = runnable;
        this.f45424b = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C15150l) this.f45423a).f45454a.mo22027f();
        this.f45424b.removeOnLayoutChangeListener(this);
    }
}
