package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.f */
/* compiled from: PG */
public final class C139108f {

    /* renamed from: a */
    public final C139107e f378325a;

    /* renamed from: b */
    public final AccountId f378326b;

    /* renamed from: c */
    public final C28306ab f378327c;

    /* renamed from: d */
    public final C47400m f378328d;

    /* renamed from: e */
    public final C139093br f378329e;

    /* renamed from: f */
    public C139080be f378330f;

    /* renamed from: g */
    private final Context f378331g;

    /* renamed from: h */
    private final C139045c f378332h;

    public C139108f(C139107e eVar, AccountId accountId, C28306ab abVar, C139045c cVar, C47400m mVar, C139093br brVar, C139080be beVar) {
        this.f378325a = eVar;
        this.f378331g = eVar.getContext();
        this.f378326b = accountId;
        this.f378327c = abVar;
        this.f378332h = cVar;
        this.f378328d = mVar;
        this.f378329e = brVar;
        this.f378330f = beVar;
    }

    /* renamed from: a */
    public static ImageButton m225966a(View view) {
        return (ImageButton) view.findViewById(R.id.googleapp_custom_color);
    }

    /* renamed from: b */
    public static void m225967b(View view, C139079bd bdVar) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.googleapp_standard_color_theme);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.googleapp_monochrome_light_theme);
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.googleapp_monochrome_dark_theme);
        ImageButton a = m225966a(view);
        imageButton.setSelected(false);
        imageButton2.setSelected(false);
        imageButton3.setSelected(false);
        a.setSelected(false);
        C139079bd bdVar2 = C139079bd.THEME_UNKNOWN;
        int ordinal = bdVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            imageButton.setSelected(true);
        } else if (ordinal == 2) {
            imageButton2.setSelected(true);
        } else if (ordinal == 3) {
            imageButton3.setSelected(true);
        } else if (ordinal == 4) {
            a.setSelected(true);
        }
    }

    /* renamed from: c */
    public final void mo114727c(C139079bd bdVar) {
        m225967b(this.f378325a.requireView(), bdVar);
        C139080be beVar = this.f378330f;
        beVar.getClass();
        C139074az azVar = beVar.f378255f;
        if (azVar == null) {
            azVar = C139074az.f378227d;
        }
        C139070av avVar = (C139070av) this.f378330f.toBuilder();
        C139073ay ayVar = (C139073ay) azVar.toBuilder();
        ayVar.copyOnWrite();
        C139074az azVar2 = (C139074az) ayVar.instance;
        azVar2.f378230b = bdVar.f378247f;
        azVar2.f378229a |= 1;
        avVar.copyOnWrite();
        C139080be beVar2 = (C139080be) avVar.instance;
        C139074az azVar3 = (C139074az) ayVar.build();
        azVar3.getClass();
        beVar2.f378255f = azVar3;
        beVar2.f378250a |= 16;
        C139080be beVar3 = (C139080be) avVar.build();
        this.f378330f = beVar3;
        this.f378332h.mo114666a(beVar3);
    }

    /* renamed from: d */
    public final void mo114728d(ImageButton imageButton, int i) {
        int dimension = (int) this.f378331g.getResources().getDimension(R.dimen.googleapp_customize_color_button_stroke);
        for (Drawable drawable : ((DrawableContainer.DrawableContainerState) ((StateListDrawable) imageButton.getBackground()).getConstantState()).getChildren()) {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                    Drawable drawable2 = layerDrawable.getDrawable(i2);
                    if (drawable2 instanceof GradientDrawable) {
                        ((GradientDrawable) drawable2).setStroke(dimension, i);
                    }
                }
            }
        }
    }
}
