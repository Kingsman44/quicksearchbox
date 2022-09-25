package com.bumptech.glide.load.p299c.p304e;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p293a.C5674aq;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p299c.p302c.C5888f;
import com.bumptech.glide.p281b.C5521e;

/* renamed from: com.bumptech.glide.load.c.e.g */
/* compiled from: PG */
public final class C5902g extends C5888f implements C5674aq {
    public C5902g(C5900e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public final int mo12158a() {
        C5907l lVar = ((C5900e) this.f17504a).f17517a.f17516a;
        C5521e eVar = (C5521e) lVar.f17533a;
        return eVar.f16729a.limit() + eVar.f16731c.length + (eVar.f16732d.length * 4) + lVar.f17542j;
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return C5900e.class;
    }

    /* renamed from: d */
    public final void mo12176d() {
        ((C5900e) this.f17504a).mo12350a().prepareToDraw();
    }

    /* renamed from: e */
    public final void mo12162e() {
        C5640b bVar;
        ((C5900e) this.f17504a).stop();
        C5900e eVar = (C5900e) this.f17504a;
        eVar.f17518b = true;
        C5907l lVar = eVar.f17517a.f17516a;
        lVar.f17534b.clear();
        lVar.mo12369d();
        lVar.f17536d = false;
        C5904i iVar = lVar.f17537e;
        if (iVar != null) {
            lVar.f17535c.mo11890x(iVar);
            lVar.f17537e = null;
        }
        C5904i iVar2 = lVar.f17539g;
        if (iVar2 != null) {
            lVar.f17535c.mo11890x(iVar2);
            lVar.f17539g = null;
        }
        C5904i iVar3 = lVar.f17541i;
        if (iVar3 != null) {
            lVar.f17535c.mo11890x(iVar3);
            lVar.f17541i = null;
        }
        C5521e eVar2 = (C5521e) lVar.f17533a;
        eVar2.f16734f = null;
        byte[] bArr = eVar2.f16731c;
        if (bArr != null) {
            eVar2.f16738j.mo12345b(bArr);
        }
        int[] iArr = eVar2.f16732d;
        if (!(iArr == null || (bVar = eVar2.f16738j.f17515b) == null)) {
            bVar.mo12107c(iArr);
        }
        Bitmap bitmap = eVar2.f16735g;
        if (bitmap != null) {
            eVar2.f16738j.mo12344a(bitmap);
        }
        eVar2.f16735g = null;
        eVar2.f16729a = null;
        eVar2.f16736h = null;
        byte[] bArr2 = eVar2.f16730b;
        if (bArr2 != null) {
            eVar2.f16738j.mo12345b(bArr2);
        }
        lVar.f17538f = true;
    }
}
