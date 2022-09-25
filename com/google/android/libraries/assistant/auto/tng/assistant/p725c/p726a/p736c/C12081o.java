package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p748a.C12144b;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.o */
/* compiled from: PG */
public final /* synthetic */ class C12081o implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C12081o f38667a = new C12081o();

    private /* synthetic */ C12081o() {
    }

    public final C60870cx apply(Object obj) {
        C37348am amVar = (C37348am) obj;
        C37344ai a = C37344ai.m66353a(amVar.f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        if (a.equals(C37344ai.RELEASED)) {
            ((C59052c) ((C59052c) C12084r.f38670a.mo56224b()).mo56372aa(43987)).mo56386p("Audio focus released.");
            return C60866ct.f164955a;
        }
        C37344ai a2 = C37344ai.m66353a(amVar.f99208b);
        if (a2 == null) {
            a2 = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        if (a2.equals(C37344ai.FAILED_RELEASING_DUE_TO_INACTIVE_SESSION)) {
            ((C59052c) ((C59052c) C12084r.f38670a.mo56224b()).mo56372aa(43986)).mo56386p("Audio focus already released or session inactive.");
            return C60866ct.f164955a;
        }
        C37344ai a3 = C37344ai.m66353a(amVar.f99208b);
        if (a3 == null) {
            a3 = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        throw new C12144b(a3);
    }
}
