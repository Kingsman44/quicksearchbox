package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55065eo;
import com.google.p4152bb.p4153a.C55082fe;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C15542e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f46522a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f46523b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f46524c;

    public /* synthetic */ C15542e(String str, C60870cx cxVar, C60870cx cxVar2) {
        this.f46522a = str;
        this.f46523b = cxVar;
        this.f46524c = cxVar2;
    }

    public final Object call() {
        String str = this.f46522a;
        C60870cx cxVar = this.f46523b;
        C60870cx cxVar2 = this.f46524c;
        C59071e eVar = C15553p.f46541a;
        C55065eo eoVar = (C55065eo) C55082fe.f144912z.createBuilder();
        eoVar.copyOnWrite();
        C55082fe feVar = (C55082fe) eoVar.instance;
        str.getClass();
        feVar.f144914a |= 16;
        feVar.f144920g = str;
        String str2 = (String) C60856cj.m92909r(cxVar);
        eoVar.copyOnWrite();
        C55082fe feVar2 = (C55082fe) eoVar.instance;
        str2.getClass();
        feVar2.f144914a |= 1;
        feVar2.f144915b = str2;
        eoVar.mo54178b((Iterable) C60856cj.m92909r(cxVar2));
        return (C55082fe) eoVar.build();
    }
}
