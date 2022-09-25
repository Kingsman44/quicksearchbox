package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bh */
/* compiled from: PG */
final class C93557bh extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TextView f261225a;

    /* renamed from: b */
    final /* synthetic */ int f261226b;

    /* renamed from: c */
    final /* synthetic */ CharSequence f261227c;

    /* renamed from: d */
    final /* synthetic */ int f261228d;

    /* renamed from: e */
    final /* synthetic */ int[] f261229e;

    /* renamed from: f */
    final /* synthetic */ int f261230f;

    /* renamed from: g */
    final /* synthetic */ int f261231g;

    /* renamed from: h */
    final /* synthetic */ CharSequence f261232h;

    public C93557bh(TextView textView, int i, CharSequence charSequence, int i2, int[] iArr, int i3, int i4, CharSequence charSequence2) {
        this.f261225a = textView;
        this.f261226b = i;
        this.f261227c = charSequence;
        this.f261228d = i2;
        this.f261229e = iArr;
        this.f261230f = i3;
        this.f261231g = i4;
        this.f261232h = charSequence2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261225a.setTextColor(this.f261230f);
        this.f261225a.setGravity(this.f261231g);
        this.f261225a.setAlpha(1.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f261232h);
        spannableStringBuilder.setSpan(C93560bk.f261237a, 0, spannableStringBuilder.length(), 33);
        this.f261225a.setText(spannableStringBuilder);
        TextView textView = this.f261225a;
        if (textView instanceof ItalicWhenPromptedTextView) {
            ((ItalicWhenPromptedTextView) textView).mo87883a();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f261225a.setTextColor(this.f261226b);
        this.f261225a.setText(this.f261227c);
        this.f261225a.setGravity(this.f261228d);
        int[] iArr = this.f261229e;
        if (iArr != null) {
            TextView textView = this.f261225a;
            if (textView instanceof ItalicWhenPromptedTextView) {
                ((ItalicWhenPromptedTextView) textView).mo87884b(iArr);
            }
        }
    }
}
