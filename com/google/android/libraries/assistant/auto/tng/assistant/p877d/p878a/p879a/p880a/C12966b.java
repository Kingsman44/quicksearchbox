package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12984b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C12966b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C12987e f40335a;

    public /* synthetic */ C12966b(C12987e eVar) {
        this.f40335a = eVar;
    }

    public final void accept(Object obj) {
        C12987e eVar = this.f40335a;
        C12984b bVar = (C12984b) obj;
        eVar.copyOnWrite();
        C12991i iVar = (C12991i) eVar.instance;
        C12991i iVar2 = C12991i.f40380k;
        bVar.getClass();
        iVar.f40390i = bVar;
        iVar.f40382a |= 64;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
