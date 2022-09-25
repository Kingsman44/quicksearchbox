package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.graphics.Shader;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.VectorDrawable;
import androidx.core.graphics.drawable.C1936i;
import androidx.core.graphics.drawable.C1937j;
import com.google.android.apps.gsa.shared.p7148ui.C90698j;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.al */
/* compiled from: PG */
public final /* synthetic */ class C88801al implements C91043j {

    /* renamed from: a */
    public final /* synthetic */ SuggestionIconView f240421a;

    public /* synthetic */ C88801al(SuggestionIconView suggestionIconView) {
        this.f240421a = suggestionIconView;
    }

    /* renamed from: a */
    public final void mo17709a(Object obj) {
        SuggestionIconView suggestionIconView = this.f240421a;
        Drawable drawable = (Drawable) obj;
        if (drawable == null) {
            suggestionIconView.setImageDrawable((Drawable) null);
        } else if (suggestionIconView.f240379f == 0 || !(drawable instanceof BitmapDrawable)) {
            Drawable jVar = (!suggestionIconView.f240378e || !(drawable instanceof BitmapDrawable)) ? drawable : new C90698j(((BitmapDrawable) drawable).getBitmap());
            if ((drawable instanceof BitmapDrawable) || (drawable instanceof LayerDrawable) || (drawable instanceof StateListDrawable) || (drawable instanceof ShapeDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof VectorDrawable) || (drawable instanceof AnimatedVectorDrawable)) {
                suggestionIconView.setImageDrawable(jVar);
                return;
            }
            try {
                Class<?> cls = Class.forName("android.graphics.drawable.AdaptiveIconDrawable");
                if (cls != null && cls.isInstance(drawable)) {
                    if (suggestionIconView.f240376c != 0) {
                        int dimensionPixelSize = suggestionIconView.getContext().getResources().getDimensionPixelSize(R.dimen.core_suggestion_height);
                        int i = suggestionIconView.f240376c;
                        int i2 = i + ((int) ((((float) ((dimensionPixelSize - i) - suggestionIconView.f240377d)) * 0.19f) / 2.0f));
                        suggestionIconView.setPadding(i2, i2, i2, i2);
                    }
                    suggestionIconView.setImageDrawable(drawable);
                    return;
                }
            } catch (Exception unused) {
            }
            C59104x d = SuggestionIconView.f240374a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.u.IconView");
            ((C59052c) ((C59052c) d).mo56372aa(10033)).mo56389s("Fails to load drawable type %s.", drawable.getClass().getCanonicalName());
            int i3 = C90755l.f253831a;
            suggestionIconView.setImageDrawable(drawable);
        } else {
            C1936i iVar = new C1936i(suggestionIconView.getContext().getResources(), ((BitmapDrawable) drawable).getBitmap());
            float dimension = suggestionIconView.getContext().getResources().getDimension(R.dimen.image_icon_corner_radius);
            if (iVar.f5839d != dimension) {
                iVar.f5841f = false;
                if (C1937j.m5245c(dimension)) {
                    iVar.f5837b.setShader(iVar.f5838c);
                } else {
                    iVar.f5837b.setShader((Shader) null);
                }
                iVar.f5839d = dimension;
                iVar.invalidateSelf();
            }
            suggestionIconView.setImageDrawable(iVar);
        }
    }
}
