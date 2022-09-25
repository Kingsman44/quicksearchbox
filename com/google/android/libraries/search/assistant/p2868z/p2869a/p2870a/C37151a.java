package com.google.android.libraries.search.assistant.p2868z.p2869a.p2870a;

import com.google.assistant.p3861at.C50148mi;
import com.google.assistant.p3861at.C50149mj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.z.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C37151a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50148mi f96741a;

    public /* synthetic */ C37151a(C50148mi miVar) {
        this.f96741a = miVar;
    }

    public final void accept(Object obj) {
        C50148mi miVar = this.f96741a;
        String str = (String) obj;
        miVar.copyOnWrite();
        C50149mj mjVar = (C50149mj) miVar.instance;
        C50149mj mjVar2 = C50149mj.f130370k;
        str.getClass();
        mjVar.f130372a |= 1;
        mjVar.f130373b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
