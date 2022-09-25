package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.en */
/* compiled from: PG */
public final class C108325en extends C108232bc {

    /* renamed from: a */
    public boolean f301332a = false;

    /* renamed from: b */
    public int f301333b = 0;

    public C108325en() {
        super((byte[]) null);
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 0;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 30;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return null;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (blVar.f301077d != null) {
            blVar.f301074a.setVisibility(0);
            Drawable background = blVar.f301077d.getBackground();
            if (C90962a.m148577a(blVar.f301077d.getContext())) {
                background.setColorFilter(new LightingColorFilter(Color.parseColor("#FFFFFF"), Color.parseColor("#101010")));
            }
            if (this.f301332a) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, blVar.f301077d.getContext().getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_carousel_min_height));
                layoutParams.gravity = 48;
                layoutParams.topMargin = this.f301333b;
                blVar.f301077d.setLayoutParams(layoutParams);
                blVar.f301077d.setBackgroundResource(R.drawable.chatui_loading_suggestion_chip_background);
                blVar.f301077d.requestLayout();
                return;
            }
            blVar.f301077d.setLayoutParams(new LinearLayout.LayoutParams(-1, blVar.f301077d.getContext().getResources().getDimensionPixelSize(R.dimen.chatui_loading_card_height)));
            blVar.f301077d.setBackgroundResource(R.drawable.chatui_loading_card_background);
            blVar.f301077d.requestLayout();
        }
    }
}
