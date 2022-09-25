package com.google.android.libraries.home.p1958f.p1959a;

import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.assistant.p3861at.C50181no;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4820d.p4824c.p4825a.C63226a;
import com.google.protos.p4816ai.p4820d.p4824c.p4825a.C63227b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.a */
/* compiled from: PG */
public final class C23774a {
    /* renamed from: a */
    public static final void m44277a(C37252a aVar, C50181no noVar) {
        C69664n.m101061g(noVar, "provider");
        C62940bt btVar = C63227b.f170821e;
        C63226a aVar2 = (C63226a) C63227b.f170820d.createBuilder();
        String str = noVar.f130446a;
        aVar2.copyOnWrite();
        C63227b bVar = (C63227b) aVar2.instance;
        str.getClass();
        bVar.f170823a |= 1;
        bVar.f170824b = str;
        String str2 = noVar.f130451f;
        aVar2.copyOnWrite();
        C63227b bVar2 = (C63227b) aVar2.instance;
        str2.getClass();
        bVar2.f170823a |= 2;
        bVar2.f170825c = str2;
        ((C37253b) aVar).mo40792p(btVar, aVar2.build());
    }
}
