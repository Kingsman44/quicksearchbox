package com.google.android.libraries.assistant.ampactions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.C1924a;
import androidx.core.p098j.C2043bi;
import androidx.p119j.p120a.p121a.C2299a;
import com.google.android.apps.gsa.staticplugins.p7932f.p7936d.C100699g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44499d;

/* renamed from: com.google.android.libraries.assistant.ampactions.l */
/* compiled from: PG */
public final class C11039l extends FrameLayout {

    /* renamed from: a */
    public final LinearLayout f36254a;

    /* renamed from: b */
    public final FrameLayout f36255b;

    /* renamed from: c */
    public WebChromeClient.CustomViewCallback f36256c;

    /* renamed from: d */
    public View f36257d;

    /* renamed from: e */
    public final View f36258e;

    /* renamed from: f */
    public final FrameLayout f36259f;

    /* renamed from: g */
    public final TextView f36260g;

    /* renamed from: h */
    public final ImageView f36261h;

    /* renamed from: i */
    public final ImageView f36262i;

    /* renamed from: j */
    public final ImageView f36263j;

    /* renamed from: k */
    public final ImageView f36264k;

    /* renamed from: l */
    public WebView f36265l;

    /* renamed from: m */
    public Runnable f36266m;

    /* renamed from: n */
    public final ColorDrawable f36267n;

    /* renamed from: o */
    public float f36268o = -1.0f;

    /* renamed from: p */
    private final C11044q f36269p;

    /* renamed from: q */
    private boolean f36270q = false;

    public C11039l(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(context, R.layout.ampactions_view, this);
        View findViewById = findViewById(R.id.ampactions_header);
        this.f36258e = findViewById;
        findViewById.setClipToOutline(true);
        this.f36260g = (TextView) findViewById(R.id.ampactions_header_title);
        this.f36261h = (ImageView) findViewById(R.id.ampactions_header_logo);
        this.f36262i = (ImageView) findViewById(R.id.ampactions_header_branding_logo);
        ImageView imageView = (ImageView) findViewById(R.id.ampactions_header_close);
        this.f36263j = imageView;
        this.f36264k = (ImageView) findViewById(R.id.ampactions_header_info);
        this.f36255b = (FrameLayout) findViewById(R.id.webview_container);
        this.f36259f = (FrameLayout) findViewById(R.id.fullscreen_container);
        this.f36254a = (LinearLayout) findViewById(R.id.ampactions_container);
        ColorDrawable colorDrawable = new ColorDrawable(C1924a.m5189h(-16777216, 150));
        this.f36267n = colorDrawable;
        setBackgroundDrawable(colorDrawable);
        imageView.setOnClickListener(new C11034g(this));
        this.f36269p = new C11044q(this, new C11036i(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo19502a() {
        Runnable runnable = this.f36266m;
        if (runnable != null) {
            ((C100699g) runnable).f281558a.mo92016d();
        }
    }

    /* renamed from: b */
    public final void mo19503b() {
        Log.d("AmpActionsView", "runSlideExitAnimation");
        if (this.f36270q) {
            Runnable runnable = this.f36266m;
            if (runnable != null) {
                ((C100699g) runnable).f281558a.mo92016d();
                return;
            }
            return;
        }
        this.f36270q = true;
        LinearLayout linearLayout = this.f36254a;
        ColorDrawable colorDrawable = this.f36267n;
        C11035h hVar = new C11035h(this);
        int height = linearLayout.getHeight();
        int top = linearLayout.getTop();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_Y, new float[]{(float) (height - top)});
        ofFloat.setInterpolator(new C2299a());
        ObjectAnimator ofObject = ObjectAnimator.ofObject(colorDrawable, "color", new C44499d(), new Object[]{0});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofObject});
        animatorSet.addListener(new C11037j(hVar));
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    public final void computeScroll() {
        super.computeScroll();
        C11044q qVar = this.f36269p;
        if (qVar.f36279d.mo5415l()) {
            C2043bi.m5519M(qVar.f36278c);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36265l = null;
        this.f36255b.removeAllViews();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f36269p.f36279d.mo5412i(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C11044q qVar = this.f36269p;
        View view = qVar.f36280e;
        if (view != null) {
            C2043bi.m5517K(view, qVar.f36281f);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f36268o = motionEvent.getY();
        this.f36269p.f36279d.mo5408e(motionEvent);
        return true;
    }
}
