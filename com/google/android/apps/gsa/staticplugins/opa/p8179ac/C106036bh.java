package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108436iq;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bh */
/* compiled from: PG */
public final class C106036bh implements C108436iq {

    /* renamed from: a */
    public final WebImageView f296051a;

    /* renamed from: b */
    public final TextView f296052b;

    /* renamed from: c */
    private final View f296053c;

    /* renamed from: d */
    private final View f296054d;

    /* renamed from: e */
    private final View f296055e;

    public C106036bh(View view) {
        this.f296053c = view;
        View findViewById = view.findViewById(R.id.close_button);
        this.f296054d = findViewById;
        this.f296055e = view.findViewById(R.id.menu_button);
        this.f296051a = (WebImageView) view.findViewById(R.id.agent_icon);
        this.f296052b = (TextView) view.findViewById(R.id.agent_name);
        findViewById.getClass();
        C28292j jVar = new C28292j(59333);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
    }

    /* renamed from: a */
    public final int mo95249a() {
        return this.f296053c.getVisibility();
    }

    /* renamed from: b */
    public final AnimatorSet mo95250b(boolean z) {
        return new AnimatorSet();
    }

    /* renamed from: c */
    public final AnimatorSet mo95251c() {
        return new AnimatorSet();
    }

    /* renamed from: d */
    public final View mo95252d() {
        return this.f296054d;
    }

    /* renamed from: e */
    public final View mo95253e() {
        return this.f296053c;
    }

    /* renamed from: f */
    public final View mo95254f() {
        return this.f296051a;
    }

    /* renamed from: g */
    public final View mo95255g() {
        return this.f296055e;
    }

    /* renamed from: h */
    public final void mo95256h(String str, C91189au auVar) {
        this.f296051a.mo76738i(str, auVar);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo95257i(View.OnClickListener onClickListener) {
    }

    /* renamed from: j */
    public final void mo95258j(String str) {
        this.f296052b.setText(str);
    }

    /* renamed from: k */
    public final void mo95259k(int i) {
        this.f296053c.setVisibility(i);
    }

    /* renamed from: l */
    public final int mo95260l() {
        return 2;
    }
}
