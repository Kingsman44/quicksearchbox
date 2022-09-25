package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90135n;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.v */
/* compiled from: PG */
public final /* synthetic */ class C99714v implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99692ab f279047a;

    public /* synthetic */ C99714v(C99692ab abVar) {
        this.f279047a = abVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C99692ab abVar = this.f279047a;
        Boolean bool = (Boolean) obj;
        if (abVar.f278975h == null && bool.booleanValue()) {
            abVar.f278974g.setVisibility(0);
            RadioGroup radioGroup = (RadioGroup) abVar.f278972e.findViewById(R.id.parent_tabs);
            radioGroup.getClass();
            abVar.f278975h = radioGroup;
            abVar.f278976i = (RadioButton) abVar.f278975h.findViewById(R.id.momo_tab);
            abVar.f278977j = (RadioButton) abVar.f278975h.findViewById(R.id.pomo_tab);
            C28292j jVar = new C28292j(50528);
            jVar.mo33795i(5);
            jVar.mo33794h(1);
            if (abVar.f278971d.mo85405j(C90135n.f251817c)) {
                RadioButton radioButton = abVar.f278976i;
                radioButton.getClass();
                C28295m.m52919e(radioButton, jVar);
                C89949q.m146521e(C28285c.m52876c(C28293k.m52908e(jVar, new C28293k[0]), abVar.f278972e), false);
                C28292j jVar2 = new C28292j(50529);
                jVar2.mo33795i(5);
                jVar2.mo33794h(1);
                RadioButton radioButton2 = abVar.f278977j;
                radioButton2.getClass();
                C28295m.m52919e(radioButton2, jVar2);
                C89949q.m146521e(C28285c.m52876c(C28293k.m52908e(jVar2, new C28293k[0]), abVar.f278972e), false);
            }
            abVar.f278975h.setOnCheckedChangeListener(new C99691aa(abVar));
            abVar.mo91571g((C58833ax) ((C99713u) abVar.f278973f).f279044f.f63720e);
            int abs = Math.abs(abVar.f278969b.getDimensionPixelSize(R.dimen.momo_margin_top));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abVar.f278978k.getLayoutParams();
            marginLayoutParams.topMargin = -abs;
            abVar.f278978k.setLayoutParams(marginLayoutParams);
            if (abVar.f278971d.mo85405j(C90138q.f251827a)) {
                Resources resources = abVar.f278969b;
                int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
                float applyDimension = TypedValue.applyDimension(1, 64.0f, abVar.f278969b.getDisplayMetrics());
                abVar.f278975h.setPadding(0, dimensionPixelSize, 0, 0);
                ViewGroup.LayoutParams layoutParams = abVar.f278975h.getLayoutParams();
                layoutParams.height = ((int) applyDimension) + dimensionPixelSize;
                abVar.f278975h.setLayoutParams(layoutParams);
            }
            if (abVar.f278976i != null) {
                LayerDrawable layerDrawable = (LayerDrawable) abVar.f278968a.getDrawable(R.drawable.logo_momo);
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.tab_icon);
                findDrawableByLayerId.mutate();
                findDrawableByLayerId.setTint(abVar.f278968a.getColor(R.color.logo_unselected_color));
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842912}, (LayerDrawable) abVar.f278968a.getDrawable(R.drawable.logo_momo_selected));
                stateListDrawable.addState(new int[0], layerDrawable);
                RadioButton radioButton3 = abVar.f278976i;
                radioButton3.getClass();
                radioButton3.setBackground(stateListDrawable);
            }
            abVar.mo91570e((C58833ax) ((C99713u) abVar.f278973f).f279043e.f63720e);
        }
    }
}
