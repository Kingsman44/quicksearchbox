package com.airbnb.lottie.p234a.p236b;

import com.airbnb.lottie.p238c.p240b.C4860c;
import com.airbnb.lottie.p245f.C4945b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4956a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.i */
/* compiled from: PG */
public final class C4810i extends C4812k {

    /* renamed from: e */
    private final C4860c f15306e;

    public C4810i(List list) {
        super(list);
        int i = 0;
        C4860c cVar = (C4860c) ((C4956a) list.get(0)).f15731b;
        i = cVar != null ? cVar.f15456b.length : i;
        this.f15306e = new C4860c(new float[i], new int[i]);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        C4860c cVar = this.f15306e;
        C4860c cVar2 = (C4860c) aVar.f15731b;
        C4860c cVar3 = (C4860c) aVar.f15732c;
        int length = cVar2.f15456b.length;
        int length2 = cVar3.f15456b.length;
        if (length == length2) {
            for (int i = 0; i < cVar2.f15456b.length; i++) {
                cVar.f15455a[i] = C4949f.m13709c(cVar2.f15455a[i], cVar3.f15455a[i], f);
                cVar.f15456b[i] = C4945b.m13692a(f, cVar2.f15456b[i], cVar3.f15456b[i]);
            }
            return this.f15306e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + length + " vs " + length2 + ")");
    }
}
