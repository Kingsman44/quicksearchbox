package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.p */
/* compiled from: PG */
public final class C88782p implements C88788v {

    /* renamed from: a */
    private final Context f240263a;

    /* renamed from: b */
    private final C88760ae f240264b;

    /* renamed from: c */
    private final View f240265c;

    /* renamed from: d */
    private final LinearLayout f240266d;

    /* renamed from: e */
    private final TextView f240267e;

    public C88782p(Context context, C88760ae aeVar) {
        this.f240263a = context;
        this.f240264b = aeVar;
        View view = new View(context);
        this.f240265c = view;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f240266d = linearLayout;
        TextView textView = new TextView(context);
        this.f240267e = textView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.suggestion_divider_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.search_phone_footer_text_min_height);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.search_phone_footer_padding);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setLayoutParams(marginLayoutParams);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        textView.setGravity(16);
        textView.setTextSize(0, (float) context.getResources().getDimensionPixelSize(R.dimen.search_phone_footer_text_size));
        textView.setTextColor(context.getResources().getColor(R.color.suggestion_container_footer_text));
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMinHeight(dimensionPixelSize2);
        textView.setText(R.string.show_more_suggestions_footer);
        linearLayout.addView(textView);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, dimensionPixelSize));
        view.setBackgroundColor(context.getResources().getColor(R.color.searchbox_suggestion_divider_background));
        linearLayout.setFocusable(true);
        linearLayout.setId(View.generateViewId());
        linearLayout.setBackgroundResource(R.drawable.bg_suggestion);
    }

    /* renamed from: a */
    public final List mo82337a() {
        return C58485gu.m89847o(this.f240265c, this.f240266d);
    }

    /* renamed from: b */
    public final void mo82338b(List list, Response response, C88709j jVar) {
        int i;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
                if (((Suggestion) it.next()).f108914o == 3) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            this.f240266d.setOnClickListener(new C88759ad(this.f240264b, ((Suggestion) list.get(0)).f108915p.intValue()));
        }
        LinearLayout linearLayout = this.f240266d;
        if (true != z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.f240265c.setVisibility(i);
    }
}
