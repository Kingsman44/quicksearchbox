package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import com.google.android.apps.gsa.search.core.p6500ac.C84402f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.b */
/* compiled from: PG */
public final class C99858b implements C84402f {

    /* renamed from: a */
    private static final C59071e f279384a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dn.a.b");

    /* renamed from: b */
    private final String f279385b;

    /* renamed from: c */
    private final C99852ai f279386c;

    public C99858b(String str, C99852ai aiVar) {
        this.f279385b = str;
        this.f279386c = aiVar;
    }

    /* renamed from: a */
    public final void mo77956a() {
        C58833ax a = this.f279386c.mo91642a(this.f279385b);
        if (a.mo56113h()) {
            C99850ag agVar = (C99850ag) a.mo56107c();
            if (agVar.mo91641q()) {
                agVar.mo91635k("{}");
            } else {
                agVar.f279341c.mo28212l("onCloseMediaPane", new C99864h(agVar));
            }
        } else {
            ((C59052c) ((C59052c) f279384a.mo56225c()).mo56372aa(32917)).mo56386p("No SilkPaneController found.");
        }
    }
}
