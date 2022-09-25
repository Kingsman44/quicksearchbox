package com.google.android.libraries.lens.view.filters;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import androidx.constraintlayout.widget.C1752k;
import androidx.constraintlayout.widget.C1756o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* compiled from: PG */
public final class LvfButtonsView extends C25934bm implements C47231d {

    /* renamed from: a */
    public C25916aw f70221a;

    @Deprecated
    public LvfButtonsView(Context context) {
        super(context);
        m47688e();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final void m47688e() {
        if (this.f70221a == null) {
            try {
                C25918ay ayVar = (C25918ay) mo31100b().mo17653jN();
                C25910aq aqVar = new C25910aq(this);
                C47240i.m84036c(aqVar);
                try {
                    C25916aw J = ayVar.mo31076J();
                    this.f70221a = J;
                    if (J == null) {
                        C47240i.m84035b(aqVar);
                    }
                    this.f70221a.f70420k = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f70221a == null) {
                        C47240i.m84035b(aqVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* renamed from: a */
    public final C25916aw mo17754z() {
        C25916aw awVar = this.f70221a;
        if (awVar != null) {
            return awVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m47688e();
        this.f70221a.f70409a.requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m47688e();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        Display display;
        m47688e();
        C25916aw awVar = this.f70221a;
        int i3 = 80;
        if (!C24974a.m46225a(awVar.f70414f.f68122a) && awVar.f70409a.getResources().getConfiguration().orientation == 2 && (display = awVar.f70409a.getDisplay()) != null) {
            int rotation = display.getRotation();
            if (rotation == 1) {
                i3 = 5;
            } else if (rotation == 3) {
                i3 = 3;
            }
        }
        if (i3 == awVar.f70417i) {
            super.onMeasure(i, i2);
            return;
        }
        awVar.f70417i = i3;
        awVar.f70409a.setGravity(i3);
        awVar.f70409a.setOrientation(C25915av.m47795a(awVar.f70417i) ? 1 : 0);
        awVar.mo31075a();
        if (C25915av.m47795a(awVar.f70417i)) {
            C1756o oVar = awVar.f70415g;
            if (oVar != null) {
                oVar.mo4888h(awVar.f70412d);
            }
        } else {
            if (awVar.f70416h == null) {
                awVar.f70415g = new C1756o();
                awVar.f70415g.mo4889i(awVar.f70412d);
                C1756o oVar2 = new C1756o();
                Resources resources = awVar.f70409a.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.shutter_button_outer_ring_size);
                oVar2.mo4902x(R.id.shutter_view_set);
                oVar2.mo4901w(R.id.shutter_view_set, 3, 4);
                oVar2.mo4895o(R.id.shutter_view_set, dimensionPixelSize);
                oVar2.mo4893m(R.id.shutter_view_set, dimensionPixelSize);
                oVar2.mo4902x(R.id.image_picker_button_view);
                oVar2.mo4895o(R.id.image_picker_button_view, -2);
                oVar2.mo4893m(R.id.image_picker_button_view, -2);
                C1752k kVar = oVar2.mo4885e(R.id.lens_shutter_rotated_bottom_guideline).f5342e;
                kVar.f5390b = true;
                kVar.f5353G = 0;
                oVar2.mo4885e(R.id.lens_shutter_rotated_bottom_guideline).f5342e.f5395g = resources.getDimensionPixelSize(R.dimen.filter_carousel_height_with_borders);
                oVar2.mo4885e(R.id.lens_shutter_rotated_bottom_guideline).f5342e.f5394f = -1;
                oVar2.mo4885e(R.id.lens_shutter_rotated_bottom_guideline).f5342e.f5396h = -1.0f;
                oVar2.mo4891k(R.id.image_picker_button_view, 3, R.id.shutter_view_set, 4);
                oVar2.mo4891k(R.id.image_picker_button_view, 4, R.id.lens_shutter_rotated_bottom_guideline, 3);
                awVar.f70416h = oVar2;
            }
            awVar.f70416h.mo4888h(awVar.f70412d);
        }
        super.onMeasure(i, i2);
    }

    public LvfButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LvfButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LvfButtonsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public LvfButtonsView(C47274n nVar) {
        super(nVar);
        m47688e();
    }
}
