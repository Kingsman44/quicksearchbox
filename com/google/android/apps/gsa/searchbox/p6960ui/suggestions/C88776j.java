package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54224am;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.j */
/* compiled from: PG */
public final class C88776j implements C88788v {

    /* renamed from: a */
    public final C88701b f240243a;

    /* renamed from: b */
    public LinearLayout f240244b;

    /* renamed from: c */
    private final LayoutInflater f240245c;

    /* renamed from: d */
    private boolean f240246d;

    /* renamed from: e */
    private boolean f240247e;

    public C88776j(Context context, C88701b bVar) {
        this.f240245c = LayoutInflater.from(context);
        this.f240243a = bVar;
    }

    /* renamed from: a */
    public final List mo82337a() {
        if (!this.f240247e) {
            return C58485gu.m89845m();
        }
        LinearLayout linearLayout = this.f240244b;
        linearLayout.getClass();
        return C58485gu.m89846n(linearLayout);
    }

    /* renamed from: b */
    public final void mo82338b(List list, Response response, C88709j jVar) {
        if (list.isEmpty()) {
            this.f240247e = false;
            return;
        }
        this.f240247e = true;
        if (!this.f240246d) {
            this.f240244b = (LinearLayout) this.f240245c.inflate(R.layout.icc_header_view, (ViewGroup) null, false);
            this.f240244b.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            this.f240246d = true;
            View findViewById = this.f240244b.findViewById(R.id.in_context_control_overflow_button);
            findViewById.setOnClickListener(new C88775i(this, findViewById, list));
        }
        LinearLayout linearLayout = this.f240244b;
        linearLayout.getClass();
        TextView textView = (TextView) linearLayout.findViewById(R.id.header_title);
        C54224am amVar = response.f108868h.f142371k;
        if (amVar == null) {
            amVar = C54224am.f142322b;
        }
        String str = (String) Collections.unmodifiableMap(amVar.f142324a).get(C41669ai.f108970s);
        if (str != null && !str.isEmpty()) {
            if (jVar != null && jVar.f239871aa) {
                textView.setAllCaps(false);
            }
            textView.setText(str);
        }
    }
}
