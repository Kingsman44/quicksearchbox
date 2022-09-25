package com.google.android.apps.gsa.shared.p7148ui;

import android.view.View;
import java.util.Observable;

/* renamed from: com.google.android.apps.gsa.shared.ui.w */
/* compiled from: PG */
final class C90711w extends Observable implements C90713y {

    /* renamed from: a */
    public int f253745a = 0;

    public C90711w(View view) {
        view.addOnLayoutChangeListener(new C90710v(this));
    }

    /* renamed from: a */
    public final int mo85038a() {
        return this.f253745a;
    }
}
