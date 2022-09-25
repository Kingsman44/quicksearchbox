package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.RelatedContentHeader */
/* compiled from: PG */
public class RelatedContentHeader extends LinearLayout {

    /* renamed from: a */
    public LinearLayout f285502a;

    /* renamed from: b */
    public ImageGridView f285503b;

    /* renamed from: c */
    public LinearLayout f285504c;

    /* renamed from: d */
    public C102374p f285505d;

    /* renamed from: e */
    public View f285506e;

    /* renamed from: f */
    public MaterialProgressBar f285507f;

    /* renamed from: g */
    public C65949b f285508g;

    /* renamed from: h */
    public boolean f285509h = false;

    /* renamed from: i */
    public final Map f285510i = new HashMap();

    /* renamed from: j */
    public final C102338bk f285511j = new C102338bk(this);

    public RelatedContentHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo93096a() {
        removeView(this.f285507f);
        this.f285507f = MaterialProgressBar.m53446i(getContext(), 2);
        this.f285507f.setPadding(0, getResources().getDimensionPixelSize(R.dimen.monet_viewer_related_content_spinner_top_padding), 0, 0);
        addView(this.f285507f, 0);
    }

    /* renamed from: b */
    public final void mo93097b() {
        removeView(this.f285507f);
        setVisibility(8);
        this.f285502a.setVisibility(0);
        LinearLayout linearLayout = this.f285504c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        setAlpha(0.0f);
        setVisibility(0);
        setTranslationY(getResources().getDimension(R.dimen.monet_viewer_related_content_animation_distance));
        post(new C102333bf(this));
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285502a = (LinearLayout) findViewById(R.id.related_images_layout);
        this.f285503b = (ImageGridView) findViewById(R.id.related_images_grid);
        ((LetterSpacingTextView) findViewById(R.id.related_title)).mo93091a();
        ((LetterSpacingTextView) findViewById(R.id.related_view_all)).mo93091a();
        ((LetterSpacingTextView) findViewById(R.id.more_related_images_text)).mo93091a();
    }
}
