package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.e */
/* compiled from: PG */
final class C101964e implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C101965f f284517a;

    public C101964e(C101965f fVar) {
        this.f284517a = fVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i6) {
            C101965f fVar = this.f284517a;
            int i9 = fVar.f284524g;
            if (i9 == 1) {
                fVar.f284524g = 2;
            } else if (i9 == 2) {
                float f = (((float) i6) - ((float) i2)) / 2.0f;
                view.findViewById(R.id.hotword_enrollment_query).setTranslationY(f);
                view.findViewById(R.id.hotword_animation_container).setTranslationY(f);
                this.f284517a.f284524g = 3;
            }
        }
    }
}
