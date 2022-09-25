package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.C41691q;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.r */
/* compiled from: PG */
public final class C88784r implements C88788v {

    /* renamed from: a */
    private final Context f240269a;

    /* renamed from: b */
    private final View f240270b;

    /* renamed from: c */
    private final RelativeLayout f240271c;

    /* renamed from: d */
    private final TextView f240272d;

    /* renamed from: e */
    private final TextView f240273e;

    public C88784r(Context context) {
        this.f240269a = context;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f240271c = relativeLayout;
        TextView textView = new TextView(context);
        this.f240272d = textView;
        TextView textView2 = new TextView(context);
        this.f240273e = textView2;
        View view = new View(context);
        this.f240270b = view;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.suggestion_divider_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.search_phone_header_height);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.search_phone_header_padding);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.search_phone_header_text_size);
        textView2.setId(View.generateViewId());
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        relativeLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, dimensionPixelSize2));
        relativeLayout.setFocusable(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(16, textView2.getId());
        layoutParams.addRule(10);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        textView.setGravity(16);
        float f = (float) dimensionPixelSize4;
        textView.setTextSize(0, f);
        textView.setTypeface(Typeface.create("sans-serif-light", 0));
        textView.setTextColor(context.getResources().getColor(R.color.suggestion_container_header_text));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(12);
        layoutParams2.addRule(21);
        textView2.setLayoutParams(layoutParams2);
        textView2.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        textView2.setGravity(16);
        textView2.setTextSize(0, f);
        textView2.setTypeface(Typeface.create("sans-serif-light", 0));
        textView2.setTextColor(context.getResources().getColor(R.color.suggestion_container_header_text));
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, dimensionPixelSize));
        view.setBackgroundColor(context.getResources().getColor(R.color.searchbox_suggestion_divider_background));
    }

    /* renamed from: c */
    private final String m144009c(String str, int i, ApplicationInfo applicationInfo) {
        if (i == 0) {
            return null;
        }
        return this.f240269a.getPackageManager().getText(str, i, applicationInfo).toString();
    }

    /* renamed from: a */
    public final List mo82337a() {
        return C58485gu.m89847o(this.f240271c, this.f240270b);
    }

    /* renamed from: b */
    public final void mo82338b(List list, Response response, C88709j jVar) {
        ApplicationInfo applicationInfo;
        int i = 0;
        if (!list.isEmpty()) {
            Suggestion suggestion = (Suggestion) list.get(0);
            TextView textView = this.f240272d;
            String i2 = C41670aj.m73076i(suggestion);
            C41691q qVar = suggestion.f108907B.f109012f;
            if (qVar == null) {
                qVar = C41691q.f109047e;
            }
            int i3 = qVar.f109052d;
            try {
                applicationInfo = this.f240269a.getPackageManager().getApplicationInfo(i2, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                C58976aa aaVar = C58975e.f156826a;
                applicationInfo = null;
            }
            String c = m144009c(i2, i3, applicationInfo);
            if (!(c != null || applicationInfo == null || applicationInfo.labelRes == 0)) {
                c = m144009c(i2, applicationInfo.labelRes, applicationInfo);
            }
            if (c != null) {
                i2 = c;
            }
            textView.setText(i2);
            i = list.size();
        }
        this.f240273e.setText(Integer.toString(i));
    }
}
