package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.imageviewer.reviewstars.ReviewStarsView;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.RecipeMetadataView */
/* compiled from: PG */
public class RecipeMetadataView extends LinearLayout {

    /* renamed from: a */
    public LinearLayout f285490a;

    /* renamed from: b */
    public LinearLayout f285491b;

    /* renamed from: c */
    public LinearLayout f285492c;

    /* renamed from: d */
    public LinearLayout f285493d;

    /* renamed from: e */
    public LinearLayout f285494e;

    /* renamed from: f */
    public ReviewStarsView f285495f;

    /* renamed from: g */
    public TextView f285496g;

    /* renamed from: h */
    public TextView f285497h;

    /* renamed from: i */
    public TextView f285498i;

    /* renamed from: j */
    public TextView f285499j;

    /* renamed from: k */
    public TextView f285500k;

    /* renamed from: l */
    public TextView f285501l;

    public RecipeMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285490a = (LinearLayout) findViewById(R.id.recipe_details_row);
        this.f285491b = (LinearLayout) findViewById(R.id.recipe_ingredients_layout);
        this.f285492c = (LinearLayout) findViewById(R.id.recipe_rating_layout);
        this.f285493d = (LinearLayout) findViewById(R.id.recipe_time_layout);
        this.f285494e = (LinearLayout) findViewById(R.id.recipe_yield_layout);
        this.f285495f = (ReviewStarsView) findViewById(R.id.recipe_review_stars);
        this.f285496g = (TextView) findViewById(R.id.recipe_description);
        this.f285497h = (TextView) findViewById(R.id.recipe_ingredients_label);
        this.f285498i = (TextView) findViewById(R.id.recipe_rating_value);
        this.f285499j = (TextView) findViewById(R.id.recipe_time);
        this.f285500k = (TextView) findViewById(R.id.recipe_vote_count_message);
        this.f285501l = (TextView) findViewById(R.id.recipe_yield);
        ((LetterSpacingTextView) findViewById(R.id.recipe_rating_heading)).mo93091a();
        ((LetterSpacingTextView) findViewById(R.id.recipe_yield_heading)).mo93091a();
        ((LetterSpacingTextView) findViewById(R.id.recipe_cook_time_heading)).mo93091a();
        ((LetterSpacingTextView) findViewById(R.id.recipe_ingredients_label)).mo93091a();
    }
}
