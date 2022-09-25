package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13544t;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.d */
/* compiled from: PG */
public final /* synthetic */ class C13450d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C13544t f41284a;

    public /* synthetic */ C13450d(C13544t tVar) {
        this.f41284a = tVar;
    }

    public final void accept(Object obj) {
        C13544t tVar = this.f41284a;
        C13530f fVar = (C13530f) obj;
        tVar.copyOnWrite();
        C13546v vVar = (C13546v) tVar.instance;
        C13546v vVar2 = C13546v.f41508e;
        fVar.getClass();
        vVar.mo21162a();
        vVar.f41512c.add(fVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
