package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C8068ui;
import com.google.p375ai.p378b.C8069uj;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.d */
/* compiled from: PG */
public final class C91985d {
    /* renamed from: a */
    public static TextView m150954a(View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) view.findViewById(i);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return null;
        }
        textView.setText(Html.fromHtml(charSequence.toString()));
        textView.setVisibility(0);
        return textView;
    }

    /* renamed from: b */
    public static CharSequence m150955b(CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, charSequence.length(), 17);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public static CharSequence m150956c(String str, List list) {
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        CharSequence[] charSequenceArr = null;
        int i = 0;
        while (it.hasNext()) {
            CharSequence charSequence2 = (CharSequence) it.next();
            if (!TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    if (charSequenceArr == null) {
                        int size = list.size();
                        charSequenceArr = new CharSequence[((size + size) - 1)];
                        Arrays.fill(charSequenceArr, str);
                        charSequenceArr[0] = charSequence;
                    }
                    charSequenceArr[i + i] = charSequence2;
                }
                i++;
            }
        }
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        if (i != 1) {
            charSequenceArr.getClass();
            return TextUtils.concat((CharSequence[]) Arrays.copyOf(charSequenceArr, (i + i) - 1));
        }
        charSequence.getClass();
        return charSequence;
    }

    /* renamed from: d */
    public static void m150957d(View view, int i) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            textView.setText(BuildConfig.FLAVOR);
            textView.setVisibility(8);
        }
    }

    /* renamed from: e */
    public static CharSequence m150958e(List list) {
        return m150956c(" · ", Arrays.asList((CharSequence[]) list.toArray(new CharSequence[list.size()])));
    }

    /* renamed from: f */
    public static void m150959f(Context context, View view, int i, C8069uj ujVar) {
        TextView textView = (TextView) view.findViewById(i);
        int i2 = ujVar.f28400a;
        if (i2 > 0) {
            textView.setMaxLines(i2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        int i3 = ujVar.f28401b;
        int a = C8068ui.m22930a(i3);
        if (a != 0 && a == 2) {
            textView.setTextAppearance(context, R.style.qp_h4_dark);
            return;
        }
        int a2 = C8068ui.m22930a(i3);
        if (a2 != 0 && a2 == 3) {
            textView.setTextAppearance(context, R.style.qp_h5);
        }
    }

    /* renamed from: g */
    public static void m150960g(View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) view.findViewById(i);
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    /* renamed from: h */
    public static void m150961h(View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) view.findViewById(i);
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}
