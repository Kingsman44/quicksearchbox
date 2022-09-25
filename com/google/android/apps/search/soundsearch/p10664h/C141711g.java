package com.google.android.apps.search.soundsearch.p10664h;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import java.util.List;

/* renamed from: com.google.android.apps.search.soundsearch.h.g */
/* compiled from: PG */
public final /* synthetic */ class C141711g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141712h f384611a;

    /* renamed from: b */
    public final /* synthetic */ View f384612b;

    /* renamed from: c */
    public final /* synthetic */ C141715k f384613c;

    /* renamed from: d */
    public final /* synthetic */ List f384614d;

    public /* synthetic */ C141711g(C141712h hVar, View view, C141715k kVar, List list) {
        this.f384611a = hVar;
        this.f384612b = view;
        this.f384613c = kVar;
        this.f384614d = list;
    }

    public final void onClick(View view) {
        C141712h hVar = this.f384611a;
        View view2 = this.f384612b;
        C141715k kVar = this.f384613c;
        List list = this.f384614d;
        hVar.f384617c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view2.findViewById(R.id.soundsearch_show_more)));
        C141712h.m229939a(view2);
        kVar.f384632b.addAll(C58597ky.m90211b(C58557jl.m90126g(list, 3)));
        kVar.mObservable.mo2881c(2, list.size() - 2, (Object) null);
    }
}
