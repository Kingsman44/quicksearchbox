package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.d */
/* compiled from: PG */
public final class C99860d {

    /* renamed from: a */
    private static final C59071e f279388a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dn.a.d");

    /* renamed from: b */
    private final String f279389b;

    /* renamed from: c */
    private final C99852ai f279390c;

    public C99860d(String str, C99852ai aiVar) {
        this.f279389b = str;
        this.f279390c = aiVar;
    }

    /* renamed from: a */
    public final void mo91655a(String str) {
        C58833ax a = this.f279390c.mo91642a(this.f279389b);
        if (a.mo56113h()) {
            ((C99850ag) a.mo56107c()).mo91635k(str);
            return;
        }
        C59104x c = f279388a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SilkCloseWithResultClbk");
        ((C59052c) ((C59052c) c).mo56372aa(32918)).mo56386p("No SilkPaneController found.");
    }
}
