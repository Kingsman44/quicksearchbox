package com.google.android.apps.search.fedora.p10096d.p10097a;

import com.google.android.apps.search.fedora.p10107j.p10108a.C132954a;
import com.google.android.apps.search.fedora.p10107j.p10108a.C132955b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.fedora.d.a.g */
/* compiled from: PG */
public final /* synthetic */ class C132748g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C132754m f362188a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f362189b;

    /* renamed from: c */
    public final /* synthetic */ int f362190c;

    /* renamed from: d */
    public final /* synthetic */ int f362191d;

    public /* synthetic */ C132748g(C132754m mVar, int i, int i2, byte[] bArr) {
        this.f362188a = mVar;
        this.f362190c = i;
        this.f362191d = i2;
        this.f362189b = bArr;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C132754m mVar = this.f362188a;
        int i = this.f362190c;
        int i2 = this.f362191d;
        byte[] bArr = this.f362189b;
        C132954a aVar = (C132954a) C132955b.f362639f.createBuilder();
        aVar.copyOnWrite();
        C132955b bVar = (C132955b) aVar.instance;
        bVar.f362645e = i - 1;
        bVar.f362641a |= 8;
        aVar.copyOnWrite();
        C132955b bVar2 = (C132955b) aVar.instance;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bVar2.f362642b = i3;
            bVar2.f362641a |= 1;
            if (bArr != null) {
                C63088z A = C63088z.m96139A(bArr);
                aVar.copyOnWrite();
                C132955b bVar3 = (C132955b) aVar.instance;
                bVar3.f362641a |= 2;
                bVar3.f362643c = A;
            }
            aVar.copyOnWrite();
            C132955b bVar4 = (C132955b) aVar.instance;
            bVar4.f362641a |= 4;
            bVar4.f362644d = false;
            C47633f g = C47633f.m84733g(mVar.f362195b.mo110943b((C132955b) aVar.build()));
            C60856cj.m92911t(g.f164926b, C47810es.m84974n(new C132752k(i2)), mVar.f362196c);
            return g.mo51515h(C132744c.f362184a, mVar.f362196c);
        }
        throw null;
    }
}
