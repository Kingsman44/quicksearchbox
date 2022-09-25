package com.google.android.libraries.assistant.auto.tng.p1272t.p1276b;

import com.google.android.libraries.assistant.auto.tng.p1272t.p1277c.C16458a;
import com.google.p343ac.p346b.p348b.p349a.p350a.p351a.C6638a;
import com.google.p343ac.p346b.p348b.p349a.p350a.p351a.C6640c;
import com.google.p343ac.p358e.p359a.p360a.C6665b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.t.b.e */
/* compiled from: PG */
public final /* synthetic */ class C16457e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f48367a;

    public /* synthetic */ C16457e(String str) {
        this.f48367a = str;
    }

    public final Object call() {
        String str = this.f48367a;
        C6638a aVar = (C6638a) C6640c.f19864e.createBuilder();
        C6665b a = C16458a.m33411a(str);
        aVar.copyOnWrite();
        C6640c cVar = (C6640c) aVar.instance;
        a.getClass();
        cVar.f19867b = a;
        cVar.f19866a |= 1;
        aVar.copyOnWrite();
        C6640c cVar2 = (C6640c) aVar.instance;
        str.getClass();
        cVar2.f19866a |= 2;
        cVar2.f19868c = str;
        return aVar.build();
    }
}
