package com.google.android.apps.gsa.staticplugins.opa.p8188aj;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108436iq;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aj.g */
/* compiled from: PG */
public final class C106186g implements C108436iq {

    /* renamed from: a */
    public final View f296346a;

    /* renamed from: b */
    private final WebImageView f296347b;

    /* renamed from: c */
    private final View f296348c;

    /* renamed from: d */
    private final View f296349d;

    /* renamed from: e */
    private final TextView f296350e;

    public C106186g(LayoutInflater layoutInflater, C108237bh bhVar) {
        View inflate = layoutInflater.inflate(R.layout.opa_mini_plate_third_party_header, (ViewGroup) null);
        this.f296346a = inflate;
        this.f296348c = inflate.findViewById(R.id.third_party_cancel_button);
        this.f296349d = inflate.findViewById(R.id.third_party_menu);
        this.f296347b = (WebImageView) inflate.findViewById(R.id.third_party_logo);
        TextView textView = (TextView) inflate.findViewById(R.id.third_party_text);
        this.f296350e = textView;
        textView.setTextColor(bhVar.mo96631D());
    }

    /* renamed from: a */
    public final int mo95249a() {
        return this.f296346a.getVisibility();
    }

    /* renamed from: b */
    public final AnimatorSet mo95250b(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f296347b, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(250);
        animatorSet.play(ofFloat);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet mo95251c() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f296347b, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(250);
        animatorSet.play(ofFloat);
        return animatorSet;
    }

    /* renamed from: d */
    public final View mo95252d() {
        return this.f296348c;
    }

    /* renamed from: e */
    public final View mo95253e() {
        return this.f296346a;
    }

    /* renamed from: f */
    public final View mo95254f() {
        return this.f296347b;
    }

    /* renamed from: g */
    public final View mo95255g() {
        return this.f296349d;
    }

    /* renamed from: h */
    public final void mo95256h(String str, C91189au auVar) {
        this.f296347b.mo76738i(str, auVar);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo95257i(View.OnClickListener onClickListener) {
    }

    /* renamed from: j */
    public final void mo95258j(String str) {
        this.f296350e.setText(str);
    }

    /* renamed from: k */
    public final void mo95259k(int i) {
        this.f296346a.setVisibility(i);
    }

    /* renamed from: l */
    public final int mo95260l() {
        return 2;
    }
}
