package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.p7148ui.C90698j;
import com.google.android.apps.gsa.shared.util.C91043j;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.u */
/* compiled from: PG */
public final /* synthetic */ class C88837u implements C91043j {

    /* renamed from: a */
    public final /* synthetic */ C88838v f240502a;

    public /* synthetic */ C88837u(C88838v vVar) {
        this.f240502a = vVar;
    }

    /* renamed from: a */
    public final void mo17709a(Object obj) {
        C88838v vVar = this.f240502a;
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            boolean p = vVar.mo82619p(bitmap);
            if (p) {
                bitmap = Bitmap.createScaledBitmap(bitmap, vVar.f240511i, vVar.f240512j, true);
            }
            if (vVar.f240508f) {
                drawable = new C90698j(bitmap, ((float) vVar.f240511i) / 2.0f, false);
            } else if (p) {
                drawable = new BitmapDrawable(bitmap);
            }
        }
        vVar.f240506d.setImageDrawable(drawable);
    }
}
