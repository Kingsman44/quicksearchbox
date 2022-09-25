package com.google.android.libraries.assistant.contexttrigger.p1454a;

import com.google.android.libraries.assistant.contexttrigger.C17784j;
import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48916r;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.i */
/* compiled from: PG */
public final class C17613i {

    /* renamed from: a */
    public static final C59071e f50727a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.a.i");

    /* renamed from: b */
    public final C17784j f50728b;

    public C17613i(C17784j jVar) {
        this.f50728b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo23413a(C48919u uVar, C48888ac acVar) {
        ((C59052c) ((C59052c) f50727a.mo56224b()).mo56372aa(46935)).mo56389s("Update awareness node with sub trigger id: %s", acVar.f126510b);
        C17784j jVar = this.f50728b;
        C48916r rVar = (C48916r) C48917s.f126578f.createBuilder();
        C48952az azVar = acVar.f126512d;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        rVar.copyOnWrite();
        C48917s sVar = (C48917s) rVar.instance;
        azVar.getClass();
        sVar.f126582c = azVar;
        sVar.f126580a |= 2;
        C48918t tVar = (C48918t) uVar.toBuilder();
        String str = acVar.f126510b;
        tVar.copyOnWrite();
        C48919u uVar2 = (C48919u) tVar.instance;
        str.getClass();
        uVar2.f126588a |= 4;
        uVar2.f126591d = str;
        rVar.copyOnWrite();
        C48917s sVar2 = (C48917s) rVar.instance;
        C48919u uVar3 = (C48919u) tVar.build();
        uVar3.getClass();
        sVar2.f126581b = uVar3;
        sVar2.f126580a |= 1;
        return jVar.mo23443b((C48917s) rVar.build());
    }
}
