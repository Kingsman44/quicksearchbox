package com.google.android.apps.search.googleapp.p10139b;

import android.view.View;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.b.d */
/* compiled from: PG */
public final class C133488d {
    /* renamed from: a */
    public static final C133489e m216676a(C47770dh dhVar, C133489e eVar, String str) {
        C69664n.m101061g(dhVar, "<this>");
        return new C133485a(dhVar, str, eVar);
    }

    /* renamed from: b */
    public static final void m216677b(View view, C133489e eVar) {
        C69664n.m101061g(view, "<this>");
        view.setOnLongClickListener(new C133486b(eVar));
        view.setOnContextClickListener(new C133487c(eVar));
    }
}
