package com.google.android.apps.gsa.searchplate;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87632f;
import com.google.android.apps.gsa.searchplate.p6966d.C88940l;
import com.google.android.apps.gsa.searchplate.p6966d.C88941m;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchplate.x */
/* compiled from: PG */
final class C88983x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchPlate f241142a;

    public C88983x(SearchPlate searchPlate) {
        this.f241142a = searchPlate;
    }

    public final void run() {
        C88940l b;
        C88951n nVar = this.f241142a.f240740m;
        C88941m mVar = nVar.f240979a;
        Drawable drawable = nVar.f240980b.getResources().getDrawable(R.drawable.g_glass_sprite_sheet);
        if (drawable != null) {
            mVar.f240932b = ((float) drawable.getIntrinsicHeight()) / ((float) mVar.f240934d);
            mVar.f240931a = ((float) drawable.getIntrinsicWidth()) / ((float) mVar.f240933c);
            String str = mVar.f240941k;
            if (!(str == null || (b = mVar.mo82821b(str)) == null)) {
                mVar.mo82822d(b.mo82808c());
            }
            mVar.f240937g.setImageDrawable(drawable);
            mVar.f240943m = true;
            Runnable runnable = this.f241142a.f240731d;
            if (runnable != null) {
                ((C87632f) runnable).f236890a.mo81866a();
                this.f241142a.f240731d = null;
                return;
            }
            return;
        }
        throw new RuntimeException("Drawable must be set in the image view");
    }
}
