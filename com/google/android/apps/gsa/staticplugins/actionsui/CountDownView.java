package com.google.android.apps.gsa.staticplugins.actionsui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class CountDownView extends RelativeLayout {

    /* renamed from: a */
    public ProgressBar f260746a;

    /* renamed from: b */
    public View f260747b;

    /* renamed from: c */
    public TextView f260748c;

    /* renamed from: d */
    public View f260749d;

    /* renamed from: e */
    public ObjectAnimator f260750e;

    /* renamed from: f */
    C93505k f260751f;

    /* renamed from: g */
    private ViewGroup f260752g;

    /* renamed from: h */
    private ImageView f260753h;

    public CountDownView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo87723a() {
        ObjectAnimator objectAnimator = this.f260750e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f260746a.setProgress(0);
        }
        if (this.f260746a.getVisibility() == 0) {
            this.f260746a.setVisibility(4);
            this.f260749d.setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void mo87724b(Drawable drawable, boolean z) {
        if (drawable == null) {
            this.f260753h.setVisibility(8);
            return;
        }
        if (!z) {
            this.f260753h.setColorFilter((ColorFilter) null);
            this.f260753h.setAlpha(1.0f);
        } else {
            this.f260753h.setColorFilter(-16777216);
            this.f260753h.setAlpha(0.38f);
        }
        this.f260753h.setImageDrawable(drawable);
        this.f260753h.setPadding(0, 0, 0, 0);
        ViewParent parent = this.f260753h.getParent();
        ViewGroup viewGroup = this.f260752g;
        if (parent != viewGroup) {
            ImageView imageView = this.f260753h;
            viewGroup.removeAllViews();
            this.f260752g.addView(imageView);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.action_confirm_countdown_bar);
        this.f260746a = progressBar;
        C89941l.m146512c(progressBar, 7288);
        this.f260752g = (ViewGroup) findViewById(R.id.action_confirm_icon_view);
        this.f260753h = (ImageView) findViewById(R.id.action_confirm_icon);
        View findViewById = findViewById(R.id.action_confirm_bar);
        this.f260747b = findViewById;
        C89941l.m146512c(findViewById, 7284);
        this.f260747b.setOnClickListener(new C93700y(this));
        this.f260748c = (TextView) findViewById(R.id.action_confirm_button);
        View findViewById2 = findViewById(R.id.action_confirm_countdown_cancel);
        this.f260749d = findViewById2;
        C89941l.m146512c(findViewById2, 7286);
        View view = this.f260749d;
        if (view != null) {
            view.setOnClickListener(new C93701z(this));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CountDownView.class.getCanonicalName());
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.ResultCard);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
