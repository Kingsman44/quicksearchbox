package com.google.android.libraries.gsa.monet.tools.children.p1912a;

import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.shared.p1915a.C23232b;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.a.d */
/* compiled from: PG */
final class C23184d implements C23054e {

    /* renamed from: a */
    final /* synthetic */ boolean f63571a;

    /* renamed from: b */
    final /* synthetic */ C23186f f63572b;

    public C23184d(C23186f fVar, boolean z) {
        this.f63572b = fVar;
        this.f63571a = z;
    }

    /* renamed from: b */
    public final void mo28489b(C23028x xVar) {
        C23232b bVar;
        C23186f fVar = this.f63572b;
        C23120p e = fVar.f63574a.mo28336e();
        ProtoParcelable protoParcelable = (ProtoParcelable) e.f63472a.getParcelable(fVar.f63576c);
        if (!(protoParcelable == null || (bVar = (C23232b) C23245b.m43557b(protoParcelable, C23232b.f63678c.getParserForType(), C62921ba.f169869a, true)) == null || (bVar.f63680a & 1) == 0)) {
            fVar.f63577d = bVar.f63681b;
        }
        fVar.mo28629j();
        if (this.f63571a) {
            this.f63572b.mo28633n(xVar);
        }
    }

    /* renamed from: c */
    public final void mo28490c() {
        this.f63572b.mo28629j();
    }

    /* renamed from: g */
    public final void mo28491g() {
        this.f63572b.mo28622c();
    }
}
