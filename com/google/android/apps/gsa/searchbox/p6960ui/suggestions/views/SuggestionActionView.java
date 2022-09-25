package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionActionView */
/* compiled from: PG */
public class SuggestionActionView extends RelativeLayout {

    /* renamed from: a */
    public TextView f240371a;

    /* renamed from: b */
    public TextView f240372b;

    /* renamed from: c */
    public SuggestionIconView f240373c;

    public SuggestionActionView(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo82555a(int i, String str) {
        String string = getContext().getResources().getString(i);
        if (!TextUtils.isEmpty(str)) {
            string = string + " " + str;
        }
        this.f240371a.setText(string);
    }

    /* renamed from: b */
    public final void mo82556b(String str) {
        if (str == null) {
            this.f240372b.setVisibility(8);
            return;
        }
        this.f240372b.setText(str);
        this.f240372b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240371a = textView;
        TextView textView2 = (TextView) findViewById(R.id.text_2);
        textView2.getClass();
        this.f240372b = textView2;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.action_icon);
        suggestionIconView.getClass();
        this.f240373c = suggestionIconView;
    }

    public SuggestionActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
