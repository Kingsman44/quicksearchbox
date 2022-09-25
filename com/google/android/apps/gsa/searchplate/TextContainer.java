package com.google.android.apps.gsa.searchplate;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class TextContainer extends FrameLayout {

    /* renamed from: a */
    public static final C59071e f240769a = C59071e.m91332i("com.google.android.apps.gsa.searchplate.TextContainer");

    /* renamed from: b */
    SimpleSearchText f240770b;

    /* renamed from: c */
    public TextView f240771c;

    /* renamed from: d */
    public TextView f240772d;

    /* renamed from: e */
    StreamingTextView f240773e;

    /* renamed from: f */
    public int f240774f;

    /* renamed from: g */
    public boolean f240775g;

    /* renamed from: h */
    public Animator.AnimatorListener f240776h;

    /* renamed from: i */
    boolean f240777i;

    /* renamed from: j */
    boolean f240778j;

    /* renamed from: k */
    public boolean f240779k = false;

    /* renamed from: l */
    public RelativeLayout.LayoutParams f240780l;

    /* renamed from: m */
    public RelativeLayout.LayoutParams f240781m;

    /* renamed from: n */
    public RelativeLayout.LayoutParams f240782n;

    /* renamed from: o */
    public RelativeLayout.LayoutParams f240783o;

    /* renamed from: p */
    public View.OnKeyListener f240784p;

    /* renamed from: q */
    private RelativeLayout.LayoutParams f240785q;

    /* renamed from: r */
    private RelativeLayout.LayoutParams f240786r;

    /* renamed from: s */
    private RelativeLayout.LayoutParams f240787s;

    /* renamed from: t */
    private C88954q f240788t;

    public TextContainer(Context context) {
        super(context);
    }

    /* renamed from: g */
    public static void m144396g(View view, boolean z) {
        if (view != null) {
            view.animate().cancel();
            if (view.getVisibility() == 0 || view.getAlpha() != 0.0f) {
                view.setAlpha(0.0f);
                view.setVisibility(true != z ? 4 : 8);
            }
        }
    }

    /* renamed from: p */
    public static void m144397p(View view, boolean z, long j) {
        view.animate().cancel();
        if (view.getVisibility() != 0 || view.getAlpha() != 1.0f) {
            if (z) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
                return;
            }
            C88939k.m144547c(view).setDuration(16).setStartDelay(j);
        }
    }

    /* renamed from: u */
    private final boolean m144398u() {
        return getResources().getConfiguration().orientation == 1;
    }

    /* renamed from: a */
    public final int mo82716a(int i) {
        return getContext().getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public final TextView mo82717b() {
        if (this.f240771c == null) {
            this.f240771c = (TextView) ((ViewStub) findViewById(R.id.display_text_stub)).inflate();
        }
        return this.f240771c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final TextView mo82718c() {
        if (this.f240772d == null) {
            this.f240772d = (TextView) ((ViewStub) findViewById(R.id.spoken_text_stub)).inflate();
        }
        return this.f240772d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final StreamingTextView mo82719d() {
        if (this.f240773e == null) {
            StreamingTextView streamingTextView = (StreamingTextView) ((ViewStub) findViewById(R.id.streaming_text_stub)).inflate();
            this.f240773e = streamingTextView;
            if (streamingTextView != null) {
                streamingTextView.f241131a = getResources().getColor(R.color.search_plate_hint_text_color);
            }
        }
        this.f240773e.setMovementMethod(LinkMovementMethod.getInstance());
        return this.f240773e;
    }

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        View.OnKeyListener onKeyListener = this.f240784p;
        return (onKeyListener != null && onKeyListener.onKey(this, keyEvent.getKeyCode(), keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    /* renamed from: e */
    public final void mo82721e() {
        StreamingTextView streamingTextView = this.f240773e;
        if (streamingTextView != null) {
            streamingTextView.mo82922a();
        }
    }

    /* renamed from: f */
    public final void mo82722f() {
        if (this.f240772d != null) {
            mo82718c().setText(BuildConfig.FLAVOR);
            m144396g(this.f240772d, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo82723h() {
        this.f240775g = false;
        this.f240770b.setAlpha(1.0f);
        mo82735t().removeAllViews();
        Animator.AnimatorListener animatorListener = this.f240776h;
        if (animatorListener != null) {
            ((C88901ac) animatorListener).mo82764i();
        }
    }

    /* renamed from: i */
    public final void mo82724i() {
        C88939k.m144552h(this, mo82716a(R.dimen.search_box_margin_left), 0, mo82716a(R.dimen.search_box_margin_right), 0);
    }

    /* renamed from: j */
    public final void mo82725j(CharSequence charSequence) {
        if (charSequence != null && (charSequence.length() > 0 || this.f240771c != null)) {
            mo82717b().setText(charSequence);
        }
        if (charSequence != null && charSequence.length() > 0) {
            mo82722f();
        }
    }

    /* renamed from: k */
    public final void mo82726k(CharSequence charSequence) {
        m144396g(this.f240771c, true);
        m144396g(this.f240772d, true);
        mo82719d().mo82924c(charSequence.toString());
        int i = this.f240774f;
        if (i == 6 || i == 8) {
            mo82719d().mo82922a();
            m144397p(this.f240770b, true, 16);
        }
    }

    /* renamed from: l */
    public final void mo82727l(boolean z) {
        if (z) {
            int a = mo82716a(R.dimen.voice_search_text_margin);
            C88939k.m144551g(this.f240787s, a, mo82716a(R.dimen.voice_search_text_margin_in_full_screen_voice_plate), a, 0);
            C88939k.m144552h(mo82719d(), 0, 40, 0, 0);
        }
        setLayoutParams(this.f240787s);
        mo82717b().setGravity(49);
        mo82717b().setTextAppearance(R.style.main_text_center_googlesans);
        mo82719d().setMaxLines(2);
        mo82719d().setMinLines(2);
        mo82719d().setTextAppearance(R.style.streaming_text_center_googlesans);
        mo82719d().setGravity(49);
    }

    /* renamed from: m */
    public final void mo82728m() {
        if (!m144398u()) {
            mo82717b().setTextAppearance(R.style.main_text_center_googlesans);
            mo82719d().setTextAppearance(R.style.streaming_text_center_googlesans);
        }
        if (mo82734s()) {
            setLayoutParams(this.f240786r);
        } else {
            setLayoutParams(this.f240785q);
        }
    }

    /* renamed from: n */
    public final void mo82729n(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) || this.f240772d != null) {
            mo82721e();
            mo82717b().setText(BuildConfig.FLAVOR);
            m144396g(this.f240770b, false);
            mo82718c().setText(charSequence);
            m144397p(mo82718c(), true, 0);
        }
    }

    /* renamed from: o */
    public final void mo82730o(boolean z) {
        if (z) {
            getLayoutTransition().enableTransitionType(4);
        } else {
            getLayoutTransition().disableTransitionType(4);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        SimpleSearchText simpleSearchText = (SimpleSearchText) findViewById(R.id.search_box);
        simpleSearchText.getClass();
        this.f240770b = simpleSearchText;
        int a = mo82716a(R.dimen.voice_search_text_margin);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.f240780l = layoutParams;
        layoutParams.addRule(20);
        this.f240780l.addRule(10);
        C88939k.m144551g(this.f240780l, a, mo82716a(R.dimen.voice_search_text_margin_top), a, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        this.f240785q = layoutParams2;
        layoutParams2.addRule(12);
        this.f240785q.addRule(14);
        this.f240785q.addRule(17, R.id.logo_view_stub);
        C88939k.m144551g(this.f240785q, a, 0, a, mo82716a(R.dimen.voice_search_text_assistant_style_margin_bottom));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        this.f240786r = layoutParams3;
        layoutParams3.addRule(14);
        this.f240786r.addRule(3, R.id.logo_view_stub);
        C88939k.m144551g(this.f240786r, a, 0, a, mo82716a(R.dimen.voice_search_text_assistant_style_margin_bottom));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        this.f240787s = layoutParams4;
        layoutParams4.addRule(3, R.id.logo_view);
        this.f240787s.addRule(14);
        this.f240787s.addRule(17, R.id.logo_view_stub);
        C88939k.m144551g(this.f240787s, a, mo82716a(R.dimen.voice_search_text_margin_in_assistant_styled_plate), a, 0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        this.f240782n = layoutParams5;
        layoutParams5.addRule(20);
        this.f240782n.addRule(2, R.id.audio_progress_renderer_container);
        C88939k.m144551g(this.f240782n, a, 0, a, mo82716a(R.dimen.sound_search_animation_margin_top));
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        this.f240781m = layoutParams6;
        layoutParams6.addRule(17, R.id.navigation_viewport);
        this.f240781m.addRule(16, R.id.progress_or_clear_or_voice);
        this.f240781m.addRule(15);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, getContext().getResources().getDimensionPixelSize(R.dimen.follow_on_text_container_height));
        this.f240783o = layoutParams7;
        layoutParams7.addRule(15);
        this.f240783o.addRule(16, R.id.progress_or_clear_or_voice);
        this.f240783o.addRule(17, R.id.navigation_viewport);
        C88939k.m144551g(this.f240783o, mo82716a(R.dimen.search_box_margin_left), 0, mo82716a(R.dimen.search_box_margin_right), 0);
        getLayoutTransition().disableTransitionType(4);
        getLayoutTransition().disableTransitionType(3);
        getLayoutTransition().disableTransitionType(2);
        getLayoutTransition().disableTransitionType(0);
        getLayoutTransition().disableTransitionType(1);
        getLayoutTransition().setAnimateParentHierarchy(false);
    }

    /* renamed from: q */
    public final void mo82732q(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            m144396g(this.f240771c, true);
            m144396g(this.f240772d, true);
        }
        int i = this.f240774f;
        if (i == 6 || i == 8) {
            m144396g(this.f240770b, false);
        }
        mo82719d().mo82923b(str, str2);
    }

    /* renamed from: r */
    public final boolean mo82733r(int i) {
        return SearchPlate.m144360v(i) ? m144398u() : SearchPlate.m144362x(i);
    }

    /* renamed from: s */
    public final boolean mo82734s() {
        return this.f240777i && this.f240778j && getResources().getConfiguration().orientation == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C88954q mo82735t() {
        if (this.f240788t == null) {
            C88954q qVar = new C88954q(getContext());
            addView(qVar, new FrameLayout.LayoutParams(-1, -1));
            this.f240788t = qVar;
        }
        return this.f240788t;
    }

    public TextContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
