package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.C8397m;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8400p;
import com.google.p386ak.C8405u;
import com.google.p386ak.p388b.C8343aq;
import com.google.p386ak.p393c.C8383a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.a.s */
/* compiled from: PG */
public final class C8319s extends C8266aa {

    /* renamed from: a */
    final C8393i f29128a;

    /* renamed from: b */
    private final C8405u f29129b;

    /* renamed from: c */
    private final C8397m f29130c;

    /* renamed from: d */
    private final C8383a f29131d;

    /* renamed from: e */
    private final C8267ab f29132e;

    /* renamed from: f */
    private final boolean f29133f;

    /* renamed from: g */
    private volatile C8266aa f29134g;

    public C8319s(C8405u uVar, C8397m mVar, C8393i iVar, C8383a aVar, C8267ab abVar, boolean z) {
        this.f29129b = uVar;
        this.f29130c = mVar;
        this.f29128a = iVar;
        this.f29131d = aVar;
        this.f29132e = abVar;
        this.f29133f = z;
    }

    /* renamed from: c */
    private final C8266aa m23076c() {
        C8266aa aaVar = this.f29134g;
        if (aaVar != null) {
            return aaVar;
        }
        C8266aa b = this.f29128a.mo17144b(this.f29132e, this.f29131d);
        this.f29134g = b;
        return b;
    }

    /* renamed from: a */
    public final Object mo17029a(C8385a aVar) {
        if (this.f29130c == null) {
            return m23076c().mo17029a(aVar);
        }
        C8398n a = C8343aq.m23114a(aVar);
        if (!this.f29133f || !(a instanceof C8400p)) {
            return this.f29130c.mo17159a(a, this.f29131d.f29214b);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo17030b(C8387c cVar, Object obj) {
        C8405u uVar = this.f29129b;
        if (uVar == null) {
            m23076c().mo17030b(cVar, obj);
        } else if (!this.f29133f || obj != null) {
            ((C8283al) C8302bd.f29062T).mo17030b(cVar, uVar.mo17176a());
        } else {
            cVar.mo17138h();
        }
    }
}
