package com.google.android.libraries.lens.view.main;

import android.databinding.C0118a;
import android.graphics.RectF;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.integrations.p3018c.C38505d;

/* renamed from: com.google.android.libraries.lens.view.main.dv */
/* compiled from: PG */
final class C27387dv implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75009a;

    public C27387dv(C27384dt dtVar) {
        this.f75009a = dtVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == this.f75009a.f74916aL) {
            int height = view.getHeight();
            if (height > 0) {
                C27384dt dtVar = this.f75009a;
                int bottom = dtVar.f74912aH.findViewById(R.id.lens_underlay).getBottom();
                int i9 = dtVar.f74930aZ.top;
                float f = (float) height;
                float f2 = ((float) dtVar.f74930aZ.top) / f;
                C27327bq bqVar = dtVar.f74881C;
                bqVar.f74812q.f75787b.mo57356n(new RectF(0.0f, f2, 1.0f, Math.min((((float) (bottom - i9)) / f) + f2, 1.0f)));
                view.removeOnLayoutChangeListener(this);
                return;
            }
            C0118a.m108p(C27384dt.f74877a.mo56226d(), "cameraView laid out with height <= 0.", 49753, C38505d.f101864b, 153583416);
        }
    }
}
