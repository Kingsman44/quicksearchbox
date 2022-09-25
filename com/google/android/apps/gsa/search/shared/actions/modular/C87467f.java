package com.google.android.apps.gsa.search.shared.actions.modular;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55136he;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.f */
/* compiled from: PG */
public class C87467f {

    /* renamed from: a */
    private static final C59071e f236234a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.modular.f");

    /* renamed from: a */
    public void mo81395a(String str, MessageLite messageLite, Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f236234a.mo56225c()).mo56382g(th)).mo56372aa(9541)).mo56389s("%s", String.format(str, new Object[]{messageLite}));
    }

    /* renamed from: b */
    public final void mo81398b(String str) {
        ((C59052c) ((C59052c) f236234a.mo56225c()).mo56372aa(9540)).mo56389s("%s", str);
    }

    /* renamed from: c */
    public final void mo81399c(int i, C55136he heVar) {
        mo81395a("Can't format ".concat(i != 5 ? "vocalized prompt" : "display prompt"), heVar, (Throwable) null);
    }

    /* renamed from: d */
    public final void mo81400d(int i, C55136he heVar, Exception exc) {
        String str;
        if (i == 1) {
            str = "intent package";
        } else if (i == 2) {
            str = "intent data";
        } else if (i == 3) {
            str = "intent extra";
        } else if (i == 4) {
            str = "intent component";
        } else if (i != 7) {
            str = "unknown(" + i + ")";
        } else {
            str = "intent clip data";
        }
        mo81395a("Can't format ".concat(str), heVar, exc);
    }

    /* renamed from: e */
    public final void mo81401e(int i) {
        mo81398b("Prompted argument id=" + i + " missing.");
    }

    /* renamed from: f */
    public final void mo81402f(int i) {
        mo81398b("Required argument id=" + i + " missing.");
    }

    /* renamed from: g */
    public final void mo81403g(int i) {
        mo81398b("Shown argument id=" + i + " missing.");
    }

    /* renamed from: h */
    public final void mo81404h(int i, String str) {
        mo81398b("The argument id=" + i + " is not " + str);
    }
}
