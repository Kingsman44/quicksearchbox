package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8406v;
import com.google.p386ak.C8408x;
import com.google.p386ak.C8409y;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8386b;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.a.k */
/* compiled from: PG */
public final class C8311k extends C8266aa {

    /* renamed from: a */
    private static final C8267ab f29102a = m23057d(C8408x.LAZILY_PARSED_NUMBER);

    /* renamed from: b */
    private final C8409y f29103b;

    private C8311k(C8409y yVar) {
        this.f29103b = yVar;
    }

    /* renamed from: c */
    public static C8267ab m23056c(C8409y yVar) {
        return yVar == C8408x.LAZILY_PARSED_NUMBER ? f29102a : m23057d(yVar);
    }

    /* renamed from: d */
    private static C8267ab m23057d(C8409y yVar) {
        return new C8310j(new C8311k(yVar));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        int r = aVar.mo17127r();
        int i = r - 1;
        if (i == 5 || i == 6) {
            return this.f29103b.mo17178a(aVar);
        }
        if (i == 8) {
            aVar.mo17123n();
            return null;
        }
        throw new C8406v("Expecting number, got: " + C8386b.m23197a(r) + "; at path " + aVar.mo17113d(false));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        cVar.mo17140j((Number) obj);
    }
}
