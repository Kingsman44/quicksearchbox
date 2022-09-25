package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108436iq;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.googlequicksearchbox.R;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.el */
/* compiled from: PG */
public final class C114076el implements C108436iq {

    /* renamed from: a */
    public final View f316068a;

    /* renamed from: b */
    public final View f316069b;

    /* renamed from: c */
    public final WebImageView f316070c;

    /* renamed from: d */
    public final TextView f316071d;

    /* renamed from: e */
    public final RelativeLayout f316072e;

    /* renamed from: f */
    public final C104149a f316073f;

    /* renamed from: g */
    private final WebImageView f316074g;

    /* renamed from: h */
    private final View f316075h;

    /* renamed from: i */
    private final Context f316076i;

    /* renamed from: j */
    private final Interpolator f316077j = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: k */
    private final Interpolator f316078k = C91107f.m148859b(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: l */
    private final Interpolator f316079l = C91107f.m148859b(0.65f, 0.0f, 1.0f, 1.0f);

    /* renamed from: m */
    private final C113970bp f316080m;

    public C114076el(LayoutInflater layoutInflater, Context context, C113970bp bpVar, C108237bh bhVar, C104149a aVar) {
        this.f316076i = context;
        this.f316080m = bpVar;
        View inflate = layoutInflater.inflate(R.layout.opa_chat_header_v2, (ViewGroup) null);
        this.f316068a = inflate;
        this.f316073f = aVar;
        if (m189143o(aVar)) {
            inflate.setBackgroundColor(bhVar.mo96643P());
        }
        this.f316069b = inflate.findViewById(R.id.opa_chat_header_cancel_button);
        this.f316075h = inflate.findViewById(R.id.opa_chat_header_menu);
        this.f316074g = (WebImageView) inflate.findViewById(R.id.chatui_third_party_logo);
        this.f316070c = (WebImageView) inflate.findViewById(R.id.opa_chat_header_custom_icon_button);
        this.f316071d = (TextView) inflate.findViewById(R.id.opa_chat_header_title);
        this.f316072e = (RelativeLayout) inflate.findViewById(R.id.opa_chat_header);
    }

    /* renamed from: o */
    public static boolean m189143o(C104149a aVar) {
        return !aVar.mo93971b();
    }

    /* renamed from: p */
    private static ObjectAnimator m189144p(View view, int i, Interpolator interpolator, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f, f2});
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(interpolator);
        return ofFloat;
    }

    /* renamed from: q */
    private static ObjectAnimator m189145q(View view, int i, Interpolator interpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(160);
        ofFloat.setStartDelay((long) i);
        ofFloat.setInterpolator(interpolator);
        return ofFloat;
    }

    /* renamed from: r */
    private static ObjectAnimator m189146r(View view, Interpolator interpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(130);
        ofFloat.setStartDelay(30);
        ofFloat.setInterpolator(interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public final int mo95249a() {
        return this.f316068a.getVisibility();
    }

    /* renamed from: b */
    public final AnimatorSet mo95250b(boolean z) {
        HashSet hashSet = new HashSet();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet m = mo101044m(this.f316074g);
        AnimatorSet m2 = mo101044m(this.f316071d);
        ObjectAnimator q = m189145q(this.f316069b, 30, this.f316077j);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f316069b, View.ROTATION, new float[]{-90.0f, 0.0f});
        ofFloat.setDuration(280);
        ofFloat.setStartDelay(30);
        ofFloat.setInterpolator(this.f316078k);
        hashSet.add(m);
        hashSet.add(m2);
        hashSet.add(q);
        hashSet.add(ofFloat);
        if (this.f316070c.getVisibility() == 0) {
            hashSet.add(m189145q(this.f316070c, 30, this.f316077j));
        } else if (z) {
            this.f316075h.setVisibility(0);
            hashSet.add(m189145q(this.f316075h, 30, this.f316077j));
        }
        animatorSet.playTogether(hashSet);
        return animatorSet;
    }

    /* renamed from: c */
    public final AnimatorSet mo95251c() {
        HashSet hashSet = new HashSet();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet n = mo101045n(this.f316074g);
        AnimatorSet n2 = mo101045n(this.f316071d);
        ObjectAnimator r = m189146r(this.f316069b, this.f316077j);
        hashSet.add(n);
        hashSet.add(n2);
        hashSet.add(r);
        if (this.f316075h.getAlpha() == 1.0f) {
            hashSet.add(m189146r(this.f316075h, this.f316077j));
            this.f316075h.setVisibility(8);
        }
        animatorSet.playTogether(hashSet);
        return animatorSet;
    }

    /* renamed from: d */
    public final View mo95252d() {
        return this.f316069b;
    }

    /* renamed from: e */
    public final View mo95253e() {
        return this.f316068a;
    }

    /* renamed from: f */
    public final View mo95254f() {
        return this.f316074g;
    }

    /* renamed from: g */
    public final View mo95255g() {
        return this.f316075h;
    }

    /* renamed from: h */
    public final void mo95256h(String str, C91189au auVar) {
        this.f316074g.mo76738i(str, auVar);
    }

    /* renamed from: i */
    public final void mo95257i(View.OnClickListener onClickListener) {
        this.f316074g.setOnClickListener(onClickListener);
        this.f316071d.setOnClickListener(onClickListener);
    }

    /* renamed from: j */
    public final void mo95258j(String str) {
        this.f316071d.setText(str);
    }

    /* renamed from: k */
    public final void mo95259k(int i) {
        this.f316068a.setVisibility(i);
        C113970bp bpVar = this.f316080m;
        C114071eg egVar = bpVar.f315603a;
        if (C113987f.m188690a(bpVar.f315604b)) {
            egVar.mo101001bM();
        }
    }

    /* renamed from: l */
    public final int mo95260l() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final AnimatorSet mo101044m(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{m189144p(view, 280, this.f316078k, this.f316076i.getResources().getDimension(R.dimen.third_party_header_transition_in_offset), 0.0f), m189145q(view, 0, this.f316077j)});
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final AnimatorSet mo101045n(View view) {
        float dimension = this.f316076i.getResources().getDimension(R.dimen.third_party_header_transition_out_offset);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{m189144p(view, 160, this.f316079l, 0.0f, -dimension), m189146r(view, this.f316077j)});
        return animatorSet;
    }
}
