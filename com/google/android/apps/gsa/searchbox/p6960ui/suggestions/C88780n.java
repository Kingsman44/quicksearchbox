package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88699h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.n */
/* compiled from: PG */
public final class C88780n implements C88788v {

    /* renamed from: a */
    private final C88701b f240254a;

    /* renamed from: b */
    private final Context f240255b;

    /* renamed from: c */
    private final C88699h f240256c;

    /* renamed from: d */
    private final LayoutInflater f240257d;

    /* renamed from: e */
    private boolean f240258e;

    /* renamed from: f */
    private boolean f240259f;

    /* renamed from: g */
    private LinearLayout f240260g;

    public C88780n(Context context, C88701b bVar, C88699h hVar) {
        this.f240255b = context;
        this.f240254a = bVar;
        this.f240256c = hVar;
        this.f240257d = LayoutInflater.from(context);
    }

    /* renamed from: c */
    private static boolean m143998c(Suggestion suggestion) {
        return suggestion.f108910k == 35 || suggestion.f108925z.contains(39);
    }

    /* renamed from: a */
    public final List mo82337a() {
        return this.f240259f ? C58485gu.m89846n(this.f240260g) : C58485gu.m89845m();
    }

    /* renamed from: b */
    public final void mo82338b(List list, Response response, C88709j jVar) {
        if (!list.isEmpty()) {
            boolean z = jVar != null && jVar.f239861R && response.f108861a.isEmpty() && m143998c((Suggestion) list.get(0)) && m143998c((Suggestion) C58557jl.m90131l(list));
            this.f240259f = z;
            if (z && !this.f240258e) {
                this.f240258e = true;
                this.f240260g = (LinearLayout) this.f240257d.inflate(R.layout.manage_activity_suggestion_footer_view, (ViewGroup) null, false);
                C88779m mVar = new C88779m(this.f240255b, jVar, this.f240254a, this.f240256c);
                LinearLayout linearLayout = this.f240260g;
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.manage_activity_button);
                linearLayout2.getClass();
                if (linearLayout != null) {
                    linearLayout2.setClickable(true);
                    linearLayout2.setOnClickListener(new C88778l(mVar));
                    linearLayout2.setForeground((RippleDrawable) mVar.f240250a.getResources().getDrawable(R.drawable.manage_activity_button_foreground));
                    C89205j jVar2 = mVar.f240252c.f239824a;
                    if (jVar2 != null) {
                        jVar2.mo83169i("MANAGE_ACTIVITY_BUTTON_IMPRESSION_COUNT");
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed to find button.");
            }
            return;
        }
        this.f240259f = false;
    }
}
