package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24282h;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.lens.p4701g.C62331d;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a */
/* compiled from: PG */
final class C27797a extends C27890g {

    /* renamed from: a */
    private C62331d f75843a;

    /* renamed from: b */
    private C24795f f75844b;

    /* renamed from: c */
    private C24282h f75845c;

    /* renamed from: d */
    private C63240m f75846d;

    public C27797a() {
    }

    public C27797a(C27891h hVar) {
        C27870b bVar = (C27870b) hVar;
        this.f75843a = bVar.f75954a;
        this.f75844b = bVar.f75955b;
        this.f75845c = bVar.f75956c;
        this.f75846d = bVar.f75957d;
    }

    /* renamed from: a */
    public final C27891h mo33309a() {
        C24795f fVar;
        C24282h hVar;
        C63240m mVar;
        C62331d dVar = this.f75843a;
        if (dVar != null && (fVar = this.f75844b) != null && (hVar = this.f75845c) != null && (mVar = this.f75846d) != null) {
            return new C27870b(dVar, fVar, hVar, mVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75843a == null) {
            sb.append(" cascadeType");
        }
        if (this.f75844b == null) {
            sb.append(" loadConfig");
        }
        if (this.f75845c == null) {
            sb.append(" runtimeParameters");
        }
        if (this.f75846d == null) {
            sb.append(" modelMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo33310b(C62331d dVar) {
        if (dVar != null) {
            this.f75843a = dVar;
            return;
        }
        throw new NullPointerException("Null cascadeType");
    }

    /* renamed from: c */
    public final void mo33311c(C24795f fVar) {
        if (fVar != null) {
            this.f75844b = fVar;
            return;
        }
        throw new NullPointerException("Null loadConfig");
    }

    /* renamed from: d */
    public final void mo33312d(C63240m mVar) {
        if (mVar != null) {
            this.f75846d = mVar;
            return;
        }
        throw new NullPointerException("Null modelMetadata");
    }

    /* renamed from: e */
    public final void mo33313e(C24282h hVar) {
        if (hVar != null) {
            this.f75845c = hVar;
            return;
        }
        throw new NullPointerException("Null runtimeParameters");
    }
}
