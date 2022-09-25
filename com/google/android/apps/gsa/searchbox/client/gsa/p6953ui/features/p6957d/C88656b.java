package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.p6957d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88759ad;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88788v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.d.b */
/* compiled from: PG */
public final class C88656b implements C88788v {

    /* renamed from: a */
    private final Context f239711a;

    /* renamed from: b */
    private final C88760ae f239712b;

    /* renamed from: c */
    private FrameLayout f239713c;

    /* renamed from: d */
    private boolean f239714d;

    public C88656b(Context context, C88760ae aeVar) {
        this.f239711a = context;
        this.f239712b = aeVar;
    }

    /* renamed from: a */
    public final List mo82337a() {
        if (this.f239714d) {
            return C58485gu.m89846n(this.f239713c);
        }
        return C58485gu.m89845m();
    }

    /* renamed from: b */
    public final void mo82338b(List list, Response response, C88709j jVar) {
        this.f239714d = false;
        if (!list.isEmpty() && ((Suggestion) list.get(list.size() - 1)).f108914o == 3) {
            this.f239714d = true;
            if (this.f239713c == null) {
                this.f239713c = (FrameLayout) LayoutInflater.from(this.f239711a).inflate(R.layout.view_all_footer_view, (ViewGroup) null);
            }
            this.f239713c.setOnClickListener(new C88759ad(this.f239712b, ((Suggestion) list.get(0)).f108915p.intValue()));
        }
    }
}
