package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.ci */
/* compiled from: PG */
final class C15054ci implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C15056ck f45138a;

    public C15054ci(C15056ck ckVar) {
        this.f45138a = ckVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!(i3 - i == 0 || i2 - i4 == 0)) {
            C15056ck ckVar = this.f45138a;
            if (!ckVar.f45175w) {
                ImageView imageView = ckVar.f45160h;
                C14333fi fiVar = ckVar.f45172t;
                fiVar.getClass();
                ckVar.mo21925d(imageView, fiVar);
                this.f45138a.f45175w = true;
                return;
            }
        }
        if (!view.isShown()) {
            this.f45138a.f45175w = false;
        }
    }
}
