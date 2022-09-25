package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C105731j implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C105733l f295077a;

    /* renamed from: b */
    public final /* synthetic */ boolean f295078b;

    public /* synthetic */ C105731j(C105733l lVar, boolean z) {
        this.f295077a = lVar;
        this.f295078b = z;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        int i;
        C105733l lVar = this.f295077a;
        boolean z = this.f295078b;
        if (!lVar.f295084e.equals(rect)) {
            lVar.f295084e = rect;
            if (lVar.f295081b != null) {
                if (z) {
                    i = 0;
                } else {
                    i = lVar.f295080a.getResources().getDimensionPixelSize(R.dimen.min_content_margin);
                }
                lVar.f295081b.setLayoutParams(new FrameLayout.LayoutParams(-1, lVar.f295084e.bottom + i));
            }
        }
    }
}
