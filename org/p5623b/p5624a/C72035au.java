package org.p5623b.p5624a;

import java.io.ByteArrayOutputStream;

/* renamed from: org.b.a.au */
/* compiled from: PG */
public final class C72035au extends C72096i {
    public C72035au(C72103p pVar, C72099l lVar, C72108u uVar, int i, C72108u uVar2) {
        super(pVar, lVar, uVar, i, uVar2);
    }

    /* renamed from: a */
    public final int mo63217a() {
        return mo63293o().length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C72103p pVar = this.f191918a;
        if (pVar != null) {
            byteArrayOutputStream.write(pVar.mo63294p("DER"));
        }
        C72099l lVar = this.f191919b;
        if (lVar != null) {
            byteArrayOutputStream.write(lVar.mo63294p("DER"));
        }
        C72108u uVar = this.f191920c;
        if (uVar != null) {
            byteArrayOutputStream.write(uVar.mo63294p("DER"));
        }
        byteArrayOutputStream.write(new C72059bl(true, this.f191921d, this.f191922e).mo63294p("DER"));
        sVar.mo63302f(z, 32, 8, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: f */
    public final C72108u mo63228f() {
        return this;
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }
}
