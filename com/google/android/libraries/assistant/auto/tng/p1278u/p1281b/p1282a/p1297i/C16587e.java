package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1297i;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13262b;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66442v;
import com.google.speech.p5195a.p5196a.C66443w;
import com.google.speech.p5195a.p5196a.C66444x;
import com.google.speech.p5195a.p5196a.C66445y;
import com.google.speech.p5195a.p5196a.C66446z;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.i.e */
/* compiled from: PG */
public final class C16587e {

    /* renamed from: a */
    public static final C59071e f48635a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.u.b.a.i.e");

    /* renamed from: a */
    public static void m33635a(List list, String str, C58485gu guVar, C15481g gVar, C37252a aVar) {
        if (guVar.isEmpty()) {
            aVar.mo40781e(C62722b.NOT_FOUND);
            gVar.mo22352b(aVar);
            return;
        }
        C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
        cVar.copyOnWrite();
        C66446z zVar = (C66446z) cVar.instance;
        zVar.f180666b = 2;
        zVar.f180665a |= 1;
        cVar.copyOnWrite();
        C66446z zVar2 = (C66446z) cVar.instance;
        zVar2.f180665a |= 2;
        zVar2.f180667c = str;
        C66444x xVar = (C66444x) C66445y.f180660b.createBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C13262b bVar = (C13262b) guVar.get(i);
            C66442v vVar = (C66442v) C66443w.f180655d.createBuilder();
            String str2 = bVar.f40946b;
            vVar.copyOnWrite();
            C66443w wVar = (C66443w) vVar.instance;
            str2.getClass();
            wVar.f180657a |= 1;
            wVar.f180658b = str2;
            double d = bVar.f40947c;
            vVar.copyOnWrite();
            C66443w wVar2 = (C66443w) vVar.instance;
            wVar2.f180657a |= 2;
            wVar2.f180659c = (float) d;
            xVar.mo59630a(vVar);
        }
        cVar.copyOnWrite();
        C66446z zVar3 = (C66446z) cVar.instance;
        C66445y yVar = (C66445y) xVar.build();
        yVar.getClass();
        zVar3.f180670f = yVar;
        zVar3.f180665a |= 64;
        list.add((C66446z) cVar.build());
        aVar.mo40781e(C62722b.OK);
        gVar.mo22352b(aVar);
    }
}
