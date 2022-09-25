package com.google.android.libraries.onegoogle.accountmenu.p2357e;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.p033v7.widget.C0678gm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.common.C30915b;
import com.google.android.libraries.onegoogle.common.C30925l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.e.a */
/* compiled from: PG */
public final class C30486a {
    /* renamed from: a */
    public static Drawable m56847a(C30925l lVar, int i, int i2) {
        Drawable c = C0678gm.m2375e().mo3100c(((C30915b) lVar).f83342a, R.drawable.badge_exclamation_vd);
        C30905ae.m57696b(c, i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C30905ae.m57696b(shapeDrawable, i2);
        return new LayerDrawable(new Drawable[]{shapeDrawable, c});
    }
}
