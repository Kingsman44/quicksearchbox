package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import com.google.android.apps.gsa.search.core.p6500ac.C84402f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.b */
/* compiled from: PG */
public final class C100435b implements C84402f {

    /* renamed from: a */
    private static final C59071e f280778a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ee.a.a.b");

    /* renamed from: b */
    private final String f280779b;

    /* renamed from: c */
    private final C100434aa f280780c;

    public C100435b(String str, C100434aa aaVar) {
        this.f280779b = str;
        this.f280780c = aaVar;
    }

    /* renamed from: a */
    public final void mo77956a() {
        C58833ax j;
        C100434aa aaVar = this.f280780c;
        String str = this.f280779b;
        synchronized (aaVar.f280776a) {
            j = C58833ax.m90833j((C100458y) aaVar.f280777b.get(str));
        }
        if (j.mo56113h()) {
            C100458y yVar = (C100458y) j.mo56107c();
            yVar.f280813d.mo28212l("onSilkClose", new C100441h(yVar));
            return;
        }
        ((C59052c) ((C59052c) f280778a.mo56225c()).mo56372aa(33400)).mo56386p("No TrainingController found.");
    }
}
