package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5079a.p5080a.p5081a.C65479b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5079a.p5080a.p5081a.C65480c;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.ae */
/* compiled from: PG */
final class C119948ae extends Exception implements C34820a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119948ae(C32796ar arVar) {
        super("Unsupported ContextKey: ".concat(String.valueOf(arVar.f87975a == 1 ? (String) arVar.f87976b : BuildConfig.FLAVOR)));
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        return C34819a.m63580c(C65480c.f177999a, C65479b.INTERNAL_INVALID_CONTEXT_KEY_FETCH_REQUESTED);
    }
}
