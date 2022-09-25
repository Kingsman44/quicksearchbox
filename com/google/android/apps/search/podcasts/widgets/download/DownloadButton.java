package com.google.android.apps.search.podcasts.widgets.download;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class DownloadButton extends FrameLayout {

    /* renamed from: a */
    public final ColorStateList f383398a;

    /* renamed from: b */
    public final ColorStateList f383399b;

    /* renamed from: c */
    public final ColorStateList f383400c;

    /* renamed from: d */
    public boolean f383401d;

    /* renamed from: e */
    public boolean f383402e;

    /* renamed from: f */
    public ObjectAnimator f383403f;

    /* renamed from: g */
    public ImageView f383404g;

    /* renamed from: h */
    public ProgressBar f383405h;

    /* renamed from: i */
    private final ColorStateList f383406i;

    /* renamed from: j */
    private C141220a f383407j;

    /* renamed from: k */
    private ProgressBar f383408k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
        FrameLayout.inflate(context, R.layout.podcasts_download_button, this);
        setFocusable(true);
        setClickable(true);
        ColorStateList valueOf = ColorStateList.valueOf(C141264b.m229297a(context, R.attr.colorHairline));
        C69664n.m101060f(valueOf, "valueOf(\n        Podcast…tr.colorHairline)\n      )");
        this.f383398a = valueOf;
        Context context2 = getContext();
        C69664n.m101060f(context2, "getContext()");
        ColorStateList valueOf2 = ColorStateList.valueOf(C141264b.m229297a(context2, 16843827));
        C69664n.m101060f(valueOf2, "valueOf(\n        Podcast…ttr.colorPrimary)\n      )");
        this.f383399b = valueOf2;
        Context context3 = getContext();
        C69664n.m101060f(context3, "getContext()");
        ColorStateList valueOf3 = ColorStateList.valueOf(C141264b.m229297a(context3, R.attr.colorBrandGreen));
        C69664n.m101060f(valueOf3, "valueOf(\n        Podcast….colorBrandGreen)\n      )");
        this.f383406i = valueOf3;
        Context context4 = getContext();
        C69664n.m101060f(context4, "getContext()");
        ColorStateList valueOf4 = ColorStateList.valueOf(C141264b.m229297a(context4, R.attr.colorError));
        C69664n.m101060f(valueOf4, "valueOf(\n        Podcast….attr.colorError)\n      )");
        this.f383400c = valueOf4;
        setBackgroundResource(C141264b.m229298b(context));
    }

    /* renamed from: a */
    public final void mo116232a() {
        if (this.f383402e) {
            this.f383401d = false;
            ObjectAnimator objectAnimator = this.f383403f;
            ProgressBar progressBar = null;
            if (objectAnimator == null) {
                C69664n.m101065k("downloadingAnimator");
                objectAnimator = null;
            }
            objectAnimator.end();
            ImageView imageView = this.f383404g;
            if (imageView == null) {
                C69664n.m101065k("downloadIcon");
                imageView = null;
            }
            imageView.setImageResource(R.drawable.podcasts_download_done_icon);
            ImageView imageView2 = this.f383404g;
            if (imageView2 == null) {
                C69664n.m101065k("downloadIcon");
                imageView2 = null;
            }
            imageView2.setImageTintList(this.f383406i);
            ProgressBar progressBar2 = this.f383405h;
            if (progressBar2 == null) {
                C69664n.m101065k("progressBar");
                progressBar2 = null;
            }
            progressBar2.setProgress(0);
            ProgressBar progressBar3 = this.f383405h;
            if (progressBar3 == null) {
                C69664n.m101065k("progressBar");
            } else {
                progressBar = progressBar3;
            }
            progressBar.setSecondaryProgress(0);
        }
    }

    /* renamed from: b */
    public final void mo116233b(boolean z) {
        ProgressBar progressBar = this.f383405h;
        ProgressBar progressBar2 = null;
        if (progressBar == null) {
            C69664n.m101065k("progressBar");
            progressBar = null;
        }
        int i = 0;
        progressBar.setVisibility(true != z ? 0 : 8);
        ProgressBar progressBar3 = this.f383408k;
        if (progressBar3 == null) {
            C69664n.m101065k("indeterminateProgressBar");
        } else {
            progressBar2 = progressBar3;
        }
        if (true != z) {
            i = 8;
        }
        progressBar2.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo116234c(ProgressBar progressBar, int i) {
        progressBar.setVisibility(true != this.f383401d ? 8 : 0);
        if (this.f383401d) {
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            animatorArr[0] = ObjectAnimator.ofInt(progressBar, "progress", new int[]{progressBar.getProgress(), i});
            int[] iArr = new int[2];
            iArr[0] = progressBar.getSecondaryProgress();
            int i2 = i + 6;
            if (i2 > 100) {
                i2 = 100;
            }
            iArr[1] = i2;
            animatorArr[1] = ObjectAnimator.ofInt(progressBar, "secondaryProgress", iArr);
            animatorSet.playTogether(animatorArr);
            if (i == 100) {
                C141220a aVar = this.f383407j;
                if (aVar == null) {
                    C69664n.m101065k("onDownloadCompleteCallback");
                    aVar = null;
                }
                animatorSet.addListener(aVar);
            }
            animatorSet.setDuration(1000);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.start();
        } else if (i == 100) {
            mo116232a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.podcasts_download_icon);
        C69664n.m101060f(findViewById, "findViewById(R.id.podcasts_download_icon)");
        this.f383404g = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.podcasts_progress_bar);
        C69664n.m101060f(findViewById2, "findViewById(R.id.podcasts_progress_bar)");
        this.f383405h = (ProgressBar) findViewById2;
        View findViewById3 = findViewById(R.id.podcasts_indeterminate_progress_bar);
        C69664n.m101060f(findViewById3, "findViewById(R.id.podcas…determinate_progress_bar)");
        this.f383408k = (ProgressBar) findViewById3;
        ImageView imageView = this.f383404g;
        ObjectAnimator objectAnimator = null;
        if (imageView == null) {
            C69664n.m101065k("downloadIcon");
            imageView = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f, 0.4f, 1.0f});
        C69664n.m101060f(ofFloat, "ofFloat(downloadIcon, \"alpha\", 1f, 0.4f, 1f)");
        this.f383403f = ofFloat;
        if (ofFloat == null) {
            C69664n.m101065k("downloadingAnimator");
            ofFloat = null;
        }
        ofFloat.setRepeatMode(2);
        ObjectAnimator objectAnimator2 = this.f383403f;
        if (objectAnimator2 == null) {
            C69664n.m101065k("downloadingAnimator");
            objectAnimator2 = null;
        }
        objectAnimator2.setRepeatCount(-1);
        ObjectAnimator objectAnimator3 = this.f383403f;
        if (objectAnimator3 == null) {
            C69664n.m101065k("downloadingAnimator");
            objectAnimator3 = null;
        }
        objectAnimator3.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimator4 = this.f383403f;
        if (objectAnimator4 == null) {
            C69664n.m101065k("downloadingAnimator");
        } else {
            objectAnimator = objectAnimator4;
        }
        objectAnimator.setDuration(1200);
        this.f383407j = new C141220a(new C141227h(this));
    }
}
