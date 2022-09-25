package com.google.android.apps.gsa.staticplugins.fedass.p7945d;

import com.google.android.apps.search.fedora.p10107j.p10108a.C132954a;
import com.google.android.apps.search.fedora.p10107j.p10108a.C132955b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.d.t */
/* compiled from: PG */
public final /* synthetic */ class C100841t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C100843v f281802a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f281803b;

    /* renamed from: c */
    public final /* synthetic */ int f281804c;

    /* renamed from: d */
    public final /* synthetic */ int f281805d;

    public /* synthetic */ C100841t(C100843v vVar, int i, int i2, byte[] bArr) {
        this.f281802a = vVar;
        this.f281804c = i;
        this.f281805d = i2;
        this.f281803b = bArr;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C100843v vVar = this.f281802a;
        int i = this.f281804c;
        int i2 = this.f281805d;
        byte[] bArr = this.f281803b;
        C132954a aVar = (C132954a) C132955b.f362639f.createBuilder();
        aVar.copyOnWrite();
        C132955b bVar = (C132955b) aVar.instance;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bVar.f362642b = i3;
            bVar.f362641a |= 1;
            aVar.copyOnWrite();
            C132955b bVar2 = (C132955b) aVar.instance;
            bVar2.f362645e = i - 1;
            bVar2.f362641a |= 8;
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
            C47633f g = C47633f.m84733g(vVar.f281808b.mo110943b((C132955b) aVar.build()));
            C60856cj.m92911t(g.f164926b, C47810es.m84974n(new C100842u(i2)), vVar.f281809c);
            return g.mo51515h(C100840s.f281801a, vVar.f281809c);
        }
        throw null;
    }
}
