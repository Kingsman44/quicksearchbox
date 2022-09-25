package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.du */
/* compiled from: PG */
final class C93624du extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TextView f261359a;

    /* renamed from: b */
    final /* synthetic */ CharSequence f261360b;

    /* renamed from: c */
    final /* synthetic */ int f261361c;

    /* renamed from: d */
    final /* synthetic */ int[] f261362d;

    /* renamed from: e */
    final /* synthetic */ CharSequence f261363e;

    /* renamed from: f */
    final /* synthetic */ int f261364f;

    /* renamed from: g */
    final /* synthetic */ C93625dv f261365g;

    public C93624du(C93625dv dvVar, TextView textView, CharSequence charSequence, int i, int[] iArr, CharSequence charSequence2, int i2) {
        this.f261365g = dvVar;
        this.f261359a = textView;
        this.f261360b = charSequence;
        this.f261361c = i;
        this.f261362d = iArr;
        this.f261363e = charSequence2;
        this.f261364f = i2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261359a.setText(this.f261363e);
        this.f261359a.setGravity(this.f261364f);
        TextView textView = this.f261359a;
        if (textView instanceof ItalicWhenPromptedTextView) {
            ((ItalicWhenPromptedTextView) textView).mo87883a();
        }
        int i = this.f261365g.f261366a;
        if (i != -1) {
            this.f261359a.setTextColor(i);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f261359a.setText(this.f261360b);
        this.f261359a.setGravity(this.f261361c);
        int[] iArr = this.f261362d;
        if (iArr != null) {
            TextView textView = this.f261359a;
            if (textView instanceof ItalicWhenPromptedTextView) {
                ((ItalicWhenPromptedTextView) textView).mo87884b(iArr);
            }
        }
    }
}
