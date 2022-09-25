package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88804ao;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.l */
/* compiled from: PG */
public final class C110437l extends C88804ao {

    /* renamed from: b */
    private static final C58485gu f307870b = C58485gu.m89846n(37);

    public C110437l(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88803an mo82344a(int i, ViewGroup viewGroup) {
        C88803an anVar = (C88803an) LayoutInflater.from(this.f240429a).inflate(R.layout.opa_suggestion_view, viewGroup, false);
        anVar.mo82342b(i);
        return anVar;
    }

    /* renamed from: b */
    public final /* synthetic */ List mo82345b() {
        return f307870b;
    }
}
