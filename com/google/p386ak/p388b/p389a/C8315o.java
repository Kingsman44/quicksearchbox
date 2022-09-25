package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p388b.C8338al;
import com.google.p386ak.p388b.p391b.C8350a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.Map;

/* renamed from: com.google.ak.b.a.o */
/* compiled from: PG */
public final class C8315o extends C8266aa {

    /* renamed from: a */
    private final C8338al f29115a;

    /* renamed from: b */
    private final Map f29116b;

    public C8315o(C8338al alVar, Map map) {
        this.f29115a = alVar;
        this.f29116b = map;
    }

    /* renamed from: a */
    public final Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        Object a = this.f29115a.mo17084a();
        try {
            aVar.mo17120k();
            while (aVar.mo17125p()) {
                C8316p pVar = (C8316p) this.f29116b.get(aVar.mo17115f());
                if (pVar != null) {
                    if (pVar.f29119j) {
                        pVar.mo17039a(aVar, a);
                    }
                }
                aVar.mo17124o();
            }
            aVar.mo17122m();
            return a;
        } catch (IllegalStateException e) {
            throw new C8406v((Throwable) e);
        } catch (IllegalAccessException e2) {
            throw C8350a.m23122a(e2);
        }
    }

    /* renamed from: b */
    public final void mo17030b(C8387c cVar, Object obj) {
        if (obj == null) {
            cVar.mo17138h();
            return;
        }
        cVar.mo17133d();
        try {
            for (C8316p b : this.f29116b.values()) {
                b.mo17040b(cVar, obj);
            }
            cVar.mo17135f();
        } catch (IllegalAccessException e) {
            throw C8350a.m23122a(e);
        }
    }
}
