package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.view.ViewTreeObserver;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.bz */
/* compiled from: PG */
final class C104955bz implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C104957ca f292440a;

    public C104955bz(C104957ca caVar) {
        this.f292440a = caVar;
    }

    public final boolean onPreDraw() {
        if (this.f292440a.f292451i.findViewById(R.id.header_container).getHeight() == 0 || this.f292440a.mo94417a() == 0) {
            return true;
        }
        this.f292440a.f292451i.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f292440a.mo94419c();
        return true;
    }
}
