package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui.RatingView;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fh */
/* compiled from: PG */
public final /* synthetic */ class C105615fh implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105620fm f294677a;

    public /* synthetic */ C105615fh(C105620fm fmVar) {
        this.f294677a = fmVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        String str;
        C105620fm fmVar = this.f294677a;
        String str2 = (String) obj;
        RatingView ratingView = fmVar.f294688g;
        if (ratingView != null) {
            if (str2.isEmpty()) {
                str = str2;
            } else {
                str = " ".concat(String.valueOf(str2));
            }
            ImageView imageView = ratingView.f294760a[4];
            imageView.setContentDescription(String.valueOf(String.valueOf(imageView.getContentDescription())).concat(String.valueOf(str)));
        }
        C105620fm.m175756j(fmVar.f294687f, str2);
    }
}
