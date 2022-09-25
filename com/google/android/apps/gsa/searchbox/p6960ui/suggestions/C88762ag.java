package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.ag */
/* compiled from: PG */
public final class C88762ag implements C88788v {

    /* renamed from: a */
    private final Context f240153a;

    /* renamed from: b */
    private boolean f240154b;

    /* renamed from: c */
    private boolean f240155c;

    /* renamed from: d */
    private int f240156d;

    /* renamed from: e */
    private LinearLayout f240157e;

    /* renamed from: f */
    private TextView f240158f;

    public C88762ag(Context context) {
        this.f240153a = context;
    }

    /* renamed from: a */
    public final List mo82337a() {
        return this.f240155c ? C58485gu.m89846n(this.f240157e) : C58485gu.m89845m();
    }

    /* renamed from: b */
    public final void mo82338b(List list, Response response, C88709j jVar) {
        if (list.isEmpty() || (jVar != null && jVar.f239856M)) {
            this.f240155c = false;
            return;
        }
        int intValue = ((Suggestion) list.get(0)).f108915p.intValue();
        this.f240156d = intValue;
        String a = C88844x.m144242a(intValue, response, this.f240153a, jVar);
        boolean z = !a.isEmpty();
        this.f240155c = z;
        if (z) {
            if (!this.f240154b) {
                this.f240154b = true;
                this.f240157e = (LinearLayout) LayoutInflater.from(this.f240153a).inflate(R.layout.suggestion_header_view, (ViewGroup) null, false);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, this.f240153a.getResources().getDimensionPixelSize(R.dimen.suggestions_header_top_margin), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f240157e.setLayoutParams(marginLayoutParams);
                this.f240157e.setId(R.id.suggestion_header);
                int dimensionPixelSize = this.f240153a.getResources().getDimensionPixelSize(R.dimen.suggestions_header_padding);
                if (C41669ai.f108971t.mo44240a(this.f240156d)) {
                    dimensionPixelSize -= this.f240153a.getResources().getDimensionPixelSize(R.dimen.suggestions_header_padding) - this.f240153a.getResources().getDimensionPixelSize(R.dimen.image_suggestion_container_padding);
                }
                TextView textView = (TextView) this.f240157e.findViewById(R.id.header_title);
                this.f240158f = textView;
                textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
            if (jVar != null && jVar.f239871aa) {
                this.f240158f.setAllCaps(false);
            }
            this.f240158f.setText(a);
        }
    }
}
