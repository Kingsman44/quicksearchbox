package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import com.google.protos.p5146w.p5147a.p5148a.C65939q;
import com.google.protos.p5146w.p5147a.p5148a.C65941s;
import com.google.protos.p5146w.p5149b.p5157c.C65960j;
import com.google.protos.p5146w.p5149b.p5157c.C65962l;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ThumbnailView */
/* compiled from: PG */
public class ThumbnailView extends LinearLayout {

    /* renamed from: a */
    public FrameLayout f285517a;

    /* renamed from: b */
    public ImageView f285518b;

    /* renamed from: c */
    public View f285519c;

    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo93099a(C65930h hVar, FrameLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        this.f285518b.setLayoutParams(layoutParams);
        this.f285517a.setLayoutParams(layoutParams2);
        this.f285517a.setForeground(getResources().getDrawable(R.drawable.monet_viewer_tap_highlight));
        ActionIndicator actionIndicator = (ActionIndicator) findViewById(R.id.image_action_indicator);
        if (ActionIndicator.m169567a(hVar)) {
            if (!ActionIndicator.m169567a(hVar)) {
                actionIndicator.setVisibility(8);
            }
            C62940bt r8 = C62942bv.checkIsLite(C65939q.f179347b);
            hVar.mo58887l(r8);
            if (hVar.f169962ag.mo58857o(r8.f169971d)) {
                C62940bt r82 = C62942bv.checkIsLite(C65939q.f179347b);
                hVar.mo58887l(r82);
                Object l = hVar.f169962ag.mo58854l(r82.f169971d);
                if (l == null) {
                    obj2 = r82.f169969b;
                } else {
                    obj2 = r82.mo58889c(l);
                }
                C65960j jVar = (C65960j) obj2;
                int i = jVar.f179412a;
                if ((i & 2) != 0) {
                    actionIndicator.f285413a.setImageResource(R.drawable.quantum_ic_local_offer_grey600_18);
                    actionIndicator.f285414b.setText(R.string.images_action_indicator_product_text);
                } else if ((i & 1) != 0) {
                    actionIndicator.f285413a.setImageResource(R.drawable.quantum_ic_restaurant_grey600_18);
                    actionIndicator.f285414b.setText(R.string.images_action_indicator_recipe_text);
                } else if ((i & 4) != 0) {
                    actionIndicator.f285413a.setImageResource(R.drawable.quantum_ic_play_arrow_grey600_18);
                    TextView textView = actionIndicator.f285414b;
                    C65962l lVar = jVar.f179415d;
                    if (lVar == null) {
                        lVar = C65962l.f179417l;
                    }
                    if ((lVar.f179419a & 4) != 0) {
                        C65962l lVar2 = jVar.f179415d;
                        if (lVar2 == null) {
                            lVar2 = C65962l.f179417l;
                        }
                        str2 = lVar2.f179422d;
                    } else {
                        str2 = actionIndicator.getResources().getString(R.string.images_action_indicator_video_text);
                    }
                    textView.setText(str2);
                }
            } else if (hVar.f179309h) {
                actionIndicator.f285413a.setImageResource(R.drawable.gif_action_indicator);
                actionIndicator.f285414b.setVisibility(8);
            }
        } else {
            actionIndicator.setVisibility(8);
        }
        C62940bt r7 = C62942bv.checkIsLite(C65941s.f179350e);
        hVar.mo58887l(r7);
        if (hVar.f169962ag.mo58857o(r7.f169971d)) {
            C62940bt r72 = C62942bv.checkIsLite(C65937o.f179333l);
            hVar.mo58887l(r72);
            if (hVar.f169962ag.mo58857o(r72.f169971d)) {
                C62940bt r73 = C62942bv.checkIsLite(C65941s.f179350e);
                hVar.mo58887l(r73);
                Object l2 = hVar.f169962ag.mo58854l(r73.f169971d);
                if (l2 == null) {
                    obj = r73.f169969b;
                } else {
                    obj = r73.mo58889c(l2);
                }
                C65941s sVar = (C65941s) obj;
                TextView textView2 = (TextView) this.f285519c.findViewById(R.id.image_grid_image_snippet);
                TextView textView3 = (TextView) this.f285519c.findViewById(R.id.image_grid_image_referrer);
                C2043bi.m5526T(this.f285519c, new C102363e(getContext(), R.string.images_visit_site));
                if ((sVar.f179352a & 2) != 0) {
                    textView2.setText(sVar.f179354c);
                    str = sVar.f179354c;
                } else {
                    textView2.setVisibility(8);
                    str = BuildConfig.FLAVOR;
                }
                if ((sVar.f179352a & 1) != 0) {
                    textView3.setText(sVar.f179353b);
                    str = str + " " + sVar.f179353b;
                } else {
                    textView3.setVisibility(8);
                }
                this.f285519c.setContentDescription(str);
                int i2 = sVar.f179352a;
                if ((i2 & 2) == 0 && (i2 & 1) == 0) {
                    this.f285519c.setVisibility(8);
                    return;
                }
                return;
            }
        }
        this.f285519c.setVisibility(8);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285517a = (FrameLayout) findViewById(R.id.image_grid_image_frame);
        this.f285518b = (ImageView) findViewById(R.id.image_grid_image_thumbnail);
        this.f285519c = findViewById(R.id.image_grid_image_text_container);
    }
}
