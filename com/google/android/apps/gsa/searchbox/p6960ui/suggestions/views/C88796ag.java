package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ag */
/* compiled from: PG */
public final /* synthetic */ class C88796ag implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RichImageCarouselSuggestionView f240420a;

    public /* synthetic */ C88796ag(RichImageCarouselSuggestionView richImageCarouselSuggestionView) {
        this.f240420a = richImageCarouselSuggestionView;
    }

    public final void onClick(View view) {
        RichImageCarouselSuggestionView richImageCarouselSuggestionView = this.f240420a;
        if (richImageCarouselSuggestionView.f240360f) {
            richImageCarouselSuggestionView.f240356b.mo82562e(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, 0, richImageCarouselSuggestionView.f240355a.getResources().getString(R.string.accessibility_collapse));
            HorizontalScrollView horizontalScrollView = richImageCarouselSuggestionView.f240366q;
            if (horizontalScrollView != null) {
                horizontalScrollView.setVisibility(8);
            }
            richImageCarouselSuggestionView.f240357c.setVisibility(8);
            richImageCarouselSuggestionView.f240360f = false;
            richImageCarouselSuggestionView.f240418o.mo82333hK(6, view, richImageCarouselSuggestionView.f240417n, (String) null);
            return;
        }
        if (richImageCarouselSuggestionView.f240366q == null) {
            HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) richImageCarouselSuggestionView.f240358d.inflate();
            horizontalScrollView2.getClass();
            richImageCarouselSuggestionView.f240366q = horizontalScrollView2;
            LinearLayout linearLayout = (LinearLayout) richImageCarouselSuggestionView.f240366q.findViewById(R.id.image_carousel_container);
            linearLayout.getClass();
            richImageCarouselSuggestionView.f240367r = linearLayout;
            richImageCarouselSuggestionView.f240364j = AnimatorInflater.loadAnimator(richImageCarouselSuggestionView.f240355a, R.animator.ghost_card_shimmer);
        }
        if (!richImageCarouselSuggestionView.f240359e && richImageCarouselSuggestionView.f240418o != null) {
            int i = 0;
            while (i < 10) {
                if (i < 10) {
                    if (i >= richImageCarouselSuggestionView.f240368s.size()) {
                        SuggestionIconView suggestionIconView = (SuggestionIconView) richImageCarouselSuggestionView.f240361g.inflate(R.layout.image_thumbnail_view, richImageCarouselSuggestionView.f240367r, false);
                        richImageCarouselSuggestionView.f240368s.add(i, suggestionIconView);
                        richImageCarouselSuggestionView.f240367r.addView(suggestionIconView, i);
                    }
                    SuggestionIconView suggestionIconView2 = (SuggestionIconView) richImageCarouselSuggestionView.f240368s.get(i);
                    suggestionIconView2.setOnClickListener((View.OnClickListener) null);
                    suggestionIconView2.setOnTouchListener((View.OnTouchListener) null);
                    suggestionIconView2.mo82558a(richImageCarouselSuggestionView.f240363i);
                    suggestionIconView2.mo82563f(richImageCarouselSuggestionView.f240362h, 0);
                    i++;
                } else {
                    throw new IllegalArgumentException("This suggestion view doesn't support adding more than10images");
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i2 = 0; i2 < 5; i2++) {
                Animator clone = richImageCarouselSuggestionView.f240364j.clone();
                clone.setTarget((View) richImageCarouselSuggestionView.f240368s.get(i2));
                animatorSet.play(clone).after((long) (i2 * 75));
            }
            richImageCarouselSuggestionView.f240365k = animatorSet;
            richImageCarouselSuggestionView.f240365k.addListener(new C88797ah());
            richImageCarouselSuggestionView.f240365k.start();
            richImageCarouselSuggestionView.f240418o.mo82471p(5, richImageCarouselSuggestionView, richImageCarouselSuggestionView.f240417n);
            richImageCarouselSuggestionView.f240359e = true;
        }
        richImageCarouselSuggestionView.f240356b.mo82562e(R.drawable.quantum_ic_keyboard_arrow_up_grey600_24, 0, richImageCarouselSuggestionView.f240355a.getResources().getString(R.string.accessibility_expand));
        richImageCarouselSuggestionView.f240366q.setVisibility(0);
        richImageCarouselSuggestionView.f240357c.setVisibility(0);
        richImageCarouselSuggestionView.f240360f = true;
        richImageCarouselSuggestionView.f240418o.mo82333hK(5, view, richImageCarouselSuggestionView.f240417n, (String) null);
    }
}
