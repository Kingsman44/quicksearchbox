package com.google.p386ak.p388b;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.z */
/* compiled from: PG */
final class C8381z extends C8266aa {

    /* renamed from: a */
    final /* synthetic */ boolean f29207a;

    /* renamed from: b */
    final /* synthetic */ boolean f29208b;

    /* renamed from: c */
    final /* synthetic */ C8393i f29209c;

    /* renamed from: d */
    final /* synthetic */ C8383a f29210d;

    /* renamed from: e */
    final /* synthetic */ C8327aa f29211e;

    /* renamed from: f */
    private C8266aa f29212f;

    public C8381z(C8327aa aaVar, boolean z, boolean z2, C8393i iVar, C8383a aVar) {
        this.f29211e = aaVar;
        this.f29207a = z;
        this.f29208b = z2;
        this.f29209c = iVar;
        this.f29210d = aVar;
    }

    /* renamed from: c */
    private final C8266aa m23164c() {
        C8266aa aaVar = this.f29212f;
        if (aaVar != null) {
            return aaVar;
        }
        C8266aa b = this.f29209c.mo17144b(this.f29211e, this.f29210d);
        this.f29212f = b;
        return b;
    }

    /* renamed from: a */
    public final Object mo17029a(C8385a aVar) {
        if (!this.f29207a) {
            return m23164c().mo17029a(aVar);
        }
        aVar.mo17124o();
        return null;
    }

    /* renamed from: b */
    public final void mo17030b(C8387c cVar, Object obj) {
        if (this.f29208b) {
            cVar.mo17138h();
        } else {
            m23164c().mo17030b(cVar, obj);
        }
    }
}
