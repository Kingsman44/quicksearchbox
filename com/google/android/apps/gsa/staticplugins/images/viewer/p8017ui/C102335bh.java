package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.protobuf.C62971cq;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65951d;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bh */
/* compiled from: PG */
public final /* synthetic */ class C102335bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RelatedContentHeader f285602a;

    /* renamed from: b */
    public final /* synthetic */ C65949b f285603b;

    public /* synthetic */ C102335bh(RelatedContentHeader relatedContentHeader, C65949b bVar) {
        this.f285602a = relatedContentHeader;
        this.f285603b = bVar;
    }

    public final void run() {
        RelatedContentHeader relatedContentHeader = this.f285602a;
        C65949b bVar = this.f285603b;
        int i = 8;
        boolean z = false;
        if (bVar.f179373d.size() > 0) {
            C62971cq cqVar = bVar.f179373d;
            LayoutInflater from = LayoutInflater.from(relatedContentHeader.getContext());
            LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.image_viewer_related_searches, relatedContentHeader, false);
            C28295m.m52919e(linearLayout, new C28292j(18376));
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.related_searches_holder);
            ((LetterSpacingTextView) linearLayout.findViewById(R.id.related_searches_title)).mo93091a();
            float dimension = relatedContentHeader.getResources().getDimension(R.dimen.image_viewer_related_searches_corners);
            int color = relatedContentHeader.getResources().getColor(R.color.monet_viewer_tap_highlight);
            int i2 = 0;
            while (i2 < cqVar.size()) {
                RelativeLayout relativeLayout = (RelativeLayout) from.inflate(R.layout.image_viewer_related_search_item, linearLayout, z);
                String str = ((C65951d) cqVar.get(i2)).f179377a;
                ((TextView) relativeLayout.findViewById(R.id.related_search_item_text)).setText(str);
                relativeLayout.setContentDescription(str);
                C2043bi.m5526T(relativeLayout, new C102363e(relatedContentHeader.getContext(), R.string.images_related_search_accessibility_action));
                float f = i2 == 0 ? dimension : 0.0f;
                float f2 = i2 == cqVar.size() + -1 ? dimension : 0.0f;
                float[] fArr = new float[i];
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = f;
                fArr[3] = f;
                fArr[4] = f2;
                fArr[5] = f2;
                fArr[6] = f2;
                fArr[7] = f2;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-1);
                gradientDrawable.setCornerRadii(fArr);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(color);
                gradientDrawable2.setCornerRadii(fArr);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
                stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
                relativeLayout.setBackground(stateListDrawable);
                C28292j jVar = new C28292j(18356);
                jVar.mo33794h(1);
                jVar.mo33795i(5);
                C28295m.m52919e(relativeLayout, jVar);
                C102374p pVar = relatedContentHeader.f285505d;
                pVar.f285686h.mo93139f(relativeLayout, pVar.f285681c, new C102334bg(relatedContentHeader, str));
                linearLayout2.addView(relativeLayout);
                i2++;
                i = 8;
                z = false;
            }
            relatedContentHeader.f285504c = linearLayout;
            relatedContentHeader.addView(linearLayout);
        }
        ImageGridView imageGridView = relatedContentHeader.f285503b;
        imageGridView.f285438d = relatedContentHeader.f285511j;
        imageGridView.f285436b = 4166;
        C65926d dVar = bVar.f179371b;
        if (dVar == null) {
            dVar = C65926d.f179289b;
        }
        imageGridView.mo93070a(dVar);
        View findViewById = relatedContentHeader.findViewById(R.id.related_view_all);
        View findViewById2 = relatedContentHeader.findViewById(R.id.more_related_images);
        if ((relatedContentHeader.f285508g.f179370a & 4) != 0) {
            C102332be beVar = new C102332be(relatedContentHeader);
            View findViewById3 = relatedContentHeader.findViewById(R.id.more_related_images_text);
            findViewById2.setVisibility(0);
            findViewById.setVisibility(0);
            findViewById3.setVisibility(0);
            C2043bi.m5526T(findViewById, new C102363e(relatedContentHeader.getContext(), R.string.images_view_all_related_images_accessibility));
            C2043bi.m5526T(findViewById2, new C102363e(relatedContentHeader.getContext(), R.string.images_view_all_related_images_accessibility));
            C28292j jVar2 = new C28292j(15150);
            jVar2.mo33795i(5);
            C28295m.m52919e(findViewById, jVar2);
            C28292j jVar3 = new C28292j(16696);
            jVar3.mo33795i(5);
            C28295m.m52919e(findViewById3, jVar3);
            C102374p pVar2 = relatedContentHeader.f285505d;
            pVar2.f285686h.mo93139f(findViewById, pVar2.f285681c, beVar);
            C102374p pVar3 = relatedContentHeader.f285505d;
            pVar3.f285686h.mo93139f(findViewById3, pVar3.f285681c, beVar);
        } else {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
        }
        C28292j jVar4 = new C28292j(8152);
        jVar4.mo33795i(22);
        C28295m.m52919e(relatedContentHeader, jVar4);
        relatedContentHeader.f285505d.f285686h.mo93136c(relatedContentHeader, relatedContentHeader.f285506e);
        relatedContentHeader.mo93097b();
        relatedContentHeader.f285509h = true;
    }
}
