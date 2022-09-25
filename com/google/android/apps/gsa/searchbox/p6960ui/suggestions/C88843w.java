package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.libraries.searchbox.shared.response.Response;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.w */
/* compiled from: PG */
public abstract class C88843w {

    /* renamed from: a */
    public final SparseArray f240539a = new SparseArray();

    /* renamed from: b */
    protected final Context f240540b;

    public C88843w(Context context) {
        this.f240540b = context;
    }

    /* renamed from: a */
    public abstract C88788v mo82339a();

    /* renamed from: b */
    public abstract boolean mo82340b(int i);

    /* renamed from: c */
    public final C88788v mo82628c(int i, List list, Response response, C88709j jVar) {
        C88788v vVar = (C88788v) this.f240539a.get(i);
        if (vVar == null) {
            vVar = mo82339a();
            this.f240539a.put(i, vVar);
        }
        vVar.mo82338b(list, response, jVar);
        return vVar;
    }
}
