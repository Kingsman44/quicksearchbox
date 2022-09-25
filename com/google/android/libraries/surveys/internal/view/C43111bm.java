package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43056e;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68400y;

/* renamed from: com.google.android.libraries.surveys.internal.view.bm */
/* compiled from: PG */
public abstract class C43111bm extends C43071a {

    /* renamed from: d */
    private TextView f112750d;

    /* renamed from: e */
    private final C43110bl f112751e = new C43110bl(this);

    /* renamed from: f */
    public View f112752f;

    /* renamed from: g */
    public View f112753g;

    /* renamed from: h */
    public View f112754h;

    /* renamed from: i */
    public ScrollViewWithSizeCallback f112755i;

    /* renamed from: j */
    private boolean f112756j = false;

    /* renamed from: e */
    public void mo46122e() {
        View view;
        if ((!C43054c.m75959b(C68400y.m98798d(C43054c.f112610b)) || mo46174j()) && C43066o.m75994o(getContext()) && (view = this.f112752f) != null) {
            view.requestFocus();
            this.f112752f.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: f */
    public final void mo46123f(String str) {
        if (!C43054c.m75959b(C68400y.m98798d(C43054c.f112610b)) || mo46174j()) {
            Spanned a = C1951d.m5280a(str, 0);
            this.f112750d.setText(a);
            this.f112750d.setContentDescription(a.toString());
        }
    }

    /* renamed from: g */
    public abstract View mo46172g();

    /* renamed from: h */
    public abstract String mo46173h();

    /* renamed from: j */
    public final boolean mo46174j() {
        return (getContext() == null || this.f112750d == null || this.f112752f == null || this.f112753g == null || this.f112754h == null || this.f112755i == null) ? false : true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.survey_question_with_scrollable_content, viewGroup, false);
        this.f112752f = inflate.findViewById(R.id.survey_question_header_logo_text);
        this.f112750d = (TextView) inflate.findViewById(R.id.survey_question_text);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = C1951d.m5280a(mo46173h(), 0);
        }
        this.f112750d.setText(charSequence);
        this.f112750d.setContentDescription(charSequence.toString());
        this.f112754h = mo46172g();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) inflate.findViewById(R.id.survey_question_scroll_view);
        this.f112755i = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.f112754h);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.f112755i;
        scrollViewWithSizeCallback2.f112645a = this.f112751e;
        if (!this.f112756j && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(this.f112751e);
            this.f112756j = true;
        }
        C43056e.m75962b((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), this.f112649c);
        this.f112753g = ((C43130ce) viewGroup.getContext()).mo46109v().findViewById(R.id.survey_controls_container);
        C2043bi.m5528V(inflate, (CharSequence) null);
        return inflate;
    }

    public final void onDestroyView() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.f112756j && (scrollViewWithSizeCallback = this.f112755i) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.f112751e);
            this.f112756j = false;
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        TextView textView = this.f112750d;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }
}
