package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.p6957d;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88788v;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88843w;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.d.c */
/* compiled from: PG */
public final class C88657c extends C88843w implements C89200e {

    /* renamed from: c */
    private C88760ae f239715c;

    public C88657c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88788v mo82339a() {
        return new C88656b(this.f240540b, this.f239715c);
    }

    /* renamed from: b */
    public final boolean mo82340b(int i) {
        if (i == C41669ai.f108954c.intValue()) {
            return true;
        }
        if (!C41669ai.f108967p.mo44240a(i) || C41669ai.f108968q.intValue() == i) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239715c = ((C88715p) obj).f239943o;
    }
}
