package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p035b.p036a.C0407b;
import android.support.p033v7.widget.ActionMenuView;
import android.support.p033v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.graphics.drawable.C1931d;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import com.google.android.material.internal.C44718aq;
import com.google.android.material.internal.C44719ar;
import com.google.android.material.internal.C44735bg;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.internal.C44751k;
import com.google.android.material.internal.C44752l;
import com.google.android.material.internal.C44759s;
import com.google.android.material.internal.C44763w;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.p3504a.C44497b;

/* renamed from: com.google.android.libraries.material.opensearchbar.z */
/* compiled from: PG */
final class C28571z {

    /* renamed from: a */
    public final OpenSearchView f77653a;

    /* renamed from: b */
    public final ClippableRoundedCornerLayout f77654b;

    /* renamed from: c */
    public final Toolbar f77655c;

    /* renamed from: d */
    public final EditText f77656d;

    /* renamed from: e */
    public OpenSearchBar f77657e;

    /* renamed from: f */
    private final View f77658f;

    /* renamed from: g */
    private final FrameLayout f77659g;

    /* renamed from: h */
    private final FrameLayout f77660h;

    /* renamed from: i */
    private final Toolbar f77661i;

    /* renamed from: j */
    private final TextView f77662j;

    /* renamed from: k */
    private final ImageButton f77663k;

    /* renamed from: l */
    private final View f77664l;

    /* renamed from: m */
    private final TouchObserverFrameLayout f77665m;

    public C28571z(OpenSearchView openSearchView) {
        this.f77653a = openSearchView;
        this.f77658f = openSearchView.f77599a;
        this.f77654b = openSearchView.f77600b;
        this.f77659g = openSearchView.f77603e;
        this.f77660h = openSearchView.f77604f;
        this.f77661i = openSearchView.f77605g;
        this.f77655c = openSearchView.f77606h;
        this.f77662j = openSearchView.f77607i;
        this.f77656d = openSearchView.f77608j;
        this.f77663k = openSearchView.f77609k;
        this.f77664l = openSearchView.f77610l;
        this.f77665m = openSearchView.f77611m;
    }

    /* renamed from: d */
    private final int m53432d(View view) {
        int b = C2104s.m5789b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (C44741bm.m79317j(this.f77657e)) {
            return this.f77657e.getLeft() - b;
        }
        return (this.f77657e.getRight() - this.f77653a.getWidth()) + b;
    }

    /* renamed from: e */
    private final int m53433e(View view) {
        int c = C2104s.m5790c((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int l = C2043bi.m5583l(this.f77657e);
        if (C44741bm.m79317j(this.f77657e)) {
            return ((this.f77657e.getWidth() - this.f77657e.getRight()) + c) - l;
        }
        return (this.f77657e.getLeft() - c) + l;
    }

    /* renamed from: f */
    private final int m53434f() {
        return ((this.f77657e.getTop() + this.f77657e.getBottom()) / 2) - ((this.f77660h.getTop() + this.f77660h.getBottom()) / 2);
    }

    /* renamed from: g */
    private final Animator m53435g(boolean z, boolean z2, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) (z2 ? m53433e(view) : m53432d(view)), 0.0f});
        ofFloat.addUpdateListener(C44763w.m79369b(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) m53434f(), 0.0f});
        ofFloat2.addUpdateListener(C44763w.m79370c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setDuration(true != z ? 250 : 300);
        animatorSet.setInterpolator(C44719ar.m79277a(z, C44497b.f115651b));
        return animatorSet;
    }

    /* renamed from: h */
    private final void m53436h(AnimatorSet animatorSet) {
        ImageButton b = C44735bg.m79303b(this.f77661i);
        if (b != null) {
            Drawable a = C1931d.m5231a(b.getDrawable());
            if (this.f77653a.f77614p) {
                if (a instanceof C0407b) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new C28562q((C0407b) a));
                    animatorSet.playTogether(new Animator[]{ofFloat});
                }
                if (a instanceof C44751k) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat2.addUpdateListener(new C28563r((C44751k) a));
                    animatorSet.playTogether(new Animator[]{ofFloat2});
                    return;
                }
                return;
            }
            if (a instanceof C0407b) {
                ((C0407b) a).mo1371b(1.0f);
            }
            if (a instanceof C44751k) {
                ((C44751k) a).mo48077a(1.0f);
            }
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo34148a(boolean z) {
        boolean z2 = z;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[10];
        TimeInterpolator timeInterpolator = z2 ? C44497b.f115650a : C44497b.f115651b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(true != z2 ? 250 : 300);
        ofFloat.setInterpolator(C44719ar.m79277a(z2, timeInterpolator));
        ofFloat.addUpdateListener(C44763w.m79368a(this.f77658f));
        animatorArr[0] = ofFloat;
        OpenSearchView openSearchView = this.f77653a;
        Rect rect = new Rect(openSearchView.getLeft(), openSearchView.getTop(), openSearchView.getRight(), openSearchView.getBottom());
        int[] iArr = new int[2];
        this.f77657e.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f77654b.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        Rect rect2 = new Rect(i3, i4, this.f77657e.getWidth() + i3, this.f77657e.getHeight() + i4);
        Rect rect3 = new Rect(rect2);
        float L = this.f77657e.f77588F.mo48115L();
        ValueAnimator ofObject = ValueAnimator.ofObject(new C44718aq(rect3), new Object[]{rect2, rect});
        ofObject.addUpdateListener(new C28561p(this, L, rect3));
        ofObject.setDuration(true != z2 ? 250 : 300);
        ofObject.setInterpolator(C44719ar.m79277a(z2, C44497b.f115651b));
        animatorArr[1] = ofObject;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(true != z2 ? 42 : 50);
        ofFloat2.setStartDelay(true != z2 ? 0 : 250);
        ofFloat2.setInterpolator(C44719ar.m79277a(z2, C44497b.f115650a));
        ofFloat2.addUpdateListener(C44763w.m79368a(this.f77663k));
        animatorArr[2] = ofFloat2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat3.setDuration(true != z2 ? 83 : 150);
        ofFloat3.setStartDelay(true != z2 ? 0 : 75);
        ofFloat3.setInterpolator(C44719ar.m79277a(z2, C44497b.f115650a));
        ofFloat3.addUpdateListener(C44763w.m79368a(this.f77664l, this.f77665m));
        animatorArr2[0] = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{(((float) this.f77665m.getHeight()) * 0.050000012f) / 2.0f, 0.0f});
        ofFloat4.setDuration(true != z2 ? 250 : 300);
        ofFloat4.setInterpolator(C44719ar.m79277a(z2, C44497b.f115651b));
        ofFloat4.addUpdateListener(C44763w.m79370c(this.f77664l));
        animatorArr2[1] = ofFloat4;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.95f, 1.0f});
        ofFloat5.setDuration(true != z2 ? 250 : 300);
        ofFloat5.setInterpolator(C44719ar.m79277a(z2, C44497b.f115651b));
        ofFloat5.addUpdateListener(new C44763w(C44759s.f116696a, this.f77665m));
        animatorArr2[2] = ofFloat5;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        ImageButton b = C44735bg.m79303b(this.f77661i);
        if (b != null) {
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(new float[]{(float) m53433e(b), 0.0f});
            ofFloat6.addUpdateListener(C44763w.m79369b(b));
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(new float[]{(float) m53434f(), 0.0f});
            ofFloat7.addUpdateListener(C44763w.m79370c(b));
            animatorSet3.playTogether(new Animator[]{ofFloat6, ofFloat7});
        }
        m53436h(animatorSet3);
        ActionMenuView a = C44735bg.m79302a(this.f77661i);
        if (a != null) {
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(new float[]{(float) m53432d(a), 0.0f});
            ofFloat8.addUpdateListener(C44763w.m79369b(a));
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(new float[]{(float) m53434f(), 0.0f});
            ofFloat9.addUpdateListener(C44763w.m79370c(a));
            animatorSet3.playTogether(new Animator[]{ofFloat8, ofFloat9});
        }
        animatorSet3.setDuration(true != z2 ? 250 : 300);
        animatorSet3.setInterpolator(C44719ar.m79277a(z2, C44497b.f115651b));
        animatorArr[4] = animatorSet3;
        animatorArr[5] = m53435g(z2, false, this.f77659g);
        animatorArr[6] = m53435g(z2, false, this.f77655c);
        ValueAnimator ofFloat10 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat10.setDuration(true != z2 ? 250 : 300);
        ofFloat10.setInterpolator(C44719ar.m79277a(z2, C44497b.f115651b));
        if (this.f77653a.f77615q) {
            ofFloat10.addUpdateListener(new C44752l(C44735bg.m79302a(this.f77655c), C44735bg.m79302a(this.f77661i)));
        }
        animatorArr[7] = ofFloat10;
        animatorArr[8] = m53435g(z2, true, this.f77656d);
        animatorArr[9] = m53435g(z2, true, this.f77662j);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new C28570y(this, z2));
        return animatorSet;
    }

    /* renamed from: b */
    public final AnimatorSet mo34149b(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.f77654b.getHeight(), 0.0f});
        ofFloat.addUpdateListener(C44763w.m79370c(this.f77654b));
        animatorSet.playTogether(new Animator[]{ofFloat});
        m53436h(animatorSet);
        animatorSet.setInterpolator(C44719ar.m79277a(z, C44497b.f115651b));
        animatorSet.setDuration(true != z ? 300 : 350);
        return animatorSet;
    }

    /* renamed from: c */
    public final void mo34150c(float f) {
        ActionMenuView a;
        this.f77663k.setAlpha(f);
        this.f77664l.setAlpha(f);
        this.f77665m.setAlpha(f);
        if (this.f77653a.f77615q && (a = C44735bg.m79302a(this.f77661i)) != null) {
            a.setAlpha(f);
        }
    }
}
