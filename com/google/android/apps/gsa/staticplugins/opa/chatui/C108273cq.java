package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cq */
/* compiled from: PG */
public final class C108273cq extends C108232bc {

    /* renamed from: b */
    private static final TypefaceSpan f301222b = new TypefaceSpan("google-sans-medium");

    /* renamed from: a */
    public final C91097g f301223a;

    public C108273cq(C91097g gVar) {
        super((byte[]) null);
        this.f301223a = gVar;
    }

    /* renamed from: b */
    public static void m179977b(C108241bl blVar) {
        Context context = blVar.f301089p.getContext();
        TextView textView = blVar.f301089p;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(context.getResources().getString(R.string.opa_drl_view_my_activity));
        spannableStringBuilder.setSpan(f301222b, 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: c */
    public final boolean mo96725c() {
        return this.f301223a == null;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 33260;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 8;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar == null || mo96725c()) {
            return null;
        }
        return C28293k.m52908e(jVar, new C28293k[0]);
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (mo96725c()) {
            blVar.f301074a.setVisibility(8);
            return;
        }
        blVar.f301074a.setVisibility(0);
        if (TextUtils.isEmpty(blVar.f301089p.getText())) {
            Context context = blVar.f301089p.getContext();
            TextView textView = blVar.f301089p;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(context.getResources().getString(R.string.opa_history_my_activity_notice_prefix));
            spannableStringBuilder.append(" ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(context.getResources().getString(R.string.opa_history_my_activity_title));
            spannableStringBuilder.setSpan(new UnderlineSpan(), length, spannableStringBuilder.length(), 33);
            textView.setText(spannableStringBuilder);
            blVar.f301089p.setOnClickListener(new C108272cp(this));
            blVar.f301089p.setClickable(true);
        }
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301089p.setText((CharSequence) null);
        blVar.f301089p.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: l */
    public final int mo96602l() {
        return 2;
    }
}
