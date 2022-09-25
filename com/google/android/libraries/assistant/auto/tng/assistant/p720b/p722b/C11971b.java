package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p722b;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11979e;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11980f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p5277z.p5281b.C67988i;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C11971b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C11979e f38439a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f38440b;

    /* renamed from: c */
    public final /* synthetic */ C12991i f38441c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f38442d;

    /* renamed from: e */
    public final /* synthetic */ C11980f f38443e;

    public /* synthetic */ C11971b(C11979e eVar, C60870cx cxVar, C12991i iVar, C60870cx cxVar2, C11980f fVar) {
        this.f38439a = eVar;
        this.f38440b = cxVar;
        this.f38441c = iVar;
        this.f38442d = cxVar2;
        this.f38443e = fVar;
    }

    public final Object call() {
        C11979e eVar = this.f38439a;
        C60870cx cxVar = this.f38440b;
        C12991i iVar = this.f38441c;
        C60870cx cxVar2 = this.f38442d;
        C11980f fVar = this.f38443e;
        String str = (String) C60856cj.m92909r(cxVar);
        eVar.copyOnWrite();
        C11980f fVar2 = (C11980f) eVar.instance;
        C11980f fVar3 = C11980f.f38476l;
        str.getClass();
        fVar2.f38478a |= 4;
        fVar2.f38481d = str;
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        String str2 = yVar.f40417c;
        eVar.copyOnWrite();
        C11980f fVar4 = (C11980f) eVar.instance;
        str2.getClass();
        fVar4.f38478a |= 32;
        fVar4.f38485h = str2;
        String str3 = (String) C60856cj.m92909r(cxVar2);
        eVar.copyOnWrite();
        C11980f fVar5 = (C11980f) eVar.instance;
        str3.getClass();
        fVar5.f38478a |= 8;
        fVar5.f38483f = str3;
        C13007y yVar2 = iVar.f40383b;
        if (yVar2 == null) {
            yVar2 = C13007y.f40413d;
        }
        String b = C39191a.m68623b(yVar2.f40416b);
        eVar.copyOnWrite();
        C11980f fVar6 = (C11980f) eVar.instance;
        b.getClass();
        fVar6.f38478a |= 64;
        fVar6.f38486i = b;
        boolean z = iVar.f40384c;
        eVar.copyOnWrite();
        C11980f fVar7 = (C11980f) eVar.instance;
        fVar7.f38478a |= 16;
        fVar7.f38484g = !z;
        int b2 = C67988i.m98230b(fVar.f38487j);
        if (b2 == 0) {
            b2 = 2;
        }
        eVar.copyOnWrite();
        C11980f fVar8 = (C11980f) eVar.instance;
        fVar8.f38487j = C67988i.m98229a(b2);
        fVar8.f38478a |= 128;
        C19088t tVar = fVar.f38488k;
        if (tVar == null) {
            tVar = C19088t.f53533p;
        }
        eVar.copyOnWrite();
        C11980f fVar9 = (C11980f) eVar.instance;
        tVar.getClass();
        fVar9.f38488k = tVar;
        fVar9.f38478a |= 256;
        return (C11980f) eVar.build();
    }
}
