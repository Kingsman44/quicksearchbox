package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;
import com.google.android.libraries.p2203m.p2204a.C28487a;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.as */
/* compiled from: PG */
public final /* synthetic */ class C30670as implements C31032ag {

    /* renamed from: a */
    public static final /* synthetic */ C30670as f82806a = new C30670as();

    private /* synthetic */ C30670as() {
    }

    /* renamed from: a */
    public final View mo36355a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = layoutInflater.getContext();
        TextView textView = new TextView(context);
        textView.setText(R.string.og_choose_an_account_title);
        textView.setTextAppearance(C30899a.m57683b(context, R.attr.ogTextAppearanceSubhead1).resourceId);
        textView.setTextColor(C28487a.m53260a(context, R.attr.colorOnSurface));
        textView.setGravity(1);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }
}
