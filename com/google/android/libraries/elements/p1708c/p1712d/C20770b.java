package com.google.android.libraries.elements.p1708c.p1712d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.core.content.C1878d;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21282by;
import com.google.android.libraries.elements.interfaces.C21283bz;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1714d.p1719e.p1723b.C21025d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66210dx;
import com.google.protos.youtube.elements.C66260r;
import java.util.Locale;

/* renamed from: com.google.android.libraries.elements.c.d.b */
/* compiled from: PG */
public final class C20770b implements C21283bz {

    /* renamed from: a */
    private final C21259bb f58110a;

    public C20770b(C21259bb bbVar) {
        this.f58110a = bbVar;
    }

    /* renamed from: c */
    private static int m38982c(C6411u uVar, C66210dx dxVar, C21259bb bbVar) {
        Context context = uVar.f19009b;
        int i = dxVar.f180046a;
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(16843820, typedValue, true)) {
            bbVar.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, String.format(Locale.US, "Ripple color (attribute = %s) not defined in the theme", new Object[]{"android.R.attr.colorControlHighlight"}), C21319z.f59680u, (Throwable) null);
            return 0;
        }
        try {
            return C1878d.m5128a(context, typedValue.resourceId);
        } catch (Resources.NotFoundException e) {
            bbVar.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, String.format(Locale.US, "Ripple Color (attribute = %s) is associated with undefined (colorId = %s)", new Object[]{"android.R.attr.colorControlHighlight", Integer.toHexString(typedValue.resourceId)}), C21319z.f59680u, e);
            return 0;
        }
    }

    /* renamed from: d */
    private static void m38983d(C66210dx dxVar, RippleDrawable rippleDrawable, DisplayMetrics displayMetrics) {
        int i = dxVar.f180047b;
        if (i != 0) {
            rippleDrawable.setRadius(Math.round(TypedValue.applyDimension(1, (float) i, displayMetrics)));
        }
    }

    /* renamed from: a */
    public final C62917ay mo25834a() {
        return C66210dx.f180044e;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25835b(C6411u uVar, Object obj, C21282by byVar) {
        C66210dx dxVar = (C66210dx) obj;
        int c = m38982c(uVar, dxVar, this.f58110a);
        if (c != 0) {
            boolean z = dxVar.f180048c;
            Drawable drawable = byVar.f59602e;
            DisplayMetrics displayMetrics = uVar.f19009b.getResources().getDisplayMetrics();
            C21025d dVar = null;
            if (z) {
                if (drawable == null) {
                    dVar = new C21025d();
                    dVar.f58925c = -1;
                    dVar.f58926d = byVar.f59598a;
                }
                RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(c), drawable, dVar);
                m38983d(dxVar, rippleDrawable, displayMetrics);
                byVar.f59602e = rippleDrawable;
                return;
            }
            RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(c), (Drawable) null, (Drawable) null);
            m38983d(dxVar, rippleDrawable2, displayMetrics);
            if (drawable == null) {
                byVar.f59602e = rippleDrawable2;
                return;
            }
            byVar.f59602e = new LayerDrawable(new Drawable[]{drawable, rippleDrawable2});
        }
    }
}
